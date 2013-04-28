package oop.appengine.examples.quickstart.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import oop.appengine.examples.quickstart.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
