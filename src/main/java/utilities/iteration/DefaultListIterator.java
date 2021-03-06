package utilities.iteration;

import java.util.ListIterator;

public interface DefaultListIterator<A> extends ListIterator<A> {
    @Override
    default boolean hasNext() {
        throw new UnsupportedOperationException();
    }

    @Override
    default A next() {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean hasPrevious() {
        throw new UnsupportedOperationException();
    }

    @Override
    default A previous() {
        throw new UnsupportedOperationException();
    }

    @Override
    default int nextIndex() {
        throw new UnsupportedOperationException();
    }

    @Override
    default int previousIndex() {
        throw new UnsupportedOperationException();
    }

    @Override
    default void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    default void set(final A a) {
        throw new UnsupportedOperationException();
    }

    @Override
    default void add(final A a) {
        throw new UnsupportedOperationException();
    }
}
