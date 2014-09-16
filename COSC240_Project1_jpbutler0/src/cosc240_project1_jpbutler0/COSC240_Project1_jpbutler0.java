package cosc240_project1_jpbutler0;

/**
 *
 * @author Reaper
 */
public class COSC240_Project1_jpbutler0 {

    public static void main(String[] args) throws Exception {
        Song s1 = new Song();
        s1.setSong("Symphony No. 5", "Beethoven", "None", (float) 10.5, "Classical", 1808);

        Song s2 = new Song();
        s2.setSong("1812 Overture", "Tchaikovsky", "None", (float) 15.6, "Classical", 1880);
        Song s3 = new Song();
        s3.setSong("Gangnam Style", "Psy", "Gangnam Style Guy", (float) 3.39, "K-Pop", 2012);
        Song s4 = new Song();
        s4.setSong("Chocolate Rain", "Tay Zonday", "Tay Zonday", (float) 5, "Outsider", 2007);
        Song s5 = new Song();
        s5.setSong("Friday", "Big Industry", "Rebecca Black", (float) 3, "Pop", 2011);
        Song s6 = new Song();
        s6.setSong("I'm On A Boat", "The Lonely Island", "SNL", (float) 2.37, "Comedy hip-hop", 2009);
        Song s7 = new Song();
        s7.setSong("What is Love?", "Haddaway", "Roxbury Guys", (float) 4.29, "Eurodance", 1992);

        SongList s = new SongList();
        s.addSong(s1);
        s.addSong(s2);
        s.addSong(s3);
        s.addSong(s4);
        s.addSong(s5);
        s.addSong(s6);
        s.addSong(s7);

        if (s.getSize() != 7) {
            throw new Exception("Invalid SongList size. Expected 7 got " + s.getSize());
        }
        if (s.findSong("I'm On A Boat") != 5) {
            throw new Exception("Invalid findSong. Expected 5 got " + s.getSize());
        }
        if (s.findSong("Non-existant song") != -1) {
            throw new Exception("Invalid songs should throw -1.");
        }

        //Sorting
        s.sortbyWriter();
        if (s.findSong("Symphony No. 5") != 0 || s.findSong("Friday") != 1 || s.findSong("What is Love?") != 2 || s.findSong("Gangnam Style") != 3 || s.findSong("Chocolate Rain") != 4 || s.findSong("1812 Overture") != 5 || s.findSong("I'm On A Boat") != 6) {
            throw new Exception("Sort by writer invalid.");
        }

        s.sortByDuration();
        if (s.findSong("I'm On A Boat") != 0 || s.findSong("Friday") != 1 || s.findSong("Gangnam Style") != 2 || s.findSong("What is Love?") != 3 || s.findSong("Chocolate Rain") != 4 || s.findSong("Symphony No. 5") != 5 || s.findSong("1812 Overture") != 6) {
            throw new Exception("Sort by duration invalid");
        }

        s.sortByGenre();
        if (s.findSong("Symphony No. 5") != 0 || s.findSong("1812 Overture") != 1 || s.findSong("I'm On A Boat") != 2 || s.findSong("What is Love?") != 3 || s.findSong("Gangnam Style") != 4 || s.findSong("Chocolate Rain") != 5 || s.findSong("Friday") != 6) {
            throw new Exception("Sort by genre invalid");
        }

        s.sortByYear();
        if (s.findSong("Symphony No. 5") != 0 || s.findSong("1812 Overture") != 1 || s.findSong("What is Love?") != 2 || s.findSong("Chocolate Rain") != 3 || s.findSong("I'm On A Boat") != 4 || s.findSong("Friday") != 5 || s.findSong("Gangnam Style") != 6) {
            throw new Exception("Sort by year invalid");
        }

        System.out.println("Congrats! Everything seems to be in order. Make sure your toString() is sensible.");

        System.out.println("\nSongList:" + s.toString());

    }
}
