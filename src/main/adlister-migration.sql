USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(128) NOT NULL,
    email    VARCHAR(128) NOT NULL,
    password VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)

);

CREATE TABLE ads
(
    id          INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id     INT UNSIGNED NOT NULL,
    title       VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)

);

INSERT INTO users (id, username, email, password)
VALUES (1, 'fernando', 'fernando@codeup.com', 'password');



INSERT INTO ads (user_id, title, description)
VALUES (1,'Super Nintendo', 'Get your game on with this old-school classic!');