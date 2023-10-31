package com.s2p.service;

import com.s2p.dao.ICategories;
import com.s2p.model.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements ICategoriesService{
    @Autowired
    ICategories categoriesRepository ;
    @Override
    public List<Categories> getAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories add(Categories c) {
        return categoriesRepository.save(c);
    }

    @Override
    public boolean delete(long id) {
        Categories n = categoriesRepository.findById(id).get();
        if (n != null){
            categoriesRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Categories update(long id, Categories n) {
        Categories n1 = categoriesRepository.findById(id).get();
         if(n != null){
             if(n.getCreatedBy() != null){
                 n1.setCreatedBy(n.getCreatedBy());
             }
             if(n.getModifiedOn() != null){ n1.setModifiedOn(n.getModifiedOn());}
             if(n.getName() != null){n1.setName(n.getName());}
             if(n.getCreatedOn() != null){ n1.setCreatedOn(n.getCreatedOn());}
             if(n.getCreatedBy() != null){n1.setCreatedBy(n.getCreatedBy());}
            if (n.getModifiedBy() != null){n1.setModifiedBy(n.getModifiedBy());}
            if (n.getModifiedOn() != null){n1.setModifiedOn(n.getModifiedOn());}
            if (n.getParentId() != null){n1.setParentId(n.getParentId());}
//            if (n.setSlug() != null){n1.setSlug(n.getSlug());}





         }
        return categoriesRepository.save(n1);
    }


}
