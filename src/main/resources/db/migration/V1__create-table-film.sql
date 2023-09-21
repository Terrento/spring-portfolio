CREATE TABLE films (
    id INT PRIMARY KEY UNIQUE NOT NULL,
    name VARCHAR(30) NOT NULL,
    year_of_release INT NOT NULL,
    genre VARCHAR(30) NOT NULL
);