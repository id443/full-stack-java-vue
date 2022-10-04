CREATE TABLE Products
(
    ID        	bigint       NOT NULL,
    Name        varchar(300) NOT NULL,
    Price       int          NULL,
    Picture     varchar(300)
);

INSERT INTO Products(ID, Name, Price, Picture) VALUES (1, 'Apple', 1, '');
INSERT INTO Products(ID, Name, Price, Picture) VALUES (2, 'Orange', 2, '');
INSERT INTO Products(ID, Name, Price, Picture) VALUES (3, 'Watermelon', 3, '');