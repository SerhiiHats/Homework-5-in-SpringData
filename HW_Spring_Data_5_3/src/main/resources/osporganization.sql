CREATE DATABASE osporganization;

USE osporganization;

CREATE TABLE organization(
id_organization INT AUTO_INCREMENT,
name_organization VARCHAR(255),
PRIMARY KEY(id_organization));

CREATE TABLE employee (
id_employee INT AUTO_INCREMENT,
last_name_employee VARCHAR(100) NOT NULL,
first_name_employee VARCHAR(100) NOT NULL,
middle_name_employee VARCHAR(100),
number_signature_employee INT DEFAULT 0,
job_title_employee VARCHAR(100),
id_organization INT,
PRIMARY KEY(id_employee),
FOREIGN KEY(id_organization) REFERENCES organization (id_organization));

CREATE TABLE car (
id_car INT AUTO_INCREMENT,
marka_car VARCHAR(100) NOT NULL,
model_car VARCHAR(100),
state_number_car VARCHAR(100) NOT NULL,
fuel_type_car INT DEFAULT 0,
id_organization INT,
PRIMARY KEY(id_car),
FOREIGN KEY(id_organization) REFERENCES organization (id_organization));

INSERT INTO organization (name_organization) 
VALUES
('Акціонерне товариство комерційний банк "ПриватБанк"'),
('Публічне акціонерне товариство акціонерний банк "ПІВДЕННИЙ"'),
('Акціонерне товариство "Державний ощадний банк України"'),
('Публічне акціонерне товариство акціонерний банк "УКРГАЗБАНК"'),
('Публічне акціонерне товариство "БАНК ВОСТОК"');

-- DROP DATABASE osporganization;
