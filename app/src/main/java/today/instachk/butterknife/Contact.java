package today.instachk.butterknife;

/**
 * Created by ravi on 05/10/17.
 */

public class Contact {
    String name;
    String mobile;

    public Contact(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
