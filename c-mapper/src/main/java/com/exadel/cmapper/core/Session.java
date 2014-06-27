package com.exadel.cmapper.core;

import java.io.Serializable;

import com.exadel.cmapper.mapping.Statement;

/**
 * Session interface for basic select/upsert/delete methods.
 * 
 * @author Alexey A. Chumakov (alexey_ch@tut.by)
 * @since 1.0
 */
public interface Session {

    /**
     * Load object from C* by id.
     * 
     * @param clazz object
     * @param id object id
     * @return object or null if nothing found
     */
    public <T> T getById(Class<T> clazz, Serializable id);

    /**
     * Executes CQL query and allows to iterate over ResultSet. The result isn't
     * fetched to memory at once and uses CQL driver paging to fetch the data.
     * 
     * @param clazz object class to use
     * @param cql CQL statement to execute
     * @return statement to set query options/parameters and execute it
     */
    public <T> Statement<T> fetch(Class<T> clazz, String cql);

    /**
     * Executes named CQL query and allows to iterate over ResultSet. The result
     * isn't fetched to memory at once and uses CQL driver paging to fetch the
     * data.
     * 
     * @param queryName named CQL query
     * @return statement to set query options/parameters and execute it
     */
    public <T> Statement<T> fetchByNamedQuery(String queryName);

    /**
     * Inserts or update object. If more than one object passed, executes
     * statements as batch.
     * 
     * @param objects objects to persist
     */
    public void insertOrUpdate(Object... objects);

    /**
     * Persists only not null columns of object. If more than one object passed,
     * executes statements as batch. <br/>
     * Note: works slower than <code>insertOrUpdate()</code> since builds insert
     * statements on-the-fly. If you need to have more performance use custom
     * CQL query for this.
     * 
     * @param objects
     */
    public void modify(Object... objects);

    /**
     * Deletes object by id.
     * 
     * @param clazz object class to use
     * @param id object id to delete
     */
    public void deleteById(Class<?> clazz, Serializable id);

    /**
     * Deletes object by id. If more than one object passed, executes statements
     * as batch.
     * 
     * @param objects objects to delete.
     */
    public void delete(Object... objects);

    /**
     * Truncates table.
     * 
     * @param clazz object class to use
     */
    public void truncate(Class<?> clazz);

}
