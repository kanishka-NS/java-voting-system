#  Java Voting System

A console-based voting system developed using Java that simulates a basic election process with secure vote casting and result management.


##  Overview

This project is designed to demonstrate core backend logic using Java. It allows registered voters to cast votes for candidates while ensuring that each voter can vote only once. The system also calculates and stores election results.


## Features

*  Voter identification using unique ID
*  Secure voting (prevents duplicate votes)
*  Dynamic candidate selection
*  Real-time vote counting
*  Result storage in file


##  Tech Stack

* **Language:** Java
* **Concepts:** OOP (Inheritance, Abstraction)
* **Utilities:** File Handling, Collections (ArrayList)


##  Project Structure

```
java-voting-system/
│
├── src/
│   └── votingsystem/
│       ├── Person.java
│       ├── Candidate.java
│       ├── Voter.java
│       └── VotingSystem.java
│
├── data/
│   ├── candidates.txt
│   └── voters.txt
│
└── README.md
```

---

##  How to Run

### 1️. Compile the Program

```
javac votingsystem/*.java
```

### 2️. Run the Application

```
java votingsystem.VotingSystem
```

---

##  Sample Input Files

###  candidates.txt

```
Kanishka
Andrea
Harita
Rashmi
Leema
```

###  voters.txt

```
1, Vijay
2, Sita
3, Arjun
```

##  Key Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Class Inheritance & Abstraction
* File Handling in Java
* Data validation and control flow
* Basic system design


##  Future Enhancements

* 🔹 Convert into REST API using modern frameworks
* 🔹 Integrate database (MySQL/PostgreSQL)
* 🔹 Add authentication & authorization
* 🔹 Build a web-based UI

---

## Author

Kanishka N S

---

## ⭐ Note

This project was developed as part of learning Java and understanding backend system design fundamentals.
