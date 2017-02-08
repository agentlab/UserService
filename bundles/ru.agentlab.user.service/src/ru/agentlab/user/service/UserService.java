/**
 *
 */
package ru.agentlab.user.service;

import java.util.List;

import ru.agentlab.user.service.model.Group;
import ru.agentlab.user.service.model.User;

/**
 * @author Ivanov_AM
 *
 */
public interface UserService {

    User getUser(String login);

    List<Group> getUserGroups(String login);

    void addUser(User user);

    void removeUser(String login);

    void addUserGroup(String login, Group group);

    void removeUserGroup(String login, Group group);
}
