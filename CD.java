package TOKO;
/**
 * CD
 */
//Interitance (pewarisan)
 public class CD extends Product {
    private String artist;
    private int numSong;
    private String label;

    public CD () {
        super(); //Constructor dari superclass
        artist = "Lady Gaga";
        numSong = 10;
        label = "Sony Music";
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String get() {
		return this.label;
	}

    public void setLabel(String label) {
		this.label = label;
	}


    //override
    public void print() {
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("TOTAL SONG: " + numSong);
        System.out.println("Label: " + label);

    }


    
}