-- solution
----------------------------------

-- ZIPCODES
CREATE TABLE ZIPCODES
(
  ZIPCODE NUMBER(6, 0) NOT NULL,
  CITY    VARCHAR(50)  NOT NULL,
  COUNTY  VARCHAR(50)  NOT NULL,
  STATE   VARCHAR(50)  NOT NULL,
  CONSTRAINT ZIPCODES_PK PRIMARY KEY (ZIPCODE)
);

-- FREELANCERS
-- Note: ID's are generated upfront, can be done making use of sequence as well
-- Note: best practice to split NAME into FIRST_NAME and LAST_NAME
CREATE TABLE FREELANCERS
(
  FREELANCER_ID NUMBER(4, 0) NOT NULL,
  NAME          VARCHAR(50)  NOT NULL,
  ADDRESS       VARCHAR(200) NOT NULL,
  ZIPCODE       NUMBER(6, 0) NOT NULL,
  PRICE         NUMBER(5, 3) NOT NULL,
  CONSTRAINT FREELANCERS_PK PRIMARY KEY (FREELANCER_ID),
  CONSTRAINT FREELANCERS_ZIPCODES_FK FOREIGN KEY (ZIPCODE) REFERENCES ZIPCODES (ZIPCODE)
);

-- CUSTOMERS
-- Note: ID's are generated upfront, can be done making use of sequence as well
CREATE TABLE CUSTOMERS
(
  CUSTOMER_ID   NUMBER(4, 0) NOT NULL,
  CUSTOMER_NAME VARCHAR(200) NOT NULL,
  ADDRESS       VARCHAR(200) NOT NULL,
  ZIPCODE       NUMBER(6, 0) NOT NULL,
  CONSTRAINT CUSTOMERS_PK PRIMARY KEY (CUSTOMER_ID),
  CONSTRAINT CUSTOMERS_ZIPCODES_FK FOREIGN KEY (ZIPCODE) REFERENCES ZIPCODES (ZIPCODE)
);

-- PROJECTS
-- Note: ID's are generated upfront, can be done making use of sequence as well
CREATE TABLE PROJECTS
(
  PROJECT_ID   NUMBER(4, 0) NOT NULL,
  PROJECT_NAME VARCHAR(200) NOT NULL,
  ESTIMATION   NUMBER(4, 0) NOT NULL,
  CUSTOMER_ID  NUMBER(4, 0) NOT NULL,
  CONSTRAINT PROJECT_PK PRIMARY KEY (PROJECT_ID),
  CONSTRAINT PROJECTS_CUSTOMERS_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMERS (CUSTOMER_ID)
);

-- WORKLOGS
CREATE TABLE WORKLOGS
(
  FREELANCER_ID NUMBER(4, 0) NOT NULL,
  PROJECT_ID    NUMBER(4, 0) NOT NULL,
  WORKDAY       DATE         NOT NULL,
  HOURS          NUMBER(2, 0) NOT NULL,
  CONSTRAINT WORKLOGS_PROJECTS_FK FOREIGN KEY (PROJECT_ID) REFERENCES PROJECTS (PROJECT_ID),
  CONSTRAINT WORKLOGS_FREELANCERS_FK FOREIGN KEY (FREELANCER_ID) REFERENCES FREELANCERS (FREELANCER_ID)
);


drop table WORKLOGS;
DROP TABLE projects;
DROP TABLE customers;
DROP TABLE freelancers;
DROP TABLE zipcodes;



-- Populate zipcodes
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('70116', 'New Orleans', 'Orleans', 'LA');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('8014', 'Bridgeport', 'Gloucester', 'NJ');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('45011', 'Hamilton', 'Butler', 'OH');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('48116', 'Brighton', 'Livingston', 'MI');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('19443', 'Kulpsville', 'Montgomery', 'PA');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('11953', 'Middle Island', 'Suffolk', 'NY');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('90034', 'Los Angeles', 'Los Angeles', 'CA');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('44023', 'Chagrin Falls', 'Geauga', 'OH');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('78045', 'Laredo', 'Webb', 'TX');
INSERT INTO zipcodes (zipcode, CITY, COUNTY, STATE) VALUES ('85013', 'Phoenix', 'Maricopa', 'AZ');

