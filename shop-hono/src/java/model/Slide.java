package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class Slide {

    private int silde_id;
    private String title;
    private String image;
    private String backlink;
    private String description;

    public Slide() {
    }

    public Slide(int silde_id, String title, String image, String backlink, String description) {
        this.silde_id = silde_id;
        this.title = title;
        this.image = image;
        this.backlink = backlink;
        this.description = description;
    }

    public Slide(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public Slide(String title, String image, String description, String backlink) {
        this.title = title;
        this.image = image;
        this.description = description;
        this.backlink = backlink;

    }

    public int getSilde_id() {
        return silde_id;
    }

    public void setSilde_id(int silde_id) {
        this.silde_id = silde_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBacklink() {
        return backlink;
    }

    public void setBacklink(String backlink) {
        this.backlink = backlink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}


