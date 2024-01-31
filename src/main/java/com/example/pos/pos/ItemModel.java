package com.example.pos.pos;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "items")
public class ItemModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "item_name")
    private String name;
   
    @Column(name = "unit_price")
    private Double price;
    
    @Column(name = "current_stock")
    private Double stock;
   
    @Column(name = "already_sold")
    private Double sold;
    
    @Column(name = "revenue")
    private Double revenue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Category category;

    
    // public Integer getId() {
    //     return id;
    // }
    // public String getName() {
    //     return name;
    // }
    // public Double getPrice() {
    //     return price;
    // }
    // public Double getStock() {
    //     return stock;
    // }
    // public Double getSold() {
    //     return sold;
    // }
    // public Double getRevenue() {
    //     return revenue;
    // }
    // public void setId(Integer id) {
    //     this.id = id;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public void setPrice(Double price) {
    //     this.price = price;
    // }
    // public void setStock(Double stock) {
    //     this.stock = stock;
    // }
    // public void setSold(Double sold) {
    //     this.sold = sold;
    // }
    // public void setRevenue(Double revenue) {
    //     this.revenue = revenue;
    // }


    // public ItemModel(Integer id, String name, Double price, Double stock, Double sold, Double revenue) {
    //     this.id = id;
    //     this.name = name;
    //     this.price = price;
    //     this.stock = stock;
    //     this.sold = sold;
    //     this.revenue = revenue;
    // }

    
    // public ItemModel() {
    // }
    // public Category getCategory() {
    //     return category;
    // }
    // public void setCategory(Category category) {
    //     this.category = category;
    // }
    // public ItemModel(Integer id, String name, Double price, Double stock, Double sold, Double revenue,
    //         Category category) {
    //     this.id = id;
    //     this.name = name;
    //     this.price = price;
    //     this.stock = stock;
    //     this.sold = sold;
    //     this.revenue = revenue;
    //     this.category = category;
    // } 
    
}
