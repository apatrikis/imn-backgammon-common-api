/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.generic;

/**
 * A {@link Visitor} is providing a {@code callback} hook: a instance of
 * this class can be passed in a method's signature.
 *
 * @param <T> the type of the callback parameter, see {@link #visit(Object)}
 * 
 * @author Anastasios Patrikis
 */
public interface Visitor<T> {
    /**
     * The {@code callback} method provided by this interface.
     * 
     * @param t the value provided to the visitor.
     * @return {@code true} if the algorithm should visit more results,
     * {@code false} if it should terminate now.
     */
    public boolean visit(T t);
}