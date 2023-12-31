## 4. 조건문

### 1. if, else
- `if` : 특정 조건이 참인지 확인, 참일 경우 특정 코드 블록 실행
- `else` : if문에서 만족하는 조건이 없을 때 실행

### 2. else if
- if문의 조건이 거짓일 때 다음 조건 검사

### 3. if문과 else if문
- 요구사항에 따라 다르게 사용
- 실행 명령이 하나만 있을 경우 중괄호 생략 가능

### 4. switch문
- if문을 조금 더 편리하게 사용 가능
- 조건식이 특정 case와 같은지만 체크 가능
- Java14 새로운 switch문
  ```java
    int coupon = switch (grade) {
    case 1 -> 1000;
    case 2 -> 2000;
    case 3 -> 3000;
    default -> 500;
    };
  ```
  
### 5. 삼항 연산자
 - `(조건) ? 참 표현식 : 거짓 표현식`
 - 참과 거짓에 따라 특정 값을 구함