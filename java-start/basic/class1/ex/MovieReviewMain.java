package basic.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "타이타닉";
        movieReview1.review = "감동적임";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "존윅";
        movieReview2.review = "소름돋는 액션씬";

//        System.out.println("제목: "+movieReview1.title+"\n내용: "+movieReview1.review);
//        System.out.println("제목: "+movieReview2.title+"\n내용: "+movieReview2.review);
//        기본 for문
        MovieReview[] reviews = {movieReview1,movieReview2};
        for (int i = 0; i < reviews.length; i++) {
            System.out.println("제목: "+ reviews[i].title+"\n내용: "+ reviews[i].review);
        }
//        향상된 for문
        for (MovieReview mv : reviews) {
            System.out.println("제목: "+mv.title+"\n내용: "+mv.review);
        }

    }
}
