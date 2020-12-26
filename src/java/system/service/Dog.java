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
//public class Dog {
//    public Dog(){
//        this(0,"",0,0,0,null);
//    }
//    public Dog (int itm_code, String itm_description, 
//                                     int qty, int min_qty, double cost,Category category){ 
//        this.item_code = itm_code;
//        this.item_description = itm_description;
//        this.qty_in_stock = qty;
//        this.min_required_stock = min_qty;
//        this.cost = cost;
//        this.category=category;
//    } 
//    public int getItemCode() {
//        return item_code;
//    }
//    public String getItemDescription() {
//        return item_description;
//    }
//    public double getCost(){ 
//        return cost;
//    } 
//    void setCost(double cost){
//        this.cost = cost;
//    }
//    public int getStock(){ 
//        return qty_in_stock;
//    } 
//    public int getMinQty() {
//        return min_required_stock;
//    }
//    public boolean isUnderStock(){ 
//        return qty_in_stock < min_required_stock;    
//    } 
//    public void addStock(int qty){ 
//        //increases the stock by given amount
//        qty_in_stock += qty;
//    }
//    public void withdrawStock(int qty) throws InSufficientStock { 
//        //decreases the stock by given amount
//        if ( qty <= qty_in_stock )
//            qty_in_stock -= qty;
//        else
//            throw new InSufficientStock("Error: Item withraw Isnsufficient balance - " + item_code);
//    } 
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//    @Override
//    public Dog clone() {
//        Dog item = null;
//        try {
//            item = (Dog) super.clone();
//        }
//        catch(CloneNotSupportedException e) {}
//        return item;
//    }
//    
//    //Field Declarations
//    private int item_code; 
//    private String item_description;
//    private int qty_in_stock;
//    private int min_required_stock;
//    private double cost;
//    private Category category;
//}
//
//class InSufficientStock extends java.lang.Exception{
//    public InSufficientStock() {
//        super("Error: Insufficient Stock");
//    }
//    public InSufficientStock(String message) {
//        super(message);
//    }    
//}