package pl.btc.jsfjava;

import javax.faces.bean.ManagedBean;
import java.util.Date;

public class Product {
    private  int id;
    public String name;
    private final float price;
    private final int quantity;
    private final Date productionDate;


    public Product(int id, String name, float price,int quantity,Date productionDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productionDate = productionDate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getProductionDate() {
        return productionDate;
    }


    public String add(){
        System.out.println("PRODUCT INSERETED");
        System.out.println(name + price + quantity + productionDate);
        System.out.println(name.length());
        if(quantity>10){
            return "fail";
        }
        return "sucess";
    }
}