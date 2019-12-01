package blog_management.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String image;
    private double rate;

    @Override
    public String toString() {
        return String.format("Blog [id=%d,title=%s,content=%s,rate=%f]",id,title,content,rate);
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Blog(String title, String content, String image, double rate) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.rate = rate;
    }

    public Blog() {
    }
}
