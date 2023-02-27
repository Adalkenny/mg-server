create table if not exists feature(
	id bigserial primary key,
	titulo varchar(500),
	descricao text,
	criado_em timestamp default current_timestamp
);

create table if not exists subfeatures(
	id bigserial primary key,
	feature_id bigint references feature (id),
	subtitulo varchar(500),
	subdescricao text,
	criado_em timestamp default current_timestamp
);

create table if not exists deadline(
	id bigserial primary key,
	feature_id bigint references feature (id),
	subfeature_id bigint references subfeatures (id),
	data_inicio timestamp,
	data_limite timestamp,
	criado_em timestamp default current_timestamp
);-- link to both feature and subfeatures

create table if not exists status(
	id bigserial primary key,
	subfeature_id bigint references subfeatures (id),
	estado varchar(200),
	criado_em timestamp default current_timestamp
);

create table if not exists resources(
	id bigserial primary key,
	subfeature_id bigint references subfeatures (id),
	tipo varchar(200),
	fonte varchar(500),
	descricao text,
	criado_em timestamp default current_timestamp
);