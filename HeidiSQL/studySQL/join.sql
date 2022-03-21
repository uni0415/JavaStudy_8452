SELECT
	*
FROM
	countries c 
	LEFT OUTER JOIN regions r ON(r.region_id = c.region_id) 
	#왼쪽을 기준으로 바깥쪽에 테이블을 합침
	LEFT OUTER JOIN continents ct on(ct.continent_id = r.region_id)user_mstuser_dtl
;

SELECT
	*
FROM
	user_mst um
	left OUTER JOIN user_dtl ud ON(ud.um_code = um.um_code)
;

SELECT
	*
FROM
	user_dtl
WHERE
	um_code = 100;
	

SELECT
	*
FROM
	product_mst pm
	LEFT OUTER JOIN category_mst cm ON(cm.ctg_code = pm.ctg_code)
WHERE
	#pm.pdm_name LIKE '%텀블러%';
	cm.ctg_code = 1
ORDER BY
	pm.pdm_code DESC;