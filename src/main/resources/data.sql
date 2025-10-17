-- Player Data Initialization Script (65 Players)
-- NOTE: POSITION and NATIONALITY values must exactly match the names of your Java Enum constants (SCREAMING_SNAKE_CASE).

-- =================================================================
-- EXISTING PLAYERS (6)
-- =================================================================
-- 1. Lionel Messi (ARG, Right Winger)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Lionel', 'Messi', '1987-06-24', 'RW', 'ARGENTINA');

-- 2. Cristiano Ronaldo (POR, Striker)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Cristiano', 'Ronaldo', '1985-02-05', 'ST', 'PORTUGAL');

-- 3. Virgil van Dijk (NLD, Center Back)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Virgil', 'van Dijk', '1991-07-08', 'CB', 'NETHERLANDS');

-- 4. Luka Modric (HRV, Central Midfielder)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Luka', 'Modric', '1985-09-09', 'CM', 'CROATIA');

-- 5. Alisson Becker (BRA, Goalkeeper)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Alisson', 'Becker', '1992-10-02', 'GK', 'BRAZIL');

-- 6. Alphonso Davies (CAN, Left Wing Back)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Alphonso', 'Davies', '2000-11-02', 'LWB', 'CANADA');


-- =================================================================
-- NEW PLAYERS (59 ADDED)
-- =================================================================

-- FORWARDS (ST, CF, RW, LW)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Kylian', 'Mbappé', '1998-12-20', 'ST', 'FRANCE'),
       ('Erling', 'Haaland', '2000-07-21', 'ST', 'NORWAY'),
       ('Robert', 'Lewandowski', '1988-08-21', 'ST', 'POLAND'),
       ('Mohamed', 'Salah', '1992-06-15', 'RW', 'EGYPT'),
       ('Neymar', 'Júnior', '1992-02-05', 'LW', 'BRAZIL'),
       ('Karim', 'Benzema', '1987-12-19', 'CF', 'FRANCE'),
       ('Harry', 'Kane', '1993-07-28', 'ST', 'UNITED_KINGDOM'),
       ('Son', 'Heung-min', '1992-07-08', 'LW', 'KOREA'),
       ('Vinícius', 'Júnior', '2000-07-12', 'LW', 'BRAZIL'),
       ('Antoine', 'Griezmann', '1991-03-21', 'CF', 'FRANCE'),
       ('Victor', 'Osimhen', '1998-12-29', 'ST', 'NIGERIA'),
       ('Jamal', 'Musiala', '2003-02-26', 'RW', 'GERMANY');

-- MIDFIELDERS (CAM, CM, CDM, LM, RM)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Kevin', 'De Bruyne', '1991-06-28', 'CAM', 'BELGIUM'),
       ('Joshua', 'Kimmich', '1995-02-08', 'CDM', 'GERMANY'),
       ('Pedri', 'González', '2002-11-25', 'CM', 'SPAIN'),
       ('Gavi', 'Páez', '2004-08-05', 'CM', 'SPAIN'),
       ('Casemiro', 'Ferreira', '1992-02-23', 'CDM', 'BRAZIL'),
       ('Bernardo', 'Silva', '1994-08-10', 'CAM', 'PORTUGAL'),
       ('Phil', 'Foden', '2000-05-28', 'LM', 'UNITED_KINGDOM'),
       ('Federico', 'Valverde', '1998-07-22', 'CM', 'URUGUAY'),
       ('Toni', 'Kroos', '1990-01-04', 'CM', 'GERMANY'),
       ('Ngolo', 'Kante', '1991-03-29', 'CDM', 'FRANCE'),
       ('Bellingham', 'Jude', '2003-06-29', 'CM', 'UNITED_KINGDOM'),
       ('Nicolo', 'Barella', '1997-02-07', 'CM', 'ITALY'),
       ('Bruno', 'Fernandes', '1994-09-08', 'CAM', 'PORTUGAL');

