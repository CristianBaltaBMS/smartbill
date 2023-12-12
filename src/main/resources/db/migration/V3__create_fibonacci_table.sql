CREATE TABLE fibonacci
(
    fibonacci_id UUID NOT NULL PRIMARY KEY DEFAULT uuid_generate_v4(),
    user_id UUID UNIQUE NOT NULL,
    values TEXT NOT NULL,
    created TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE fibonacci ADD CONSTRAINT fk_fibonacci_users FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE;

CREATE INDEX fibonacci_user_id_idx ON fibonacci(user_id);

CREATE TRIGGER update_fibonacci_modtime
    BEFORE UPDATE ON fibonacci
    FOR EACH ROW
    EXECUTE FUNCTION update_modified_column();
