package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.value.ValueType;

/* renamed from: wqu reason: default package */
public final class wqu extends wqt implements wpy {
    private static final wqu a = new wqu(new wqq[0]);
    private final wqq[] b;

    /* renamed from: wqu$a */
    static class a implements Iterator<wqq> {
        private final wqq[] a;
        private int b = 0;

        public a(wqq[] wqqArr) {
            this.a = wqqArr;
        }

        public final boolean hasNext() {
            return this.b != this.a.length;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            int i = this.b;
            wqq[] wqqArr = this.a;
            if (i < wqqArr.length) {
                this.b = i + 1;
                return wqqArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public final /* bridge */ /* synthetic */ wpt A() {
        return this;
    }

    public final wpy e() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqj i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqc E() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ wqd F() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ wqg G() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ wqa H() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ wqh b() {
        return super.x();
    }

    public final /* bridge */ /* synthetic */ wqb c() {
        return super.C();
    }

    public final /* bridge */ /* synthetic */ wqe d() {
        return super.B();
    }

    public final /* bridge */ /* synthetic */ wqi f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ wpz g() {
        return super.y();
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

    public static wpy I() {
        return a;
    }

    public wqu(wqq[] wqqArr) {
        this.b = wqqArr;
    }

    public final ValueType h() {
        return ValueType.ARRAY;
    }

    public final int a() {
        return this.b.length;
    }

    public final Iterator<wqq> iterator() {
        return new a(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        if (wqq instanceof wqu) {
            return Arrays.equals(this.b, ((wqu) wqq).b);
        } else if (!wqq.q()) {
            return false;
        } else {
            wpt A = wqq.A();
            if (this.b.length != A.a()) {
                return false;
            }
            Iterator it = A.iterator();
            for (wqq equals : this.b) {
                if (!it.hasNext() || !equals.equals(it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            wqq[] wqqArr = this.b;
            if (i2 >= wqqArr.length) {
                return i;
            }
            i = (i * 31) + wqqArr[i2].hashCode();
            i2++;
        }
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

    private static void a(StringBuilder sb, wqq wqq) {
        if (wqq.n()) {
            sb.append(wqq.D());
        } else {
            sb.append(wqq.toString());
        }
    }
}
