package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: eok reason: default package */
public final class eok<E> extends elq<E> {
    private static final eok<Object> b;
    private final List<E> c;

    public static <E> eok<E> d() {
        return b;
    }

    eok() {
        this(new ArrayList(10));
    }

    private eok(List<E> list) {
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

    public final /* synthetic */ enc a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new eok(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        eok<Object> eok = new eok<>();
        b = eok;
        eok.a = false;
    }
}
