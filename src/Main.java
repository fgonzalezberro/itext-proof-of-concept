import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, DocumentException {

        // Creating a Document type object
        Document document = new Document();

        // We assign a name to the document and, if necessary, specify a save path.
        String path = "PDF-demo-01.pdf";

        // We create an instance of that file
        PdfWriter.getInstance(document , Files.newOutputStream(Paths.get(path)));

        // We open the document to be able to manipulate it
        document.open();

        // We generate a content
        Phrase demoPhrase = new Phrase("Hello world :)");

        // We add the content to the document
        document.add(demoPhrase);

        // This method save the document after manipulate it
        document.close();

        System.out.println("The document has been created successfully :)");
    }
}