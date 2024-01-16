package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] mv = new MovieReview[2];

        MovieReview mv1 = new MovieReview();
        mv1.title = "인셉션";
        mv1.review = "인생은 무한 루프";
        mv[0] = mv1;

        MovieReview mv2 = new MovieReview();
        mv2.title = "어바웃 타임";
        mv2.review = "인생 시간 영화!";
        mv[1] = mv2;

        for (MovieReview i : mv) {
            System.out.println("영화 제목 : " + i.title + ", 리뷰 : " + i.review);
        }
    }
}