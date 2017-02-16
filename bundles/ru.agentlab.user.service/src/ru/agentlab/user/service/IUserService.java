/**
 *
 */
package ru.agentlab.user.service;

import java.util.List;

import ru.agentlab.user.service.model.Group;
import ru.agentlab.user.service.model.StringRequest;
import ru.agentlab.user.service.model.User;
import ru.agentlab.user.service.model.UserGroupRequest;

/**
 *
 * IUserService.
 *
 * @author Ivanov_AM
 * @author Kiryakov_E
 */
public interface IUserService {

    /**
     *
     * Returns user with given login.
     * <br><b>
     * If there is no user with given login, returns <code>null</code>.
     * </b>
     *
     * @param login - user login. Can't be <code>null</code>.
     *
     * @return user with given login. Can return <code>null</code>.
     */
    User getUser(StringRequest login);

    /**
     *
     * Returns user groups.
     * <br><b>
     * If there is no user with given login, returns <code>null</code>.
     * </b>
     *
     * @param login - user login. Can't be <code>null</code>.
     *
     * @return user groups. Can return <code>null</code>.
     */
    List<Group> getUserGroups(StringRequest login);

    /**
     *
     * Adds user.
     *
     * @param user - user to add. Can't be <code>null</code>.
     */
    void addUser(User user);

    /**
     *
     * Removes user with given login.
     *
     * @param login - user login. Can't be <code>null</code>.
     */
    void removeUser(StringRequest login);

    /**
     *
     * Adds group to user with given login.
     *
     * @param request - request containing user login and group to add. Can't be <code>null</code>.
     */
    void addUserGroup(UserGroupRequest request);

    /**
     *
     * Removes group from user with given login.
     *
     * @param request - request containing user login and group to remove. Can't be <code>null</code>.
     */
    void removeUserGroup(UserGroupRequest request);
}
