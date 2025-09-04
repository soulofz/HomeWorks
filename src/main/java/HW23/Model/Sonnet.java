package HW23.Model;

import java.util.List;

public class Sonnet {
    private String type;
    private Author author;
    private String title;
    private List<String> lines;

    public Sonnet(String type, Author author, String title, List<String> lines) {
        this.type = type;
        this.author = author;
        this.title = title;
        this.lines = lines;
    }

    public Sonnet(){
        this.type = "";
        this.author = null;
        this.title = "";
        this.lines = null;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "type='" + type + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", lines=" + lines +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }
}
