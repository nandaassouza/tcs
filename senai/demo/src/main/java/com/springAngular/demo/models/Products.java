package com.springAngular.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")

public class Products {

    @Id
    String id;
    String prodName;
    String prodDescr;
    Double prodPrice;
    String prodImage;

    public Products(){
    }

    public Products(String id, String name, String descr, Double price, String image){
        this.id = id;
        this.prodName = name;
        this.prodDescr = descr;
        this.prodPrice = price;
        this.prodImage = image;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getProdName(){
        return prodName;
    }

    public void setProdName(String prodName){
        this.prodName = prodName;
    }

    public String getProdDescr(){
        return prodDescr;
    }

    public void setProdDescr(String prodDescr){
        this.prodDescr = prodDescr;
    }

    public Double getProdPrice(){
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice){
        this.prodPrice = prodPrice;
    }

    public String getprodImage(){
        return prodImage;
    }

    public void setProdImage(String prodImage){
        this.prodImage = prodImage;
    }


}
