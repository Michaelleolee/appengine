package oop.appengine.examples.showcase.entity.users;


import oop.appengine.examples.showcase.entity.IdEntity;

/**
 * <p>
 * </p>
 * User: MichaelLee
 * Date: 13-1-15
 * Time: 下午2:58
 */
public class Billing extends IdEntity {
    private String address;
    private String city;
    private Integer zipCode;
    private Integer phoneNumber;
}
