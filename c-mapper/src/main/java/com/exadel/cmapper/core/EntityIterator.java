package com.exadel.cmapper.core;

import java.util.Iterator;
import java.util.List;

public interface EntityIterator<E> extends Iterator<E> {

    public List<E> toMemory();
    
    public EntityIterator<E> filter();
    
}
