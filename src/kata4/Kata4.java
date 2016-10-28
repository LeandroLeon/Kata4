package kata4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String file = "emailsfilev1.txt";
        ArrayList<String> mailList= MailListReader.read(file);
        Histogram<String> histo = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histo);
        histoDisplay.execute();
        
    }    
}
