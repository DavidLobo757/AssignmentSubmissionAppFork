# -- ASSIGNMENT --

INSERT INTO assignment (id, branch, code_review_video_url, created_date, github_url, last_modified, `name`, `number`, `status`, submitted_date, code_reviewer_id, user_id)
values (3, 'master', 'https://github.com/', '2022-12-04 10:39:49', 'https://github.com/', '2022-12-04 10:39:49', 'david', '1', 'COMPLETED', '2022-12-04 10:39:49', 1, 1);

# -- AUTHORITIES --

INSERT INTO authorities (id, authority, user_id)
values (1, 'ROLE_ADMIN', 1);

INSERT INTO authorities (id, authority, user_id)
values (2, 'ROLE_CODE_REVIEWER', 2);

INSERT INTO authorities (id, authority, user_id)
values (3, 'ROLE_ADMIN', 2);

INSERT INTO authorities (id, authority, user_id)
values (4, 'ROLE_INSTRUCTOR', 2);

# -- COMMENTS --

INSERT INTO comments (id, created_date, `text`, assignment_id, user_id)
values ();

# -- USERS --
INSERT INTO users (id, bootcamp_duration_in_weeks, cohort_start_date, `name`, `password`, `username`)
values (1, 7, '2022-12-04', 'name', '$2a$10$wXfyg2q/PNk1Zfa88PTHzeQDmGZFeytpJswvYYYCmImrfEIHRl4KC', 'exampleEmail@gmail.com');

# -- MISC --

select * from assignment;
select * from users;
