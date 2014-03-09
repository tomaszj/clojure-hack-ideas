DROP TABLE IF EXISTS data_sources_to_ideas;
CREATE TABLE data_sources_to_ideas (
  id bigserial PRIMARY KEY,
  data_source_id integer REFERENCES data_sources(id),
  idea_id integer REFERENCES ideas(id),
  created_at timestamp default current_timestamp
);

