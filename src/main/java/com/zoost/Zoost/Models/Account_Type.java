package com.zoost.Zoost.Models;

import javax.persistence.*;

@Entity
@Table(name = "Account_Type")
public class Account_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_status_id")
    private int account_status_id;

    @Column(name = "account_type")
    private String type;

    public int getAccount_status_id() {
        return account_status_id;
    }

    public void setAccount_status_id(int account_status_id) {
        this.account_status_id = account_status_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
