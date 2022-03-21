/*
	username: gyeongun
	password: 1q2w3e4r
*/

SELECT 
	COUNT(um.username) + COUNT(um2.password) AS login_flag
FROM
	user_mst um
	LEFT OUTER JOIN user_mst um2 ON(um2.um_code = um.um_code AND um2.password = '1q2w3e4r')
WHERE
	um.username = 'gyeongun';
	
SELECT
	um.um_code,
	ud.ud_code,
	
	um.username,
	um.password,
	um.name,
	um.email,
	ud.ud_profile_img_url,
	ud.ud_phone,
	ud.ud_introduction
FROM
	user_mst um
	INNER JOIN user_dtl ud ON(ud.um_code = um.um_code)
WHERE
	um.username = 'gyeongun';
	
	