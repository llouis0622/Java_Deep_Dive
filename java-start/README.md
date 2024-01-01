## 1. Hello World

### 1. 개발 환경 설정
- IntelliJ IDEA Ultimate
- JDK : Oracle OpenJDK 21

### 2. 자바 프로그램 실행
```java
public class HelloJava {

    public static void main(String[] args) {
        System.out.println("hello java");
    }

}
```
- 대소문자 구분
- `HelloJava` : 클래스
- `public static void main(String[] args)` : main 메서드, 프로그램 시작점
- `;` : 문장 종단점
- `//` : 한 줄 주석
- `/* */` : 여러 줄 주석

- 실행 과정
1. `HelloJava` 프로그램 실행
2. `main()` 메서드 실행
3. `System.~~` 만남 -> 문자열 출력
4. 프로그램 종료

### 3. 자바란?
- 자바 표준 스펙
  - 자바 설계도, 문서
  - 자바 커뮤니티 프로세스(JCP)로 관리

- 컴파일과 실행
  1. 자바 소스 코드 개발
  2. 컴파일러로 소스 코드 컴파일
     - javac 프로그램 사용
     - .java -> .class 파일 생성
  3. 자바 프로그램 실행
     - java 프로그램 사용
     - JVM 실행 -> 프로그램 작동