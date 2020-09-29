package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: dck reason: default package */
abstract class dck<E> extends AbstractList<E> implements ddu<E> {
    boolean a = true;

    dck() {
    }

    public boolean a() {
        return this.a;
    }

    public void add(int i, E e) {
        c();
        super.add(i, e);
    }

    public boolean add(E e) {
        c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    public final void b() {
        this.a = false;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        c();
        return super.set(i, e);
    }
}
