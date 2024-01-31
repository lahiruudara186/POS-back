package com.example.pos.pos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
   @Autowired
   private ItemRepository itemRepository;

    public ItemModel createItemM(ItemModel itemModel){
            return itemRepository.save(itemModel);
    }

    public Iterable<ItemModel> getAll(){
        return itemRepository.findAll();
    }

    public ItemModel findById(Integer id){
        // return itemRepository.getById(id);
        // return itemRepository.getById(id);
        return itemRepository.findById(id).orElse(null);
    }

    public void delete(ItemModel itemModel){
        itemRepository.delete(itemModel);
    }
}
