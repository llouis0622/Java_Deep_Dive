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

### 5. 기계 중심의 시 - Instant
- Epoch Time : 1970년 1월 1일 00:00:00 UTC부터 현재까지 경과된 시간을 초 단위로 표현
- 시간대 독립성
- 고정된 기준점
- 사용자 친화적이지 않음
- 시간대 정보 부재

### 6. 기간, 시간의 간격 - Duration, Period
- Duration
  - 년, 월, 일
  - 날짜
  - `getYears()`, `getMonths()`, `getDays()`
- Period
  - 시, 분, 초
  - 시간
  - `toHours()`, `toMinutes()`, `toSeconds()`, `getNano()`

### 7. 날짜와 시간의 핵심 인터페이스
- TemporalAccessor : 날짜와 시간을 읽기 위한 기본 인터페이스, 특정 시점의 날짜와 시간 정보 읽기 최소한의 기능 제공
- Temporal : TemporalAccessor 하위 인터페이스, 날짜와 시간 조작 기능 제공
- TemporalAmount : 시간의 간격, 날짜와 시간 객체에 적용하여 객체 조정 가능
- TemporalUnit : 날짜와 시간을 측정하는 단위, java.time.temporal.ChronoUnit
- TemporalField : 날짜와 시간의 특정 부분을 나타냄, java.time.temporal.ChronoField
- ChronoUnit : 다양한 시간 단위 제공
  - NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS
  - DAYS, WEEKS, MONTHS, YEARS, DECADES, CENTURIES, MILLENNIA
  - ERAS, FOREVER
  - `between(Temporal, Temporal)` : 두 객체 사이 시간을 현재 단위로 측정하여 반환
  - `isDateBased()` : 날짜 기반 단위인지 여부 반환
  - `isTimeBased()` : 시간 기반 단위인지 여부 반환
  - `isSupported(Temporal)` : 주어진 객체가 현재 단위 지원하는지 여부 반환
  - `getDuration()` : 현재 기간을 Duration 객체로 반환
- ChronoField : 날짜와 시간의 특정 부분 나타냄
  - ERA, YEAR_OF_ERA, YEAR, EPOCH_DAY
  - MONTH_OF_YEAR, PROLEPTIC_MONTH
  - DAY_OF_WEEK, ALIGNED_DAY_OF_WEEK_IN_MONTH, ALIGNED_DAY_OF_WEEK_IN_YEAR, DAY_OF_MONTH, DAY_OF_YEAR, EPOCH_DAY
  - HOUR_OF_DAY, CLOCK_HOUR_OF_DAY, HOUR_OF_AMPM, CLOCK_HOUR_OF_AMPM, MINUTE_OF_HOUR, SECOND_OF_MINUTE, NANO_OF_SECOND, MICRO_OF_SECOND, MILLI_OF_SECOND
  - AMPM_OF_DAY, INSTANT_SECONDS, OFFSET_SECONDS
  - `getBaseUnit()` : 기본 단위 반환
  - `getRangeUnit()` : 범위 단위 반환
  - `isDateBased()` : 날짜 기반 단위인지 여부 반환
  - `isTimeBased()` : 시간 기반 단위인지 여부 반환
  - `range()` : 필드가 가질 수 있는 값의 유효 범위 반환

### 8. 날짜와 시간 조회하고 조작하기
- TemporalAdjuster : 날짜와 시간을 조작하는 인터페이스
  - `dayOfWeekInMonth()` : 주어진 요일이 몇 번째인지에 따라 날짜 조정
  - `firstDayOfMonth()` : 해당 월의 첫째 날로 조정
  - `firstDayOfNextMonth()` : 다음 달의 첫째 날로 조정
  - `firstDayOfNextYear()` : 다음 해의 첫째 날로 조정
  - `firstDayOfYear()` : 해당 해의 첫쨰 날로 조정
  - `firstInMonth()` : 주어진 요일 중 해당 월의 첫 번째 요일로 조정
  - `lastDayOfMonth()` : 해당 월의 마지막 날로 조정
  - `lastDayOfNextMonth()` : 다음 달의 마지막 날로 조정
  - `lastDayOfNextYear()` : 다음 해의 마지막 날로 조정
  - `lastDayOfYear()` : 해당 해의 마지막 날로 조정
  - `lastInMonth()` : 주어진 요일 중 해당 월의 마지막 요일로 조정
  - `next()` : 주어진 요일 이후의 가장 가까운 요일로 조정
  - `nextOrSame()` : 주어진 요일 이후의 가장 가까운 요일로 조정, 현재 날짜가 주어진 요일이면 현재 날짜 반환
  - `previous()` : 주어진 요일 이전의 가장 가까운 요일로 조정
  - `previousOrSame()` : 주어진 요일 이전의 가장 가까운 요일로 조정, 현재 날짜가 주어진 요일이면 현재 날짜 반환

### 9. 날짜와 시간 문자열 파싱과 포맷팅
- 포맷팅 : 날짜와 시간 데이터 -> 원하는 포맷 문자열로 변경
- 파싱 : 문자열을 날짜와 시간 데이터로 변경