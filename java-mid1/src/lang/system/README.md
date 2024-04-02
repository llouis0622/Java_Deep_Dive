## 4. 래퍼, Class 클래스

### 6. System 클래스
- 시스템과 관련된 기본 기능 제공
- 표준 입력, 출력, 오류 스트림
  - `System.in` : 표준 입력 스트림
  - `System.out` : 표준 출력 스트림
  - `System.err` : 표준 오류 스트림
- 시간 측정
  - `System.currentTimeMillis()` : 현재 시간을 밀리초 단위로 제공
  - `System.nanoTime()` : 현재 시간을 나노초 단위로 제공
- 환경 변수
  - `System.getenv()` : OS에서 설정한 환경 변수의 값 확인
- 시스템 속성 : 자바에서 사용하는 설정값
  - `System.getProperties()` : 현재 시스템 속성 확인
  - `System.getProperty(String key)` : 특정 속성 확인
- 시스템 종료
  - `System.exit(int status)` : 프로그램 종료, OS에 프로그램 종료 상태 코드 전달
    - 상태 코드 `0` : 정상 종료
    - 상태 코드 `0` 이 아님: 오류나 예외적인 종료
- 배열 고속 복사
  - `System.arraycopy` : 시스템 레벨에서 최적화된 메모리 복사 연산 사용