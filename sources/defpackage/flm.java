package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: flm reason: default package */
public final class flm<E> extends fkt<E> {
    private static final flm<Object> b;
    private final List<E> c;

    static {
        flm<Object> flm = new flm<>();
        b = flm;
        flm.a = false;
    }

    flm() {
        this(new ArrayList(10));
    }

    private flm(List<E> list) {
        this.c = list;
    }

    public static <E> flm<E> d() {
        return b;
    }

    public final void add(int i, E e) {
        c();
        this.c.add(i, e);
        this.modCount++;
    }

    public final /* synthetic */ e c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new flm(arrayList);
        }
        throw new IllegalArgumentException();
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
}
