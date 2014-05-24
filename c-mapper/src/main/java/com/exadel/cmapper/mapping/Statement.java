package com.exadel.cmapper.mapping;

/**
 * Basic interface for CQL statements.
 * 
 * @author Alexey A. Chumakov (alexey_ch@tut.by)
 * @since 1.0
 */
public interface Statement {

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

}
