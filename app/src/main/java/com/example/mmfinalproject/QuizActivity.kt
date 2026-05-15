package com.example.mmfinalproject

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class QuizActivity : Activity() {

    private var questionIndex = 0
    private var score = 0
    private lateinit var district: String
    private lateinit var heroName: String
    private lateinit var questions: List<QuizQuestion>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.mmfinalproject.R.layout.activity_quiz)

        district = intent.getStringExtra("district") ?: "Belagavi"
        heroName = intent.getStringExtra("heroName") ?: district
        questions = getQuestions(district)

        showQuestion()
    }

    private fun showQuestion() {
        val question = questions[questionIndex]

        findViewById<TextView>(com.example.mmfinalproject.R.id.txtQuizTitle).text =
            "$district Quiz"

        findViewById<TextView>(com.example.mmfinalproject.R.id.txtQuestion).text =
            "Q${questionIndex + 1}. ${question.question}"

        val btn1 = findViewById<Button>(com.example.mmfinalproject.R.id.btnOption1)
        val btn2 = findViewById<Button>(com.example.mmfinalproject.R.id.btnOption2)
        val btn3 = findViewById<Button>(com.example.mmfinalproject.R.id.btnOption3)

        btn1.text = question.options[0]
        btn2.text = question.options[1]
        btn3.text = question.options[2]

        btn1.setOnClickListener { checkAnswer(0) }
        btn2.setOnClickListener { checkAnswer(1) }
        btn3.setOnClickListener { checkAnswer(2) }
    }

    private fun checkAnswer(selectedIndex: Int) {
        if (selectedIndex == questions[questionIndex].correctAnswerIndex) {
            score++
        }

        questionIndex++

        if (questionIndex < questions.size) {
            showQuestion()
        } else {
            finishQuiz()
        }
    }

    private fun finishQuiz() {
        val badge = when (score) {
            5 -> "Gold"
            3, 4 -> "Silver"
            1, 2 -> "Bronze"
            else -> "Try Again"
        }

        if (score > 0) {
            saveBadge(badge)
            Toast.makeText(
                this,
                "$badge Badge earned! Score: $score/5",
                Toast.LENGTH_LONG
            ).show()
        } else {
            Toast.makeText(
                this,
                "Try again! Score: 0/5",
                Toast.LENGTH_LONG
            ).show()
        }

        finish()
    }

    private fun saveBadge(badge: String) {
        val prefs = getSharedPreferences("badges", MODE_PRIVATE)

        prefs.edit()
            .putString("${district}_badge", badge)
            .putInt("${district}_score", score)
            .putString("${district}_hero", heroName)
            .apply()
    }

    private fun q(question: String, correct: String, wrong1: String, wrong2: String): QuizQuestion {
        val options = listOf(correct, wrong1, wrong2).shuffled()
        return QuizQuestion(
            question = question,
            options = options,
            correctAnswerIndex = options.indexOf(correct)
        )
    }

    private fun getQuestions(district: String): List<QuizQuestion> {
        return when (district) {
            "Belagavi" -> listOf(
                q("Who was Kittur Rani Chennamma?", "Queen of Kittur", "Scientist", "Singer"),
                q("In which year did she fight the British?", "1824", "1947", "1857"),
                q("Who was Sangolli Rayanna?", "Military chief of Kittur", "Poet", "Engineer"),
                q("Gangadhar Rao Deshpande was called what?", "Lion of Karnataka", "Tiger of Mysore", "Rajarshi"),
                q("Belagavi heroes are mainly linked with what?", "Freedom struggle", "Space science", "Cinema")
            )

            "Mysuru" -> listOf(
                q("Who created the fictional town Malgudi?", "R. K. Narayan", "Kuvempu", "Basavanna"),
                q("Devanuru Mahadeva is known for which literature?", "Dalit and progressive literature", "Only science", "Only sports"),
                q("Mysuru is connected with which cultural heritage?", "Literature and history", "Only mining", "Only fishing"),
                q("R. K. Narayan wrote mainly in which language?", "English", "French", "German"),
                q("Namma Kathey teaches what?", "Local heroes", "Only games", "Shopping")
            )

            "Dharwad" -> listOf(
                q("Who is called Karnataka Kulapurohita?", "Alur Venkata Rao", "Tipu Sultan", "C. N. R. Rao"),
                q("D. R. Bendre was known as what?", "Varakavi", "Rajarshi", "Field Marshal"),
                q("Which work is linked with D. R. Bendre?", "Naaku Tanti", "Malgudi Days", "Gadayuddha"),
                q("V. K. Gokak led which movement?", "Gokak language movement", "Quit India only", "Naval movement"),
                q("Dharwad is famous for which field?", "Kannada literature", "Rocket making", "Ship building")
            )

            "Bagalkote" -> listOf(
                q("Which community is linked with Halagali rebellion?", "Halagali Bedas", "Kodavas", "Hoysalas"),
                q("The Halagali rebellion happened in which year?", "1857", "1947", "1824"),
                q("S. R. Kanthi served as what?", "Chief Minister of Mysore State", "Army Chief", "Scientist"),
                q("Ranna was famous for which work?", "Gadayuddha", "Naaku Tanti", "Tughlaq"),
                q("Bagalkote heroes are linked with what?", "History and literature", "Only sports", "Only cinema")
            )

            "Ballari" -> listOf(
                q("Who was Bellary Siddamma?", "Woman freedom fighter", "Engineer", "Scientist"),
                q("Bellary Raghava was famous in which field?", "Theatre", "Cricket", "Medicine"),
                q("Ballari heroes contributed to what?", "Freedom and culture", "Only business", "Only sports"),
                q("Bellary Siddamma took part in which movement?", "National movement", "Space mission", "Green revolution only"),
                q("Bellary Raghava was also known as what?", "Actor", "Army chief", "King")
            )

            "Dakshina Kannada" -> listOf(
                q("Who was Rani Abbakka?", "Queen of Ullal", "Poet of Mysuru", "Scientist"),
                q("Rani Abbakka resisted which colonial power?", "Portuguese", "Dutch", "French"),
                q("Karnad Sadashiva Rao worked against what?", "Untouchability", "Space travel", "Mining"),
                q("B. V. Karanth was famous in which field?", "Theatre and cinema", "Cricket", "Astronomy"),
                q("B. M. Idinabba promoted which language?", "Kannada", "Greek", "Chinese")
            )

            "Davanagere" -> listOf(
                q("H. S. Venkateshamurthy was known as what?", "Kannada poet and playwright", "Warrior king", "Engineer"),
                q("H. S. Venkateshamurthy is associated with which type of poetry?", "Lyrical modern poetry", "Only Sanskrit epics", "Only English novels"),
                q("M. Chidananda Murthy studied which field deeply?", "Kannada language and inscriptions", "Space science", "Botany only"),
                q("M. Chidananda Murthy worked for protection of which heritage site?", "Hampi", "Red Fort", "Nalanda"),
                q("Davanagere heroes here are mainly linked with what?", "Kannada literature and history", "Only cinema", "Only sports")
            )

            "Gadag" -> listOf(
                q("Kumaravyasa is famous for which work?", "Karnata Bharata Kathamanjari", "Mysuru Mallige", "Mankuthimmana Kagga"),
                q("Kumaravyasa wrote in which language?", "Kannada", "French", "Latin"),
                q("Puttaraj Gawai was connected with which institution?", "Veereshwara Punyashrama", "Nalanda University", "IISc"),
                q("Puttaraj Gawai supported which students especially?", "Blind and disabled students", "Only athletes", "Only soldiers"),
                q("Gadag heroes here are linked with what?", "Literature, music, and service", "Only business", "Only politics")
            )

            "Hassan" -> listOf(
                q("Gorur Ramaswamy Iyengar was famous for writing about what?", "Village life", "Space travel", "Ocean science"),
                q("Gorur Ramaswamy Iyengar joined which national movement?", "Indian freedom movement", "Green Revolution only", "IT movement"),
                q("A. N. Murthy Rao was known as what?", "Kannada essayist and critic", "Army general", "Singer only"),
                q("Which famous work is linked with A. N. Murthy Rao?", "Devaru", "Naaku Tanti", "Gadayuddha"),
                q("Hassan heroes here are mainly linked with what?", "Kannada prose and public thought", "Only sports", "Only trade")
            )

            "Haveri" -> listOf(
                q("Mailara Mahadevappa joined which historic march?", "Dandi March", "Salt Lake March", "Mysuru Dasara"),
                q("Kanakadasa was part of which devotional tradition?", "Haridasa tradition", "Sufi court only", "Greek philosophy"),
                q("Kanakadasa was born as what?", "Thimmappa Nayaka", "Raghavanka", "Srinivasa"),
                q("Sarvajna is famous for which poetic form?", "Tripadi", "Novel", "Drama only"),
                q("Kaginele is associated with which saint?", "Kanakadasa", "Basavanna", "D. V. Gundappa")
            )

            "Kalaburagi" -> listOf(
                q("Hyderabad-Karnataka liberation fighters opposed whose rule?", "Nizam rule", "Portuguese rule", "French rule"),
                q("Which violent force was resisted during the liberation struggle?", "Razakars", "Sepoys", "Marathas"),
                q("Hyderabad State joined India in which year?", "1948", "1857", "1975"),
                q("Jayadevitai Ligade wrote in which languages?", "Kannada and Marathi", "French and German", "Tamil and Greek"),
                q("Jayadevitai Ligade was linked with which literature?", "Sharana literature", "Only science fiction", "Only sports writing")
            )

            "Kodagu" -> listOf(
                q("Pandyanda Belliappa is remembered as what?", "Freedom movement figure from Kodagu", "Vijayanagara king", "Film actor"),
                q("Haradasa Appacha Kavi wrote in which language tradition?", "Kodava", "Persian only", "Latin"),
                q("Haradasa Appacha Kavi was important in which field?", "Kodava literature", "Space science", "Cricket"),
                q("Kodagina Gouramma was known for what?", "Kannada short stories", "Military command", "Temple architecture"),
                q("Kodagina Gouramma was influenced by whom?", "Mahatma Gandhi", "Akbar", "Newton")
            )

            "Kolar" -> listOf(
                q("Masti Venkatesha Iyengar wrote under which pen name?", "Srinivasa", "Ambikatanayadatta", "Vaidehi"),
                q("Masti is especially remembered as master of what?", "Kannada short story", "Yakshagana dance", "Military history"),
                q("D. V. Gundappa is popularly known as what?", "DVG", "HSV", "Kuvempu"),
                q("Which famous work was written by D. V. Gundappa?", "Mankuthimmana Kagga", "Malgudi Days", "Harishchandra Kavya"),
                q("Kolar heroes here are linked mainly with what?", "Kannada literature and philosophy", "Only sports", "Only cinema")
            )

            "Koppal" -> listOf(
                q("Krishnadevaraya ruled which empire?", "Vijayanagara Empire", "Mughal Empire", "Maurya Empire"),
                q("Krishnadevaraya belonged to which dynasty?", "Tuluva dynasty", "Chola dynasty", "Gupta dynasty"),
                q("Which Telugu classic was written by Krishnadevaraya?", "Amuktamalyada", "Naaku Tanti", "Mankuthimmana Kagga"),
                q("Krishnadevaraya’s reign is remembered as what?", "Golden age of South Indian history", "Dark age", "Industrial age"),
                q("Krishnadevaraya’s capital was near which place?", "Hampi", "Delhi", "Kolkata")
            )

            "Raichur" -> listOf(
                q("Pandit Taranath was connected with which city?", "Raichur", "Mysuru", "Udupi"),
                q("Pandit Taranath worked mainly in which areas?", "Education and social reform", "Only sports", "Only cinema"),
                q("Shantarasa belonged to which region?", "Kalyana-Karnataka", "Konkan only", "Malabar only"),
                q("Shantarasa is remembered as what?", "Kannada writer", "Army chief", "Scientist"),
                q("Raichur heroes here are linked with what?", "Education, reform, and literature", "Only trade", "Only mining")
            )

            "Ramanagara" -> listOf(
                q("Kengal Hanumanthaiah built which famous building?", "Vidhana Soudha", "Gol Gumbaz", "Mysore Palace"),
                q("Kengal Hanumanthaiah served as Chief Minister of which state?", "Mysore State", "Kerala", "Punjab"),
                q("Siddalingaiah was famous as what?", "Dalit poet and activist", "Classical dancer", "King"),
                q("Which work is linked with Siddalingaiah?", "Ooru Keri", "Amuktamalyada", "Malgudi Days"),
                q("Ramanagara heroes here are linked with what?", "Public service and social justice", "Only astronomy", "Only trade")
            )

            "Shivamogga" -> listOf(
                q("Kadidal Manjappa served as what?", "Chief Minister of Mysore State", "President of India", "Army chief"),
                q("Shantaveri Gopala Gowda was known for which ideology?", "Socialism", "Imperialism", "Monarchy"),
                q("U. R. Ananthamurthy is famous for which novel?", "Samskara", "Mysuru Mallige", "Gadayuddha"),
                q("P. Lankesh founded which weekly?", "Lankesh Patrike", "Kesari", "Young India"),
                q("Shivamogga heroes here are linked with what?", "Politics, literature, and social thought", "Only cricket", "Only trade")
            )

            "Tumakuru" -> listOf(
                q("Shivakumara Swamiji was head of which matha?", "Siddaganga Matha", "Udupi Matha", "Sringeri Matha"),
                q("Shivakumara Swamiji was affectionately called what?", "Walking God", "Varakavi", "Rajarshi"),
                q("His service focused mainly on what?", "Food and education", "Only war", "Only trade"),
                q("Doddarange Gowda is known as what?", "Kannada poet and lyricist", "Freedom queen", "Scientist"),
                q("Doddarange Gowda contributed to which cinema field?", "Kannada film songs", "Silent films only", "Hollywood animation")
            )

            "Udupi" -> listOf(
                q("Kota Shivaram Karanth won which major award?", "Jnanpith Award", "Oscar", "Nobel Prize"),
                q("Kota Shivaram Karanth worked to reform which art form?", "Yakshagana", "Bharatanatyam only", "Kathakali only"),
                q("Gopalakrishna Adiga pioneered which movement?", "Navya movement", "Bhakti movement", "Quit India movement"),
                q("Vaidehi is the pen name of whom?", "Janaki Srinivasa Murthy", "Kodagina Gouramma", "Jayadevitai Ligade"),
                q("Vaidehi’s writing is strongly linked with which region?", "Kundapura coastal world", "Delhi court", "Desert region")
            )

            "Uttara Kannada" -> listOf(
                q("Dinakar Desai was known as what?", "Freedom fighter and poet", "King of Mysore", "Scientist"),
                q("Dinakar Desai fought for whose rights?", "Tenant farmers and common people", "Only merchants", "Only soldiers"),
                q("Gourish Kaikini was from which district?", "Uttara Kannada", "Kolar", "Mandya"),
                q("Gourish Kaikini was known as what?", "Writer, teacher, and critic", "Military chief", "Sports coach"),
                q("Uttara Kannada heroes here are linked with what?", "Literature and social service", "Only cinema", "Only mining")
            )

            "Vijayapura" -> listOf(
                q("Basavanna was born at which place?", "Basavana Bagewadi", "Kundapura", "Masti"),
                q("Basavanna is central to which tradition?", "Lingayat tradition", "Kodava tradition", "Sufi court only"),
                q("Basavanna expressed his ideas through what?", "Vachanas", "Tripadis only", "English novels"),
                q("Ibrahim Adil Shah II ruled which kingdom?", "Bijapur", "Mysore", "Kittur"),
                q("Ibrahim Adil Shah II wrote which work?", "Kitab-i-Nauras", "Mankuthimmana Kagga", "Samskara")
            )

            "Vijayanagara" -> listOf(
                q("Harihara was associated with which literature?", "Virashaiva literature", "Modern science fiction", "English journalism"),
                q("Harihara is known for using which poetic form?", "Ragale", "Novel", "Essay only"),
                q("Raghavanka is famous for which work?", "Harishchandra Kavya", "Malgudi Days", "Ooru Keri"),
                q("Raghavanka helped popularise which metre?", "Shatpadi", "Haiku", "Sonnet"),
                q("Vijayanagara poets here are linked with what?", "Medieval Kannada poetry", "Only politics", "Only medicine")
            )

            "Yadgir" -> listOf(
                q("Raja Venkatappa Nayaka ruled which principality?", "Shorapur or Surapur", "Kittur", "Ullal"),
                q("Raja Venkatappa Nayaka resisted which power?", "British East India Company", "Portuguese", "French"),
                q("His resistance happened during which period?", "1857 uprising period", "Quit India period", "Green Revolution"),
                q("Raja Venkatappa Nayaka was remembered as what?", "Brave young ruler", "Modern novelist", "Theatre director"),
                q("Shorapur is linked with which present district?", "Yadgir", "Udupi", "Kolar")
            )

            else -> listOf(
                q("What does Namma Kathey teach?", "Karnataka local heroes", "Only cooking", "Only shopping"),
                q("What language support is included?", "Kannada and English", "Only French", "Only German"),
                q("What feature reads hero details aloud?", "Voice Reader", "Camera", "Calculator"),
                q("How many questions are in the quiz?", "5", "1", "20"),
                q("What badge is given for full score?", "Gold", "Bronze", "Try Again")
            )
        }
    }
}

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)
