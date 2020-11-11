-- SCHEMA: mcve

 DROP SCHEMA if exists mcve cascade ;

CREATE SCHEMA mcve
    AUTHORIZATION postgres;

COMMENT ON SCHEMA mcve
    IS 'standard mcve schema';

GRANT ALL ON SCHEMA mcve TO public;

GRANT ALL ON SCHEMA mcve TO postgres;

-- Type: my_udt

-- DROP TYPE mcve.my_udt;

CREATE TYPE mcve.my_udt AS
(
	id uuid,
	value integer
);

ALTER TYPE mcve.my_udt
    OWNER TO postgres;

-- Table: mcve.my_table

-- DROP TABLE mcve.my_table;

CREATE TABLE mcve.my_table
(
    my_column my_udt[] NOT NULL
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE mcve.my_table
    OWNER to postgres;

insert into my_table (my_column) values (array[
	('8a611d6b-b330-4373-92fa-4c64705a59cb',1)::my_udt,
	('3244eb88-6528-484c-bf74-4be7d68feae9',2)::my_udt
]);