package com.exadel.cmapper.mapping;

import com.exadel.cmapper.core.EntityIterator;

/**
 * Basic interface for CQL statements.
 * 
 * @author Alexey A. Chumakov (alexey_ch@tut.by)
 * @since 1.0
 */
public interface Statement<T> {

    /**
     * CQL statement string.
     * 
     * @return CQL statement
     */
    public String getCQL();

    /**
     * Array of arguments required for this statement.
     * 
     * @return arguments required for this statement.
     */
    public String[] getRequiredArguments();

    /**
     * Set query parameter by name.
     * 
     * @param name parameter name
     * @param value value
     * @return
     */
    public void setParameter(String name, Object value);

    /**
     * Set query parameters by order.
     * 
     * @param values array of query parameters.
     */
    public void withParameters(Object... values);

    /**
     * Set query options for statement.
     * 
     * @param queryOptions query options to use with statement
     */
    public void withQueryOptions(QueryOptions queryOptions);

    /**
     * Executes statement and returns single result.
     * 
     * @return single result or null
     */
    public T getSingleResult();

    /**
     * Executes statement.
     * 
     * @return iterator with 0 or more elements
     */
    public EntityIterator<T> execute();

}
