public class HtmlCreator implements DocumentCreator{
    @Override
    public void create() {
        System.out.println("""
                <html>
                    <head>
                    </head>
                    <body>
                        <h1> Hallo HTML</h1>
                    </body>
                
                </html>
                """);
    }

    @Override
    public void info(String text) {
        System.out.println("Einfaches HTML-Template:" +text);

    }
}
