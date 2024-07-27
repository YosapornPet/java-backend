package com.example.backend.businesslogic;

import com.example.backend.exception.BaseException;
import com.example.backend.exception.ProductException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProductBusiness {
    public String GetProductById(String id) throws BaseException {
        if(Objects.equals("1234",id)){
            throw ProductException.notFound();
        }
        return id;
    }
}
