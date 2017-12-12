package action;

import Service.AddressImpl;
import bean.Addresslist;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public void setAddress(AddressImpl address) {
        this.address = address;
    }

    @Autowired
    private AddressImpl address;

    public String add(){
        Addresslist al = new Addresslist();
        al.setPhone(getPhone());
        al.setName(getName());
        address.add(al);
        return SUCCESS;
    }
}
