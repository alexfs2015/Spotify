package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dfe reason: default package */
final class dfe<E> extends dck<E> {
    private static final dfe<Object> b;
    private final List<E> c;

    static {
        dfe<Object> dfe = new dfe<>();
        b = dfe;
        dfe.a = false;
    }

    dfe() {
        this(new ArrayList(10));
    }

    private dfe(List<E> list) {
        this.c = list;
    }

    public static <E> dfe<E> d() {
        return b;
    }

    public final /* synthetic */ ddu a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new dfe(arrayList);
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
}
