package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 12, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd 일");
        String formattedDate = date.format(formatter);

        System.out.println("날짜와 시간 포맷팅 : " + formattedDate);

        String input = "2030년 01월 01일";

        LocalDate parsedDate = LocalDate.parse(input, formatter);

        System.out.println("문자열 파싱 날짜와 시간 : " + parsedDate);
    }
}