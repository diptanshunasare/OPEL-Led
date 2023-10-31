package com.s2p.model;


import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public long id ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product ;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user ;




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id")
//    private Address address;
//}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", product=" + product +
                ", user=" + user +
                '}';
    }
}
