package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fks reason: default package */
public final class fks<E> extends fjz<E> {
    private static final fks<Object> b;
    private final List<E> c;

    static {
        fks<Object> fks = new fks<>();
        b = fks;
        fks.a = false;
    }

    public static <E> fks<E> d() {
        return b;
    }

    fks() {
        this(new ArrayList(10));
    }

    private fks(List<E> list) {
        this.c = list;
    }

    public final void add(int i, E e) {
        c();
        this.c.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.c.get(i);
    }

    public final E remove(int i) {
        c();
        E remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        c();
        E e2 = this.c.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.c.size();
    }

    public final /* synthetic */ e c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new fks(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
