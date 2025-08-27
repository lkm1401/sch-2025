\# 3일차



\## 1. DI(Dependency Injection) : 의존성 주입

\### (1) 강한 결합(Strong/Tight Coupling)

* 코드 안에서 new 키워드를 통해 객체를 생성
* 객체의 재사용성이 낮음
* 동일한 객체 생성이 발생하므로, 메모리 효율성이 낮음



\### (2) 느슨한 결합(Loose Coupling)

* 어노테이션을 통해 객체를 엔진에서 생성
* 객체의 재사용이 높음, 객체 호출 시 @Autowired 사용
* 엔진에서 싱글톤 패턴(Singleton) 으로 하나의 객체를 생성하고 관리하므로, 메모리 효율성이 높음



\## 2. 사원 관리 실습 - 사원등록, 사원리스트

* 등록폼 : static\\employeeRegister.html
* 리스트 : templates\\employeeList.html



















