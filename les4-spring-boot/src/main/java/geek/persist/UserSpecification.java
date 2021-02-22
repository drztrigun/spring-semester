package geek.persist;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

public final class UserSpecification {

    public static Specification<User> nameLike(String name){
        return ((root, query, cb) -> cb.like(root.get("username"), "%" + name + "%"));
    }

    public static Specification<User> minAge(Integer minAge){
        return ((root, query, cb) -> cb.ge(root.get("age"), minAge));
    }

    public static Specification<User> maxAge(Integer maxAge){
        return ((root, query, cb) -> cb.le(root.get("age"), maxAge));
    }

    public static Specification<User> sort(Sort sort){
        return sort(Sort.by("id"));
    }
}
