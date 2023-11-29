package com.personal.personal.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.personal.personal.entity.Item;
import com.personal.personal.entity.Personal;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> finAll() {
        List<Personal> personales = Arrays
                .asList(clienteRest.getForObject("http://localhost:8005/lista", Personal[].class));
        return personales.stream().map(c -> new Item(c, 40)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id) {
        Personal empleado = clienteRest.getForObject("http://localhost:8005/lista/{id}", Personal.class, id);

        if (empleado != null) {
            return new Item(empleado, 40);
        } else {
            return null;
        }
        
    }

}
