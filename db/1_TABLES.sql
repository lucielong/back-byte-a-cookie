CREATE TABLE image
(
    id      bigserial PRIMARY KEY,
    content bytea NOT NULL,

    CONSTRAINT content_is_non_empty CHECK (octet_length(content) > 0)
);

CREATE TABLE client
(
    id                 bigserial PRIMARY KEY,
    name               text   NOT NULL,
    email              text   NOT NULL UNIQUE,
    profile_picture_id bigint NULL REFERENCES image,
    password           bytea  NOT NULL,

    CONSTRAINT clientname_is_non_empty CHECK (length(name) > 0),
    CONSTRAINT email_is_non_empty CHECK (length(email) > 0),
    CONSTRAINT email_is_lowercase CHECK (email = lower(email)),
    CONSTRAINT email_has_at_symbol CHECK (email ~ '^.+@\S+$'),
    CONSTRAINT password_is_non_empty CHECK (octet_length(password) > 0)
);


CREATE TABLE recipe
(
    id          bigserial PRIMARY KEY,
    name        text                     NOT NULL,
    image_id    bigint                   NULL REFERENCES image,
    description text                     NOT NULL,
    difficulty  text                     NOT NULL,
    time        integer                  NOT NULL CHECK (time > 0),
    client_id   bigint                   NOT NULL REFERENCES client (id) ON DELETE CASCADE,
    date        timestamp with time zone NOT NULL,
    ingredients text                     NOT NULL,

    CONSTRAINT title_is_non_empty CHECK (length(name) > 0),
    CONSTRAINT description_is_non_empty CHECK (length(description) > 0),
    CONSTRAINT date_after_millennium CHECK (date > '1999-12-31'::timestamp with time zone)
);



CREATE TABLE comment
(
    id        bigserial PRIMARY KEY,
    client_id bigint                   NOT NULL REFERENCES client ON DELETE CASCADE,
    recipe_id bigint                   NOT NULL REFERENCES recipe ON DELETE CASCADE,
    rating    integer                  NOT NULL,
    body      text                     NULL,
    date      timestamp with time zone NOT NULL,

    CONSTRAINT rating_in_range CHECK ((rating >= 0) AND (rating <= 10)),
    CONSTRAINT body_is_empty_or_null CHECK ((body IS NULL) OR (length(body) > 0)),
    CONSTRAINT date_after_millennium CHECK (date > make_date(1999, 12, 31))
);

ALTER SEQUENCE image_id_seq RESTART 100000 INCREMENT BY 50;
ALTER SEQUENCE client_id_seq RESTART 100000 INCREMENT BY 50;
ALTER SEQUENCE recipe_id_seq RESTART 100000 INCREMENT BY 50;
ALTER SEQUENCE comment_id_seq RESTART 100000 INCREMENT BY 50;