package defpackage;

/* renamed from: ds reason: default package */
public final class ds<E> implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public ds() {
        this(10);
    }

    public ds(int i) {
        this.b = false;
        if (i == 0) {
            this.c = dr.b;
            this.d = dr.c;
            return;
        }
        int b2 = dr.b(i);
        this.c = new long[b2];
        this.d = new Object[b2];
    }

    /* renamed from: a */
    public final ds<E> clone() {
        try {
            ds<E> dsVar = (ds) super.clone();
            dsVar.c = (long[]) this.c.clone();
            dsVar.d = (Object[]) this.d.clone();
            return dsVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final E a(long j, E e2) {
        int a2 = dr.a(this.c, this.e, j);
        if (a2 >= 0) {
            E[] eArr = this.d;
            if (eArr[a2] != a) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public final void a(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    private void d() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void b(long j, E e2) {
        int a2 = dr.a(this.c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = e2;
            return;
        }
        int i = a2 ^ -1;
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == a) {
                this.c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.b && this.e >= this.c.length) {
            d();
            i = dr.a(this.c, this.e, j) ^ -1;
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int b2 = dr.b(i2 + 1);
            long[] jArr = new long[b2];
            Object[] objArr2 = new Object[b2];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e2;
        this.e++;
    }

    public final int b() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final long b(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final E c(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public final int a(long j) {
        if (this.b) {
            d();
        }
        return dr.a(this.c, this.e, j);
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final void c(long j, E e2) {
        int i = this.e;
        if (i == 0 || j > this.c[i - 1]) {
            if (this.b && this.e >= this.c.length) {
                d();
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int b2 = dr.b(i2 + 1);
                long[] jArr = new long[b2];
                Object[] objArr = new Object[b2];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            this.c[i2] = j;
            this.d[i2] = e2;
            this.e = i2 + 1;
            return;
        }
        b(j, e2);
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
            sb.append('=');
            Object c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
