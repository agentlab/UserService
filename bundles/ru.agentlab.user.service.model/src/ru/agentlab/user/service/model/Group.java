/**
 *
 */
package ru.agentlab.user.service.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Instance of this class represents group.
 *
 * @author Ivanov_AM
 * @author Kiryakov_E
 *
 */
public class Group {

    private static final String UNDEFINED_NAME = "Undefined";

    public String name;
    public List<User> users;

    /**
     * Default constructor
     */
    public Group() {
        name = UNDEFINED_NAME;
        users = new ArrayList<>();
    }

    /**
     * @return the users. Can't return <code>null</code>.
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set. Can't be <code>null</code>.
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * @return the name. Can't return <code>null</code>.
     */
    public String getName() {
        return name;
    }
}
