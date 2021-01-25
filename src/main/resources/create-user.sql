CREATE USER 'bytecode'@'localhost' IDENTIFIED BY 'bytecode';

GRANT ALL PRIVILEGES ON * . * TO 'bytecode'@'localhost';

FLUSH PRIVILEGES;

create database spring_data_rest;