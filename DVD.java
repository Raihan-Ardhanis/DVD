package TOKO;
/**
 * DVD
 */
public class DVD {

    private int length;
    private String rating;
    private String studio;

    public DVD() {
        length = 300;
        rating = "PG";
        studio = "NewLine Chelsea";

    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print() {
        System.out.println("Lenght\t: "+length);
        System.out.println("Rating\t: "+rating);
        System.out.println("Studio\t: "+studio);
    }

}


    
