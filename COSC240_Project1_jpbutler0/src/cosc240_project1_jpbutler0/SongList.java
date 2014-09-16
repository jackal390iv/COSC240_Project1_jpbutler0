package cosc240_project1_jpbutler0;

/**
 *
 * @author Reaper
 */
public class SongList {

    static final int MAX = 7;
    private Song[] songList = new Song[MAX];
    int size = 0;

    public SongList() {

    }

    public boolean addSong(Song s) {
        int n = size;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (songList[i] == songList[j]) {
                    return false;
                }
            }
        }
        songList[size] = s;
        size++;
        return true;
    }

    public int findSong(String title) {
        title.toLowerCase();
        for (int i = 0; i < size; i++) {
            if (songList[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;

    }

    public void swapSong(int positionOfFirstSong, int positionOfSecondSong) {

        Song temp = songList[positionOfFirstSong];
        songList[positionOfFirstSong] = songList[positionOfSecondSong];
        songList[positionOfSecondSong] = temp;

    }

    public void sortbyWriter() {
        int n = size;
        Song temp;

        for (int i = 0; i < n; i++) //i represents the first element [0] in the array at the start of the loop    
        {
            for (int j = 1; j < (n - i); j++) //so j represents the next element in the array after i
            {
                if ((songList[j - 1].getWriter().toLowerCase())
                        .compareTo(
                                (songList[j].getWriter().toLowerCase())) > 0) //saying that if the element Year in i is grater than the element in j...
                {
                    temp = songList[j - 1];
                    //temp = element value in i	
                    songList[j - 1] = songList[j];
                    //value of j replaces value of i
                    songList[j] = temp;
                    //temp replaces value in j 
                }
            }
        }
    }

    public void sortByDuration() {
        int n = size;
        Song temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (songList[j - 1].getDuration() > songList[j].getDuration()) {
                    temp = songList[j - 1];
                    songList[j - 1] = songList[j];
                    songList[j] = temp;
                }
            }
        }
    }

    public void sortByGenre() {
        int n = size;
        Song temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if ((songList[j - 1].getGenre().compareToIgnoreCase(songList[j].getGenre().toLowerCase())) > 0) {
                    temp = songList[j - 1];
                    songList[j - 1] = songList[j];
                    songList[j] = temp;
                }
            }
        }
    }

    public void sortByYear() {
        int n = size;
        Song temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (songList[j - 1].getYear() > songList[j].getYear()) //[j-1] is [i] correct? then why doesn't [i] work in place of [j-1]?    				 
                {
                    temp = songList[j - 1];
                    songList[j - 1] = songList[j];
                    songList[j] = temp;
                }
            }
        }
    }

    public String toString() {
        String temp = "";					// empty variable "temp" created 

        for (int i = 0; i < size; i++) {
            temp += songList[i] + " \n";  // this loop adds all Songs and their info to temp
        }

        return "songList: \n" + temp + " size: " + size + " MAX: " + MAX + "\n";
    }

    public int getSize() {
        return size;
    }
}
