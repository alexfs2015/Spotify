package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

abstract class ImmutableAsList<E> extends ImmutableList<E> {

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableCollection<?> collection;

        SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.collection = immutableCollection;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.collection.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract ImmutableCollection<E> b();

    ImmutableAsList() {
    }

    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    public int size() {
        return b().size();
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return b().c();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(b());
    }
}
