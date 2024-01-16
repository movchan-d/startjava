\c robots;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id         SERIAL PRIMARY KEY,
    model_name TEXT,
    mark       INT,
    height     NUMERIC,
    weight     NUMERIC,
    status     TEXT,
    origin     TEXT,
    launch     DATE,
    kaiju_kill INT
);

\ir 'init_db.sql'
\ir 'queries.sql'
