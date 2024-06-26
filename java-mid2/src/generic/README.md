## 1. 제네릭 - Generic 1

### 1. 제네릭이 필요한 이유
- 담는 타입이 수십 개 -> 수십 개의 클래스 생성 필요

### 2. 다형성을 통한 중복 해결 시도
- 다형성 사용 -> 중복 해결 가능
- 입력 시 실수로 원하지 않는 타입이 들어갈 수 있음 -> 타입 안전성 문제 발생

### 3. 제네릭 적용
- `<>` 사용한 클래스
- 타입 매개변수 사용 -> 타입 미리 결정하지 않음
- 생성 시점에 원하는 타입 지정

### 4. 제네릭 용어와 관례
- 사용할 타입을 미리 지정하지 않음
- 타입 매개변수에 타입 인자를 전달하여 사용할 타입 결정
- 제네릭 : 일반적인, 범용적인, 특정 타입에 속한 것이 아님
- 제네릭 타입 : 클래스나 인터페이스를 정의할 때 타입 매개변수를 사용하는 것
- 타입 매개변수 : 제네릭 타입이나 메서드에서 사용되는 변수, 실제 타입으로 대체
- 타입 인자 : 제네릭 타입을 사용할 때 제공되는 실제 타입
- 제네릭 명명 관례
  - `E` : Element
  - `K` : Key
  - `N` : Number
  - `T` : Type
  - `V` : Value
  - `S, U, V` : 2nd, 3rd, 4th Types
- 여러 타입 매개변수 선언 가능
- 타입 인자 기본형 사용 불가

### 5. 로 타입 - Row Type
- 원시 타입 : `<>` 미지정, 내부의 타입 매개변수가 Object

## 2. 제네릭 - Generic 2

### 1. 타입 매개변수 제한
- 코드 재사용 문제
- 타입 안전성 문제
- 제네릭에서 타입 매개변수 사용 -> 어떤 타입이든 들어올 수 있음
- 타입 매개변수 Object 가정 -> Object 기능만 사용
- 제네릭에 타입 매개변수 상한 사용 -> 타입 안정성 확보, 상위 타입의 원하는 기능 사용 가능

### 2. 제네릭 메서드
- 제네릭 타입 : `GenericClass<T>`, 객체를 생성하는 시점
- 제네릭 메서드 : `<T> T genericMethod(T t)`, 메서드를 호출하는 시점

### 3. 와일드카드
- `*, ?` 와 같이 하나 이상의 문자들을 상징하는 특수 문자
- 비제한 와일드카드 : ?만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드
- 상한/하한 와일드카드 : 와일드카드에도 상한/하한 제한을 둠

### 4. 타입 이레이저
- 컴파일 전에는 제네릭의 타입 매개변수 존재, 컴파일 이후 타입 매개변수 존재하지 않음
- 런타임에 타입을 활용하는 코드 작성 불가능