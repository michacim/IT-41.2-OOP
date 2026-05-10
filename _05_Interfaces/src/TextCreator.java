public class TextCreator implements DocumentCreator{
    @Override
    public void create() {
        System.out.println("Hallo Text");
    }

    @Override
    public void info(String text) {
        System.out.println("Einfacher Text:"+text);
    }
}
