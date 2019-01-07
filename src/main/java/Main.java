import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String keyword = "laptop";
        //String url = "http://www.sears.com/"+"search=laptop?catalogId=12605&storeId=10153&levels=Computers_Laptops_All+Laptops&autoRedirect=true&viewItems=50&redirectType=CAT_REC_PRED";
        String url = "http://www.sears.com/search=canon%20powershot?catalogId=12605&storeId=10153&levels=Cameras+%26+Camcorders_Digital+Cameras_Digital+Point+%26+Shoot+Cameras&autoRedirect=true&viewItems=50&redirectType=CAT_REC_PRED&prop17=canon%20powershot";

        Document doc = Jsoup.connect(url).followRedirects(true).get();
        String s = doc.toString();
        int index = s.indexOf("productCount = ");
        index = index + 16;
        //Elements scripts = doc.select("script");
        //Elements test = doc.getElementsMatchingText("productCount");


        //	System.out.println(doc);


        System.out.println(s.substring(index - 20, index + 20));

//	    final WebClient webClient = new WebClient();
//	    final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
//	    Assert.assertEquals("HtmlUnit - Welcome to HtmlUnit", page.getTitleText());
//
//	    final String pageAsXml = page.asXml();
//	    Assert.assertTrue(pageAsXml.contains("<body class=\"composite\">"));
//
//	    final String pageAsText = page.asText();
//	    Assert.assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
//
//	    webClient.closeAllWindows();

    }

}
