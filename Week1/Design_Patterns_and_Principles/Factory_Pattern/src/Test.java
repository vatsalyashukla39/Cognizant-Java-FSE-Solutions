public class Test {
    public static void main(String[] args) {
        DocumentFactory wordDocument=new WordDocumentFactory();
        Document wordDoc=wordDocument.createDocument();
        wordDoc.print();
        
        DocumentFactory pdfDocument=new PdfDocumentFactory();
        Document pdfDoc=pdfDocument.createDocument();
        pdfDoc.print();

        DocumentFactory ExcelDocument=new ExcelDocumentFactory();
        Document ExcelDoc=ExcelDocument.createDocument();
        ExcelDoc.print();
    }
}
