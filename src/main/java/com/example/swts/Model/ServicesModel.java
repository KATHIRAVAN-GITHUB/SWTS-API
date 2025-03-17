package com.example.swts.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ServicesModel")
public class ServicesModel {

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setProductimage(String productimage) {
    this.productimage = productimage;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setProducttitle(String producttitle) {
    this.producttitle = producttitle;
  }

  public String getProductimage() {
    return productimage;
  }

  public String getDescription() {
    return description;
  }

  public String getProducttitle() {
    return producttitle;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String producttitle;
  private String description;
  private String productimage;

}