-- DEFENDERS (CB, RB, LB, RWB, LWB)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Achraf', 'Hakimi', '1998-11-04', 'RWB', 'MOROCCO'),
       ('Trent', 'Alexander-Arnold', '1998-10-07', 'RB', 'UNITED_KINGDOM'),
       ('Andrew', 'Robertson', '1994-03-11', 'LB', 'UNITED_KINGDOM'),
       ('Rúben', 'Dias', '1997-05-14', 'CB', 'PORTUGAL'),
       ('Marquinhos', 'Correa', '1994-05-14', 'CB', 'BRAZIL'),
       ('Theo', 'Hernandez', '1997-10-06', 'LB', 'FRANCE'),
       ('Reece', 'James', '1999-12-08', 'RWB', 'UNITED_KINGDOM'),
       ('Dayot', 'Upamecano', '1998-10-27', 'CB', 'FRANCE'),
       ('Eder', 'Militão', '1998-01-18', 'CB', 'BRAZIL'),
       ('Kyle', 'Walker', '1990-05-28', 'RB', 'UNITED_KINGDOM'),
       ('Joao', 'Cancelo', '1994-05-27', 'LWB', 'PORTUGAL'),
       ('Ronald', 'Araújo', '1999-03-07', 'CB', 'URUGUAY');

-- GOALKEEPERS (GK)
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Thibaut', 'Courtois', '1992-05-11', 'GK', 'BELGIUM'),
       ('Manuel', 'Neuer', '1986-03-27', 'GK', 'GERMANY'),
       ('Jan', 'Oblak', '1993-01-07', 'GK', 'SLOVENIA'),
       ('Mike', 'Maignan', '1995-07-03', 'GK', 'FRANCE'),
       ('Ederson', 'Santana', '1993-08-17', 'GK', 'BRAZIL');

-- ADDITIONAL MIXED PLAYERS to hit 65 total
INSERT INTO player (first_name, last_name, birth_date, position, nationality)
VALUES ('Kevin', 'Trapp', '1990-07-08', 'GK', 'GERMANY'),
       ('Leroy', 'Sane', '1996-01-11', 'RW', 'GERMANY'),
       ('Serge', 'Gnabry', '1995-07-09', 'LM', 'GERMANY'),
       ('Marco', 'Verratti', '1992-11-05', 'CM', 'ITALY'),
       ('Lautaro', 'Martínez', '1997-08-22', 'ST', 'ARGENTINA'),
       ('Gabriel', 'Jesus', '1997-04-03', 'CF', 'BRAZIL'),
       ('Rodri', 'Hernández', '1996-06-22', 'CDM', 'SPAIN'),
       ('Ilkay', 'Gundogan', '1990-10-24', 'CM', 'GERMANY'),
       ('Ivan', 'Perisic', '1989-02-02', 'LWB', 'CROATIA'),
       ('Dusan', 'Tadic', '1988-11-20', 'CAM', 'SERBIA'),
       ('Rafael', 'Leão', '1999-06-10', 'LW', 'PORTUGAL'),
       ('Frenkie', 'De Jong', '1997-05-12', 'CM', 'NETHERLANDS'),
       ('Matthijs', 'de Ligt', '1999-08-12', 'CB', 'NETHERLANDS'),
       ('Cody', 'Gakpo', '1999-05-07', 'CF', 'NETHERLANDS'),
       ('Federico', 'Chiesa', '1997-10-25', 'RW', 'ITALY'),
       ('Giorgio', 'Chiellini', '1984-08-14', 'CB', 'ITALY'),
       ('Jadon', 'Sancho', '2000-03-25', 'RW', 'UNITED_KINGDOM'),
       ('Declan', 'Rice', '1999-01-14', 'CDM', 'UNITED_KINGDOM'),
       ('Antony', 'Santos', '2000-02-24', 'RW', 'BRAZIL'),
       ('Richarlison', 'Andrade', '1997-05-10', 'ST', 'BRAZIL'),
       ('Ousmane', 'Dembélé', '1997-05-15', 'RW', 'FRANCE'),
       ('Aurélien', 'Tchouaméni', '2000-01-25', 'CDM', 'FRANCE'),
       ('Eduardo', 'Camavinga', '2002-11-10', 'CM', 'FRANCE'),
       ('Rodrygo', 'Goes', '2001-01-09', 'RW', 'BRAZIL'),
       ('Jérémy', 'Doku', '2002-05-27', 'LW', 'BELGIUM'),
       ('Julian', 'Álvarez', '2000-01-31', 'ST', 'ARGENTINA'),
       ('Emiliano', 'Martínez', '1992-09-02', 'GK', 'ARGENTINA');
