package com.example.pos.pos;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemModel,Integer>{
    // ItemModel getById(Integer id); 
}
