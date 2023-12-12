DROP TRIGGER IF EXISTS a_suppress_redundant_updates_trigger ON users;
CREATE TRIGGER a_suppress_redundant_updates_trigger
    BEFORE UPDATE
    ON users
    FOR EACH ROW
EXECUTE PROCEDURE suppress_redundant_updates_trigger();

DROP TRIGGER IF EXISTS a_suppress_redundant_updates_trigger ON fibonacci;
CREATE TRIGGER a_suppress_redundant_updates_trigger
    BEFORE UPDATE
    ON fibonacci
    FOR EACH ROW
EXECUTE PROCEDURE suppress_redundant_updates_trigger();
