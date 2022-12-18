package com.example.admin.augscan;

public class Items {
    private String itemname;
    private String itemcategory;
    private String itemprice;



public Items() {

}

public Items(String itemname,String itemcategory,String itemprice){

    this.itemname=itemname;
    this.itemcategory=itemcategory;
    this.itemprice=itemprice;

}


    public String getItemname() {
        return itemname;
    }

    public String getItemcategory() {
        return itemcategory;
    }

    public String getItemprice() {
        return itemprice;
    }


}