package uz.dars.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Tutroial")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;

    @Column(name = "dicription")
    private String dicription;


    @Column(name = "published")
    private boolean published;

    public Tutorial(String title, String dicription, boolean b) {
    }

    public Tutorial(Long id, String title, String dicription, boolean published) {
        this.id = id;
        this.title = title;
        this.dicription = dicription;
        this.published = published;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDicription() {
        return dicription;
    }

    public void setDicription(String dicription) {
        this.dicription = dicription;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dicription='" + dicription + '\'' +
                ", published=" + published +
                '}';
    }


}
