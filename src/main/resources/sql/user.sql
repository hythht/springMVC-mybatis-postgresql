CREATE
	TABLE
		 n_user(
			id integer NOT null PRIMARY KEY,
			user_name VARCHAR(40) NOT NULL,
			password VARCHAR(255) NOT NULL,
			age integer NOT NULL
		);


		insert into n_user (id, user_name, password, age) values (1,'001','001',24);
		insert into n_user (id, user_name, password, age) values (2,'002','002',24);
		insert into n_user (id, user_name, password, age) values (3,'002','002',24);
		insert into n_user (id, user_name, password, age) values (4,'004','004',24);
		insert into n_user (id, user_name, password, age) values (5,'005','005',24);