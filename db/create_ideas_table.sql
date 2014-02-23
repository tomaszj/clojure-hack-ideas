DROP TABLE IF EXISTS ideas;
CREATE TABLE ideas (
  id bigserial PRIMARY KEY,
  name varchar(100) NOT NULL,
  description text,
  created_at timestamp default current_timestamp
);
