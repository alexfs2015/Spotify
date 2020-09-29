package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: den reason: default package */
final class den<E> extends dbt<E> {
    private static final den<Object> b;
    private final List<E> c;

    den() {
        this(new ArrayList(10));
    }

    private den(List<E> list) {
        this.c = list;
    }

    public static <E> den<E> d() {
        return b;
    }

    public final /* synthetic */ ddd a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new den(arrayList);
        }
        throw new IllegalArgumentException();
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

    static {
        den<Object> den = new den<>();
        b = den;
        den.a = false;
    }
}
