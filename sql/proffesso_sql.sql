# -- AUTHORITY --

INSERT INTO authority (id, authority, user_id)
values (1, 'ROLE_ADMIN', 1);

INSERT INTO authority (id, authority, user_id)
values (2, 'ROLE_CODE_REVIEWER', 2);

INSERT INTO authority (id, authority, user_id)
values (3, 'ROLE_ADMIN', 2);

INSERT INTO authority (id, authority, user_id)
values (4, 'ROLE_INSTRUCTOR', 2);

# -- OFFERS --

INSERT INTO offers (id, `active`, author_name, billing_contact_email, checkout_url, created_by, created_date, `description`, embeded_url, enable_attachments, enable_comments, enable_video_downloads, image_url, last_modified_by, last_modified_date, `name`, price, price_frequency, purchase_url, stripe_plan_selected, trial_days, `type`, url, video_id, video_provider, warranty_length, warranty_start, warranty_url )
values ();

# -- ORDERS -- 

INSERT INTO orders (id, cancellation_requested_on, delinquent, order_date, purchase_url, refund_requested_on, suspend_on, user_id)
values ();

# -- ORDERS_OFFERS --

INSERT INTO orders_offers (orders_id, offers_id)
values ();

# -- SUGGESTED_OFFER_MAPPING --
INSERT INTO suggested_offer_mapping (suggested_offer_id, main_offer_id)
values ();

# -- USERS --

# make sure the password is Encrypted in order for it to work
# you can make one in encryptPasswordTest class in the test package
# don't use this one v v v
INSERT INTO users (id, email, `name`, `password`)
values (1, 'exampleEmail@gmail.com', 'name', 'password');

# make sure the password looks like this one
INSERT INTO users (id, email, `name`, `password`)
values (2, 'exmapleEmail@gmail.com', 'david', '$2a$10$kMth6nLmfjdt8tcNF46sU.oBJKMcc2J.ExgZrGumeVKNKKd.DA8Sq');

select * from users;
DELETE FROM users WHERE id = 2;

