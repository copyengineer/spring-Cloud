package bean;

/**
 * @author xjb
 * @create 2021-05-14-20:52
 */
public class Payment {

    private int order_id;//订单id

    private int order_identifier;//订单编号

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_identifier() {
        return order_identifier;
    }

    public void setOrder_identifier(int order_identifier) {
        this.order_identifier = order_identifier;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "order_id=" + order_id +
                ", order_identifier=" + order_identifier +
                '}';
    }

    public Payment(int order_id, int order_identifier) {
        this.order_id = order_id;
        this.order_identifier = order_identifier;
    }

    public Payment() {
        super();
    }
}
