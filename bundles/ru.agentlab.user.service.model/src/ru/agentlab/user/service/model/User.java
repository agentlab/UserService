package ru.agentlab.user.service.model;

/**
 *
 * Instance of this class represents user. User has name, login and email.
 *
 * @author Ivanov_AM
 * @author Kiryakov_E
 */
public class User {

    private static final String UNDEFINED = "Undefined";

    public String name;
    public String login;
    public String email;

    /**
     * Default constructor
     */
    public User() {
        name = UNDEFINED;
        login = UNDEFINED;
        email = UNDEFINED;
    }

    /**
     * @return the name. Can't return <code>null</code>.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the login. Can't return <code>null</code>.
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the email. Can't return <code>null</code>.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param name the name to set. Can't be <code>null</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param email the email to set. Can't be <code>null</code>.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return 37 * 17 + login.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
        {
            return false;
        }
        if (object == this)
        {
            return true;
        }

        return (object instanceof User) && (this.getLogin().equals(((User)object).getLogin()));
    }
}
