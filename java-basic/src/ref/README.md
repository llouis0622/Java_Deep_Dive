## 2. 기본형과 참조형

### 1. 기본형 vs 참조형 1 - 시작
- 기본형(Primitive Type)
  - 사용하는 값을 변수에 직접 넣을 수 있음 -> 해당 값 바로 사용
  - `int`, `long`, `double`, `boolean`
  - 들어있는 값 그대로 계산 사용 가능
- 참조형(Reference Type)
  - 객체가 저장된 메모리의 위치를 가리키는 참조값을 넣을 수 있음 -> 객체를 찾아서 사용
  - 객체, 배열
  - 참조값 그대로 계산 사용 불가
  - `String` -> 클래스이기 때문에 참조형

### 2. 기본형 vs 참조형 2 - 변수 대입
- 기본형 : 변수에 들어있는 실제 사용하는 값을 복사해서 대입
- 참조형 : 변수에 들어있는 참조값을 복사해서 대입
  - 실제 사용하는 객체가 아니라 객체의 위치를 가리키는 참조값만 복사

### 3. 기본형 vs 참조형 3 - 메서드 호출
- 메서드 호출 시 사용하는 매개변수(파라미터)도 결국 변수
- 기본형 : 메서드로 기본형 데이터 전달 -> 해당 값이 복사되어 전달
  - 메서드 내부에서 매개변수 값 변경 -> 호출자의 변수 값에는 영향이 없음
- 참조형 : 메서드로 참조형 데이터 전달 -> 참조값이 복사되어 전달
  - 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수 변경 -> 호출자의 객체도 변경

### 4. 참조형과 메서드 호출 - 활용
- 메서드 호출 시 참조값 전달
- 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나 값을 읽어서 사용 가능
- 메서드 하나로 객체 생성 및 초기값 설정 모두 처리 가능

### 5. 변수와 초기화
- 멤버 변수(필드) : 클래스에 선언
  - 자동 초기화 : 인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화
  - 숫자 = 0, boolean = false, 참조형 = null
  - 개발자가 초기값을 직접 지정 가능
- 지역 변수 : 메서드에 선언, 매개변수
  - 수동 초기화 : 항상 직접 초기화

### 6. null
- 값이 존재하지 않는, 없다는 뜻
- 아무도 참조하지 않는 인스턴스 존재 -> JVM의 GC(가비지 컬렉션)가 더 이상 사용하지 않는 인스턴스라 판다, 해당 인스턴스 자동으로 메모리에서 제거
- 해당 객체를 참조하는 곳이 존재 -> JVM이 종료할 때까지 계속 생존

### 7. NullPointerException
- 주소가 없는 곳을 찾아갈 때 발생하는 예외
- null에 `.`을 찍었을 때 발생
- 멤버 변수가 null인 경우 주의 필요