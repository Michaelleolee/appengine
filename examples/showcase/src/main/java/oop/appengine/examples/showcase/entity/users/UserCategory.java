package oop.appengine.examples.showcase.entity.users;

import oop.appengine.examples.showcase.entity.IdEntity;
import oop.appengine.examples.showcase.entity.courses.Category;

/**
 * <p></p>
 * User: MichaelLee
 * Date: 13-1-17
 * Time: 下午12:49
 */
public class UserCategory extends IdEntity {

    private Long userId;
    private Users users;
    private Long categoryId;
    private Category category;
}
