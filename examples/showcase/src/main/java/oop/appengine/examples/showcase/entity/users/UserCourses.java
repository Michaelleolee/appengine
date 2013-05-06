package oop.appengine.examples.showcase.entity.users;

import oop.appengine.examples.showcase.entity.IdEntity;

/**
 * <p>
 * </p>
 * User: MichaelLee
 * Date: 13-1-15
 * Time: 下午3:27
 */
public class UserCourses extends IdEntity {
    private Long userId;
    private Long coursesId;
    /**
     * 类别名称
     */
    private String categoryName;
}
