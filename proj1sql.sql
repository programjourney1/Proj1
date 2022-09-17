drop table Enviros;
drop table Lizards;
drop table Snakes ;
drop table Turtles ;
drop table Crocs ;
select * FROM Snakes;
select * FROM Turtles;
truncate table Lizards;
truncate table Snakes;
truncate table Enviros;
truncate table Turtles ;
truncate table Crocs ;
truncate table Reptiles;
truncate table Locz;
CREATE TABLE Lizards(
Species varchar(255), Description varchar(255), player varchar(255)
);
insert into Lizards(Species, Description, player)
values
( 'Rattata', 'Bites anything when it attacks. Small and very quick, it is a common sight in many places.', 'b'),
('Raticate', '	It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.', 'b'),
('Jigglypuff', 'When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.', 'b');

insert into Lizards(Species, Description, player)
values
( 'Rattata', 'Bites anything when it attacks. Small and very quick, it is a common sight in many places.', 'r'),
('Raticate', '	It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.', 'r'),
('Jigglypuff', 'When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.', 'r');
CREATE TABLE Turtles(
Species varchar(255), Description varchar(255) , player varchar(255)
);
insert into Turtles(Species, Description, player)
values

('Nidoran Male', 'Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.', 'b'),
( 'Nidoran Female', 'Although small, its venomous barbs render this Pokémon dangerous. The female has smaller horns.', 'b'),
( 'Nidorino','An aggressive Pokémon that is quick to attack. The horn on its head secretes a powerful venom.', 'b');
insert into Turtles(Species, Description, player)
values

('Nidoran Male', 'Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.', 'r'),
( 'Nidoran Female', 'Although small, its venomous barbs render this Pokémon dangerous. The female has smaller horns.', 'r'),
( 'Nidorino','An aggressive Pokémon that is quick to attack. The horn on its head secretes a powerful venom.', 'r');


CREATE TABLE Crocs(
Species varchar(255), Description varchar(255) , player varchar(255)
);
insert into Crocs(Species, Description, player)
values
('Pidgey', 'A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.', 'b'),
('Spearow', 'Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.', 'b'),
('Fearrow', 'With its huge and magnificent wings, it can keep aloft without ever having to land for rest.', 'b');
insert into Crocs(Species, Description, player)
values
('Pidgey', 'A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.', 'r'),
('Spearow', 'Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.', 'r'),
('Fearrow', 'With its huge and magnificent wings, it can keep aloft without ever having to land for rest.', 'r');
CREATE TABLE Snakes(
Species varchar(255), Description varchar(255)  , player varchar(255)
);
insert into Snakes(Species, Description, player)
values
('Metapod','This Pokémon is vulnerable to attack while its shell is soft, exposing its weak and tender body.', 'b'),
('Weedle', 'Often found in forests, eating leaves. It has a sharp venomous stinger on its head.', 'b'),
('Caterpie', 'Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.', 'b');
insert into Snakes(Species, Description, player)
values
('Metapod','This Pokémon is vulnerable to attack while its shell is soft, exposing its weak and tender body.', 'r'),
('Weedle', 'Often found in forests, eating leaves. It has a sharp venomous stinger on its head.', 'r'),
('Caterpie', 'Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.', 'r');
CREATE TABLE Pokemon(Species varchar(255) primary key, Description varchar(255));
Insert INTO Pokemon(Species, Description)
values 
( 'Rattata', 'Bites anything when it attacks. Small and very quick, it is a common sight in many places.'),
('Raticate', '	It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.'),
('Jigglypuff', 'When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.'),
('NidoranMale', 'Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.'),
( 'NidoranFemale', 'Although small, its venomous barbs render this Pokémon dangerous. The female has smaller horns.'),
( 'Nidorino','An aggressive Pokémon that is quick to attack. The horn on its head secretes a powerful venom.'),
('Pidgey', 'A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.'),
('Spearow', 'Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.'),
('Fearrow', 'With its huge and magnificent wings, it can keep aloft without ever having to land for rest.'),
('Metapod','This Pokémon is vulnerable to attack while its shell is soft, exposing its weak and tender body.'),
('Weedle', 'Often found in forests, eating leaves. It has a sharp venomous stinger on its head.'),
('Caterpie', 'Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.')
;

Create Table Loc(Enviroment varchar(255), Species varchar(255) Primary key);
insert into Locz(Enviroment, Species, player)
values
('RT 1,2', 'Rattata','r'),('RT 16, 18', 'Raticate','r'),('Mount Moon', 'Jigglypuff','r'),
('RT 2,3', 'NidoranMale','r'),('RT 2,3', 'NidoranFemale','r'),('Safari Zone', 'Nidorino','r'),
('RT 1, 2, 3', 'Pidgey','r'),('RT 3', 'Spearow','r'),('RT 3', 'Fearow','r'),
('Viridian Forest', 'Metapod','r'),('Viridian Forest', 'Caterpie','r'),('Viridian Forest', 'Weedle','r');

insert into Locz(Enviroment, Species, player)
values
('RT 1,2', 'Rattata','b'),('RT 16, 18', 'Raticate','b'),('Mount Moon', 'Jigglypuff','b'),
('RT 2,3', 'NidoranMale','b'),('RT 2,3', 'NidoranFemale','b'),('Safari Zone', 'Nidorino','b'),
('RT 1, 2, 3', 'Pidgey','b'),('RT 3', 'Spearow','1'),('RT 3', 'Fearow','1'),
('Viridian Forest', 'Metapod','b'),('Viridian Forest', 'Caterpie','b'),('Viridian Forest', 'Weedle','b');
