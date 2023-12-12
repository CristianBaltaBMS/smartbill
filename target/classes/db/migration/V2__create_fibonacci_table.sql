CREATE TABLE fibonacci
(
    fibonacci_id UUID NOT NULL PRIMARY KEY,
    user_id UUID UNIQUE NOT NULL,
    values TEXT NOT NULL,
    created TIMESTAMPTZ NOT NULL,
    updated TIMESTAMPTZ NOT NULL
);

ALTER TABLE fibonacci ADD CONSTRAINT fk_fibonacci_users FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE;

CREATE INDEX fibonacci_user_id_idx ON fibonacci(user_id);
