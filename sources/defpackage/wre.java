package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: wre reason: default package */
final class wre extends AbstractList<Object> implements RandomAccess {
    private static final Recycler<wre> c = new Recycler<wre>() {
        public final /* synthetic */ Object a(b bVar) {
            return new wre(bVar, 0);
        }
    };
    Object[] a;
    boolean b;
    private final b<wre> d;
    private int e;

    private wre(b<wre> bVar) {
        this.a = new Object[16];
        this.d = bVar;
    }

    /* synthetic */ wre(b bVar, byte b2) {
        this(bVar);
    }

    static wre a() {
        return (wre) c.a();
    }

    private void a(int i) {
        if (i >= this.e) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void a(int i, Object obj) {
        this.a[i] = obj;
        this.b = true;
    }

    private void c() {
        Object[] objArr = this.a;
        int length = objArr.length << 1;
        if (length >= 0) {
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.a = objArr2;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final void add(int i, Object obj) {
        wxq.a(obj, "element");
        a(i);
        if (this.e == this.a.length) {
            c();
        }
        int i2 = this.e;
        if (i != i2 - 1) {
            Object[] objArr = this.a;
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        a(i, obj);
        this.e++;
    }

    public final boolean add(Object obj) {
        wxq.a(obj, "element");
        try {
            a(this.e, obj);
        } catch (IndexOutOfBoundsException unused) {
            c();
            a(this.e, obj);
        }
        this.e++;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        for (int i = 0; i < this.e; i++) {
            this.a[i] = null;
        }
        clear();
        this.b = false;
        this.d.a(this);
    }

    public final void clear() {
        this.e = 0;
    }

    public final Object get(int i) {
        a(i);
        return this.a[i];
    }

    public final Object remove(int i) {
        a(i);
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = (this.e - i) - 1;
        if (i2 > 0) {
            System.arraycopy(objArr, i + 1, objArr, i, i2);
        }
        Object[] objArr2 = this.a;
        int i3 = this.e - 1;
        this.e = i3;
        objArr2[i3] = null;
        return obj;
    }

    public final Object set(int i, Object obj) {
        wxq.a(obj, "element");
        a(i);
        Object obj2 = this.a[i];
        a(i, obj);
        return obj2;
    }

    public final int size() {
        return this.e;
    }
}
