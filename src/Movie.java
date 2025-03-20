public class Movie {


    //namn och pris och längd på filmerna
        public String movieName;
        private int price = 150;
        protected int length;

//konstruktor som sätter namn och längd på filmerna
        public Movie(String movieName,int length){
            this.movieName = movieName;
            this.length = length;
        }
//returnerar pris på filmerna
    public int getPrice() {
        return price;
    }
}
