package com.s2p.service;

import com.s2p.dao.IProductDAO;
import com.s2p.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductDAO productrepository;

    @Override
    public List<Product> getAll() {
        return productrepository.findAll();
    }

    @Override
    public Product add(Product p) {
        return productrepository.save(p);
    }

    @Override
    public boolean delete(long id) {
        Product n = productrepository.findById(id).get();
        if (n != null) {
            productrepository.deleteById(id);
            return true;
        }
        return false;

    }

    @Override
    public Product update(long id, Product n) {
//        Product p1 = productrepository.findById(id).get();
//        if (n != null) {
//            if (n.getName() != null) {
//                p1.setName(n.getName());
//            }
//            if (n.getId() != null) {
//                p1.setId(n.getId());
//            }
//            if (n.getCreatedBy() != null) {
//                p1.setCreatedBy(n.getCreatedBy());
//            }
//            if (n.getCreatedOn() != null) {
//                p1.setCreatedOn(n.getCreatedOn());
//            }
//            if (n.getModifiedBy() != null) {
//                p1.setModifiedBy(n.getModifiedBy());
//            }
//            if (n.getModifiedOn() != null) {
//                p1.setModifiedOn(n.getModifiedOn());
//            }
//            if (n.getCategoryId() != null) {
//                p1.setCategoryId(n.getCategoryId());
//            }
//            if (n.getDescription() != null) {
//                p1.setDescription(n.getDescription());
//            }
//            if (n.getDisplayUnit() != null) {
//                p1.setDisplayUnit(n.getDisplayUnit());
//            }
//            if (n.getHsnCode() != null) {
//                p1.setHsnCode(n.getHsnCode());
//            }
//            if (n.getShortDescription() != null) {
//                p1.setShortDescription(n.getShortDescription());
//
//            }
//        }
//
//            return productrepository.save(p1);

        return null ;
    }

    @Override
    public Optional<Product> findById(long id) {
        return productrepository.findById(id);
    }

}