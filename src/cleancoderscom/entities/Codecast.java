package cleancoderscom.entities;

import java.util.Date;

public class Codecast extends Entity {
  private String title;
  private Date publicationDate = new Date();
  private String permalink;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  public String getTitle() {
    return title;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }

  public String getPermalink() {
    return permalink;
  }
}
