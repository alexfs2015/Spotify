package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.value.ValueType;

/* renamed from: xez reason: default package */
public final class xez extends xey implements xed {
    private static final xez a = new xez(new xev[0]);
    private final xev[] b;

    /* renamed from: xez$a */
    static class a implements Iterator<xev> {
        private final xev[] a;
        private int b = 0;

        public a(xev[] xevArr) {
            this.a = xevArr;
        }

        public final boolean hasNext() {
            return this.b != this.a.length;
        }

        public final /* synthetic */ Object next() {
            int i = this.b;
            xev[] xevArr = this.a;
            if (i < xevArr.length) {
                this.b = i + 1;
                return xevArr[i];
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public xez(xev[] xevArr) {
        this.b = xevArr;
    }

    public static xed I() {
        return a;
    }

    private static void a(StringBuilder sb, xev xev) {
        if (xev.n()) {
            sb.append(xev.D());
        } else {
            sb.append(xev.toString());
        }
    }

    public final /* bridge */ /* synthetic */ xdy A() {
        return this;
    }

    public final String D() {
        if (this.b.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.b[0].D());
        for (int i = 1; i < this.b.length; i++) {
            sb.append(",");
            sb.append(this.b[i].D());
        }
        sb.append("]");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ xeh E() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ xei F() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ xel G() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ xef H() {
        return super.t();
    }

    public final int a() {
        return this.b.length;
    }

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
    }

    public final /* bridge */ /* synthetic */ xeg c() {
        return super.C();
    }

    public final /* bridge */ /* synthetic */ xej d() {
        return super.B();
    }

    public final xed e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xev)) {
            return false;
        }
        xev xev = (xev) obj;
        if (xev instanceof xez) {
            return Arrays.equals(this.b, ((xez) xev).b);
        } else if (!xev.q()) {
            return false;
        } else {
            xdy A = xev.A();
            if (this.b.length != A.a()) {
                return false;
            }
            Iterator it = A.iterator();
            for (xev equals : this.b) {
                if (!it.hasNext() || !equals.equals(it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public final /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final ValueType h() {
        return ValueType.ARRAY;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            xev[] xevArr = this.b;
            if (i2 >= xevArr.length) {
                return i;
            }
            i = (i * 31) + xevArr[i2].hashCode();
            i2++;
        }
    }

    public final /* bridge */ /* synthetic */ xeo i() {
        return this;
    }

    public final Iterator<xev> iterator() {
        return new a(this.b);
    }

    public final /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ boolean r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    public final String toString() {
        if (this.b.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        a(sb, this.b[0]);
        for (int i = 1; i < this.b.length; i++) {
            sb.append(",");
            a(sb, this.b[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
