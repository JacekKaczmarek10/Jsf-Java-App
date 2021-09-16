package pl.btc.jsfjava;


import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name = "product")
@RequestScoped
public class DataTable {

    @Resource
    private DataSource dataSource;

    FacesContext context = FacesContext.getCurrentInstance();

    public static List<Product> productsList = new ArrayList<>();
    public Product product;
    public  String objectId = context.getExternalContext()
            .getRequestParameterMap().get("objectId");

    // SESSION SCOPED
    //Session Scope -- when the scope is session,the
    //values of form bean(form data) would be available
    // throughout the session. it will not destroyed until session timeout up or session destroyed.


    // REQUEST SCOPED
    //Request Scope -- when the scope is request
    // ,the values of form bean(form data) would be
    // available for the current request. it will refresh on every request of same user/different user.


    public List<Product> getProductList() {
        System.out.println("LIST");
        productsList.add(new Product(1,"HP Laptop",25000f,5,new Date()));
        productsList.add(new Product(2,"Dell Laptop",30000f,5,new Date()));
        productsList.add(new Product(3,"Lenevo Laptop",28000f,5,new Date()));
        productsList.add(new Product(4,"Sony Laptop",28000f,5,new Date()));
        productsList.add(new Product(5,"Apple Laptop",90000f,5,new Date()));
        return productsList;
    }

    public Product getProduct() {
        FacesContext context = FacesContext.getCurrentInstance();
        String objectId = context.getExternalContext()
                .getRequestParameterMap().get("objectId");
        Product product = productsList.get(Integer.valueOf(objectId)-1);
        return product;
    }

}