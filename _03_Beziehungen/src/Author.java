public class Author {
    private String name;
    private String info;

    public Author(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
