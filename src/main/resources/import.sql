DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), price int, PRIMARY KEY (id));


INSERT INTO products (title, price) VALUES('Demon Souls', 10),('Dark  Souls', 10),('Dark Souls 2', 10),('Dark Souls 3', 10),('Bloodborne', 10),('Elden Ring', 10),('Star Craft', 10),('Sekiro', 10),('World of Warcraft', 10),('World of Warcraft: Wrath of the Lich King', 10);