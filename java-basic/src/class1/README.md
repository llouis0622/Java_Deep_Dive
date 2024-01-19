## 1. 클래스와 데이터

### 1. 프로젝트 환경 구성
- Build System : IntelliJ
- JDK : Java 21
- Language : Java

### 2. 클래스가 필요한 이유
- 일반 코드 -> 배열로 코드 변경 최소화 가능 : 배열에서 직접 데이터 변경
- 각각 따로 나누어 관리 -> 클래스로 묶어서 한 번에 관리

### 3. 클래스 도입
- `class` 키워드 : 클래스 정의
  - 사용자가 직접 정의하는 사용자 정의 타입
  - 대문자로 시작, 낙타 표기법 사용
- 클래스에 정의한 변수 : 멤버 변수, 필드
  - 멤버 변수(Member Variable) : 특정 클래스에 소속된 멤버
  - 필드(Field) : 데이터 항목을 가리키는 전통적인 용어
- 객체, 인스턴스 : 클래스를 기반으로 실제 메모리에 만들어진 실체

### 4. 객체 사용
- `.` 사용 -> 객체 접근 이후 객체 사용 이루어짐
  - 객체에 값 대입
  - 객체 값 읽기

### 5. 클래스, 객체, 인스턴스 정리
- 클래스(Class)
  - 객체를 생성하기 위한 틀, 설계도
  - 객체가 가져야 할 속성(변수)과 기능(메서드) 정의
- 객체(Object)
  - 클래스에서 정의한 속성과 기능을 가진 실체
  - 서로 독립적인 상태 가짐
- 인스턴스(Instance)
  - 특정 클래스로부터 생성된 객체
  - 주로 객체가 어떤 클래스에 속해 있는지 강조할 때 사용
- 객체 vs 인스턴스
  - 둘 다 클래스에서 나온 실체
  - 인스턴스 -> 객체보다 좀 더 관계에 초점을 맞춤

### 6. 배열 도입 - 시작
- 배열 사용 -> 하나의 데이터 구조로 묶어서 관리 가능
- 변수 : 인스턴스의 위치를 가리키는 참조값이 들어있음

### 7. 배열 도입 - 리펙토링
- 배열 생성 및 선언 동시에 가능
- iter 사용 -> 향상된 for문