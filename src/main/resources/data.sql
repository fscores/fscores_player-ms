-- EXISTING PLAYERS (6)
-- =================================================================
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Lionel', 'Messi', '1987-06-24', 'RW', 'ARG'),
       ('Cristiano', 'Ronaldo', '1985-02-05', 'ST', 'PRT'),
       ('Virgil', 'van Dijk', '1991-07-08', 'CB', 'NLD'),
       ('Luka', 'Modric', '1985-09-09', 'CM', 'HRV'),
       ('Alisson', 'Becker', '1992-10-02', 'GK', 'BRA'),
       ('Alphonso', 'Davies', '2000-11-02', 'LWB', 'CAN');

-- =================================================================
-- NEW PLAYERS (59 ADDED)
-- =================================================================

-- FORWARDS (ST, CF, RW, LW)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Kylian', 'Mbappé', '1998-12-20', 'ST', 'FRA'),
       ('Erling', 'Haaland', '2000-07-21', 'ST', 'NOR'),
       ('Robert', 'Lewandowski', '1988-08-21', 'ST', 'POL'),
       ('Mohamed', 'Salah', '1992-06-15', 'RW', 'EGY'),
       ('Neymar', 'Júnior', '1992-02-05', 'LW', 'BRA'),
       ('Karim', 'Benzema', '1987-12-19', 'CF', 'FRA'),
       ('Harry', 'Kane', '1993-07-28', 'ST', 'GBR'),
       ('Son', 'Heung-min', '1992-07-08', 'LW', 'KOR'),
       ('Vinícius', 'Júnior', '2000-07-12', 'LW', 'BRA'),
       ('Antoine', 'Griezmann', '1991-03-21', 'CF', 'FRA'),
       ('Victor', 'Osimhen', '1998-12-29', 'ST', 'NGA'),
       ('Jamal', 'Musiala', '2003-02-26', 'RW', 'DEU');

-- MIDFIELDERS (CAM, CM, CDM, LM, RM)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Kevin', 'De Bruyne', '1991-06-28', 'CAM', 'BEL'),
       ('Joshua', 'Kimmich', '1995-02-08', 'CDM', 'DEU'),
       ('Pedri', 'González', '2002-11-25', 'CM', 'ESP'),
       ('Gavi', 'Páez', '2004-08-05', 'CM', 'ESP'),
       ('Casemiro', 'Ferreira', '1992-02-23', 'CDM', 'BRA'),
       ('Bernardo', 'Silva', '1994-08-10', 'CAM', 'PRT'),
       ('Phil', 'Foden', '2000-05-28', 'LM', 'GBR'),
       ('Federico', 'Valverde', '1998-07-22', 'CM', 'URY'),
       ('Toni', 'Kroos', '1990-01-04', 'CM', 'DEU'),
       ('Ngolo', 'Kante', '1991-03-29', 'CDM', 'FRA'),
       ('Bellingham', 'Jude', '2003-06-29', 'CM', 'GBR'),
       ('Nicolo', 'Barella', '1997-02-07', 'CM', 'ITA'),
       ('Bruno', 'Fernandes', '1994-09-08', 'CAM', 'PRT');

-- DEFENDERS (CB, RB, LB, RWB, LWB)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Achraf', 'Hakimi', '1998-11-04', 'RWB', 'MAR'),
       ('Trent', 'Alexander-Arnold', '1998-10-07', 'RB', 'GBR'),
       ('Andrew', 'Robertson', '1994-03-11', 'LB', 'GBR'),
       ('Rúben', 'Dias', '1997-05-14', 'CB', 'PRT'),
       ('Marquinhos', 'Correa', '1994-05-14', 'CB', 'BRA'),
       ('Theo', 'Hernandez', '1997-10-06', 'LB', 'FRA'),
       ('Reece', 'James', '1999-12-08', 'RWB', 'GBR'),
       ('Dayot', 'Upamecano', '1998-10-27', 'CB', 'FRA'),
       ('Eder', 'Militão', '1998-01-18', 'CB', 'BRA'),
       ('Kyle', 'Walker', '1990-05-28', 'RB', 'GBR'),
       ('Joao', 'Cancelo', '1994-05-27', 'LWB', 'PRT'),
       ('Ronald', 'Araújo', '1999-03-07', 'CB', 'URY');

-- GOALKEEPERS (GK)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Thibaut', 'Courtois', '1992-05-11', 'GK', 'BEL'),
       ('Manuel', 'Neuer', '1986-03-27', 'GK', 'DEU'),
       ('Jan', 'Oblak', '1993-01-07', 'GK', 'SVN'),
       ('Mike', 'Maignan', '1995-07-03', 'GK', 'FRA'),
       ('Ederson', 'Santana', '1993-08-17', 'GK', 'BRA');