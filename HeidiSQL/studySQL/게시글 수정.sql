/*
	2번 게시글 내용 수정
	기존 글에서 내용 추가
	DML 실습
	CONCAT() : 문자열 합치기
	REPLACE(): (바꿀 컬럼명,'기존 문자','바꿀 문자')
*/

UPDATE
	board_dtl
SET
	bd_contents = CONCAT(bd_contents, '\n', 'DML 실습')
WHERE
	bm_code = 9;
	
UPDATE 
	board_img
SET
	bi_img_url = REPLACE(bi_img_url, '1', '2')
WHERE
	bm_code = 8;