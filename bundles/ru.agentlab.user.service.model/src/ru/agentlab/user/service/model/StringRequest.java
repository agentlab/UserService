/**
 *
 */
package ru.agentlab.user.service.model;

/**
 *
 * Instance of this class represents request containing string.
 *
 * @author Pirogov
 *
 */
public class StringRequest {

    private String value;

    /**
     * Default constructor.
     */
    public StringRequest() {
        value = "";
    }

    /**
     * @return the value. Can't return <code>null</code>.
     */
    public String getValue() {
        return value;
    }
}
