package CAT;


import javax.lang.model.util.Elements;
import org.jsoup.Jsoup;

// import javax.print.DocPrintJob;
// import javax.swing.text.Document;

// import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

/**
 * Cat_Scraping
 */
public class Cat_Scraping {

    public static void main(String[] args) {
        final String url = "https://en.wikipedia.org/wiki/Cat";

        try {
            
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            System.out.println("Title: "+title);
            System.out.println("----------------------");
            System.out.println("Doc: "+doc);

            Elements Paragraph = (Elements) doc.getElementsByTag("p");

            for(Elements E: Paragraph){
                System.out.println(E);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}