package defpackage;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.value.ValueType;

/* renamed from: xfg reason: default package */
public final class xfg extends xey implements xej {
    private static final xfg a = new xfg(new xev[0]);
    private final xev[] b;

    /* renamed from: xfg$a */
    static class a extends AbstractSet<Entry<xev, xev>> {
        private final xev[] a;

        a(xev[] xevArr) {
            this.a = xevArr;
        }

        public final Iterator<Entry<xev, xev>> iterator() {
            return new b(this.a);
        }

        public final int size() {
            return this.a.length / 2;
        }
    }

    /* renamed from: xfg$b */
    static class b implements Iterator<Entry<xev, xev>> {
        private final xev[] a;
        private int b = 0;

        b(xev[] xevArr) {
            this.a = xevArr;
        }

        public final boolean hasNext() {
            return this.b < this.a.length;
        }

        public final /* synthetic */ Object next() {
            int i = this.b;
            xev[] xevArr = this.a;
            if (i < xevArr.length) {
                SimpleImmutableEntry simpleImmutableEntry = new SimpleImmutableEntry(xevArr[i], xevArr[i + 1]);
                this.b += 2;
                return simpleImmutableEntry;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: xfg$c */
    static class c extends AbstractMap<xev, xev> {
        private final xev[] a;

        public c(xev[] xevArr) {
            this.a = xevArr;
        }

        public final Set<Entry<xev, xev>> entrySet() {
            return new a(this.a);
        }
    }

    public xfg(xev[] xevArr) {
        this.b = xevArr;
    }

    public static xej I() {
        return a;
    }

    private static void a(StringBuilder sb, xev xev) {
        if (xev.n()) {
            sb.append(xev.D());
        } else {
            xfi.a(sb, xev.toString());
        }
    }

    private static void b(StringBuilder sb, xev xev) {
        if (xev.n()) {
            sb.append(xev.D());
        } else {
            sb.append(xev.toString());
        }
    }

    public final /* bridge */ /* synthetic */ xeq B() {
        return this;
    }

    public final String D() {
        if (this.b.length == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        a(sb, this.b[0]);
        String str = ":";
        sb.append(str);
        sb.append(this.b[1].D());
        for (int i = 2; i < this.b.length; i += 2) {
            sb.append(",");
            a(sb, this.b[i]);
            sb.append(str);
            sb.append(this.b[i + 1].D());
        }
        sb.append("}");
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

    public final Map<xev, xev> a() {
        return new c(this.b);
    }

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
    }

    public final /* bridge */ /* synthetic */ xeg c() {
        return super.C();
    }

    public final xej d() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xed e() {
        return super.A();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xev)) {
            return false;
        }
        xev xev = (xev) obj;
        if (!xev.r()) {
            return false;
        }
        return a().equals(xev.B().a());
    }

    public final /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final ValueType h() {
        return ValueType.MAP;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            xev[] xevArr = this.b;
            if (i >= xevArr.length) {
                return i2;
            }
            i2 += xevArr[i].hashCode() ^ this.b[i + 1].hashCode();
            i += 2;
        }
    }

    public final /* bridge */ /* synthetic */ xeo i() {
        return this;
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
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        b(sb, this.b[0]);
        String str = ":";
        sb.append(str);
        b(sb, this.b[1]);
        for (int i = 2; i < this.b.length; i += 2) {
            sb.append(",");
            b(sb, this.b[i]);
            sb.append(str);
            b(sb, this.b[i + 1]);
        }
        sb.append("}");
        return sb.toString();
    }
}
