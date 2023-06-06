-- Part 1: Test it with SQL
SELECT column_name, data_type
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_name = 'job';

-- Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = 'St. Louis City';

-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4: Test it with SQL