package com.exadel.cmapper.core;

/**
 * SessionFactory basis interface to provide session object.
 * 
 * @author Alexey A. Chumakov (alexey_ch@tut.by)
 * @since 1.0
 */
public interface SessionFactory {

    public Session getSession();

}
