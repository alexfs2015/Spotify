package defpackage;

import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: fcq reason: default package */
public abstract class fcq<E> extends fcw implements Collection<E> {
    protected fcq() {
    }

    /* access modifiers changed from: protected */
    public boolean a(Collection<? extends E> collection) {
        return Iterators.a((Collection<T>) this, collection.iterator());
    }

    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Collection<E> delegate();

    /* access modifiers changed from: protected */
    public boolean b(Collection<?> collection) {
        return Iterators.a(iterator(), collection);
    }

    /* access modifiers changed from: protected */
    public boolean c(Collection<?> collection) {
        Iterator it = iterator();
        fbp.a(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    /* access modifiers changed from: protected */
    public String l() {
        StringBuilder a = fcm.a(size());
        a.append('[');
        boolean z = true;
        for (Object next : this) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            if (next == this) {
                a.append("(this Collection)");
            } else {
                a.append(next);
            }
        }
        a.append(']');
        return a.toString();
    }

    /* access modifiers changed from: protected */
    public final Object[] n() {
        return toArray(new Object[size()]);
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public int size() {
        return delegate().size();
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return delegate().toArray(tArr);
    }
}
