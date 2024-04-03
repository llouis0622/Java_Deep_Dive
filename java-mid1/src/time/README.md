## 6. 날짜와 시간

### 1. 날짜와 시간 라이브러리가 필요한 이유
- 날짜와 시간 차이 계산
- 윤년 계산
- 일광 절약 시간(DST, Daylight Saving Time) 계산
- 타임존 계산
  - GMT, UTC : London/UTC/GMT : 세계 시간의 기준이 되는 00:00 시간대
  - GMT(그리치니 평균시, Greenwich Mean Time) : 영국 그리니치 천문대 기준
  - UTC(협정 세계시, Universal Time Coordinated) : 원자 시계를 사용하여 측정한 국제적으로 합의된 시간 체계
- 자바 날짜와 시간 라이브러리의 역사 : java.util.Date -> java.util.Calendar -> Joda-Time -> java.time

### 2. 자바 날짜와 시간 라이브러리 소개
- LocalDate : 날짜만 표현, 년, 월, 일
- LocalTime : 시간만 표현, 시, 분, 초
- LocalDateTime : `LocalDate` 와 `LocalTime` 을 합한 개념
- ZonedDateTime : 시간대를 고려한 날짜와 시간 표현, 타임존 포함
- OffsetDateTime : 시간대를 고려한 날짜와 시간 표현, 타임존 없음, 고정된 오프셋 포함
- Year, Month, YearMonth, MonthDay : 년, 월, 년월, 월일
- DayOfWeek : 요일
- Instant : 시간의 한 지점, 날짜와 시간을 나노초 정밀도로 표현
- Period : 두 날짜 사이의 간격을 년, 월, 일 단위로 표현
- Duration : 두 시간 사이의 간격을 시, 분, 초 단위로 표현

### 3. 기본 날짜와 시간 - LocalDateTime
- `now()` : 현재 시간을 기준으로 생성
- `of(...)` : 특정 날짜를 기준으로 생성
- `plusDays()` : 특정 일 합산
- `plusSeconds()` : 특정 초 합산
- `isBefore()` : 다른 날짜시간과 비교, 현재 날짜와 시간이 이전이면 true
- `isAfter()` : 다른 날짜시간과 비교, 현재 날짜와 시간이 이후라면 true
- `isEquals()` : 다른 날짜시간과 시간적으로 동일한지 비교, 같으면 true

### 4. 타임존 - ZonedDateTime
- `ZoneId.systemDefault()` : 시스템 기본 타임존
- `ZoneId.of()` : 타임존 직접 설정
- `withZoneSameInstant()` : 특정 타임존으로 변경
- ZonedDateTime vs OffsetDateTime
  - ZonedDateTime : 구체적인 지역 시간대, 일광 절약 시간 자동 처리, 사용자 지정 시간대에 따른 시간 계산 필요시 사용
  - OffsetDateTime : UTC와의 시간 차이, 지역 시간대 복잡성 미고려, 시간대 변환 없이 로그 기록, 데이터 저장 및 처리 시 적합

