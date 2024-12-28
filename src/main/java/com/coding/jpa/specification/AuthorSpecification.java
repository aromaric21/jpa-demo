package com.coding.jpa.specification;

import com.coding.jpa.models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {

    public static Specification<Author> hasAge(int age){
        return (
                Root <Author> root,
                CriteriaQuery<?> query,
                CriteriaBuilder builder
                ) -> {
            if (age < 0){
                return null;
            }
            return builder.equal(root.get("age"), age);
        };
    }

    public Specification<Author> firstnameContains(String firstname) {
        return (
                Root <Author> root,
                CriteriaQuery<?> query,
                CriteriaBuilder builder
        ) -> {
            if (firstname == null){
                return null;
            }
            //return builder.equal(root.get("firstname"), firstname);
            return builder.like(root.get("firstname"), "%" + firstname + "%");
        };
    }
}
