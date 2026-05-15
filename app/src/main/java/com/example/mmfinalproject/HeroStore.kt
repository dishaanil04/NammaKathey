package com.example.mmfinalproject

data class HeroInfo(
    val district: String,
    val districtKannada: String,
    val name: String,
    val nameKannada: String,
    val details: String,
    val detailsKannada: String
)

object HeroStore {

    fun getHeroes(district: String): List<HeroInfo> {
        return allHeroes.filter { it.district == district }.ifEmpty {
            listOf(
                HeroInfo(
                    district,
                    district,
                    "Hero Coming Soon",
                    "ವೀರರ ಮಾಹಿತಿ ಶೀಘ್ರದಲ್ಲೇ",
                    "More local hero details will be added soon.",
                    "ಈ ಜಿಲ್ಲೆಯ ಸ್ಥಳೀಯ ವೀರರ ಮಾಹಿತಿಯನ್ನು ಶೀಘ್ರದಲ್ಲೇ ಸೇರಿಸಲಾಗುತ್ತದೆ."
                )
            )
        }
    }

    private fun h(
        district: String,
        districtKannada: String,
        name: String,
        nameKannada: String,
        details: String,
        detailsKannada: String
    ) = HeroInfo(district, districtKannada, name, nameKannada, details, detailsKannada)

    private val allHeroes = listOf(
        h("Bagalkote", "ಬಾಗಲಕೋಟೆ", "Halagali Bedas", "ಹಲಗಲಿ ಬೇಡರು",
            "The Halagali Bedas were a community of warriors and hunters in Mudhol taluk, Karnataka, who revolted against the British in 1857–58. They rebelled against the Disarming Act, which forced them to surrender their traditional firearms, viewed as essential to their culture and livelihood. Led by fighters like Jadaga and Balanna, they resisted colonial authority before being suppressed.Key Aspects of the Halagali Bedas' Revolt:Cause of Revolt: In 1857, the British ordered the confiscation of all firearms. The Bedas, traditionally hunters, refused to give up their weapons.The Struggle: The uprising began in Halagali and spread to neighboring villages like Mantur, Bodani, and Alagundi.",
            "ಹಲಗಲಿ ಬೇಡರು ಕರ್ನಾಟಕದ ಮುಧೋಳ ತಾಲೂಕು ಪ್ರದೇಶದಲ್ಲಿ ವಾಸಿಸುತ್ತಿದ್ದ ಯೋಧರು ಮತ್ತು ಬೇಟೆಗಾರರ ಸಮುದಾಯವಾಗಿದ್ದರು. ಅವರು 1857–58ರ ಅವಧಿಯಲ್ಲಿ ಬ್ರಿಟಿಷರ ವಿರುದ್ಧ ಬಂಡಾಯ ಎದ್ದರು.\n" +
                    "\n" +
                    "ಈ ಬಂಡಾಯಕ್ಕೆ ಪ್ರಮುಖ ಕಾರಣ ಬ್ರಿಟಿಷರು ಜಾರಿಗೆ ತಂದ Disarming Act ಆಗಿತ್ತು. ಈ ಕಾನೂನಿನ ಮೂಲಕ ಎಲ್ಲ ಸ್ಥಳೀಯ ಜನರಿಂದ ಶಸ್ತ್ರಾಸ್ತ್ರಗಳನ್ನು ವಶಪಡಿಸಿಕೊಳ್ಳಲು ಆದೇಶಿಸಲಾಯಿತು. ಬೇಡರ ಸಮುದಾಯಕ್ಕೆ ಶಸ್ತ್ರಾಸ್ತ್ರಗಳು ಅವರ ಸಂಸ್ಕೃತಿ ಮತ್ತು ಜೀವನೋಪಾಯದ ಅವಿಭಾಜ್ಯ ಅಂಗವಾಗಿದ್ದರಿಂದ, ಅವರು ಅದನ್ನು ಒಪ್ಪಲಿಲ್ಲ.\n" +
                    "\n" +
                    "ಈ ಹೋರಾಟವನ್ನು ಜಡಗ ಮತ್ತು ಬಾಳಣ್ಣ ಎಂಬ ಯೋಧರು ಮುನ್ನಡೆಸಿದರು.\n" +
                    "\n" +
                    "**ಹಲಗಲಿ ಬೇಡರ ಬಂಡಾಯದ ಪ್ರಮುಖ ಅಂಶಗಳು:**\n" +
                    "\n" +
                    "* **ಬಂಡಾಯದ ಕಾರಣ:** 1857ರಲ್ಲಿ ಬ್ರಿಟಿಷರು ಎಲ್ಲಾ ಶಸ್ತ್ರಾಸ್ತ್ರಗಳನ್ನು ವಶಪಡಿಸಿಕೊಳ್ಳಲು ಆದೇಶಿಸಿದರು. ಬೇಟೆಗಾರರಾಗಿದ್ದ ಬೇಡರು ತಮ್ಮ ಶಸ್ತ್ರಾಸ್ತ್ರಗಳನ್ನು ಒಪ್ಪಿಸಲು ನಿರಾಕರಿಸಿದರು.\n" +
                    "* **ಹೋರಾಟದ ವ್ಯಾಪ್ತಿ:** ಬಂಡಾಯವು ಹಲಗಲಿ ಗ್ರಾಮದಲ್ಲಿ ಆರಂಭವಾಗಿ, ಮಂಟೂರು, ಬೋದಣಿ ಮತ್ತು ಅಳಗುಂಡಿ ಸೇರಿದಂತೆ ಹತ್ತಿರದ ಗ್ರಾಮಗಳಿಗೆ ವ್ಯಾಪಿಸಿತು.\n" +
                    "\n" +
                    "ಕೊನೆಗೆ ಬ್ರಿಟಿಷರು ಈ ಬಂಡಾಯವನ್ನು ದಮನಿಸಿದರು, ಆದರೆ ಇದು ಕರ್ನಾಟಕದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದ ಇತಿಹಾಸದಲ್ಲಿ ಮಹತ್ವದ ಘಟನೆಯಾಗಿ ಉಳಿದಿದೆ.\n"),
        h("Bagalkote", "ಬಾಗಲಕೋಟೆ", "S. R. Kanthi", "ಎಸ್. ಆರ್. ಕಂಠಿ",
            "Shivalingappa Rudrappa Kanthi (21 December 1908 - 25 October 1969) was the Chief Minister of Karnataka (then, Mysore State) for a brief period in 1962. He hailed from Banajiga community a sub-sect of Lingayatism tradition in Hungund, Bagalkot district (formerly Bijapur district) in the northern part of Karnataka. A member of the Indian National Congress (INC), he served as the Speaker of Karnataka Legislative Assembly from 1956 to 1962. Kanti was Chief Minister of the State for a brief period of 96 days in 1962.[3] Later, as Education Minister in the S. Nijalingappa Cabinet he was instrumental in the establishment of Bangalore University and Kittur Rani Chennamma Sainik Schools.",
            "ಶಿವಲಿಂಗಪ್ಪ ರುದ್ರಪ್ಪ ಕಾಂತಿ (21 ಡಿಸೆಂಬರ್ 1908 – 25 ಅಕ್ಟೋಬರ್ 1969) ಅವರು 1962ರಲ್ಲಿ (ಆ ಸಮಯದಲ್ಲಿ ಮೈಸೂರು ರಾಜ್ಯ) ಕರ್ನಾಟಕ ಮುಖ್ಯಮಂತ್ರಿಗಳು ಆಗಿ ಸ್ವಲ್ಪ ಅವಧಿಗೆ ಸೇವೆ ಸಲ್ಲಿಸಿದರು.\n" +
                    "\n" +
                    "ಅವರು ಉತ್ತರ ಕರ್ನಾಟಕದ ಹುನಗುಂದ (ಈಗದ ಬಾಗಲಕೋಟೆ ಜಿಲ್ಲೆ, ಹಳೆಯ ಬೀಜಾಪುರ ಜಿಲ್ಲೆ) ಮೂಲದವರಾಗಿದ್ದರು. ಅವರು ಬಣಜಿಗ ಸಮುದಾಯಕ್ಕೆ ಸೇರಿದವರು, ಇದು ಲಿಂಗಾಯತ ಧರ್ಮದ ಉಪಶಾಖೆಯಾಗಿದೆ.\n" +
                    "\n" +
                    "ಅವರು ಭಾರತೀಯ ರಾಷ್ಟ್ರೀಯ ಕಾಂಗ್ರೆಸ್ (INC) ಸದಸ್ಯರಾಗಿದ್ದು, 1956ರಿಂದ 1962ರವರೆಗೆ ಕರ್ನಾಟಕ ವಿಧಾನಸಭೆಯ ಸಭಾಧ್ಯಕ್ಷರಾಗಿ (Speaker) ಕಾರ್ಯನಿರ್ವಹಿಸಿದರು.\n" +
                    "\n" +
                    "1962ರಲ್ಲಿ ಅವರು 96 ದಿನಗಳ ಕಾಲ ಮುಖ್ಯಮಂತ್ರಿಗಳಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ನಂತರ ಎಸ್. ನಿಜಲಿಂಗಪ್ಪ ಅವರ ಸಚಿವ ಸಂಪುಟದಲ್ಲಿ ಶಿಕ್ಷಣ ಸಚಿವರಾಗಿ ಕೆಲಸ ಮಾಡಿ, ಬೆಂಗಳೂರು ವಿಶ್ವವಿದ್ಯಾಲಯ ಹಾಗೂ ಕಿಟ್ಟೂರು ರಾಣಿ ಚೆನ್ನಮ್ಮ ಸೈನಿಕ ಶಾಲೆಗಳ ಸ್ಥಾಪನೆಗೆ ಪ್ರಮುಖ ಪಾತ್ರ ವಹಿಸಿದರು.\n"),
        h("Bagalkote", "ಬಾಗಲಕೋಟೆ", "Ranna", "ರನ್ನ",
            "Ranna (c. 949–1020) was one of the earliest and most celebrated Kannada poets, regarded as one of the \"three gems\" (Ratnatraya) of classical Kannada literature along with Adikavi Pampa and Ponna (poet) He flourished in the Western Chalukya court of Tailapa II and his successor Satyashraya, in what is now Karnataka, India. Ranna is renowned for his sophisticated style, martial themes, and deep Jain influence. He is best known for his two major surviving works: \"Sahasa Bhima Vijaya\" (also known as \"Gadayuddha\") and \"Ajitha Purana\" (Ajitanatha purana) about the second tirthankar of Jainism.",
            "ರನ್ನ (ಸು. ಕ್ರಿ.ಶ. 949–1020) ಕನ್ನಡದ ಪ್ರಾರಂಭಿಕ ಹಾಗೂ ಅತಿ ಪ್ರಸಿದ್ಧ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ರತ್ನತ್ರಯ (ಮೂರು ರತ್ನಗಳು) ಎಂಬ ಹೆಸರಿನಿಂದ ಪ್ರಸಿದ್ಧರಾದ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿದ್ದು, ಆದಿಕವಿ ಪಂಪ ಮತ್ತು ಪೊನ್ನ ಅವರೊಂದಿಗೆ ಸೇರಿ ಗುರುತಿಸಲ್ಪಟ್ಟಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "ಅವರು ಪಶ್ಚಿಮ ಚಾಲುಕ್ಯರು ರಾಜ್ಯದ ರಾಜರಾದ ತೈಲಪ II ಮತ್ತು ಅವರ ಉತ್ತರಾಧಿಕಾರಿ ಸತ್ಯಾಶ್ರಯ ಅವರ ಅರಮನೆಯಲ್ಲಿ ಬೆಳಗಿದರು. ಇದು ಇಂದಿನ ಕರ್ನಾಟಕ ಪ್ರದೇಶದಲ್ಲಿ ನಡೆದಿದೆ.\n" +
                    "\n" +
                    "ರನ್ನ ಅವರ ಸಾಹಿತ್ಯ ಶೈಲಿ ಅತ್ಯಂತ ಸೊಗಸಾದದ್ದು, ಯುದ್ಧ ಮತ್ತು ವೀರತೆಯ ವಿಷಯಗಳನ್ನು ಒಳಗೊಂಡದ್ದು ಮತ್ತು ಜೈನ ಧರ್ಮದ ಆಳವಾದ ಪ್ರಭಾವ ಹೊಂದಿದೆ.\n" +
                    "\n" +
                    "ಅವರು ತಮ್ಮ ಎರಡು ಪ್ರಮುಖ ಕೃತಿಗಳಿಗಾಗಿ ವಿಶೇಷವಾಗಿ ಪ್ರಸಿದ್ಧರು:\n" +
                    "\n" +
                    "* \"ಸಾಹಸ ಭೀಮ ವಿಜಯ\" (ಅಥವಾ \"ಗದಾಯುದ್ಧ\")\n" +
                    "* \"ಅಜಿತ ಪುರಾಣ\" — ಇದು ಅಜಿತನಾಥ (ಜೈನ ಧರ್ಮದ ಎರಡನೇ ತೀರ್ಥಂಕರ) ಕುರಿತಾಗಿದೆ.\n"),

        h("Ballari", "ಬಳ್ಳಾರಿ", "Bellary Siddamma", "ಬಳ್ಳಾರಿ ಸಿದ್ದಮ್ಮ",
            "Women played a leading role in the freedom struggle and even in the period before it. India is built on the foundation of a traditional society. Being a male-dominated society, women were often belittled as weak, helpless, and unintelligent. However, many brave women like Rani Abbakka Devi of Ullal, Kittur Rani Chennamma, Onake Obavva, Belawadi Mallamma, and Rani Chennammaji of Keladi and Ikkeri proved otherwise and became renowned for their courage.\n" +
                    "\n" +
                    "Alongside them, many more women contributed indirectly to the struggle, though they may not have come into the limelight. Thousands participated in the freedom movement—some were recognized, while many remained unnoticed. There were also individuals who played key roles in both the freedom struggle and the unification of Karnataka, yet after independence, they stepped away from public attention without expecting any rewards.\n" +
                    "\n" +
                    "One such prominent woman is Ballari Siddamma.\n",
            "ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಹಾಗೂ ಅದಕ್ಕೂ ಪೂರ್ವದಲ್ಲಿ ಮಹಿಳೆಯರು ಹೋರಾಟದ ಮುಂಚೂಣಿಯಲ್ಲಿದ್ದರು. ಭಾರತವು ಸಂಪ್ರದಾಯಸ್ಥ ಸಮಾಜದ ಬುನಾದಿಯ ಮೇಲೆ ನಿಂತಿದೆ. ಪುರುಷ ಪ್ರಧಾನ ಸಮಾಜವಾದುದರಿಂದ ಮಹಿಳೆಯನ್ನು ಅಬಲೆ, ಅಶಕ್ತಳು, ಬುದ್ದಿಗೇಡಿ ಎಂದೆಲ್ಲ ಹೀಗಳೆಯುವುದನ್ನು ನೋಡಿದ್ದೇವೆ. ಅದರೆ ಉಲ್ಲಾಳದ ರಾಣಿ ಅಬ್ಬಕ್ಕದೇವಿ,ಕಿತ್ತೂರುರಾಣಿ ಚನ್ನಮ್ಮ,ಒನಕೆ ಓಬವ್ವ, ಬೆಳವಾಡಿ ಮಲ್ಲಮ್ಮ, ಕೆಳದಿ ಮತ್ತು ಇಕ್ಕೇರಿ ಸಂಸ್ಥಾನದ ರಾಣಿ ಚನ್ನಮ್ಮಾಜಿ ಹೀಗೆ ಹಲವಾರು ವೀರ ವನಿತೆಯರು ಹೆಸರುವಾಸಿಯಾಗಿದ್ದಾರೆ. ಇದರ ಹತ್ತರಷ್ಟು ಮಹಿಳೆಯರು ಪರೋಕ್ಷವಾಗಿ ಪರೋಕ್ಷ ಹೋರಾಟ ಮಾಡಿದ್ದಾರೆ. ಆದರೆ ಅವರು ಬೆಳಕಿಗೆ ಬಾರದಿರಬಹುದು. ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಸಾವಿರಾರು ಮಂದಿ ಹೋರಾಡಿದ್ದಾರೆ. ಕೆಲವರು ಬೆಳಕಿಗೆ ಬಂದರೆ ಮತ್ತೆ ಕೆಲವರು ಬೆಳಕಿಗೆ ಬರಲಿಲ್ಲ. ಕೆಲವರು ಕರ್ನಾಟಕ ಏಕೀಕರಣದಲ್ಲಿ ಹಾಗೂ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಮುಂಚೂಣಿಯಲ್ಲಿದ್ದು ಸ್ವಾತಂತ್ರ್ಯಾನಂತರ ಫಲಾಪೇಕ್ಷೆಯಿಲ್ಲದೆ ತೆರೆಯ ಮರೆಗೆ ಸರಿದದ್ದೂ ಊಂಟು. ಅಂತಹವರಲ್ಲಿ ಪ್ರಮುಖ ಮಹಿಳೆ ಎಂದರೆ 'ಬಳ್ಳಾರಿ ಸಿದ್ದಮ್ಮ'ನವರು."),
        h("Ballari", "ಬಳ್ಳಾರಿ", "Bellary Raghava", "ಬಳ್ಳಾರಿ ರಾಘವ",
            "Bellary Raghava (born Tadipatri Raghavacharyulu; 2 August 1880 – 16 April 1946) was an Indian playwright and actor, known for his works predominantly in Telugu theatre and cinema. His uncle Dharmavaram Ramakrishnamacharyulu was a pioneering dramatist in Telugu, and initiated him on the stage. Raghava was also associated with another dramatist from Ballari, Kolachalam Srinivasa Rao. His students include female artists like Sarojini Kopparapu, Padmavati Kommuri, Annapurna Kakinada, and male artists like Vasudevarao K.S., Apparao Basavaraju and Banda Kanakalingeswara Rao.",
            "ಬಳ್ಳಾರಿ ರಾಘವ (ಜನನ: ತಾಡಿಪತ್ರಿ ರಾಘವಾಚಾರ್ಯಲು; 2 ಆಗಸ್ಟ್ 1880 – 16 ಏಪ್ರಿಲ್ 1946) ಅವರು ಭಾರತದ ಪ್ರಸಿದ್ಧ ನಾಟಕಕಾರ ಮತ್ತು ನಟರಾಗಿದ್ದು, ಮುಖ್ಯವಾಗಿ ತೆಲುಗು ರಂಗಭೂಮಿ ಮತ್ತು ಸಿನೆಮಾದಲ್ಲಿ ತಮ್ಮ ಕೃತಿಗಳಿಗಾಗಿ ಖ್ಯಾತರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರ ಮಾವ ಧರ್ಮವರಂ ರಾಮಕೃಷ್ಣಮಾಚಾರ್ಯులు ಅವರು ತೆಲುಗು ನಾಟಕ ಕ್ಷೇತ್ರದ ಪಯೋನೀರರಾಗಿದ್ದು, ರಾಘವರಿಗೆ ರಂಗಭೂಮಿಯ ಪ್ರವೇಶವನ್ನು ಮಾಡಿಸಿದರು.\n" +
                    "\n" +
                    "ರಾಘವ ಅವರು ಬಳ್ಳಾರಿಯ ಇನ್ನೊಬ್ಬ ಪ್ರಮುಖ ನಾಟಕಕಾರ ಕೊಳಾಚಲಂ ಶ್ರೀನಿವಾಸ ರಾವ್ ಅವರೊಂದಿಗೆ ಸಹ ಸಂಬಂಧ ಹೊಂದಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರ ಶಿಷ್ಯರಲ್ಲಿ ಮಹಿಳಾ ಕಲಾವಿದರಾದ ಸರೋಜಿನಿ ಕೊಪ್ಪರಪು, ಪದ್ಮಾವತಿ ಕೊಮ್ಮೂರಿ, ಅನ್ನಪೂರ್ಣ ಕಾಕಿನಾಡ ಮತ್ತು ಪುರುಷ ಕಲಾವಿದರಾದ ವಾಸುದೇವರಾವ್ ಕೆ.ಎಸ್., ಅಪ್ಪಾರಾವ್ ಬಸವರಾಜು, ಬಂಡಾ ಕನಕಲಿಂಗೇಶ್ವರ ರಾವ್ ಸೇರಿದ್ದಾರೆ.\n"),

        h("Belagavi", "ಬೆಳಗಾವಿ", "Kittur Rani Chennamma", "ಕಿತ್ತೂರು ರಾಣಿ ಚೆನ್ನಮ್ಮ",
            "Chennamma of Kittur (14 November 1778 – 21 February 1829) was the Queen of the princely state of Kittur in present-day Karnataka. She led a rebellious armed resistance against the British East India Company, in order to retain control over her dominion. She defeated the British army in the first war, but died as a prisoner after a second war. As one of the first and few female rulers to lead kittur forces against British colonisation, she continues to be remembered as a folk heroine in Karnataka.\n" +
                    "\n" +
                    "\n" +
                    "Royal standard of Kittur Chennamma, at Kittur Fort\n" +
                    "Early life\n" +
                    "Kittur Chennamma was born on 14 November 1778, in Kakati, a small village in the present Belagavi District of Karnataka, India. kakati was a small deshgat (a small princely state). Chennamma's father was Dhulappa Desai and her mother's name was Padmavati. She was born into a Jain family, and her ancestors were follower of Jainism. Later, her family decendents converted to Lingayatism much later, she received training in horse riding, sword fighting and archery from a young age. She married Raja Mallasarja of the Desai family at the age of 15, after looking up to him since the age of 9, and she also adopted a Lingayat boy named Shivalingappa as her heir.",
            "ಕಕಿಟ್ಟೂರು ಚೆನ್ನಮ್ಮ (14 ನವೆಂಬರ್ 1778 – 21 ಫೆಬ್ರವರಿ 1829) ಅವರು ಇಂದಿನ ಕರ್ನಾಟಕದಲ್ಲಿರುವ ಕಿಟ್ಟೂರು ಸಂಸ್ಥಾನದ ರಾಣಿಯಾಗಿದ್ದರು. ತಮ್ಮ ರಾಜ್ಯದ ಸ್ವಾತಂತ್ರ್ಯವನ್ನು ಕಾಪಾಡಿಕೊಳ್ಳಲು ಅವರು ಬ್ರಿಟಿಷ್ ಈಸ್ಟ್ ಇಂಡಿಯಾ ಕಂಪನಿ ವಿರುದ್ಧ ಶಸ್ತ್ರಸಜ್ಜಿತ ಹೋರಾಟ ನಡೆಸಿದರು.\n" +
                    "\n" +
                    "ಮೊದಲ ಯುದ್ಧದಲ್ಲಿ ಅವರು ಬ್ರಿಟಿಷರನ್ನು ಸೋಲಿಸಿದರು, ಆದರೆ ಎರಡನೇ ಯುದ್ಧದ ನಂತರ ಬಂಧಿಯಾಗಿದ್ದು, ಕಾರಾಗೃಹದಲ್ಲೇ ನಿಧನರಾದರು. ಬ್ರಿಟಿಷರ ಕಾಲೋನಿಯಲ್ ಆಡಳಿತದ ವಿರುದ್ಧ ಕಿಟ್ಟೂರಿನ ಸೇನೆಗೆ ನಾಯಕತ್ವ ನೀಡಿದ ಮೊದಲ ಮಹಿಳಾ ಆಡಳಿತಗಾರರಲ್ಲಿ ಒಬ್ಬರಾಗಿದ್ದು, ಅವರು ಇಂದು ಕೂಡ ಕರ್ನಾಟಕದಲ್ಲಿ ಜನಪ್ರಿಯ ಜನಪದ ವೀರನಾರಿಯಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "### ಪ್ರಾರಂಭಿಕ ಜೀವನ\n" +
                    "\n" +
                    "ಚೆನ್ನಮ್ಮ ಅವರು 14 ನವೆಂಬರ್ 1778ರಂದು ಕಾಕತಿ ಎಂಬ ಸಣ್ಣ ಹಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿದರು. ಇದು ಆಗ ಒಂದು ಸಣ್ಣ ಸಂಸ್ಥಾನ (ದೇಶಗಟ್) ಆಗಿತ್ತು. ಅವರ ತಂದೆ ಧೂಲಪ್ಪ ದೇಸಾಯಿ ಮತ್ತು ತಾಯಿ ಪದ್ಮಾವತಿ.\n" +
                    "\n" +
                    "ಅವರು ಜೈನ ಕುಟುಂಬದಲ್ಲಿ ಜನಿಸಿದ್ದು, ಅವರ ಪೂರ್ವಜರು ಜೈನ ಧರ್ಮವನ್ನು ಅನುಸರಿಸುತ್ತಿದ್ದರು. ನಂತರ ಅವರ ಕುಟುಂಬದ ಸಂತತಿ ಲಿಂಗಾಯತ ಧರ್ಮಕ್ಕೆ ಮಾರ್ಪಟ್ಟಿತು.\n" +
                    "\n" +
                    "ಚಿಕ್ಕ ವಯಸ್ಸಿನಿಂದಲೇ ಅವರು ಕುದುರೆ ಸವಾರಿ, ಕತ್ತಿ ಯುದ್ಧ ಮತ್ತು ಬಾಣಸಿಡಿತ ತರಬೇತಿಗಳನ್ನು ಪಡೆದಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರು 15ನೇ ವಯಸ್ಸಿನಲ್ಲಿ ಮಲ್ಲಸರ್ಜ ದೇಸಾಯಿ ಅವರೊಂದಿಗೆ ವಿವಾಹವಾದರು. ಬಳಿಕ ಅವರು ಶಿವಲಿಂಗಪ್ಪ ಎಂಬ ಲಿಂಗಾಯತ ಬಾಲಕನನ್ನು ದತ್ತ ಪುತ್ರನಾಗಿ ಸ್ವೀಕರಿಸಿ, ಅವನನ್ನು ತಮ್ಮ ಉತ್ತರಾಧಿಕಾರಿಯಾಗಿ ಘೋಷಿಸಿದರು.\n"),
        h("Belagavi", "ಬೆಳಗಾವಿ", "Sangolli Rayanna", "ಸಂಗೊಳ್ಳಿ ರಾಯಣ್ಣ",
            "Sangolli Rayanna (15 August 1798 – 26 January 1831) was an Indian military leader. Born in Sangolli, Belagavi district. His father was Bharamappa Rogannavar. His mother was Kenchava. He served as a senior commander in the military of Kittur ruled by Kittur Chennamma, the kingdom - like many others - called by the British as a princely state, during the early 19th century. After Chennamma led a failed rebellion against the British East India Company (EIC) in response to the EIC's infamous Doctrine of Lapse in 1824, Rayanna continued to resist Company rule in India. After leading another uprising against EIC authority, he was ultimately captured by the British and executed by hanging in 1831. As he played a very important role in Indian Freedom, his memorial statue was built in the village of Sangolli, Belagavi. Rayanna's life was the subject of the Kannada-language films Kranthiveera Sangolli Rayanna (1967) and Krantiveera Sangolli Rayanna (2012).",
            "ಸಂಗೊಳ್ಳಿ ರಾಯಣ್ಣ (15 ಆಗಸ್ಟ್ 1798 – 26 ಜನವರಿ 1831) ಅವರು ಭಾರತದ ಧೀರ ಸೈನಿಕ ನಾಯಕರು ಹಾಗೂ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರರಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಸಂಗೊಳ್ಳಿ ಗ್ರಾಮದಲ್ಲಿ ಜನಿಸಿದರು. ಅವರ ತಂದೆ ಭರಮಪ್ಪ ರೋಗಣ್ಣವರ್ ಮತ್ತು ತಾಯಿ ಕೆಂಚವ್ವ.\n" +
                    "\n" +
                    "ರಾಯಣ್ಣ ಅವರು ಕಿಟ್ಟೂರು ಚೆನ್ನಮ್ಮ ಅವರ ಆಡಳಿತದಲ್ಲಿದ್ದ ಕಿಟ್ಟೂರು ಸಂಸ್ಥಾನದ ಸೇನೆಯಲ್ಲಿ ಹಿರಿಯ ಸೇನಾನಿಯಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. 19ನೇ ಶತಮಾನದ ಆರಂಭದಲ್ಲಿ ಬ್ರಿಟಿಷರು ಇದನ್ನು ಒಂದು ಸಂಸ್ಥಾನ ಎಂದು ಕರೆಯುತ್ತಿದ್ದರು.\n" +
                    "\n" +
                    "1824ರಲ್ಲಿ ಬ್ರಿಟಿಷ್ ಈಸ್ಟ್ ಇಂಡಿಯಾ ಕಂಪನಿ ಜಾರಿಗೆ ತಂದ Doctrine of Lapse ವಿರುದ್ಧ ಚೆನ್ನಮ್ಮ ಅವರು ಹೋರಾಟ ನಡೆಸಿದ ನಂತರವೂ, ರಾಯಣ್ಣ ಅವರು ಬ್ರಿಟಿಷರ ಆಡಳಿತದ ವಿರುದ್ಧ ಹೋರಾಟವನ್ನು ಮುಂದುವರೆಸಿದರು.\n" +
                    "\n" +
                    "ನಂತರ ಅವರು ಮತ್ತೊಂದು ಬಂಡಾಯವನ್ನು ಮುನ್ನಡೆಸಿದರು, ಆದರೆ ಕೊನೆಗೆ ಬ್ರಿಟಿಷರಿಂದ ಬಂಧಿತರಾಗಿ 1831ರಲ್ಲಿ ನೇಣಿಗೆ ಒಳಗಾದರು.\n" +
                    "\n" +
                    "ಭಾರತದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಅವರ ಮಹತ್ವದ ಪಾತ್ರದ ಸ್ಮರಣಾರ್ಥವಾಗಿ, ಅವರ ಪ್ರತಿಮೆಯನ್ನು ಸಂಗೊಳ್ಳಿ ಗ್ರಾಮದಲ್ಲಿ ನಿರ್ಮಿಸಲಾಗಿದೆ.\n" +
                    "\n" +
                    "ಅವರ ಜೀವನ ಆಧಾರಿತವಾಗಿ ಕನ್ನಡದಲ್ಲಿ ಎರಡು ಚಿತ್ರಗಳು ನಿರ್ಮಾಣಗೊಂಡಿವೆ:\n" +
                    "\n" +
                    "* ಕ್ರಾಂತಿವೀರ ಸಂಗೊಳ್ಳಿ ರಾಯಣ್ಣ\n" ),
        h("Belagavi", "ಬೆಳಗಾವಿ", "Gangadhar Rao Deshpande", "ಗಂಗಾಧರ ರಾವ್ ದೇಶಪಾಂಡೆ",
            "Gangadhar Rao Balakrishna Deshpande (31 March 1871 – 30 July 1960), popularly known by the titles “Lion of Karnataka” and “Khadi Bhagiratha,” was a prominent leader in India’s freedom struggle against British colonial rule. He hailed from the Belagavi region.\n" +
                    "\n" +
                    "He worked closely with Bal Gangadhar Tilak (Lokmanya Tilak) and later with Mahatma Gandhi. Deshpande regarded Lokmanya Tilak as his mentor.\n" +
                    "\n" +
                    "He also served as the president of the Karnataka units of the All India Spinners' Association and the All India Village Industries Association. Deshpande played a significant role in the appointment of B. G. Kher as the Premier of Bombay.\n" +
                    "\n" +
                    "### Early Life\n" +
                    "\n" +
                    "Deshpande was born on 31 March 1871 in Hudli village into a Kannada-speaking Deshastha Rigvedi Brahmin family. His father, Balakrishna Deshpande, was a vatandar (landholder).\n" +
                    "\n" +
                    "### Political Work\n" +
                    "\n" +
                    "During the Swadeshi Movement of 1905–1906, Deshpande’s activities mainly focused on the boycott of British goods, promotion of indigenous (Swadeshi) products, encouragement of national education, and opposition to the Partition of Bengal.\n" +
                    "\n" +
                    "Along with freedom fighter Govindrao Yalagi, he planned the public celebration of Ganesh Utsav in 1905 with the aim of uniting people. The first public Ganesh idol was installed at Yalagi’s house.\n" +
                    "\n" +
                    "Responding to Deshpande’s invitation, Lokmanya Tilak, who popularized Ganesh Utsav, visited Belagavi in 1906.\n",
            "ಗಂಗಾಧರರಾವ್ ಬಾಲಕೃಷ್ಣ ದೇಶಪಾಂಡೆ (31 ಮಾರ್ಚ್ 1871 – 30 ಜುಲೈ 1960), “ಕರ್ನಾಟಕದ ಸಿಂಹ” ಮತ್ತು “ಖಾದಿ ಭಾಗೀರಥ” ಎಂಬ ಬಿರುದಗಳಿಂದ ಪ್ರಸಿದ್ಧರಾಗಿದ್ದವರು, ಬ್ರಿಟಿಷರ ಕಾಲೋನಿಯಲ್ ಆಳ್ವಿಕೆಗೆ ವಿರುದ್ಧ ಭಾರತದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಪ್ರಮುಖ ನಾಯಕರಾಗಿದ್ದರು. ಅವರು ಬೆಳಗಾವಿ ಪ್ರದೇಶದವರು.\n" +
                    "\n" +
                    "ಅವರು ಲೋಕಮಾನ್ಯ ತಿಲಕ್ ಮತ್ತು ನಂತರ ಮಹಾತ್ಮ ಗಾಂಧಿ ಅವರ ಆಪ್ತ ಸಹಾಯಕರಾಗಿ ಕಾರ್ಯನಿರ್ವಹಿಸಿದರು. ದೇಶಪಾಂಡೆ ಅವರು ಲೋಕಮಾನ್ಯ ತಿಲಕ್ ಅವರನ್ನು ತಮ್ಮ ಗುರುವಾಗಿ ಪರಿಗಣಿಸುತ್ತಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರು ಆಲ್ ಇಂಡಿಯಾ ಸ್ಪಿನ್ನರ್ಸ್ ಅಸೋಸಿಯೇಷನ್ ಮತ್ತು ಆಲ್ ಇಂಡಿಯಾ ವಿಲೇಜ್ ಇಂಡಸ್ಟ್ರೀಸ್ ಅಸೋಸಿಯೇಷನ್ಗಳ ಕರ್ನಾಟಕ ಘಟಕದ ಅಧ್ಯಕ್ಷರಾಗಿಯೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಬಿ. ಜಿ. ಖೇರ್ ಅವರನ್ನು ಬಾಂಬೆ ಪ್ರೀಮಿಯರ್ ಆಗಿ ನೇಮಕ ಮಾಡಲು ದೇಶಪಾಂಡೆ ಅವರು ಮಹತ್ವದ ಪಾತ್ರ ವಹಿಸಿದ್ದರು.\n" +
                    "\n" +
                    "### ಪ್ರಾರಂಭಿಕ ಜೀವನ\n" +
                    "\n" +
                    "ದೇಶಪಾಂಡೆ ಅವರು 31 ಮಾರ್ಚ್ 1871ರಂದು ಹುಡ್ಲಿ ಗ್ರಾಮದಲ್ಲಿ ಕನ್ನಡ ಭಾಷಿಕ ದೇಶಸ್ಥ ಋಗ್ವೇದಿ ಬ್ರಾಹ್ಮಣ ಕುಟುಂಬದಲ್ಲಿ ಜನಿಸಿದರು. ಅವರ ತಂದೆ ಬಾಲಕೃಷ್ಣ ದೇಶಪಾಂಡೆ ವತನ್ದಾರರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "### ರಾಜಕೀಯ ಕಾರ್ಯ\n" +
                    "\n" +
                    "1905–1906ರ ಸ್ವದೇಶಿ ಚಳವಳಿ ಸಮಯದಲ್ಲಿ ದೇಶಪಾಂಡೆ ಅವರ ಕಾರ್ಯಗಳು ಮುಖ್ಯವಾಗಿ ಬ್ರಿಟಿಷ್ ವಸ್ತುಗಳ ಬಹಿಷ್ಕಾರ, ಸ್ವದೇಶಿ ವಸ್ತುಗಳ ಉತ್ತೇಜನ, ರಾಷ್ಟ್ರೀಯ ಶಿಕ್ಷಣದ ಪ್ರಚಾರ ಮತ್ತು ಬಂಗಾಳ ವಿಭಜನೆಗೆ ವಿರೋಧ ಇತ್ಯಾದಿಗಳ ಮೇಲೆ ಕೇಂದ್ರೀಕೃತವಾಗಿದ್ದವು.\n" +
                    "\n" +
                    "ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರರಾದ ಗೋವಿಂದರಾವ್ ಯಾಳಗಿ ಅವರೊಂದಿಗೆ ಸೇರಿ, 1905ರಲ್ಲಿ ಗಣೇಶೋತ್ಸವವನ್ನು ಸಾರ್ವಜನಿಕವಾಗಿ ಆಚರಿಸುವ ಯೋಜನೆಯನ್ನು ರೂಪಿಸಿದರು, ಜನರನ್ನು ಏಕೀಕರಿಸುವ ಉದ್ದೇಶದಿಂದ. ಮೊದಲ ‘ಸಾರ್ವಜನಿಕ’ ಗಣೇಶ ಮೂರ್ತಿಯನ್ನು ಯಾಳಗಿಯವರ ಮನೆಯಲ್ಲಿ ಸ್ಥಾಪಿಸಲಾಯಿತು.\n" +
                    "\n" +
                    "ದೇಶಪಾಂಡೆ ಅವರ ಆಹ್ವಾನಕ್ಕೆ ಸ್ಪಂದಿಸಿ, ಗಣೇಶೋತ್ಸವವನ್ನು ಜನಪ್ರಿಯಗೊಳಿಸಿದ ಲೋಕಮಾನ್ಯ ತಿಲಕ್ ಅವರು 1906ರಲ್ಲಿ ಬೆಳಗಾವಿಗೆ ಭೇಟಿ ನೀಡಿದರು.\n"),

        h("Bengaluru Urban", "ಬೆಂಗಳೂರು ನಗರ", "H. S. Doreswamy", "ಎಚ್. ಎಸ್. ದೊರೆಸ್ವಾಮಿ",
            "H. S. Doreswamy (Harohalli Srinivasaiah Doreswamy) (10 April 1918 – 26 May 2021) was a renowned Indian journalist and social activist. He actively participated in India’s freedom struggle and became a centenarian in April 2018.\n" +
                    "\n" +
                    "During British rule and even afterward, he ran a publishing house called Sahitya Mandira and the newspaper *Pauravani*. Historian Ramachandra Guha described Doreswamy as the “conscience of Karnataka.”\n" +
                    "\n" +
                    "### Early Life and Education\n" +
                    "\n" +
                    "Doreswamy was born in Harohalli village (then part of the Kingdom of Mysore). He lost his father at the age of five and was raised under the care of his grandfather, Shamanna.\n" +
                    "\n" +
                    "He had an elder brother named Sitaram, who later became the Mayor of Bengaluru after independence.\n" +
                    "\n" +
                    "His grandfather served as a *shanubhoga* (village accountant) and was also a nominated member of the Representative Assembly. Doreswamy completed his primary education in his village, then moved to Bengaluru for higher studies.\n" +
                    "\n" +
                    "He pursued his higher secondary education at Government Intermediate College and later earned a Bachelor of Science (B.Sc) degree from Central College Bangalore.\n",
            "ಹರೋಹಳ್ಳಿ ಶ್ರೀನಿವಾಸಯ್ಯ ದೋರೇಸ್ವಾಮಿ (10 ಏಪ್ರಿಲ್ 1918 – 26 ಮೇ 2021) ಅವರು ಭಾರತದ ಖ್ಯಾತ ಪತ್ರಕರ್ತರು ಮತ್ತು ಸಾಮಾಜಿಕ ಕಾರ್ಯಕರ್ತರಾಗಿದ್ದರು. ಅವರು ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಭಾಗವಹಿಸಿದ್ದು, 2018ರ ಏಪ್ರಿಲ್\u200Cನಲ್ಲಿ ಶತಾಯುಷಿಯಾಗಿದರು.\n" +
                    "\n" +
                    "ಅವರು ಬ್ರಿಟಿಷರ ಕಾಲದಲ್ಲಿ ಮತ್ತು ನಂತರವೂ ಸಾಹಿತ್ಯ ಮಂದಿರ ಎಂಬ ಪ್ರಕಾಶನ ಸಂಸ್ಥೆ ಹಾಗೂ ಪೌರವಾಣಿ ಪತ್ರಿಕೆಯನ್ನು ನಡೆಸುತ್ತಿದ್ದರು. ಇತಿಹಾಸಕಾರ ರಾಮಚಂದ್ರ ಗುಹಾ ಅವರು ದೋರೇಸ್ವಾಮಿಯನ್ನು “ಕರ್ನಾಟಕದ ಅಂತಃಕರಣ” ಎಂದು ವರ್ಣಿಸಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "### ಪ್ರಾರಂಭಿಕ ಜೀವನ ಮತ್ತು ಶಿಕ್ಷಣ\n" +
                    "\n" +
                    "ದೋರೇಸ್ವಾಮಿ ಅವರು ಹರೋಹಳ್ಳಿ ಗ್ರಾಮದಲ್ಲಿ (ಅಂದು ಮೈಸೂರು ಸಂಸ್ಥಾನ) ಜನಿಸಿದರು. ಅವರು ಐದು ವರ್ಷ ವಯಸ್ಸಿನಲ್ಲೇ ತಂದೆಯನ್ನು ಕಳೆದುಕೊಂಡು, ತಮ್ಮ ತಾತ ಶಾಮಣ್ಣ ಅವರ ಆಶ್ರಯದಲ್ಲಿ ಬೆಳೆದರು.\n" +
                    "\n" +
                    "ಅವರಿಗೆ ಸೀತಾರಾಮ ಎಂಬ ಅಣ್ಣನಿದ್ದು, ಅವರು ಸ್ವಾತಂತ್ರ್ಯ ನಂತರ ಬೆಂಗಳೂರು ನಗರದ ಮೇಯರ್ ಆಗಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರ ತಾತ ಶಾನುಭೋಗ (ಗ್ರಾಮದ ಲೆಕ್ಕಾಧಿಕಾರಿ) ಆಗಿದ್ದು, ಪ್ರತಿನಿಧಿ ಸಭೆಯ ನಾಮನಿರ್ದೇಶಿತ ಸದಸ್ಯರಾಗಿದ್ದರು. ದೋರೇಸ್ವಾಮಿ ಅವರು ತಮ್ಮ ಪ್ರಾಥಮಿಕ ಶಿಕ್ಷಣವನ್ನು ತಮ್ಮ ಗ್ರಾಮದಲ್ಲೇ ಪೂರ್ಣಗೊಳಿಸಿ, ನಂತರ ಬೆಂಗಳೂರಿಗೆ ಹೋಗಿ ಉನ್ನತ ಶಿಕ್ಷಣ ಪಡೆದರು.\n" +
                    "\n" +
                    "ಅವರು ಗವರ್ಮೆಂಟ್ ಇಂಟರ್ ಮೀಡಿಯೇಟ್ ಕಾಲೇಜುನಲ್ಲಿ ಹೈಯರ್ ಸೆಕೆಂಡರಿ ಶಿಕ್ಷಣ ಪಡೆದು, ಬಳಿಕ ಸೆಂಟ್ರಲ್ ಕಾಲೇಜು ಬೆಂಗಳೂರುನಲ್ಲಿ ವಿಜ್ಞಾನದಲ್ಲಿ (B.Sc) ಪದವಿ ಪಡೆದರು.\n"),
        h("Bengaluru Urban", "ಬೆಂಗಳೂರು ನಗರ", "T. P. Kailasam", "ಟಿ. ಪಿ. ಕೈಲಾಸಂ",
            "T. P. Kailasam (Tyagaraja Parameshiva Kailasam) (29 July 1884 – 1946) was a prominent playwright and writer in Kannada literature. It is often said that literary criticism in Kannada began to take shape through his works.\n" +
                    "\n" +
                    "Due to his significant contribution to comic plays, he earned the title “Father of Farce” (*Prahasana Prapitamaha*). He later became widely known as “the one and only Kailasam of Kannada.”\n" +
                    "\n" +
                    "### Life\n" +
                    "\n" +
                    "Kailasam was born in Mysore (then part of the Kingdom of Mysore) into a Tamil Iyer Brahmin family. He belonged to the Mangudi Brahacharanam subsect.\n" +
                    "\n" +
                    "His father, T. Parameshiva Iyer, served as a revenue officer in the Mysore government and later became the Chief Justice of the Mysore High Court. His uncle, T. Sadasiva Iyer, was the Chief Justice of the Travancore High Court.\n" +
                    "\n" +
                    "The renowned scientist C. V. Raman was a relative of Kailasam’s father. A major road in Mysore is named after his maternal grandfather, Narayana Shastri.\n" +
                    "\n" +
                    "Kailasam received a strong education. With the support of Krishnaraja Wadiyar IV, he studied geology at the Royal College of Science.\n" +
                    "\n" +
                    "Among his friends and classmates were K. V. Iyer and V. Sitaramayya. He stayed in England for an extended period, even repeating some courses to prolong his stay. He remained there for about seven years, completed his fellowship, and actively participated in theatrical activities as much as possible.\n",
            "T. P. Kailasam (Tyagaraja Parameshiva Kailasam) (29 July 1884 – 1946) was a prominent playwright and writer in Kannada literature. It is often said that literary criticism in Kannada began to take shape through his works.\n" +
                    "\n" +
                    "Due to his significant contribution to comic plays, he earned the title “Father of Farce” (*Prahasana Prapitamaha*). He later became widely known as “the one and only Kailasam of Kannada.”\n" +
                    "\n" +
                    "### Life\n" +
                    "\n" +
                    "Kailasam was born in Mysore (then part of the Kingdom of Mysore) into a Tamil Iyer Brahmin family. He belonged to the Mangudi Brahacharanam subsect.\n" +
                    "\n" +
                    "His father, T. Parameshiva Iyer, served as a revenue officer in the Mysore government and later became the Chief Justice of the Mysore High Court. His uncle, T. Sadasiva Iyer, was the Chief Justice of the Travancore High Court.\n" +
                    "\n" +
                    "The renowned scientist C. V. Raman was a relative of Kailasam’s father. A major road in Mysore is named after his maternal grandfather, Narayana Shastri.\n" +
                    "\n" +
                    "Kailasam received a strong education. With the support of Krishnaraja Wadiyar IV, he studied geology at the Royal College of Science.\n" +
                    "\n" +
                    "Among his friends and classmates were K. V. Iyer and V. Sitaramayya. He stayed in England for an extended period, even repeating some courses to prolong his stay. He remained there for about seven years, completed his fellowship, and actively participated in theatrical activities as much as possible.\n"),
        h("Bengaluru Urban", "ಬೆಂಗಳೂರು ನಗರ", "C. N. R. Rao", "ಸಿ. ಎನ್. ಆರ್. ರಾವ್",
            "C. N. R. Rao (Chintamani Nagesa Ramachandra Rao; born 30 June 1934) is a renowned Indian chemist. He is best known for his significant contributions to the fields of solid-state chemistry and structural chemistry.\n" +
                    "\n" +
                    "He has received honorary doctorates from more than 86 universities worldwide and has authored around 1,800 research papers and 58 books. He is often described as a scientist who has received almost every major award in his field except the Nobel Prize.\n" +
                    "\n" +
                    "### Education and Career\n" +
                    "\n" +
                    "Rao completed his BSc from the University of Mysore at the age of 17. He then earned his MSc from Banaras Hindu University at 19, and obtained his PhD from Purdue University at the age of 24.\n" +
                    "\n" +
                    "In 1959, he joined the Indian Institute of Science as its youngest lecturer. He later moved to Indian Institute of Technology Kanpur and then returned to IISc, where he served as Director from 1984 to 1994.\n" +
                    "\n" +
                    "He also served as the Chairman of the Scientific Advisory Council to the Prime Minister of India during 1985–1989 and again from 2005–2014. He founded the Jawaharlal Nehru Centre for Advanced Scientific Research and the International Centre for Materials Science.\n" +
                    "\n" +
                    "### Awards and Honours\n" +
                    "\n" +
                    "Rao has received numerous prestigious awards, including the Marlow Medal, Shanti Swarup Bhatnagar Prize, Hughes Medal, India Science Award, Dan David Prize, Royal Medal, Von Hippel Award, and the ENI Award.\n" +
                    "\n" +
                    "He has been honored by the Government of India with the Padma Shri and Padma Vibhushan. On 16 November 2013, he was selected for the Bharat Ratna, the highest civilian honor in India.\n" +
                    "\n" +
                    "He is the third scientist to receive this award after C. V. Raman and A. P. J. Abdul Kalam.\n" +
                    "\n" +
                    "### Early Life\n" +
                    "\n" +
                    "Rao was born in Bengaluru into a Kannada Deshastha Brahmin family. His father, Hanumantha Nagesa Rao, was a school inspector, and his mother was Nagamma Nagesa Rao.\n" +
                    "\n" +
                    "From an early age, he showed academic excellence—learning Hindu literature from his mother and English from his father. He completed his schooling at Acharya Pathashala and later studied science at Central College Bangalore.\n" +
                    "\n" +
                    "He graduated with first-class distinction in 1951. Although he received a scholarship to pursue a PhD at Indian Institute of Technology Kharagpur, he chose Purdue University instead.\n" +
                    "\n" +
                    "In 1958, he completed his PhD in just 2 years and 9 months.\n",
            "ಸಿ.ಎನ್.ಆರ್. ರಾವ್ (ಚಿಂತಾಮಣಿ ನಾಗೇಶ ರಾಮಚಂದ್ರ ರಾವ್; ಜನನ: 30 ಜೂನ್ 1934) ಅವರು ಭಾರತದ ಪ್ರಸಿದ್ಧ ರಸಾಯನ ಶಾಸ್ತ್ರಜ್ಞರು. ಅವರು ಮುಖ್ಯವಾಗಿ ಘನ ಸ್ಥಿತಿ ರಸಾಯನಶಾಸ್ತ್ರ ಮತ್ತು ರಚನಾ ರಸಾಯನಶಾಸ್ತ್ರ ಕ್ಷೇತ್ರಗಳಲ್ಲಿ ಮಹತ್ವದ ಸಂಶೋಧನೆಗಳನ್ನು ಮಾಡಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "ಅವರು ವಿಶ್ವದ 86ಕ್ಕೂ ಹೆಚ್ಚು ವಿಶ್ವವಿದ್ಯಾಲಯಗಳಿಂದ ಗೌರವ ಡಾಕ್ಟರೇಟ್ ಪಡೆದಿದ್ದು, ಸುಮಾರು 1,800 ಸಂಶೋಧನಾ ಲೇಖನಗಳು ಮತ್ತು 58 ಪುಸ್ತಕಗಳನ್ನು ರಚಿಸಿದ್ದಾರೆ. ತಮ್ಮ ಕ್ಷೇತ್ರದಲ್ಲಿ ನೋಬೆಲ್ ಬಹುಮಾನ ಹೊರತುಪಡಿಸಿ ಬಹುತೇಕ ಎಲ್ಲಾ ಪ್ರಶಸ್ತಿಗಳನ್ನು ಪಡೆದ ವಿಜ್ಞಾನಿಯಾಗಿ ಅವರನ್ನು ವರ್ಣಿಸಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಶಿಕ್ಷಣ ಮತ್ತು ವೃತ್ತಿ\n" +
                    "\n" +
                    "ರಾವ್ ಅವರು ಮೈಸೂರು ವಿಶ್ವವಿದ್ಯಾಲಯದಿಂದ 17ನೇ ವಯಸ್ಸಿನಲ್ಲಿ BSc ಪದವಿ ಪಡೆದರು. ನಂತರ ಬನಾರಸ್ ಹಿಂದೂ ವಿಶ್ವವಿದ್ಯಾಲಯದಿಂದ 19ನೇ ವಯಸ್ಸಿನಲ್ಲಿ MSc ಪೂರ್ಣಗೊಳಿಸಿದರು. ಅವರು ಪರ್ಡ್ಯೂ ವಿಶ್ವವಿದ್ಯಾಲಯದಿಂದ 24ನೇ ವಯಸ್ಸಿನಲ್ಲಿ ಪಿಎಚ್\u200Cಡಿ ಪಡೆದರು.\n" +
                    "\n" +
                    "1959ರಲ್ಲಿ ಅವರು ಭಾರತೀಯ ವಿಜ್ಞಾನ ಸಂಸ್ಥೆಯಲ್ಲಿ ಅತಿ ಕಿರಿಯ ಉಪನ್ಯಾಸಕರಾಗಿ ಸೇರಿದರು. ನಂತರ ಭಾರತೀಯ ತಾಂತ್ರಿಕ ಸಂಸ್ಥೆ ಕಾನ್ಪುರಗೆ ಬದಲಾಗಿದ್ದು, ಮತ್ತೆ IIScಗೆ ಹಿಂದಿರುಗಿ 1984ರಿಂದ 1994ರವರೆಗೆ ನಿರ್ದೇಶಕರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು.\n" +
                    "\n" +
                    "ಅವರು ಭಾರತದ ಪ್ರಧಾನಮಂತ್ರಿಗೆ ವೈಜ್ಞಾನಿಕ ಸಲಹಾ ಮಂಡಳಿಯ ಅಧ್ಯಕ್ಷರಾಗಿ (1985–1989 ಮತ್ತು 2005–2014) ಕಾರ್ಯನಿರ್ವಹಿಸಿದರು. ಅವರು ಜವಾಹರಲಾಲ್ ನೆಹರು ಉನ್ನತ ವೈಜ್ಞಾನಿಕ ಸಂಶೋಧನಾ ಕೇಂದ್ರ ಮತ್ತು ಅಂತರರಾಷ್ಟ್ರೀಯ ವಸ್ತು ವಿಜ್ಞಾನ ಕೇಂದ್ರಗಳನ್ನು ಸ್ಥಾಪಿಸಿದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಗೌರವಗಳು\n" +
                    "\n" +
                    "ರಾವ್ ಅವರಿಗೆ ಅನೇಕ ಪ್ರತಿಷ್ಠಿತ ಪ್ರಶಸ್ತಿಗಳು ಲಭಿಸಿವೆ, ಉದಾಹರಣೆಗೆ ಮಾರ್ಲೋ ಪದಕ, ಶಾಂತಿ ಸ್ವರೂಪ್ ಭಟ್ನಾಗರ್ ಪ್ರಶಸ್ತಿ, ಹ್ಯೂಸ್ ಪದಕ, ಇಂಡಿಯಾ ಸೈನ್ಸ್ ಅವಾರ್ಡ್, ಡಾನ್ ಡೇವಿಡ್ ಪ್ರಶಸ್ತಿ, ರಾಯಲ್ ಪದಕ, ವಾನ್ ಹಿಪೆಲ್ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಎನಿ ಪ್ರಶಸ್ತಿ.\n" +
                    "\n" +
                    "ಅವರಿಗೆ ಭಾರತ ಸರ್ಕಾರದಿಂದ ಪದ್ಮಶ್ರೀ ಮತ್ತು ಪದ್ಮ ವಿಭೂಷಣ ಪ್ರಶಸ್ತಿಗಳು ದೊರೆತಿವೆ. 16 ನವೆಂಬರ್ 2013ರಂದು ಅವರನ್ನು ಭಾರತದ ಅತ್ಯುನ್ನತ ನಾಗರಿಕ ಪ್ರಶಸ್ತಿಯಾದ ಭಾರತ ರತ್ನಗೆ ಆಯ್ಕೆ ಮಾಡಲಾಯಿತು.\n" +
                    "\n" +
                    "ಅವರು ಸಿ.ವಿ. ರಾಮನ್ ಮತ್ತು ಎ.ಪಿ.ಜೆ. ಅಬ್ದುಲ್ ಕಲಾಂ ನಂತರ ಈ ಪ್ರಶಸ್ತಿ ಪಡೆದ ಮೂರನೇ ವಿಜ್ಞಾನಿಯಾಗಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "### ಪ್ರಾರಂಭಿಕ ಜೀವನ\n" +
                    "\n" +
                    "ರಾವ್ ಅವರು ಬೆಂಗಳೂರುನಲ್ಲಿ ಕನ್ನಡ ದೇಶಸ್ಥ ಬ್ರಾಹ್ಮಣ ಕುಟುಂಬದಲ್ಲಿ ಜನಿಸಿದರು. ಅವರ ತಂದೆ ಹನುಮಂತ ನಾಗೇಶ ರಾವ್ ಶಾಲಾ ಪರಿಶೋಧಕರಾಗಿದ್ದರು ಮತ್ತು ತಾಯಿ ನಾಗಮ್ಮ ನಾಗೇಶ ರಾವ್.\n" +
                    "\n" +
                    "ಅವರು ಬಾಲ್ಯದಲ್ಲೇ ತಾಯಿಯಿಂದ ಹಿಂದೂ ಸಾಹಿತ್ಯ ಮತ್ತು ತಂದೆಯಿಂದ ಇಂಗ್ಲಿಷ್ ಕಲಿತು, ಚಿಕ್ಕ ವಯಸ್ಸಿನಲ್ಲೇ ವಿದ್ಯಾಭ್ಯಾಸದಲ್ಲಿ ಮೆರೆದರು. ಅವರು ಆಚಾರ್ಯ ಪಾಠಶಾಲೆಯಲ್ಲಿ ಪ್ರೌಢಶಿಕ್ಷಣ ಪಡೆದು, ನಂತರ ಸೆಂಟ್ರಲ್ ಕಾಲೇಜು ಬೆಂಗಳೂರುನಲ್ಲಿ ವಿಜ್ಞಾನ ಅಭ್ಯಾಸ ಮಾಡಿದರು.\n" +
                    "\n" +
                    "1951ರಲ್ಲಿ ಅವರು ಮೊದಲ ದರ್ಜೆಯಲ್ಲಿ ಪದವಿ ಪಡೆದರು. ನಂತರ ಐಐಟಿ ಖರಗ್ಪುರನಲ್ಲಿ ಪಿಎಚ್\u200Cಡಿ ಮಾಡಲು ವಿದ್ಯಾರ್ಥಿವೇತನ ದೊರೆತರೂ, ಪರ್ಡ್ಯೂ ವಿಶ್ವವಿದ್ಯಾಲಯವನ್ನು ಆಯ್ಕೆ ಮಾಡಿಕೊಂಡರು.\n" +
                    "\n" +
                    "1958ರಲ್ಲಿ ಅವರು ಕೇವಲ 2 ವರ್ಷ 9 ತಿಂಗಳಲ್ಲಿ ಪಿಎಚ್\u200Cಡಿ ಪೂರ್ಣಗೊಳಿಸಿದರು.\n"),
        h("Bengaluru Urban", "ಬೆಂಗಳೂರು ನಗರ", "Girish Karnad", "ಗಿರೀಶ್ ಕರ್ಣಾಡ್",
            "Girish Karnad (19 May 1938 – 10 June 2019) was a renowned Indian playwright, actor, film director, and Kannada writer. He worked extensively in Kannada, Hindi, Tamil, Telugu, Malayalam, and Marathi cinema.\n" +
                    "\n" +
                    "His emergence as a playwright during the 1960s marked the rise of modern Indian theatre in Kannada literature. Just as Badal Sarkar in Bengali, Vijay Tendulkar in Marathi, and Mohan Rakesh in Hindi transformed their respective literary traditions, Karnad brought a new direction to Kannada theatre.\n" +
                    "\n" +
                    "He received the prestigious Jnanpith Award in 1998, India’s highest literary honor.\n" +
                    "\n" +
                    "### Contribution to Literature and Theatre\n" +
                    "\n" +
                    "For nearly four decades, Karnad wrote plays that explored contemporary social issues through the background of history and mythology.\n" +
                    "\n" +
                    "He translated many of his plays into English, gaining international recognition. His works have also been translated into several Indian languages.\n" +
                    "\n" +
                    "His plays were staged by celebrated directors such as Ebrahim Alkazi, B. V. Karanth, Alyque Padamsee, Prasanna, Arvind Gaur, Satyadev Dubey, Vijaya Mehta, Shyamanand Jalan, Amal Allana, and Jaffar Mohiuddin.\n" +
                    "\n" +
                    "### Film Career\n" +
                    "\n" +
                    "Karnad was also highly active in Indian cinema and made significant contributions as an actor, director, and screenwriter in both Kannada and Hindi films.\n" +
                    "\n" +
                    "He was honored by the Government of India with the Padma Shri and Padma Bhushan.\n" +
                    "\n" +
                    "He won four Filmfare Awards, including three awards for Best Director in Kannada cinema and one award for Best Screenplay.\n" +
                    "\n" +
                    "In 1991, he also hosted the weekly science television program Turning Point, which aired on Doordarshan.\n",
            "ಗಿರೀಶ್ ಕಾರ್ನಾಡ್ (19 ಮೇ 1938 – 10 ಜೂನ್ 2019) ಅವರು ಭಾರತದ ಪ್ರಸಿದ್ಧ ನಾಟಕಕಾರ, ನಟ, ಚಲನಚಿತ್ರ ನಿರ್ದೇಶಕ ಮತ್ತು ಕನ್ನಡ ಲೇಖಕರಾಗಿದ್ದರು. ಅವರು ಮುಖ್ಯವಾಗಿ ಕನ್ನಡ, ಹಿಂದಿ, ತಮಿಳು, ತೆಲುಗು, ಮಲಯಾಳಂ ಮತ್ತು ಮರಾಠಿ ಚಿತ್ರರಂಗಗಳಲ್ಲಿ ಕೆಲಸ ಮಾಡಿದರು.\n" + "\n" +
                    "1960ರ ದಶಕದಲ್ಲಿ ನಾಟಕಕಾರರಾಗಿ ಅವರ ಉದಯವು ಕನ್ನಡದಲ್ಲಿ ಆಧುನಿಕ ಭಾರತೀಯ ನಾಟಕ ಸಾಹಿತ್ಯದ ಬೆಳವಣಿಗೆಯನ್ನು ಸೂಚಿಸಿತು. ಬೆಂಗಾಲಿಯಲ್ಲಿ ಬಾದಲ್ ಸರ್ಕಾರ್, ಮರಾಠಿಯಲ್ಲಿ ವಿಜಯ ತೆಂಡೂಲ್ಕರ್ ಮತ್ತು ಹಿಂದಿಯಲ್ಲಿ ಮೋಹನ್ ರಾಕೇಶ್ ಮಾಡಿದಂತೆ, ಕಾರ್ನಾಡ್ ಅವರು ಕನ್ನಡದಲ್ಲಿ ಹೊಸ ದಿಕ್ಕನ್ನು ನೀಡಿದರು.\n" + "\n" + "ಅವರಿಗೆ 1998ರಲ್ಲಿ ಭಾರತದ ಅತ್ಯುನ್ನತ ಸಾಹಿತ್ಯ ಪ್ರಶಸ್ತಿಯಾದ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು.\n" + "\n" + "### ಸಾಹಿತ್ಯ ಮತ್ತು ನಾಟಕ ಕ್ಷೇತ್ರದ ಕೊಡುಗೆ\n" + "\n" + "ಸುಮಾರು ನಾಲ್ಕು ದಶಕಗಳ ಕಾಲ ಕಾರ್ನಾಡ್ ಅವರು ನಾಟಕಗಳನ್ನು ರಚಿಸಿದರು. ಇತಿಹಾಸ ಮತ್ತು ಪುರಾಣಗಳ ಹಿನ್ನೆಲೆಯನ್ನು ಬಳಸಿಕೊಂಡು ಸಮಕಾಲೀನ ಸಾಮಾಜಿಕ ಸಮಸ್ಯೆಗಳನ್ನು ತಮ್ಮ ನಾಟಕಗಳಲ್ಲಿ ಚಿತ್ರಿಸಿದರು.\n" + "\n" +
                    "ಅವರು ತಮ್ಮ ನಾಟಕಗಳನ್ನು ಇಂಗ್ಲಿಷ್\u200Cಗೆ ಅನುವಾದಿಸಿ ಅಂತರರಾಷ್ಟ್ರೀಯ ಮಟ್ಟದಲ್ಲೂ ಪ್ರಶಂಸೆ ಪಡೆದರು. ಅವರ ಕೃತಿಗಳನ್ನು ಅನೇಕ ಭಾರತೀಯ ಭಾಷೆಗಳಿಗೆ ಅನುವಾದಿಸಲಾಗಿದೆ.\n" +
                    "\n" +
                    "ಅವರ ನಾಟಕಗಳನ್ನು ಇಬ್ರಾಹಿಂ ಅಲ್ಕಾಜಿ, ಬಿ.ವಿ. ಕಾರಂತ್, ಅಲಿಕ್ ಪದಂಸಿ, ಪ್ರಸನ್ನ, ಅರವಿಂದ ಗೌರ್, ಸತ್ಯದೇವ್ ದುಬೆ, ವಿಜಯಾ ಮೇಹತಾ, ಶ್ಯಾಮಾನಂದ ಜಾಲನ್, ಅಮಲ್ ಅಲ್ಲಾನಾ ಮತ್ತು ಜಾಫರ್ ಮೊಹಿಯುದ್ದೀನ್ ಮೊದಲಾದ ಖ್ಯಾತ ನಿರ್ದೇಶಕರು ವೇದಿಕೆಗೇರಿಸಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "### ಚಲನಚಿತ್ರ ಕ್ಷೇತ್ರ\n" + "\n" +
                    "ಕಾರ್ನಾಡ್ ಅವರು ಭಾರತೀಯ ಚಿತ್ರರಂಗದಲ್ಲಿಯೂ ಸಕ್ರಿಯರಾಗಿದ್ದು, ನಟ, ನಿರ್ದೇಶಕ ಮತ್ತು ಕಥಾಸಾಹಿತ್ಯಕಾರರಾಗಿ ಕನ್ನಡ ಮತ್ತು ಹಿಂದಿ ಚಿತ್ರರಂಗಗಳಲ್ಲಿ ಮಹತ್ವದ ಸಾಧನೆ ಮಾಡಿದ್ದಾರೆ.\n" + "\n" +
                    "ಅವರಿಗೆ ಭಾರತ ಸರ್ಕಾರದಿಂದ ಪದ್ಮಶ್ರೀ ಮತ್ತು ಪದ್ಮಭೂಷಣ ಪ್ರಶಸ್ತಿಗಳು ದೊರೆತಿವೆ.\n" + "\n" +
                    "ಅವರು ನಾಲ್ಕು ಫಿಲ್ಮ್\u200Cಫೇರ್ ಪ್ರಶಸ್ತಿಗಳನ್ನು ಗೆದ್ದಿದ್ದು, ಅವುಗಳಲ್ಲಿ ಮೂರು ಕನ್ನಡದ ಅತ್ಯುತ್ತಮ ನಿರ್ದೇಶಕ ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಒಂದು ಅತ್ಯುತ್ತಮ ಕಥಾಸಾಹಿತ್ಯ ಪ್ರಶಸ್ತಿಯಾಗಿದೆ.\n" +"\n" + "1991ರಲ್ಲಿ ದೂರದರ್ಶನದಲ್ಲಿ ಪ್ರಸಾರವಾದ “Turning Point” ಎಂಬ ವಾರಾಂತರ ವಿಜ್ಞಾನ ಕಾರ್ಯಕ್ರಮದ ನಿರೂಪಕರಾಗಿಯೂ ಅವರು ಕಾರ್ಯನಿರ್ವಹಿಸಿದರು.\n"),

        h("Bengaluru Rural", "ಬೆಂಗಳೂರು ಗ್ರಾಮಾಂತರ", "Tipu Sultan", "ಟಿಪ್ಪು ಸುಲ್ತಾನ್",
            "Tipu Sultan (Sultan Fateh Ali Sahab Tipu; 1 December 1751 – 4 May 1799), commonly referred to as the Tiger of Mysore, was the Sultan of Mysore from 1782 until his death in 1799. He was a pioneer of rocket artillery. He expanded the iron-cased Mysorean rockets and commissioned the military manual *Fathul Mujahidin*. The economy of Mysore reached a zenith during his reign. He deployed rockets against advances of British forces and their allies during the Anglo-Mysore Wars, including the Battle of Pollilur and the Siege of Srirangapatna.\n" +
                    "\n" +
                    "Tipu Sultan and his father Hyder Ali used their French-trained army in alliance with the French in their struggle with the British, and in Mysore's struggles with other surrounding powers: against the Marathas, Sira, and rulers of Malabar, Kodagu, Bednore, Carnatic, and Travancore. Tipu became the ruler of Mysore upon his father's death from cancer in 1782 during the Second Anglo-Mysore War. He negotiated with the British in 1784 with the Treaty of Mangalore, which ended the war in status quo ante bellum.\n" +
                    "\n" +
                    "Tipu's conflicts with his neighbours included the Maratha–Mysore War, which ended with the signing of the Treaty of Gajendragad.\n" +
                    "\n" +
                    "Tipu remained an enemy of the British East India Company. He initiated an attack on British-allied Travancore in 1789. In the Third Anglo-Mysore War, he was forced into the Treaty of Seringapatam, losing a number of previously conquered territories, including Malabar and Mangalore. In the Fourth Anglo-Mysore War, a combined force of British East India Company troops supported by the Marathas and the Nizam of Hyderabad defeated Tipu. He was killed on 4 May 1799 while defending his stronghold of Seringapatam.\n" +
                    "\n" +
                    "Tipu also introduced administrative innovations during his rule, including a new coinage system and calendar, and a new land revenue system, which initiated the growth of the Mysore silk industry. He is known for his patronage of Channapatna toys.\n",
            "ಟಿಪ್ಪು ಸುಲ್ತಾನನು (ಸುಲ್ತಾನ್ ಫತೇಹ್ ಅಲಿ ಸಾಹಬ್ ಟಿಪ್ಪು; 1 ಡಿಸೆಂಬರ್ 1751 – 4 ಮೇ 1799), ಸಾಮಾನ್ಯವಾಗಿ ಶೇರ್-ಎ-ಮೈಸೂರ್ ಅಥವಾ \"ಮೈಸೂರು ಹುಲಿ\" ಎಂದು ಉಲ್ಲೇಖಿಸಲಾದವನು, ದಕ್ಷಿಣ ಭಾರತದ ಮೈಸೂರು ರಾಜ್ಯದ ಮುಸಲ್ಮಾನ ದೊರೆ.  ಭಾರತ.  ಅವನು ರಾಕೆಟ್ ಫಿರಂಗಿಗಳ ಪ್ರವರ್ತಕರಾಗಿದ್ದನು. ಅವನು ತನ್ನ ಆಡಳಿತದ ಅವಧಿಯಲ್ಲಿ ಹೊಸ ನಾಣ್ಯ ವ್ಯವಸ್ಥೆ ಮತ್ತು ಕ್ಯಾಲೆಂಡರ್, ಮತ್ತು ಹೊಸ ಭೂಕಂದಾಯ ವ್ಯವಸ್ಥೆಯನ್ನು ಒಳಗೊಂಡಂತೆ ಹಲವಾರು ಆಡಳಿತಾತ್ಮಕ ಆವಿಷ್ಕಾರಗಳನ್ನು ಪರಿಚಯಿಸಿದನು, ಇದು ಮೈಸೂರು ರೇಷ್ಮೆ ಉದ್ಯಮದ ಬೆಳವಣಿಗೆಯನ್ನು ಪ್ರಾರಂಭಿಸಿತು.  ಚನ್ನಪಟ್ಟಣದ ಆಟಿಕೆಗಳನ್ನು ಪರಿಚಯಿಸುವಲ್ಲಿ ಟಿಪ್ಪು ಕೂಡ ಪ್ರವರ್ತಕನಾಗಿದ್ದ.  ಅವರು ಕಬ್ಬಿಣಕವಚದ ಮೈಸೂರಿ ರಾಕೆಟ್\u200Cಗಳನ್ನು ವಿಸ್ತರಿಸಿದನು ಮತ್ತು ಮಿಲಿಟರಿ ಕೈಪಿಡಿ ಫತುಲ್ ಮುಜಾಹಿದೀನನ್ನು ನಿಯೋಜಿಸಿದರು, ಅವರು ಪೊಲ್ಲಿಲೂರ್ ಕದನ ಮತ್ತು ಶ್ರೀರಂಗಪಟ್ಟಣದ ಮುತ್ತಿಗೆಯಲ್ಲಿ ಆಂಗ್ಲಮೈಸೂರು ಯುದ್ಧಗಳ ಸಮಯದಲ್ಲಿ ಬ್ರಿಟಿಷ್ ಪಡೆಗಳು ಮತ್ತು ಅವರ ಮಿತ್ರರ ಪ್ರಗತಿಯ ವಿರುದ್ಧ ರಾಕೆಟ್\u200Cಗಳನ್ನು ನಿಯೋಜಿಸಿದನು."),
        h("Bengaluru Rural", "ಬೆಂಗಳೂರು ಗ್ರಾಮಾಂತರ", "K. S. Nissar Ahmed", "ಕೆ. ಎಸ್. ನಿಸಾರ್ ಅಹಮದ್",
            "K. S. Nissar Ahmed (Kokkare Hosahalli Shekh Haider Nissar Ahmed; 5 February 1936 – 3 May 2020) was an Indian poet and writer in the Kannada language. He was awarded the Padma Shri in 2008, the Rajyotsava Award in 1981, and the Pampa Award in 2017 for his literary contributions. He became a household name for his work *Nityotsava* (Daily Celebration), a poem about Karnataka composed after seeing Jog Falls. He wrote numerous poems, translations, and children’s books. He was known for using simple words that deeply resonated with the public in his literary works.\n" + "\n" + "## Early Life and Education\n" + "\n" + "Nissar Ahmed was born in Devanahalli in Bangalore Rural district. His father was a government employee, and the family later moved to Dodda Mavalli in Bangalore. He grew up in a Muslim colony with around 500 Muslim families. Although most children in the neighbourhood studied Urdu, his father admitted him to a Kannada-medium school to make it easier for him to secure a government job in the future.\n" + "\n" + "He was inspired by writers G. P. Rajarathnam and M. V. Seetharamiah, who were his high school teachers.\n" + "\n" + "He completed a postgraduate degree in Geology and worked as an Assistant Geologist in the Mysore Mines and Geology Department at Gulbarga. Later, he came into contact with Kuvempu and was invited to the Kannada poets’ meet during the Dasara festival in 1959.\n" + "\n" + "## Teaching Career\n" + "\n" + "He worked as a lecturer in Geology at Central College, Bangalore, and later in Chitradurga. He also taught at Sahyadri First Grade College in Shimoga during 1967–72 and again from 1975–78.\n" + "\n" + "## Literary Career\n" + "\n" + "Nissar Ahmed is best known for *Nityotsava* (ನಿತ್ಯೋತ್ಸವ). The compilation was released in 1978, and the song became extremely popular, making him a household name across Karnataka. A total of 13 albums based on his works were published. He also served as the chairperson of the Karnataka Sahitya Academy from 1984 to 1987.\n",
            "ದಪ್ರೊ.ಕೆ.ಎಸ್.ನಿಸಾರ್ ಅಹಮದ್(5 ಫೆಬ್ರುವರಿ 1936 - 3 ಮೇ 2020) ಕನ್ನಡದ ಪ್ರಮುಖ ಕವಿಯಾಗಿದ್ದರು. ಅವರ ಪೂರ್ಣ ಹೆಸರು ಕೊಕ್ಕರೆಹೊಸಳ್ಳಿ ಶೇಖ್ ಹೈದರ್ ನಿಸಾರ್ ಅಹಮದ್. ಅವರು ಬರೆದ 'ಜೋಗದ ಸಿರಿ ಬೆಳಕಿನಲ್ಲಿ ತುಂಗೆಯ ತೆನೆ ಬಳುಕಿನಲ್ಲಿ' ಎಂಬ ಪದ್ಯವು ಬಹಳ ಜನಪ್ರಿಯವಾಗಿ ಅವರು ನಿತ್ಯೋತ್ಸವ ಕವಿಯೆಂದೂ ಕರೆಯಲ್ಪಡುತ್ತಿದ್ದರು.\n" +
                    "\n" +
                    "ಜೀವನ\n" +
                    "ನಿಸಾರ್ ಅಹಮದ್ ಬೆಂಗಳೂರು ಜಿಲ್ಲೆಯ ದೇವನಹಳ್ಳಿಯಲ್ಲಿ ಫೆಬ್ರುವರಿ ೫,೧೯೩೬ರಲ್ಲಿ ಜನಿಸಿದರು. ೧೯೫೯ರಲ್ಲಿ ಭೂರಚನಶಾಸ್ತ್ರ ಭೂವಿಜ್ಞಾನದಲ್ಲಿ ಸ್ನಾತಕೋತ್ತರ ಪದವಿ ಪಡೆದರು. ೧೯೯೪ರ ವರೆಗೆ ವಿವಿಧ ಸರಕಾರಿ ಕಾಲೇಜುಗಳಲ್ಲಿ ಅಧ್ಯಾಪಕ ಹಾಗು ಪ್ರಾಧ್ಯಾಪಕರಾಗಿ ಕೆಲಸ ಮಾಡಿ ನಿವೃತರು\n" +
                    "\n" +
                    "ಸಾಹಿತ್ಯ\n" +
                    "ನಿಸಾರ್ ಅಹಮದ್ [೨] ಅವರ ಸಾಹಿತ್ಯಾಸಕ್ತಿ ೧೦ನೇ ವಯಸ್ಸಿನಲ್ಲೇ ಆರಂಭ.'ಜಲಪಾತ'ದ ಬಗ್ಗೆ ಬರೆದ ಕವನ ಕೈಬರಹದ ಪತ್ರಿಕೆಯಲ್ಲಿ ಅಚ್ಚಾಗಿತ್ತು. ಅವರು ಇಲ್ಲಿಯವರೆಗೆ (೨೦೧೮) ೨೧ ಕವನ ಸಂಕಲನಗಳು, ೧೪ ವೈಚಾರಿಕೆ ಕೃತಿಗಳು, ೫ ಮಕ್ಕಳ ಸಾಹಿತ್ಯ ಕೃತಿಗಳು, ೫ ಅನುವಾದ ಕೃತಿಗಳು, ೧೩ ಸಂಪಾದನಾ ಗ್ರಂಥಗಳನ್ನು ಹೊರತಂದಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "ಅವುಗಳಲ್ಲಿ ಮನಸು ಗಾಂಧಿಬಜಾರು ಹಾಗೂ ನಿತ್ಯೋತ್ಸವ ಇವು ಪ್ರಸಿದ್ಧ ಕವನ ಸಂಕಲನಗಳಾಗಿವೆ. ನಿಸಾರ್\u200D ಅಹಮದ್ ಸಂವೇದನಾಶೀಲ ಹಾಗೂ ಜನಪ್ರಿಯ ಕವಿ.[೩]\n" +
                    "೧೯೭೮ರಲ್ಲಿ ಇವರ ಮೊದಲ ಭಾವಗೀತೆಗಳ ಧ್ವನಿಮುದ್ರಿಕೆ ನಿತ್ಯೋತ್ಸವ ಹೊರಬಂದು, ಕನ್ನಡ ಲಘುಸಂಗೀತ (ಸುಗಮ ಸಂಗೀತ) ಕ್ಷೇತ್ರದಲ್ಲಿ ಭರ್ಜರಿ ಯಶಸ್ಸು ಪಡೆಯಿತು. ಇದುವರೆಗೂ (೨೦೧೮) ೧೩ ಧ್ವನಿಸುರುಳಿಗಳ ಮೂಲಕ ಅವರು ರಚಿಸಿದ ಕವನಗಳು,ಗೀತೆಗಳು ಸಂಗೀತದೊಂದಿಗೆ ಪ್ರಚಾರಗೊಂಡಿತು.\n" +
                    "\n" +
                    "\n" +
                    "ಕುರಿಗಳು ಸಾರ್\u200D ಕುರಿಗಳು, ರಾಜಕೀಯ ವಿಡಂಬನೆ ಕವನ\n" +
                    "ಭಾರತವು ನಮ್ಮ ದೇಶ (ಸರ್\u200D ಮೊಹಮದ್ ಇಕ್ಬಾಲ್ ಅವರ ಸಾರೆ ಜಹಾಂ ಸೆ ಅಚ್ಚಾ ಕವನದ ಕನ್ನಡ ಭಾಷಾಂತರ)\n" +
                    "ಬೆಣ್ಣೆ ಕದ್ದ ನಮ್ಮ ಕೃಷ್ಣ ಕವನ ಕವಿಯ ಬಹುಮುಖ ಪ್ರತಿಭೆಗೆ ಸಾಕ್ಷಿಯಾಗಿವೆ."),

        h("Bidar", "ಬೀದರ್", "Hyderabad-Karnataka liberation activists", "ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ವಿಮೋಚನಾ ಹೋರಾಟಗಾರರು",
            "The Hyderabad-Karnataka liberation movement (ending September 17, 1948) was an armed struggle against the Nizam of Hyderabad's Razakar militia to merge the region into India. Key activists and leaders included Swami Ramanand Teertha, Sardar Sharangouda Patil, Ramachandra Veerappa, and Kusumakar Desai, who fought alongside local patriots. [1, 2, 3]  \n" +
                    "Key Activists and Leaders \n" +
                    "\n" +
                    "• Swami Ramanand Teertha: Led the overall freedom struggle in the Hyderabad State. \n" +
                    "• Sardar Sharangouda Patil: A key leader from Jevargi who organized the armed struggle. \n" +
                    "• Ramachandra Veerappa: Active leader from Bidar. \n" +
                    "• Kusumakar Desai: Active worker in border camps from Gulbarga. \n" +
                    "• Dharma Veera Nelogi & Saibanna: Sibiradhipathis (camp leaders) in the border movement. \n" +
                    "• Byrappa Patil of Boosnur: Active participant in the liberation camps. \n" +
                    "• Appa Rao Patil of Mahagaon: Active participant in the liberation camps. \n" +
                    "• Sidramaiah Hiremath: Survivor of the liberation movement from Nagaralli village. \n" +
                    "• Muralidhar Rao Kulkarni: Martyr from Malli village. [1, 2, 3, 4, 5]  \n" +
                    "\n" +
                    "Movement Highlights \n" +
                    "\n" +
                    "• Border Movements: Activists established camps to launch attacks on the Nizam's police stations and custom offices in areas like Jambigi and Tirukachincholi. \n" +
                    "• Malli Village Resistance: Known as a \"village of patriots,\" 11 people were killed by Razakars in Malli (Jewargi taluk) shortly before liberation on September 17, 1948. \n" +
                    "• Arya Samaj Influence: The Arya Samaj played a significant role in promoting nationalism and resistance against the Nizam. \n" +
                    "• Armed Action: The movement, which intensified after 1947, was supported by voluntary armed units (Dalits) fighting against the Nizam's Razakars. [1, 3, 4, 6, 7]  \n" +
                    "\n" +
                    "Key Organizations and Context \n" +
                    "\n" +
                    "• Hyderabad State Congress: Played a central role in the struggle for integration with the Indian Union. \n" +
                    "• Border Camps: Formed along the borders of the Nizam's territory to launch guerrilla attacks. \n" +
                    "• Nizam's Rule: Ended after police action (Operation Polo) ordered by Sardar Vallabhbhai Patel, liberating the Hyderabad-Karnataka region. [2, 3, 4, 8, 9]  \n" +
                    "\n" +
                    "AI responses may include mistakes.\n" +
                    "\n",

            "ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ವಿಮೋಚನಾ ಚಳವಳಿ (17 ಸೆಪ್ಟೆಂಬರ್ 1948ರವರೆಗೆ ನಡೆದ ಚಳವಳಿ) ಹೈದರಾಬಾದ್\u200Cನ ನಿಜಾಂ ಆಳ್ವಿಕೆ ಮತ್ತು ಅವರ ರಜಾಕಾರ್ ಪಡೆಗಳ ವಿರುದ್ಧ ನಡೆದ ಸಶಸ್ತ್ರ ಹೋರಾಟವಾಗಿತ್ತು. ಈ ಹೋರಾಟದ ಉದ್ದೇಶ ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ಪ್ರದೇಶವನ್ನು ಭಾರತೀಯ ಒಕ್ಕೂಟಕ್ಕೆ ವಿಲೀನಗೊಳಿಸುವುದಾಗಿತ್ತು.\n" +
                    "\n" +
                    "### ಪ್ರಮುಖ ನಾಯಕರು ಮತ್ತು ಹೋರಾಟಗಾರರು\n" +
                    "\n" +
                    "* ಸ್ವಾಮಿ ರಾಮಾನಂದ ತೀರ್ಥ — ಹೈದರಾಬಾದ್ ರಾಜ್ಯದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದ ಪ್ರಮುಖ ನಾಯಕರು.\n" +
                    "* ಸರ್ದಾರ್ ಶರಣಗೌಡ ಪಾಟೀಲ್ — ಜೇವರ್ಗಿ ಪ್ರದೇಶದ ಪ್ರಮುಖ ಹೋರಾಟಗಾರರು; ಸಶಸ್ತ್ರ ಹೋರಾಟವನ್ನು ಸಂಘಟಿಸಿದರು.\n" +
                    "* ರಾಮಚಂದ್ರ ವೀರಪ್ಪ — ಬೀದರ್ ಪ್ರದೇಶದ ಸಕ್ರಿಯ ನಾಯಕರು.\n" +
                    "* ಕುಸುಮಾಕರ್ ದೇಸಾಯಿ — ಗುಲ್ಬರ್ಗಾ ಗಡಿಭಾಗದ ಶಿಬಿರಗಳಲ್ಲಿ ಕಾರ್ಯನಿರ್ವಹಿಸಿದ ಹೋರಾಟಗಾರರು.\n" +
                    "* ಧರ್ಮವೀರ ನೆಲೋಗಿ ಮತ್ತು ಸೈಬಣ್ಣ — ಗಡಿಭಾಗದ ಶಿಬಿರಗಳ ನಾಯಕರು (ಶಿಬಿರಾಧಿಪತಿಗಳು).\n" +
                    "* ಬೈರಪ್ಪ ಪಾಟೀಲ್ — ಬೂಸ್ನೂರಿನ ಹೋರಾಟಗಾರರು.\n" +
                    "* ಅಪ್ಪಾರಾವ್ ಪಾಟೀಲ್ — ಮಹಾಗಾಂವ್ ಪ್ರದೇಶದ ಸಕ್ರಿಯ ಹೋರಾಟಗಾರರು.\n" +
                    "* ಸಿದ್ರಾಮಯ್ಯ ಹಿರೇಮಠ — ನಾಗರಳ್ಳಿ ಗ್ರಾಮದ ವಿಮೋಚನಾ ಹೋರಾಟದ ಜೀವಂತ ಸಾಕ್ಷಿದಾರರು.\n" +
                    "* ಮುರಳೀಧರರಾವ್ ಕುಲಕರ್ಣಿ — ಮಳ್ಳಿ ಗ್ರಾಮದ ಹುತಾತ್ಮರು.\n" +
                    "\n" +
                    "### ಚಳವಳಿಯ ಪ್ರಮುಖ ಅಂಶಗಳು\n" +
                    "\n" +
                    "* **ಗಡಿಭಾಗ ಚಳವಳಿ:** ಹೋರಾಟಗಾರರು ಜಾಂಬಗಿ ಮತ್ತು ತಿರುಕಾಶಿಂಚೋಳಿ ಪ್ರದೇಶಗಳಲ್ಲಿ ಶಿಬಿರಗಳನ್ನು ನಿರ್ಮಿಸಿ, ನಿಜಾಂನ ಪೊಲೀಸ್ ಠಾಣೆಗಳು ಮತ್ತು ಸುಂಕ ಕಚೇರಿಗಳ ಮೇಲೆ ದಾಳಿಗಳನ್ನು ನಡೆಸಿದರು.\n" +
                    "* **ಮಳ್ಳಿ ಗ್ರಾಮದ ಹೋರಾಟ:** ಮಳ್ಳಿ ಗ್ರಾಮವನ್ನು “ದೇಶಭಕ್ತರ ಊರು” ಎಂದು ಕರೆಯಲಾಗುತ್ತಿತ್ತು. ವಿಮೋಚನೆಯ ಕೆಲ ದಿನಗಳ ಮೊದಲು ರಜಾಕಾರರು 11 ಜನರನ್ನು ಹತ್ಯೆ ಮಾಡಿದರು.\n" +
                    "* ಆರ್ಯ ಸಮಾಜ ರಾಷ್ಟ್ರೀಯತೆಯ ಭಾವನೆ ಮತ್ತು ನಿಜಾಂ ವಿರುದ್ಧದ ಹೋರಾಟವನ್ನು ಉತ್ತೇಜಿಸುವಲ್ಲಿ ಮಹತ್ವದ ಪಾತ್ರ ವಹಿಸಿತು.\n" +
                    "* **ಸಶಸ್ತ್ರ ಹೋರಾಟ:** 1947 ನಂತರ ಚಳವಳಿ ತೀವ್ರಗೊಂಡಿತು. ಸ್ವಯಂಸೇವಕ ಸಶಸ್ತ್ರ ದಳಗಳು ರಜಾಕಾರರ ವಿರುದ್ಧ ಹೋರಾಡಿದವು.\n" +
                    "\n" +
                    "### ಪ್ರಮುಖ ಸಂಘಟನೆಗಳು ಮತ್ತು ಹಿನ್ನೆಲೆ\n" +
                    "\n" +
                    "* ಹೈದರಾಬಾದ್ ಸ್ಟೇಟ್ ಕಾಂಗ್ರೆಸ್ ಭಾರತ ಒಕ್ಕೂಟದೊಂದಿಗೆ ವಿಲೀನಕ್ಕಾಗಿ ಪ್ರಮುಖ ಪಾತ್ರ ವಹಿಸಿತು.\n" +
                    "* ಗಡಿಭಾಗಗಳಲ್ಲಿ ಶಿಬಿರಗಳನ್ನು ನಿರ್ಮಿಸಿ ಗೆರಿಲ್ಲಾ ದಾಳಿಗಳನ್ನು ನಡೆಸಲಾಯಿತು.\n" +
                    "* ಕೊನೆಗೆ ಆಪರೇಶನ್ ಪೋಲೊ ಎಂಬ ಸೈನಿಕ ಕಾರ್ಯಾಚರಣೆಯನ್ನು ಸರ್ದಾರ್ ವಲ್ಲಭಭಾಯಿ ಪಟೇಲ್ ಅವರ ಆದೇಶದಂತೆ ನಡೆಸಿ, ನಿಜಾಂ ಆಳ್ವಿಕೆಗೆ ಅಂತ್ಯವಾಯಿತು ಮತ್ತು ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ಪ್ರದೇಶ ವಿಮೋಚನೆಯಾಯಿತು.\n"),
        h("Bidar", "ಬೀದರ್", "Bhalki Channabasav Pattaddevaru", "ಭಾಲ್ಕಿ ಚನ್ನಬಸವ ಪಟ್ಟದ್ದೇವರು",
            "Dr. Channabasava Pattadevaru (1890–1999) was a revered pontiff and social reformer based in Bhalki, Bidar district, Karnataka, known as a follower of 12th-century reformer Mahatma Basaveshwara. He founded the Shanti Vardhak Education Society (SVES) in 1963, providing education to the underprivileged, and played a key role in promoting Kannada in the Hyderabad-Karnataka region. [1]  \n" +
                    "Key Highlights of Channabasava Pattadevaru's Legacy: \n" +
                    "\n" +
                    "• \"Work is Worship\" Motto: He was a dedicated reformer, working until his passing at age 109, and was deeply involved in social service, providing free education and shelter to poor children. \n" +
                    "• Education Movement: He founded the Shanti Vardhak Education Society in Bhalki, which now runs numerous institutions from primary to engineering (Bheemanna Khandre Institute of Technology). \n" +
                    "• Literary & Regional Service: During the Nizam's rule, he promoted Kannada, often defying restrictions by using Urdu boards for schools while teaching in Kannada, say sources/videos. \n" +
                    "• Hiremath Samsthan Bhalki: He served as the spiritual head of the Hiremath Samsthan in Bhalki, establishing it as a center for education and social change. \n" +
                    "• Channabasava Pattadevaru Samadhi: A memorial located in Bhalki, which serves as a center for his followers. [1, 2, 3, 4, 5]  \n" +
                    "\n" +
                    "His legacy is carried forward by his successor, Dr. Basavalinga Pattadevaru, who continues to manage the Channabasaveshwar Gurukul and promote Vachana education. [4, 5, 6, 7, 8]  \n" +
                    "\n" +
                    "AI responses may include mistakes.\n" +
                    "\n",
            "ಡಾ. ಚೆನ್ನಬಸವ ಪಟ್ಟದೇವರು (1890–1999) ಅವರು ಭಾಲ್ಕಿ ಮೂಲದ ಗೌರವಾನ್ವಿತ ಪೀಠಾಧಿಪತಿ ಹಾಗೂ ಸಮಾಜ ಸುಧಾರಕರಾಗಿದ್ದರು. ಅವರು 12ನೇ ಶತಮಾನದ ಮಹಾನ್ ಸಮಾಜ ಸುಧಾರಕ ಮಹಾತ್ಮ ಬಸವೇಶ್ವರ ಅವರ ಚಿಂತನೆಗಳ ಅನುಯಾಯಿಯಾಗಿದ್ದರು.\n" + "\n" + "1963ರಲ್ಲಿ ಅವರು ಶಾಂತಿ ವರ್ಧಕ ಶಿಕ್ಷಣ ಸಂಸ್ಥೆ (SVES)ಯನ್ನು ಸ್ಥಾಪಿಸಿ, ಬಡ ಮತ್ತು ಹಿಂದುಳಿದ ಮಕ್ಕಳಿಗೆ ಶಿಕ್ಷಣ ನೀಡುವ ಮಹತ್ವದ ಕಾರ್ಯವನ್ನು ಕೈಗೊಂಡರು. ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ಪ್ರದೇಶದಲ್ಲಿ ಕನ್ನಡ ಭಾಷೆಯ ಪ್ರಚಾರದಲ್ಲಿಯೂ ಅವರು ಪ್ರಮುಖ ಪಾತ್ರವಹಿಸಿದರು.\n" + "\n" + "### ಡಾ. ಚೆನ್ನಬಸವ ಪಟ್ಟದೇವರವರ ಪ್ರಮುಖ ಕೊಡುಗೆಗಳು\n" + "\n" + "* **“ಕಾಯಕವೇ ಕೈಲಾಸ” ತತ್ವ:** ಅವರು ಜೀವನಪೂರ್ತಿ ಸಮಾಜಸೇವೆಯಲ್ಲಿ ತೊಡಗಿಸಿಕೊಂಡು, 109ನೇ ವಯಸ್ಸಿನವರೆಗೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಬಡ ಮಕ್ಕಳಿಗೆ ಉಚಿತ ಶಿಕ್ಷಣ ಮತ್ತು ಆಶ್ರಯ ಒದಗಿಸಿದರು.\n" + "* **ಶೈಕ್ಷಣಿಕ ಚಳವಳಿ:** ಭಾಲ್ಕಿಯಲ್ಲಿ ಸ್ಥಾಪಿಸಿದ ಶಾಂತಿ ವರ್ಧಕ ಶಿಕ್ಷಣ ಸಂಸ್ಥೆ ಇಂದು ಪ್ರಾಥಮಿಕ ಶಾಲೆಯಿಂದ ಇಂಜಿನಿಯರಿಂಗ್ ಕಾಲೇಜುವರೆಗೆ ಅನೇಕ ಶಿಕ್ಷಣ ಸಂಸ್ಥೆಗಳನ್ನು ನಡೆಸುತ್ತಿದೆ. ಇದರಲ್ಲಿ ಭೀಮಣ್ಣ ಖಂಡ್ರೆ ಇನ್\u200Cಸ್ಟಿಟ್ಯೂಟ್ ಆಫ್ ಟೆಕ್ನಾಲಜಿ ಪ್ರಮುಖವಾಗಿದೆ.\n" + "* **ಕನ್ನಡ ಸೇವೆ:** ನಿಜಾಂ ಆಡಳಿತದ ಕಾಲದಲ್ಲಿ ಕನ್ನಡ ಭಾಷೆಯ ಮೇಲಿದ್ದ ನಿರ್ಬಂಧಗಳ ನಡುವೆಯೂ ಅವರು ಶಾಲೆಗಳಲ್ಲಿ ಉರ್ದು ಫಲಕಗಳನ್ನು ಬಳಸಿ, ಒಳಗೆ ಕನ್ನಡದಲ್ಲಿ ಶಿಕ್ಷಣ ನೀಡುತ್ತಿದ್ದರು.\n" + "* **ಹಿರೇಮಠ ಸಂಸ್ಥಾನ ಭಾಲ್ಕಿ:** ಅವರು ಹಿರೇಮಠ ಸಂಸ್ಥಾನ ಭಾಲ್ಕಿಯ ಪೀಠಾಧಿಪತಿಯಾಗಿದ್ದು, ಅದನ್ನು ಶಿಕ್ಷಣ ಮತ್ತು ಸಮಾಜ ಪರಿವರ್ತನೆಯ ಕೇಂದ್ರವನ್ನಾಗಿ ರೂಪಿಸಿದರು.\n" +
                    "* **ಸಮಾಧಿ ಮಂದಿರ:** ಚೆನ್ನಬಸವ ಪಟ್ಟದೇವರ ಸಮಾಧಿ ಮಂದಿರ ಇಂದು ಅವರ ಅನುಯಾಯಿಗಳ ಪ್ರಮುಖ ಭಕ್ತಿ ಕೇಂದ್ರವಾಗಿದೆ.\n" + "\n" +
                    "ಅವರ ಪರಂಪರೆಯನ್ನು ಅವರ ಉತ್ತರಾಧಿಕಾರಿ ಡಾ. ಬಸವಲಿಂಗ ಪಟ್ಟದೇವರು ಮುಂದುವರಿಸುತ್ತಿದ್ದು, ಚನ್ನಬಸವೇಶ್ವರ ಗುರುಕುಲದ ಮೂಲಕ ವಚನ ಸಾಹಿತ್ಯ ಮತ್ತು ಶಿಕ್ಷಣದ ಸೇವೆಯನ್ನು ಸಾಗಿಸುತ್ತಿದ್ದಾರೆ.\n."),

        h("Chamarajanagar", "ಚಾಮರಾಜನಗರ", "B. Rachaiah", "ಬಿ. ರಾಚಯ್ಯ",
            "B. Rachaiah (Basavaiah Rachaiah; 10 August 1922 – 14 February 2000) was an Indian politician and prominent Dalit leader. He served as a member of the Karnataka Legislative Assembly from Santhemarahalli and was also a member of the Rajya Sabha representing Karnataka. In 1977, he was elected to the Lok Sabha from Chamarajanagar, Karnataka.\n" + "\n" +
                    "Rachaiah also served as the Governor of Kerala and Himachal Pradesh. During his political career, he was part of the Karnataka state cabinets headed by leaders such as S. Nijalingappa, B. D. Jatti, Devaraj Urs, Veerendra Patil, Ramakrishna Hegde, and S. R. Bommai.\n" + "\n" +
                    "Rachaiah was born in Chamarajanagar in 1922 and worked as an advocate by profession. One of his sons-in-law, B. B. Ningaiah, served as a minister in the government headed by J. H. Patel. Rachaiah passed away in 2000 at the age of 77.\n" + "\n" + "## Legacy\n" + "\n" +
                    "A traffic circle on Sayyaji Rao Road in Mysuru has been named “B. Rachaiah Circle” in recognition of the services he rendered to the state.\n",
            "ಬಸವಯ್ಯ ರಾಚಯ್ಯ (10 ಆಗಸ್ಟ್ 1922 – 14 ಫೆಬ್ರವರಿ 2000) ಅವರು ಭಾರತದ ಪ್ರಮುಖ ರಾಜಕಾರಣಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಕರ್ನಾಟಕ ವಿಧಾನಸಭೆಯಲ್ಲಿ ಸಂತೇಮರಹಳ್ಳಿ ಕ್ಷೇತ್ರವನ್ನು ಪ್ರತಿನಿಧಿಸಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರು ರಾಜ್ಯಸಭೆಗೆ ಕರ್ನಾಟಕದಿಂದ ಸದಸ್ಯರಾಗಿದ್ದರು ಮತ್ತು 1977ರಲ್ಲಿ ಲೋಕಸಭೆಗೆ ಚಾಮರಾಜನಗರ ಕ್ಷೇತ್ರದಿಂದ ಆಯ್ಕೆಯಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "ರಾಚಯ್ಯ ಅವರು ಕೇರಳ ಮತ್ತು ಹಿಮಾಚಲ ಪ್ರದೇಶ ರಾಜ್ಯಗಳ ರಾಜ್ಯಪಾಲರಾಗಿಯೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಅವರು ಪ್ರಮುಖ ದಲಿತ ನಾಯಕರಾಗಿದ್ದು, ಎಸ್. ನಿಜಲಿಂಗಪ್ಪ, ಬಿ. ಡಿ. ಜತ್ತಿ, ದೇವರಾಜ ಅರಸು, ವೀರೇಂದ್ರ ಪಾಟೀಲ್, ರಾಮಕೃಷ್ಣ ಹೆಗಡೆ ಮತ್ತು ಎಸ್. ಆರ್. ಬೊಮ್ಮಾಯಿ ಅವರ ಸಚಿವ ಸಂಪುಟಗಳಲ್ಲಿ ಸದಸ್ಯರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "### ಪ್ರಾರಂಭಿಕ ಜೀವನ\n" +
                    "\n" +
                    "ರಾಚಯ್ಯ ಅವರು 1922ರಲ್ಲಿ ಚಾಮರಾಜನಗರದಲ್ಲಿ ಜನಿಸಿದರು. ವೃತ್ತಿಯಿಂದ ಅವರು ವಕೀಲರಾಗಿದ್ದರು. ಅವರ ಅಳಿಯರಲ್ಲಿ ಒಬ್ಬರಾದ ಬಿ. ಬಿ. ನಿಂಗಯ್ಯ ಅವರು ಜೆ. ಎಚ್. ಪಟೇಲ್ ನೇತೃತ್ವದ ಸರ್ಕಾರದಲ್ಲಿ ಸಚಿವರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "ರಾಚಯ್ಯ ಅವರು 2000ರಲ್ಲಿ 77ನೇ ವಯಸ್ಸಿನಲ್ಲಿ ನಿಧನರಾದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ರಾಜ್ಯಕ್ಕೆ ಸಲ್ಲಿಸಿದ ಸೇವೆಯ ಗೌರವಾರ್ಥವಾಗಿ, ಮೈಸೂರು ನಗರದ ಬಿ. ರಾಚಯ್ಯ ವೃತ್ತಕ್ಕೆ ಅವರ ಹೆಸರನ್ನು ಇಡಲಾಗಿದೆ.\n"),
        h("Chamarajanagar", "ಚಾಮರಾಜನಗರ", "G. P. Rajarathnam", "ಜಿ. ಪಿ. ರಾಜರತ್ನಂ",
            "G. P. Rajarathnam (5 December 1909 – 1979), also known by his pen name Bhramara, was a famous Kannada writer, poet, lyricist, translator, editor, and children’s literature author. He was born in Gundlupet in present-day Chamarajanagar district of Karnataka.\n" + "\n" +
                    "Rajarathnam is especially remembered for his simple, musical, and child-friendly Kannada writing. He understood the imagination and language of children and wrote poems that were easy to sing, remember, and enjoy. His children’s poems such as Nayi Mari Nayi Mari, Bannada Thagadina Thuthoori, and Ondu-Eradu became very popular among Kannada readers.\n" + "\n" +
                    "He wrote in many genres including poetry, stories, biography, criticism, devotional writing, interpretation, and children’s literature. His notable works include Rathnana Padagalu and Nagana Padagalu. He also wrote about Buddhism, Jainism, and Islam, showing his broad interest in culture, religion, and human values.\n" + "\n" +
                    "Rajarathnam contributed greatly to Kannada literature by making language simple and attractive for children. He was also connected with later Kannada literary personalities and is remembered as a writer who brought music, rhythm, humour, and affection into children’s writing.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "G. P. Rajarathnam remains one of the most loved children’s writers in Kannada. A road in Bengaluru has been named after him in recognition of his literary contribution. His poems continue to be read, sung, and remembered by children and teachers.\n",
            "ಜಿ. ಪಿ. ರಾಜರತ್ನಂ (5 ಡಿಸೆಂಬರ್ 1909 – 1979), ಭ್ರಮರ ಎಂಬ ಕಾವ್ಯನಾಮದಿಂದಲೂ ಪ್ರಸಿದ್ಧರಾದವರು, ಕನ್ನಡದ ಪ್ರಸಿದ್ಧ ಬರಹಗಾರ, ಕವಿ, ಗೀತರಚನೆಕಾರ, ಅನುವಾದಕ, ಸಂಪಾದಕ ಮತ್ತು ಮಕ್ಕಳ ಸಾಹಿತ್ಯಗಾರರಾಗಿದ್ದರು. ಅವರು ಇಂದಿನ ಕರ್ನಾಟಕದ ಚಾಮರಾಜನಗರ ಜಿಲ್ಲೆಯ ಗುಂಡ್ಲುಪೇಟೆಯಲ್ಲಿ ಜನಿಸಿದರು.\n" +
                    "\n" +
                    "ರಾಜರತ್ನಂ ಅವರು ಸರಳ, ಸಂಗೀತಮಯ ಮತ್ತು ಮಕ್ಕಳಿಗೆ ಹತ್ತಿರವಾದ ಕನ್ನಡ ಬರವಣಿಗೆಗಾಗಿ ವಿಶೇಷವಾಗಿ ನೆನಪಾಗುತ್ತಾರೆ. ಅವರು ಮಕ್ಕಳ ಕಲ್ಪನೆ ಮತ್ತು ಭಾಷೆಯನ್ನು ಚೆನ್ನಾಗಿ ಅರ್ಥಮಾಡಿಕೊಂಡು ಹಾಡಲು, ನೆನಪಿಡಲು ಮತ್ತು ಆನಂದಿಸಲು ಸುಲಭವಾದ ಕವನಗಳನ್ನು ರಚಿಸಿದರು. ನಾಯಿ ಮರಿ ನಾಯಿ ಮರಿ, ಬಣ್ಣದ ತಗಡಿನ ತುತ್ತೂರಿ, ಒಂದು-ಎರಡು ಮುಂತಾದ ಮಕ್ಕಳ ಕವನಗಳು ಕನ್ನಡ ಓದುಗರಲ್ಲಿ ಬಹಳ ಜನಪ್ರಿಯವಾದವು.\n" +
                    "\n" +
                    "ಅವರು ಕಾವ್ಯ, ಕಥೆ, ಜೀವನಚರಿತ್ರೆ, ವಿಮರ್ಶೆ, ಭಕ್ತಿ ಬರಹ, ವ್ಯಾಖ್ಯಾನ ಮತ್ತು ಮಕ್ಕಳ ಸಾಹಿತ್ಯ ಸೇರಿದಂತೆ ಅನೇಕ ಪ್ರಕಾರಗಳಲ್ಲಿ ಬರೆದರು. ರತ್ನನ ಪದಗಳು ಮತ್ತು ನಾಗನ ಪದಗಳು ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳಲ್ಲಿ ಸೇರಿವೆ. ಅವರು ಬೌದ್ಧ ಧರ್ಮ, ಜೈನ ಧರ್ಮ ಮತ್ತು ಇಸ್ಲಾಂ ಧರ್ಮಗಳ ಕುರಿತೂ ಬರೆದಿದ್ದು, ಸಂಸ್ಕೃತಿ, ಧರ್ಮ ಮತ್ತು ಮಾನವ ಮೌಲ್ಯಗಳ ಬಗ್ಗೆ ಅವರ ವಿಶಾಲ ಆಸಕ್ತಿಯನ್ನು ತೋರಿಸುತ್ತದೆ.\n" +
                    "\n" +
                    "ಮಕ್ಕಳಿಗಾಗಿ ಕನ್ನಡ ಭಾಷೆಯನ್ನು ಸರಳ ಮತ್ತು ಆಕರ್ಷಕವಾಗಿಸುವ ಮೂಲಕ ರಾಜರತ್ನಂ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯಕ್ಕೆ ಮಹತ್ವದ ಕೊಡುಗೆ ನೀಡಿದರು. ಅವರು ಮುಂದಿನ ಕನ್ನಡ ಸಾಹಿತ್ಯ ವ್ಯಕ್ತಿಗಳೊಂದಿಗೆಲೂ ಸಂಬಂಧ ಹೊಂದಿದ್ದರು ಮತ್ತು ಮಕ್ಕಳ ಸಾಹಿತ್ಯಕ್ಕೆ ಸಂಗೀತ, ಲಯ, ಹಾಸ್ಯ ಮತ್ತು ಮಮತೆಯನ್ನು ತಂದ ಬರಹಗಾರರಾಗಿ ನೆನಪಾಗುತ್ತಾರೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಜಿ. ಪಿ. ರಾಜರತ್ನಂ ಅವರು ಕನ್ನಡದ ಅತ್ಯಂತ ಪ್ರೀತಿಪಾತ್ರ ಮಕ್ಕಳ ಸಾಹಿತ್ಯಗಾರರಲ್ಲಿ ಒಬ್ಬರು. ಅವರ ಸಾಹಿತ್ಯ ಕೊಡುಗೆಯ ಗೌರವಾರ್ಥವಾಗಿ ಬೆಂಗಳೂರಿನಲ್ಲಿ ಒಂದು ರಸ್ತೆಗೆ ಅವರ ಹೆಸರಿಡಲಾಗಿದೆ. ಅವರ ಕವನಗಳು ಇಂದಿಗೂ ಮಕ್ಕಳು ಮತ್ತು ಶಿಕ್ಷಕರಿಂದ ಓದಲ್ಪಟ್ಟು, ಹಾಡಲ್ಪಟ್ಟು, ನೆನಪಾಗುತ್ತಿವೆ.\n"
        ),

        h("Chamarajanagar", "ಚಾಮರಾಜನಗರ", "Mudnakudu Chinnaswamy", "ಮೂಡ್ನಾಕುಡು ಚಿನ್ನಸ್ವಾಮಿ",
            "Mudnakudu Chinnaswamy (born 22 September 1954) is a well-known Kannada poet, playwright, essayist, and Dalit writer from Mudnakudu village in Chamarajanagar district of Karnataka. He is regarded as one of the important modern voices in Kannada literature.\n" + "\n" +
                    "He has written in several literary forms including poetry, essays, plays, short stories, and cultural criticism. His writings often focus on social justice, caste discrimination, human dignity, equality, Buddhist thought, and the experiences of marginalized communities. His style is known for strong social awareness combined with poetic sensitivity.\n" + "\n" +
                    "Mudnakudu Chinnaswamy has authored many books and his works have been translated into several Indian and foreign languages. His poetry has reached readers outside Karnataka as well, and selected poems have been translated into English and Spanish. The English collection Before It Rains Again brought his poems to a wider international audience.\n" + "\n" +
                    "He received the Karnataka Sahitya Academy Award in 2009, the Karnataka Rajyotsava Award in 2014, and the Sahitya Akademi Award in 2022 for Bahutvada Bhaaratha Mattu Bouddha Thaatvikate. Apart from literature, he has also been associated with theatre, social work, and cultural activities.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "Mudnakudu Chinnaswamy is remembered as a powerful Dalit literary voice from Chamarajanagar. His writings encourage readers to think about equality, justice, compassion, and social change. He continues to inspire young writers and socially conscious readers.\n",
            "ಮೂಡ್ನಾಕುಡು ಚಿನ್ನಸ್ವಾಮಿ (ಜನನ 22 ಸೆಪ್ಟೆಂಬರ್ 1954) ಅವರು ಕರ್ನಾಟಕದ ಚಾಮರಾಜನಗರ ಜಿಲ್ಲೆಯ ಮೂಡ್ನಾಕುಡು ಗ್ರಾಮದ ಪ್ರಸಿದ್ಧ ಕನ್ನಡ ಕವಿ, ನಾಟಕಕಾರ, ಪ್ರಬಂಧಕಾರ ಮತ್ತು ದಲಿತ ಬರಹಗಾರರು. ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಪ್ರಮುಖ ಧ್ವನಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರು ಪರಿಗಣಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "ಅವರು ಕಾವ್ಯ, ಪ್ರಬಂಧ, ನಾಟಕ, ಕಥೆ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ವಿಮರ್ಶೆ ಸೇರಿದಂತೆ ಹಲವು ಸಾಹಿತ್ಯ ಪ್ರಕಾರಗಳಲ್ಲಿ ಬರೆದಿದ್ದಾರೆ. ಅವರ ಬರಹಗಳು ಸಾಮಾಜಿಕ ನ್ಯಾಯ, ಜಾತಿ ಬೇಧ, ಮಾನವ ಘನತೆ, ಸಮಾನತೆ, ಬೌದ್ಧ ಚಿಂತನೆ ಮತ್ತು ಅಂಚಿನ ಸಮುದಾಯಗಳ ಅನುಭವಗಳ ಮೇಲೆ ಕೇಂದ್ರೀಕರಿಸುತ್ತವೆ. ಬಲವಾದ ಸಾಮಾಜಿಕ ಜಾಗೃತಿಯೊಂದಿಗೆ ಕಾವ್ಯಾತ್ಮಕ ಸಂವೇದನೆಯನ್ನು ಹೊಂದಿರುವುದು ಅವರ ಶೈಲಿಯ ವಿಶೇಷತೆ.\n" +
                    "\n" +
                    "ಮೂಡ್ನಾಕುಡು ಚಿನ್ನಸ್ವಾಮಿ ಅವರು ಅನೇಕ ಪುಸ್ತಕಗಳನ್ನು ರಚಿಸಿದ್ದಾರೆ ಮತ್ತು ಅವರ ಕೃತಿಗಳು ಹಲವು ಭಾರತೀಯ ಹಾಗೂ ವಿದೇಶಿ ಭಾಷೆಗಳಿಗೆ ಅನುವಾದಗೊಂಡಿವೆ. ಅವರ ಕಾವ್ಯ ಕರ್ನಾಟಕದ ಹೊರಗಿನ ಓದುಗರಿಗೂ ತಲುಪಿದೆ. ಆಯ್ದ ಕವನಗಳು ಇಂಗ್ಲಿಷ್ ಮತ್ತು ಸ್ಪ್ಯಾನಿಷ್ ಭಾಷೆಗಳಿಗೆ ಅನುವಾದಗೊಂಡಿವೆ. Before It Rains Again ಎಂಬ ಇಂಗ್ಲಿಷ್ ಸಂಕಲನವು ಅವರ ಕವನಗಳನ್ನು ಅಂತರರಾಷ್ಟ್ರೀಯ ಓದುಗರಿಗೂ ಪರಿಚಯಿಸಿತು.\n" +
                    "\n" +
                    "ಅವರಿಗೆ 2009ರಲ್ಲಿ ಕರ್ನಾಟಕ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, 2014ರಲ್ಲಿ ಕರ್ನಾಟಕ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ ಮತ್ತು 2022ರಲ್ಲಿ ಬಹುತ್ವದ ಭಾರತ ಮತ್ತು ಬೌದ್ಧ ತಾತ್ವಿಕತೆ ಕೃತಿಗೆ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿದೆ. ಸಾಹಿತ್ಯದ ಜೊತೆಗೆ ಅವರು ರಂಗಭೂಮಿ, ಸಮಾಜಸೇವೆ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಚಟುವಟಿಕೆಗಳಲ್ಲಿಯೂ ತೊಡಗಿಸಿಕೊಂಡಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಮೂಡ್ನಾಕುಡು ಚಿನ್ನಸ್ವಾಮಿ ಅವರು ಚಾಮರಾಜನಗರದಿಂದ ಹೊರಹೊಮ್ಮಿದ ಶಕ್ತಿಯುತ ದಲಿತ ಸಾಹಿತ್ಯ ಧ್ವನಿಯಾಗಿ ನೆನಪಾಗುತ್ತಾರೆ. ಅವರ ಬರಹಗಳು ಸಮಾನತೆ, ನ್ಯಾಯ, ಕರುಣೆ ಮತ್ತು ಸಾಮಾಜಿಕ ಬದಲಾವಣೆಯ ಬಗ್ಗೆ ಓದುಗರನ್ನು ಯೋಚಿಸಲು ಪ್ರೇರೇಪಿಸುತ್ತವೆ. ಯುವ ಬರಹಗಾರರು ಮತ್ತು ಸಾಮಾಜಿಕ ಜಾಗೃತಿಯ ಓದುಗರಿಗೆ ಅವರು ಇಂದಿಗೂ ಪ್ರೇರಣೆಯಾಗಿದ್ದಾರೆ.\n"
        ),

        h("Chikkaballapura", "ಚಿಕ್ಕಬಳ್ಳಾಪುರ", "Sir M. Visvesvaraya", "ಸರ್ ಎಂ. ವಿಶ್ವೇಶ್ವರಯ್ಯ",
            "Sir Mokshagundam Visvesvaraya (15 September 1861 – 14 April 1962), popularly known as Sir M. V., was one of India’s greatest civil engineers, administrators, and statesmen. He was born in Muddenahalli, which is now in Chikkaballapura district of Karnataka. He completed his early education in Bangalore and later studied civil engineering at the College of Engineering, Pune.\n" + "\n" +
                    "Visvesvaraya began his career in the Public Works Department of the Bombay Presidency. He became famous for his engineering skill, discipline, and problem-solving ability. One of his major technical achievements was the design of automatic water floodgates, first installed at Khadakvasla Dam near Pune. This system helped increase water storage without damaging the dam and was later used in other places.\n" + "\n" +
                    "He also worked on irrigation and water supply projects in different parts of India. He gave important flood protection suggestions for Hyderabad after the Musi river floods and contributed to protecting Visakhapatnam port from sea erosion. His engineering work showed how scientific planning could solve real public problems.\n" + "\n" +
                    "Visvesvaraya later served as the 19th Dewan of Mysore from 1912 to 1918 under Maharaja Krishnaraja Wadiyar IV. During this period, he played a major role in modernizing Mysore. He supported industries, education, banking, engineering, public works, and economic planning. He was connected with the development of institutions and industries such as Mysore Soap Factory, Mysore Iron and Steel Works at Bhadravathi, State Bank of Mysore, and Government Engineering College in Bangalore, which later became University Visvesvaraya College of Engineering.\n" + "\n" +
                    "He is strongly associated with the Krishna Raja Sagara Dam across the Kaveri river, which became one of the most important water and irrigation projects of Mysore. The dam helped provide water for agriculture and drinking purposes and became a symbol of modern engineering in Karnataka.\n" + "\n" +
                    "For his public service, Visvesvaraya was knighted by the British and later awarded the Bharat Ratna in 1955, India’s highest civilian honour. His birthday, 15 September, is celebrated as Engineers’ Day in India. He is often remembered as the “Maker of Modern Mysore” because of his contribution to engineering, industry, education, and administration.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "The Visvesvaraya National Memorial at Muddenahalli preserves his awards, personal belongings, books, spectacles, and models related to his engineering works. His life continues to inspire engineers, students, administrators, and citizens to value discipline, knowledge, hard work, and service to society.\n",
            "ಸರ್ ಮೋಕ್ಷಗುಂಡಂ ವಿಶ್ವೇಶ್ವರಯ್ಯ (15 ಸೆಪ್ಟೆಂಬರ್ 1861 – 14 ಏಪ್ರಿಲ್ 1962), ಸರ್ ಎಂ. ವಿ. ಎಂದು ಪ್ರಸಿದ್ಧರಾದವರು, ಭಾರತದ ಮಹಾನ್ ಸಿವಿಲ್ ಇಂಜಿನಿಯರ್, ಆಡಳಿತಗಾರ ಮತ್ತು ರಾಜ್ಯತಜ್ಞರಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಇಂದಿನ ಕರ್ನಾಟಕದ ಚಿಕ್ಕಬಳ್ಳಾಪುರ ಜಿಲ್ಲೆಯ ಮುದ್ದೇನಹಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿದರು. ಅವರು ತಮ್ಮ ಪ್ರಾಥಮಿಕ ಶಿಕ್ಷಣವನ್ನು ಬೆಂಗಳೂರಿನಲ್ಲಿ ಪಡೆದು ನಂತರ ಪುಣೆಯ ಇಂಜಿನಿಯರಿಂಗ್ ಕಾಲೇಜಿನಲ್ಲಿ ಸಿವಿಲ್ ಇಂಜಿನಿಯರಿಂಗ್ ಅಭ್ಯಾಸ ಮಾಡಿದರು.\n" +
                    "\n" +
                    "ವಿಶ್ವೇಶ್ವರಯ್ಯ ಅವರು ಬಾಂಬೆ ಪ್ರೆಸಿಡೆನ್ಸಿಯ ಸಾರ್ವಜನಿಕ ಕಾಮಗಾರಿಗಳ ಇಲಾಖೆಯಲ್ಲಿ ತಮ್ಮ ವೃತ್ತಿಜೀವನವನ್ನು ಪ್ರಾರಂಭಿಸಿದರು. ತಮ್ಮ ಇಂಜಿನಿಯರಿಂಗ್ ನೈಪುಣ್ಯ, ಶಿಸ್ತು ಮತ್ತು ಸಮಸ್ಯೆ ಪರಿಹಾರ ಸಾಮರ್ಥ್ಯದಿಂದ ಅವರು ಪ್ರಸಿದ್ಧರಾದರು. ಅವರ ಪ್ರಮುಖ ತಾಂತ್ರಿಕ ಸಾಧನೆಗಳಲ್ಲಿ ಒಂದಾಗಿದೆ ಸ್ವಯಂಚಾಲಿತ ನೀರಿನ ಗೇಟ್‌ಗಳ ವಿನ್ಯಾಸ. ಇವುಗಳನ್ನು ಮೊದಲಿಗೆ ಪುಣೆಯ ಸಮೀಪದ ಖಡಕ್ವಾಸ್ಲಾ ಅಣೆಕಟ್ಟಿನಲ್ಲಿ ಅಳವಡಿಸಲಾಯಿತು. ಈ ವ್ಯವಸ್ಥೆಯಿಂದ ಅಣೆಕಟ್ಟಿಗೆ ಹಾನಿಯಾಗದೆ ಹೆಚ್ಚು ನೀರು ಸಂಗ್ರಹಿಸಲು ಸಾಧ್ಯವಾಯಿತು.\n" +
                    "\n" +
                    "ಅವರು ಭಾರತದ ಹಲವು ಭಾಗಗಳಲ್ಲಿ ನೀರಾವರಿ ಮತ್ತು ನೀರು ಪೂರೈಕೆ ಯೋಜನೆಗಳಲ್ಲೂ ಕೆಲಸ ಮಾಡಿದರು. ಮೂಸಿ ನದಿ ಪ್ರವಾಹದ ನಂತರ ಹೈದರಾಬಾದ್ ನಗರದ ಪ್ರವಾಹ ನಿಯಂತ್ರಣಕ್ಕೆ ಮಹತ್ವದ ಸಲಹೆಗಳನ್ನು ನೀಡಿದರು. ವಿಶಾಖಪಟ್ಟಣಂ ಬಂದರನ್ನು ಸಮುದ್ರದ ಕೊರೆತದಿಂದ ರಕ್ಷಿಸುವ ಕಾರ್ಯದಲ್ಲೂ ಅವರು ಪಾತ್ರವಹಿಸಿದರು. ಅವರ ಇಂಜಿನಿಯರಿಂಗ್ ಕೆಲಸಗಳು ವೈಜ್ಞಾನಿಕ ಯೋಜನೆಯಿಂದ ಸಾರ್ವಜನಿಕ ಸಮಸ್ಯೆಗಳನ್ನು ಹೇಗೆ ಪರಿಹರಿಸಬಹುದು ಎಂಬುದನ್ನು ತೋರಿಸಿತು.\n" +
                    "\n" +
                    "ನಂತರ ವಿಶ್ವೇಶ್ವರಯ್ಯ ಅವರು ಮಹಾರಾಜ ಕೃಷ್ಣರಾಜ ವಾಡಿಯಾರ್ ನಾಲ್ಕನೇ ಅವರ ಕಾಲದಲ್ಲಿ 1912ರಿಂದ 1918ರವರೆಗೆ ಮೈಸೂರಿನ 19ನೇ ದಿವಾನರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಈ ಅವಧಿಯಲ್ಲಿ ಮೈಸೂರನ್ನು ಆಧುನಿಕ ರಾಜ್ಯವನ್ನಾಗಿ ರೂಪಿಸುವಲ್ಲಿ ಅವರು ಮಹತ್ವದ ಪಾತ್ರವಹಿಸಿದರು. ಕೈಗಾರಿಕೆ, ಶಿಕ್ಷಣ, ಬ್ಯಾಂಕಿಂಗ್, ಇಂಜಿನಿಯರಿಂಗ್, ಸಾರ್ವಜನಿಕ ಕಾಮಗಾರಿಗಳು ಮತ್ತು ಆರ್ಥಿಕ ಯೋಜನೆಗಳಿಗೆ ಅವರು ಉತ್ತೇಜನ ನೀಡಿದರು. ಮೈಸೂರು ಸಾಬೂನು ಕಾರ್ಖಾನೆ, ಭದ್ರಾವತಿಯ ಮೈಸೂರು ಐರನ್ ಅಂಡ್ ಸ್ಟೀಲ್ ವರ್ಕ್ಸ್, ಸ್ಟೇಟ್ ಬ್ಯಾಂಕ್ ಆಫ್ ಮೈಸೂರು ಮತ್ತು ಬೆಂಗಳೂರಿನ ಗವರ್ನ್ಮೆಂಟ್ ಇಂಜಿನಿಯರಿಂಗ್ ಕಾಲೇಜು, ನಂತರದ ವಿಶ್ವೇಶ್ವರಯ್ಯ ಇಂಜಿನಿಯರಿಂಗ್ ಕಾಲೇಜು, ಮುಂತಾದ ಸಂಸ್ಥೆಗಳ ಅಭಿವೃದ್ಧಿಗೆ ಅವರು ಸಂಬಂಧ ಹೊಂದಿದ್ದರು.\n" +
                    "\n" +
                    "ಕಾವೇರಿ ನದಿಯ ಮೇಲಿನ ಕೃಷ್ಣರಾಜ ಸಾಗರ ಅಣೆಕಟ್ಟಿನೊಂದಿಗೆ ಅವರ ಹೆಸರು ಗಾಢವಾಗಿ ಸಂಬಂಧಿಸಿದೆ. ಈ ಅಣೆಕಟ್ಟು ಮೈಸೂರಿನ ಪ್ರಮುಖ ನೀರು ಮತ್ತು ನೀರಾವರಿ ಯೋಜನೆಯಾಗಿ ಬೆಳೆದಿತು. ಕೃಷಿ, ಕುಡಿಯುವ ನೀರು ಮತ್ತು ಅಭಿವೃದ್ಧಿಗೆ ಇದು ಸಹಾಯಮಾಡಿ ಕರ್ನಾಟಕದ ಆಧುನಿಕ ಇಂಜಿನಿಯರಿಂಗ್ ಸಂಕೇತವಾಗಿ ಪ್ರಸಿದ್ಧಿಯಾಯಿತು.\n" +
                    "\n" +
                    "ಅವರ ಸಾರ್ವಜನಿಕ ಸೇವೆಗೆ ಬ್ರಿಟಿಷರು ಅವರಿಗೆ ನೈಟ್ ಪದವಿ ನೀಡಿದರು. ಸ್ವಾತಂತ್ರ್ಯದ ನಂತರ 1955ರಲ್ಲಿ ಭಾರತದ ಅತ್ಯುನ್ನತ ನಾಗರಿಕ ಪ್ರಶಸ್ತಿಯಾದ ಭಾರತ ರತ್ನವನ್ನು ಪ್ರದಾನ ಮಾಡಲಾಯಿತು. ಅವರ ಜನ್ಮದಿನವಾದ ಸೆಪ್ಟೆಂಬರ್ 15 ಅನ್ನು ಭಾರತದಲ್ಲಿ ಇಂಜಿನಿಯರ್ಸ್ ಡೇ ಎಂದು ಆಚರಿಸಲಾಗುತ್ತದೆ. ಇಂಜಿನಿಯರಿಂಗ್, ಕೈಗಾರಿಕೆ, ಶಿಕ್ಷಣ ಮತ್ತು ಆಡಳಿತಕ್ಕೆ ನೀಡಿದ ಕೊಡುಗೆಯಿಂದಾಗಿ ಅವರನ್ನು “ಆಧುನಿಕ ಮೈಸೂರಿನ ನಿರ್ಮಾತೃ” ಎಂದು ನೆನಪಿಸಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಮುದ್ದೇನಹಳ್ಳಿಯ ವಿಶ್ವೇಶ್ವರಯ್ಯ ರಾಷ್ಟ್ರೀಯ ಸ್ಮಾರಕದಲ್ಲಿ ಅವರ ಪ್ರಶಸ್ತಿಗಳು, ವೈಯಕ್ತಿಕ ವಸ್ತುಗಳು, ಪುಸ್ತಕಗಳು, ಕನ್ನಡಕ ಮತ್ತು ಇಂಜಿನಿಯರಿಂಗ್ ಕಾರ್ಯಗಳಿಗೆ ಸಂಬಂಧಿಸಿದ ಮಾದರಿಗಳನ್ನು ಸಂರಕ್ಷಿಸಲಾಗಿದೆ. ಅವರ ಜೀವನವು ಇಂದಿಗೂ ಇಂಜಿನಿಯರ್‌ಗಳು, ವಿದ್ಯಾರ್ಥಿಗಳು, ಆಡಳಿತಗಾರರು ಮತ್ತು ನಾಗರಿಕರಿಗೆ ಶಿಸ್ತು, ಜ್ಞಾನ, ಪರಿಶ್ರಮ ಮತ್ತು ಸಮಾಜಸೇವೆಯ ಮೌಲ್ಯಗಳನ್ನು ಕಲಿಸುತ್ತದೆ.\n"
        ),

        h("Chikkaballapura", "ಚಿಕ್ಕಬಳ್ಳಾಪುರ", "H. Narasimhaiah", "ಎಚ್. ನರಸಿಂಹಯ್ಯ",
            "Hosur Narasimhaiah (6 June 1920 – 31 January 2005), popularly known as H. Narasimhaiah or H. N., was an Indian physicist, educationist, freedom fighter, writer, and rationalist from Karnataka. He was born at Hosur in Gowribidanur Taluk, which is now associated with Chikkaballapura district.\n" + "\n" +
                    "He came from a simple rural background and developed a deep interest in education from a young age. He studied science and later earned a Ph.D. in nuclear physics from Ohio State University in the United States. His academic journey made him an important science educator in Karnataka.\n" + "\n" +
                    "H. Narasimhaiah served as Principal of National College, Basavanagudi, from 1961. He later became the Vice-Chancellor of Bangalore University in 1972 and served until 1977. During his time as Vice-Chancellor, he encouraged academic improvement, scientific thinking, and new educational programmes. He also served in the Karnataka Legislative Council.\n" + "\n" +
                    "Apart from being an educationist, H. Narasimhaiah was well known as a rationalist and promoter of scientific temper. He encouraged people to question blind beliefs and understand the world through evidence and reasoning. While serving as Vice-Chancellor, he formed a committee to investigate miracles and verifiable superstitions. He also challenged claims of black magic and other irrational practices.\n" + "\n" +
                    "He founded the Bangalore Science Forum, which became an important platform for spreading science awareness among students and the public. Through lectures, discussions, and public programmes, he helped bring science closer to ordinary people. He believed that education should develop courage, discipline, curiosity, and social responsibility.\n" + "\n" +
                    "H. Narasimhaiah was also involved in the Indian freedom movement and was respected for his simple lifestyle. He received the Padma Bhushan in 1984 for his contribution to education and public life. His autobiography and speeches reflect his commitment to truth, science, and social reform.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "H. Narasimhaiah remains an inspiration for students, teachers, rationalists, and social workers. His life teaches the importance of scientific temper, honesty, questioning attitude, and service to society. He is remembered as one of Karnataka’s most respected educationists and thinkers.\n",
            "ಹೊಸೂರು ನರಸಿಂಹಯ್ಯ (6 ಜೂನ್ 1920 – 31 ಜನವರಿ 2005), ಎಚ್. ನರಸಿಂಹಯ್ಯ ಅಥವಾ ಎಚ್. ಎನ್. ಎಂದು ಪ್ರಸಿದ್ಧರಾದವರು, ಕರ್ನಾಟಕದ ಭೌತಶಾಸ್ತ್ರಜ್ಞ, ಶಿಕ್ಷಣತಜ್ಞ, ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ಬರಹಗಾರ ಮತ್ತು ತಾರ್ಕಿಕ ಚಿಂತಕರಾಗಿದ್ದರು. ಅವರು ಗೌರಿಬಿದನೂರು ತಾಲ್ಲೂಕಿನ ಹೊಸೂರಿನಲ್ಲಿ ಜನಿಸಿದರು, ಇದು ಇಂದಿನ ಚಿಕ್ಕಬಳ್ಳಾಪುರ ಜಿಲ್ಲೆಯೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದೆ.\n" +
                    "\n" +
                    "ಅವರು ಸರಳ ಗ್ರಾಮೀಣ ಹಿನ್ನೆಲೆಯಿಂದ ಬಂದವರು ಮತ್ತು ಬಾಲ್ಯದಿಂದಲೇ ಶಿಕ್ಷಣದ ಬಗ್ಗೆ ಆಳವಾದ ಆಸಕ್ತಿ ಬೆಳೆಸಿಕೊಂಡರು. ಅವರು ವಿಜ್ಞಾನವನ್ನು ಅಭ್ಯಾಸ ಮಾಡಿ ನಂತರ ಅಮೆರಿಕದ ಓಹಿಯೋ ಸ್ಟೇಟ್ ವಿಶ್ವವಿದ್ಯಾಲಯದಿಂದ ಅಣು ಭೌತಶಾಸ್ತ್ರದಲ್ಲಿ ಪಿಎಚ್.ಡಿ. ಪದವಿ ಪಡೆದರು. ಅವರ ಶೈಕ್ಷಣಿಕ ಪ್ರಯಾಣವು ಅವರನ್ನು ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ವಿಜ್ಞಾನ ಶಿಕ್ಷಣತಜ್ಞರನ್ನಾಗಿ ಮಾಡಿತು.\n" +
                    "\n" +
                    "ಎಚ್. ನರಸಿಂಹಯ್ಯ ಅವರು 1961ರಿಂದ ಬೆಂಗಳೂರಿನ ಬಸವನಗುಡಿಯ ನ್ಯಾಷನಲ್ ಕಾಲೇಜಿನ ಪ್ರಾಂಶುಪಾಲರಾಗಿದ್ದರು. ನಂತರ 1972ರಲ್ಲಿ ಬೆಂಗಳೂರು ವಿಶ್ವವಿದ್ಯಾಲಯದ ಕುಲಪತಿಯಾಗಿ ನೇಮಕಗೊಂಡು 1977ರವರೆಗೆ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಕುಲಪತಿಯಾಗಿ ಅವರು ಶೈಕ್ಷಣಿಕ ಸುಧಾರಣೆ, ವೈಜ್ಞಾನಿಕ ಚಿಂತನೆ ಮತ್ತು ಹೊಸ ಶೈಕ್ಷಣಿಕ ಕಾರ್ಯಕ್ರಮಗಳನ್ನು ಉತ್ತೇಜಿಸಿದರು. ಅವರು ಕರ್ನಾಟಕ ವಿಧಾನ ಪರಿಷತ್ತಿನ ಸದಸ್ಯರಾಗಿಯೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು.\n" +
                    "\n" +
                    "ಶಿಕ್ಷಣತಜ್ಞರಾಗಿದ್ದಷ್ಟೇ ಅಲ್ಲದೆ, ಎಚ್. ನರಸಿಂಹಯ್ಯ ಅವರು ತಾರ್ಕಿಕ ಚಿಂತಕ ಮತ್ತು ವೈಜ್ಞಾನಿಕ ಮನೋಭಾವದ ಪ್ರಚಾರಕರಾಗಿ ಪ್ರಸಿದ್ಧರಾಗಿದ್ದರು. ಜನರು ಮೂಢನಂಬಿಕೆಗಳನ್ನು ಪ್ರಶ್ನಿಸಿ ಸಾಕ್ಷ್ಯ ಮತ್ತು ತರ್ಕದ ಆಧಾರದಲ್ಲಿ ಜಗತ್ತನ್ನು ಅರ್ಥಮಾಡಿಕೊಳ್ಳಬೇಕು ಎಂದು ಅವರು ಪ್ರೋತ್ಸಾಹಿಸಿದರು. ಕುಲಪತಿಯಾಗಿದ್ದಾಗ ಅವರು ಅದ್ಭುತಗಳು ಮತ್ತು ಪರಿಶೀಲಿಸಬಹುದಾದ ಮೂಢನಂಬಿಕೆಗಳನ್ನು ತನಿಖೆ ಮಾಡಲು ಸಮಿತಿಯನ್ನು ರಚಿಸಿದರು. ಬಾಣಾಮತಿ ಮತ್ತು ಇತರ ಅತಾರ್ಕಿಕ ಆಚರಣೆಗಳ ಬಗ್ಗೆ ಜನರಲ್ಲಿ ಜಾಗೃತಿ ಮೂಡಿಸಿದರು.\n" +
                    "\n" +
                    "ಅವರು ಬೆಂಗಳೂರು ಸೈನ್ಸ್ ಫೋರಂ ಅನ್ನು ಸ್ಥಾಪಿಸಿದರು. ಇದು ವಿದ್ಯಾರ್ಥಿಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕರಲ್ಲಿ ವಿಜ್ಞಾನ ಜಾಗೃತಿ ಹರಡುವ ಪ್ರಮುಖ ವೇದಿಕೆಯಾಗಿತು. ಉಪನ್ಯಾಸಗಳು, ಚರ್ಚೆಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಕಾರ್ಯಕ್ರಮಗಳ ಮೂಲಕ ಅವರು ವಿಜ್ಞಾನವನ್ನು ಸಾಮಾನ್ಯ ಜನರ ಹತ್ತಿರಕ್ಕೆ ತಂದರು. ಶಿಕ್ಷಣವು ಧೈರ್ಯ, ಶಿಸ್ತು, ಕುತೂಹಲ ಮತ್ತು ಸಾಮಾಜಿಕ ಹೊಣೆಗಾರಿಕೆಯನ್ನು ಬೆಳೆಸಬೇಕು ಎಂಬುದು ಅವರ ನಂಬಿಕೆ.\n" +
                    "\n" +
                    "ಎಚ್. ನರಸಿಂಹಯ್ಯ ಅವರು ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಲ್ಲೂ ಭಾಗವಹಿಸಿದ್ದರು ಮತ್ತು ತಮ್ಮ ಸರಳ ಜೀವನಶೈಲಿಗಾಗಿ ಗೌರವಿಸಲ್ಪಟ್ಟರು. ಶಿಕ್ಷಣ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಜೀವನಕ್ಕೆ ನೀಡಿದ ಕೊಡುಗೆಯಿಗಾಗಿ ಅವರಿಗೆ 1984ರಲ್ಲಿ ಪದ್ಮಭೂಷಣ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು. ಅವರ ಆತ್ಮಕತೆ ಮತ್ತು ಭಾಷಣಗಳು ಸತ್ಯ, ವಿಜ್ಞಾನ ಮತ್ತು ಸಾಮಾಜಿಕ ಸುಧಾರಣೆಯ ಬಗ್ಗೆ ಅವರ ಬದ್ಧತೆಯನ್ನು ತೋರಿಸುತ್ತವೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಎಚ್. ನರಸಿಂಹಯ್ಯ ಅವರು ವಿದ್ಯಾರ್ಥಿಗಳು, ಶಿಕ್ಷಕರು, ತಾರ್ಕಿಕ ಚಿಂತಕರು ಮತ್ತು ಸಮಾಜಸೇವಕರಿಗೆ ಪ್ರೇರಣೆಯಾಗಿದ್ದಾರೆ. ಅವರ ಜೀವನವು ವೈಜ್ಞಾನಿಕ ಮನೋಭಾವ, ಪ್ರಾಮಾಣಿಕತೆ, ಪ್ರಶ್ನಿಸುವ ಗುಣ ಮತ್ತು ಸಮಾಜಸೇವೆಯ ಮಹತ್ವವನ್ನು ಕಲಿಸುತ್ತದೆ. ಕರ್ನಾಟಕದ ಗೌರವಾನ್ವಿತ ಶಿಕ್ಷಣತಜ್ಞರು ಮತ್ತು ಚಿಂತಕರಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರು ನೆನಪಾಗುತ್ತಾರೆ.\n"
        ),

        h("Chikkamagaluru", "ಚಿಕ್ಕಮಗಳೂರು", "Kuvempu", "ಕುವೆಂಪು",
            "Kuppali Venkatappa Puttappa (29 December 1904 – 11 November 1994), popularly known by his pen name Kuvempu, was one of the greatest Kannada poets, writers, and thinkers of Karnataka. He was born in Hirekodige and brought up in Kuppalli in the Malnad region. He is honoured as Rashtrakavi, meaning National Poet of Karnataka.\n" + "\n" +
                    "Kuvempu made a major contribution to Kannada literature through poetry, novels, plays, essays, and literary criticism. His greatest work is Sri Ramayana Darshanam, a modern Kannada epic based on the Ramayana. This work won him the Jnanpith Award, making him the first Kannada writer to receive this honour.\n" + "\n" +
                    "He also served as Vice-Chancellor of the University of Mysore. His philosophy of Vishwa Manava, or Universal Humanism, promoted equality, humanity, love, and respect for all people beyond caste, religion, and language divisions.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "Kuvempu is remembered as a cultural icon of Karnataka. His writings continue to inspire students, writers, and readers. His message of universal humanism remains important in modern society.\n",
            "ಕುಪ್ಪಳ್ಳಿ ವೆಂಕಟಪ್ಪ ಪುಟ್ಟಪ್ಪ (29 ಡಿಸೆಂಬರ್ 1904 – 11 ನವೆಂಬರ್ 1994), ಕುವೆಂಪು ಎಂಬ ಕಾವ್ಯನಾಮದಿಂದ ಪ್ರಸಿದ್ಧರಾದವರು, ಕರ್ನಾಟಕದ ಮಹಾನ್ ಕನ್ನಡ ಕವಿ, ಬರಹಗಾರ ಮತ್ತು ಚಿಂತಕರಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಹಿರೇಕೊಡಿಗೆಯಲ್ಲಿ ಜನಿಸಿ ಮಲೆನಾಡಿನ ಕುಪ್ಪಳ್ಳಿಯಲ್ಲಿ ಬೆಳೆದರು. ಅವರಿಗೆ ಕರ್ನಾಟಕದ ರಾಷ್ಟ್ರಕವಿ ಎಂಬ ಗೌರವ ಲಭಿಸಿದೆ.\n" +
                    "\n" +
                    "ಕುವೆಂಪು ಅವರು ಕಾವ್ಯ, ಕಾದಂಬರಿ, ನಾಟಕ, ಪ್ರಬಂಧ ಮತ್ತು ಸಾಹಿತ್ಯ ವಿಮರ್ಶೆ ಕ್ಷೇತ್ರಗಳಲ್ಲಿ ಕನ್ನಡ ಸಾಹಿತ್ಯಕ್ಕೆ ಮಹತ್ತರ ಕೊಡುಗೆ ನೀಡಿದ್ದಾರೆ. ಅವರ ಮಹಾಕೃತಿ ಶ್ರೀ ರಾಮಾಯಣ ದರ್ಶನಂ, ರಾಮಾಯಣ ಆಧಾರಿತ ಆಧುನಿಕ ಕನ್ನಡ ಮಹಾಕಾವ್ಯವಾಗಿದೆ. ಈ ಕೃತಿಗೆ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿದ್ದು, ಈ ಗೌರವ ಪಡೆದ ಮೊದಲ ಕನ್ನಡ ಬರಹಗಾರರಾದರು.\n" +
                    "\n" +
                    "ಅವರು ಮೈಸೂರು ವಿಶ್ವವಿದ್ಯಾಲಯದ ಕುಲಪತಿಯಾಗಿಯೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಅವರ ವಿಶ್ವಮಾನವ ತತ್ತ್ವವು ಜಾತಿ, ಧರ್ಮ ಮತ್ತು ಭಾಷಾ ಭೇದಗಳನ್ನು ಮೀರಿ ಸಮಾನತೆ, ಮಾನವೀಯತೆ, ಪ್ರೀತಿ ಮತ್ತು ಗೌರವವನ್ನು ಸಾರುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಕುವೆಂಪು ಅವರು ಕರ್ನಾಟಕದ ಸಾಂಸ್ಕೃತಿಕ ಚಿಹ್ನೆಯಾಗಿ ನೆನಪಾಗುತ್ತಾರೆ. ಅವರ ಬರಹಗಳು ಇಂದಿಗೂ ವಿದ್ಯಾರ್ಥಿಗಳು, ಬರಹಗಾರರು ಮತ್ತು ಓದುಗರಿಗೆ ಪ್ರೇರಣೆಯಾಗಿವೆ. ವಿಶ್ವಮಾನವ ಸಂದೇಶವು ಇಂದಿನ ಸಮಾಜದಲ್ಲಿಯೂ ಮಹತ್ವದ್ದಾಗಿದೆ.\n"
        ),

        h("Chikkamagaluru", "ಚಿಕ್ಕಮಗಳೂರು", "Poornachandra Tejaswi", "ಪೂರ್ಣಚಂದ್ರ ತೇಜಸ್ವಿ",
            "Kuppali Puttappa Poornachandra Tejaswi (8 September 1938 – 5 April 2007) was a prominent Kannada writer, novelist, naturalist, photographer, farmer, publisher, and environmental thinker. He was the son of Rashtrakavi Kuvempu and Hemavathi. He was born in Kuppalli and later lived in Mudigere in Chikkamagaluru district.\n" + "\n" +
                    "Tejaswi was one of the most important modern Kannada writers. His works combined literature, science, nature, environment, rural life, and social thought. He wrote novels, short stories, essays, travel writing, translations, and books that introduced science and nature to common readers.\n" + "\n" +
                    "His famous works include Karvalo, Chidambara Rahasya, Jugari Cross, and the Millennium Series. Karvalo is especially popular for combining mystery, science, nature, and human curiosity. His writing style was simple, fresh, and close to ordinary people.\n" + "\n" +
                    "Tejaswi was also deeply interested in birds, photography, agriculture, and ecology. He helped bring environmental awareness into Kannada literature and influenced many young readers to observe nature carefully.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "Poornachandra Tejaswi is remembered as a multi-talented writer who expanded the boundaries of Kannada literature. His works continue to inspire nature lovers, students, writers, and socially aware readers.\n",
            "ಕುಪ್ಪಳ್ಳಿ ಪುಟ್ಟಪ್ಪ ಪೂರ್ಣಚಂದ್ರ ತೇಜಸ್ವಿ (8 ಸೆಪ್ಟೆಂಬರ್ 1938 – 5 ಏಪ್ರಿಲ್ 2007) ಅವರು ಪ್ರಮುಖ ಕನ್ನಡ ಬರಹಗಾರ, ಕಾದಂಬರಿಕಾರ, ಪ್ರಕೃತಿ ಪ್ರೇಮಿ, ಛಾಯಾಗ್ರಾಹಕ, ರೈತ, ಪ್ರಕಾಶಕ ಮತ್ತು ಪರಿಸರ ಚಿಂತಕರಾಗಿದ್ದರು. ಅವರು ರಾಷ್ಟ್ರಕವಿ ಕುವೆಂಪು ಮತ್ತು ಹೇಮಾವತಿ ಅವರ ಪುತ್ರರು. ಅವರು ಕುಪ್ಪಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿ ನಂತರ ಚಿಕ್ಕಮಗಳೂರು ಜಿಲ್ಲೆಯ ಮೂಡಿಗೆರೆಯಲ್ಲಿ ವಾಸಿಸಿದರು.\n" +
                    "\n" +
                    "ತೇಜಸ್ವಿ ಅವರು ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಪ್ರಮುಖ ಬರಹಗಾರರಲ್ಲಿ ಒಬ್ಬರು. ಅವರ ಕೃತಿಗಳಲ್ಲಿ ಸಾಹಿತ್ಯ, ವಿಜ್ಞಾನ, ಪ್ರಕೃತಿ, ಪರಿಸರ, ಗ್ರಾಮೀಣ ಜೀವನ ಮತ್ತು ಸಾಮಾಜಿಕ ಚಿಂತನೆಗಳು ಒಂದಾಗಿ ಕಾಣಿಸುತ್ತವೆ. ಅವರು ಕಾದಂಬರಿ, ಕಥೆ, ಪ್ರಬಂಧ, ಪ್ರವಾಸ ಬರಹ, ಅನುವಾದ ಮತ್ತು ವಿಜ್ಞಾನ-ಪ್ರಕೃತಿ ಪರಿಚಯಿಸುವ ಪುಸ್ತಕಗಳನ್ನು ಬರೆದಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "ಅವರ ಪ್ರಸಿದ್ಧ ಕೃತಿಗಳಲ್ಲಿ ಕರ್ವಾಲೋ, ಚಿದಂಬರ ರಹಸ್ಯ, ಜುಗಾರಿ ಕ್ರಾಸ್ ಮತ್ತು ಮಿಲೇನಿಯಂ ಸರಣಿ ಸೇರಿವೆ. ಕರ್ವಾಲೋ ಕೃತಿ ರಹಸ್ಯ, ವಿಜ್ಞಾನ, ಪ್ರಕೃತಿ ಮತ್ತು ಮಾನವ ಕುತೂಹಲವನ್ನು ಒಟ್ಟುಗೂಡಿಸುವುದರಿಂದ ವಿಶೇಷವಾಗಿ ಜನಪ್ರಿಯವಾಗಿದೆ. ಅವರ ಬರವಣಿಗೆ ಸರಳ, ಹೊಸತನದಿಂದ ಕೂಡಿದ ಮತ್ತು ಸಾಮಾನ್ಯ ಜನರಿಗೆ ಹತ್ತಿರವಾಗಿದೆ.\n" +
                    "\n" +
                    "ತೇಜಸ್ವಿ ಅವರಿಗೆ ಪಕ್ಷಿಗಳು, ಛಾಯಾಗ್ರಹಣ, ಕೃಷಿ ಮತ್ತು ಪರಿಸರದ ಮೇಲೆ ಆಳವಾದ ಆಸಕ್ತಿ ಇತ್ತು. ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯದಲ್ಲಿ ಪರಿಸರ ಜಾಗೃತಿಯನ್ನು ಬಲಪಡಿಸಿ, ಪ್ರಕೃತಿಯನ್ನು ಗಮನದಿಂದ ನೋಡುವಂತೆ ಅನೇಕ ಯುವ ಓದುಗರಿಗೆ ಪ್ರೇರಣೆ ನೀಡಿದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಪೂರ್ಣಚಂದ್ರ ತೇಜಸ್ವಿ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ವ್ಯಾಪ್ತಿಯನ್ನು ವಿಸ್ತರಿಸಿದ ಬಹುಮುಖ ಪ್ರತಿಭೆಯ ಬರಹಗಾರರಾಗಿ ನೆನಪಾಗುತ್ತಾರೆ. ಅವರ ಕೃತಿಗಳು ಪ್ರಕೃತಿ ಪ್ರೇಮಿಗಳು, ವಿದ್ಯಾರ್ಥಿಗಳು, ಬರಹಗಾರರು ಮತ್ತು ಸಾಮಾಜಿಕ ಜಾಗೃತಿಯ ಓದುಗರಿಗೆ ಇಂದಿಗೂ ಪ್ರೇರಣೆಯಾಗಿವೆ.\n"
        ),

        h("Chitradurga", "ಚಿತ್ರದುರ್ಗ", "S. Nijalingappa", "ಎಸ್. ನಿಜಲಿಂಗಪ್ಪ",
            "Siddavanahalli Nijalingappa (10 December 1902 – 8 August 2000) was an Indian freedom fighter, lawyer, Congress leader, and one of the most important political leaders of Karnataka. He was born in Halavagalu and later became closely associated with Chitradurga.\n" + "\n" +
                    "Nijalingappa was influenced by the ideas of Mahatma Gandhi and became active in the Indian freedom movement. He also played an important role in the Karnataka Unification movement, which aimed to bring Kannada-speaking regions together into one state.\n" + "\n" +
                    "He served as the Chief Minister of Mysore State, which later became Karnataka, for two terms. He was also a member of the Constituent Assembly of India and later became President of the Indian National Congress. As Chief Minister, he worked for agriculture, irrigation, industries, transport, education, and state development.\n" + "\n" +
                    "Nijalingappa is remembered for his simplicity, integrity, and commitment to public life. He also supported the resettlement of Tibetan refugees in Karnataka, which later became an important part of the state’s social history.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "A memorial has been built near Chitradurga in his honour. He is remembered as one of the builders of modern Karnataka and as a leader who contributed to both freedom struggle and state formation.\n",
            "ಸಿದ್ದವನಹಳ್ಳಿ ನಿಜಲಿಂಗಪ್ಪ (10 ಡಿಸೆಂಬರ್ 1902 – 8 ಆಗಸ್ಟ್ 2000) ಅವರು ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ವಕೀಲ, ಕಾಂಗ್ರೆಸ್ ನಾಯಕ ಮತ್ತು ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ರಾಜಕೀಯ ನಾಯಕರಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಹಲವಾಗಲಿನಲ್ಲಿ ಜನಿಸಿ ನಂತರ ಚಿತ್ರದುರ್ಗದೊಂದಿಗೆ ಆಪ್ತ ಸಂಬಂಧ ಹೊಂದಿದರು.\n" +
                    "\n" +
                    "ನಿಜಲಿಂಗಪ್ಪ ಅವರು ಮಹಾತ್ಮ ಗಾಂಧೀಜಿಯ ಚಿಂತನೆಗಳಿಂದ ಪ್ರಭಾವಿತರಾಗಿ ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಲ್ಲಿ ಸಕ್ರಿಯರಾದರು. ಕನ್ನಡ ಮಾತನಾಡುವ ಪ್ರದೇಶಗಳನ್ನು ಒಂದೇ ರಾಜ್ಯವಾಗಿ ಸೇರಿಸುವ ಕರ್ನಾಟಕ ಏಕೀಕರಣ ಚಳವಳಿಯಲ್ಲೂ ಅವರು ಪ್ರಮುಖ ಪಾತ್ರವಹಿಸಿದರು.\n" +
                    "\n" +
                    "ಅವರು ಮೈಸೂರು ರಾಜ್ಯದ ಮುಖ್ಯಮಂತ್ರಿಯಾಗಿ ಎರಡು ಅವಧಿಗೆ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಮೈಸೂರು ರಾಜ್ಯವೇ ನಂತರ ಕರ್ನಾಟಕವಾಯಿತು. ಅವರು ಭಾರತದ ಸಂವಿಧಾನ ಸಭೆಯ ಸದಸ್ಯರಾಗಿದ್ದರು ಮತ್ತು ನಂತರ ಭಾರತೀಯ ರಾಷ್ಟ್ರೀಯ ಕಾಂಗ್ರೆಸ್ ಅಧ್ಯಕ್ಷರಾಗಿಯೂ ಕಾರ್ಯನಿರ್ವಹಿಸಿದರು. ಮುಖ್ಯಮಂತ್ರಿಯಾಗಿ ಕೃಷಿ, ನೀರಾವರಿ, ಕೈಗಾರಿಕೆ, ಸಾರಿಗೆ, ಶಿಕ್ಷಣ ಮತ್ತು ರಾಜ್ಯದ ಅಭಿವೃದ್ಧಿಗೆ ಕೆಲಸ ಮಾಡಿದರು.\n" +
                    "\n" +
                    "ನಿಜಲಿಂಗಪ್ಪ ಅವರು ಸರಳತೆ, ಪ್ರಾಮಾಣಿಕತೆ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಜೀವನದ ಬದ್ಧತೆಗೆ ನೆನಪಾಗುತ್ತಾರೆ. ಕರ್ನಾಟಕದಲ್ಲಿ ಟಿಬೆಟಿಯನ್ ಶರಣಾರ್ಥಿಗಳ ಪುನರ್ವಸತಿಗೂ ಅವರು ಬೆಂಬಲ ನೀಡಿದರು, ಇದು ರಾಜ್ಯದ ಸಾಮಾಜಿಕ ಇತಿಹಾಸದ ಪ್ರಮುಖ ಭಾಗವಾಯಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಚಿತ್ರದುರ್ಗದ ಸಮೀಪದಲ್ಲಿ ಅವರ ಸ್ಮಾರಕ ನಿರ್ಮಿಸಲಾಗಿದೆ. ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟ ಮತ್ತು ರಾಜ್ಯ ನಿರ್ಮಾಣ ಎರಡಕ್ಕೂ ಕೊಡುಗೆ ನೀಡಿದ ಆಧುನಿಕ ಕರ್ನಾಟಕದ ನಿರ್ಮಾತೃಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರು ನೆನಪಾಗುತ್ತಾರೆ.\n"
        ),

        h("Chitradurga", "ಚಿತ್ರದುರ್ಗ", "Onake Obavva", "ಒನಕೆ ಓಬವ್ವ",
            "Onake Obavva was a legendary woman warrior of Chitradurga, remembered for her extraordinary courage during the attack of Hyder Ali’s forces on Chitradurga Fort. She was the wife of a fort guard named Kahale Mudda Hanuma.\n" + "\n" +
                    "According to tradition, when her husband had gone home for lunch, Obavva went to fetch water and noticed enemy soldiers trying to enter the fort through a small opening in the rocks. Without waiting for help, she took an onake, a wooden pestle used for pounding grain, and killed the soldiers one by one as they entered.\n" + "\n" +
                    "Her brave action delayed the enemy and protected the fort for some time. Although Chitradurga later fell to Hyder Ali, Obavva’s courage became a symbol of local resistance and women’s bravery in Karnataka.\n" + "\n" +
                    "The opening through which the soldiers entered is remembered as Onake Obavvana Kindi. She is celebrated along with other brave women of Karnataka such as Kittur Chennamma, Keladi Chennamma, and Rani Abbakka.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "The Government of Karnataka observes Onake Obavva Jayanti on 11 November. A stadium in Chitradurga and statues honour her memory. She continues to inspire courage, patriotism, and selfless service.\n",
            "ಒನಕೆ ಓಬವ್ವ ಅವರು ಚಿತ್ರದುರ್ಗದ ಪೌರಾಣಿಕ ಧೈರ್ಯಶಾಲಿ ಮಹಿಳೆ. ಹೈದರಾಲಿಯ ಸೈನ್ಯವು ಚಿತ್ರದುರ್ಗ ಕೋಟೆಯ ಮೇಲೆ ದಾಳಿ ಮಾಡಿದ ಸಂದರ್ಭದಲ್ಲಿ ತೋರಿದ ಅಸಾಮಾನ್ಯ ಧೈರ್ಯಕ್ಕಾಗಿ ಅವರು ನೆನಪಾಗುತ್ತಾರೆ. ಅವರು ಕೋಟೆಯ ಕಾವಲುಗಾರ ಕಹಳೆ ಮುದ್ದ ಹನುಮ ಅವರ ಪತ್ನಿಯಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "ಪರಂಪರೆಯ ಪ್ರಕಾರ, ಅವರ ಪತಿ ಊಟಕ್ಕೆ ಮನೆಗೆ ಹೋದಾಗ ಓಬವ್ವ ನೀರು ತರಲು ಹೋಗಿದ್ದರು. ಆ ಸಮಯದಲ್ಲಿ ಶತ್ರು ಸೈನಿಕರು ಬಂಡೆಯ ಸಣ್ಣ ರಂಧ್ರದ ಮೂಲಕ ಕೋಟೆಯೊಳಗೆ ಪ್ರವೇಶಿಸಲು ಯತ್ನಿಸುತ್ತಿರುವುದನ್ನು ಅವರು ಗಮನಿಸಿದರು. ಸಹಾಯಕ್ಕಾಗಿ ಕಾಯದೆ, ಅಕ್ಕಿ ಒಡೆಯಲು ಬಳಸುವ ಮರದ ಒನಕೆಯನ್ನು ತೆಗೆದುಕೊಂಡು ಒಳಬರುವ ಸೈನಿಕರನ್ನು ಒಬ್ಬೊಬ್ಬರಾಗಿ ಹೊಡೆದುರುಳಿಸಿದರು.\n" +
                    "\n" +
                    "ಅವರ ಸಾಹಸವು ಶತ್ರುಗಳ ಪ್ರವೇಶವನ್ನು ತಡೆದು ಕೋಟೆಯನ್ನು ಕೆಲವು ಕಾಲ ರಕ್ಷಿಸಿತು. ನಂತರ ಚಿತ್ರದುರ್ಗ ಹೈದರಾಲಿಯ ಕೈಗೆ ಸಿಕ್ಕಿದರೂ, ಓಬವ್ವರ ಧೈರ್ಯ ಕರ್ನಾಟಕದಲ್ಲಿ ಸ್ಥಳೀಯ ಪ್ರತಿರೋಧ ಮತ್ತು ಮಹಿಳಾ ಶೌರ್ಯದ ಸಂಕೇತವಾಯಿತು.\n" +
                    "\n" +
                    "ಶತ್ರು ಸೈನಿಕರು ಪ್ರವೇಶಿಸಿದ ಆ ರಂಧ್ರವನ್ನು ಒನಕೆ ಓಬವ್ವನ ಕಿಂಡಿ ಎಂದು ಕರೆಯಲಾಗುತ್ತದೆ. ಕಿತ್ತೂರು ಚೆನ್ನಮ್ಮ, ಕೆಳದಿ ಚೆನ್ನಮ್ಮ ಮತ್ತು ರಾಣಿ ಅಬ್ಬಕ್ಕರಂತೆ ಅವರು ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ವೀರ ಮಹಿಳೆಯರಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಗೌರವಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಕರ್ನಾಟಕ ಸರ್ಕಾರವು ನವೆಂಬರ್ 11ರಂದು ಒನಕೆ ಓಬವ್ವ ಜಯಂತಿಯನ್ನು ಆಚರಿಸುತ್ತದೆ. ಚಿತ್ರದುರ್ಗದ ಕ್ರೀಡಾಂಗಣ ಮತ್ತು ಪ್ರತಿಮೆಗಳು ಅವರ ಸ್ಮರಣೆಯನ್ನು ಉಳಿಸಿವೆ. ಅವರು ಧೈರ್ಯ, ದೇಶಭಕ್ತಿ ಮತ್ತು ನಿಸ್ವಾರ್ಥ ಸೇವೆಗೆ ಇಂದಿಗೂ ಪ್ರೇರಣೆಯಾಗಿದ್ದಾರೆ.\n"
        ),

        h("Chitradurga", "ಚಿತ್ರದುರ್ಗ", "Ta. Ra. Su.", "ತಾ. ರಾ. ಸು.",
            "Talukina Ramaswamayya Subba Rao (21 April 1920 – 10 April 1984), popularly known as Ta. Ra. Su., was a major Kannada novelist, scholar, and writer. He was born in Taluku village of Chitradurga district and became one of the important figures in modern Kannada literature.\n" + "\n" +
                    "Ta. Ra. Su. joined the Indian freedom movement at a young age. He travelled through villages in Chitradurga district, singing patriotic songs and giving speeches. He was even arrested for his participation in the movement.\n" + "\n" +
                    "He wrote many social and historical novels. His historical novels on Chitradurga are especially famous because they brought the history of the Chitradurga Nayakas and the fall of the fort into popular Kannada literature. His famous novel Durgastamana, based on the fall of Chitradurga, won the Sahitya Akademi Award posthumously in 1985.\n" + "\n" +
                    "Other important works include Kambaniya Kuyilu, Tirugubana, Raktaratri, Hamsageethe, and many more. Some of his novels were adapted into Kannada films. He is also remembered for introducing modern narrative styles into Kannada fiction.\n" + "\n" +
                    "## Legacy\n" + "\n" +
                    "Ta. Ra. Su. is remembered as a writer who preserved Chitradurga’s history through literature. His novels helped readers understand Karnataka’s past, heroism, social life, and cultural identity.\n",
            "ತಾಲೂಕಿನ ರಾಮಸ್ವಾಮಯ್ಯ ಸುಬ್ಬರಾವ್ (21 ಏಪ್ರಿಲ್ 1920 – 10 ಏಪ್ರಿಲ್ 1984), ತಾ. ರಾ. ಸು. ಎಂದು ಪ್ರಸಿದ್ಧರಾದವರು, ಪ್ರಮುಖ ಕನ್ನಡ ಕಾದಂಬರಿಕಾರ, ಪಂಡಿತ ಮತ್ತು ಬರಹಗಾರರು. ಅವರು ಚಿತ್ರದುರ್ಗ ಜಿಲ್ಲೆಯ ತಾಳುಕು ಗ್ರಾಮದಲ್ಲಿ ಜನಿಸಿ ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಪ್ರಮುಖ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರಾದರು.\n" +
                    "\n" +
                    "ತಾ. ರಾ. ಸು. ಅವರು ಯುವ ವಯಸ್ಸಿನಲ್ಲೇ ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಲ್ಲಿ ಭಾಗವಹಿಸಿದರು. ಚಿತ್ರದುರ್ಗ ಜಿಲ್ಲೆಯ ಗ್ರಾಮಗಳಲ್ಲಿ ಸಂಚರಿಸಿ ದೇಶಭಕ್ತಿ ಗೀತೆಗಳನ್ನು ಹಾಡಿ ಸ್ವಾತಂತ್ರ್ಯದ ಭಾಷಣಗಳನ್ನು ಮಾಡಿದರು. ಚಳವಳಿಯಲ್ಲಿ ಭಾಗವಹಿಸಿದ್ದಕ್ಕಾಗಿ ಅವರು ಬಂಧಿಸಲ್ಪಟ್ಟಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರು ಅನೇಕ ಸಾಮಾಜಿಕ ಮತ್ತು ಐತಿಹಾಸಿಕ ಕಾದಂಬರಿಗಳನ್ನು ಬರೆದರು. ಚಿತ್ರದುರ್ಗದ ಇತಿಹಾಸದ ಕುರಿತ ಅವರ ಐತಿಹಾಸಿಕ ಕಾದಂಬರಿಗಳು ವಿಶೇಷವಾಗಿ ಪ್ರಸಿದ್ಧ. ಅವು ಚಿತ್ರದುರ್ಗ ನಾಯಕರ ಇತಿಹಾಸ ಮತ್ತು ಕೋಟೆಯ ಪತನವನ್ನು ಜನಪ್ರಿಯ ಕನ್ನಡ ಸಾಹಿತ್ಯಕ್ಕೆ ತಂದವು. ಚಿತ್ರದುರ್ಗದ ಪತನವನ್ನು ಆಧರಿಸಿದ ದುರ್ಗಾಸ್ತಮಾನ ಕಾದಂಬರಿಗೆ 1985ರಲ್ಲಿ ಮರಣಾನಂತರ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು.\n" +
                    "\n" +
                    "ಕಂಬನಿಯ ಕುಯಿಲು, ತಿರುಗುಬಾಣ, ರಕ್ತರಾತ್ರಿ, ಹಂಸಗೀತೆ ಮತ್ತು ಇನ್ನೂ ಅನೇಕ ಕೃತಿಗಳು ಅವರ ಪ್ರಮುಖ ಬರಹಗಳಲ್ಲಿ ಸೇರಿವೆ. ಅವರ ಕೆಲವು ಕಾದಂಬರಿಗಳು ಕನ್ನಡ ಚಲನಚಿತ್ರಗಳಾಗಿಯೂ ರೂಪುಗೊಂಡಿವೆ. ಕನ್ನಡ ಕಾದಂಬರಿಯಲ್ಲಿ ಆಧುನಿಕ ನಿರೂಪಣಾ ಶೈಲಿಯನ್ನು ಪರಿಚಯಿಸಿದವರಲ್ಲಿಯೂ ಅವರು ನೆನಪಾಗುತ್ತಾರೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ತಾ. ರಾ. ಸು. ಅವರು ಸಾಹಿತ್ಯದ ಮೂಲಕ ಚಿತ್ರದುರ್ಗದ ಇತಿಹಾಸವನ್ನು ಉಳಿಸಿದ ಬರಹಗಾರರಾಗಿ ನೆನಪಾಗುತ್ತಾರೆ. ಅವರ ಕಾದಂಬರಿಗಳು ಕರ್ನಾಟಕದ ಇತಿಹಾಸ, ಶೌರ್ಯ, ಸಾಮಾಜಿಕ ಜೀವನ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಗುರುತನ್ನು ಓದುಗರಿಗೆ ಪರಿಚಯಿಸಿವೆ.\n"
        ),
        h("Dakshina Kannada", "ದಕ್ಷಿಣ ಕನ್ನಡ", "Rani Abbakka", "ರಾಣಿ ಅಬ್ಬಕ್ಕ",
            "Rani Abbakka Chowta, also remembered as Abbakka Mahadevi, was the queen of Ullal in coastal Karnataka during the 16th century. She belonged to the Chowta dynasty, a Jain/Tuluva ruling family connected with the Tulu Nadu region. Ullal was an important port town, and because of its strategic position in maritime trade, the Portuguese repeatedly tried to bring it under their control.\n" +
                    "\n" +
                    "Abbakka strongly resisted Portuguese colonial power and is remembered for repulsing several attacks on Ullal for many years. Her courage earned her the title “Abhaya Rani”, meaning the fearless queen. She is often described as one of the earliest Indian rulers to fight European colonialism, and many accounts refer to her as one of India’s first women freedom fighters.\n" +
                    "\n" +
                    "### Rule and Resistance\n" +
                    "\n" +
                    "The Chowta rulers followed a matrilineal system of inheritance, and Abbakka was trained in administration, diplomacy, military strategy, sword fighting, and archery. Her uncle Tirumala Raya Chowta is said to have prepared her for leadership. She ruled from Ullal and maintained alliances with local chiefs and trading communities.\n" +
                    "\n" +
                    "The Portuguese wanted control over Ullal because it was a prosperous trading centre linked to Arabia and other western trade routes. Abbakka refused to submit to Portuguese authority or pay tribute. She organized resistance using both naval and land strategies and became a symbol of local independence.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Rani Abbakka remains a major heroic figure in coastal Karnataka. She is remembered along with other brave women of Karnataka such as Kittur Rani Chennamma, Keladi Chennamma, Rani Chennabhairadevi, and Onake Obavva. Statues, cultural programmes, books, and public commemorations continue to honour her courage and patriotic spirit.\n",
            "ರಾಣಿ ಅಬ್ಬಕ್ಕ ಚೌಟ, ಅಬ್ಬಕ್ಕ ಮಹಾದೇವಿ ಎಂದೂ ಸ್ಮರಿಸಲ್ಪಡುವವರು, 16ನೇ ಶತಮಾನದಲ್ಲಿ ಕರಾವಳಿ ಕರ್ನಾಟಕದ ಉಳ್ಳಾಲದ ರಾಣಿಯಾಗಿದ್ದರು. ಅವರು ತುಳುನಾಡಿನ ಚೌಟ ವಂಶಕ್ಕೆ ಸೇರಿದ ಜೈನ/ತುಳುವ ರಾಣಿ. ಉಳ್ಳಾಲವು ಪ್ರಮುಖ ಬಂದರು ಪಟ್ಟಣವಾಗಿದ್ದು, ಸಮುದ್ರ ವ್ಯಾಪಾರದಲ್ಲಿ ಅದರ ಮಹತ್ವದ ಸ್ಥಾನದಿಂದಾಗಿ ಪೋರ್ಚುಗೀಸರು ಅದನ್ನು ತಮ್ಮ ಅಧೀನಕ್ಕೆ ತರಲು ಹಲವು ಬಾರಿ ಪ್ರಯತ್ನಿಸಿದರು.\n" +
                    "\n" +
                    "ಅಬ್ಬಕ್ಕ ಅವರು ಪೋರ್ಚುಗೀಸ್ ವಸಾಹತುಶಾಹಿ ಶಕ್ತಿಗೆ ಧೈರ್ಯವಾಗಿ ವಿರೋಧಿಸಿದರು. ಉಳ್ಳಾಲದ ಮೇಲೆ ನಡೆದ ಹಲವು ದಾಳಿಗಳನ್ನು ಅವರು ತಡೆದರು. ಅವರ ಧೈರ್ಯಕ್ಕಾಗಿ ಅವರಿಗೆ “ಅಭಯ ರಾಣಿ” ಎಂಬ ಬಿರುದು ದೊರಕಿತು. ಯುರೋಪಿಯನ್ ವಸಾಹತುಶಾಹಿಯ ವಿರುದ್ಧ ಹೋರಾಡಿದ ಭಾರತದ ಪ್ರಾರಂಭಿಕ ಆಡಳಿತಗಾರರಲ್ಲೊಬ್ಬರಾಗಿ, ಮತ್ತು ಭಾರತದ ಮೊದಲ ಮಹಿಳಾ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರರಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರನ್ನು ಸ್ಮರಿಸಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಆಡಳಿತ ಮತ್ತು ಹೋರಾಟ\n" +
                    "\n" +
                    "ಚೌಟ ವಂಶವು ಮಾತೃವಂಶೀಯ ಪರಂಪರೆಯನ್ನು ಅನುಸರಿಸುತ್ತಿತ್ತು. ಅಬ್ಬಕ್ಕ ಅವರಿಗೆ ಆಡಳಿತ, ರಾಜತಾಂತ್ರಿಕತೆ, ಯುದ್ಧತಂತ್ರ, ಕತ್ತಿಯುದ್ಧ ಮತ್ತು ಬಿಲ್ಲುಗಾರಿಕೆಗಳಲ್ಲಿ ತರಬೇತಿ ನೀಡಲಾಗಿತ್ತು. ಅವರ ಮಾವ ತಿರುಮಲ ರಾಯ ಚೌಟ ಅವರು ಅವರನ್ನು ನಾಯಕತ್ವಕ್ಕೆ ಸಿದ್ಧಗೊಳಿಸಿದ್ದರು ಎಂದು ಹೇಳಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "ಅರೇಬಿಯಾ ಮತ್ತು ಪಾಶ್ಚಾತ್ಯ ದೇಶಗಳ ವ್ಯಾಪಾರ ಮಾರ್ಗಗಳಿಗೆ ಸಂಪರ್ಕ ಹೊಂದಿದ್ದ ಉಳ್ಳಾಲವು ಸಮೃದ್ಧ ವ್ಯಾಪಾರ ಕೇಂದ್ರವಾಗಿತ್ತು. ಪೋರ್ಚುಗೀಸರು ಅದನ್ನು ಹಿಡಿಯಲು ಬಯಸಿದರು. ಆದರೆ ಅಬ್ಬಕ್ಕ ಅವರು ಪೋರ್ಚುಗೀಸರ ಅಧಿಕಾರಕ್ಕೆ ತಲೆಬಾಗಲಿಲ್ಲ ಮತ್ತು ತೆರಿಗೆ/ಕಪ್ಪ ನೀಡಲು ನಿರಾಕರಿಸಿದರು. ಸ್ಥಳೀಯ ನಾಯಕರೊಂದಿಗೆ ಮೈತ್ರಿ ಮಾಡಿಕೊಂಡು ಅವರು ಸಮುದ್ರ ಮತ್ತು ಭೂಯುದ್ಧ ತಂತ್ರಗಳ ಮೂಲಕ ಪ್ರತಿರೋಧ ಸಂಘಟಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ರಾಣಿ ಅಬ್ಬಕ್ಕ ಅವರು ಕರಾವಳಿ ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ವೀರನಾರಿಯಾಗಿ ಇಂದಿಗೂ ಗೌರವಿಸಲ್ಪಡುತ್ತಾರೆ. ಕಿತ್ತೂರು ರಾಣಿ ಚನ್ನಮ್ಮ, ಕೆಳದಿ ಚನ್ನಮ್ಮ, ರಾಣಿ ಚೆನ್ನಭೈರಾದೇವಿ ಮತ್ತು ಒನಕೆ ಓಬವ್ವ ಅವರೊಂದಿಗೆ ಕರ್ನಾಟಕದ ಧೈರ್ಯಶಾಲಿ ಮಹಿಳಾ ವೀರರ ಸಾಲಿನಲ್ಲಿ ಅವರನ್ನು ಸ್ಮರಿಸಲಾಗುತ್ತದೆ. ಪ್ರತಿಮೆಗಳು, ಸಾಂಸ್ಕೃತಿಕ ಕಾರ್ಯಕ್ರಮಗಳು, ಪುಸ್ತಕಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಸ್ಮರಣೆಗಳ ಮೂಲಕ ಅವರ ಶೌರ್ಯ ಮತ್ತು ದೇಶಭಕ್ತಿಯನ್ನು ಗೌರವಿಸಲಾಗುತ್ತದೆ.\n"),

        h("Dakshina Kannada", "ದಕ್ಷಿಣ ಕನ್ನಡ", "Karnad Sadashiva Rao", "ಕರ್ಣಾಡ್ ಸದಾಶಿವ ರಾವ್",
            "Karnad Sadashiva Rao (1881 – 9 January 1937) was an Indian freedom fighter, lawyer, social reformer, and Gandhian leader from Mangalore in Dakshina Kannada. Born into a wealthy family, he studied at Presidency College, Madras, and later studied law in Bombay. Instead of living a comfortable professional life, he dedicated himself to public service, social reform, and the Indian independence movement.\n" +
                    "\n" +
                    "Sadashiva Rao founded the Mahila Sabha in Mangalore with the support of his wife Shantabai. The organisation worked for widows, poor women, and women’s education. He also supported the upliftment of oppressed communities and worked against untouchability. He was associated with efforts for the betterment of Harijans and helped promote education, vocational training, khadi, and self-reliance.\n" +
                    "\n" +
                    "### Freedom Movement\n" +
                    "\n" +
                    "By 1919, Karnad Sadashiva Rao was deeply involved in the freedom struggle. He was among the early volunteers from Karnataka to join Mahatma Gandhi’s Satyagraha movement. He opposed colonial policies, supported the Non-Cooperation Movement, and helped build the Congress organisation in Karnataka. He also took part in the Salt Satyagraha at Ankola in 1930 and was imprisoned by the British.\n" +
                    "\n" +
                    "Sadashiva Rao spent much of his personal wealth on the freedom movement, social work, relief activities, schools, and public causes. In his final years, he attended the Faizpur Congress Session in 1936 despite poor health. He later travelled to Bombay, where he died on 9 January 1937.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Karnad Sadashiva Rao is remembered as one of Karnataka’s important freedom fighters and social reformers. Sadashivanagar in Bengaluru and K. S. Rao Road in Mangaluru are named in his honour. His life is remembered for sacrifice, service to the poor, women’s upliftment, anti-untouchability work, and dedication to India’s freedom struggle.\n",
            "ಕರ್ಣಾಡ್ ಸದಾಶಿವ ರಾವ್ (1881 – 9 ಜನವರಿ 1937) ಅವರು ದಕ್ಷಿಣ ಕನ್ನಡದ ಮಂಗಳೂರಿನ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ವಕೀಲ, ಸಮಾಜ ಸುಧಾರಕ ಮತ್ತು ಗಾಂಧೀವಾದಿ ನಾಯಕರು. ಶ್ರೀಮಂತ ಕುಟುಂಬದಲ್ಲಿ ಜನಿಸಿದ ಅವರು ಮದ್ರಾಸಿನ ಪ್ರೆಸಿಡೆನ್ಸಿ ಕಾಲೇಜಿನಲ್ಲಿ ವಿದ್ಯಾಭ್ಯಾಸ ಮಾಡಿದರು ಮತ್ತು ನಂತರ ಬಾಂಬೆನಲ್ಲಿ ಕಾನೂನು ಅಧ್ಯಯನ ಮಾಡಿದರು. ಸುಖಕರವಾದ ವೃತ್ತಿಜೀವನವನ್ನು ಆಯ್ಕೆಮಾಡದೆ, ಸಾರ್ವಜನಿಕ ಸೇವೆ, ಸಮಾಜ ಸುಧಾರಣೆ ಮತ್ತು ಭಾರತದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಕ್ಕೆ ತಮ್ಮನ್ನು ಸಮರ್ಪಿಸಿಕೊಂಡರು.\n" +
                    "\n" +
                    "ಸದಾಶಿವ ರಾವ್ ಅವರು ತಮ್ಮ ಪತ್ನಿ ಶಾಂತಾಬಾಯಿ ಅವರ ಸಹಕಾರದಿಂದ ಮಂಗಳೂರಿನಲ್ಲಿ ಮಹಿಳಾ ಸಭೆಯನ್ನು ಸ್ಥಾಪಿಸಿದರು. ಈ ಸಂಸ್ಥೆ ವಿಧವೆಯರು, ಬಡ ಮಹಿಳೆಯರು ಮತ್ತು ಮಹಿಳಾ ಶಿಕ್ಷಣಕ್ಕಾಗಿ ಕೆಲಸ ಮಾಡಿತು. ಅವರು ಹಿಂದುಳಿದ ಮತ್ತು ಶೋಷಿತ ಸಮುದಾಯಗಳ ಅಭಿವೃದ್ಧಿಗೂ ಶ್ರಮಿಸಿದರು. ಅಸ್ಪೃಶ್ಯತೆ ನಿವಾರಣೆ, ಹರಿಜನರ ಉದ್ಧಾರ, ಶಿಕ್ಷಣ, ವೃತ್ತಿಪರ ತರಬೇತಿ, ಖಾದಿ ಮತ್ತು ಸ್ವಾವಲಂಬನೆಯನ್ನು ಉತ್ತೇಜಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸ್ವಾತಂತ್ರ್ಯ ಚಳುವಳಿ\n" +
                    "\n" +
                    "1919ರ ವೇಳೆಗೆ ಕರ್ಣಾಡ್ ಸದಾಶಿವ ರಾವ್ ಅವರು ಸ್ವಾತಂತ್ರ್ಯ ಚಳುವಳಿಯಲ್ಲಿ ಸಂಪೂರ್ಣವಾಗಿ ತೊಡಗಿಸಿಕೊಂಡಿದ್ದರು. ಮಹಾತ್ಮ ಗಾಂಧಿಯವರ ಸತ್ಯಾಗ್ರಹ ಚಳುವಳಿಗೆ ಕರ್ನಾಟಕದಿಂದ ಸೇರಿದ ಪ್ರಾರಂಭಿಕ ಸ್ವಯಂಸೇವಕರಲ್ಲಿ ಅವರು ಒಬ್ಬರು. ಅವರು ವಸಾಹತುಶಾಹಿ ನೀತಿಗಳನ್ನು ವಿರೋಧಿಸಿದರು, ಅಸಹಕಾರ ಚಳುವಳಿಗೆ ಬೆಂಬಲ ನೀಡಿದರು ಮತ್ತು ಕರ್ನಾಟಕದಲ್ಲಿ ಕಾಂಗ್ರೆಸ್ ಸಂಘಟನೆಯನ್ನು ಬಲಪಡಿಸಲು ಶ್ರಮಿಸಿದರು. 1930ರಲ್ಲಿ ಅಂಕೋಲಾದ ಉಪ್ಪಿನ ಸತ್ಯಾಗ್ರಹದಲ್ಲೂ ಭಾಗವಹಿಸಿ ಬ್ರಿಟಿಷರಿಂದ ಬಂಧಿತರಾದರು.\n" +
                    "\n" +
                    "ಸದಾಶಿವ ರಾವ್ ಅವರು ತಮ್ಮ ವೈಯಕ್ತಿಕ ಸಂಪತ್ತಿನ ಬಹುಭಾಗವನ್ನು ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟ, ಸಮಾಜ ಸೇವೆ, ಪರಿಹಾರ ಕಾರ್ಯ, ಶಾಲೆಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಕಾರ್ಯಗಳಿಗೆ ವೆಚ್ಚಮಾಡಿದರು. ತಮ್ಮ ಕೊನೆಯ ದಿನಗಳಲ್ಲಿಯೂ ಅನಾರೋಗ್ಯದ ನಡುವೆಯೇ 1936ರ ಫೈಜ್‌ಪುರ ಕಾಂಗ್ರೆಸ್ ಅಧಿವೇಶನದಲ್ಲಿ ಭಾಗವಹಿಸಿದರು. ನಂತರ ಬಾಂಬೆ ಪ್ರವಾಸದ ವೇಳೆ 9 ಜನವರಿ 1937ರಂದು ನಿಧನರಾದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಕರ್ಣಾಡ್ ಸದಾಶಿವ ರಾವ್ ಅವರು ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ ಮತ್ತು ಸಮಾಜ ಸುಧಾರಕರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಬೆಂಗಳೂರಿನ ಸದಾಶಿವನಗರ ಮತ್ತು ಮಂಗಳೂರಿನ ಕೆ. ಎಸ್. ರಾವ್ ರಸ್ತೆ ಅವರಿಗೆ ಗೌರವವಾಗಿ ಹೆಸರಿಸಲ್ಪಟ್ಟಿವೆ. ಬಡವರ ಸೇವೆ, ಮಹಿಳಾ ಉದ್ಧಾರ, ಅಸ್ಪೃಶ್ಯತೆ ನಿವಾರಣೆ ಮತ್ತು ಭಾರತದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಕ್ಕೆ ಮಾಡಿದ ತ್ಯಾಗಕ್ಕಾಗಿ ಅವರ ಜೀವನ ಇಂದು ಕೂಡ ಪ್ರೇರಣೆಯಾಗಿದೆ.\n"),

        h("Dakshina Kannada", "ದಕ್ಷಿಣ ಕನ್ನಡ", "B. M. Idinabba", "ಬಿ. ಎಂ. ಇದಿನಬ್ಬ",
            "B. M. Idinabba (17 September 1920 – 11 April 2009) was a Kannada poet, novelist, journalist, freedom fighter, politician, and Kannada activist from coastal Karnataka. He was born at Uppinangady in Puttur taluk of Dakshina Kannada district. He belonged to the Beary community and became known for his contribution to Kannada literature, public life, and language activism.\n" +
                    "\n" +
                    "Idinabba began public life at a young age and was associated with the Indian National Congress. He was elected to the Karnataka Legislative Assembly from Ullal constituency three times, in 1967, 1985, and 1989. He also worked for the cultural and linguistic identity of Kannadigas in the coastal region.\n" +
                    "\n" +
                    "### Literary and Cultural Work\n" +
                    "\n" +
                    "As a writer, B. M. Idinabba published novels, short stories, poetry collections, and children’s literature. He served as president of the Dakshina Kannada Zilla Sahitya Parishat from 1970 to 1982 and was associated with the Kannada Sahitya Parishat and Karnataka Sahitya Academy. He also presided over the first Akhila Bharatha Beary Sahitya Sammelana, giving importance to Beary language and literature.\n" +
                    "\n" +
                    "Idinabba strongly supported the development of Kannada in coastal Karnataka. He argued for Kannada education, Kannada administration, and the interests of Kannadigas. He also supported the demand to merge Kasaragod with Karnataka based on linguistic and cultural grounds. In 2005, he served as president of the Kannada Development Authority.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "B. M. Idinabba received several honours, including the Rajyotsava Prashasti, Sandesha Award, Pejawar Award, Suvarna Karnataka Ekikarana Award, Goruru Ramaswamy Ayyangar Award, and Atthimabbe Award. He passed away at Ullal on 11 April 2009 at the age of 88. He is remembered as a writer, public leader, and strong voice for Kannada and coastal Karnataka’s literary culture.\n",
            "ಬಿ. ಎಂ. ಇದಿನಬ್ಬ (17 ಸೆಪ್ಟೆಂಬರ್ 1920 – 11 ಏಪ್ರಿಲ್ 2009) ಅವರು ಕರಾವಳಿ ಕರ್ನಾಟಕದ ಕನ್ನಡ ಕವಿ, ಕಾದಂಬರಿಕಾರ, ಪತ್ರಕರ್ತ, ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ರಾಜಕಾರಣಿ ಮತ್ತು ಕನ್ನಡ ಹೋರಾಟಗಾರರಾಗಿದ್ದರು. ಅವರು ದಕ್ಷಿಣ ಕನ್ನಡ ಜಿಲ್ಲೆಯ ಪುತ್ತೂರು ತಾಲ್ಲೂಕಿನ ಉಪ್ಪಿನಂಗಡಿಯಲ್ಲಿ ಜನಿಸಿದರು. ಬ್ಯಾರಿ ಸಮುದಾಯಕ್ಕೆ ಸೇರಿದ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯ, ಸಾರ್ವಜನಿಕ ಜೀವನ ಮತ್ತು ಭಾಷಾ ಚಳುವಳಿಯಲ್ಲಿ ತಮ್ಮ ಕೊಡುಗೆಯಿಂದ ಪ್ರಸಿದ್ಧರಾದರು.\n" +
                    "\n" +
                    "ಇದಿನಬ್ಬ ಅವರು ಚಿಕ್ಕ ವಯಸ್ಸಿನಿಂದಲೇ ಸಾರ್ವಜನಿಕ ಜೀವನದಲ್ಲಿ ತೊಡಗಿಕೊಂಡರು ಮತ್ತು ಭಾರತೀಯ ರಾಷ್ಟ್ರೀಯ ಕಾಂಗ್ರೆಸ್‌ಗೆ ಸಂಬಂಧಪಟ್ಟಿದ್ದರು. ಅವರು ಉಳ್ಳಾಲ ವಿಧಾನಸಭಾ ಕ್ಷೇತ್ರದಿಂದ 1967, 1985 ಮತ್ತು 1989ರಲ್ಲಿ ಮೂರು ಬಾರಿ ಕರ್ನಾಟಕ ವಿಧಾನಸಭೆಗೆ ಆಯ್ಕೆಯಾದರು. ಕರಾವಳಿ ಪ್ರದೇಶದಲ್ಲಿ ಕನ್ನಡಿಗರ ಸಾಂಸ್ಕೃತಿಕ ಮತ್ತು ಭಾಷಾ ಗುರುತಿಗಾಗಿ ಅವರು ಶ್ರಮಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಬರಹಗಾರರಾಗಿ ಬಿ. ಎಂ. ಇದಿನಬ್ಬ ಅವರು ಕಾದಂಬರಿಗಳು, ಕಥೆಗಳು, ಕವನ ಸಂಕಲನಗಳು ಮತ್ತು ಮಕ್ಕಳ ಸಾಹಿತ್ಯವನ್ನು ಪ್ರಕಟಿಸಿದರು. 1970ರಿಂದ 1982ರವರೆಗೆ ದಕ್ಷಿಣ ಕನ್ನಡ ಜಿಲ್ಲಾ ಸಾಹಿತ್ಯ ಪರಿಷತ್ತಿನ ಅಧ್ಯಕ್ಷರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಕನ್ನಡ ಸಾಹಿತ್ಯ ಪರಿಷತ್ ಮತ್ತು ಕರ್ನಾಟಕ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿಯೊಂದಿಗೂ ಅವರು ಸಂಬಂಧ ಹೊಂದಿದ್ದರು. ಮೊದಲ ಅಖಿಲ ಭಾರತ ಬ್ಯಾರಿ ಸಾಹಿತ್ಯ ಸಮ್ಮೇಳನದ ಅಧ್ಯಕ್ಷತೆಯನ್ನು ವಹಿಸಿ ಬ್ಯಾರಿ ಭಾಷೆ ಮತ್ತು ಸಾಹಿತ್ಯಕ್ಕೂ ಮಹತ್ವ ನೀಡಿದರು.\n" +
                    "\n" +
                    "ಕರಾವಳಿ ಕರ್ನಾಟಕದಲ್ಲಿ ಕನ್ನಡದ ಅಭಿವೃದ್ಧಿಗೆ ಇದಿನಬ್ಬ ಅವರು ಬಲವಾಗಿ ಬೆಂಬಲಿಸಿದರು. ಕನ್ನಡ ಶಿಕ್ಷಣ, ಕನ್ನಡ ಆಡಳಿತ ಮತ್ತು ಕನ್ನಡಿಗರ ಹಿತಾಸಕ್ತಿಗಾಗಿ ಅವರು ವಾದಿಸಿದರು. ಭಾಷಾ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಆಧಾರದ ಮೇಲೆ ಕಾಸರಗೋಡನ್ನು ಕರ್ನಾಟಕದೊಂದಿಗೆ ಸೇರಿಸಬೇಕೆಂಬ ಬೇಡಿಕೆಗೆ ಅವರು ಬೆಂಬಲ ನೀಡಿದರು. 2005ರಲ್ಲಿ ಅವರು ಕನ್ನಡ ಅಭಿವೃದ್ಧಿ ಪ್ರಾಧಿಕಾರದ ಅಧ್ಯಕ್ಷರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಬಿ. ಎಂ. ಇದಿನಬ್ಬ ಅವರಿಗೆ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ, ಸಂದೇಶ ಪ್ರಶಸ್ತಿ, ಪೇಜಾವರ ಪ್ರಶಸ್ತಿ, ಸುವರ್ಣ ಕರ್ನಾಟಕ ಏಕೀಕರಣ ಪ್ರಶಸ್ತಿ, ಗೊರೂರು ರಾಮಸ್ವಾಮಿ ಅಯ್ಯಂಗಾರ್ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಅತ್ತಿಮಬ್ಬೆ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಹಲವು ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಅವರು 11 ಏಪ್ರಿಲ್ 2009ರಂದು ಉಳ್ಳಾಲದಲ್ಲಿ 88ನೇ ವಯಸ್ಸಿನಲ್ಲಿ ನಿಧನರಾದರು. ಬರಹಗಾರ, ಸಾರ್ವಜನಿಕ ನಾಯಕ ಮತ್ತು ಕನ್ನಡ ಹಾಗೂ ಕರಾವಳಿ ಕರ್ನಾಟಕದ ಸಾಹಿತ್ಯ ಸಂಸ್ಕೃತಿಯ ಬಲವಾದ ಧ್ವನಿಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Dakshina Kannada", "ದಕ್ಷಿಣ ಕನ್ನಡ", "B. V. Karanth", "ಬಿ. ವಿ. ಕಾರಂತ್",
            "B. V. Karanth, whose full name was Babukodi Venkataramana Karanth (19 September 1929 – 1 September 2002), was one of the most influential theatre personalities of modern India. He was born at Manchi near Babukodi in Bantwal taluk of Dakshina Kannada district. He became known as a theatre director, playwright, actor, film director, screenwriter, composer, and institution-builder.\n" +
                    "\n" +
                    "Karanth developed an interest in theatre during childhood. He later joined the famous Gubbi Veeranna drama company and worked in professional theatre. He studied at the National School of Drama in New Delhi and graduated in 1962. He later became the director of the National School of Drama from 1977 to 1981.\n" +
                    "\n" +
                    "### Theatre and Cinema\n" +
                    "\n" +
                    "B. V. Karanth transformed Kannada and Indian theatre through his powerful use of music, folk traditions, regional languages, and modern stagecraft. He directed many important plays in Kannada, Hindi, and other Indian languages. Some of his well-known productions include Jokumara Swami, Sankranti, Hayavadana, Huchu Kudure, Oedipus, Macbeth, King Lear, and Ghashiram Kotwal.\n" +
                    "\n" +
                    "He co-founded Benaka, one of Bengaluru’s well-known theatre groups, with his wife Prema Karanth. He also helped build major theatre institutions. He was the founding director of Rangmandal at Bharat Bhavan in Bhopal and later became the founding director of Rangayana in Mysuru. Through workshops and productions, he trained many actors and helped spread modern theatre across India.\n" +
                    "\n" +
                    "Karanth also contributed to Indian cinema. He co-directed films such as Vamsha Vriksha and Tabbaliyu Neenade Magane with Girish Karnad and composed music for several films. His work connected literature, theatre, folk performance, and cinema.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "B. V. Karanth received many honours, including the Sangeet Natak Akademi Award, Padma Shri, Kalidas Samman, Gubbi Veeranna Award, National Film Awards, Karnataka State Film Awards, and Filmfare Awards South. He passed away in Bengaluru on 1 September 2002. He is remembered as a pioneer who gave Indian theatre a new language rooted in music, folk culture, and regional imagination.\n",
            "ಬಿ. ವಿ. ಕಾರಂತ್ ಅವರ ಪೂರ್ಣ ಹೆಸರು ಬಾಬುಕೋಡಿ ವೆಂಕಟರಮಣ ಕಾರಂತ್ (19 ಸೆಪ್ಟೆಂಬರ್ 1929 – 1 ಸೆಪ್ಟೆಂಬರ್ 2002). ಅವರು ಆಧುನಿಕ ಭಾರತೀಯ ರಂಗಭೂಮಿಯ ಅತ್ಯಂತ ಪ್ರಭಾವಿ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ದಕ್ಷಿಣ ಕನ್ನಡ ಜಿಲ್ಲೆಯ ಬಂಟ್ವಾಳ ತಾಲ್ಲೂಕಿನ ಬಾಬುಕೋಡಿ ಸಮೀಪದ ಮಂಚಿಯಲ್ಲಿ ಜನಿಸಿದರು. ರಂಗ ನಿರ್ದೇಶಕ, ನಾಟಕಕಾರ, ನಟ, ಚಲನಚಿತ್ರ ನಿರ್ದೇಶಕ, ಚಿತ್ರಕಥೆಗಾರ, ಸಂಗೀತ ಸಂಯೋಜಕ ಮತ್ತು ಸಂಸ್ಥಾಪಕರಾಗಿ ಪ್ರಸಿದ್ಧರಾದರು.\n" +
                    "\n" +
                    "ಕಾರಂತ್ ಅವರಿಗೆ ಬಾಲ್ಯದಲ್ಲೇ ರಂಗಭೂಮಿಯ ಮೇಲೆ ಆಸಕ್ತಿ ಮೂಡಿತು. ನಂತರ ಅವರು ಪ್ರಸಿದ್ಧ ಗುಬ್ಬಿ ವೀರಣ್ಣ ನಾಟಕ ಕಂಪನಿಗೆ ಸೇರಿ ವೃತ್ತಿಪರ ರಂಗಭೂಮಿಯಲ್ಲಿ ಕೆಲಸ ಮಾಡಿದರು. ನವದೆಹಲಿಯ ರಾಷ್ಟ್ರೀಯ ನಾಟಕ ಶಾಲೆಯಲ್ಲಿ ಅಧ್ಯಯನ ಮಾಡಿ 1962ರಲ್ಲಿ ಪದವಿ ಪಡೆದರು. ನಂತರ 1977ರಿಂದ 1981ರವರೆಗೆ ರಾಷ್ಟ್ರೀಯ ನಾಟಕ ಶಾಲೆಯ ನಿರ್ದೇಶಕರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು.\n" +
                    "\n" +
                    "### ರಂಗಭೂಮಿ ಮತ್ತು ಚಲನಚಿತ್ರ\n" +
                    "\n" +
                    "ಬಿ. ವಿ. ಕಾರಂತ್ ಅವರು ಸಂಗೀತ, ಜನಪದ ಪರಂಪರೆ, ಪ್ರಾದೇಶಿಕ ಭಾಷೆಗಳು ಮತ್ತು ಆಧುನಿಕ ರಂಗತಂತ್ರಗಳನ್ನು ಬಳಸಿಕೊಂಡು ಕನ್ನಡ ಮತ್ತು ಭಾರತೀಯ ರಂಗಭೂಮಿಗೆ ಹೊಸ ರೂಪ ನೀಡಿದರು. ಅವರು ಕನ್ನಡ, ಹಿಂದಿ ಮತ್ತು ಹಲವು ಭಾರತೀಯ ಭಾಷೆಗಳಲ್ಲಿ ಅನೇಕ ಪ್ರಮುಖ ನಾಟಕಗಳನ್ನು ನಿರ್ದೇಶಿಸಿದರು. ಜೋಕುಮಾರ ಸ್ವಾಮಿ, ಸಂಕ್ರಾಂತಿ, ಹಯವದನ, ಹುಚ್ಚು ಕುದುರೆ, ಓಡಿಪಸ್, ಮ್ಯಾಕ್‌ಬೆತ್, ಕಿಂಗ್ ಲಿಯರ್ ಮತ್ತು ಘಾಶಿರಾಮ್ ಕೋಟ್ವಾಲ್ ಅವರ ಪ್ರಸಿದ್ಧ ನಿರ್ಮಾಣಗಳಲ್ಲಿ ಸೇರಿವೆ.\n" +
                    "\n" +
                    "ತಮ್ಮ ಪತ್ನಿ ಪ್ರೇಮಾ ಕಾರಂತ್ ಅವರೊಂದಿಗೆ ಅವರು ಬೆಂಗಳೂರಿನ ಪ್ರಸಿದ್ಧ ರಂಗಸಂಸ್ಥೆ ಬೆನಕವನ್ನು ಸ್ಥಾಪಿಸಿದರು. ಅವರು ಮಹತ್ವದ ರಂಗ ಸಂಸ್ಥೆಗಳ ನಿರ್ಮಾಣದಲ್ಲಿಯೂ ಪ್ರಮುಖ ಪಾತ್ರವಹಿಸಿದರು. ಭೋಪಾಲ್‌ನ ಭಾರತ ಭವನದಲ್ಲಿನ ರಂಗಮಂಡಲದ ಸ್ಥಾಪಕ ನಿರ್ದೇಶಕರಾಗಿದ್ದರು ಮತ್ತು ನಂತರ ಮೈಸೂರಿನ ರಂಗಾಯಣದ ಸ್ಥಾಪಕ ನಿರ್ದೇಶಕರಾದರು. ಕಾರ್ಯಾಗಾರಗಳು ಮತ್ತು ನಾಟಕ ನಿರ್ಮಾಣಗಳ ಮೂಲಕ ಅನೇಕ ನಟರನ್ನು ತರಬೇತುಗೊಳಿಸಿ, ಆಧುನಿಕ ರಂಗಭೂಮಿಯನ್ನು ಭಾರತದ ವಿವಿಧ ಭಾಗಗಳಿಗೆ ಹರಡಿದರು.\n" +
                    "\n" +
                    "ಕಾರಂತ್ ಅವರು ಭಾರತೀಯ ಚಲನಚಿತ್ರರಂಗಕ್ಕೂ ಕೊಡುಗೆ ನೀಡಿದರು. ಗಿರೀಶ್ ಕಾರ್ನಾಡ್ ಅವರೊಂದಿಗೆ ವಂಶವೃಕ್ಷ ಮತ್ತು ತಬ್ಬಲಿಯು ನೀನಾದೆ ಮಗನೆ ಮುಂತಾದ ಚಿತ್ರಗಳನ್ನು ಸಹನಿರ್ದೇಶಿಸಿದರು. ಹಲವು ಚಿತ್ರಗಳಿಗೆ ಸಂಗೀತ ಸಂಯೋಜಿಸಿದರು. ಅವರ ಕೆಲಸವು ಸಾಹಿತ್ಯ, ರಂಗಭೂಮಿ, ಜನಪದ ಕಲೆ ಮತ್ತು ಚಲನಚಿತ್ರಗಳನ್ನು ಒಟ್ಟುಗೂಡಿಸಿತು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಬಿ. ವಿ. ಕಾರಂತ್ ಅವರಿಗೆ ಸಂಗೀತ ನಾಟಕ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, ಪದ್ಮಶ್ರೀ, ಕಾಲಿದಾಸ ಸಮ್ಮಾನ್, ಗುಬ್ಬಿ ವೀರಣ್ಣ ಪ್ರಶಸ್ತಿ, ರಾಷ್ಟ್ರೀಯ ಚಲನಚಿತ್ರ ಪ್ರಶಸ್ತಿಗಳು, ಕರ್ನಾಟಕ ರಾಜ್ಯ ಚಲನಚಿತ್ರ ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಫಿಲ್ಮ್‌ಫೇರ್ ದಕ್ಷಿಣ ಪ್ರಶಸ್ತಿಗಳು ಸೇರಿದಂತೆ ಅನೇಕ ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಅವರು 1 ಸೆಪ್ಟೆಂಬರ್ 2002ರಂದು ಬೆಂಗಳೂರಿನಲ್ಲಿ ನಿಧನರಾದರು. ಸಂಗೀತ, ಜನಪದ ಸಂಸ್ಕೃತಿ ಮತ್ತು ಪ್ರಾದೇಶಿಕ ಕಲ್ಪನೆಗಳಲ್ಲಿ ಬೇರುಬಿಟ್ಟ ಹೊಸ ಭಾರತೀಯ ರಂಗಭಾಷೆಯನ್ನು ರೂಪಿಸಿದ ಮುಂಚೂಣಿ ವ್ಯಕ್ತಿಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Davanagere", "ದಾವಣಗೆರೆ", "H. S. Venkateshamurthy", "ಎಚ್. ಎಸ್. ವೆಂಕಟೇಶಮೂರ್ತಿ",
            "H. S. Venkateshamurthy, popularly known as HSV, was a major Kannada poet, playwright, critic, lyricist, and literary scholar. He was born on 23 June 1944 at Hodigere, now in Davanagere district, and completed his higher studies in Kannada at Central College, Bengaluru.\n" +
                    "\n" +
                    "HSV was known for lyrical modern Kannada poetry, bhavageete, plays, criticism, and film songs. He taught Kannada for many years and wrote more than a hundred books. His works brought together folk memory, classical literary influence, modern emotion, and musical beauty.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "He received honours such as the Karnataka Sahitya Academy Award, Rajyotsava Award, Sahitya Akademi Translation Prize, and other literary recognitions. He also wrote songs and screenplays for Kannada films. He passed away in Bengaluru on 30 May 2025 at the age of 80.\n",
            "ಎಚ್. ಎಸ್. ವೆಂಕಟೇಶಮೂರ್ತಿ, ಎಚ್‌ಎಸ್‌ವಿ ಎಂದು ಪ್ರಸಿದ್ಧರಾದವರು, ಕನ್ನಡದ ಪ್ರಮುಖ ಕವಿ, ನಾಟಕಕಾರ, ವಿಮರ್ಶಕ, ಗೀತರಚನೆಕಾರ ಮತ್ತು ಸಾಹಿತ್ಯ ಪಂಡಿತರಾಗಿದ್ದರು. ಅವರು 23 ಜೂನ್ 1944ರಂದು ಈಗಿನ ದಾವಣಗೆರೆ ಜಿಲ್ಲೆಯ ಹೊದಿಗೇರೆಯಲ್ಲಿ ಜನಿಸಿದರು. ಬೆಂಗಳೂರಿನ ಸೆಂಟ್ರಲ್ ಕಾಲೇಜಿನಲ್ಲಿ ಕನ್ನಡದಲ್ಲಿ ಉನ್ನತ ಶಿಕ್ಷಣ ಪಡೆದರು.\n" +
                    "\n" +
                    "ಎಚ್‌ಎಸ್‌ವಿ ಅವರು ಲಾಲಿತ್ಯಪೂರ್ಣ ಆಧುನಿಕ ಕಾವ್ಯ, ಭಾವಗೀತೆ, ನಾಟಕ, ವಿಮರ್ಶೆ ಮತ್ತು ಚಲನಚಿತ್ರ ಗೀತೆಗಳಿಗಾಗಿ ಪ್ರಸಿದ್ಧರಾದರು. ಅವರು ಅನೇಕ ವರ್ಷಗಳ ಕಾಲ ಕನ್ನಡ ಅಧ್ಯಾಪಕರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿ ನೂರಕ್ಕೂ ಹೆಚ್ಚು ಪುಸ್ತಕಗಳನ್ನು ರಚಿಸಿದರು. ಅವರ ಸಾಹಿತ್ಯದಲ್ಲಿ ಜನಪದ ಸ್ಮೃತಿ, ಶಾಸ್ತ್ರೀಯ ಪ್ರಭಾವ, ಆಧುನಿಕ ಭಾವನೆ ಮತ್ತು ಸಂಗೀತಾತ್ಮಕತೆ ಒಂದಾಗಿ ಕಾಣುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಅವರಿಗೆ ಕರ್ನಾಟಕ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ, ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಅನುವಾದ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಹಲವು ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಕನ್ನಡ ಚಿತ್ರರಂಗಕ್ಕೂ ಅವರು ಗೀತೆಗಳು ಮತ್ತು ಚಿತ್ರಕಥೆಗಳ ಮೂಲಕ ಕೊಡುಗೆ ನೀಡಿದ್ದಾರೆ. ಅವರು 30 ಮೇ 2025ರಂದು ಬೆಂಗಳೂರಿನಲ್ಲಿ 80ನೇ ವಯಸ್ಸಿನಲ್ಲಿ ನಿಧನರಾದರು.\n"),

        h("Davanagere", "ದಾವಣಗೆರೆ", "M. Chidananda Murthy", "ಎಂ. ಚಿದಾನಂದ ಮೂರ್ತಿ",
            "M. Chidananda Murthy (10 May 1931 – 11 January 2020) was a noted Kannada scholar, historian, epigraphist, and researcher. He was born at Doddamallapura in Channagiri taluk, now associated with Davanagere region. He became one of Karnataka’s leading scholars of Kannada language, inscriptions, and ancient Karnataka history.\n" +
                    "\n" +
                    "His doctoral research focused on the cultural study of Kannada inscriptions. He taught at Bangalore University and guided many students in Kannada research. His work helped place inscriptions, language history, and cultural history at the centre of Kannada studies.\n" +
                    "\n" +
                    "### Public Work and Legacy\n" +
                    "\n" +
                    "Chidananda Murthy campaigned for the protection of Hampi monuments and for classical language status for Kannada. He received honours including the Rajyotsava Award, Sahitya Akademi Award, and Pampa Award. He is remembered as a powerful voice for Kannada history, heritage, and identity.\n",
            "ಎಂ. ಚಿದಾನಂದ ಮೂರ್ತಿ (10 ಮೇ 1931 – 11 ಜನವರಿ 2020) ಅವರು ಪ್ರಸಿದ್ಧ ಕನ್ನಡ ಪಂಡಿತ, ಇತಿಹಾಸಕಾರ, ಶಾಸನ ತಜ್ಞ ಮತ್ತು ಸಂಶೋಧಕರಾಗಿದ್ದರು. ಅವರು ಈಗಿನ ದಾವಣಗೆರೆ ಪ್ರದೇಶಕ್ಕೆ ಸಂಬಂಧಿಸಿದ ಚನ್ನಗಿರಿ ತಾಲ್ಲೂಕಿನ ದೊಡ್ಡಮಲ್ಲಾಪುರದಲ್ಲಿ ಜನಿಸಿದರು. ಕನ್ನಡ ಭಾಷೆ, ಶಾಸನಗಳು ಮತ್ತು ಪ್ರಾಚೀನ ಕರ್ನಾಟಕ ಇತಿಹಾಸದ ಪ್ರಮುಖ ಪಂಡಿತರಾಗಿ ಹೆಸರು ಪಡೆದರು.\n" +
                    "\n" +
                    "ಅವರ ಡಾಕ್ಟರೇಟ್ ಸಂಶೋಧನೆ ಕನ್ನಡ ಶಾಸನಗಳ ಸಾಂಸ್ಕೃತಿಕ ಅಧ್ಯಯನದ ಮೇಲೆ ಕೇಂದ್ರೀಕೃತವಾಗಿತ್ತು. ಅವರು ಬೆಂಗಳೂರು ವಿಶ್ವವಿದ್ಯಾಲಯದಲ್ಲಿ ಬೋಧನೆ ಮಾಡಿ ಅನೇಕ ಸಂಶೋಧಕರಿಗೆ ಮಾರ್ಗದರ್ಶನ ನೀಡಿದರು. ಶಾಸನ, ಭಾಷಾ ಇತಿಹಾಸ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಇತಿಹಾಸವನ್ನು ಕನ್ನಡ ಅಧ್ಯಯನದ ಕೇಂದ್ರಕ್ಕೆ ತರುವಲ್ಲಿ ಅವರ ಕೆಲಸ ಮಹತ್ವದ್ದಾಗಿದೆ.\n" +
                    "\n" +
                    "### ಸಾರ್ವಜನಿಕ ಕೆಲಸ ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಚಿದಾನಂದ ಮೂರ್ತಿ ಅವರು ಹಂಪಿ ಸ್ಮಾರಕಗಳ ಸಂರಕ್ಷಣೆ ಮತ್ತು ಕನ್ನಡಕ್ಕೆ ಶಾಸ್ತ್ರೀಯ ಭಾಷಾ ಸ್ಥಾನಮಾನ ದೊರಕಲು ಹೋರಾಡಿದರು. ಅವರಿಗೆ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ, ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಪಂಪ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಹಲವು ಗೌರವಗಳು ದೊರಕಿವೆ. ಕನ್ನಡ ಇತಿಹಾಸ, ಪರಂಪರೆ ಮತ್ತು ಗುರುತಿನ ಬಲವಾದ ಧ್ವನಿಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Dharwad", "ಧಾರವಾಡ", "D. R. Bendre", "ಡಿ. ಆರ್. ಬೇೇಂದ್ರೆ",
            "D. R. Bendre, full name Dattatreya Ramachandra Bendre (31 January 1896 – 26 October 1981), was one of the greatest Kannada poets of the 20th century. Born in Dharwad, he became a leading figure of the Navodaya movement and wrote under the poetic name Ambikatanayadatta.\n" +
                    "\n" +
                    "Bendre’s poetry is famous for its musical quality, philosophical depth, and use of Dharwad Kannada. His important works include Sakheegeeta, Naadaleele, Aralu Maralu, and Naaku Tanti. He was lovingly called Varakavi, meaning a gifted poet-seer.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "He received the Sahitya Akademi Award, Padma Shri, and the Jnanpith Award in 1973 for Naaku Tanti. Bendre remains one of the most loved and influential poets in Kannada literature.\n",
            "ಡಿ. ಆರ್. ಬೇೇಂದ್ರೆ ಅವರ ಪೂರ್ಣ ಹೆಸರು ದತ್ತಾತ್ರೇಯ ರಾಮಚಂದ್ರ ಬೇೇಂದ್ರೆ (31 ಜನವರಿ 1896 – 26 ಅಕ್ಟೋಬರ್ 1981). ಅವರು 20ನೇ ಶತಮಾನದ ಕನ್ನಡದ ಮಹಾನ್ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಧಾರವಾಡದಲ್ಲಿ ಜನಿಸಿದ ಅವರು ನವೋದಯ ಚಳವಳಿಯ ಪ್ರಮುಖ ಕವಿಯಾಗಿ ಬೆಳೆದರು ಮತ್ತು ಅಂಬಿಕಾತನಯದತ್ತ ಎಂಬ ಕಾವ್ಯನಾಮದಿಂದಲೂ ಬರೆಯುತ್ತಿದ್ದರು.\n" +
                    "\n" +
                    "ಬೇೇಂದ್ರೆಯವರ ಕಾವ್ಯ ಸಂಗೀತಾತ್ಮಕತೆ, ತಾತ್ವಿಕ ಆಳ ಮತ್ತು ಧಾರವಾಡ ಕನ್ನಡದ ಸೊಗಸಿಗಾಗಿ ಪ್ರಸಿದ್ಧವಾಗಿದೆ. ಸಖೀಗೀತ, ನಾದಲೀಲೆ, ಅರಳು ಮರಳು ಮತ್ತು ನಾಕು ತಂತಿ ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳಾಗಿವೆ. ಅವರನ್ನು ಪ್ರೀತಿಯಿಂದ ವರಕವಿ ಎಂದು ಕರೆಯಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಅವರಿಗೆ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, ಪದ್ಮಶ್ರೀ ಮತ್ತು 1973ರಲ್ಲಿ ನಾಕು ತಂತಿ ಕೃತಿಗೆ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು. ಬೇೇಂದ್ರೆ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಅತ್ಯಂತ ಪ್ರೀತಿಪಾತ್ರ ಮತ್ತು ಪ್ರಭಾವಿ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಉಳಿದಿದ್ದಾರೆ.\n"),

        h("Dharwad", "ಧಾರವಾಡ", "Alur Venkata Rao", "ಆಲೂರು ವೆಂಕಟರಾವ್",
            "Alur Venkata Rao was a writer, historian, journalist, and activist who played a major role in the Karnataka unification movement. He is widely remembered as Karnataka Kulapurohita for awakening Kannada identity and arguing for the unity of Kannada-speaking regions.\n" +
                    "\n" +
                    "Through his writings, speeches, and organisational work, he promoted pride in Karnataka’s history, language, and culture. He helped create political and cultural awareness among Kannadigas when Kannada-speaking areas were divided under different administrations.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Alur Venkata Rao’s work gave intellectual strength to the Ekikarana movement. He is remembered as one of the key builders of modern Kannada consciousness and Karnataka identity.\n",
            "ಆಲೂರು ವೆಂಕಟರಾವ್ ಅವರು ಕರ್ನಾಟಕ ಏಕೀಕರಣ ಚಳವಳಿಯಲ್ಲಿ ಪ್ರಮುಖ ಪಾತ್ರವಹಿಸಿದ ಬರಹಗಾರ, ಇತಿಹಾಸಕಾರ, ಪತ್ರಕರ್ತ ಮತ್ತು ಹೋರಾಟಗಾರರಾಗಿದ್ದರು. ಕನ್ನಡ ಮಾತನಾಡುವ ಪ್ರದೇಶಗಳ ಏಕತೆಗೆ ಬಲವಾದ ಧ್ವನಿಯಾಗಿ, ಕನ್ನಡ ಗುರುತನ್ನು ಜಾಗೃತಗೊಳಿಸಿದ ಕಾರಣ ಅವರಿಗೆ ಕರ್ನಾಟಕ ಕುಲಪುರೋಹಿತ ಎಂಬ ಹೆಸರು ದೊರಕಿತು.\n" +
                    "\n" +
                    "ತಮ್ಮ ಬರಹಗಳು, ಭಾಷಣಗಳು ಮತ್ತು ಸಂಘಟನಾ ಕಾರ್ಯಗಳ ಮೂಲಕ ಅವರು ಕರ್ನಾಟಕದ ಇತಿಹಾಸ, ಭಾಷೆ ಮತ್ತು ಸಂಸ್ಕೃತಿಯ ಬಗ್ಗೆ ಹೆಮ್ಮೆ ಮೂಡಿಸಿದರು. ಕನ್ನಡ ಪ್ರದೇಶಗಳು ಬೇರೆ ಬೇರೆ ಆಡಳಿತಗಳಡಿಯಲ್ಲಿ ವಿಭಜಿತವಾಗಿದ್ದ ಕಾಲದಲ್ಲಿ ಅವರು ಕನ್ನಡಿಗರಲ್ಲಿ ರಾಜಕೀಯ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಜಾಗೃತಿ ಮೂಡಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಆಲೂರು ವೆಂಕಟರಾವ್ ಅವರ ಕೆಲಸ ಕರ್ನಾಟಕ ಏಕೀಕರಣ ಚಳವಳಿಗೆ ಬೌದ್ಧಿಕ ಬಲ ನೀಡಿತು. ಆಧುನಿಕ ಕನ್ನಡ ಚೇತನ ಮತ್ತು ಕರ್ನಾಟಕ ಗುರುತಿನ ಪ್ರಮುಖ ನಿರ್ಮಾತೃಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Dharwad", "ಧಾರವಾಡ", "V. K. Gokak", "ವಿ. ಕೆ. ಗೋಕಾಕ್",
            "V. K. Gokak, full name Vinayaka Krishna Gokak, was a Kannada poet, scholar, critic, professor, and Jnanpith awardee. He was one of the major literary figures of modern Kannada and wrote poetry, criticism, essays, and works in English and Kannada.\n" +
                    "\n" +
                    "He is closely associated with the Navya phase of Kannada literature and later became famous for his role in the Gokak movement, which demanded primacy for Kannada in education in Karnataka. His epic work Bharatha Sindhu Rashmi is among his best-known writings.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Gokak received the Jnanpith Award in 1990. He is remembered both as a major Kannada literary personality and as a public intellectual who defended the place of Kannada language in education and culture.\n",
            "ವಿ. ಕೆ. ಗೋಕಾಕ್, ಪೂರ್ಣ ಹೆಸರು ವಿನಾಯಕ ಕೃಷ್ಣ ಗೋಕಾಕ್, ಕನ್ನಡದ ಕವಿ, ಪಂಡಿತ, ವಿಮರ್ಶಕ, ಪ್ರಾಧ್ಯಾಪಕ ಮತ್ತು ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಪುರಸ್ಕೃತರು. ಅವರು ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಪ್ರಮುಖ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಕಾವ್ಯ, ವಿಮರ್ಶೆ, ಪ್ರಬಂಧ ಮತ್ತು ಇಂಗ್ಲಿಷ್-ಕನ್ನಡ ಎರಡೂ ಭಾಷೆಗಳಲ್ಲಿ ಹಲವು ಕೃತಿಗಳನ್ನು ರಚಿಸಿದರು.\n" +
                    "\n" +
                    "ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ನವ್ಯ ಹಂತದೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದ್ದರು. ನಂತರ ಕರ್ನಾಟಕದ ಶಿಕ್ಷಣದಲ್ಲಿ ಕನ್ನಡಕ್ಕೆ ಪ್ರಾಮುಖ್ಯತೆ ನೀಡಬೇಕೆಂದು ಒತ್ತಾಯಿಸಿದ ಗೋಕಾಕ್ ಚಳವಳಿಯೊಂದಿಗೆ ಪ್ರಸಿದ್ಧರಾದರು. ಭಾರತ ಸಿಂಧು ರಶ್ಮಿ ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳಲ್ಲಿ ಒಂದಾಗಿದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಗೋಕಾಕ್ ಅವರಿಗೆ 1990ರಲ್ಲಿ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು. ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಪ್ರಮುಖ ವ್ಯಕ್ತಿಯಾಗಿ ಮತ್ತು ಶಿಕ್ಷಣ-ಸಂಸ್ಕೃತಿಯಲ್ಲಿ ಕನ್ನಡದ ಸ್ಥಾನವನ್ನು ಸಮರ್ಥಿಸಿದ ಸಾರ್ವಜನಿಕ ಚಿಂತಕರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Gadag", "ಗದಗ", "Kumaravyasa", "ಕುಮಾರವ್ಯಾಸ",
            "Kumaravyasa, also known as Naranappa, was a great medieval Kannada poet associated with Gadag. He is best known for Karnata Bharata Kathamanjari, popularly called Kumaravyasa Bharata, a Kannada retelling of the Mahabharata.\n" +
                    "\n" +
                    "His work covers the first ten parvas of the Mahabharata and is written in the Bhamini Shatpadi metre, one of the important poetic forms of Kannada literature. Kumaravyasa’s poetry is celebrated for its powerful imagination, dramatic narration, rich metaphors, and deep understanding of human character.\n" +
                    "\n" +
                    "### Literary Importance\n" +
                    "\n" +
                    "Kumaravyasa did not simply translate the Sanskrit Mahabharata. He gave the story a distinct Kannada voice, with local feeling, emotional force, and poetic freshness. His portrayal of characters such as Krishna, Arjuna, Draupadi, Bhima, and Karna has had a lasting influence on Kannada literary culture.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Kumaravyasa Bharata remains one of the most loved classics of Kannada literature. It has been recited, studied, and performed for centuries through gamaka, traditional storytelling, and literary study. Kumaravyasa is remembered as one of the greatest poets in the Kannada Mahabharata tradition.\n",
            "ಕುಮಾರವ್ಯಾಸ, ನಾರಣಪ್ಪ ಎಂದೂ ಪ್ರಸಿದ್ಧರಾದವರು, ಗದಗದೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದ ಮಹಾನ್ ಮಧ್ಯಯುಗದ ಕನ್ನಡ ಕವಿ. ಅವರು ಕರ್ನಾಟಕ ಭಾರತ ಕಥಾಮಂಜರಿ ಅಥವಾ ಕುಮಾರವ್ಯಾಸ ಭಾರತ ಎಂಬ ಮಹಾಭಾರತದ ಕನ್ನಡ ರೂಪಾಂತರಕ್ಕಾಗಿ ಪ್ರಸಿದ್ಧರು.\n" +
                    "\n" +
                    "ಅವರ ಕೃತಿ ಮಹಾಭಾರತದ ಮೊದಲ ಹತ್ತು ಪರ್ವಗಳನ್ನು ಒಳಗೊಂಡಿದೆ. ಇದು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಪ್ರಮುಖ ಛಂದಸ್ಸುಗಳಲ್ಲಿ ಒಂದಾದ ಭಾಮಿನಿ ಷಟ್ಪದಿಯಲ್ಲಿ ರಚಿಸಲ್ಪಟ್ಟಿದೆ. ಕುಮಾರವ್ಯಾಸರ ಕಾವ್ಯವು ಶಕ್ತಿಶಾಲಿ ಕಲ್ಪನೆ, ನಾಟಕೀಯ ನಿರೂಪಣೆ, ಸಮೃದ್ಧ ರೂಪಕಗಳು ಮತ್ತು ಮಾನವ ಸ್ವಭಾವದ ಆಳವಾದ ಅರಿವಿಗಾಗಿ ಪ್ರಸಿದ್ಧವಾಗಿದೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಮಹತ್ವ\n" +
                    "\n" +
                    "ಕುಮಾರವ್ಯಾಸರು ಸಂಸ್ಕೃತ ಮಹಾಭಾರತವನ್ನು ಸರಳವಾಗಿ ಅನುವಾದಿಸಲಿಲ್ಲ. ಅವರು ಆ ಕಥೆಗೆ ಕನ್ನಡದ ಸ್ವಂತ ಧ್ವನಿ, ಸ್ಥಳೀಯ ಭಾವನೆ, ಭಾವನಾತ್ಮಕ ಶಕ್ತಿ ಮತ್ತು ಕಾವ್ಯಸೊಗಸನ್ನು ನೀಡಿದರು. ಕೃಷ್ಣ, ಅರ್ಜುನ, ದ್ರೌಪದಿ, ಭೀಮ ಮತ್ತು ಕರ್ಣ ಮುಂತಾದ ಪಾತ್ರಗಳ ಅವರ ಚಿತ್ರಣ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಸಂಸ್ಕೃತಿಯ ಮೇಲೆ ದೀರ್ಘಕಾಲದ ಪ್ರಭಾವ ಬೀರಿದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಕುಮಾರವ್ಯಾಸ ಭಾರತವು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಅತ್ಯಂತ ಪ್ರೀತಿಪಾತ್ರ ಶ್ರೇಷ್ಠ ಕೃತಿಗಳಲ್ಲಿ ಒಂದಾಗಿದೆ. ಗಮಕ, ಸಾಂಪ್ರದಾಯಿಕ ಕಥನ ಮತ್ತು ಸಾಹಿತ್ಯ ಅಧ್ಯಯನಗಳ ಮೂಲಕ ಈ ಕೃತಿ ಶತಮಾನಗಳಿಂದ ಪಠಿಸಲ್ಪಡುತ್ತಿದೆ ಮತ್ತು ಅಧ್ಯಯನಗೊಳ್ಳುತ್ತಿದೆ. ಕುಮಾರವ್ಯಾಸರು ಕನ್ನಡ ಮಹಾಭಾರತ ಪರಂಪರೆಯ ಮಹಾನ್ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Gadag", "ಗದಗ", "Puttaraj Gawai", "ಪುತ್ತರಾಜ ಗವಾಯಿ",
            "Pandit Puttaraj Gawai (3 March 1914 – 17 September 2010) was a renowned Hindustani classical musician, Carnatic musician, scholar, spiritual leader, teacher, and social worker. Though born at Devagiri in present-day Haveri district, his life and work are deeply connected with Gadag through Veereshwara Punyashrama.\n" +
                    "\n" +
                    "He lost his eyesight in infancy, but became a master of music, literature, and spirituality. He was trained under Ganayogi Panchakshara Gawai and later became the pontiff of Veereshwara Punyashrama, Gadag. He mastered several instruments including harmonium, tabla, violin, veena, and mridangam, and was respected in both Hindustani and Carnatic music traditions.\n" +
                    "\n" +
                    "### Social Service\n" +
                    "\n" +
                    "Puttaraj Gawai dedicated his life to the education and welfare of blind, orphaned, poor, and disabled students. Veereshwara Punyashrama provided free food, shelter, education, and music training to thousands of students without discrimination of caste or religion. Many of his students became musicians, teachers, stage artists, and performers.\n" +
                    "\n" +
                    "He also wrote more than 80 books in Kannada, Sanskrit, and Hindi, and contributed to devotional music, vachana singing, theatre, and spiritual literature.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "Puttaraj Gawai received several honours, including the Padma Bhushan, Sangeet Natak Akademi Award, Karnataka Rajyotsava Award, Nadoja Award, and Kalidas Samman. He passed away at Gadag in 2010. He is remembered as Ganayogi, a saint-musician who used music as a path of service and compassion.\n",
            "ಪಂಡಿತ ಪುತ್ತರಾಜ ಗವಾಯಿ (3 ಮಾರ್ಚ್ 1914 – 17 ಸೆಪ್ಟೆಂಬರ್ 2010) ಅವರು ಪ್ರಸಿದ್ಧ ಹಿಂದೂಸ್ತಾನಿ ಶಾಸ್ತ್ರೀಯ ಸಂಗೀತಗಾರ, ಕರ್ಣಾಟಕ ಸಂಗೀತಗಾರ, ಪಂಡಿತ, ಆಧ್ಯಾತ್ಮಿಕ ನಾಯಕ, ಗುರು ಮತ್ತು ಸಮಾಜಸೇವಕರಾಗಿದ್ದರು. ಅವರು ಈಗಿನ ಹಾವೇರಿ ಜಿಲ್ಲೆಯ ದೇವಗಿರಿಯಲ್ಲಿ ಜನಿಸಿದರೂ, ಅವರ ಜೀವನ ಮತ್ತು ಸೇವೆ ಗದಗಿನ ವೀರೇಶ್ವರ ಪುಣ್ಯಾಶ್ರಮದೊಂದಿಗೆ ಆಳವಾಗಿ ಸಂಬಂಧ ಹೊಂದಿದೆ.\n" +
                    "\n" +
                    "ಬಾಲ್ಯದಲ್ಲಿಯೇ ದೃಷ್ಟಿ ಕಳೆದುಕೊಂಡರೂ, ಅವರು ಸಂಗೀತ, ಸಾಹಿತ್ಯ ಮತ್ತು ಆಧ್ಯಾತ್ಮಿಕತೆಯಲ್ಲಿ ಮಹಾನ್ ಸಾಧಕರಾದರು. ಗಾನಯೋಗಿ ಪಂಚಾಕ್ಷರ ಗವಾಯಿ ಅವರ ಬಳಿ ತರಬೇತಿ ಪಡೆದು ನಂತರ ಗದಗಿನ ವೀರೇಶ್ವರ ಪುಣ್ಯಾಶ್ರಮದ ಪೀಠಾಧಿಪತಿಯಾದರು. ಹಾರ್ಮೋನಿಯಂ, ತಬಲಾ, ವೈಯಲಿನ್, ವೀಣೆ ಮತ್ತು ಮೃದಂಗ ಸೇರಿದಂತೆ ಅನೇಕ ವಾದ್ಯಗಳಲ್ಲಿ ಅವರು ಪಾಂಡಿತ್ಯ ಪಡೆದಿದ್ದರು. ಹಿಂದೂಸ್ತಾನಿ ಮತ್ತು ಕರ್ಣಾಟಕ ಸಂಗೀತ ಎರಡೂ ಪರಂಪರೆಗಳಲ್ಲಿ ಗೌರವಿಸಲ್ಪಟ್ಟರು.\n" +
                    "\n" +
                    "### ಸಮಾಜಸೇವೆ\n" +
                    "\n" +
                    "ಪುತ್ತರಾಜ ಗವಾಯಿ ಅವರು ಅಂಧ, ಅನಾಥ, ಬಡ ಮತ್ತು ಅಂಗವಿಕಲ ವಿದ್ಯಾರ್ಥಿಗಳ ಶಿಕ್ಷಣ ಮತ್ತು ಕಲ್ಯಾಣಕ್ಕಾಗಿ ತಮ್ಮ ಜೀವನವನ್ನು ಸಮರ್ಪಿಸಿದರು. ವೀರೇಶ್ವರ ಪುಣ್ಯಾಶ್ರಮವು ಜಾತಿ-ಧರ್ಮ ಭೇದವಿಲ್ಲದೆ ಸಾವಿರಾರು ವಿದ್ಯಾರ್ಥಿಗಳಿಗೆ ಉಚಿತ ಆಹಾರ, ವಸತಿ, ಶಿಕ್ಷಣ ಮತ್ತು ಸಂಗೀತ ತರಬೇತಿ ನೀಡಿತು. ಅವರ ಅನೇಕ ಶಿಷ್ಯರು ಸಂಗೀತಗಾರರು, ಶಿಕ್ಷಕರು, ರಂಗ ಕಲಾವಿದರು ಮತ್ತು ಪ್ರದರ್ಶಕರಾಗಿ ಬೆಳೆದರು.\n" +
                    "\n" +
                    "ಅವರು ಕನ್ನಡ, ಸಂಸ್ಕೃತ ಮತ್ತು ಹಿಂದಿಯಲ್ಲಿ 80ಕ್ಕೂ ಹೆಚ್ಚು ಪುಸ್ತಕಗಳನ್ನು ರಚಿಸಿದರು. ಭಕ್ತಿ ಸಂಗೀತ, ವಚನ ಗಾಯನ, ರಂಗಭೂಮಿ ಮತ್ತು ಆಧ್ಯಾತ್ಮಿಕ ಸಾಹಿತ್ಯಕ್ಕೂ ಮಹತ್ವದ ಕೊಡುಗೆ ನೀಡಿದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಪುತ್ತರಾಜ ಗವಾಯಿ ಅವರಿಗೆ ಪದ್ಮಭೂಷಣ, ಸಂಗೀತ ನಾಟಕ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, ಕರ್ನಾಟಕ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ, ನಾಡೋಜ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಕಾಲಿದಾಸ ಸಮ್ಮಾನ್ ಸೇರಿದಂತೆ ಅನೇಕ ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಅವರು 2010ರಲ್ಲಿ ಗದಗದಲ್ಲಿ ನಿಧನರಾದರು. ಸಂಗೀತವನ್ನು ಸೇವೆ ಮತ್ತು ಕರುಣೆಯ ಮಾರ್ಗವನ್ನಾಗಿ ಮಾಡಿದ ಗಾನಯೋಗಿಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Hassan", "ಹಾಸನ", "Gorur Ramaswamy Iyengar", "ಗೊರೂರು ರಾಮಸ್ವಾಮಿ ಅಯ್ಯಂಗಾರ್",
            "Gorur Ramaswamy Iyengar (4 July 1904 – 28 September 1991), popularly known as Gorur, was a Kannada writer, humourist, satirist, and freedom movement participant from Gorur in Hassan district. He became one of Kannada’s best-known writers of rural life.\n" +
                    "\n" +
                    "Influenced by Mahatma Gandhi, Gorur took part in the Indian freedom movement and was jailed by the British in 1942 during the Quit India Movement. His writing reflected village life, ordinary people, humour, social observation, and Gandhian values.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "His early books Halliya Chitragalu and Namma Oorina Rasikaru became famous for their lively descriptions of rural Karnataka. His travelogue Amerikadalli Goruru won the Sahitya Akademi Award in 1981. His story Bhootayyana Maga Ayyu was adapted into a well-known Kannada film.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Gorur Ramaswamy Iyengar is remembered for bringing the humour, wisdom, simplicity, and contradictions of village life into Kannada prose. A road in Bengaluru has been named after him, and his works continue to be read for their warmth and social insight.\n",
            "ಗೊರೂರು ರಾಮಸ್ವಾಮಿ ಅಯ್ಯಂಗಾರ್ (4 ಜುಲೈ 1904 – 28 ಸೆಪ್ಟೆಂಬರ್ 1991), ಗೊರೂರು ಎಂದೇ ಪ್ರಸಿದ್ಧರಾದವರು, ಹಾಸನ ಜಿಲ್ಲೆಯ ಗೊರೂರಿನ ಕನ್ನಡ ಬರಹಗಾರ, ಹಾಸ್ಯಕಾರ, ವ್ಯಂಗ್ಯಕಾರ ಮತ್ತು ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯ ಭಾಗವಹಿಸಿದವರು. ಗ್ರಾಮೀಣ ಜೀವನದ ಬರವಣಿಗೆಯಲ್ಲಿ ಅವರು ಕನ್ನಡದ ಪ್ರಸಿದ್ಧ ಲೇಖಕರಲ್ಲಿ ಒಬ್ಬರಾದರು.\n" +
                    "\n" +
                    "ಮಹಾತ್ಮ ಗಾಂಧಿಯಿಂದ ಪ್ರೇರಿತರಾದ ಗೊರೂರು ಅವರು ಭಾರತದ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಲ್ಲಿ ಭಾಗವಹಿಸಿದರು. 1942ರ ಕ್ವಿಟ್ ಇಂಡಿಯಾ ಚಳವಳಿಯ ಸಂದರ್ಭದಲ್ಲಿ ಬ್ರಿಟಿಷರಿಂದ ಜೈಲಿಗೆ ಕಳುಹಿಸಲ್ಪಟ್ಟರು. ಅವರ ಬರಹಗಳಲ್ಲಿ ಗ್ರಾಮೀಣ ಜೀವನ, ಸಾಮಾನ್ಯ ಜನರು, ಹಾಸ್ಯ, ಸಾಮಾಜಿಕ ಅವಲೋಕನ ಮತ್ತು ಗಾಂಧೀಯ ಮೌಲ್ಯಗಳು ಕಂಡುಬರುತ್ತವೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಅವರ ಆರಂಭಿಕ ಕೃತಿಗಳಾದ ಹಳ್ಳಿಯ ಚಿತ್ರಗಳು ಮತ್ತು ನಮ್ಮ ಊರಿನ ರಸಿಕರು ಗ್ರಾಮೀಣ ಕರ್ನಾಟಕದ ಜೀವಂತ ಚಿತ್ರಣಕ್ಕಾಗಿ ಪ್ರಸಿದ್ಧವಾದವು. ಅವರ ಪ್ರವಾಸಕಥನ ಅಮೆರಿಕದಲ್ಲಿ ಗೊರೂರು 1981ರಲ್ಲಿ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿಯನ್ನು ಪಡೆದಿತು. ಅವರ ಭೂತಯ್ಯನ ಮಗ ಅಯ್ಯು ಕಥೆ ಪ್ರಸಿದ್ಧ ಕನ್ನಡ ಚಲನಚಿತ್ರವಾಗಿ ರೂಪುಗೊಂಡಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಗೊರೂರು ರಾಮಸ್ವಾಮಿ ಅಯ್ಯಂಗಾರ್ ಅವರು ಗ್ರಾಮೀಣ ಜೀವನದ ಹಾಸ್ಯ, ಜ್ಞಾನ, ಸರಳತೆ ಮತ್ತು ವೈರುಧ್ಯಗಳನ್ನು ಕನ್ನಡ ಗದ್ಯಕ್ಕೆ ತಂದ ಬರಹಗಾರರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಬೆಂಗಳೂರಿನಲ್ಲಿ ಅವರ ಹೆಸರಿನ ರಸ್ತೆ ಇದೆ. ಅವರ ಕೃತಿಗಳು ಇಂದಿಗೂ ಆತ್ಮೀಯತೆ ಮತ್ತು ಸಾಮಾಜಿಕ ಒಳನೋಟಕ್ಕಾಗಿ ಓದಲ್ಪಡುತ್ತಿವೆ.\n"),

        h("Hassan", "ಹಾಸನ", "A. N. Murthy Rao", "ಎ. ಎನ್. ಮೂರ್ತಿ ರಾವ್",
            "A. N. Murthy Rao, full name Akkihebbalu Narasimha Murthy Rao (16 June 1900 – 23 August 2003), was a major Kannada essayist, critic, scholar, teacher, and modern prose writer. He was born at Akkihebbalu and spent part of his early life in the old Mysore region, which is culturally connected with Hassan and Mandya districts.\n" +
                    "\n" +
                    "Murthy Rao taught at institutions such as Maharaja’s College, Mysore, and Central College, Bengaluru. He also served as the first director of the Kannada and Culture Department and as president of the Kannada Sahitya Parishat. His writing is known for clarity, rational thought, literary sensitivity, and elegant Kannada prose.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "He wrote essays, criticism, plays, travel writing, translations, and literary studies. His famous book Devaru became an important work in Kannada intellectual writing. His Chitragalu Mattu Patragalu received the Sahitya Akademi Award.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "A. N. Murthy Rao lived for more than a century and remained active in Kannada literary life for decades. He received honours such as the Rajyotsava Award, Nadoja Award, Pampa Award, and Sahitya Akademi Award. He is remembered as one of the finest prose stylists and public intellectuals in Kannada.\n",
            "ಎ. ಎನ್. ಮೂರ್ತಿ ರಾವ್ ಅವರ ಪೂರ್ಣ ಹೆಸರು ಅಕ್ಕಿಹೆಬ್ಬಾಳು ನರಸಿಂಹ ಮೂರ್ತಿ ರಾವ್ (16 ಜೂನ್ 1900 – 23 ಆಗಸ್ಟ್ 2003). ಅವರು ಕನ್ನಡದ ಪ್ರಮುಖ ಪ್ರಬಂಧಕಾರ, ವಿಮರ್ಶಕ, ಪಂಡಿತ, ಶಿಕ್ಷಕ ಮತ್ತು ಆಧುನಿಕ ಗದ್ಯ ಬರಹಗಾರರಾಗಿದ್ದರು. ಅವರು ಅಕ್ಕಿಹೆಬ್ಬಾಳಿನಲ್ಲಿ ಜನಿಸಿದರು ಮತ್ತು ಹಳೆಯ ಮೈಸೂರು ಪ್ರದೇಶದಲ್ಲಿ ಬೆಳೆದರು. ಈ ಪ್ರದೇಶವು ಹಾಸನ ಮತ್ತು ಮಂಡ್ಯ ಜಿಲ್ಲೆಗಳ ಸಾಂಸ್ಕೃತಿಕ ವಲಯದೊಂದಿಗೆ ಆಳವಾಗಿ ಸಂಬಂಧ ಹೊಂದಿದೆ.\n" +
                    "\n" +
                    "ಮೂರ್ತಿ ರಾವ್ ಅವರು ಮೈಸೂರಿನ ಮಹಾರಾಜ ಕಾಲೇಜು ಮತ್ತು ಬೆಂಗಳೂರಿನ ಸೆಂಟ್ರಲ್ ಕಾಲೇಜು ಸೇರಿದಂತೆ ಹಲವು ಸಂಸ್ಥೆಗಳಲ್ಲಿ ಬೋಧಿಸಿದರು. ಅವರು ಕನ್ನಡ ಮತ್ತು ಸಂಸ್ಕೃತಿ ಇಲಾಖೆಯ ಮೊದಲ ನಿರ್ದೇಶಕರಾಗಿ ಹಾಗೂ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಪರಿಷತ್ತಿನ ಅಧ್ಯಕ್ಷರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಅವರ ಬರಹಗಳು ಸ್ಪಷ್ಟತೆ, ತಾರ್ಕಿಕ ಚಿಂತನೆ, ಸಾಹಿತ್ಯ ಸಂವೇದನೆ ಮತ್ತು ಸುಂದರ ಕನ್ನಡ ಗದ್ಯಕ್ಕಾಗಿ ಪ್ರಸಿದ್ಧವಾಗಿವೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಅವರು ಪ್ರಬಂಧ, ವಿಮರ್ಶೆ, ನಾಟಕ, ಪ್ರವಾಸ ಬರಹ, ಅನುವಾದ ಮತ್ತು ಸಾಹಿತ್ಯ ಅಧ್ಯಯನಗಳನ್ನು ರಚಿಸಿದರು. ಅವರ ದೇವರು ಕೃತಿ ಕನ್ನಡ ಬೌದ್ಧಿಕ ಬರವಣಿಗೆಯ ಪ್ರಮುಖ ಕೃತಿಯಾಗಿ ಪ್ರಸಿದ್ಧವಾಗಿದೆ. ಚಿತ್ರಗಳು ಮತ್ತು ಪತ್ರಗಳು ಕೃತಿಗೆ ಅವರಿಗೆ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಎ. ಎನ್. ಮೂರ್ತಿ ರಾವ್ ಅವರು ಶತಮಾನಕ್ಕೂ ಹೆಚ್ಚು ಕಾಲ ಬದುಕಿ, ಹಲವು ದಶಕಗಳ ಕಾಲ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಜೀವನದಲ್ಲಿ ಸಕ್ರಿಯರಾಗಿದ್ದರು. ಅವರಿಗೆ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ, ನಾಡೋಜ ಪ್ರಶಸ್ತಿ, ಪಂಪ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಹಲವು ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಕನ್ನಡದ ಶ್ರೇಷ್ಠ ಗದ್ಯಶೈಲಿಕಾರರು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಚಿಂತಕರಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),
        h("Haveri", "ಹಾವೇರಿ", "Mailara Mahadevappa", "ಮೈಲಾರ ಮಹದೇವಪ್ಪ",
            "Mailara Mahadevappa (8 June 1911 – 1 April 1943), also known as Mahadeva Mailara, was a brave freedom fighter from Motebennur in present-day Haveri district of Karnataka. He was born to Martandappa and Basamma and grew up during the period when Mahatma Gandhi’s national movement was spreading across India.\n" +
                    "\n" +
                    "At the young age of 18, Mahadevappa joined Mahatma Gandhi’s historic Dandi March in 1930 and is remembered as the only representative from Karnataka to accompany Gandhi in that march. He also participated in the Non-Cooperation Movement and other anti-British activities.\n" +
                    "\n" +
                    "### Freedom Struggle and Martyrdom\n" +
                    "\n" +
                    "During the Quit India period, Mailara Mahadevappa became active in resisting British authority in the Haveri region. He worked with local followers to oppose colonial revenue collection and supported the cause of farmers who were suffering under British policies.\n" +
                    "\n" +
                    "On 1 April 1943, he was shot dead by police along with his companions Tirakappa Madivalar and Veerayya Hiremath while attempting to seize land revenue collected from farmers at Hosaritti. He was only 31 years old at the time of his martyrdom.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Mailara Mahadevappa is remembered as one of Karnataka’s courageous freedom fighters and martyrs. In 2018, India Post issued a commemorative stamp in his honour. His life continues to inspire people as an example of youthful courage, Gandhian commitment, and sacrifice for India’s freedom.\n",
            "ಮೈಲಾರ ಮಹದೇವಪ್ಪ (8 ಜೂನ್ 1911 – 1 ಏಪ್ರಿಲ್ 1943), ಮಹದೇವ ಮೈಲಾರ ಎಂದೂ ಪ್ರಸಿದ್ಧರಾದವರು, ಕರ್ನಾಟಕದ ಈಗಿನ ಹಾವೇರಿ ಜಿಲ್ಲೆಯ ಮೋಟೆಬೆನ್ನೂರಿನ ಧೈರ್ಯಶಾಲಿ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರರಾಗಿದ್ದರು. ಅವರು ಮಾರ್ತಂಡಪ್ಪ ಮತ್ತು ಬಸಮ್ಮ ದಂಪತಿಗಳ ಮಗನಾಗಿ ಜನಿಸಿದರು. ಮಹಾತ್ಮ ಗಾಂಧಿಯವರ ರಾಷ್ಟ್ರೀಯ ಚಳವಳಿ ಭಾರತದೆಲ್ಲೆಡೆ ಹರಡುತ್ತಿದ್ದ ಕಾಲದಲ್ಲಿ ಅವರು ಬೆಳೆದರು.\n" +
                    "\n" +
                    "18ನೇ ವಯಸ್ಸಿನಲ್ಲಿಯೇ ಮಹದೇವಪ್ಪ ಅವರು 1930ರ ಮಹಾತ್ಮ ಗಾಂಧಿಯವರ ಐತಿಹಾಸಿಕ ದಾಂಡಿ ಯಾತ್ರೆಯಲ್ಲಿ ಪಾಲ್ಗೊಂಡರು. ಆ ಯಾತ್ರೆಯಲ್ಲಿ ಗಾಂಧೀಜಿಯವರ ಜೊತೆ ನಡೆದ ಕರ್ನಾಟಕದ ಏಕೈಕ ಪ್ರತಿನಿಧಿಯಾಗಿ ಅವರನ್ನು ಸ್ಮರಿಸಲಾಗುತ್ತದೆ. ಅವರು ಅಸಹಕಾರ ಚಳವಳಿ ಮತ್ತು ಇತರ ಬ್ರಿಟಿಷ್ ವಿರೋಧಿ ಚಟುವಟಿಕೆಗಳಲ್ಲಿಯೂ ಭಾಗವಹಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟ ಮತ್ತು ಹುತಾತ್ಮತೆ\n" +
                    "\n" +
                    "ಕ್ವಿಟ್ ಇಂಡಿಯಾ ಅವಧಿಯಲ್ಲಿ ಮೈಲಾರ ಮಹದೇವಪ್ಪ ಅವರು ಹಾವೇರಿ ಪ್ರದೇಶದಲ್ಲಿ ಬ್ರಿಟಿಷ್ ಅಧಿಕಾರಕ್ಕೆ ವಿರೋಧವಾಗಿ ಸಕ್ರಿಯರಾದರು. ಬ್ರಿಟಿಷರ ಭೂಮಿಯ ಆದಾಯ ಸಂಗ್ರಹಣೆಯನ್ನು ವಿರೋಧಿಸಿ, ಅವರ ನೀತಿಗಳಿಂದ ತೊಂದರೆಗೊಳಗಾದ ರೈತರ ಪರವಾಗಿ ಕೆಲಸ ಮಾಡಿದರು.\n" +
                    "\n" +
                    "1 ಏಪ್ರಿಲ್ 1943ರಂದು ಹೊಸರಿಟ್ಟಿಯಲ್ಲಿ ರೈತರಿಂದ ಸಂಗ್ರಹಿಸಿದ್ದ ಭೂಮಿಯ ಆದಾಯವನ್ನು ವಶಪಡಿಸಿಕೊಳ್ಳಲು ಪ್ರಯತ್ನಿಸುತ್ತಿದ್ದಾಗ, ತಿರಕಪ್ಪ ಮಡಿವಾಳರ ಮತ್ತು ವೀರಯ್ಯ ಹಿರೇಮಠ ಅವರೊಂದಿಗೆ ಅವರು ಪೊಲೀಸರ ಗುಂಡೇಟಿಗೆ ಬಲಿಯಾದರು. ಆಗ ಅವರಿಗೆ ಕೇವಲ 31 ವರ್ಷ ವಯಸ್ಸಾಗಿತ್ತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಮೈಲಾರ ಮಹದೇವಪ್ಪ ಅವರು ಕರ್ನಾಟಕದ ಧೈರ್ಯಶಾಲಿ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ ಮತ್ತು ಹುತಾತ್ಮರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. 2018ರಲ್ಲಿ ಭಾರತ ಅಂಚೆ ಇಲಾಖೆ ಅವರ ಗೌರವಾರ್ಥ ಸ್ಮಾರಕ ಅಂಚೆ ಚೀಟಿಯನ್ನು ಬಿಡುಗಡೆ ಮಾಡಿತು. ಯುವ ಧೈರ್ಯ, ಗಾಂಧೀಯ ನಿಷ್ಠೆ ಮತ್ತು ಸ್ವಾತಂತ್ರ್ಯಕ್ಕಾಗಿ ತ್ಯಾಗದ ಮಾದರಿಯಾಗಿ ಅವರ ಜೀವನ ಇಂದಿಗೂ ಪ್ರೇರಣೆಯಾಗಿದೆ.\n"),

        h("Haveri", "ಹಾವೇರಿ", "Kanakadasa", "ಕನಕದಾಸ",
            "Kanakadasa (1509 – 1606), born as Thimmappa Nayaka, was a great Haridasa saint, poet, philosopher, composer, and social reformer from present-day Karnataka. He was born at Baada in Shiggaon taluk, now in Haveri district, and later became closely associated with Kaginele.\n" +
                    "\n" +
                    "Kanakadasa was a devotee of Lord Krishna and a follower of the Dvaita tradition. He became a disciple of Vyasatirtha and wrote devotional songs, keertanas, ugabhogas, and philosophical poetry in simple Kannada. His compositions made spiritual ideas accessible to ordinary people.\n" +
                    "\n" +
                    "### Literature and Message\n" +
                    "\n" +
                    "Kanakadasa’s major works include Mohana Tarangini, Nalacharitre, Ramadhanya Charitre, and Haribhakti Sara. His writings carried messages of devotion, humility, equality, social reform, and criticism of caste pride. Ramadhanya Charitre is especially known for its symbolic discussion of social hierarchy through the story of rice and ragi.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Kanakadasa remains one of the most loved poet-saints of Karnataka. His songs are still sung in homes, temples, music concerts, and devotional gatherings. Kaginele in Haveri district is an important place connected with his memory and spiritual tradition.\n",
            "ಕನಕದಾಸ (1509 – 1606), ಜನ್ಮನಾಮ ತಿಮ್ಮಪ್ಪ ನಾಯಕ, ಇಂದಿನ ಕರ್ನಾಟಕದ ಮಹಾನ್ ಹರಿದಾಸ ಸಂತ, ಕವಿ, ತತ್ತ್ವಜ್ಞಾನಿ, ಸಂಗೀತ ಸಂಯೋಜಕ ಮತ್ತು ಸಮಾಜ ಸುಧಾರಕರಾಗಿದ್ದರು. ಅವರು ಈಗಿನ ಹಾವೇರಿ ಜಿಲ್ಲೆಯ ಶಿಗ್ಗಾಂವಿ ತಾಲ್ಲೂಕಿನ ಬಾಡದಲ್ಲಿ ಜನಿಸಿದರು ಮತ್ತು ನಂತರ ಕಾಗಿನೆಲೆಯೊಂದಿಗೆ ಆಳವಾಗಿ ಸಂಬಂಧ ಹೊಂದಿದರು.\n" +
                    "\n" +
                    "ಕನಕದಾಸರು ಶ್ರೀಕೃಷ್ಣನ ಭಕ್ತರಾಗಿದ್ದು, ದ್ವೈತ ಪರಂಪರೆಯ ಅನುಯಾಯಿಗಳಾಗಿದ್ದರು. ಅವರು ವ್ಯಾಸತೀರ್ಥರ ಶಿಷ್ಯರಾದರು ಮತ್ತು ಸರಳ ಕನ್ನಡದಲ್ಲಿ ಭಕ್ತಿ ಗೀತೆಗಳು, ಕೀರ್ತನೆಗಳು, ಉಗಾಭೋಗಗಳು ಮತ್ತು ತಾತ್ವಿಕ ಕಾವ್ಯಗಳನ್ನು ರಚಿಸಿದರು. ಅವರ ರಚನೆಗಳು ಆಧ್ಯಾತ್ಮಿಕ ವಿಚಾರಗಳನ್ನು ಸಾಮಾನ್ಯ ಜನರಿಗೆ ಸುಲಭವಾಗಿ ತಲುಪಿಸಿದವು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯ ಮತ್ತು ಸಂದೇಶ\n" +
                    "\n" +
                    "ಕನಕದಾಸರ ಪ್ರಮುಖ ಕೃತಿಗಳಲ್ಲಿ ಮೋಹನ ತರಂಗಿಣಿ, ನಳಚರಿತ್ರೆ, ರಾಮಧಾನ್ಯ ಚರಿತ್ರೆ ಮತ್ತು ಹರಿಭಕ್ತಿ ಸಾರ ಸೇರಿವೆ. ಅವರ ಬರಹಗಳು ಭಕ್ತಿ, ವಿನಯ, ಸಮಾನತೆ, ಸಮಾಜ ಸುಧಾರಣೆ ಮತ್ತು ಜಾತಿ ಅಹಂಕಾರದ ವಿಮರ್ಶೆಯ ಸಂದೇಶಗಳನ್ನು ಹೊತ್ತು ತಂದಿವೆ. ರಾಮಧಾನ್ಯ ಚರಿತ್ರೆ ಅಕ್ಕಿ ಮತ್ತು ರಾಗಿಯ ಕಥೆಯ ಮೂಲಕ ಸಾಮಾಜಿಕ ಅಸಮಾನತೆಯನ್ನು ರೂಪಕವಾಗಿ ಚರ್ಚಿಸುವ ಕೃತಿಯಾಗಿ ಪ್ರಸಿದ್ಧವಾಗಿದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಕನಕದಾಸರು ಕರ್ನಾಟಕದ ಅತ್ಯಂತ ಪ್ರೀತಿಪಾತ್ರ ಕವಿ-ಸಂತರಲ್ಲಿ ಒಬ್ಬರು. ಅವರ ಹಾಡುಗಳು ಇಂದಿಗೂ ಮನೆಗಳಲ್ಲಿ, ದೇವಾಲಯಗಳಲ್ಲಿ, ಸಂಗೀತ ಕಚೇರಿಗಳಲ್ಲಿ ಮತ್ತು ಭಕ್ತಿ ಸಮಾರಂಭಗಳಲ್ಲಿ ಹಾಡಲ್ಪಡುತ್ತವೆ. ಹಾವೇರಿ ಜಿಲ್ಲೆಯ ಕಾಗಿನೆಲೆ ಅವರ ಸ್ಮರಣೆ ಮತ್ತು ಆಧ್ಯಾತ್ಮಿಕ ಪರಂಪರೆಯ ಪ್ರಮುಖ ಸ್ಥಳವಾಗಿದೆ.\n"),

        h("Haveri", "ಹಾವೇರಿ", "Sarvajna", "ಸರ್ವಜ್ಞ",
            "Sarvajna was a famous Kannada poet, philosopher, pragmatist, and moral thinker, traditionally placed around the 16th century. He is associated with Abalur in present-day Haveri district. The name Sarvajna means “the all-knowing one”.\n" +
                    "\n" +
                    "Sarvajna is best known for his tripadis, three-line poems written in a simple native Kannada metre. These short verses speak about morality, human nature, social behaviour, wisdom, hypocrisy, devotion, and everyday life. Because of their sharpness and simplicity, many of his sayings became part of Kannada popular memory.\n" +
                    "\n" +
                    "### Poetry and Thought\n" +
                    "\n" +
                    "Sarvajna’s tripadis are practical, witty, and philosophical. They often criticize greed, false pride, caste arrogance, ignorance, and dishonesty. At the same time, they praise humility, self-knowledge, compassion, truth, and balanced living.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Sarvajna is one of the most widely quoted poets in Kannada. His tripadis are taught in schools, quoted in speeches, and remembered in daily conversation. He is often compared with other great moral poets of India because his short poems carry deep social and philosophical meaning.\n",
            "ಸರ್ವಜ್ಞರು ಪ್ರಸಿದ್ಧ ಕನ್ನಡ ಕವಿ, ತತ್ತ್ವಜ್ಞಾನಿ, ವ್ಯವಹಾರ ಜ್ಞಾನಿ ಮತ್ತು ನೈತಿಕ ಚಿಂತಕರಾಗಿದ್ದರು. ಅವರನ್ನು ಸಾಮಾನ್ಯವಾಗಿ 16ನೇ ಶತಮಾನದ ಕವಿಯಾಗಿ ಗುರುತಿಸಲಾಗುತ್ತದೆ. ಅವರು ಈಗಿನ ಹಾವೇರಿ ಜಿಲ್ಲೆಯ ಅಬಲೂರಿನೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದ್ದಾರೆ. ಸರ್ವಜ್ಞ ಎಂಬ ಹೆಸರಿನ ಅರ್ಥ “ಎಲ್ಲವನ್ನೂ ತಿಳಿದವನು”.\n" +
                    "\n" +
                    "ಸರ್ವಜ್ಞರು ತ್ರಿಪದಿಗಳಿಗಾಗಿ ಪ್ರಸಿದ್ಧರು. ಸರಳ ಕನ್ನಡದ ಸ್ಥಳೀಯ ಛಂದಸ್ಸಿನಲ್ಲಿ ರಚಿಸಿದ ಮೂರು ಸಾಲಿನ ಕವಿತೆಗಳೇ ತ್ರಿಪದಿಗಳು. ಈ ಚಿಕ್ಕ ಪದ್ಯಗಳು ನೀತಿ, ಮಾನವ ಸ್ವಭಾವ, ಸಾಮಾಜಿಕ ವರ್ತನೆ, ಜ್ಞಾನ, ಕಪಟ, ಭಕ್ತಿ ಮತ್ತು ದೈನಂದಿನ ಜೀವನದ ಬಗ್ಗೆ ಮಾತನಾಡುತ್ತವೆ. ಅವುಗಳ ತೀಕ್ಷ್ಣತೆ ಮತ್ತು ಸರಳತೆಯಿಂದಾಗಿ ಅವರ ಅನೇಕ ಮಾತುಗಳು ಕನ್ನಡ ಜನಸ್ಮೃತಿಯ ಭಾಗವಾಗಿವೆ.\n" +
                    "\n" +
                    "### ಕಾವ್ಯ ಮತ್ತು ಚಿಂತನೆ\n" +
                    "\n" +
                    "ಸರ್ವಜ್ಞರ ತ್ರಿಪದಿಗಳು ವ್ಯವಹಾರಿಕ, ಹಾಸ್ಯಮಯ ಮತ್ತು ತಾತ್ವಿಕವಾಗಿವೆ. ಅವು ಲೋಭ, ಸುಳ್ಳು ಗರ್ವ, ಜಾತಿ ಅಹಂಕಾರ, ಅಜ್ಞಾನ ಮತ್ತು ಅಪ್ರಾಮಾಣಿಕತೆಯನ್ನು ಟೀಕಿಸುತ್ತವೆ. ಅದೇ ಸಮಯದಲ್ಲಿ ವಿನಯ, ಆತ್ಮಜ್ಞಾನ, ಕರುಣೆ, ಸತ್ಯ ಮತ್ತು ಸಮತೋಲನದ ಜೀವನವನ್ನು ಹೊಗಳುತ್ತವೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಸರ್ವಜ್ಞರು ಕನ್ನಡದಲ್ಲಿ ಅತ್ಯಂತ ಹೆಚ್ಚು ಉಲ್ಲೇಖಿಸಲ್ಪಡುವ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರ ತ್ರಿಪದಿಗಳು ಶಾಲೆಗಳಲ್ಲಿ ಕಲಿಸಲ್ಪಡುತ್ತವೆ, ಭಾಷಣಗಳಲ್ಲಿ ಉಲ್ಲೇಖಿಸಲ್ಪಡುತ್ತವೆ ಮತ್ತು ದೈನಂದಿನ ಮಾತುಕತೆಯಲ್ಲಿಯೂ ನೆನಪಾಗುತ್ತವೆ. ಚಿಕ್ಕ ಪದ್ಯಗಳಲ್ಲಿ ಆಳವಾದ ಸಾಮಾಜಿಕ ಮತ್ತು ತಾತ್ವಿಕ ಅರ್ಥ ತುಂಬಿದ ಕಾರಣ ಅವರನ್ನು ಭಾರತದ ಇತರ ಮಹಾನ್ ನೀತಿಕವಿಗಳೊಂದಿಗೆ ಹೋಲಿಸಲಾಗುತ್ತದೆ.\n"),

        h("Kalaburagi", "ಕಲಬುರಗಿ", "Hyderabad-Karnataka liberation fighters", "ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ವಿಮೋಚನಾ ಹೋರಾಟಗಾರರು",
            "The Hyderabad-Karnataka liberation fighters were the activists, peasants, students, workers, local leaders, and ordinary citizens who fought against the rule of the Nizam of Hyderabad and the violence of the Razakars before the region became part of the Indian Union in 1948. The region is now known as Kalyana-Karnataka and includes districts such as Kalaburagi, Bidar, Yadgir, Raichur, Koppal, Vijayanagara, and Ballari.\n" +
                    "\n" +
                    "After India became independent on 15 August 1947, the princely state of Hyderabad did not immediately join India. The Nizam attempted to remain independent, and the Razakars, a paramilitary force, used violence and intimidation against people who supported accession to India. Many people of Hyderabad-Karnataka resisted this rule through underground activism, public mobilisation, armed struggle, and support for national integration.\n" +
                    "\n" +
                    "### Liberation Movement\n" +
                    "\n" +
                    "The liberation struggle brought together different streams of resistance, including the Indian National Congress, socialist activists, peasants, students, and local community leaders. Many fighters were arrested, tortured, or killed. Villages in the region suffered under repression, but the demand for freedom and union with India continued to grow.\n" +
                    "\n" +
                    "In September 1948, the Indian government launched Operation Polo, also called the Police Action. Hyderabad State surrendered on 17 September 1948, and the region was integrated into India.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "The liberation fighters are remembered for freeing the region from autocratic rule and helping complete India’s political integration. Hyderabad-Karnataka Liberation Day, now also called Kalyana-Karnataka Liberation Day, is observed every year on 17 September in honour of their sacrifice.\n",
            "ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ವಿಮೋಚನಾ ಹೋರಾಟಗಾರರು ಎಂದರೆ 1948ರಲ್ಲಿ ಈ ಪ್ರದೇಶ ಭಾರತ ಸಂಘಕ್ಕೆ ಸೇರಿಕೊಳ್ಳುವ ಮೊದಲು ಹೈದರಾಬಾದ್‌ನ ನಿಜಾಂ ಆಳ್ವಿಕೆ ಮತ್ತು ರಜಾಕಾರ್‌ಗಳ ಹಿಂಸಾಚಾರದ ವಿರುದ್ಧ ಹೋರಾಡಿದ ಹೋರಾಟಗಾರರು, ರೈತರು, ವಿದ್ಯಾರ್ಥಿಗಳು, ಕಾರ್ಮಿಕರು, ಸ್ಥಳೀಯ ನಾಯಕರು ಮತ್ತು ಸಾಮಾನ್ಯ ಜನರು. ಈ ಪ್ರದೇಶವನ್ನು ಈಗ ಕಲ್ಯಾಣ ಕರ್ನಾಟಕ ಎಂದು ಕರೆಯಲಾಗುತ್ತದೆ. ಕಲಬುರಗಿ, ಬೀದರ್, ಯಾದಗಿರಿ, ರಾಯಚೂರು, ಕೊಪ್ಪಳ, ವಿಜಯನಗರ ಮತ್ತು ಬಳ್ಳಾರಿ ಮುಂತಾದ ಜಿಲ್ಲೆಗಳು ಇದರಲ್ಲಿ ಸೇರಿವೆ.\n" +
                    "\n" +
                    "15 ಆಗಸ್ಟ್ 1947ರಂದು ಭಾರತ ಸ್ವತಂತ್ರವಾದ ನಂತರ ಹೈದರಾಬಾದ್ ಸಂಸ್ಥಾನ ತಕ್ಷಣ ಭಾರತಕ್ಕೆ ಸೇರಲಿಲ್ಲ. ನಿಜಾಂ ಸ್ವತಂತ್ರವಾಗಿಯೇ ಉಳಿಯಲು ಪ್ರಯತ್ನಿಸಿದನು. ರಜಾಕಾರ್‌ಗಳು ಎಂಬ ಸಶಸ್ತ್ರ ಗುಂಪು ಭಾರತ ಸೇರ್ಪಡೆಯನ್ನು ಬೆಂಬಲಿಸಿದ ಜನರ ಮೇಲೆ ಹಿಂಸೆ ಮತ್ತು ಬೆದರಿಕೆಗಳನ್ನು ನಡೆಸಿತು. ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕದ ಅನೇಕ ಜನರು ಭೂಗತ ಚಟುವಟಿಕೆಗಳು, ಸಾರ್ವಜನಿಕ ಜಾಗೃತಿ, ಸಶಸ್ತ್ರ ಹೋರಾಟ ಮತ್ತು ರಾಷ್ಟ್ರೀಯ ಏಕೀಕರಣದ ಬೆಂಬಲದ ಮೂಲಕ ಈ ಆಳ್ವಿಕೆಗೆ ವಿರೋಧಿಸಿದರು.\n" +
                    "\n" +
                    "### ವಿಮೋಚನಾ ಚಳವಳಿ\n" +
                    "\n" +
                    "ಈ ವಿಮೋಚನಾ ಹೋರಾಟದಲ್ಲಿ ಭಾರತೀಯ ರಾಷ್ಟ್ರೀಯ ಕಾಂಗ್ರೆಸ್, ಸಮಾಜವಾದಿ ಕಾರ್ಯಕರ್ತರು, ರೈತರು, ವಿದ್ಯಾರ್ಥಿಗಳು ಮತ್ತು ಸ್ಥಳೀಯ ಸಮುದಾಯ ನಾಯಕರು ಸೇರಿದಂತೆ ಅನೇಕ ಧಾರೆಗಳು ಒಂದಾದವು. ಅನೇಕ ಹೋರಾಟಗಾರರು ಬಂಧಿತರಾದರು, ಹಿಂಸೆ ಅನುಭವಿಸಿದರು ಅಥವಾ ಪ್ರಾಣ ತ್ಯಾಗ ಮಾಡಿದರು. ಈ ಪ್ರದೇಶದ ಗ್ರಾಮಗಳು ದಮನಕ್ಕೆ ಒಳಗಾದರೂ, ಸ್ವಾತಂತ್ರ್ಯ ಮತ್ತು ಭಾರತದೊಂದಿಗೆ ವಿಲೀನದ ಬೇಡಿಕೆ ಹೆಚ್ಚುತ್ತಲೇ ಹೋಯಿತು.\n" +
                    "\n" +
                    "1948ರ ಸೆಪ್ಟೆಂಬರ್‌ನಲ್ಲಿ ಭಾರತ ಸರ್ಕಾರ ಆಪರೇಷನ್ ಪೋಲೊ ಅಥವಾ ಪೊಲೀಸ್ ಆಕ್ಷನ್ ಆರಂಭಿಸಿತು. 17 ಸೆಪ್ಟೆಂಬರ್ 1948ರಂದು ಹೈದರಾಬಾದ್ ಸಂಸ್ಥಾನ ಶರಣಾಯಿತು ಮತ್ತು ಈ ಪ್ರದೇಶ ಭಾರತದಲ್ಲಿ ವಿಲೀನವಾಯಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ವಿಮೋಚನಾ ಹೋರಾಟಗಾರರು ಈ ಪ್ರದೇಶವನ್ನು ಸ್ವೈರಾಚಾರಿ ಆಳ್ವಿಕೆಯಿಂದ ಮುಕ್ತಗೊಳಿಸಿ ಭಾರತದ ರಾಜಕೀಯ ಏಕೀಕರಣವನ್ನು ಪೂರ್ಣಗೊಳಿಸಲು ನೆರವಾದವರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಅವರ ತ್ಯಾಗದ ಸ್ಮರಣಾರ್ಥವಾಗಿ ಪ್ರತಿವರ್ಷ 17 ಸೆಪ್ಟೆಂಬರ್‌ರಂದು ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ವಿಮೋಚನಾ ದಿನ, ಈಗ ಕಲ್ಯಾಣ ಕರ್ನಾಟಕ ವಿಮೋಚನಾ ದಿನ, ಆಚರಿಸಲಾಗುತ್ತದೆ.\n"),

        h("Kalaburagi", "ಕಲಬುರಗಿ", "Jayadevitai Ligade", "ಜಯದೇವಿತಾಯಿ ಲಿಗಾಡೆ",
            "Jayadevitai Ligade (23 June 1912 – 24 July 1986) was a Kannada and Marathi poet, writer, activist, and cultural worker associated with the Kannada-speaking region around Solapur and Kalyana-Karnataka. She wrote in both Kannada and Marathi and worked for Kannada language, Sharana literature, and regional cultural identity.\n" +
                    "\n" +
                    "She was active in the movement to unite Kannada-speaking areas with Karnataka and supported the demand that Solapur, which had a large Kannada-speaking population, should be included in Karnataka. She also contributed to the publication and promotion of Sharana Sahitya and wrote works connected with Siddarama and the Veerashaiva tradition.\n" +
                    "\n" +
                    "### Literary and Public Work\n" +
                    "\n" +
                    "Jayadevitai Ligade became the first woman to preside over the Kannada Sahitya Sammelana when she chaired the 48th conference held at Mandya in 1974. She was also associated with the Veerashaiva Women’s Council and the Central Sahitya Akademi.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "She received honours such as the Sahitya Akademi Award and Devaraja Bahaddur Award. Jayadevitai Ligade is remembered as a writer, activist, and pioneering woman leader who strengthened Kannada identity and Sharana literary culture in the border and Kalyana-Karnataka regions.\n",
            "ಜಯದೇವಿತಾಯಿ ಲಿಗಾಡೆ (23 ಜೂನ್ 1912 – 24 ಜುಲೈ 1986) ಅವರು ಸೊಲಾಪುರ ಮತ್ತು ಕಲ್ಯಾಣ ಕರ್ನಾಟಕ ಪ್ರದೇಶದೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದ ಕನ್ನಡ ಮತ್ತು ಮರಾಠಿ ಕವಯತ್ರಿ, ಬರಹಗಾರ್ತಿ, ಹೋರಾಟಗಾರ್ತಿ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಕಾರ್ಯಕರ್ತೆ. ಅವರು ಕನ್ನಡ ಮತ್ತು ಮರಾಠಿ ಎರಡೂ ಭಾಷೆಗಳಲ್ಲಿ ಬರಹ ಬರೆದರು. ಕನ್ನಡ ಭಾಷೆ, ಶರಣ ಸಾಹಿತ್ಯ ಮತ್ತು ಪ್ರಾದೇಶಿಕ ಸಾಂಸ್ಕೃತಿಕ ಗುರುತಿಗಾಗಿ ಕೆಲಸ ಮಾಡಿದರು.\n" +
                    "\n" +
                    "ಕನ್ನಡ ಮಾತನಾಡುವ ಪ್ರದೇಶಗಳನ್ನು ಕರ್ನಾಟಕದೊಂದಿಗೆ ಸೇರಿಸುವ ಚಳವಳಿಯಲ್ಲಿ ಅವರು ಸಕ್ರಿಯರಾಗಿದ್ದರು. ಹೆಚ್ಚಿನ ಕನ್ನಡಿಗರು ವಾಸಿಸುತ್ತಿದ್ದ ಸೊಲಾಪುರವನ್ನು ಕರ್ನಾಟಕಕ್ಕೆ ಸೇರಿಸಬೇಕೆಂಬ ಬೇಡಿಕೆಗೆ ಅವರು ಬೆಂಬಲ ನೀಡಿದರು. ಶರಣ ಸಾಹಿತ್ಯದ ಪ್ರಕಟಣೆ ಮತ್ತು ಪ್ರಚಾರಕ್ಕೂ ಅವರು ಕೊಡುಗೆ ನೀಡಿದರು. ಸಿದ್ಧರಾಮ ಮತ್ತು ವೀರಶೈವ ಪರಂಪರೆಯೊಂದಿಗೆ ಸಂಬಂಧಿಸಿದ ಕೃತಿಗಳನ್ನು ರಚಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "1974ರಲ್ಲಿ ಮಂಡ್ಯದಲ್ಲಿ ನಡೆದ 48ನೇ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಸಮ್ಮೇಳನದ ಅಧ್ಯಕ್ಷತೆ ವಹಿಸುವ ಮೂಲಕ ಜಯದೇವಿತಾಯಿ ಲಿಗಾಡೆ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯ ಸಮ್ಮೇಳನದ ಮೊದಲ ಮಹಿಳಾ ಅಧ್ಯಕ್ಷರಾದರು. ಅವರು ಅಖಿಲ ಭಾರತ ವೀರಶೈವ ಮಹಿಳಾ ಪರಿಷತ್ತು ಮತ್ತು ಕೇಂದ್ರ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿಯೊಂದಿಗೂ ಸಂಬಂಧ ಹೊಂದಿದ್ದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಅವರಿಗೆ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಮತ್ತು ದೇವರಾಜ ಬಹದ್ದೂರ್ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಗಡಿ ಪ್ರದೇಶಗಳು ಮತ್ತು ಕಲ್ಯಾಣ ಕರ್ನಾಟಕದಲ್ಲಿ ಕನ್ನಡ ಗುರುತು ಮತ್ತು ಶರಣ ಸಾಹಿತ್ಯ ಸಂಸ್ಕೃತಿಯನ್ನು ಬಲಪಡಿಸಿದ ಬರಹಗಾರ್ತಿ, ಹೋರಾಟಗಾರ್ತಿ ಮತ್ತು ಮುಂಚೂಣಿ ಮಹಿಳಾ ನಾಯಕಿಯಾಗಿ ಜಯದೇವಿತಾಯಿ ಲಿಗಾಡೆ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Kodagu", "ಕೊಡಗು", "Pandyanda Belliappa", "ಪಾಂಡಿಯಂಡ ಬೆಳ್ಳಿಯಪ್ಪ",
            "Pandyanda I. Belliappa, also written as Pandianda I. Belliappa, was a Gandhian freedom fighter and politician from the former Coorg state. He is remembered in Kodagu as “Kodagina Gandhi” for his role in the freedom movement and public life.\n\n" +
                    "Belliappa entered politics in 1921 through the Coorg Planters' Association and later joined the Indian National Congress. He was a satyagrahi who courted arrest during the freedom struggle. His wife, Pandyanda Seethamma Belliappa, was also a freedom fighter.\n\n" +
                    "He edited a periodical called Kodagu and helped bring national leaders and reformers to Coorg. After independence, he was also associated with Coorg politics and opposed the proposed merger of Coorg with Mysore through the Takkadi Party.",
            "ಪಾಂಡಿಯಂಡ ಐ. ಬೆಳ್ಳಿಯಪ್ಪ, ಪಾಂಡಿಯಂಡ ಬೆಳ್ಳಿಯಪ್ಪ ಎಂದೂ ಬರೆಯಲ್ಪಡುವವರು, ಹಳೆಯ ಕೂರ್ಗ್ ರಾಜ್ಯದ ಗಾಂಧೀವಾದಿ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ ಮತ್ತು ರಾಜಕಾರಣಿಯಾಗಿದ್ದರು. ಕೊಡಗಿನ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಜೀವನದಲ್ಲಿ ಅವರ ಪಾತ್ರಕ್ಕಾಗಿ ಅವರನ್ನು “ಕೊಡಗಿನ ಗಾಂಧಿ” ಎಂದು ನೆನಪಿಸಲಾಗುತ್ತದೆ.\n\n" +
                    "ಅವರು 1921ರಲ್ಲಿ ಕೂರ್ಗ್ ಪ್ಲಾಂಟರ್ಸ್ ಅಸೋಸಿಯೇಷನ್ ಮೂಲಕ ರಾಜಕೀಯ ಪ್ರವೇಶಿಸಿ, ನಂತರ ಭಾರತೀಯ ರಾಷ್ಟ್ರೀಯ ಕಾಂಗ್ರೆಸ್‌ಗೆ ಸೇರಿದರು. ಸತ್ಯಾಗ್ರಹಿಯಾಗಿ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದಲ್ಲಿ ಬಂಧನ ಅನುಭವಿಸಿದರು. ಅವರ ಪತ್ನಿ ಪಾಂಡಿಯಂಡ ಸೀತಮ್ಮ ಬೆಳ್ಳಿಯಪ್ಪ ಅವರೂ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ್ತಿಯಾಗಿದ್ದರು.\n\n" +
                    "ಅವರು ಕೊಡಗು ಎಂಬ ಪತ್ರಿಕೆಯನ್ನು ಸಂಪಾದಿಸಿದರು ಮತ್ತು ರಾಷ್ಟ್ರೀಯ ನಾಯಕರು, ಸಮಾಜ ಸುಧಾರಕರು ಕೊಡಗಿಗೆ ಬರಲು ಸಹಕರಿಸಿದರು. ಸ್ವಾತಂತ್ರ್ಯದ ನಂತರ ಕೂರ್ಗ್ ರಾಜಕೀಯದಲ್ಲಿಯೂ ಅವರು ಸಕ್ರಿಯರಾಗಿದ್ದು, ಕೂರ್ಗ್‌ನ್ನು ಮೈಸೂರಿನೊಂದಿಗೆ ವಿಲೀನಗೊಳಿಸುವ ಪ್ರಸ್ತಾಪಕ್ಕೆ ಟಕ್ಕಡಿ ಪಕ್ಷದ ಮೂಲಕ ವಿರೋಧ ವ್ಯಕ್ತಪಡಿಸಿದರು."),

        h("Kodagu", "ಕೊಡಗು", "Haradasa Appacha Kavi", "ಹರದಾಸ ಅಪ್ಪಚ್ಚ ಕವಿ",
            "Haradasa Appacha Kavi (Appaneravanda Appachcha; 1868 – c. 1930) was a Kodava poet, playwright, singer, and theatre personality from Kodagu. He is widely regarded as the first major playwright in the Kodava language.\n\n" +
                    "He was born at Kirundadu near Madikeri. Though he had limited formal schooling, he became known for his learning, devotional songs, and dramatic works. His plays include Yayathi Rajanda Nataka, Sree Subrahmanya Mahathmye, Sathi Savithri, and Sree Kaveri Nataka.\n\n" +
                    "Appacha Kavi formed drama companies and staged plays in Kodava and Kannada. His works brought mythological stories into the cultural setting of Kodagu, and his birthday is observed by many as Kodava Sahitya Day.",
            "ಹರದಾಸ ಅಪ್ಪಚ್ಚ ಕವಿ (ಅಪ್ಪನೆರವಂಡ ಅಪ್ಪಚ್ಚ; 1868 – ಸುಮಾರು 1930) ಅವರು ಕೊಡಗಿನ ಕೊಡವ ಕವಿ, ನಾಟಕಕಾರ, ಗಾಯಕ ಮತ್ತು ರಂಗಕಲಾವಿದರಾಗಿದ್ದರು. ಕೊಡವ ಭಾಷೆಯ ಮೊದಲ ಪ್ರಮುಖ ನಾಟಕಕಾರರಾಗಿ ಅವರು ಪ್ರಸಿದ್ಧರು.\n\n" +
                    "ಅವರು ಮಡಿಕೇರಿ ಸಮೀಪದ ಕಿರುಂದಾಡು ಗ್ರಾಮದಲ್ಲಿ ಜನಿಸಿದರು. ಔಪಚಾರಿಕ ಶಿಕ್ಷಣ ಸೀಮಿತವಾಗಿದ್ದರೂ, ಪಾಂಡಿತ್ಯ, ಭಕ್ತಿ ಗೀತೆಗಳು ಮತ್ತು ನಾಟಕ ರಚನೆಗಳಿಂದ ಖ್ಯಾತರಾದರು. ಯಯಾತಿ ರಾಜಂಡ ನಾಟಕ, ಶ್ರೀ ಸುಬ್ರಹ್ಮಣ್ಯ ಮಹಾತ್ಮೆ, ಸತಿ ಸಾವಿತ್ರಿ ಮತ್ತು ಶ್ರೀ ಕಾವೇರಿ ನಾಟಕ ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳು.\n\n" +
                    "ಅಪ್ಪಚ್ಚ ಕವಿ ಅವರು ಕೊಡವ ಮತ್ತು ಕನ್ನಡ ನಾಟಕ ಕಂಪನಿಗಳನ್ನು ಸ್ಥಾಪಿಸಿ ನಾಟಕಗಳನ್ನು ಪ್ರದರ್ಶಿಸಿದರು. ಪೌರಾಣಿಕ ಕಥೆಗಳನ್ನು ಕೊಡಗಿನ ಸಂಸ್ಕೃತಿ ಮತ್ತು ಜೀವನಶೈಲಿಯೊಂದಿಗೆ ಜೋಡಿಸಿದ ಕಾರಣ ಅವರ ಕೃತಿಗಳು ಕೊಡವ ಸಾಹಿತ್ಯದಲ್ಲಿ ವಿಶೇಷ ಸ್ಥಾನ ಪಡೆದಿವೆ. ಅವರ ಜನ್ಮದಿನವನ್ನು ಅನೇಕರು ಕೊಡವ ಸಾಹಿತ್ಯ ದಿನವಾಗಿ ಆಚರಿಸುತ್ತಾರೆ."),

        h("Kodagu", "ಕೊಡಗು", "Kodagina Gouramma", "ಕೊಡಗಿನ ಗೌರಮ್ಮ",
            "Kodagina Gowramma (1912 – 13 April 1939) was an early Kannada woman writer from Madikeri in Kodagu. She wrote short stories under the name Kodagina Gowramma and is remembered as one of the important early feminist voices in Kannada literature.\n\n" +
                    "Her stories such as Manuvina Rani, Aparaadhi Yaaru, Vaaniya Samasye, and Aahuthi dealt with women's lives, social customs, injustice, and reformist ideas. She was also influenced by the Indian freedom movement.\n\n" +
                    "Gowramma invited Mahatma Gandhi to her family home during his visit to Coorg and donated her gold ornaments to the Harijan welfare fund. She died young in 1939, but her short stories continued to influence later Kannada women writers.",
            "ಕೊಡಗಿನ ಗೌರಮ್ಮ (1912 – 13 ಏಪ್ರಿಲ್ 1939) ಅವರು ಕೊಡಗಿನ ಮಡಿಕೇರಿಯ ಆರಂಭಿಕ ಕನ್ನಡ ಮಹಿಳಾ ಬರಹಗಾರ್ತಿಯರಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಕೊಡಗಿನ ಗೌರಮ್ಮ ಎಂಬ ಹೆಸರಿನಿಂದ ಕಥೆಗಳನ್ನು ಬರೆದು, ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಮೊದಲಿನ ಸ್ತ್ರೀವಾದಿ ಧ್ವನಿಗಳಲ್ಲಿ ಪ್ರಮುಖ ಸ್ಥಾನ ಪಡೆದರು.\n\n" +
                    "ಮನು್ವಿನ ರಾಣಿ, ಅಪರಾಧಿ ಯಾರು, ವಾಣಿಯ ಸಮಸ್ಯೆ ಮತ್ತು ಆಹುತಿ ಮುಂತಾದ ಅವರ ಕಥೆಗಳು ಮಹಿಳೆಯರ ಜೀವನ, ಸಾಮಾಜಿಕ ಆಚರಣೆಗಳು, ಅನ್ಯಾಯ ಮತ್ತು ಸುಧಾರಣಾ ಚಿಂತನೆಗಳನ್ನು ಪ್ರತಿಬಿಂಬಿಸುತ್ತವೆ. ಅವರು ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಿಂದಲೂ ಪ್ರಭಾವಿತರಾಗಿದ್ದರು.\n\n" +
                    "ಮಹಾತ್ಮ ಗಾಂಧೀಜಿ ಕೂರ್ಗ್‌ಗೆ ಬಂದಾಗ ಅವರನ್ನು ತಮ್ಮ ಮನೆಗೆ ಆಹ್ವಾನಿಸಿ, ಹರಿಜನ ಕಲ್ಯಾಣ ನಿಧಿಗೆ ತಮ್ಮ ಚಿನ್ನಾಭರಣಗಳನ್ನು ದಾನ ಮಾಡಿದರು. 1939ರಲ್ಲಿ ಯುವ ವಯಸ್ಸಿನಲ್ಲೇ ನಿಧನರಾದರೂ, ಅವರ ಕಥೆಗಳು ನಂತರದ ಕನ್ನಡ ಮಹಿಳಾ ಬರಹಗಾರ್ತಿಯರಿಗೆ ಪ್ರೇರಣೆಯಾದವು."),

        h("Kolar", "ಕೋಲಾರ", "Masti Venkatesha Iyengar", "ಮಾಸ್ತಿ ವೆಂಕಟೇಶ ಅಯ್ಯಂಗಾರ್",
            "Masti Venkatesha Iyengar (6 June 1891 – 6 June 1986) was a major Kannada writer, civil servant, and one of the finest short story writers in Kannada literature. He wrote under the pen name Srinivasa.\n\n" +
                    "He was born at Hungenahalli in present-day Kolar district and later served in the Mysore Civil Service. After leaving government service, he devoted himself fully to literature and edited the journal Jivana for many years.\n\n" +
                    "Masti wrote stories, novels, plays, poems, essays, and criticism. He received the Jnanpith Award in 1983 for his historical novel Chikka Veera Rajendra. He is affectionately remembered as Maasti Kannadada Aasti, meaning “Masti is Kannada's treasure.”",
            "ಮಾಸ್ತಿ ವೆಂಕಟೇಶ ಅಯ್ಯಂಗಾರ್ (6 ಜೂನ್ 1891 – 6 ಜೂನ್ 1986) ಅವರು ಕನ್ನಡದ ಪ್ರಮುಖ ಸಾಹಿತಿ, ಆಡಳಿತಾಧಿಕಾರಿ ಮತ್ತು ಕನ್ನಡ ಕಥಾಸಾಹಿತ್ಯದ ಶ್ರೇಷ್ಠ ಕಥೆಗಾರರಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಶ್ರೀನಿವಾಸ ಎಂಬ ಕಾವ್ಯನಾಮದಿಂದ ಬರೆಯುತ್ತಿದ್ದರು.\n\n" +
                    "ಅವರು ಇಂದಿನ ಕೋಲಾರ ಜಿಲ್ಲೆಯ ಹುಂಗೇನಹಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿದರು. ನಂತರ ಮೈಸೂರು ಸಿವಿಲ್ ಸರ್ವೀಸ್‌ನಲ್ಲಿ ವಿವಿಧ ಹುದ್ದೆಗಳಲ್ಲಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಸರ್ಕಾರಿ ಸೇವೆ ತೊರೆದ ಬಳಿಕ ಸಾಹಿತ್ಯಕ್ಕೆ ಸಂಪೂರ್ಣವಾಗಿ ತೊಡಗಿಕೊಂಡು ಜೀವನ ಪತ್ರಿಕೆಯನ್ನು ಅನೇಕ ವರ್ಷ ಸಂಪಾದಿಸಿದರು.\n\n" +
                    "ಮಾಸ್ತಿ ಅವರು ಕಥೆ, ಕಾದಂಬರಿ, ನಾಟಕ, ಕಾವ್ಯ, ಪ್ರಬಂಧ ಮತ್ತು ವಿಮರ್ಶೆಗಳನ್ನು ರಚಿಸಿದರು. ಚಿಕ್ಕವೀರ ರಾಜೇಂದ್ರ ಕಾದಂಬರಿಗಾಗಿ 1983ರಲ್ಲಿ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಪಡೆದರು. “ಮಾಸ್ತಿ ಕನ್ನಡದ ಆಸ್ತಿ” ಎಂದು ಅವರು ಪ್ರೀತಿಯಿಂದ ನೆನಪಾಗುತ್ತಾರೆ."),

        h("Kolar", "ಕೋಲಾರ", "D. V. Gundappa", "ಡಿ. ವಿ. ಗುಂಡಪ್ಪ",
            "D. V. Gundappa (Devanahalli Venkataramanaiah Gundappa; 17 March 1887 – 7 October 1975), popularly known as DVG, was a Kannada writer, poet, philosopher, journalist, and public intellectual.\n\n" +
                    "He was born in Mulbagal in present-day Kolar district. DVG wrote on literature, philosophy, politics, journalism, public life, biography, and spirituality. He also founded the Gokhale Institute of Public Affairs in Bengaluru.\n\n" +
                    "His most famous work is Mankuthimmana Kagga, a classic collection of wisdom poetry in Kannada. He was awarded the Padma Bhushan in 1974 and remains one of the most respected thinkers in modern Kannada literature.",
            "ಡಿ. ವಿ. ಗುಂಡಪ್ಪ (ದೇವನಹಳ್ಳಿ ವೆಂಕಟರಮಣಯ್ಯ ಗುಂಡಪ್ಪ; 17 ಮಾರ್ಚ್ 1887 – 7 ಅಕ್ಟೋಬರ್ 1975), ಡಿವಿಜಿ ಎಂದೇ ಪ್ರಸಿದ್ಧರಾದವರು, ಕನ್ನಡ ಬರಹಗಾರ, ಕವಿ, ತತ್ತ್ವಚಿಂತಕ, ಪತ್ರಕರ್ತ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಬುದ್ಧಿಜೀವಿಯಾಗಿದ್ದರು.\n\n" +
                    "ಅವರು ಇಂದಿನ ಕೋಲಾರ ಜಿಲ್ಲೆಯ ಮುಳಬಾಗಿಲಿನಲ್ಲಿ ಜನಿಸಿದರು. ಸಾಹಿತ್ಯ, ತತ್ತ್ವಶಾಸ್ತ್ರ, ರಾಜಕೀಯ, ಪತ್ರಿಕೋದ್ಯಮ, ಸಾರ್ವಜನಿಕ ಜೀವನ, ಜೀವನಚರಿತ್ರೆ ಮತ್ತು ಆಧ್ಯಾತ್ಮಿಕತೆ ಕುರಿತು ಅವರು ವ್ಯಾಪಕವಾಗಿ ಬರೆದರು. ಬೆಂಗಳೂರಿನಲ್ಲಿ ಗೋಕಲೆ ಸಾರ್ವಜನಿಕ ವ್ಯವಹಾರಗಳ ಸಂಸ್ಥೆಯನ್ನು ಸ್ಥಾಪಿಸಿದರು.\n\n" +
                    "ಅವರ ಅತ್ಯಂತ ಪ್ರಸಿದ್ಧ ಕೃತಿ ಮಂಕುತಿಮ್ಮನ ಕಗ್ಗ, ಕನ್ನಡದ ಜ್ಞಾನಕಾವ್ಯದ ಶ್ರೇಷ್ಠ ಕೃತಿಗಳಲ್ಲಿ ಒಂದು. 1974ರಲ್ಲಿ ಪದ್ಮಭೂಷಣ ಪ್ರಶಸ್ತಿ ಪಡೆದ ಅವರು ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಅತ್ಯಂತ ಗೌರವಾನ್ವಿತ ಚಿಂತಕರಲ್ಲಿ ಒಬ್ಬರಾಗಿದ್ದಾರೆ."),

        h("Koppal", "ಕೊಪ್ಪಳ", "Krishnadevaraya", "ಕೃಷ್ಣದೇವರಾಯ",
            "Krishnadevaraya (17 January 1471 – 17 October 1529) was the emperor of the Vijayanagara Empire from 1509 to 1529 and the most famous ruler of the Tuluva dynasty.\n\n" +
                    "His reign is remembered as a period of military strength, administrative skill, prosperity, and cultural brilliance. He defeated powerful enemies including the Deccan sultanates and the Gajapatis of Odisha, and the empire reached one of its highest points under him.\n\n" +
                    "Krishnadevaraya was also a great patron of literature and the arts. He composed the Telugu classic Amuktamalyada and supported poets in Telugu, Kannada, Sanskrit, and Tamil. Koppal district is linked with Vijayanagara heritage through Anegundi, which served as an early capital and important historical centre of the empire.",
            "ಕೃಷ್ಣದೇವರಾಯ (17 ಜನವರಿ 1471 – 17 ಅಕ್ಟೋಬರ್ 1529) ಅವರು 1509ರಿಂದ 1529ರವರೆಗೆ ವಿಜಯನಗರ ಸಾಮ್ರಾಜ್ಯದ ಸಾಮ್ರಾಟರಾಗಿದ್ದು, ತುಳುವ ವಂಶದ ಅತ್ಯಂತ ಪ್ರಸಿದ್ಧ ಅರಸರಾಗಿದ್ದರು.\n\n" +
                    "ಅವರ ಆಳ್ವಿಕೆಯನ್ನು ಸೈನಿಕ ಶಕ್ತಿ, ಉತ್ತಮ ಆಡಳಿತ, ಸಮೃದ್ಧಿ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ವೈಭವದ ಕಾಲವೆಂದು ನೆನಪಿಸಲಾಗುತ್ತದೆ. ದಕ್ಕನ್ ಸುಲ್ತಾನರು ಮತ್ತು ಒಡಿಶಾದ ಗಜಪತಿಗಳಂತಹ ಬಲಿಷ್ಠ ಶತ್ರುಗಳನ್ನು ಅವರು ಸೋಲಿಸಿದರು. ಅವರ ಕಾಲದಲ್ಲಿ ವಿಜಯನಗರ ಸಾಮ್ರಾಜ್ಯ ತನ್ನ ಶ್ರೇಷ್ಠ ಸ್ಥಿತಿಗಳಲ್ಲಿ ಒಂದನ್ನು ತಲುಪಿತು.\n\n" +
                    "ಕೃಷ್ಣದೇವರಾಯರು ಸಾಹಿತ್ಯ ಮತ್ತು ಕಲೆಗಳ ಮಹಾನ್ ಪೋಷಕರಾಗಿದ್ದರು. ಅವರು ತೆಲುಗಿನ ಪ್ರಸಿದ್ಧ ಆಮುಕ್ತಮಾಲ್ಯದ ಕೃತಿಯನ್ನು ರಚಿಸಿದರು ಮತ್ತು ತೆಲುಗು, ಕನ್ನಡ, ಸಂಸ್ಕೃತ ಹಾಗೂ ತಮಿಳು ಕವಿಗಳಿಗೆ ಆಶ್ರಯ ನೀಡಿದರು. ಕೊಪ್ಪಳ ಜಿಲ್ಲೆಯ ಆನೆಗುಂಡಿ ವಿಜಯನಗರ ಸಾಮ್ರಾಜ್ಯದ ಆರಂಭಿಕ ರಾಜಧಾನಿ ಮತ್ತು ಪ್ರಮುಖ ಐತಿಹಾಸಿಕ ಕೇಂದ್ರವಾಗಿದ್ದರಿಂದ, ಈ ಪ್ರದೇಶವು ವಿಜಯನಗರ ಪರಂಪರೆಯೊಂದಿಗೆ ನಿಕಟವಾಗಿ ಸಂಬಂಧಿಸಿದೆ."),

        h("Mandya", "ಮಂಡ್ಯ", "K. S. Narasimhaswamy", "ಕೆ. ಎಸ್. ನರಸಿಂಹಸ್ವಾಮಿ",
            "K. S. Narasimhaswamy (Kikkeri Subbarao Narasimhaswamy; 26 January 1915 – 27 December 2003) was a major Kannada poet, best known for romantic and lyrical poetry.\n\n" +
                    "He was born at Kikkeri in present-day Mandya district. His most famous poetry collection, Mysooru Mallige, was first published in 1942 and became one of the most loved works of modern Kannada poetry.\n\n" +
                    "Narasimhaswamy's poems often celebrate love, marriage, domestic life, longing, and emotional tenderness. He received honours including the Sahitya Akademi Award, Karnataka Sahitya Academy Award, Pampa Award, and the National Film Award for Best Lyrics.",
            "ಕೆ. ಎಸ್. ನರಸಿಂಹಸ್ವಾಮಿ (ಕಿಕ್ಕೇರಿ ಸುಬ್ಬರಾವ್ ನರಸಿಂಹಸ್ವಾಮಿ; 26 ಜನವರಿ 1915 – 27 ಡಿಸೆಂಬರ್ 2003) ಅವರು ಕನ್ನಡದ ಪ್ರಮುಖ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಪ್ರೇಮ ಮತ್ತು ಲಾಲಿತ್ಯಪೂರ್ಣ ಕಾವ್ಯಕ್ಕಾಗಿ ಅವರು ವಿಶೇಷವಾಗಿ ಪ್ರಸಿದ್ಧರು.\n\n" +
                    "ಅವರು ಇಂದಿನ ಮಂಡ್ಯ ಜಿಲ್ಲೆಯ ಕಿಕ್ಕೇರಿಯಲ್ಲಿ ಜನಿಸಿದರು. 1942ರಲ್ಲಿ ಪ್ರಕಟವಾದ ಅವರ ಮೈಸೂರು ಮಲ್ಲಿಗೆ ಕವನ ಸಂಕಲನವು ಆಧುನಿಕ ಕನ್ನಡ ಕಾವ್ಯದ ಅತ್ಯಂತ ಪ್ರಿಯ ಕೃತಿಗಳಲ್ಲಿ ಒಂದಾಗಿದೆ.\n\n" +
                    "ನರಸಿಂಹಸ್ವಾಮಿ ಅವರ ಕವಿತೆಗಳು ಪ್ರೀತಿ, ದಾಂಪತ್ಯ, ಗೃಹಜೀವನ, ವಿರಹ ಮತ್ತು ಮೃದು ಭಾವನೆಗಳನ್ನು ಸುಂದರವಾಗಿ ವ್ಯಕ್ತಪಡಿಸುತ್ತವೆ. ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, ಕರ್ನಾಟಕ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ, ಪಂಪ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಅತ್ಯುತ್ತಮ ಗೀತರಚನೆಗಾಗಿ ರಾಷ್ಟ್ರೀಯ ಚಲನಚಿತ್ರ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಅನೇಕ ಗೌರವಗಳನ್ನು ಪಡೆದರು."),

        h("Mandya", "ಮಂಡ್ಯ", "H. L. Nage Gowda", "ಎಚ್. ಎಲ್. ನಾಗೇಗೌಡ",
            "H. L. Nage Gowda was a civil servant, folklorist, writer, and one of the most important preservers of Karnataka's folk traditions.\n\n" +
                    "In 1979, he founded the Karnataka Janapada Parishat to study, document, preserve, and promote the folk arts of Karnataka. After retirement, he used his energy and personal resources to create Janapada Loka near Ramanagara.\n\n" +
                    "Janapada Loka, opened to the public in 1994, became a major folk museum displaying thousands of artifacts connected with rural life, music, dance, rituals, crafts, and performance traditions. Nage Gowda received honours including the Rajyotsava Award, Pampa Prashasti, Nadoja Prashasti, and Sandesha Award.",
            "ಎಚ್. ಎಲ್. ನಾಗೇಗೌಡ ಅವರು ಆಡಳಿತಾಧಿಕಾರಿ, ಜನಪದ ಪಂಡಿತ, ಬರಹಗಾರ ಮತ್ತು ಕರ್ನಾಟಕದ ಜನಪದ ಪರಂಪರೆಯ ಪ್ರಮುಖ ಸಂರಕ್ಷಕರಲ್ಲಿ ಒಬ್ಬರು.\n\n" +
                    "1979ರಲ್ಲಿ ಅವರು ಕರ್ನಾಟಕ ಜನಪದ ಪರಿಷತ್ತನ್ನು ಸ್ಥಾಪಿಸಿದರು. ಇದರ ಉದ್ದೇಶ ಕರ್ನಾಟಕದ ಜನಪದ ಕಲೆಗಳನ್ನು ಅಧ್ಯಯನ, ದಾಖಲಾತಿ, ಸಂರಕ್ಷಣೆ ಮತ್ತು ಪ್ರಚಾರ ಮಾಡುವುದು. ನಿವೃತ್ತಿಯ ನಂತರ ತಮ್ಮ ಶ್ರಮ ಮತ್ತು ವೈಯಕ್ತಿಕ ಸಂಪನ್ಮೂಲಗಳನ್ನು ಬಳಸಿ ರಾಮನಗರದ ಸಮೀಪ ಜನಪದ ಲೋಕವನ್ನು ನಿರ್ಮಿಸಿದರು.\n\n" +
                    "1994ರಲ್ಲಿ ಸಾರ್ವಜನಿಕರಿಗೆ ತೆರೆಯಲ್ಪಟ್ಟ ಜನಪದ ಲೋಕವು ಗ್ರಾಮೀಣ ಜೀವನ, ಸಂಗೀತ, ನೃತ್ಯ, ಆಚರಣೆಗಳು, ಕೈಗಾರಿಕೆಗಳು ಮತ್ತು ಪ್ರದರ್ಶನಕಲೆಗಳಿಗೆ ಸಂಬಂಧಿಸಿದ ಸಾವಿರಾರು ವಸ್ತುಗಳನ್ನು ಪ್ರದರ್ಶಿಸುವ ಪ್ರಮುಖ ಜನಪದ ಸಂಗ್ರಹಾಲಯವಾಯಿತು. ನಾಗೇಗೌಡ ಅವರಿಗೆ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ, ಪಂಪ ಪ್ರಶಸ್ತಿ, ನಾಡೋಜ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಸಂದೇಶ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಅನೇಕ ಗೌರವಗಳು ಲಭಿಸಿದವು."),

        h("Mysuru", "ಮೈಸೂರು", "R. K. Narayan", "ಆರ್. ಕೆ. ನಾರಾಯಣ",
            "R. K. Narayan (Rasipuram Krishnaswami Narayanaswami; 10 October 1906 – 13 May 2001) was one of the most celebrated Indian writers in English.\n\n" +
                    "Although born in Madras, Narayan studied at Maharaja's College, Mysore, and Mysore became central to his literary imagination. He created the fictional South Indian town of Malgudi, the setting for many of his novels and short stories.\n\n" +
                    "His major works include Swami and Friends, The Bachelor of Arts, The English Teacher, The Guide, and Malgudi Days. He received major honours including the Padma Bhushan, Padma Vibhushan, Sahitya Akademi Fellowship, and the AC Benson Medal.",
            "ಆರ್. ಕೆ. ನಾರಾಯಣ (ರಾಸಿಪುರಂ ಕೃಷ್ಣಸ್ವಾಮಿ ನಾರಾಯಣಸ್ವಾಮಿ; 10 ಅಕ್ಟೋಬರ್ 1906 – 13 ಮೇ 2001) ಅವರು ಇಂಗ್ಲಿಷ್‌ನಲ್ಲಿ ಬರೆದ ಭಾರತದ ಅತ್ಯಂತ ಪ್ರಸಿದ್ಧ ಬರಹಗಾರರಲ್ಲಿ ಒಬ್ಬರು.\n\n" +
                    "ಅವರು ಮದ್ರಾಸ್‌ನಲ್ಲಿ ಜನಿಸಿದರೂ, ಮೈಸೂರಿನ ಮಹಾರಾಜ ಕಾಲೇಜಿನಲ್ಲಿ ವಿದ್ಯಾಭ್ಯಾಸ ಮಾಡಿದರು. ಮೈಸೂರು ಅವರ ಸಾಹಿತ್ಯಿಕ ಕಲ್ಪನೆಗೆ ಮಹತ್ವದ ನೆಲೆಯಾಯಿತು. ಅವರು ಸೃಷ್ಟಿಸಿದ ಮಾಲ್ಗುಡಿ ಎಂಬ ಕಲ್ಪಿತ ದಕ್ಷಿಣ ಭಾರತೀಯ ಪಟ್ಟಣವು ಅವರ ಅನೇಕ ಕಾದಂಬರಿ ಮತ್ತು ಕಥೆಗಳ ಹಿನ್ನೆಲೆಯಾಗಿದೆ.\n\n" +
                    "ಸ್ವಾಮಿ ಅಂಡ್ ಫ್ರೆಂಡ್ಸ್, ದ ಬ್ಯಾಚುಲರ್ ಆಫ್ ಆರ್ಟ್ಸ್, ದ ಇಂಗ್ಲಿಷ್ ಟೀಚರ್, ದ ಗೈಡ್ ಮತ್ತು ಮಾಲ್ಗುಡಿ ಡೇಸ್ ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳು. ಪದ್ಮಭೂಷಣ, ಪದ್ಮವಿಭೂಷಣ, ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಫೆಲೋಶಿಪ್ ಮತ್ತು ಎ. ಸಿ. ಬೆನ್ಸನ್ ಮೆಡಲ್ ಮುಂತಾದ ಗೌರವಗಳನ್ನು ಅವರು ಪಡೆದರು."),

        h("Mysuru", "ಮೈಸೂರು", "Devanuru Mahadeva", "ದೇವನೂರು ಮಹಾದೇವ",
            "Devanuru Mahadeva, born in 1948 at Devanuru village in Nanjangud taluk of Mysore district, is a major Kannada writer, novelist, public intellectual, and social thinker.\n\n" +
                    "He is closely associated with Dalit and Bandaya literary movements in Kannada. His important works include Dyavanooru, Odalaala, Kusumabaale, Edege Bidda Akshara, and RSS: Aala Mattu Agala.\n\n" +
                    "Mahadeva received the Sahitya Akademi Award for Kusumabaale and was conferred the Padma Shri in 2011, though he later returned the award. He has also been known for taking principled public stands on Kannada language, social justice, and democratic values.",
            "ದೇವನೂರು ಮಹಾದೇವ ಅವರು 1948ರಲ್ಲಿ ಮೈಸೂರು ಜಿಲ್ಲೆಯ ನಂಜನಗೂಡು ತಾಲ್ಲೂಕಿನ ದೇವನೂರು ಗ್ರಾಮದಲ್ಲಿ ಜನಿಸಿದ ಪ್ರಮುಖ ಕನ್ನಡ ಬರಹಗಾರ, ಕಾದಂಬರಿಕಾರ, ಸಾರ್ವಜನಿಕ ಬುದ್ಧಿಜೀವಿ ಮತ್ತು ಸಾಮಾಜಿಕ ಚಿಂತಕರಾಗಿದ್ದಾರೆ.\n\n" +
                    "ಅವರು ಕನ್ನಡದ ದಲಿತ ಮತ್ತು ಬಂಡಾಯ ಸಾಹಿತ್ಯ ಚಳವಳಿಗಳೊಂದಿಗೆ ನಿಕಟವಾಗಿ ಸಂಬಂಧ ಹೊಂದಿದ್ದಾರೆ. ದ್ಯಾವನೂರು, ಒಡಲಾಳ, ಕುಸುಮಬಾಲೆ, ಎದೆಗೆ ಬಿದ್ದ ಅಕ್ಷರ ಮತ್ತು ಆರ್‌ಎಸ್‌ಎಸ್: ಆಳ ಮತ್ತು ಅಗಲ ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳು.\n\n" +
                    "ಕುಸುಮಬಾಲೆ ಕೃತಿಗೆ ಅವರು ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಪಡೆದರು. 2011ರಲ್ಲಿ ಪದ್ಮಶ್ರೀ ಗೌರವವೂ ಲಭಿಸಿತು, ಆದರೆ ನಂತರ ಅವರು ಅದನ್ನು ಹಿಂದಿರುಗಿಸಿದರು. ಕನ್ನಡ ಭಾಷೆ, ಸಾಮಾಜಿಕ ನ್ಯಾಯ ಮತ್ತು ಪ್ರಜಾಸತ್ತಾತ್ಮಕ ಮೌಲ್ಯಗಳ ಕುರಿತು ಧೈರ್ಯವಾದ ಸಾರ್ವಜನಿಕ ನಿಲುವುಗಳಿಗಾಗಿ ಅವರು ಪ್ರಸಿದ್ಧರು."),
        h("Raichur", "ರಾಯಚೂರು", "Pandit Taranath", "ಪಂಡಿತ ತಾರಾನಾಥ",
            "Pandit Taranath was a freedom fighter, educationist, journalist, social reformer, writer, playwright, and Ayurveda practitioner closely connected with Raichur. Though he was born in Mangalore in 1891, his major public work took shape in Raichur, where he became a respected figure in education, reform, and national awakening.\n" +
                    "\n" +
                    "Taranath worked against caste discrimination, untouchability, superstition, and social inequality. He promoted Hindu-Muslim unity and encouraged modern education along with Indian cultural values. He was known for his wide learning and is remembered by some admirers as the “Raja Ram Mohan Roy of Karnataka”.\n" +
                    "\n" +
                    "### Education and Public Work\n" +
                    "\n" +
                    "He established educational and social institutions in Raichur, including the Hamdard school, and worked to make education available to common people. He also served society through Ayurveda and public health work, especially during times of disease and hardship.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Pandit Taranath is remembered as one of Raichur’s important public figures. Taranath Shikshana Samsthe and other institutions connected with his memory continue to reflect his commitment to education, social reform, and service.\n",
            "ಪಂಡಿತ ತಾರಾನಾಥರು ರಾಯಚೂರಿನೊಂದಿಗೆ ಆಳವಾಗಿ ಸಂಬಂಧ ಹೊಂದಿದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ಶಿಕ್ಷಣತಜ್ಞ, ಪತ್ರಕರ್ತ, ಸಮಾಜ ಸುಧಾರಕ, ಬರಹಗಾರ, ನಾಟಕಕಾರ ಮತ್ತು ಆಯುರ್ವೇದ ವೈದ್ಯರಾಗಿದ್ದರು. ಅವರು 1891ರಲ್ಲಿ ಮಂಗಳೂರಿನಲ್ಲಿ ಜನಿಸಿದರೂ, ಅವರ ಪ್ರಮುಖ ಸಾರ್ವಜನಿಕ ಸೇವೆ ರಾಯಚೂರಿನಲ್ಲಿ ರೂಪುಗೊಂಡಿತು. ಶಿಕ್ಷಣ, ಸುಧಾರಣೆ ಮತ್ತು ರಾಷ್ಟ್ರೀಯ ಜಾಗೃತಿಯಲ್ಲಿ ಅವರು ಗೌರವಾನ್ವಿತ ವ್ಯಕ್ತಿಯಾದರು.\n" +
                    "\n" +
                    "ತಾರಾನಾಥರು ಜಾತಿಭೇದ, ಅಸ್ಪೃಶ್ಯತೆ, ಮೂಢನಂಬಿಕೆ ಮತ್ತು ಸಾಮಾಜಿಕ ಅಸಮಾನತೆಯ ವಿರುದ್ಧ ಕೆಲಸ ಮಾಡಿದರು. ಹಿಂದೂ-ಮುಸ್ಲಿಂ ಏಕತೆಯನ್ನು ಉತ್ತೇಜಿಸಿದರು ಮತ್ತು ಭಾರತೀಯ ಸಾಂಸ್ಕೃತಿಕ ಮೌಲ್ಯಗಳೊಂದಿಗೆ ಆಧುನಿಕ ಶಿಕ್ಷಣವನ್ನು ಬೆಂಬಲಿಸಿದರು. ಅವರ ವಿಶಾಲ ಜ್ಞಾನ ಮತ್ತು ಸುಧಾರಣಾ ಮನೋಭಾವದಿಂದ ಕೆಲವರು ಅವರನ್ನು “ಕರ್ನಾಟಕದ ರಾಜಾ ರಾಮಮೋಹನ ರಾಯ್” ಎಂದು ಸ್ಮರಿಸುತ್ತಾರೆ.\n" +
                    "\n" +
                    "### ಶಿಕ್ಷಣ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಅವರು ರಾಯಚೂರಿನಲ್ಲಿ ಹಮ್ದರ್ದ್ ಶಾಲೆ ಸೇರಿದಂತೆ ಶಿಕ್ಷಣ ಮತ್ತು ಸಮಾಜ ಸೇವಾ ಸಂಸ್ಥೆಗಳನ್ನು ಸ್ಥಾಪಿಸಿದರು. ಸಾಮಾನ್ಯ ಜನರಿಗೆ ಶಿಕ್ಷಣ ತಲುಪಬೇಕೆಂದು ಶ್ರಮಿಸಿದರು. ರೋಗ ಮತ್ತು ಸಂಕಷ್ಟದ ಸಂದರ್ಭಗಳಲ್ಲಿ ಆಯುರ್ವೇದ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಆರೋಗ್ಯ ಸೇವೆಯ ಮೂಲಕ ಸಮಾಜಕ್ಕೆ ನೆರವಾದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಪಂಡಿತ ತಾರಾನಾಥರು ರಾಯಚೂರಿನ ಪ್ರಮುಖ ಸಾರ್ವಜನಿಕ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ತಾರಾನಾಥ ಶಿಕ್ಷಣ ಸಂಸ್ಥೆ ಮತ್ತು ಅವರ ಸ್ಮರಣೆಯೊಂದಿಗೆ ಸಂಬಂಧಿಸಿದ ಇತರ ಸಂಸ್ಥೆಗಳು ಶಿಕ್ಷಣ, ಸಮಾಜ ಸುಧಾರಣೆ ಮತ್ತು ಸೇವೆಯ ಮೇಲಿನ ಅವರ ನಿಷ್ಠೆಯನ್ನು ಮುಂದುವರಿಸುತ್ತಿವೆ.\n"),

        h("Raichur", "ರಾಯಚೂರು", "Shantarasa", "ಶಾಂತರಸ",
            "Shantarasa, also known as Shaantarasa Hemberal, was an important Kannada writer from the Kalyana-Karnataka region. He hailed from Hemberal village in Deodurga taluk of Raichur district and became known for his contribution to Kannada literature and cultural life in the Hyderabad-Karnataka region.\n" +
                    "\n" +
                    "He wrote with concern for society, language, and the lives of ordinary people. His literary work reflected the cultural world of Raichur and the wider Kalyana-Karnataka area, a region that produced many writers who brought local speech, social experience, and regional history into Kannada literature.\n" +
                    "\n" +
                    "### Literary Importance\n" +
                    "\n" +
                    "Shantarasa was respected as a Kannada writer and scholar with knowledge of Kannada and Urdu literary traditions. His writings and public presence helped strengthen Kannada literary activity in Raichur district.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Shantarasa is remembered as one of the notable literary voices of Raichur and Kalyana-Karnataka. Literary organisations and scholars continue to call for more study of his life and work so that future generations can understand his contribution better.\n",
            "ಶಾಂತರಸ, ಶಾಂತರಸ ಹೆಂಬೇರಾಳ ಎಂದೂ ಪರಿಚಿತರಾದವರು, ಕಲ್ಯಾಣ ಕರ್ನಾಟಕ ಪ್ರದೇಶದ ಪ್ರಮುಖ ಕನ್ನಡ ಬರಹಗಾರರಾಗಿದ್ದರು. ಅವರು ರಾಯಚೂರು ಜಿಲ್ಲೆಯ ದೇವದುರ್ಗ ತಾಲ್ಲೂಕಿನ ಹೆಂಬೇರಾಳ ಗ್ರಾಮಕ್ಕೆ ಸೇರಿದವರು. ಹೈದರಾಬಾದ್-ಕರ್ನಾಟಕ ಪ್ರದೇಶದ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಜೀವನಕ್ಕೆ ನೀಡಿದ ಕೊಡುಗೆಯಿಂದ ಅವರು ಹೆಸರಾದರು.\n" +
                    "\n" +
                    "ಅವರು ಸಮಾಜ, ಭಾಷೆ ಮತ್ತು ಸಾಮಾನ್ಯ ಜನರ ಜೀವನದ ಬಗ್ಗೆ ಕಾಳಜಿಯೊಂದಿಗೆ ಬರೆಯುತ್ತಿದ್ದರು. ಅವರ ಸಾಹಿತ್ಯದಲ್ಲಿ ರಾಯಚೂರು ಮತ್ತು ವಿಶಾಲ ಕಲ್ಯಾಣ ಕರ್ನಾಟಕ ಪ್ರದೇಶದ ಸಾಂಸ್ಕೃತಿಕ ಜಗತ್ತು ಪ್ರತಿಬಿಂಬಿಸುತ್ತದೆ. ಸ್ಥಳೀಯ ಭಾಷೆ, ಸಾಮಾಜಿಕ ಅನುಭವ ಮತ್ತು ಪ್ರಾದೇಶಿಕ ಇತಿಹಾಸವನ್ನು ಕನ್ನಡ ಸಾಹಿತ್ಯಕ್ಕೆ ತಂದ ಲೇಖಕರ ಸಾಲಿನಲ್ಲಿ ಅವರು ನೆನಪಾಗುತ್ತಾರೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಮಹತ್ವ\n" +
                    "\n" +
                    "ಶಾಂತರಸ ಅವರು ಕನ್ನಡ ಮತ್ತು ಉರ್ದು ಸಾಹಿತ್ಯ ಪರಂಪರೆಗಳ ಅರಿವು ಹೊಂದಿದ್ದ ಕನ್ನಡ ಬರಹಗಾರ ಮತ್ತು ಪಂಡಿತರಾಗಿ ಗೌರವಿಸಲ್ಪಟ್ಟರು. ಅವರ ಬರಹಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಚಟುವಟಿಕೆಗಳು ರಾಯಚೂರು ಜಿಲ್ಲೆಯ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಚಟುವಟಿಕೆಯನ್ನು ಬಲಪಡಿಸಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಶಾಂತರಸ ಅವರು ರಾಯಚೂರು ಮತ್ತು ಕಲ್ಯಾಣ ಕರ್ನಾಟಕದ ಗಮನಾರ್ಹ ಸಾಹಿತ್ಯ ಧ್ವನಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಅವರ ಜೀವನ ಮತ್ತು ಸಾಹಿತ್ಯದ ಬಗ್ಗೆ ಇನ್ನಷ್ಟು ಅಧ್ಯಯನ ನಡೆಯಬೇಕೆಂದು ಸಾಹಿತ್ಯ ಸಂಘಟನೆಗಳು ಮತ್ತು ಪಂಡಿತರು ಒತ್ತಾಯಿಸುತ್ತಿದ್ದಾರೆ.\n"),

        h("Ramanagara", "ರಾಮನಗರ", "Kengal Hanumanthaiah", "ಕೆಂಗಲ್ ಹನುಮಂತಯ್ಯ",
            "Kengal Hanumanthaiah (10 February 1908 – 1 December 1980) was a freedom fighter, lawyer, politician, and the second Chief Minister of Mysore State. He was born at Lakkappanahalli near Ramanagara and became one of the most important political leaders of modern Karnataka.\n" +
                    "\n" +
                    "Hanumanthaiah participated in the Indian freedom movement and later became a major leader in state politics. He served as Chief Minister of Mysore State from 1952 to 1956. His administration is especially remembered for the construction of Vidhana Soudha in Bengaluru.\n" +
                    "\n" +
                    "### Vidhana Soudha\n" +
                    "\n" +
                    "Kengal Hanumanthaiah wanted Karnataka’s legislature building to reflect Indian dignity, democratic authority, and the architectural heritage of the state. Under his leadership, Vidhana Soudha was conceived and built as a grand seat of government.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "He later served in national politics, including as a Union minister. Kengal Hanumanthaiah is remembered as the “architect of Vidhana Soudha” and as a leader who gave Karnataka one of its most powerful public symbols.\n",
            "ಕೆಂಗಲ್ ಹನುಮಂತಯ್ಯ (10 ಫೆಬ್ರವರಿ 1908 – 1 ಡಿಸೆಂಬರ್ 1980) ಅವರು ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ವಕೀಲ, ರಾಜಕಾರಣಿ ಮತ್ತು ಮೈಸೂರು ರಾಜ್ಯದ ಎರಡನೇ ಮುಖ್ಯಮಂತ್ರಿಯಾಗಿದ್ದರು. ಅವರು ರಾಮನಗರದ ಸಮೀಪದ ಲಕ್ಕಪ್ಪನಹಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿ, ಆಧುನಿಕ ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ರಾಜಕೀಯ ನಾಯಕರಲ್ಲಿ ಒಬ್ಬರಾದರು.\n" +
                    "\n" +
                    "ಹನುಮಂತಯ್ಯ ಅವರು ಭಾರತದ ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಲ್ಲಿ ಭಾಗವಹಿಸಿದರು ಮತ್ತು ನಂತರ ರಾಜ್ಯ ರಾಜಕಾರಣದಲ್ಲಿ ಪ್ರಮುಖ ನಾಯಕರಾದರು. ಅವರು 1952ರಿಂದ 1956ರವರೆಗೆ ಮೈಸೂರು ರಾಜ್ಯದ ಮುಖ್ಯಮಂತ್ರಿಯಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಅವರ ಆಡಳಿತವು ಬೆಂಗಳೂರಿನ ವಿಧಾನಸೌಧ ನಿರ್ಮಾಣಕ್ಕಾಗಿ ವಿಶೇಷವಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತದೆ.\n" +
                    "\n" +
                    "### ವಿಧಾನಸೌಧ\n" +
                    "\n" +
                    "ಕರ್ನಾಟಕದ ಶಾಸನಸಭಾ ಕಟ್ಟಡವು ಭಾರತೀಯ ಗೌರವ, ಪ್ರಜಾಪ್ರಭುತ್ವದ ಅಧಿಕಾರ ಮತ್ತು ರಾಜ್ಯದ ವಾಸ್ತುಶಿಲ್ಪ ಪರಂಪರೆಯನ್ನು ಪ್ರತಿಬಿಂಬಿಸಬೇಕು ಎಂದು ಕೆಂಗಲ್ ಹನುಮಂತಯ್ಯ ಬಯಸಿದರು. ಅವರ ನಾಯಕತ್ವದಲ್ಲಿ ವಿಧಾನಸೌಧವನ್ನು ಸರ್ಕಾರದ ಭವ್ಯ ಕೇಂದ್ರವಾಗಿ ಕಲ್ಪಿಸಿ ನಿರ್ಮಿಸಲಾಯಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ನಂತರ ಅವರು ರಾಷ್ಟ್ರೀಯ ರಾಜಕಾರಣದಲ್ಲಿಯೂ, ಕೇಂದ್ರ ಸಚಿವರಾಗಿ ಕೂಡ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಕೆಂಗಲ್ ಹನುಮಂತಯ್ಯ ಅವರು “ವಿಧಾನಸೌಧದ ಶಿಲ್ಪಿ” ಮತ್ತು ಕರ್ನಾಟಕಕ್ಕೆ ಅತ್ಯಂತ ಬಲವಾದ ಸಾರ್ವಜನಿಕ ಸಂಕೇತವೊಂದನ್ನು ನೀಡಿದ ನಾಯಕರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Ramanagara", "ರಾಮನಗರ", "Siddalingaiah", "ಸಿದ್ದಲಿಂಗಯ್ಯ",
            "Siddalingaiah (3 February 1954 – 11 June 2021) was a leading Kannada Dalit poet, activist, professor, playwright, and public intellectual. He was born at Manchanabele near Magadi, now in Ramanagara district, and became one of the strongest literary voices of the Dalit movement in Karnataka.\n" +
                    "\n" +
                    "His poetry gave powerful expression to humiliation, hunger, caste oppression, protest, and self-respect. He was closely associated with the Dalit Sangharsha Samiti and helped shape Dalit literature and social justice politics in Karnataka.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "His famous works include Holemadigara Haadu, Saaviraaru Nadigalu, Kappu Kaadina Haadu, and the autobiographical work Ooru Keri. His writing is direct, emotional, sharp, and rooted in the lives of oppressed communities.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Siddalingaiah served as a professor and also as a member of the Karnataka Legislative Council. He is remembered as a pioneering Dalit poet whose words brought protest, dignity, and social change into modern Kannada literature.\n",
            "ಸಿದ್ದಲಿಂಗಯ್ಯ (3 ಫೆಬ್ರವರಿ 1954 – 11 ಜೂನ್ 2021) ಅವರು ಪ್ರಮುಖ ಕನ್ನಡ ದಲಿತ ಕವಿ, ಹೋರಾಟಗಾರ, ಪ್ರಾಧ್ಯಾಪಕ, ನಾಟಕಕಾರ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಚಿಂತಕರಾಗಿದ್ದರು. ಅವರು ಈಗಿನ ರಾಮನಗರ ಜಿಲ್ಲೆಯ ಮಾಗಡಿ ಸಮೀಪದ ಮಂಚನಬೆಲೆಯಲ್ಲಿ ಜನಿಸಿದರು. ಕರ್ನಾಟಕದ ದಲಿತ ಚಳವಳಿಯ ಅತ್ಯಂತ ಶಕ್ತಿಶಾಲಿ ಸಾಹಿತ್ಯ ಧ್ವನಿಗಳಲ್ಲಿ ಒಬ್ಬರಾದರು.\n" +
                    "\n" +
                    "ಅವರ ಕಾವ್ಯವು ಅವಮಾನ, ಹಸಿವು, ಜಾತಿ ದಮನ, ಪ್ರತಿಭಟನೆ ಮತ್ತು ಆತ್ಮಗೌರವಕ್ಕೆ ಪ್ರಬಲ ಅಭಿವ್ಯಕ್ತಿ ನೀಡಿತು. ಅವರು ದಲಿತ ಸಂಘರ್ಷ ಸಮಿತಿಯೊಂದಿಗೆ ಆಳವಾಗಿ ಸಂಬಂಧ ಹೊಂದಿದ್ದು, ಕರ್ನಾಟಕದ ದಲಿತ ಸಾಹಿತ್ಯ ಮತ್ತು ಸಾಮಾಜಿಕ ನ್ಯಾಯ ಚಳವಳಿಗೆ ರೂಪ ನೀಡಲು ನೆರವಾದರು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಹೊಲೆಮಾದಿಗರ ಹಾಡು, ಸಾವಿರಾರು ನದಿಗಳು, ಕಪ್ಪು ಕಾಡಿನ ಹಾಡು ಮತ್ತು ಆತ್ಮಕಥನಾತ್ಮಕ ಕೃತಿ ಊರು ಕೇರಿ ಅವರ ಪ್ರಸಿದ್ಧ ಕೃತಿಗಳಾಗಿವೆ. ಅವರ ಬರಹ ನೇರ, ಭಾವನಾತ್ಮಕ, ತೀಕ್ಷ್ಣ ಮತ್ತು ಶೋಷಿತ ಸಮುದಾಯಗಳ ಜೀವನಕ್ಕೆ ಬೇರುಬಿಟ್ಟದ್ದಾಗಿದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಸಿದ್ದಲಿಂಗಯ್ಯ ಅವರು ಪ್ರಾಧ್ಯಾಪಕರಾಗಿ ಹಾಗೂ ಕರ್ನಾಟಕ ವಿಧಾನ ಪರಿಷತ್ ಸದಸ್ಯರಾಗಿಯೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯಕ್ಕೆ ಪ್ರತಿಭಟನೆ, ಗೌರವ ಮತ್ತು ಸಾಮಾಜಿಕ ಬದಲಾವಣೆಯ ಶಕ್ತಿಯನ್ನು ತಂದ ಮುಂಚೂಣಿ ದಲಿತ ಕವಿಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Shivamogga", "ಶಿವಮೊಗ್ಗ", "Kadidal Manjappa", "ಕಡಿದಾಳ ಮಂಜಪ್ಪ",
            "Kadidal Manjappa (10 July 1908 – 8 March 1992) was an Indian freedom fighter, Gandhian, politician, writer, and the third Chief Minister of Mysore State. He was born at Kadidal in Thirthahalli taluk of Shivamogga district.\n" +
                    "\n" +
                    "Manjappa took part in the freedom movement and was known for his commitment to Gandhian values and public honesty. After independence, he entered politics and worked for land reforms, rural welfare, and clean public life.\n" +
                    "\n" +
                    "### Chief Ministership\n" +
                    "\n" +
                    "He served briefly as Chief Minister of Mysore State in 1956, during an important period just before the reorganisation of states. Though his term was short, he remained respected for simplicity, integrity, and concern for ordinary people.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Kadidal Manjappa is remembered as a freedom fighter and principled public leader from Shivamogga. His life represents Gandhian politics, honesty in public service, and dedication to social welfare.\n",
            "ಕಡಿದಾಳ ಮಂಜಪ್ಪ (10 ಜುಲೈ 1908 – 8 ಮಾರ್ಚ್ 1992) ಅವರು ಭಾರತೀಯ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ಗಾಂಧೀಯವಾದಿ, ರಾಜಕಾರಣಿ, ಬರಹಗಾರ ಮತ್ತು ಮೈಸೂರು ರಾಜ್ಯದ ಮೂರನೇ ಮುಖ್ಯಮಂತ್ರಿಯಾಗಿದ್ದರು. ಅವರು ಶಿವಮೊಗ್ಗ ಜಿಲ್ಲೆಯ ತೀರ್ಥಹಳ್ಳಿ ತಾಲ್ಲೂಕಿನ ಕಡಿದಾಳದಲ್ಲಿ ಜನಿಸಿದರು.\n" +
                    "\n" +
                    "ಮಂಜಪ್ಪ ಅವರು ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯಲ್ಲಿ ಭಾಗವಹಿಸಿ, ಗಾಂಧೀಯ ಮೌಲ್ಯಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಪ್ರಾಮಾಣಿಕತೆಗೆ ಹೆಸರಾದರು. ಸ್ವಾತಂತ್ರ್ಯಾನಂತರ ರಾಜಕಾರಣಕ್ಕೆ ಬಂದು ಭೂ ಸುಧಾರಣೆ, ಗ್ರಾಮೀಣ ಕಲ್ಯಾಣ ಮತ್ತು ಶುದ್ಧ ಸಾರ್ವಜನಿಕ ಜೀವನಕ್ಕಾಗಿ ಕೆಲಸ ಮಾಡಿದರು.\n" +
                    "\n" +
                    "### ಮುಖ್ಯಮಂತ್ರಿತ್ವ\n" +
                    "\n" +
                    "ಅವರು 1956ರಲ್ಲಿ ಮೈಸೂರು ರಾಜ್ಯದ ಮುಖ್ಯಮಂತ್ರಿಯಾಗಿ ಅಲ್ಪಾವಧಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ರಾಜ್ಯಗಳ ಪುನರ್‌ರಚನೆಗೆ ಮುನ್ನಿನ ಮಹತ್ವದ ಅವಧಿಯಲ್ಲಿ ಅವರು ಅಧಿಕಾರದಲ್ಲಿದ್ದರು. ಅವರ ಅವಧಿ ಚಿಕ್ಕದಾಗಿದ್ದರೂ, ಸರಳತೆ, ಪ್ರಾಮಾಣಿಕತೆ ಮತ್ತು ಸಾಮಾನ್ಯ ಜನರ ಬಗ್ಗೆ ಕಾಳಜಿಗಾಗಿ ಗೌರವಿಸಲ್ಪಟ್ಟರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಕಡಿದಾಳ ಮಂಜಪ್ಪ ಅವರು ಶಿವಮೊಗ್ಗದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ ಮತ್ತು ತತ್ವನಿಷ್ಠ ಸಾರ್ವಜನಿಕ ನಾಯಕರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಅವರ ಜೀವನ ಗಾಂಧೀಯ ರಾಜಕಾರಣ, ಸಾರ್ವಜನಿಕ ಸೇವೆಯ ಪ್ರಾಮಾಣಿಕತೆ ಮತ್ತು ಸಮಾಜ ಕಲ್ಯಾಣದ ನಿಷ್ಠೆಯನ್ನು ಪ್ರತಿನಿಧಿಸುತ್ತದೆ.\n"),

        h("Shivamogga", "ಶಿವಮೊಗ್ಗ", "Shantaveri Gopala Gowda", "ಶಾಂತವೇರಿ ಗೋಪಾಲ ಗೌಡ",
            "Shantaveri Gopala Gowda (14 March 1923 – 9 June 1972) was a socialist leader, freedom movement participant, and one of Karnataka’s most respected idealistic politicians. He was from Shantaveri village in Thirthahalli taluk of Shivamogga district.\n" +
                    "\n" +
                    "Gopala Gowda was influenced by socialist thought and the politics of Ram Manohar Lohia. He became a strong voice for peasants, workers, land reforms, social equality, and decentralised democracy. He was elected to the Karnataka Legislative Assembly three times, in 1952, 1962, and 1967.\n" +
                    "\n" +
                    "### Political Work\n" +
                    "\n" +
                    "He spoke forcefully in the legislature and outside it for the rights of the poor and marginalised. His politics stood against caste domination, money power, and social injustice. He inspired many later socialist and progressive leaders in Karnataka.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Shantaveri Gopala Gowda is remembered as a pioneer of socialism in Karnataka. His life is associated with simplicity, courage, people’s struggles, and principled politics.\n",
            "ಶಾಂತವೇರಿ ಗೋಪಾಲ ಗೌಡ (14 ಮಾರ್ಚ್ 1923 – 9 ಜೂನ್ 1972) ಅವರು ಸಮಾಜವಾದಿ ನಾಯಕ, ಸ್ವಾತಂತ್ರ್ಯ ಚಳವಳಿಯ ಭಾಗವಹಿಸಿದವರು ಮತ್ತು ಕರ್ನಾಟಕದ ಅತ್ಯಂತ ಗೌರವಿಸಲ್ಪಟ್ಟ ಆದರ್ಶವಾದಿ ರಾಜಕಾರಣಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಶಿವಮೊಗ್ಗ ಜಿಲ್ಲೆಯ ತೀರ್ಥಹಳ್ಳಿ ತಾಲ್ಲೂಕಿನ ಶಾಂತವೇರಿ ಗ್ರಾಮದವರು.\n" +
                    "\n" +
                    "ಗೋಪಾಲ ಗೌಡರು ಸಮಾಜವಾದಿ ಚಿಂತನೆ ಮತ್ತು ರಾಮ ಮನೋಹರ ಲೋಹಿಯಾ ಅವರ ರಾಜಕಾರಣದಿಂದ ಪ್ರೇರಿತರಾಗಿದ್ದರು. ರೈತರು, ಕಾರ್ಮಿಕರು, ಭೂ ಸುಧಾರಣೆ, ಸಾಮಾಜಿಕ ಸಮಾನತೆ ಮತ್ತು ವಿಕೇಂದ್ರೀಕೃತ ಪ್ರಜಾಪ್ರಭುತ್ವದ ಪರವಾಗಿ ಅವರು ಬಲವಾದ ಧ್ವನಿಯಾದರು. ಅವರು 1952, 1962 ಮತ್ತು 1967ರಲ್ಲಿ ಮೂರು ಬಾರಿ ಕರ್ನಾಟಕ ವಿಧಾನಸಭೆಗೆ ಆಯ್ಕೆಯಾದರು.\n" +
                    "\n" +
                    "### ರಾಜಕೀಯ ಕೆಲಸ\n" +
                    "\n" +
                    "ಅವರು ವಿಧಾನಸಭೆಯಲ್ಲಿಯೂ ಹೊರಗೆಯೂ ಬಡವರು ಮತ್ತು ಹಿಂದುಳಿದವರ ಹಕ್ಕುಗಳಿಗಾಗಿ ಪ್ರಬಲವಾಗಿ ಮಾತನಾಡಿದರು. ಅವರ ರಾಜಕಾರಣ ಜಾತಿ ಪ್ರಾಬಲ್ಯ, ಹಣದ ಪ್ರಭಾವ ಮತ್ತು ಸಾಮಾಜಿಕ ಅನ್ಯಾಯದ ವಿರುದ್ಧ ನಿಂತಿತ್ತು. ಕರ್ನಾಟಕದ ಅನೇಕ ಮುಂದಿನ ಸಮಾಜವಾದಿ ಮತ್ತು ಪ್ರಗತಿಪರ ನಾಯಕರಿಗೆ ಅವರು ಪ್ರೇರಣೆಯಾದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಶಾಂತವೇರಿ ಗೋಪಾಲ ಗೌಡರು ಕರ್ನಾಟಕದ ಸಮಾಜವಾದದ ಮುಂಚೂಣಿ ನಾಯಕರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಅವರ ಜೀವನ ಸರಳತೆ, ಧೈರ್ಯ, ಜನ ಹೋರಾಟಗಳು ಮತ್ತು ತತ್ವನಿಷ್ಠ ರಾಜಕಾರಣದೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದೆ.\n"),

        h("Shivamogga", "ಶಿವಮೊಗ್ಗ", "U. R. Ananthamurthy", "ಯು. ಆರ್. ಅನಂತಮೂರ್ತಿ",
            "U. R. Ananthamurthy, full name Udupi Rajagopalacharya Ananthamurthy (21 December 1932 – 22 August 2014), was a major Kannada novelist, critic, teacher, and public intellectual. He was born at Melige in Thirthahalli taluk of Shivamogga district.\n" +
                    "\n" +
                    "Ananthamurthy was one of the leading figures of the Navya movement in Kannada literature. His writing questioned caste, ritual, tradition, modernity, morality, and political power. He became nationally and internationally known for his novel Samskara.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "His important works include Samskara, Bharathipura, Avasthe, Bhava, and several stories, essays, and critical writings. Samskara was also adapted into an influential Kannada film and became a landmark in Indian literature and cinema.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "Ananthamurthy received the Jnanpith Award in 1994 and the Padma Bhushan in 1998. He also served as vice-chancellor of Mahatma Gandhi University in Kerala and held important literary positions. He is remembered as one of modern India’s most important writers and thinkers.\n",
            "ಯು. ಆರ್. ಅನಂತಮೂರ್ತಿ, ಪೂರ್ಣ ಹೆಸರು ಉಡುಪಿ ರಾಜಗೋಪಾಲಾಚಾರ್ಯ ಅನಂತಮೂರ್ತಿ (21 ಡಿಸೆಂಬರ್ 1932 – 22 ಆಗಸ್ಟ್ 2014), ಪ್ರಮುಖ ಕನ್ನಡ ಕಾದಂಬರಿಕಾರ, ವಿಮರ್ಶಕ, ಶಿಕ್ಷಕ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಚಿಂತಕರಾಗಿದ್ದರು. ಅವರು ಶಿವಮೊಗ್ಗ ಜಿಲ್ಲೆಯ ತೀರ್ಥಹಳ್ಳಿ ತಾಲ್ಲೂಕಿನ ಮೇಳಿಗೆಯಲ್ಲಿ ಜನಿಸಿದರು.\n" +
                    "\n" +
                    "ಅನಂತಮೂರ್ತಿ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ನವ್ಯ ಚಳವಳಿಯ ಪ್ರಮುಖ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರ ಬರಹಗಳು ಜಾತಿ, ಆಚರಣೆ, ಪರಂಪರೆ, ಆಧುನಿಕತೆ, ನೈತಿಕತೆ ಮತ್ತು ರಾಜಕೀಯ ಅಧಿಕಾರವನ್ನು ಪ್ರಶ್ನಿಸುತ್ತವೆ. ಸಂಸ್ಕಾರ ಕಾದಂಬರಿಯ ಮೂಲಕ ಅವರು ರಾಷ್ಟ್ರೀಯ ಮತ್ತು ಅಂತರರಾಷ್ಟ್ರೀಯ ಮಟ್ಟದಲ್ಲಿ ಪ್ರಸಿದ್ಧರಾದರು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಸಂಸ್ಕಾರ, ಭಾರತೀಪುರ, ಅವಸ್ಥೆ, ಭವ ಮತ್ತು ಅನೇಕ ಕಥೆಗಳು, ಪ್ರಬಂಧಗಳು ಹಾಗೂ ವಿಮರ್ಶಾ ಬರಹಗಳು ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳಾಗಿವೆ. ಸಂಸ್ಕಾರ ಕನ್ನಡದಲ್ಲಿ ಪ್ರಭಾವಶಾಲಿ ಚಲನಚಿತ್ರವಾಗಿಯೂ ರೂಪುಗೊಂಡು ಭಾರತೀಯ ಸಾಹಿತ್ಯ ಮತ್ತು ಸಿನೆಮಾದಲ್ಲಿ ಮೈಲಿಗಲ್ಲಾಯಿತು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಅನಂತಮೂರ್ತಿ ಅವರಿಗೆ 1994ರಲ್ಲಿ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಮತ್ತು 1998ರಲ್ಲಿ ಪದ್ಮಭೂಷಣ ಲಭಿಸಿತು. ಅವರು ಕೇರಳದ ಮಹಾತ್ಮ ಗಾಂಧಿ ವಿಶ್ವವಿದ್ಯಾಲಯದ ಕುಲಪತಿಯಾಗಿಯೂ, ಹಲವಾರು ಪ್ರಮುಖ ಸಾಹಿತ್ಯಿಕ ಹುದ್ದೆಗಳಲ್ಲಿಯೂ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಆಧುನಿಕ ಭಾರತದ ಪ್ರಮುಖ ಬರಹಗಾರರು ಮತ್ತು ಚಿಂತಕರಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Shivamogga", "ಶಿವಮೊಗ್ಗ", "P. Lankesh", "ಪಿ. ಲಂಕೇಶ್",
            "P. Lankesh, full name Palegar Lankeshappa Lankesh (8 March 1935 – 25 January 2000), was a Kannada writer, journalist, filmmaker, teacher, poet, playwright, and public intellectual. He was born at Konagavalli in Shivamogga district.\n" +
                    "\n" +
                    "Lankesh became an important voice in modern Kannada literature and public life. His writings often questioned social hypocrisy, caste, power, middle-class morality, and political corruption. He wrote short stories, novels, poems, plays, essays, and film scripts.\n" +
                    "\n" +
                    "### Journalism and Cinema\n" +
                    "\n" +
                    "In 1980, he founded Lankesh Patrike, a Kannada weekly that became famous for independent journalism, sharp political criticism, literary writing, and social debate. He also worked in Kannada cinema and directed films such as Pallavi, which won national recognition.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "P. Lankesh is remembered as a bold and influential figure in Kannada letters. Through literature, journalism, and cinema, he helped shape modern Kannada public culture and inspired later generations of writers and journalists.\n",
            "ಪಿ. ಲಂಕೇಶ್, ಪೂರ್ಣ ಹೆಸರು ಪಾಲೇಗಾರ ಲಂಕೇಶಪ್ಪ ಲಂಕೇಶ್ (8 ಮಾರ್ಚ್ 1935 – 25 ಜನವರಿ 2000), ಕನ್ನಡ ಬರಹಗಾರ, ಪತ್ರಕರ್ತ, ಚಲನಚಿತ್ರಕಾರ, ಶಿಕ್ಷಕ, ಕವಿ, ನಾಟಕಕಾರ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಚಿಂತಕರಾಗಿದ್ದರು. ಅವರು ಶಿವಮೊಗ್ಗ ಜಿಲ್ಲೆಯ ಕೋಣಗವಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿದರು.\n" +
                    "\n" +
                    "ಲಂಕೇಶ್ ಅವರು ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಜೀವನದ ಪ್ರಮುಖ ಧ್ವನಿಯಾದರು. ಅವರ ಬರಹಗಳು ಸಾಮಾಜಿಕ ಕಪಟ, ಜಾತಿ, ಅಧಿಕಾರ, ಮಧ್ಯಮವರ್ಗದ ನೈತಿಕತೆ ಮತ್ತು ರಾಜಕೀಯ ಭ್ರಷ್ಟಾಚಾರವನ್ನು ಪ್ರಶ್ನಿಸುತ್ತಿದ್ದವು. ಅವರು ಕಥೆಗಳು, ಕಾದಂಬರಿಗಳು, ಕವಿತೆಗಳು, ನಾಟಕಗಳು, ಪ್ರಬಂಧಗಳು ಮತ್ತು ಚಿತ್ರಕಥೆಗಳನ್ನು ರಚಿಸಿದರು.\n" +
                    "\n" +
                    "### ಪತ್ರಿಕೋದ್ಯಮ ಮತ್ತು ಸಿನೆಮಾ\n" +
                    "\n" +
                    "1980ರಲ್ಲಿ ಅವರು ಲಂಕೇಶ್ ಪತ್ರಿಕೆ ಎಂಬ ಕನ್ನಡ ವಾರಪತ್ರಿಕೆಯನ್ನು ಸ್ಥಾಪಿಸಿದರು. ಇದು ಸ್ವತಂತ್ರ ಪತ್ರಿಕೋದ್ಯಮ, ತೀಕ್ಷ್ಣ ರಾಜಕೀಯ ವಿಮರ್ಶೆ, ಸಾಹಿತ್ಯ ಬರಹ ಮತ್ತು ಸಾಮಾಜಿಕ ಚರ್ಚೆಗಳಿಗಾಗಿ ಪ್ರಸಿದ್ಧವಾಯಿತು. ಅವರು ಕನ್ನಡ ಚಲನಚಿತ್ರರಂಗದಲ್ಲಿಯೂ ಕೆಲಸ ಮಾಡಿ, ರಾಷ್ಟ್ರೀಯ ಮಟ್ಟದಲ್ಲಿ ಗುರುತಿಸಿಕೊಂಡ ಪಲ್ಲವಿ ಮುಂತಾದ ಚಿತ್ರಗಳನ್ನು ನಿರ್ದೇಶಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಪಿ. ಲಂಕೇಶ್ ಅವರು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಧೈರ್ಯಶಾಲಿ ಮತ್ತು ಪ್ರಭಾವಿ ವ್ಯಕ್ತಿಯಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಸಾಹಿತ್ಯ, ಪತ್ರಿಕೋದ್ಯಮ ಮತ್ತು ಸಿನೆಮಾ ಮೂಲಕ ಅವರು ಆಧುನಿಕ ಕನ್ನಡ ಸಾರ್ವಜನಿಕ ಸಂಸ್ಕೃತಿಗೆ ರೂಪ ನೀಡಿದರು ಮತ್ತು ಮುಂದಿನ ಪೀಳಿಗೆಯ ಬರಹಗಾರರು ಹಾಗೂ ಪತ್ರಕರ್ತರಿಗೆ ಪ್ರೇರಣೆಯಾದರು.\n"),

        h("Tumakuru", "ತುಮಕೂರು", "Shivakumara Swamiji", "ಶಿವಕುಮಾರ ಸ್ವಾಮೀಜಿ",
            "Shivakumara Swamiji, also known as Sri Shivakumara Swami or Dr. Shivakumara Mahaswamiji (1 April 1907 – 21 January 2019), was the revered pontiff of Siddaganga Matha near Tumakuru. He was a spiritual leader, educationist, humanitarian, and social reformer who dedicated his life to service through education and food.\n" +
                    "\n" +
                    "He became the head of Siddaganga Matha in the early 20th century and guided it for many decades. Under his leadership, the matha developed into a major centre of education and social service. Thousands of poor and rural children received free food, shelter, and education through the institutions connected with Siddaganga Matha.\n" +
                    "\n" +
                    "### Service and Education\n" +
                    "\n" +
                    "Shivakumara Swamiji believed in jnana dasoha and anna dasoha, the sharing of knowledge and food. His service crossed caste, religion, and economic boundaries. Because of his compassion and lifelong service, people affectionately called him the “Walking God”.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "He received the Padma Bhushan in 2015 and the Karnataka Ratna in 2007. He passed away in 2019 at the age of 111. Shivakumara Swamiji remains one of Karnataka’s most respected spiritual and humanitarian figures.\n",
            "ಶಿವಕುಮಾರ ಸ್ವಾಮೀಜಿ, ಶ್ರೀ ಶಿವಕುಮಾರ ಸ್ವಾಮಿ ಅಥವಾ ಡಾ. ಶಿವಕುಮಾರ ಮಹಾಸ್ವಾಮೀಜಿ ಎಂದೂ ಪ್ರಸಿದ್ಧರಾದವರು (1 ಏಪ್ರಿಲ್ 1907 – 21 ಜನವರಿ 2019), ತುಮಕೂರು ಸಮೀಪದ ಸಿದ್ಧಗಂಗಾ ಮಠದ ಪೂಜ್ಯ ಪೀಠಾಧಿಪತಿಯಾಗಿದ್ದರು. ಅವರು ಶಿಕ್ಷಣ ಮತ್ತು ಅನ್ನದಾಸೋಹದ ಮೂಲಕ ಸೇವೆಗೆ ತಮ್ಮ ಜೀವನವನ್ನು ಸಮರ್ಪಿಸಿದ ಆಧ್ಯಾತ್ಮಿಕ ನಾಯಕ, ಶಿಕ್ಷಣತಜ್ಞ, ಮಾನವತಾವಾದಿ ಮತ್ತು ಸಮಾಜ ಸುಧಾರಕರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "ಅವರು ಸಿದ್ಧಗಂಗಾ ಮಠದ ಪೀಠಾಧಿಪತಿಯಾಗಿ ಅನೇಕ ದಶಕಗಳ ಕಾಲ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಅವರ ನಾಯಕತ್ವದಲ್ಲಿ ಮಠವು ಶಿಕ್ಷಣ ಮತ್ತು ಸಮಾಜಸೇವೆಯ ಪ್ರಮುಖ ಕೇಂದ್ರವಾಗಿ ಬೆಳೆದಿತು. ಸಿದ್ಧಗಂಗಾ ಮಠದೊಂದಿಗೆ ಸಂಬಂಧಿಸಿದ ಸಂಸ್ಥೆಗಳ ಮೂಲಕ ಸಾವಿರಾರು ಬಡ ಮತ್ತು ಗ್ರಾಮೀಣ ಮಕ್ಕಳಿಗೆ ಉಚಿತ ಆಹಾರ, ವಸತಿ ಮತ್ತು ಶಿಕ್ಷಣ ದೊರಕಿತು.\n" +
                    "\n" +
                    "### ಸೇವೆ ಮತ್ತು ಶಿಕ್ಷಣ\n" +
                    "\n" +
                    "ಶಿವಕುಮಾರ ಸ್ವಾಮೀಜಿ ಅವರು ಜ್ಞಾನ ದಾಸೋಹ ಮತ್ತು ಅನ್ನ ದಾಸೋಹವನ್ನು ನಂಬಿದ್ದರು. ಅವರ ಸೇವೆ ಜಾತಿ, ಧರ್ಮ ಮತ್ತು ಆರ್ಥಿಕ ಭೇದಗಳನ್ನು ಮೀರಿ ಹರಡಿತು. ಕರುಣೆ ಮತ್ತು ಜೀವಮಾನ ಸೇವೆಯ ಕಾರಣದಿಂದ ಜನರು ಅವರನ್ನು ಪ್ರೀತಿಯಿಂದ “ನಡೆಯುವ ದೇವರು” ಎಂದು ಕರೆಯುತ್ತಿದ್ದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಅವರಿಗೆ 2015ರಲ್ಲಿ ಪದ್ಮಭೂಷಣ ಮತ್ತು 2007ರಲ್ಲಿ ಕರ್ನಾಟಕ ರತ್ನ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು. ಅವರು 2019ರಲ್ಲಿ 111ನೇ ವಯಸ್ಸಿನಲ್ಲಿ ನಿಧನರಾದರು. ಶಿವಕುಮಾರ ಸ್ವಾಮೀಜಿ ಅವರು ಕರ್ನಾಟಕದ ಅತ್ಯಂತ ಗೌರವಾನ್ವಿತ ಆಧ್ಯಾತ್ಮಿಕ ಮತ್ತು ಮಾನವತಾವಾದಿ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಉಳಿದಿದ್ದಾರೆ.\n"),

        h("Tumakuru", "ತುಮಕೂರು", "Doddarange Gowda", "ದೊಡ್ಡರಂಗೇಗೌಡ",
            "Doddarange Gowda (born 7 February 1946) is a Kannada poet, lyricist, professor, and academic from Tumakuru district. He was born at Kurubarahalli in Madhugiri taluk and became known for his contribution to Kannada poetry, film songs, and teaching.\n" +
                    "\n" +
                    "He worked as a professor of Kannada and later as a principal. Alongside his academic career, he wrote poems, literary works, and lyrics for Kannada cinema. Many of his film songs became popular for their simple language, emotional warmth, and closeness to rural Kannada life.\n" +
                    "\n" +
                    "### Literary and Film Work\n" +
                    "\n" +
                    "Doddarange Gowda has written hundreds of Kannada film songs and several poetry collections. His writing often reflects love for the Kannada language, folk feeling, rural experience, and human emotions. He also served in public literary life and was associated with Kannada cultural activities.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "He has received several honours for literature and film lyrics, including Karnataka State Film Awards and literary recognitions. He is remembered as a poet-lyricist who carried poetic Kannada into popular cinema and public culture.\n",
            "ದೊಡ್ಡರಂಗೇಗೌಡ (ಜನನ 7 ಫೆಬ್ರವರಿ 1946) ಅವರು ತುಮಕೂರು ಜಿಲ್ಲೆಯ ಕನ್ನಡ ಕವಿ, ಗೀತರಚನೆಕಾರ, ಪ್ರಾಧ್ಯಾಪಕ ಮತ್ತು ಶಿಕ್ಷಣತಜ್ಞರು. ಅವರು ಮಧುಗಿರಿ ತಾಲ್ಲೂಕಿನ ಕುರುಬರಹಳ್ಳಿಯಲ್ಲಿ ಜನಿಸಿ, ಕನ್ನಡ ಕಾವ್ಯ, ಚಲನಚಿತ್ರ ಗೀತೆಗಳು ಮತ್ತು ಬೋಧನೆಗೆ ನೀಡಿದ ಕೊಡುಗೆಯಿಂದ ಪ್ರಸಿದ್ಧರಾದರು.\n" +
                    "\n" +
                    "ಅವರು ಕನ್ನಡ ಪ್ರಾಧ್ಯಾಪಕರಾಗಿ ಮತ್ತು ನಂತರ ಪ್ರಾಂಶುಪಾಲರಾಗಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು. ಶಿಕ್ಷಣ ಕ್ಷೇತ್ರದ ಜೊತೆಗೆ ಕವಿತೆಗಳು, ಸಾಹಿತ್ಯ ಕೃತಿಗಳು ಮತ್ತು ಕನ್ನಡ ಚಲನಚಿತ್ರಗಳಿಗೆ ಗೀತೆಗಳನ್ನು ಬರೆದರು. ಅವರ ಅನೇಕ ಚಿತ್ರಗೀತೆಗಳು ಸರಳ ಭಾಷೆ, ಭಾವನಾತ್ಮಕ ಸೌಂದರ್ಯ ಮತ್ತು ಗ್ರಾಮೀಣ ಕನ್ನಡ ಜೀವನದ ಆತ್ಮೀಯತೆಯಿಂದ ಜನಪ್ರಿಯವಾದವು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯ ಮತ್ತು ಚಿತ್ರರಂಗದ ಕೆಲಸ\n" +
                    "\n" +
                    "ದೊಡ್ಡರಂಗೇಗೌಡ ಅವರು ನೂರಾರು ಕನ್ನಡ ಚಿತ್ರಗೀತೆಗಳನ್ನು ಮತ್ತು ಹಲವು ಕವನ ಸಂಕಲನಗಳನ್ನು ರಚಿಸಿದ್ದಾರೆ. ಅವರ ಬರಹಗಳಲ್ಲಿ ಕನ್ನಡ ಭಾಷೆಯ ಮೇಲಿನ ಪ್ರೀತಿ, ಜನಪದ ಭಾವ, ಗ್ರಾಮೀಣ ಅನುಭವ ಮತ್ತು ಮಾನವೀಯ ಭಾವನೆಗಳು ಕಾಣುತ್ತವೆ. ಅವರು ಕನ್ನಡ ಸಾಂಸ್ಕೃತಿಕ ಚಟುವಟಿಕೆಗಳು ಮತ್ತು ಸಾರ್ವಜನಿಕ ಸಾಹಿತ್ಯ ಜೀವನದಲ್ಲಿಯೂ ಸಕ್ರಿಯರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಸಾಹಿತ್ಯ ಮತ್ತು ಚಿತ್ರಗೀತೆಗಳಿಗಾಗಿ ಅವರಿಗೆ ಕರ್ನಾಟಕ ರಾಜ್ಯ ಚಲನಚಿತ್ರ ಪ್ರಶಸ್ತಿಗಳು ಸೇರಿದಂತೆ ಹಲವು ಗೌರವಗಳು ದೊರೆತಿವೆ. ಕಾವ್ಯಮಯ ಕನ್ನಡವನ್ನು ಜನಪ್ರಿಯ ಸಿನೆಮಾ ಮತ್ತು ಸಾರ್ವಜನಿಕ ಸಂಸ್ಕೃತಿಗೆ ತಂದ ಕವಿ-ಗೀತರಚನೆಕಾರರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Udupi", "ಉಡುಪಿ", "Kota Shivaram Karanth", "ಕೋಟ ಶಿವರಾಮ ಕಾರಂತ",
            "Kota Shivaram Karanth (10 October 1902 – 9 December 1997) was one of the most versatile figures in modern Kannada literature and culture. He was born at Kota near Kundapura in present-day Udupi district. He was a novelist, playwright, essayist, environmentalist, artist, Yakshagana reformer, filmmaker, educator, and encyclopedic scholar.\n" +
                    "\n" +
                    "Karanth wrote a vast number of books across many fields, including novels, children’s literature, science writing, essays, travel writing, drama, and cultural studies. His writing combined imagination, social observation, scientific curiosity, and deep concern for human life and nature.\n" +
                    "\n" +
                    "### Literature, Yakshagana, and Environment\n" +
                    "\n" +
                    "His important novels include Marali Mannige, Chomana Dudi, Mookajjiya Kanasugalu, and Bettada Jeeva. He worked to reform and popularise Yakshagana and wrote important studies on the art form. He was also active in environmental causes and opposed projects that threatened ecology and local communities.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "Karanth received the Jnanpith Award in 1977 for Mookajjiya Kanasugalu, along with many other honours. He is remembered as a many-sided genius who expanded the possibilities of Kannada literature, theatre, education, and cultural thought.\n",
            "ಕೋಟ ಶಿವರಾಮ ಕಾರಂತ (10 ಅಕ್ಟೋಬರ್ 1902 – 9 ಡಿಸೆಂಬರ್ 1997) ಅವರು ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಮತ್ತು ಸಂಸ್ಕೃತಿಯ ಅತ್ಯಂತ ಬಹುಮುಖ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರು. ಅವರು ಈಗಿನ ಉಡುಪಿ ಜಿಲ್ಲೆಯ ಕುಂದಾಪುರ ಸಮೀಪದ ಕೋಟದಲ್ಲಿ ಜನಿಸಿದರು. ಕಾದಂಬರಿಕಾರ, ನಾಟಕಕಾರ, ಪ್ರಬಂಧಕಾರ, ಪರಿಸರವಾದಿ, ಕಲಾವಿದ, ಯಕ್ಷಗಾನ ಸುಧಾರಕ, ಚಲನಚಿತ್ರಕಾರ, ಶಿಕ್ಷಣತಜ್ಞ ಮತ್ತು ವಿಶ್ವಕೋಶೀಯ ಪಂಡಿತರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "ಕಾರಂತರು ಕಾದಂಬರಿ, ಮಕ್ಕಳ ಸಾಹಿತ್ಯ, ವಿಜ್ಞಾನ ಬರಹ, ಪ್ರಬಂಧ, ಪ್ರವಾಸ ಬರಹ, ನಾಟಕ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಅಧ್ಯಯನ ಸೇರಿದಂತೆ ಅನೇಕ ಕ್ಷೇತ್ರಗಳಲ್ಲಿ ಅಪಾರ ಸಂಖ್ಯೆಯ ಪುಸ್ತಕಗಳನ್ನು ಬರೆದರು. ಅವರ ಬರಹಗಳಲ್ಲಿ ಕಲ್ಪನೆ, ಸಾಮಾಜಿಕ ಅವಲೋಕನ, ವೈಜ್ಞಾನಿಕ ಕುತೂಹಲ ಮತ್ತು ಮಾನವ ಜೀವನ ಹಾಗೂ ಪ್ರಕೃತಿಯ ಬಗ್ಗೆ ಆಳವಾದ ಕಾಳಜಿ ಕಾಣುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯ, ಯಕ್ಷಗಾನ ಮತ್ತು ಪರಿಸರ\n" +
                    "\n" +
                    "ಮರಳಿ ಮಣ್ಣಿಗೆ, ಚೋಮನ ದುಡಿ, ಮೂಕಜ್ಜಿಯ ಕನಸುಗಳು ಮತ್ತು ಬೆಟ್ಟದ ಜೀವ ಅವರ ಪ್ರಮುಖ ಕಾದಂಬರಿಗಳಾಗಿವೆ. ಅವರು ಯಕ್ಷಗಾನವನ್ನು ಸುಧಾರಿಸಿ ಜನಪ್ರಿಯಗೊಳಿಸಲು ಶ್ರಮಿಸಿದರು ಮತ್ತು ಈ ಕಲೆಯ ಬಗ್ಗೆ ಮಹತ್ವದ ಅಧ್ಯಯನ ಕೃತಿಗಳನ್ನು ಬರೆದರು. ಪರಿಸರ ಹಾನಿ ಮತ್ತು ಸ್ಥಳೀಯ ಸಮುದಾಯಗಳಿಗೆ ಧಕ್ಕೆ ತರುವ ಯೋಜನೆಗಳ ವಿರುದ್ಧವೂ ಅವರು ಸಕ್ರಿಯರಾಗಿದ್ದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಮೂಕಜ್ಜಿಯ ಕನಸುಗಳು ಕೃತಿಗೆ 1977ರಲ್ಲಿ ಕಾರಂತರಿಗೆ ಜ್ಞಾನಪೀಠ ಪ್ರಶಸ್ತಿ ಲಭಿಸಿತು. ಇನ್ನೂ ಅನೇಕ ಗೌರವಗಳು ಅವರಿಗೆ ದೊರಕಿವೆ. ಕನ್ನಡ ಸಾಹಿತ್ಯ, ರಂಗಭೂಮಿ, ಶಿಕ್ಷಣ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಚಿಂತನೆಯ ಸಾಧ್ಯತೆಗಳನ್ನು ವಿಸ್ತರಿಸಿದ ಬಹುಮುಖ ಪ್ರತಿಭೆಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Udupi", "ಉಡುಪಿ", "Gopalakrishna Adiga", "ಗೋಪಾಲಕೃಷ್ಣ ಅಡಿಗ",
            "Mogeri Gopalakrishna Adiga (18 February 1918 – 14 November 1992) was a major modern Kannada poet, critic, teacher, and thinker from the coastal Karnataka region. He is widely regarded as the pioneer of the Navya movement in Kannada poetry.\n" +
                    "\n" +
                    "Adiga moved Kannada poetry away from earlier romantic and devotional styles toward modernist expression. His poems explored alienation, urban life, social change, individual anxiety, political disillusionment, and the moral problems of modern society.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "His important poetry collections include Bhoomigeeta, Chandegalu, Nadedu Banda Dari, and Vardhamana. He also wrote criticism and essays that shaped modern Kannada literary debates. His poetic language was intense, intellectual, and experimental.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Gopalakrishna Adiga is remembered as the doyen of modern Kannada poetry. His influence on later Kannada poets was immense, and the Navya movement became one of the most important phases of 20th-century Kannada literature.\n",
            "ಮೊಗೇರಿ ಗೋಪಾಲಕೃಷ್ಣ ಅಡಿಗ (18 ಫೆಬ್ರವರಿ 1918 – 14 ನವೆಂಬರ್ 1992) ಅವರು ಕರಾವಳಿ ಕರ್ನಾಟಕದ ಪ್ರಮುಖ ಆಧುನಿಕ ಕನ್ನಡ ಕವಿ, ವಿಮರ್ಶಕ, ಶಿಕ್ಷಕ ಮತ್ತು ಚಿಂತಕರಾಗಿದ್ದರು. ಕನ್ನಡ ಕಾವ್ಯದ ನವ್ಯ ಚಳವಳಿಯ ಪಥಪ್ರದರ್ಶಕರಾಗಿ ಅವರನ್ನು ವ್ಯಾಪಕವಾಗಿ ಗುರುತಿಸಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "ಅಡಿಗರು ಕನ್ನಡ ಕಾವ್ಯವನ್ನು ಹಿಂದಿನ ರಮ್ಯ ಮತ್ತು ಭಕ್ತಿಪರ ಶೈಲಿಗಳಿಂದ ದೂರ ಮಾಡಿ ಆಧುನಿಕ ಅಭಿವ್ಯಕ್ತಿಯತ್ತ ಕೊಂಡೊಯ್ದರು. ಅವರ ಕವಿತೆಗಳು ಏಕಾಂತ, ನಗರ ಜೀವನ, ಸಾಮಾಜಿಕ ಬದಲಾವಣೆ, ವ್ಯಕ್ತಿಯ ಆತಂಕ, ರಾಜಕೀಯ ನಿರಾಶೆ ಮತ್ತು ಆಧುನಿಕ ಸಮಾಜದ ನೈತಿಕ ಪ್ರಶ್ನೆಗಳನ್ನು ಅನ್ವೇಷಿಸುತ್ತವೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಭೂಮಿಗೀತ, ಚಂಡೆಮದ್ದಳೆ, ನಡೆದು ಬಂದ ದಾರಿ ಮತ್ತು ವರ್ಧಮಾನ ಅವರ ಪ್ರಮುಖ ಕವನ ಸಂಕಲನಗಳಾಗಿವೆ. ಆಧುನಿಕ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಚರ್ಚೆಗಳನ್ನು ರೂಪಿಸಿದ ವಿಮರ್ಶೆ ಮತ್ತು ಪ್ರಬಂಧಗಳನ್ನೂ ಅವರು ಬರೆದರು. ಅವರ ಕಾವ್ಯಭಾಷೆ ತೀವ್ರ, ಬೌದ್ಧಿಕ ಮತ್ತು ಪ್ರಯೋಗಶೀಲವಾಗಿತ್ತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಗೋಪಾಲಕೃಷ್ಣ ಅಡಿಗರು ಆಧುನಿಕ ಕನ್ನಡ ಕಾವ್ಯದ ಪ್ರಮುಖ ಶಿಲ್ಪಿಯಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ನಂತರದ ಕನ್ನಡ ಕವಿಗಳ ಮೇಲೆ ಅವರ ಪ್ರಭಾವ ಅತ್ಯಂತ ದೊಡ್ಡದು. ನವ್ಯ ಚಳವಳಿ 20ನೇ ಶತಮಾನದ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಅತ್ಯಂತ ಪ್ರಮುಖ ಹಂತಗಳಲ್ಲಿ ಒಂದಾಯಿತು.\n"),

        h("Udupi", "ಉಡುಪಿ", "Vaidehi", "ವೈದೇಹಿ",
            "Vaidehi, pen name of Janaki Srinivasa Murthy (born 12 February 1945), is an important Kannada writer from Kundapura in Udupi district. She is known for short stories, novels, essays, poems, children’s plays, translations, and women-centred writing.\n" +
                    "\n" +
                    "Vaidehi’s writing is rooted in the coastal Karnataka world of Kundapura, its language, domestic spaces, women’s lives, memories, and everyday emotional experiences. Her stories often portray women’s inner lives, social restrictions, family relationships, silence, resistance, and dignity.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "Her notable works include Ammacchi Yemba Nenapu, Gulabi Talkies, Krouncha Pakshigalu, Asprushyaru, and many short story collections. Several of her works have been adapted for theatre and cinema, including Gulabi Talkies.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "Vaidehi has received several honours, including the Sahitya Akademi Award and Karnataka State literary awards. She is remembered as one of the major women writers in Kannada whose work brought coastal speech, women’s experience, and quiet emotional power into modern fiction.\n",
            "ವೈದೇಹಿ, ಜನಕಿ ಶ್ರೀನಿವಾಸ ಮೂರ್ತಿ ಅವರ ಕಾವ್ಯನಾಮ (ಜನನ 12 ಫೆಬ್ರವರಿ 1945), ಉಡುಪಿ ಜಿಲ್ಲೆಯ ಕುಂದಾಪುರದ ಪ್ರಮುಖ ಕನ್ನಡ ಬರಹಗಾರ್ತಿ. ಅವರು ಕಥೆಗಳು, ಕಾದಂಬರಿಗಳು, ಪ್ರಬಂಧಗಳು, ಕವಿತೆಗಳು, ಮಕ್ಕಳ ನಾಟಕಗಳು, ಅನುವಾದಗಳು ಮತ್ತು ಮಹಿಳಾ ಕೇಂದ್ರಿತ ಬರವಣಿಗೆಯಿಗಾಗಿ ಪ್ರಸಿದ್ಧರು.\n" +
                    "\n" +
                    "ವೈದೇಹಿಯವರ ಬರಹ ಕುಂದಾಪುರದ ಕರಾವಳಿ ಜಗತ್ತು, ಅದರ ಭಾಷೆ, ಮನೆಯ ವಾತಾವರಣ, ಮಹಿಳೆಯರ ಜೀವನ, ನೆನಪುಗಳು ಮತ್ತು ದೈನಂದಿನ ಭಾವನಾತ್ಮಕ ಅನುಭವಗಳಲ್ಲಿ ಬೇರುಬಿಟ್ಟಿದೆ. ಅವರ ಕಥೆಗಳು ಮಹಿಳೆಯರ ಒಳಜಗತ್ತು, ಸಾಮಾಜಿಕ ನಿರ್ಬಂಧಗಳು, ಕುಟುಂಬ ಸಂಬಂಧಗಳು, ಮೌನ, ಪ್ರತಿರೋಧ ಮತ್ತು ಗೌರವವನ್ನು ಚಿತ್ರಿಸುತ್ತವೆ.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಅಮ್ಮಚ್ಚಿಯೆಂಬ ನೆನಪು, ಗುಲಾಬಿ ಟಾಕೀಸ್, ಕ್ರೌಂಚ ಪಕ್ಷಿಗಳು, ಅಸ್ಪೃಶ್ಯರು ಮತ್ತು ಅನೇಕ ಕಥಾ ಸಂಕಲನಗಳು ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳಾಗಿವೆ. ಅವರ ಹಲವಾರು ಕೃತಿಗಳು ರಂಗಭೂಮಿ ಮತ್ತು ಚಲನಚಿತ್ರಗಳಾಗಿ ರೂಪುಗೊಂಡಿವೆ. ಗುಲಾಬಿ ಟಾಕೀಸ್ ಅದರಲ್ಲಿ ಪ್ರಮುಖವಾದುದು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ವೈದೇಹಿ ಅವರಿಗೆ ಸಾಹಿತ್ಯ ಅಕಾಡೆಮಿ ಪ್ರಶಸ್ತಿ ಮತ್ತು ಕರ್ನಾಟಕ ರಾಜ್ಯದ ಸಾಹಿತ್ಯ ಪ್ರಶಸ್ತಿಗಳು ಸೇರಿದಂತೆ ಹಲವು ಗೌರವಗಳು ಲಭಿಸಿವೆ. ಕರಾವಳಿ ಭಾಷೆ, ಮಹಿಳೆಯರ ಅನುಭವ ಮತ್ತು ಮೌನವಾದ ಭಾವನಾತ್ಮಕ ಶಕ್ತಿಯನ್ನು ಆಧುನಿಕ ಕಥಾಸಾಹಿತ್ಯಕ್ಕೆ ತಂದ ಕನ್ನಡದ ಪ್ರಮುಖ ಮಹಿಳಾ ಬರಹಗಾರ್ತಿಯಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Uttara Kannada", "ಉತ್ತರ ಕನ್ನಡ", "Dinakar Desai", "ದಿನಕರ ದೇಸಾಯಿ",
            "Dinakar Desai (10 September 1909 – 6 November 1982) was a freedom fighter, poet, educationist, social worker, and political activist from Uttara Kannada. He is remembered for his literary work as well as for his struggles on behalf of farmers and common people.\n" +
                    "\n" +
                    "During British rule, Desai took part in nationalist activities and was deported from Uttara Kannada district under the Defence of India Rules from 1940 to 1945. After independence, he continued to work for social justice, education, and land reforms in the region.\n" +
                    "\n" +
                    "### Public Work and Literature\n" +
                    "\n" +
                    "Dinakar Desai became known for his campaign against landlord domination and for the rights of tenant farmers. He was also a poet and writer whose works reflected social concern, patriotism, and love for the people of Uttara Kannada.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "He is remembered as one of Uttara Kannada’s important public figures: a freedom fighter, literary personality, and reformer who connected poetry with people’s struggles.\n",
            "ದಿನಕರ ದೇಸಾಯಿ (10 ಸೆಪ್ಟೆಂಬರ್ 1909 – 6 ನವೆಂಬರ್ 1982) ಅವರು ಉತ್ತರ ಕನ್ನಡದ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ಕವಿ, ಶಿಕ್ಷಣತಜ್ಞ, ಸಮಾಜಸೇವಕ ಮತ್ತು ರಾಜಕೀಯ ಕಾರ್ಯಕರ್ತರಾಗಿದ್ದರು. ಸಾಹಿತ್ಯಿಕ ಕೆಲಸದ ಜೊತೆಗೆ ರೈತರು ಮತ್ತು ಸಾಮಾನ್ಯ ಜನರ ಪರ ಹೋರಾಡಿದ ಕಾರಣ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "ಬ್ರಿಟಿಷ್ ಆಳ್ವಿಕೆಯ ಕಾಲದಲ್ಲಿ ದೇಸಾಯಿ ಅವರು ರಾಷ್ಟ್ರೀಯ ಚಟುವಟಿಕೆಗಳಲ್ಲಿ ಭಾಗವಹಿಸಿದರು. 1940ರಿಂದ 1945ರವರೆಗೆ ಡಿಫೆನ್ಸ್ ಆಫ್ ಇಂಡಿಯಾ ನಿಯಮಗಳ ಅಡಿಯಲ್ಲಿ ಅವರನ್ನು ಉತ್ತರ ಕನ್ನಡ ಜಿಲ್ಲೆಯಿಂದ ಹೊರಹಾಕಲಾಗಿತ್ತು. ಸ್ವಾತಂತ್ರ್ಯಾನಂತರವೂ ಅವರು ಸಾಮಾಜಿಕ ನ್ಯಾಯ, ಶಿಕ್ಷಣ ಮತ್ತು ಭೂ ಸುಧಾರಣೆಗಾಗಿ ಕೆಲಸ ಮುಂದುವರಿಸಿದರು.\n" +
                    "\n" +
                    "### ಸಾರ್ವಜನಿಕ ಕೆಲಸ ಮತ್ತು ಸಾಹಿತ್ಯ\n" +
                    "\n" +
                    "ದಿನಕರ ದೇಸಾಯಿ ಅವರು ಜಮೀನ್ದಾರರ ಪ್ರಾಬಲ್ಯದ ವಿರುದ್ಧ ಮತ್ತು ಗೇಣಿ ರೈತರ ಹಕ್ಕುಗಳಿಗಾಗಿ ನಡೆಸಿದ ಹೋರಾಟದಿಂದ ಪ್ರಸಿದ್ಧರಾದರು. ಸಮಾಜ ಕಾಳಜಿ, ದೇಶಭಕ್ತಿ ಮತ್ತು ಉತ್ತರ ಕನ್ನಡದ ಜನರ ಮೇಲಿನ ಪ್ರೀತಿಯನ್ನು ವ್ಯಕ್ತಪಡಿಸಿದ ಕವಿ ಮತ್ತು ಬರಹಗಾರರಾಗಿಯೂ ಅವರು ಹೆಸರಾದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟಗಾರ, ಸಾಹಿತ್ಯಿಕ ವ್ಯಕ್ತಿ ಮತ್ತು ಜನ ಹೋರಾಟಗಳೊಂದಿಗೆ ಕಾವ್ಯವನ್ನು ಜೋಡಿಸಿದ ಸುಧಾರಕರಾಗಿ ಅವರು ಉತ್ತರ ಕನ್ನಡದ ಪ್ರಮುಖ ಸಾರ್ವಜನಿಕ ವ್ಯಕ್ತಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),

        h("Uttara Kannada", "ಉತ್ತರ ಕನ್ನಡ", "Gourish Kaikini", "ಗೌರೀಶ್ ಕೈಕಿಣಿ",
            "Gourish Kaikini (12 September 1912 – 14 November 2002) was a Kannada writer, teacher, critic, thinker, journalist, and literary personality from Gokarna in Uttara Kannada district. He played an important role in Kannada intellectual and literary life.\n" +
                    "\n" +
                    "Kaikini was known for thoughtful prose, literary criticism, essays, and interpretation of ideas from science, philosophy, and world literature for Kannada readers. He had a scientific temperament and wrote in a style that was both poetic and reflective.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "He wrote essays, criticism, stories, and works connected with social and cultural thought. His writing helped introduce new ideas to Kannada readers while remaining rooted in the cultural life of Uttara Kannada. He was also a teacher and influenced many students and writers.\n" +
                    "\n" +
                    "### Awards and Legacy\n" +
                    "\n" +
                    "Gourish Kaikini received several honours, including the Karnataka Rajyotsava Award and other literary recognitions. He is remembered as a thoughtful Kannada prose writer and critic whose writings remain relevant for their intellectual depth and social insight.\n",
            "ಗೌರೀಶ್ ಕೈಕಿಣಿ (12 ಸೆಪ್ಟೆಂಬರ್ 1912 – 14 ನವೆಂಬರ್ 2002) ಅವರು ಉತ್ತರ ಕನ್ನಡ ಜಿಲ್ಲೆಯ ಗೋಕರ್ಣದ ಕನ್ನಡ ಬರಹಗಾರ, ಶಿಕ್ಷಕ, ವಿಮರ್ಶಕ, ಚಿಂತಕ, ಪತ್ರಕರ್ತ ಮತ್ತು ಸಾಹಿತ್ಯಿಕ ವ್ಯಕ್ತಿಯಾಗಿದ್ದರು. ಕನ್ನಡ ಬೌದ್ಧಿಕ ಮತ್ತು ಸಾಹಿತ್ಯಿಕ ಜೀವನದಲ್ಲಿ ಅವರು ಪ್ರಮುಖ ಪಾತ್ರವಹಿಸಿದರು.\n" +
                    "\n" +
                    "ಕೈಕಿಣಿ ಅವರು ಚಿಂತನೆಪೂರ್ಣ ಗದ್ಯ, ಸಾಹಿತ್ಯ ವಿಮರ್ಶೆ, ಪ್ರಬಂಧಗಳು ಮತ್ತು ವಿಜ್ಞಾನ, ತತ್ತ್ವಶಾಸ್ತ್ರ ಹಾಗೂ ವಿಶ್ವಸಾಹಿತ್ಯದ ವಿಚಾರಗಳನ್ನು ಕನ್ನಡ ಓದುಗರಿಗೆ ಪರಿಚಯಿಸುವ ಕೆಲಸಕ್ಕಾಗಿ ಪ್ರಸಿದ್ಧರಾಗಿದ್ದರು. ಅವರಿಗೆ ವೈಜ್ಞಾನಿಕ ಮನೋಭಾವವಿದ್ದು, ಅವರ ಬರವಣಿಗೆ ಕಾವ್ಯಾತ್ಮಕವೂ ಚಿಂತನಶೀಲವೂ ಆಗಿತ್ತು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಅವರು ಪ್ರಬಂಧಗಳು, ವಿಮರ್ಶೆ, ಕಥೆಗಳು ಮತ್ತು ಸಾಮಾಜಿಕ-ಸಾಂಸ್ಕೃತಿಕ ಚಿಂತನೆಗೆ ಸಂಬಂಧಿಸಿದ ಕೃತಿಗಳನ್ನು ಬರೆದರು. ಉತ್ತರ ಕನ್ನಡದ ಸಾಂಸ್ಕೃತಿಕ ಜೀವನದಲ್ಲಿ ಬೇರುಬಿಟ್ಟಿದ್ದರೂ, ಹೊಸ ವಿಚಾರಗಳನ್ನು ಕನ್ನಡ ಓದುಗರಿಗೆ ತಲುಪಿಸಲು ಅವರ ಬರಹಗಳು ನೆರವಾದವು. ಶಿಕ್ಷಕರಾಗಿಯೂ ಅವರು ಅನೇಕ ವಿದ್ಯಾರ್ಥಿಗಳು ಮತ್ತು ಬರಹಗಾರರ ಮೇಲೆ ಪ್ರಭಾವ ಬೀರಿದರು.\n" +
                    "\n" +
                    "### ಪ್ರಶಸ್ತಿಗಳು ಮತ್ತು ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಗೌರೀಶ್ ಕೈಕಿಣಿ ಅವರಿಗೆ ಕರ್ನಾಟಕ ರಾಜ್ಯೋತ್ಸವ ಪ್ರಶಸ್ತಿ ಸೇರಿದಂತೆ ಹಲವು ಸಾಹಿತ್ಯಿಕ ಗೌರವಗಳು ದೊರೆತಿವೆ. ಬೌದ್ಧಿಕ ಆಳ ಮತ್ತು ಸಾಮಾಜಿಕ ಒಳನೋಟಗಳಿಂದ ಇಂದಿಗೂ ಪ್ರಸ್ತುತವಾಗಿರುವ ಕನ್ನಡದ ಚಿಂತನೆಪೂರ್ಣ ಗದ್ಯ ಬರಹಗಾರ ಮತ್ತು ವಿಮರ್ಶಕರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n"),
        h("Vijayapura", "ವಿಜಯಪುರ", "Basavanna", "ಬಸವಣ್ಣ",
            "Basavanna, also known as Basaveshwara (c. 1131 – c. 1167), was a 12th-century philosopher, statesman, social reformer, and Kannada Vachana poet. He was born at Bagewadi, now Basavana Bagewadi in Vijayapura district, and later served in the court of the Kalachuri king Bijjala II at Kalyana.\n" +
                    "\n" +
                    "Basavanna challenged caste hierarchy, ritualism, gender discrimination, and social inequality. He taught that devotion, honest work, equality, and moral conduct were more important than birth-based status. His ideas became central to the Sharana movement and the Lingayat tradition.\n" +
                    "\n" +
                    "### Vachanas and Social Reform\n" +
                    "\n" +
                    "Basavanna expressed his thoughts through Vachanas, short and direct Kannada prose-poems. His vachanas spoke about kayaka, meaning dignified work, and dasoha, meaning sharing with others. He is also associated with Anubhava Mantapa, a spiritual and social forum where Sharanas discussed devotion, ethics, equality, and reform.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Basavanna remains one of Karnataka’s most influential spiritual and social thinkers. His vachanas continue to be read for their simplicity, moral courage, and message of human equality. Basava Jayanti is celebrated in his honour across Karnataka and other parts of India.\n",
            "ಬಸವಣ್ಣ, ಬಸವೇಶ್ವರ ಎಂದೂ ಪ್ರಸಿದ್ಧರಾದವರು (ಸುಮಾರು 1131 – ಸುಮಾರು 1167), 12ನೇ ಶತಮಾನದ ತತ್ತ್ವಜ್ಞಾನಿ, ರಾಜಕಾರಣಿ, ಸಮಾಜ ಸುಧಾರಕ ಮತ್ತು ಕನ್ನಡ ವಚನ ಕವಿಯಾಗಿದ್ದರು. ಅವರು ಈಗಿನ ವಿಜಯಪುರ ಜಿಲ್ಲೆಯ ಬಸವನ ಬಾಗೇವಾಡಿಯಲ್ಲಿ ಜನಿಸಿ, ನಂತರ ಕಲ್ಯಾಣದಲ್ಲಿ ಕಲಚುರಿ ಅರಸ ಬಿಜ್ಜಳ ದ್ವಿತೀಯನ ಅರಮನೆಯಲ್ಲಿ ಸೇವೆ ಸಲ್ಲಿಸಿದರು.\n" +
                    "\n" +
                    "ಬಸವಣ್ಣರು ಜಾತಿ ಕ್ರಮ, ಕರ್ಮಕಾಂಡ, ಲಿಂಗಭೇದ ಮತ್ತು ಸಾಮಾಜಿಕ ಅಸಮಾನತೆಯನ್ನು ಪ್ರಶ್ನಿಸಿದರು. ಭಕ್ತಿ, ಪ್ರಾಮಾಣಿಕ ಕೆಲಸ, ಸಮಾನತೆ ಮತ್ತು ನೈತಿಕ ನಡೆ ಜನ್ಮಾಧಾರಿತ ಸ್ಥಾನಕ್ಕಿಂತ ಮುಖ್ಯವೆಂದು ಬೋಧಿಸಿದರು. ಅವರ ವಿಚಾರಗಳು ಶರಣ ಚಳವಳಿ ಮತ್ತು ಲಿಂಗಾಯತ ಪರಂಪರೆಯ ಕೇಂದ್ರವಾಗಿವೆ.\n" +
                    "\n" +
                    "### ವಚನಗಳು ಮತ್ತು ಸಮಾಜ ಸುಧಾರಣೆ\n" +
                    "\n" +
                    "ಬಸವಣ್ಣರು ತಮ್ಮ ವಿಚಾರಗಳನ್ನು ವಚನಗಳ ಮೂಲಕ ವ್ಯಕ್ತಪಡಿಸಿದರು. ವಚನಗಳು ಚಿಕ್ಕದಾದ, ನೇರವಾದ ಕನ್ನಡ ಗದ್ಯ-ಕಾವ್ಯ ರೂಪಗಳು. ಅವರ ವಚನಗಳು ಕಾಯಕ, ಅಂದರೆ ಗೌರವಯುತ ಕೆಲಸ, ಮತ್ತು ದಾಸೋಹ, ಅಂದರೆ ಇತರರೊಂದಿಗೆ ಹಂಚಿಕೊಳ್ಳುವಿಕೆ, ಎಂಬ ಮೌಲ್ಯಗಳನ್ನು ಸಾರುತ್ತವೆ. ಶರಣರು ಭಕ್ತಿ, ನೀತಿ, ಸಮಾನತೆ ಮತ್ತು ಸುಧಾರಣೆ ಕುರಿತು ಚರ್ಚಿಸಿದ ಆಧ್ಯಾತ್ಮಿಕ-ಸಾಮಾಜಿಕ ವೇದಿಕೆಯಾದ ಅನುಭವ ಮಂಟಪದೊಂದಿಗೆ ಕೂಡ ಅವರು ಸಂಬಂಧ ಹೊಂದಿದ್ದಾರೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಬಸವಣ್ಣರು ಕರ್ನಾಟಕದ ಅತ್ಯಂತ ಪ್ರಭಾವಿ ಆಧ್ಯಾತ್ಮಿಕ ಮತ್ತು ಸಾಮಾಜಿಕ ಚಿಂತಕರಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಉಳಿದಿದ್ದಾರೆ. ಅವರ ವಚನಗಳು ಸರಳತೆ, ನೈತಿಕ ಧೈರ್ಯ ಮತ್ತು ಮಾನವ ಸಮಾನತೆಯ ಸಂದೇಶಕ್ಕಾಗಿ ಇಂದಿಗೂ ಓದಲ್ಪಡುತ್ತವೆ. ಅವರ ಗೌರವಾರ್ಥವಾಗಿ ಕರ್ನಾಟಕ ಮತ್ತು ಭಾರತದ ಅನೇಕ ಭಾಗಗಳಲ್ಲಿ ಬಸವ ಜಯಂತಿ ಆಚರಿಸಲಾಗುತ್ತದೆ.\n"),

        h("Vijayapura", "ವಿಜಯಪುರ", "Ibrahim Adil Shah II", "ಇಬ್ರಾಹಿಂ ಆದಿಲ್ ಶಾ ದ್ವಿತೀಯ",
            "Ibrahim Adil Shah II (1570 – 12 September 1627) was the Sultan of Bijapur from the Adil Shahi dynasty. He ruled from 1580 to 1627 and is remembered as one of the most cultured rulers of the Deccan. His capital Bijapur, now Vijayapura, became an important centre of music, art, literature, architecture, and religious harmony.\n" +
                    "\n" +
                    "Ibrahim Adil Shah II was deeply interested in music, poetry, painting, and philosophy. He was a patron of musicians, dancers, scholars, and artists. He wrote Kitab-i-Nauras in Dakhani, a work that celebrates music, ragas, devotion, and aesthetic experience.\n" +
                    "\n" +
                    "### Culture and Harmony\n" +
                    "\n" +
                    "His court reflected the mixed culture of the Deccan, bringing together Persian, Dakhani, Kannada, Marathi, Hindu, Islamic, and Sufi influences. He showed reverence for Saraswati, Ganesha, Sufi saints, and Islamic traditions, and is often remembered for promoting harmony between communities.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Ibrahim Adil Shah II is remembered as Jagadguru Badshah, a ruler whose kingship was shaped by music, learning, tolerance, and cultural imagination. Bijapur’s artistic and architectural heritage grew greatly during the Adil Shahi period, and his name remains closely linked with Vijayapura’s cultural history.\n",
            "ಇಬ್ರಾಹಿಂ ಆದಿಲ್ ಶಾ ದ್ವಿತೀಯ (1570 – 12 ಸೆಪ್ಟೆಂಬರ್ 1627) ಅವರು ಆದಿಲ್ ಶಾಹಿ ವಂಶದ ಬೀಜಾಪುರದ ಸುಲ್ತಾನರಾಗಿದ್ದರು. ಅವರು 1580ರಿಂದ 1627ರವರೆಗೆ ಆಳ್ವಿಕೆ ನಡೆಸಿದರು ಮತ್ತು ದಕ್ಕಣದ ಅತ್ಯಂತ ಸಂಸ್ಕೃತಿಪರ ಅರಸರಲ್ಲೊಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಅವರ ರಾಜಧಾನಿಯಾದ ಬೀಜಾಪುರ, ಇಂದಿನ ವಿಜಯಪುರ, ಸಂಗೀತ, ಕಲೆ, ಸಾಹಿತ್ಯ, ವಾಸ್ತುಶಿಲ್ಪ ಮತ್ತು ಧಾರ್ಮಿಕ ಸೌಹಾರ್ದದ ಪ್ರಮುಖ ಕೇಂದ್ರವಾಯಿತು.\n" +
                    "\n" +
                    "ಇಬ್ರಾಹಿಂ ಆದಿಲ್ ಶಾ ದ್ವಿತೀಯ ಅವರಿಗೆ ಸಂಗೀತ, ಕಾವ್ಯ, ಚಿತ್ರಕಲೆ ಮತ್ತು ತತ್ತ್ವಶಾಸ್ತ್ರದಲ್ಲಿ ಆಳವಾದ ಆಸಕ್ತಿ ಇತ್ತು. ಅವರು ಸಂಗೀತಗಾರರು, ನೃತ್ಯಗಾರರು, ಪಂಡಿತರು ಮತ್ತು ಕಲಾವಿದರಿಗೆ ಆಶ್ರಯ ನೀಡಿದರು. ಅವರು ದಖನಿ ಭಾಷೆಯಲ್ಲಿ ಕಿತಾಬ್-ಇ-ನೌರಸ್ ಎಂಬ ಕೃತಿಯನ್ನು ರಚಿಸಿದರು. ಈ ಕೃತಿ ಸಂಗೀತ, ರಾಗಗಳು, ಭಕ್ತಿ ಮತ್ತು ಸೌಂದರ್ಯಾನುಭವವನ್ನು ಕೊಂಡಾಡುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಸಂಸ್ಕೃತಿ ಮತ್ತು ಸೌಹಾರ್ದ\n" +
                    "\n" +
                    "ಅವರ ಅರಮನೆ ಪರ್ಷಿಯನ್, ದಖನಿ, ಕನ್ನಡ, ಮರಾಠಿ, ಹಿಂದೂ, ಇಸ್ಲಾಮಿಕ್ ಮತ್ತು ಸೂಫಿ ಪ್ರಭಾವಗಳನ್ನು ಒಟ್ಟುಗೂಡಿಸಿದ ದಕ್ಕಣದ ಮಿಶ್ರ ಸಂಸ್ಕೃತಿಯನ್ನು ಪ್ರತಿಬಿಂಬಿಸಿತು. ಅವರು ಸರಸ್ವತಿ, ಗಣೇಶ, ಸೂಫಿ ಸಂತರು ಮತ್ತು ಇಸ್ಲಾಮಿಕ್ ಪರಂಪರೆಗಳ ಬಗ್ಗೆ ಗೌರವ ತೋರಿದರು. ಸಮುದಾಯಗಳ ನಡುವೆ ಸೌಹಾರ್ದ ಬೆಳೆಸಿದ ಅರಸರಾಗಿ ಅವರನ್ನು ನೆನಪಿಸಲಾಗುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಇಬ್ರಾಹಿಂ ಆದಿಲ್ ಶಾ ದ್ವಿತೀಯ ಅವರು ಜಗದ್ಗುರು ಬಾದಶಾಹ್ ಎಂದು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಸಂಗೀತ, ವಿದ್ಯೆ, ಸಹಿಷ್ಣುತೆ ಮತ್ತು ಸಾಂಸ್ಕೃತಿಕ ಕಲ್ಪನೆಗಳಿಂದ ರೂಪುಗೊಂಡ ಅರಸರಾಗಿ ಅವರು ವಿಶಿಷ್ಟರು. ಆದಿಲ್ ಶಾಹಿ ಕಾಲದಲ್ಲಿ ಬೀಜಾಪುರದ ಕಲಾ ಮತ್ತು ವಾಸ್ತುಶಿಲ್ಪ ಪರಂಪರೆ ಬಹಳವಾಗಿ ಬೆಳೆದಿತು. ವಿಜಯಪುರದ ಸಾಂಸ್ಕೃತಿಕ ಇತಿಹಾಸದೊಂದಿಗೆ ಅವರ ಹೆಸರು ಆಳವಾಗಿ ಸಂಬಂಧಿಸಿದೆ.\n"),

        h("Vijayanagara", "ವಿಜಯನಗರ", "Harihara", "ಹರಿಹರ",
            "Harihara, also known as Harisvara, was an important medieval Kannada poet of the 12th century. He is associated with early Virashaiva literature and is remembered as one of the major poets who shaped Kannada literary expression after the Vachana movement.\n" +
                    "\n" +
                    "Harihara was connected with the Hoysala period and is said to have served under the patronage of Hoysala king Narasimha I. His poetry drew deeply from Shaiva devotion, the lives of saints, and the spiritual energy of the Virashaiva tradition.\n" +
                    "\n" +
                    "### Literary Work\n" +
                    "\n" +
                    "Harihara is especially known for using the ragale metre in Kannada poetry. His important works include Girijakalyana and Nambiyanana Ragale, also known as Shivaganada Ragale. These works describe devotion to Shiva, the lives of Shaiva saints, and the ideals of spiritual surrender.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Harihara is remembered as a pioneer of the ragale form and a foundational poet in Virashaiva Kannada literature. His work influenced later poets, including Raghavanka, and helped expand the devotional and narrative possibilities of Kannada poetry.\n",
            "ಹರಿಹರ, ಹರೀಶ್ವರ ಎಂದೂ ಪರಿಚಿತರಾದವರು, 12ನೇ ಶತಮಾನದ ಪ್ರಮುಖ ಮಧ್ಯಯುಗದ ಕನ್ನಡ ಕವಿಯಾಗಿದ್ದರು. ಅವರು ಆರಂಭಿಕ ವೀರಶೈವ ಸಾಹಿತ್ಯದೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದ್ದು, ವಚನ ಚಳವಳಿಯ ನಂತರ ಕನ್ನಡ ಸಾಹಿತ್ಯಿಕ ಅಭಿವ್ಯಕ್ತಿಗೆ ರೂಪ ನೀಡಿದ ಪ್ರಮುಖ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "ಹರಿಹರರು ಹೊಯ್ಸಳ ಕಾಲದೊಂದಿಗೆ ಸಂಬಂಧ ಹೊಂದಿದ್ದರು ಮತ್ತು ಹೊಯ್ಸಳ ಅರಸ ನರಸಿಂಹ ಮೊದಲವರ ಆಶ್ರಯದಲ್ಲಿದ್ದರು ಎಂದು ಹೇಳಲಾಗುತ್ತದೆ. ಅವರ ಕಾವ್ಯವು ಶೈವ ಭಕ್ತಿ, ಸಂತರ ಜೀವನ ಮತ್ತು ವೀರಶೈವ ಪರಂಪರೆಯ ಆಧ್ಯಾತ್ಮಿಕ ಶಕ್ತಿಯಿಂದ ಆಳವಾಗಿ ಪ್ರೇರಿತವಾಗಿತ್ತು.\n" +
                    "\n" +
                    "### ಸಾಹಿತ್ಯಿಕ ಕೆಲಸ\n" +
                    "\n" +
                    "ಹರಿಹರರು ಕನ್ನಡ ಕಾವ್ಯದಲ್ಲಿ ರಗಳೆ ಛಂದಸ್ಸಿನ ಬಳಕೆಗೆ ವಿಶೇಷವಾಗಿ ಪ್ರಸಿದ್ಧರು. ಗಿರಿಜಾಕಲ್ಯಾಣ ಮತ್ತು ನಂಬಿಯಣ್ಣನ ರಗಳೆ, ಶಿವಗಣದ ರಗಳೆ ಎಂದೂ ಕರೆಯಲ್ಪಡುವ ಕೃತಿಗಳು, ಅವರ ಪ್ರಮುಖ ಕೃತಿಗಳಾಗಿವೆ. ಈ ಕೃತಿಗಳು ಶಿವಭಕ್ತಿ, ಶೈವ ಸಂತರ ಜೀವನ ಮತ್ತು ಆಧ್ಯಾತ್ಮಿಕ ಸಮರ್ಪಣೆಯ ಆದರ್ಶಗಳನ್ನು ವರ್ಣಿಸುತ್ತವೆ.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ಹರಿಹರರು ರಗಳೆ ರೂಪದ ಪಥಪ್ರದರ್ಶಕ ಮತ್ತು ವೀರಶೈವ ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಮೂಲಭೂತ ಕವಿಯಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಅವರ ಕೃತಿಗಳು ರಾಘವಾಂಕ ಸೇರಿದಂತೆ ನಂತರದ ಕವಿಗಳ ಮೇಲೆ ಪ್ರಭಾವ ಬೀರಿದವು ಮತ್ತು ಕನ್ನಡ ಕಾವ್ಯದ ಭಕ್ತಿ ಹಾಗೂ ಕಥನ ಸಾಮರ್ಥ್ಯವನ್ನು ವಿಸ್ತರಿಸಿತು.\n"),

        h("Vijayanagara", "ವಿಜಯನಗರ", "Raghavanka", "ರಾಘವಾಂಕ",
            "Raghavanka was a noted medieval Kannada poet who flourished in the late 12th and early 13th centuries. He belonged to the Virashaiva literary tradition and is remembered as one of the most important poets in the history of Kannada narrative poetry.\n" +
                    "\n" +
                    "Raghavanka was a disciple or literary successor of the poet Harihara. He is especially famous for bringing the shatpadi metre into high literary use in Kannada. His poetry combines devotion, drama, moral conflict, and powerful storytelling.\n" +
                    "\n" +
                    "### Harishchandra Kavya\n" +
                    "\n" +
                    "His masterpiece is Harishchandra Kavya, based on the story of King Harishchandra, who is tested for truth, duty, and sacrifice. The poem is admired for its emotional force, dramatic scenes, and deep moral vision. It became one of the classics of Kannada literature.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Raghavanka’s work helped make the shatpadi metre a major form in Kannada poetry. He influenced later Kannada poets and remains a central figure in medieval Kannada literature and Virashaiva literary history.\n",
            "ರಾಘವಾಂಕರು 12ನೇ ಶತಮಾನದ ಕೊನೆಯ ಭಾಗ ಮತ್ತು 13ನೇ ಶತಮಾನದ ಆರಂಭದಲ್ಲಿ ಬೆಳಗಿದ ಪ್ರಸಿದ್ಧ ಮಧ್ಯಯುಗದ ಕನ್ನಡ ಕವಿ. ಅವರು ವೀರಶೈವ ಸಾಹಿತ್ಯ ಪರಂಪರೆಗೆ ಸೇರಿದವರು ಮತ್ತು ಕನ್ನಡ ಕಥನ ಕಾವ್ಯದ ಇತಿಹಾಸದಲ್ಲಿ ಅತ್ಯಂತ ಪ್ರಮುಖ ಕವಿಗಳಲ್ಲಿ ಒಬ್ಬರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "ರಾಘವಾಂಕರು ಕವಿ ಹರಿಹರರ ಶಿಷ್ಯ ಅಥವಾ ಸಾಹಿತ್ಯ ಪರಂಪರೆಯ ಉತ್ತರಾಧಿಕಾರಿಯಾಗಿ ಪರಿಗಣಿಸಲ್ಪಡುತ್ತಾರೆ. ಕನ್ನಡದಲ್ಲಿ ಷಟ್ಪದಿ ಛಂದಸ್ಸನ್ನು ಉನ್ನತ ಸಾಹಿತ್ಯಿಕ ಬಳಕೆಗೆ ತಂದ ಕವಿಯಾಗಿ ಅವರು ವಿಶೇಷವಾಗಿ ಪ್ರಸಿದ್ಧರು. ಅವರ ಕಾವ್ಯದಲ್ಲಿ ಭಕ್ತಿ, ನಾಟಕೀಯತೆ, ನೈತಿಕ ಸಂಘರ್ಷ ಮತ್ತು ಶಕ್ತಿಶಾಲಿ ಕಥನ ಒಂದಾಗಿ ಕಾಣುತ್ತದೆ.\n" +
                    "\n" +
                    "### ಹರಿಶ್ಚಂದ್ರ ಕಾವ್ಯ\n" +
                    "\n" +
                    "ಅವರ ಶ್ರೇಷ್ಠ ಕೃತಿ ಹರಿಶ್ಚಂದ್ರ ಕಾವ್ಯ. ಸತ್ಯ, ಕರ್ತವ್ಯ ಮತ್ತು ತ್ಯಾಗಕ್ಕಾಗಿ ಪರೀಕ್ಷೆಗೆ ಒಳಗಾಗುವ ರಾಜ ಹರಿಶ್ಚಂದ್ರನ ಕಥೆಯನ್ನು ಇದು ಆಧರಿಸಿದೆ. ಭಾವನಾತ್ಮಕ ಶಕ್ತಿ, ನಾಟಕೀಯ ದೃಶ್ಯಗಳು ಮತ್ತು ಆಳವಾದ ನೈತಿಕ ದೃಷ್ಟಿಗಾಗಿ ಈ ಕೃತಿ ಮೆಚ್ಚುಗೆಯಾಗಿದೆ. ಇದು ಕನ್ನಡ ಸಾಹಿತ್ಯದ ಶ್ರೇಷ್ಠ ಕೃತಿಗಳಲ್ಲಿ ಒಂದಾಯಿತು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ರಾಘವಾಂಕರ ಕೃತಿಗಳು ಷಟ್ಪದಿ ಛಂದಸ್ಸನ್ನು ಕನ್ನಡ ಕಾವ್ಯದ ಪ್ರಮುಖ ರೂಪವನ್ನಾಗಿ ಮಾಡಲು ನೆರವಾದವು. ಅವರು ನಂತರದ ಕನ್ನಡ ಕವಿಗಳ ಮೇಲೆ ಪ್ರಭಾವ ಬೀರಿದರು ಮತ್ತು ಮಧ್ಯಯುಗದ ಕನ್ನಡ ಸಾಹಿತ್ಯ ಹಾಗೂ ವೀರಶೈವ ಸಾಹಿತ್ಯ ಇತಿಹಾಸದ ಕೇಂದ್ರ ವ್ಯಕ್ತಿಯಾಗಿ ಉಳಿದಿದ್ದಾರೆ.\n"),

        h("Yadgir", "ಯಾದಗಿರಿ", "Raja Venkatappa Nayaka of Shorapur", "ಶೋರಾಪುರದ ರಾಜ ವೆಂಕಟಪ್ಪ ನಾಯಕ",
            "Raja Venkatappa Nayaka IV, also known as Nalvadi Raja Venkatappa Nayaka (1843 – 1858), was the last ruler of the Shorapur or Surapur principality in present-day Yadgir district of Karnataka. Though very young, he became a symbol of resistance against the British East India Company during the period of the 1857 uprising.\n" +
                    "\n" +
                    "The British tried to control Shorapur through political supervision and pressure. Venkatappa Nayaka refused to accept British dominance and prepared to defend his state. His resistance was part of the wider unrest that spread across India during 1857 and 1858.\n" +
                    "\n" +
                    "### Resistance to the British\n" +
                    "\n" +
                    "In February 1858, forces connected with Shorapur fought the British near Surapur. The conflict became an important episode in the anti-British history of north Karnataka. After the British gained control, Venkatappa Nayaka was captured. He died in 1858 under disputed circumstances while still a young ruler.\n" +
                    "\n" +
                    "### Legacy\n" +
                    "\n" +
                    "Raja Venkatappa Nayaka is remembered as the brave young ruler of Shorapur who resisted colonial power. His name is honoured in Yadgir district and in Karnataka’s memory of the 1857 freedom struggle.\n",
            "ರಾಜ ವೆಂಕಟಪ್ಪ ನಾಯಕ ನಾಲ್ಕನೇಯವರು, ನಾಲ್ವಡಿ ರಾಜ ವೆಂಕಟಪ್ಪ ನಾಯಕ ಎಂದೂ ಪರಿಚಿತರಾದವರು (1843 – 1858), ಇಂದಿನ ಕರ್ನಾಟಕದ ಯಾದಗಿರಿ ಜಿಲ್ಲೆಯ ಶೋರಾಪುರ ಅಥವಾ ಸುರಪುರ ಸಂಸ್ಥಾನದ ಕೊನೆಯ ಅರಸನಾಗಿದ್ದರು. ತುಂಬಾ ಯುವಕರಾಗಿದ್ದರೂ, 1857ರ ಬಂಡಾಯದ ಅವಧಿಯಲ್ಲಿ ಬ್ರಿಟಿಷ್ ಈಸ್ಟ್ ಇಂಡಿಯಾ ಕಂಪನಿಗೆ ವಿರೋಧಿಸಿದ ಧೈರ್ಯಶಾಲಿ ಅರಸರಾಗಿ ಅವರು ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ.\n" +
                    "\n" +
                    "ಬ್ರಿಟಿಷರು ರಾಜಕೀಯ ಮೇಲ್ವಿಚಾರಣೆ ಮತ್ತು ಒತ್ತಡದ ಮೂಲಕ ಶೋರಾಪುರವನ್ನು ತಮ್ಮ ನಿಯಂತ್ರಣಕ್ಕೆ ತರಲು ಪ್ರಯತ್ನಿಸಿದರು. ವೆಂಕಟಪ್ಪ ನಾಯಕರು ಬ್ರಿಟಿಷರ ಪ್ರಭುತ್ವವನ್ನು ಒಪ್ಪಲು ನಿರಾಕರಿಸಿ, ತಮ್ಮ ರಾಜ್ಯವನ್ನು ರಕ್ಷಿಸಲು ಸಿದ್ಧರಾದರು. ಅವರ ಪ್ರತಿರೋಧವು 1857 ಮತ್ತು 1858ರಲ್ಲಿ ಭಾರತದೆಲ್ಲೆಡೆ ಹರಡಿದ ಅಶಾಂತಿಯ ಒಂದು ಭಾಗವಾಗಿತ್ತು.\n" +
                    "\n" +
                    "### ಬ್ರಿಟಿಷರ ವಿರುದ್ಧದ ಹೋರಾಟ\n" +
                    "\n" +
                    "1858ರ ಫೆಬ್ರವರಿಯಲ್ಲಿ ಶೋರಾಪುರಕ್ಕೆ ಸಂಬಂಧಿಸಿದ ಪಡೆಗಳು ಸುರಪುರದ ಬಳಿ ಬ್ರಿಟಿಷರ ವಿರುದ್ಧ ಹೋರಾಡಿದವು. ಈ ಸಂಘರ್ಷ ಉತ್ತರ ಕರ್ನಾಟಕದ ಬ್ರಿಟಿಷ್ ವಿರೋಧಿ ಇತಿಹಾಸದ ಪ್ರಮುಖ ಘಟನೆಯಾಯಿತು. ಬ್ರಿಟಿಷರು ನಿಯಂತ್ರಣ ಪಡೆದ ನಂತರ ವೆಂಕಟಪ್ಪ ನಾಯಕರನ್ನು ಬಂಧಿಸಲಾಯಿತು. ಅವರು 1858ರಲ್ಲಿ ಇನ್ನೂ ಯುವ ಅರಸರಾಗಿದ್ದಾಗಲೇ ವಿವಾದಾಸ್ಪದ ಪರಿಸ್ಥಿತಿಯಲ್ಲಿ ನಿಧನರಾದರು.\n" +
                    "\n" +
                    "### ಸ್ಮರಣೆ\n" +
                    "\n" +
                    "ರಾಜ ವೆಂಕಟಪ್ಪ ನಾಯಕರು ವಸಾಹತುಶಾಹಿ ಅಧಿಕಾರಕ್ಕೆ ವಿರೋಧಿಸಿದ ಶೋರಾಪುರದ ಧೈರ್ಯಶಾಲಿ ಯುವ ಅರಸರಾಗಿ ಸ್ಮರಿಸಲ್ಪಡುತ್ತಾರೆ. ಯಾದಗಿರಿ ಜಿಲ್ಲೆಯಲ್ಲಿ ಮತ್ತು ಕರ್ನಾಟಕದ 1857ರ ಸ್ವಾತಂತ್ರ್ಯ ಹೋರಾಟದ ಸ್ಮರಣೆಯಲ್ಲಿ ಅವರ ಹೆಸರು ಗೌರವದಿಂದ ನೆನಪಾಗುತ್ತದೆ.\n"))

}
