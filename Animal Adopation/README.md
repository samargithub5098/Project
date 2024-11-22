Project Overview
The Animal Adoption and Care Platform is a Java-based application designed to streamline the management of animal adoption records. It allows users to maintain a database of animals, update their adoption status, and retrieve information about available animals. This project is built using Java with JDBC for database operations and MySQL for persistent storage.

Features
Add Animals: Add new animal records (name, species, age, and status).
View All Animals: Retrieve and display all animals from the database.
Update Animal Status: Modify the adoption status of animals.
Persistent Data Storage: Uses MySQL for data management.
Technologies Used
Java: Core programming language.
JDBC: For database connectivity.
MySQL: Relational database for persistent storage.
IDE: Any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse).
Prerequisites
Java JDK: Version 8 or later installed on your system.
MySQL: Installed and configured with a local or remote server.
IDE: Use IntelliJ IDEA, Eclipse, or NetBeans.
MySQL Database: Set up the database and tables as described below.
Database Setup
Run the following SQL script to set up the database:
/*
CREATE DATABASE AnimalAdoptionDB;

USE AnimalAdoptionDB;

CREATE TABLE animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    species VARCHAR(50),
    age INT,
    status VARCHAR(20) DEFAULT 'Available'
);
*/

How to Run the Project
Step 1: Clone the Project
Download or clone the project repository to your local system.
Step 2: Compile and Run
Open the project in your Java IDE.
Compile all .java files in the src directory.
Run the AnimalAdoptionApp.java file.
Usage
The application operates through a console-based menu system:

Console Menu Options:
Add a New Animal: Input animal details such as name, species, age, and status.
List All Animals: View all animal records stored in the database.
Update Animal Status: Update the status of an animal (e.g., from "Available" to "Adopted").
Exit: Close the application.