CREATE DATABASE AnimalAdoptionDB;

USE AnimalAdoptionDB;

CREATE TABLE animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    species VARCHAR(50),
    age INT,
    status VARCHAR(20) DEFAULT 'Available'
);
