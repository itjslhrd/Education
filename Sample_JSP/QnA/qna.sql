-- 질문 정보 테이블 테이블
-- 테이블 구조 `tbl_question`

CREATE TABLE tbl_question (
  q_idx number NOT NULL,			-- 기본키
  q_open char(1) default 'y',			-- 공개유무(y/n)
  q_gubun varchar2(20) NOT NULL,		-- 질문구분
  q_name varchar2(20) NOT NULL,		-- 작성자
  q_subject varchar2(150) NOT NULL,		-- 제목
  q_contents varchar2(2000) NOT NULL,		-- 내용
  q_tel varchar2(14) ,			-- 연락처
  q_regdate date default sysdate,		-- 등록일자
  q_readcnt number default 0,			-- 조회수
  q_answer char(1) default 'n',			-- 답변유무(y/n)
  PRIMARY KEY(q_idx)
);
create sequence tbl_question_seq_q_idx;

--
-- 답변정보 테이블
-- 테이블 구조 `tbl_answer`

CREATE TABLE tbl_answer (
  q_idx number references tbl_question,	-- 메인글 키번호
  an_name varchar(20) NOT NULL,		-- 답변글 작성자
  an_contents varchar2(2000) not null,		-- 답글정보
  an_regdate date default sysdate		-- 등록일자
);
