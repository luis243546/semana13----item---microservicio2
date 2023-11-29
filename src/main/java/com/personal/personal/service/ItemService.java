package com.personal.personal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personal.personal.entity.Item;

@Service
public interface ItemService {
    public List<Item>finAll();

    public Item findById(Long id);
}