-- populate freelancers
INSERT INTO freelancers (FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES ('1', 'Tamar Hoogland', '54,375', '2371 Jerrold Ave', '19443');
INSERT INTO freelancers (FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES ('2', 'Moon Parlato', '64', '37275 St  Rt 17m M', '11953');
INSERT INTO freelancers (FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES ('3', 'Laurel Reitler', '57,5', '25 E 75th St #69', '90034');
INSERT INTO freelancers (FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES ('4', 'Delisa Crupi', '43,75', '98 Connecticut Ave Nw', '44023');
INSERT INTO freelancers (FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES ('5', 'Viva Toelkes', '90,75', '56 E Morehead St', '78045');
INSERT INTO freelancers (FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES ('6', 'Elza Lipke', '53,75', '73 State Road 434 E', '85013');


-- populate customers
INSERT INTO CUSTOMERS (CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES ('1', 'Hotel coorporation UK', '6649 N Blue Gum St', '70116');
INSERT INTO CUSTOMERS (CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES ('2', 'Great University', '8 W Cerritos Ave #54', '8014');
INSERT INTO CUSTOMERS (CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES ('3', 'Visits.com', '34 Center St', '45011');
INSERT INTO CUSTOMERS (CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES ('4', 'eHealth', '4 B Blue Ridge Blvd', '48116');

-- populate projects
INSERT INTO PROJECTS (PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES ('1', 'Hotel Recommendation System Based on Hybrid Recommendation Model', '25', '1');
INSERT INTO PROJECTS (PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES ('4', 'Advanced Intelligent Tourist Guide', '12', '1');
INSERT INTO PROJECTS (PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES ('3', 'College Forums with Alumni With Content Filtering', '10', '2');
INSERT INTO PROJECTS (PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES ('5', 'Industrial Visit Planning & Booking System', '13', '3');
INSERT INTO PROJECTS (PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES ('2', 'Online Health Shopping Portal With Product Recommendation', '6', '4');


-- populate worklogs
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','2/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','5/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','18/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','2/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','4/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','12/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','1','21/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','2/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','3/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','4/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','5/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','9/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','12/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','16/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','18/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','1/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','3/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','5/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('2','1','12/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','1','1/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','1','3/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','1','12/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','1','13/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','1','14/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','1/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','3/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','4/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','5/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','9/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','1/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','3/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','4/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','5/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','9/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','12/08/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('4','4','13/08/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','3','4/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','3','5/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','3','6/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('1','3','7/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','3','5/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','3','6/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','3','7/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','3','8/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','3','9/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','3','10/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('6','3','16/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('6','3','17/07/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','5','15/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','5','16/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','5','17/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','6/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','7/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','8/04/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','19/05/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','20/05/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','21/05/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','23/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','24/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('5','5','25/06/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','2','21/01/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','2','22/01/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','2','3/02/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','2','4/02/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','2','19/03/2017','8');
insert into WORKLOGS (FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS) values('3','2','20/03/2017','8');


-- SQL to construct Excel (samle_data.xlsx)

SELECT
  PROJECTS.PROJECT_NAME,
  PROJECTS.ESTIMATION,
  CUSTOMERS.CUSTOMER_NAME,
  CUSTOMERS.ADDRESS,
  ZIPCODES.ZIPCODE,
  ZIPCODES.STATE,
  ZIPCODES.COUNTY,
  ZIPCODES.CITY
FROM web.PROJECTS
  JOIN web.CUSTOMERS ON PROJECTS.CUSTOMER_ID = CUSTOMERS.CUSTOMER_ID
  JOIN web.ZIPCODES ON CUSTOMERS.ZIPCODE = ZIPCODES.ZIPCODE
ORDER BY PROJECT_ID ASC;


select
  FREELANCERS.NAME,
  FREELANCERS.PRICE,
  FREELANCERS.ADDRESS,
  FREELANCERS.ZIPCODE,
  ZIPCODES.CITY,
  ZIPCODES.STATE,
  ZIPCODES.COUNTY,
  WORKLOGS.WORKDAY,
  WORKLOGS.HOURS,
  PROJECTS.PROJECT_NAME
from FREELANCERS JOIN WEB.WORKLOGS on FREELANCERS.FREELANCER_ID = WORKLOGS.FREELANCER_ID
  join WEB.PROJECTS on WORKLOGS.PROJECT_ID = PROJECTS.PROJECT_ID
  Join WEB.ZIPCODES on FREELANCERS.ZIPCODE = ZIPCODES.ZIPCODE;