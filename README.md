## Namma Kathey

**Namma Kathey** is a modern educational Android application developed to help students and children learn about Karnataka’s district-wise local heroes, freedom fighters, writers, poets, reformers, rulers, and cultural personalities. The application promotes local pride, Kannada language learning, patriotism, and awareness of Karnataka’s cultural heritage through an interactive digital platform.

The app provides a child-friendly learning experience where users can explore a clickable Karnataka map, read hero details, switch between English and Kannada, listen to stories using voice reader, take quizzes, and earn heritage badges based on performance.

The project is developed using Android development technologies including **Kotlin, XML layouts, Room Database, SharedPreferences, ViewPager2, Text-To-Speech API, Android Intents, and Material-style UI components**.

## Key Features

- Splash screen with app name and image
- Secure user registration and login system
- Room Database for storing registered user details
- Login status handling using SharedPreferences
- Karnataka map-based district selection
- Clickable district buttons on map
- District-wise hero information
- Swipeable hero pages using ViewPager2
- English and Kannada language support
- Kannada/English toggle switch
- Text-To-Speech voice reader
- Five-question hero quiz system
- Automatic score calculation
- Badge reward system:
  - Gold badge for 5/5
  - Silver badge for 3 or 4
  - Bronze badge for 1 or 2
  - Try again for 0
- Badges page to display earned badges
- Fully offline functionality using local storage

## Technology Stack

| Technology | Purpose |
|---|---|
| Kotlin | Android application development |
| XML Layouts | User interface design |
| Room Database | Local user data storage |
| SharedPreferences | Login status and badge storage |
| ViewPager2 | Swipeable hero detail pages |
| Text-To-Speech API | Voice reading in English/Kannada |
| Android Intents | Screen navigation |
| Drawable Resources | Karnataka map and app images |
| GenAI | Content support, translation, quiz generation, debugging |

## System Architecture

The application follows a simple modular Android architecture where each screen has a specific responsibility. The app is divided into separate activities for login, home map, hero details, quiz, badges, and splash screen.

## Architecture Layers

**Presentation Layer** – XML screens such as splash screen, login screen, home map screen, hero detail screen, quiz screen, and badges screen.

**Activity Layer** – Kotlin activity files handle screen logic, button clicks, navigation, language switching, quiz scoring, and badge display.

**Data Layer** – HeroStore stores district-wise hero details in English and Kannada.

**Local Storage Layer** – Room Database stores registered users, and SharedPreferences stores login status, quiz scores, and earned badges.

## Application Modules

- Splash Screen Module
- Authentication Module
- Karnataka Map Module
- Hero Details Module
- Language Toggle Module
- Voice Reader Module
- Quiz Module
- Badge System Module
- Local Database Module

## Screenshots

<img width="397" height="828" alt="image" src="https://github.com/user-attachments/assets/f250f19a-d8b2-42cd-afa4-c8d467af6ba3" />
<img width="397" height="828" alt="image" src="https://github.com/user-attachments/assets/20090832-7caf-4edb-bb9d-5bd692c2140c" />
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/8410bd1c-903b-4189-96a5-d38f35514a21" />
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/6d5e279b-48ea-40f5-a553-0f304cc2a991" />
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/45f9b306-def9-4822-b2c5-b4b8924fa43d" />
<img width="363" height="760" alt="image" src="https://github.com/user-attachments/assets/9abb6352-5a7f-423a-a5cf-bf8e209bb54d" />
<img width="372" height="775" alt="image" src="https://github.com/user-attachments/assets/c9e3b6c4-b841-4584-8606-46982f550f40" />
<img width="413" height="775" alt="image" src="https://github.com/user-attachments/assets/562b7690-85ae-4971-91e8-6b66fee7bcb7" />


## Offline Functionality

The application works offline because the main data is stored locally.

Stored locally:

- User registration details
- Login status
- District-wise hero details
- Quiz scores
- Earned badges

Room Database is used for user login details, while SharedPreferences is used for login status and badge records.

## Installation

1. Clone the repository.
2. Open the project using Android Studio.
3. Sync Gradle dependencies.
4. Run the application on an emulator or Android device.

## Future Enhancements

- Firebase cloud synchronization
- Memorial/statue finder using maps
- More hero images and illustrations
- Advanced profile page
- AI-based story generation
- Audio stories for all heroes
- Multi-language support beyond Kannada and English
- Notification reminders for daily learning

## Developed By

**Disha A**  
Android App Development Internship Project  
MindMatrix Internship Program
