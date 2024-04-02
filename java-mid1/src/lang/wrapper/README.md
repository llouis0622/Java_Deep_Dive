## 4. 래퍼, Class 클래스

### 1. 래퍼 클래스 - 기본형의 한계
- 기본형의 한계
  - 객체가 아님 : 메서드 제공 불가, 컬렉션 프레임워크 사용 불가
  - null 값을 가질 수 없음 : 데이터 없음을 나타내지 못함
- 래퍼 클래스 : 특정 기본형을 감싸서 만드는 클래스

### 2. 래퍼 클래스 - 자바 래퍼 클래스
- 기본형의 객체 버전
  - byte -> Byte
  - short -> Short
  - int -> Integer
  - long -> Long
  - float -> Float
  - double -> Double
  - char -> Character
  - boolean -> Boolean
- 불변, equals로 비교해야 함
- 박싱(Boxing) : 기본형을 래퍼 클래스로 변경하는 것
- 언박싱(Unboxing) : 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드
- equals : 인스턴스 참조값 비교가 아닌 내부의 값 비교

### 3. 래퍼 클래스 - 오토 박싱(Auto Boxing)
- 컴파일러가 개발자 대신 `valueOf`, `xxxValue()` 코드 추가
- 기본형과 래퍼형 편리하게 변환 가능

### 4. 래퍼 클래스 - 주요 메서드와 성능
- `valueOf()` : 래퍼 타입 반환숫자, 문자열 모두 지원
- `parseInt()` : 문자열을 기본형으로 변환
- `compareTo()` : 내 값과 인수로 넘어온 값 비교, 내 값이 크면 `1` , 같으면 `0` , 내 값이 작으면 `-1` 을 반환
- `Integer.sum()` , `Integer.min()` , `Integer.max()` : `static` 메서드, 간단한 덧셈, 작은 값, 큰 값 연산

### 5. Class 클래스
