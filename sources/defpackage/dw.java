package defpackage;

/* renamed from: dw reason: default package */
public final class dw<E> implements Cloneable {
    private static final Object d = new Object();
    public boolean a;
    public Object[] b;
    public int c;
    private int[] e;

    public dw() {
        this(10);
    }

    public dw(int i) {
        this.a = false;
        if (i == 0) {
            this.e = dr.a;
            this.b = dr.c;
            return;
        }
        int a2 = dr.a(i);
        this.e = new int[a2];
        this.b = new Object[a2];
    }

    private void c() {
        int i = this.c;
        int[] iArr = this.e;
        Object[] objArr = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.c = i2;
    }

    public final int a(E e2) {
        if (this.a) {
            c();
        }
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final dw<E> clone() {
        try {
            dw<E> dwVar = (dw) super.clone();
            dwVar.e = (int[]) this.e.clone();
            dwVar.b = (Object[]) this.b.clone();
            return dwVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final E a(int i, E e2) {
        int a2 = dr.a(this.e, this.c, i);
        if (a2 >= 0) {
            E[] eArr = this.b;
            if (eArr[a2] != d) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public final void a(int i) {
        int a2 = dr.a(this.e, this.c, i);
        if (a2 >= 0) {
            Object[] objArr = this.b;
            Object obj = objArr[a2];
            Object obj2 = d;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.a = true;
            }
        }
    }

    public final int b() {
        if (this.a) {
            c();
        }
        return this.c;
    }

    public final int b(int i) {
        if (this.a) {
            c();
        }
        return this.e[i];
    }

    public final void b(int i, E e2) {
        int a2 = dr.a(this.e, this.c, i);
        if (a2 >= 0) {
            this.b[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        if (i2 < this.c) {
            Object[] objArr = this.b;
            if (objArr[i2] == d) {
                this.e[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.a && this.c >= this.e.length) {
            c();
            i2 = dr.a(this.e, this.c, i) ^ -1;
        }
        int i3 = this.c;
        if (i3 >= this.e.length) {
            int a3 = dr.a(i3 + 1);
            int[] iArr = new int[a3];
            Object[] objArr2 = new Object[a3];
            int[] iArr2 = this.e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = iArr;
            this.b = objArr2;
        }
        int i4 = this.c;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.e;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.b;
            System.arraycopy(objArr4, i2, objArr4, i5, this.c - i2);
        }
        this.e[i2] = i;
        this.b[i2] = e2;
        this.c++;
    }

    public final E c(int i) {
        if (this.a) {
            c();
        }
        return this.b[i];
    }

    public final void c(int i, E e2) {
        int i2 = this.c;
        if (i2 == 0 || i > this.e[i2 - 1]) {
            if (this.a && this.c >= this.e.length) {
                c();
            }
            int i3 = this.c;
            if (i3 >= this.e.length) {
                int a2 = dr.a(i3 + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                int[] iArr2 = this.e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.e = iArr;
                this.b = objArr;
            }
            this.e[i3] = i;
            this.b[i3] = e2;
            this.c = i3 + 1;
            return;
        }
        b(i, e2);
    }

    public final int d(int i) {
        if (this.a) {
            c();
        }
        return dr.a(this.e, this.c, i);
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
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
