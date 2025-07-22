public class MovieTime {
    public static void main(String[] args) {
        String[] shows = {"13:30", "15:00", "17:45", "20:00"};
        String newShow = "16:00";
        
        String[] updatedShows = new String[shows.length + 1];
        boolean inserted = false;
        int i = 0, j = 0;

        while (i < shows.length) {
            if (!inserted && newShow.compareTo(shows[i]) < 0) {
                updatedShows[j++] = newShow;
                inserted = true;
            } else {
                updatedShows[j++] = shows[i++];
            }
        }
        if (!inserted) {
            updatedShows[j] = newShow;
        }

        System.out.println("Updated showtimes:");
        for (String time : updatedShows) {
            System.out.println(time);
        }
    }
}
