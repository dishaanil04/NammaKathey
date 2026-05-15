package com.example.mmfinalproject

data class StatueInfo(
    val heroName: String,
    val district: String,
    val locationName: String,
    val latitude: Double,
    val longitude: Double,
    val wikipediaUrl: String,
    val mapsUrl: String,
    var distanceKm: Double = -1.0
)

object StatueData {

    val statues: List<StatueInfo> = listOf(

        // Bagalkote
        StatueInfo(
            "Halagali Bedas Memorial",
            "Bagalkote",
            "Halagali, Bagalkote",
            16.2113, 75.2807,
            "https://en.wikipedia.org/wiki/Halagali_revolt",
            "https://maps.google.com/?q=Halagali+Bagalkote+Karnataka"
        ),
        StatueInfo(
            "Ranna Statue",
            "Bagalkote",
            "Muddebihal, Bagalkote",
            16.3404, 76.1316,
            "https://en.wikipedia.org/wiki/Ranna",
            "https://maps.google.com/?q=Ranna+Statue+Muddebihal+Karnataka"
        ),

        // Ballari
        StatueInfo(
            "Bellary Raghava Memorial",
            "Ballari",
            "Ballari Town",
            15.1394, 76.9214,
            "https://en.wikipedia.org/wiki/Bellary_Raghava",
            "https://maps.google.com/?q=Ballari+Raghava+Statue+Ballari+Karnataka"
        ),

        // Belagavi
        StatueInfo(
            "Kittur Rani Chennamma Statue",
            "Belagavi",
            "Kittur, Belagavi",
            15.7333, 74.9667,
            "https://en.wikipedia.org/wiki/Kittur_Chennamma",
            "https://maps.google.com/?q=Kittur+Rani+Chennamma+Statue+Belagavi"
        ),
        StatueInfo(
            "Sangolli Rayanna Statue",
            "Belagavi",
            "Sangolli Village, Belagavi",
            15.8100, 74.9800,
            "https://en.wikipedia.org/wiki/Sangolli_Rayanna",
            "https://maps.google.com/?q=Sangolli+Rayanna+Statue+Sangolli+Belagavi"
        ),
        StatueInfo(
            "Gangadhar Rao Deshpande Statue",
            "Belagavi",
            "Belagavi City",
            15.8497, 74.4977,
            "https://en.wikipedia.org/wiki/Gangadhar_Rao_Deshpande",
            "https://maps.google.com/?q=Gangadhar+Rao+Deshpande+Statue+Belagavi"
        ),

        // Bengaluru Urban
        StatueInfo(
            "Sir M. Visvesvaraya Statue",
            "Bengaluru Urban",
            "Dr. B.R. Ambedkar Veedhi, Bengaluru",
            12.9779, 77.5904,
            "https://en.wikipedia.org/wiki/M._Visvesvaraya",
            "https://maps.google.com/?q=Visvesvaraya+Statue+Bengaluru"
        ),
        StatueInfo(
            "Girish Karnad Memorial",
            "Bengaluru Urban",
            "Rangoli Metro Art Center, Bengaluru",
            12.9762, 77.5726,
            "https://en.wikipedia.org/wiki/Girish_Karnad",
            "https://maps.google.com/?q=Girish+Karnad+Memorial+Bengaluru"
        ),
        StatueInfo(
            "Kempegowda Statue",
            "Bengaluru Urban",
            "Kempegowda International Airport, Bengaluru",
            13.1986, 77.7066,
            "https://en.wikipedia.org/wiki/Kempe_Gowda_I",
            "https://maps.google.com/?q=Kempegowda+Statue+Bengaluru+Airport"
        ),

        // Bengaluru Rural
        StatueInfo(
            "Tipu Sultan Birthplace Memorial",
            "Bengaluru Rural",
            "Devanahalli Fort, Bengaluru Rural",
            13.2497, 77.7119,
            "https://en.wikipedia.org/wiki/Tipu_Sultan",
            "https://maps.google.com/?q=Devanahalli+Fort+Tipu+Sultan+Birthplace"
        ),

        // Bidar
        StatueInfo(
            "Hyderabad-Karnataka Liberation Memorial",
            "Bidar",
            "Bidar City",
            17.9104, 77.5199,
            "https://en.wikipedia.org/wiki/Annexation_of_Hyderabad",
            "https://maps.google.com/?q=Liberation+Memorial+Bidar+Karnataka"
        ),

        // Chamarajanagar
        StatueInfo(
            "G. P. Rajarathnam Statue",
            "Chamarajanagar",
            "Chamarajanagar Town",
            11.9250, 76.9430,
            "https://en.wikipedia.org/wiki/G._P._Rajarathnam",
            "https://maps.google.com/?q=Rajarathnam+Statue+Chamarajanagar"
        ),

        // Chikkaballapura
        StatueInfo(
            "Sir M. Visvesvaraya Birth Place Museum",
            "Chikkaballapura",
            "Muddenahalli, Chikkaballapura",
            13.1827, 77.6499,
            "https://en.wikipedia.org/wiki/M._Visvesvaraya",
            "https://maps.google.com/?q=Visvesvaraya+Birth+Place+Museum+Muddenahalli"
        ),

        // Chikkamagaluru
        StatueInfo(
            "Kuvempu Statue",
            "Chikkamagaluru",
            "Kuppali, Chikkamagaluru",
            13.7290, 75.6270,
            "https://en.wikipedia.org/wiki/Kuvempu",
            "https://maps.google.com/?q=Kuvempu+Statue+Kuppali+Chikkamagaluru"
        ),
        StatueInfo(
            "Poornachandra Tejaswi Memorial",
            "Chikkamagaluru",
            "Mudigere, Chikkamagaluru",
            13.1322, 75.6385,
            "https://en.wikipedia.org/wiki/Poornachandra_Tejaswi",
            "https://maps.google.com/?q=Poornachandra+Tejaswi+Memorial+Mudigere"
        ),

        // Chitradurga
        StatueInfo(
            "Onake Obavva Statue",
            "Chitradurga",
            "Chitradurga Fort, Chitradurga",
            14.2251, 76.4023,
            "https://en.wikipedia.org/wiki/Onake_Obavva",
            "https://maps.google.com/?q=Onake+Obavva+Statue+Chitradurga+Fort"
        ),
        StatueInfo(
            "S. Nijalingappa Statue",
            "Chitradurga",
            "Chitradurga Town",
            14.2294, 76.3962,
            "https://en.wikipedia.org/wiki/S._Nijalingappa",
            "https://maps.google.com/?q=Nijalingappa+Statue+Chitradurga"
        ),

        // Dakshina Kannada
        StatueInfo(
            "Rani Abbakka Statue",
            "Dakshina Kannada",
            "Ullal, Mangaluru",
            12.8034, 74.8454,
            "https://en.wikipedia.org/wiki/Abbakka_Rani",
            "https://maps.google.com/?q=Rani+Abbakka+Statue+Ullal+Mangaluru"
        ),
        StatueInfo(
            "B. V. Karanth Memorial",
            "Dakshina Kannada",
            "Mangaluru",
            12.8698, 74.8423,
            "https://en.wikipedia.org/wiki/B._V._Karanth",
            "https://maps.google.com/?q=BV+Karanth+Memorial+Mangaluru"
        ),

        // Davanagere
        StatueInfo(
            "H. S. Venkateshamurthy Statue",
            "Davanagere",
            "Davanagere Town",
            14.4644, 75.9217,
            "https://en.wikipedia.org/wiki/H._S._Venkateshamurthy",
            "https://maps.google.com/?q=Venkateshamurthy+Statue+Davanagere"
        ),

        // Dharwad
        StatueInfo(
            "D. R. Bendre Statue",
            "Dharwad",
            "Dharwad City",
            15.4589, 75.0078,
            "https://en.wikipedia.org/wiki/D._R._Bendre",
            "https://maps.google.com/?q=DR+Bendre+Statue+Dharwad"
        ),
        StatueInfo(
            "Alur Venkata Rao Memorial",
            "Dharwad",
            "Dharwad City",
            15.4564, 75.0116,
            "https://en.wikipedia.org/wiki/Alur_Venkatarao",
            "https://maps.google.com/?q=Alur+Venkata+Rao+Memorial+Dharwad"
        ),

        // Gadag
        StatueInfo(
            "Puttaraj Gawai Statue",
            "Gadag",
            "Gadag Town",
            15.4276, 75.6217,
            "https://en.wikipedia.org/wiki/Puttaraj_Gawai",
            "https://maps.google.com/?q=Puttaraj+Gawai+Statue+Gadag"
        ),
        StatueInfo(
            "Kumaravyasa Memorial",
            "Gadag",
            "Gadag",
            15.4167, 75.6333,
            "https://en.wikipedia.org/wiki/Kumaravyasa",
            "https://maps.google.com/?q=Kumaravyasa+Memorial+Gadag+Karnataka"
        ),

        // Hassan
        StatueInfo(
            "Gorur Ramaswamy Iyengar Statue",
            "Hassan",
            "Hassan City",
            13.0068, 76.1004,
            "https://en.wikipedia.org/wiki/Gorur_Ramaswamy_Iyengar",
            "https://maps.google.com/?q=Gorur+Ramaswamy+Iyengar+Statue+Hassan"
        ),

        // Haveri
        StatueInfo(
            "Kanakadasa Statue",
            "Haveri",
            "Bada, Haveri",
            14.7500, 75.5000,
            "https://en.wikipedia.org/wiki/Kanakadasa",
            "https://maps.google.com/?q=Kanakadasa+Statue+Bada+Haveri"
        ),
        StatueInfo(
            "Sarvajna Statue",
            "Haveri",
            "Haveri Town",
            14.7936, 75.3997,
            "https://en.wikipedia.org/wiki/Sarvajna",
            "https://maps.google.com/?q=Sarvajna+Statue+Haveri+Karnataka"
        ),

        // Kalaburagi
        StatueInfo(
            "Liberation War Memorial",
            "Kalaburagi",
            "Kalaburagi City",
            17.3297, 76.8343,
            "https://en.wikipedia.org/wiki/Operation_Polo",
            "https://maps.google.com/?q=Liberation+War+Memorial+Kalaburagi"
        ),

        // Kodagu
        StatueInfo(
            "Kodagina Gouramma Memorial",
            "Kodagu",
            "Madikeri, Kodagu",
            12.4220, 75.7382,
            "https://en.wikipedia.org/wiki/Kodagina_Gouramma",
            "https://maps.google.com/?q=Kodagina+Gouramma+Memorial+Madikeri"
        ),

        // Kolar
        StatueInfo(
            "Masti Venkatesha Iyengar Statue",
            "Kolar",
            "Kolar Town",
            13.1353, 78.1294,
            "https://en.wikipedia.org/wiki/Masti_Venkatesha_Iyengar",
            "https://maps.google.com/?q=Masti+Venkatesha+Iyengar+Statue+Kolar"
        ),
        StatueInfo(
            "D. V. Gundappa Statue",
            "Kolar",
            "Mulbagal, Kolar",
            13.1627, 78.3953,
            "https://en.wikipedia.org/wiki/D._V._Gundappa",
            "https://maps.google.com/?q=DVG+Statue+Mulbagal+Kolar"
        ),

        // Koppal
        StatueInfo(
            "Krishnadevaraya Statue",
            "Koppal",
            "Hampi, Koppal/Vijayanagara",
            15.3350, 76.4600,
            "https://en.wikipedia.org/wiki/Krishnadevaraya",
            "https://maps.google.com/?q=Krishnadevaraya+Statue+Hampi"
        ),

        // Mandya
        StatueInfo(
            "K. S. Narasimhaswamy Statue",
            "Mandya",
            "Mandya Town",
            12.5220, 76.8950,
            "https://en.wikipedia.org/wiki/K._S._Narasimhaswamy",
            "https://maps.google.com/?q=KS+Narasimhaswamy+Statue+Mandya"
        ),

        // Mysuru
        StatueInfo(
            "R. K. Narayan Statue",
            "Mysuru",
            "Mysuru City",
            12.3052, 76.6551,
            "https://en.wikipedia.org/wiki/R._K._Narayan",
            "https://maps.google.com/?q=RK+Narayan+Statue+Mysuru"
        ),
        StatueInfo(
            "Tipu Sultan Statue",
            "Mysuru",
            "Srirangapatna, Mandya",
            12.4225, 76.6979,
            "https://en.wikipedia.org/wiki/Tipu_Sultan",
            "https://maps.google.com/?q=Tipu+Sultan+Statue+Srirangapatna"
        ),

        // Raichur
        StatueInfo(
            "Raichur Liberation Memorial",
            "Raichur",
            "Raichur City",
            16.2160, 77.3566,
            "https://en.wikipedia.org/wiki/Raichur",
            "https://maps.google.com/?q=Liberation+Memorial+Raichur+Karnataka"
        ),

        // Ramanagara
        StatueInfo(
            "Kengal Hanumanthaiah Statue",
            "Ramanagara",
            "Ramanagara Town",
            12.7165, 77.2826,
            "https://en.wikipedia.org/wiki/Kengal_Hanumanthaiah",
            "https://maps.google.com/?q=Kengal+Hanumanthaiah+Statue+Ramanagara"
        ),
        StatueInfo(
            "Siddalingaiah Memorial",
            "Ramanagara",
            "Magadi, Ramanagara",
            12.9579, 77.2265,
            "https://en.wikipedia.org/wiki/Siddalingaiah",
            "https://maps.google.com/?q=Siddalingaiah+Memorial+Ramanagara"
        ),

        // Shivamogga
        StatueInfo(
            "U. R. Ananthamurthy Statue",
            "Shivamogga",
            "Shivamogga City",
            13.9299, 75.5681,
            "https://en.wikipedia.org/wiki/U._R._Ananthamurthy",
            "https://maps.google.com/?q=UR+Ananthamurthy+Statue+Shivamogga"
        ),
        StatueInfo(
            "Shantaveri Gopala Gowda Statue",
            "Shivamogga",
            "Shivamogga",
            13.9310, 75.5720,
            "https://en.wikipedia.org/wiki/Shantaveri_Gopala_Gowda",
            "https://maps.google.com/?q=Shantaveri+Gopala+Gowda+Statue+Shivamogga"
        ),

        // Tumakuru
        StatueInfo(
            "Shivakumara Swamiji Statue",
            "Tumakuru",
            "Siddaganga Matha, Tumakuru",
            13.3308, 77.1011,
            "https://en.wikipedia.org/wiki/Shivakumara_Swami",
            "https://maps.google.com/?q=Shivakumara+Swamiji+Siddaganga+Matha+Tumkur"
        ),

        // Udupi
        StatueInfo(
            "Kota Shivaram Karanth Statue",
            "Udupi",
            "Udupi City",
            13.3409, 74.7421,
            "https://en.wikipedia.org/wiki/Kota_Shivaram_Karanth",
            "https://maps.google.com/?q=Kota+Shivaram+Karanth+Statue+Udupi"
        ),
        StatueInfo(
            "Gopalakrishna Adiga Memorial",
            "Udupi",
            "Udupi",
            13.3332, 74.7449,
            "https://en.wikipedia.org/wiki/Gopalakrishna_Adiga",
            "https://maps.google.com/?q=Gopalakrishna+Adiga+Memorial+Udupi"
        ),

        // Uttara Kannada
        StatueInfo(
            "Dinakar Desai Memorial",
            "Uttara Kannada",
            "Sirsi, Uttara Kannada",
            14.6205, 74.8374,
            "https://en.wikipedia.org/wiki/Dinakar_Desai",
            "https://maps.google.com/?q=Dinakar+Desai+Memorial+Sirsi+Karnataka"
        ),

        // Vijayapura
        StatueInfo(
            "Basavanna Statue",
            "Vijayapura",
            "Basavakalyan, Bidar / Vijayapura",
            17.8741, 76.9506,
            "https://en.wikipedia.org/wiki/Basavanna",
            "https://maps.google.com/?q=Basavanna+Statue+Basavakalyan"
        ),
        StatueInfo(
            "Ibrahim Adil Shah II Memorial",
            "Vijayapura",
            "Bijapur (Vijayapura)",
            16.8302, 75.7100,
            "https://en.wikipedia.org/wiki/Ibrahim_Adil_Shah_II",
            "https://maps.google.com/?q=Ibrahim+Adil+Shah+II+Memorial+Bijapur"
        ),

        // Vijayanagara
        StatueInfo(
            "Krishnadevaraya Statue at Hampi",
            "Vijayanagara",
            "Hampi, Vijayanagara",
            15.3350, 76.4600,
            "https://en.wikipedia.org/wiki/Krishnadevaraya",
            "https://maps.google.com/?q=Krishnadevaraya+Statue+Hampi+Vijayanagara"
        ),

        // Yadgir
        StatueInfo(
            "Raja Venkatappa Nayaka Memorial",
            "Yadgir",
            "Shorapur, Yadgir",
            16.5203, 76.7601,
            "https://en.wikipedia.org/wiki/Venkatappa_Nayaka",
            "https://maps.google.com/?q=Raja+Venkatappa+Nayaka+Memorial+Shorapur+Yadgir"
        )
    )
}
