package com.example.pos.pos;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin
@RequestMapping("/items")

public class ItemControllor {

    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public ItemModel createItem(@RequestBody ItemModel itemModel) {
        return itemService.createItemM(itemModel);
    }

    @GetMapping("/item/{id}")
    public ItemModel getItem(@PathVariable Integer id) {
        // return itemService.getItem(id);
        return itemService.findById(id);
    }

    @GetMapping("/allitems")
    public Iterable<ItemModel> getAllItems() {
        return itemService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable Integer id) {

        ItemModel im = itemService.findById(id);
        itemService.delete(im);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

}
