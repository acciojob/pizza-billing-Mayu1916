package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extracheeseprise;
    private int extratoppinsprise;
    private int takeawayprise;

    private boolean exracheeseadded;
    private boolean extratoppinsadded;
    private boolean takeawayadded;

    private boolean isbillgenerate;

    public Pizza(Boolean isVeg){

        this.isVeg=isVeg;
        exracheeseadded=false;
        extratoppinsadded=false;
        takeawayadded=false;
        takeawayprise = 20;
        extracheeseprise=80;

        if(this.isVeg==true){
            this.price=300;
            extratoppinsprise=70;
        }else {
            this.price=400;
            extratoppinsprise=120;
        }
        // your code goes here
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(exracheeseadded==false){
            this.price=this.price+extracheeseprise;
            exracheeseadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extratoppinsadded==false){
            this.price=this.price+extratoppinsprise;
            extratoppinsadded=true;
        }

    }

    public void addTakeaway(){

        if(takeawayadded==false){
            this.price=this.price+takeawayprise;
            takeawayadded=true;
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        if(isbillgenerate==false){
            isbillgenerate=true;
            if(exracheeseadded==true){
                this.bill=this.bill+"Extra Cheese Added: "+extracheeseprise+"\n";
            }
            if(extratoppinsadded==true){
                this.bill=this.bill+"Extra Toppings Added: "+extratoppinsprise+"\n";
            }
            if(takeawayadded==true){
                this.bill=this.bill+"Paperbag Added: "+takeawayprise+"\n";
            }
            this.bill = this.bill+"Total Price: "+this.price+"\n";
        }
        return this.bill;

    }
}
