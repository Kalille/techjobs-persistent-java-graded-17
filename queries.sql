--Part 1
-- id: INT AUTO_INCREMENT PRIMARY KEY
-- name: VARCHAR(255) NOT NULL
-- employer_id: INT NOT NULL
-- description: TEXT
-- location: VARCHAR(255)
-- created_at: TIMESTAMP DEFAULT CURRENT_TIMESTAMP
--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT *
FROM skill
LEFT JOIN job_skills ON job_skills.skills_id = skill.id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;



