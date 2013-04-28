package oop.appengine.examples.showcase.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import oop.appengine.examples.showcase.entity.Role;

public interface RoleDao extends PagingAndSortingRepository<Role, Long> {

}
