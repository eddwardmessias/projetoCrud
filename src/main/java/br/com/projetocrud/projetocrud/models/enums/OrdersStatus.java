package br.com.projetocrud.projetocrud.models.enums;

public enum OrdersStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrdersStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrdersStatus valueOf(int code) throws IllegalAccessException {
        for (OrdersStatus value: OrdersStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }

        throw new IllegalAccessException(("Invalid OrderSatus code"));
    }


}
