# 1일차 정리


## 1. cmder 다운로드 및 설치
- cmder 사이트 다운로드 진행
- 압축해제 : c:/dev 설치


## 2. Git & GitHub 설치 및 연동
- Git 다운로드 및 설치
- 환경변수 추가 확인 
- GitHub 레파지토리 생성  : sch-2025
- 토큰 발행 


## 3. Git 명령어
- 사용자 확인 및 설정 : git config --global user.name "사용자명"
- 이메일 확인 및 설정(잔디) : git config --global user.email "github 로그인 이메일주소"
- GitHub Repository Clone(복제) : git clone https://토큰번호@github.com/github계정/레파지명.git
- Stage > add : git add "파일명 혹은 전체(.)"
- Local Repository > add : git commit -m "커밋 메시지~" //작업날짜 및 시간, 작업명, 작업자 이메일..
- GitHub Remote Repository push : git push origin main

## 4. JDK 다운로드 및 설치
- jdk 17 이상 설치 : 스프링 부트 사용 시
- 기본 폴더에 설치 > java -version

## 5. IntellJ 다운로드 및 설치
- 30일 무료 버전 : community 버전 설치
- community 버전은 springboot initializer 모듈이 없음 > start.spring.io 사이트에서 springboot 프로젝트 생성 

## 6. 스프링부트 프로젝트 생성 및 실행
- start.spring.io 사이트에서 springboot 프로젝트 생성 
- IntelliJ > open > 프로젝트 import
- 실행 : 프로젝트 > src > main > java > SpringbootApplication 클래스의 main 메소드 실행 : 녹색 버튼

## 7. 스프링 구조 : mvc 패턴
<img src="images/mvc.png" width="600">











