/*
	Springboot 연동 쿼리
*/

-- 	데이터베이스 생성
create database hrdb_spring;

-- 데이터베이스 확인
use hrdb_spring;
select database();

-- 모든 테이블 확인
show tables;

-- Employee 테이블 생성
/*
	create table [테이블명] (
		컬럼명	데이터타입		제약사항,
        ...
    )
*/
create table employee (
	sno		int	primary key,  -- 사원번호
    name	varchar(10),		  -- 이름
    address	varchar(30)    
);

-- 테이블 생성 확인
desc employee;

-- C(create) : 데이터 추가 
insert into employee(sno, name, address)
values(1234, '홍길동', '서울시 강남구');

insert into employee(name, sno, address)
values('이순신', 3456, '서울시 강남구');

desc employee;

insert into employee
values(2345, '김유신', '아산시 강남구');

-- R(read) : 데이터 조회 
select * from employee;
select sno, name, address from employee where sno = 1234;

-- U(update) : 데이터 수정
update employee set name = '홍길순' where sno = 1234;
update employee set name = '홍길동', address = '부산시 해운대구'
where sno = 1234;

select * from employee;

-- D(delete) : 데이터 삭제 
delete from employee where sno = 1234;

select * from employee;








