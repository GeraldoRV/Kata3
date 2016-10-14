package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        new HistogramDisplay(histo).execute();
    }

}
