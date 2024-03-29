## 5. 패키지

### 1. 패키지 - 시작
- 컴퓨터 : 파일을 분류하기 위해 폴더, 디렉토리 개념 제공
- 자바 : 패키지
- 패키지를 사용하는 경우 항상 코드 첫줄에 패키지 이름 작성
- 사용자와 같은 위치 : 패키지 경로 생략 가능
- 사용자와 다른 위치 : 패키지 전체 경로를 포함해서 클래스 작성

### 2. 패키지 - import
- 다른 패키지에 있는 클래스를 가져와서 사용 가능
- 패키지 명 생략 후 클래스 이름만 작성 가능
- `*` : 특정 패키지에 포함된 모든 클래스를 포함해서 사용
- 클래스 이름이 같아도 패키지 이름으로 구분해서 같은 이름의 클래스 사용 가능
- 같은 이름의 클래스가 있을 경우 import는 둘 중 하나만 선택 가능

### 3. 패키지 규칙
- 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 함
- 패키지 이름은 모두 소문자 사용
- 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용
- 패키지가 계층 구조를 이루더라도 모든 패키지는 서로 다른 패키지

### 4. 패키지 활용
- `import` : 다른 패키지 기능 필요
- `public` : 다른 패키지에서 생성자 호출 가능