## 1. Object 클래스

### 1. 프로젝트 환경 구성
- name : java-mid1
- language : Java
- build : IntelliJ
- JDK : Java 21

### 2. java.lang 패키지 소개
- 자바가 기본으로 제공하는 라이브러리 중 가장 기본
- 자바 언어를 이루는 가장 기본이 되는 클래스
- Object : 모든 자바 객체의 부모 클래스
- String : 문자열
- Integer, Long, Double : 래퍼 타입, 기본형 데이터 타입을 객체로 만든 것
- CLass : 클래스 메타 정보
- System : 시스템과 관련된 기본 기능 제공
- `import` 생략 가능

### 3. Object 클래스
- 모든 클래스의 최상위 부모 클래스
- 클래스에 상속 받을 부모 클래스 없음 -> 묵시적으로 Object 클래스 상속 받음
- 클래스에 상속 받을 부모 클래스 있음 -> 명시적으로 클래스 상속해야 함
- 모든 객체에 필요한 공통 기능 제공
    - 객체 정보 제공 : `toString()`
    - 객체 같음 비교 : `equals()`
    - 객체 클래스 정보 제공 : `getClass()`
    - 기타 여러가지 기능
- 다형성 기본 구현
    - 다양한 타입의 객체를 통합적으로 처리 가능
    - 모든 객체를 다 담을 수 있음

### 4. Object 다형성
- 모든 객체를 대상으로 다형적 참조 가능 -> 모든 객체 담기 가능
- 전달받은 객체 호출하기 위해 각 객체에 맞는 다운캐스팅 과정 필요

### 5. Object 배열
- 모든 객체를 담을 수 있는 배열 생성 가능
- `size()` : 배열에 담긴 객체 수 세기

### 6. toString()
- 객체의 정보를 문자열 형태로 제공 -> 디버깅, 로깅 사용
- 패키지를 포함한 객체의 이름과 객체의 참조값을 16진수로 제공
- `toString()` 메서드 오버라이딩 가능

### 7. Object와 OCP
- 다형적 참조 : Object 타입을 매개변수로 사용해서 다형적 참조 사용 가능
- 메서드 오버라이딩 : Object 타입에 의존하면서 런타임에 각 인스턴스 호출 가능
- OCP 원칙
    - Open : 새로운 클래스 추가, 오버라이딩 -> 기능 확장 가능
    - Closed : 새로운 클래스 추가 but 클라이언트 코드 변경 불필요

### 8. equals() - 1. 동일성과 동등성
- 동일성(Identity) : `==` 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    - 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값 확인
    - 자바 머신 기준, 메모리 참조가 기준
- 동등성(Equality) : `equals()` 메서드를 사용해서 두 객체가 논리적으로 동등한지 확인
    - 논리적으로 같은지 확인
    - 보통 사람이 생각하는 논리적인 기준

### 9. equals() - 2. 구현
- 반사성(Reflexivity) : 객체는 자기 자신과 동등해야 함
- 대칭성(Symmetry) : 두 객체가 서로에 대해 동일하다고 판단하면 양방향으로 동일해야 함
- 추이성(Transitivity) : A와 B가 동일, B와 C가 동일하면 A와 C도 동일해야 함
- 일관성(Consistency) : 두 객체의 상태가 변경되지 않는 한, 항상 동일한 값 반환
- null에 대한 비교 : 모든 객체는 null과 비교했을 때 False 반환