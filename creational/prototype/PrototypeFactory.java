package com.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory
{
    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }
    private static Map<String , Prototype> prototypes = new HashMap<String , Prototype>();
 
    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }
 
    public static Prototype getInstance(final String s) throws CloneNotSupportedException {
        return ((Prototype) prototypes.get(s)).clone();
    }
}