///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package system.service;
//
///**
// *
// * @author user
// */
//public class DogTO {
//    public DogTO(){
//        item=new Dog();
//    }
//    public DogTO (int code, String desc, 
//                                     int qty, int min_qty, double cost,Category category){ 
//        item=new Dog(code,desc,qty,min_qty,cost,category);
//    }
//    public int getItemCode() {
//        return item.getItemCode();
//    }
//    public String getItemDescription() {
//        return item.getItemDescription();
//    }
//    public double getCost(){ 
//        return item.getCost();
//    } 
//    void setCost(double cost){
//        item.setCost( cost );
//    }
//    public int getStock(){ 
//        return item.getStock();
//    } 
//    public int getMinQty() {
//        return item.getMinQty();
//    }
//    public boolean isUnderStock(){ 
//        return item.getStock() < item.getMinQty();    
//    } 
//    public void addStock(int qty){ 
//        //increases the stock by given amount
//        item.addStock(qty);
//    }
//    public void withdrawStock(int qty) throws InSufficientStock { 
//        item.withdrawStock(qty);
//    } 
//     public Category getCategory() {
//        return item.getCategory();
//    }
//
//    public void setCategory(Category category) {
//        item.setCategory(category);
//    }
//    @Override
//    public DogTO clone() {
//        DogTO item = null;
//        try {
//            item = (DogTO) super.clone();
//        }
//        catch(CloneNotSupportedException e) {}
//        return item;
//    }
//    void setItem(Dog it) {
//    	item = it;
//    }
//    
//    Dog getItem() {
//    	return item.clone();
//    }
//    //Field Declarations
//    private Dog item;
//}
