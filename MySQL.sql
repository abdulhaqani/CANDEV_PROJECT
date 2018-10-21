DROP DATABASE IF EXISTS heritage;
CREATE database heritage;
USE heritage;

DROP TABLE IF EXISTS category;
CREATE TABLE category (

 category_id      	INT UNSIGNED NOT NULL AUTO_INCREMENT,
 category_name     	VARCHAR(100) NOT NULL,
 
 PRIMARY KEY(category_id)
 
) COMMENT = 'this table is for category';

DROP TABLE IF EXISTS sport;
CREATE TABLE sport (

 category_FK		INT UNSIGNED NOT NULL,
 sport_id      	INT UNSIGNED NOT NULL AUTO_INCREMENT,
 sport_name     	VARCHAR(100) NOT NULL,
 sport_group 	bit  NOT NULL,
 
 PRIMARY KEY(sport_id),
 FOREIGN KEY (category_FK) REFERENCES category(category_id)  
) COMMENT = 'this table is for sport';

DROP TABLE IF EXISTS myorganization;
CREATE TABLE myorganization (
 sport_FK 				INT UNSIGNED NULL,
 myorganization_id      	INT UNSIGNED NOT NULL AUTO_INCREMENT,
 myorganization_name     	VARCHAR(100) NOT NULL,
 myorganization_address	VARCHAR(100) NOT NULL,
 
 PRIMARY KEY(myorganization_id),
 FOREIGN KEY (sport_FK) REFERENCES sport(sport_id) 
 
) COMMENT = 'this table is for orgonization';


DROP TABLE IF EXISTS team;

CREATE TABLE team (

 myorganization_FK INT UNSIGNED NULL,
 team_name     	VARCHAR(100) NOT NULL,
 team_rating	float UNSIGNED NULL,
 feedback		VARCHAR(300) NULL,
 gender			VARCHAR(10) NOT NULL,
 descripton		VARCHAR(300) NULL,
 age			SMALLINT UNSIGNED NOT NULL,
 
 FOREIGN KEY (myorganization_FK) REFERENCES myorganization(myorganization_id)
 ON UPDATE CASCADE
 ON DELETE RESTRICT
) COMMENT = 'this table is for team';
