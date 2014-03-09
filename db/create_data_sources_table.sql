DROP TABLE IF EXISTS data_sources;
CREATE TABLE data_sources (
  id bigserial PRIMARY KEY,
  name varchar(100) NOT NULL,
  description text,
  created_at timestamp default current_timestamp
);

