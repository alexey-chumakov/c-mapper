package com.exadel.cmapper.mapping;

/**
 * Basic interface for building CQL statements.
 * 
 * @author Alexey A. Chumakov (alexey_ch@tut.by)
 * @since 1.0
 */
public interface StatementBuilder {

    /**
     * Creates an insert statement for all fields in class.
     * 
     * @param clazz class to make a statement
     * @return statement
     */
    public Statement getInsertStatement(Class<?> clazz);

    /**
     * Creates basic select by id statement.
     * 
     * @param clazz class to make a statement
     * @return statement
     */
    public Statement getSelectByIdStatement(Class<?> clazz);

    /**
     * Creates custom select statement to fetch only columns mentioned in
     * columns property.
     * 
     * @param clazz class to make a statement
     * @param columns list of columns that should be fetched from C* with this
     *            statement
     * @return statement
     */
    public Statement getCustomSelectStatement(Class<?> clazz, String... columns);

    /**
     * Creates custom update statement to update only columns mentioned in
     * columns property.
     * 
     * @param clazz class to make a statement
     * @param columns list of columns that should be updated in C* with this
     *            statement
     * @return statement
     */
    public Statement getCustomUpdateStatement(Class<?> clazz, String... columns);

}
