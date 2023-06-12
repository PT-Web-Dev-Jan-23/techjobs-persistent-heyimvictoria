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
SELECT name
FROM skill s
INNER JOIN job_skills js ON s.id = js.skills_id
WHERE js.skills_id IS NOT NULL
ORDER BY s.name ASC;

