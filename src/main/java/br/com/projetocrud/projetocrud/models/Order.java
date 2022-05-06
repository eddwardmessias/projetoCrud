package br.com.projetocrud.projetocrud.models;

import br.com.projetocrud.projetocrud.models.enums.OrdersStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime moment;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private User client;

    private Integer ordersStatus;

    public Order() {
    }

    public Order(Long id, LocalDateTime moment, User client, OrdersStatus ordersStatus) {
        this.id = id;
        this.moment = moment;
        this.client = client;
        setOrdersStatus(ordersStatus);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public OrdersStatus getOrdersStatus() throws IllegalAccessException {
        return OrdersStatus.valueOf(ordersStatus);
    }

    public void setOrdersStatus(OrdersStatus ordersStatus) {
        this.ordersStatus = ordersStatus.getCode();
    }
}
