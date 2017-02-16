/**
 *
 */
package ru.agentlab.user.service.model;

/**
 *
 * Instance of this class represents container containing user login and group to add/remove
 *
 * @author Pirogov
 *
 */
public class UserGroupRequest {

    private String login;
    private Group group;

    /**
     * Default constructor.
     */
    public UserGroupRequest() {
        login = "";
        group = new Group();
    }

    /**
     * return the login. Can't return <code>null</code>.
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the group. Can't return <code>null</code>.
     */
    public Group getGroup() {
        return group;
    }

}
