<div align="center">

🎮 Mini Games

A Collection of Fun Java Console Games

Learn Java fundamentals while playing simple interactive games.





</div>

📖 About the Project

Mini Games is a beginner-friendly collection of interactive Java console games. The project demonstrates essential programming concepts such as loops, conditional statements, random-number generation, user input, validation, variables, and counters.

The current version includes two guessing games with helpful hints and colorful console messages.

🕹️ Games Included

🔐 1. Four-Digit Password Guessing Game

The program generates a random four-digit password between 1000 and 9999. The player continues guessing until the complete password is correct.

Game Features

Generates a random four-digit password

Accepts guesses from the player

Validates whether the input contains four digits

Checks each digit according to its position

Shows which positions are correct

Continues until the complete password is discovered

Main class: Main.java

🎯 2. Number Guessing Game

The program selects a random number below 1000. The player guesses the number using the hints provided after every attempt.

Game Features

Generates a new random number for each game

Displays Too High or Too Low hints

Counts the number of attempts

Announces the correct answer when the player wins

Automatically starts a new round

Main class: guessTheNumber.java

🧠 Programming Concepts

Concept

Usage in the Project

Variables

Store random values, guesses, digits, and attempt counts

Scanner

Read player input from the console

Random

Generate unpredictable game values

while loops

Continue the game until the winning condition is reached

if / else

Compare guesses and display suitable hints

Arithmetic operators

Separate individual digits from a four-digit number

Input validation

Reject numbers outside the required range

🛠️ Technology Stack

Java

Java Standard Library

IntelliJ IDEA

Git and GitHub

No external libraries or frameworks are required.

📁 Project Structure

Mini_Games/
├── src/
│   ├── Main.java             # Four-digit password guessing game
│   └── guessTheNumber.java   # Number guessing game
├── My_Games.iml              # IntelliJ IDEA module file
├── .gitignore
└── README.md

🚀 Getting Started

Prerequisites

JDK 8 or later

IntelliJ IDEA, VS Code, Eclipse, or a terminal

Git, if cloning the repository

Clone the Repository

git clone https://github.com/jayanidissanayake15/Mini_Games.git
cd Mini_Games

▶️ How to Run

Using IntelliJ IDEA

Open IntelliJ IDEA.

Select Open and choose the Mini_Games folder.

Open the src directory.

Choose Main.java or guessTheNumber.java.

Click the green Run button next to the main method.

Using the Terminal

Run the four-digit password game:

javac src/Main.java
java -cp src Main

Run the number guessing game:

javac src/guessTheNumber.java
java -cp src guessTheNumber

🎮 Example Gameplay

Password Guessing Game

🔐 4-Digit Password Guessing Game
🎮 I created a 4-digit password.
Try to guess it!

Enter your 4-digit guess: 1234
✅ 2nd number is correct!

Number Guessing Game

🎮 WELCOME TO THE NUMBER GUESSING GAME!
I picked a number below 1000.

🎯 Enter your guess: 500
📈 Too High!
👇 Try a smaller number!

🔮 Future Improvements

Add a main menu for selecting a game

Add difficulty levels

Limit the number of attempts

Save high scores

Improve invalid-input handling

Add more console games

Create a graphical interface using JavaFX

🤝 Contributing

Suggestions and improvements are welcome. Fork the repository, create a branch, make your changes, and submit a pull request.

👩‍💻 Author

<div align="center">

Jayani Dissanayake

Full Stack Developer · Computer Science Undergraduate





</div>

📄 License

This repository currently does not include a license. Add a suitable license before distributing the project or accepting external contributions.

<div align="center">

⭐ Enjoyed the games? Give this repository a star!

Made with ☕ and Java by Jayani Dissanayake

</div>