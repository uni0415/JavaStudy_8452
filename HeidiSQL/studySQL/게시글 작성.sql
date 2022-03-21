INSERT INTO
	board_mst
VALUES(
	0,
	'데이터 베이스 수업',
	(select
		username
	from
		user_mst
	where
		username='gyeongun' AND PASSWORD='1q2w3e4r'),
	0,
	NOW(),
	NOW()
);



INSERT INTO
	board_dtl
VALUES(
	0,
	(SELECT
		NULLIF(MAX(bm_code), 1) AS bm_code
	FROM
		board_mst),
	'데이터 베이스 CRUD 실습
create(insert)
read(select)
update(update)
delete',
	NOW(),
	NOW()
);
	
INSERT INTO
	board_img
VALUES(
	0,
	(SELECT
		NULLIF(MAX(bm_code), 1) AS bm_code
	FROM
	board_mst),
	'create예제 캡쳐.png',
	NOW(),
	NOW()
),(
	0,
	(SELECT
		NULLIF(MAX(bm_code), 1) AS bm_code
	FROM
	board_mst),
	'read예제 캡쳐.png',
	NOW(),
	NOW()
),(
	0,
	(SELECT
		NULLIF(MAX(bm_code), 1) AS bm_code
	FROM
	board_mst),
	'update예제 캡쳐.png',
	NOW(),
	NOW()
),(
	0,
	(SELECT
		NULLIF(MAX(bm_code), 1) AS bm_code
	FROM
	board_mst),
	'delete예제 캡쳐.png',
	NOW(),
	NOW()
);
						