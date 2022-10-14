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

INSERT INTO employee (last_name_employee, first_name_employee, middle_name_employee, job_title_employee, id_organization)
VALUES
('Фрікацел', 'Сергій', 'Трифонович', 'Директор', 1),
('Маленко', 'Аркадій', 'Валерійович', 'Водій', 1),
('Рябченко', 'Олександр', 'Леонідович', 'Спеціаліст', 1),
('Соколова', 'Анастасія', 'Геннадіївна', 'Головний спеціаліст',	1),
('Балтов', 'Сергій', 'Вікторович', 'Спеціаліст', 1),
('Батуріна', 'Тетяна', 'Василівна',	'Директор',	2),
('Соколова', 'Анастасія', 'Геннадіївна', 'Головний спеціаліст',	2),
('Засієнко', 'Микола', 'Васильович', 'Водій', 2),
('Шевченко', 'Ігор', 'Ігорович', 'Водій', 2),
('Бабелюк', 'Любов', 'Василівна', 'Спеціаліст',	2),
('Голощак', 'Володимир', 'Андрійович', 'Спеціаліст', 2),
('Жигарєв', 'Сергій', 'Михайлович',	'Директор',	3),
('Орел', 'Олег', 'Володимирович', 'Головний спеціаліст', 3),
('Дімов', 'Дмитро', 'Дмитрович', 'Водій', 3),
('Городниченко', 'Олена', 'Вікторівна',	'Спеціаліст', 3),
('Черепаха', 'Людмила', 'Миколаївна', 'Спеціаліст',	3),
('Коваль', 'Геннадій', 'Степанович', 'Директор', 4),
('Кірієнко', 'Оксана', 'Андріївна', 'Головний спеціаліст', 4),
('Гарага', 'Дмитро', 'Васильович', 'Водій', 4),
('Чебан-Лянка', 'Євгеній', 'Вікторович', 'Водій', 4),
('Земляной', 'Руслан', 'Дмитрович',	'Спеціаліст', 4),
('Степаненко', 'Олександр', 'Дмитрович', 'Спеціаліст', 4),
('Кирилова', 'Ірина', 'Валентинівна', 'Спеціаліст', 4),
('Петков', 'Юрій', 'Дмитрович',	'Директор',	5),
('Дронова', 'Валентина', 'Юріївна',	'Головний спеціаліст', 5),
('Курочка', 'Микола', 'Васильович', 'Водій', 5),
('Звєрєва', 'Любов', 'Ігоровна', 'Спеціаліст', 5),
('іщенко', 'Віктор', 'Васильович', 'Водій',	5),
('Беженар', 'Володимир', 'Едуардович', 'Спеціаліст', 5),
('Олійников', 'Борис', 'Володимирович', 'Спеціаліст', 5);

INSERT INTO car (marka_car, model_car, state_number_car, id_organization)
VALUES
('DACIA', 'LOGAN', 'ВН 0565 СІ', 1),
('MITSHUBISHI', 'GALANT', 'ВН 0071 СO', 1),
('ВАЗ', '21043', 'ВН 0349 ВO', 1),
('DAEWOO', 'SENS', 'ВН 5825 AO', 1),
('VOLKSWAGEN', 'CARAVELLE', 'ВН 3024 ВI', 2),
('OPEL', 'VECTRA', 'ВН 5746 АЕ', 2),
('SUZUKI', 'SWIFT', 'ВН 3141 ВА', 2),
('ВАЗ', '2107', 'ВН 0420 ВІ', 3),
('ВАЗ', '2121', 'ВН 1540 ОК', 3),
('FORD', 'MONDEO', 'ВН 1938 ВІ', 3),
('DAEWOO', 'LANOS', 'ВН 0067 ВО', 3),
('MERCEDES-BENZ', 'E 270', 'ВН 1881 ВІ', 4),
('BMW', '530', 'ВН 5511 ВН', 4),
('NISSAN', 'MAXIMA', 'ВН 0712 ВІ', 4),
('TOYOTA', 'CRUISER', 'ВН 5265 ВС', 4),
('ВАЗ', '111830-110-30', 'ВН 2318 СЕ', 4),
('DACIA', 'LOGAN', 'ВН 2480 ВІ', 5),
('OPEL', 'ASTRA', 'ВН 0086 В0', 5),
('WOLKSWAGEN', 'PASSAT', 'ВН 0080 ВН', 5);


SELECT * FROM organization;
SELECT * FROM employee;
SELECT * FROM car;

SELECT * FROM employee AS e 
INNER JOIN organization AS o ON e.id_organization = o.id_organization
WHERE o.id_organization = 5;

SELECT e.id_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, e.job_title_employee, e.id_organization FROM employee AS e 
INNER JOIN organization AS o ON e.id_organization = o.id_organization
WHERE o.id_organization = 5;

SELECT e.id_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, e.job_title_employee, e.id_organization FROM employee AS e 
WHERE e.id_organization = 5;

SELECT e.id_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, e.job_title_employee, e.id_organization FROM employee AS e 
WHERE e.id_organization = 5 ORDER BY e.number_signature_employee;

SELECT c.id_car, c.marka_car, c.model_car, c.state_number_car, c.fuel_type_car, c.id_organization FROM car AS c
INNER JOIN organization AS o ON c.id_organization = o.id_organization
WHERE o.id_organization = 5;

SELECT c.id_car, c.marka_car, c.model_car, c.state_number_car, c.fuel_type_car, c.id_organization FROM car AS c
WHERE c.id_organization = 5;

-- organizations and cars
SELECT c.id_car, o.name_organization, c.marka_car, c.model_car, c.state_number_car, c.fuel_type_car, c.id_organization FROM car AS c
INNER JOIN organization AS o ON c.id_organization = o.id_organization;

-- nativeQuiry
SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, o.id_organization 
FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization;

-- nativeQuiry with like start name
SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, o.id_organization 
FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization WHERE o.name_organization LIKE 'Акц%';

-- organizations and employee
SELECT o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, e.id_employee, e.id_organization FROM employee AS e
INNER JOIN organization AS o ON e.id_organization = o.id_organization;




SELECT e.id_employee, e.last_name_employee, e.first_name_employee, e.middle_name_employee, e.number_signature_employee, e.job_title_employee, e.id_organization FROM employee AS e 
INNER JOIN organization AS o ON e.id_organization = o.id_organization
WHERE o.id_organization = 5 AND e.last_name_employee = 'Петков';

UPDATE employee AS e SET e.number_signature_employee = 1
WHERE e.id_organization = 5 AND e.last_name_employee = 'Петков';

UPDATE employee AS e SET e.number_signature_employee = 2
WHERE e.id_organization = 5 AND e.last_name_employee = 'Дронова';

UPDATE employee AS e SET e.number_signature_employee = 3
WHERE e.id_organization = 5 AND e.last_name_employee = 'Звєрєва';

UPDATE employee AS e SET e.number_signature_employee = 4
WHERE e.id_organization = 5 AND e.last_name_employee = 'Курочка';


-- DROP DATABASE osporganization;
-- DROP TABLE car;
