CREATE TABLE users
(
    user_id UUID NOT NULL PRIMARY KEY,
    user_name TEXT,
    created TIMESTAMPTZ NOT NULL,
    updated TIMESTAMPTZ NOT NULL
);
