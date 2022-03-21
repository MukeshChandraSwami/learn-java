package java13.textblock;

public class StringCodeBlockHTML {

    public static void main(String[] args) {

        String htmlOldWay = "<html>" +
                "<body>" +
                "<H1>String Code Block HTML Example.</H1>" +
                "</body>" +
                "</html>";
        System.out.println("HTML before String Code Block Feature:-");
        System.out.println(htmlOldWay);

        String htmlNewWay = """
                <html>
                    <body>
                        <H1>String Code Block HTML Example.</H1>
                    </body>
                </html>
                """;
        System.out.println("\nHTML after String Code Block Feature:-");
        System.out.println(htmlNewWay);
    }
}
