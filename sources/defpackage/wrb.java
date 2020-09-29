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

/* renamed from: wrb reason: default package */
public final class wrb extends wqt implements wqe {
    private static final wrb a = new wrb(new wqq[0]);
    private final wqq[] b;

    /* renamed from: wrb$a */
    static class a extends AbstractSet<Entry<wqq, wqq>> {
        private final wqq[] a;

        a(wqq[] wqqArr) {
            this.a = wqqArr;
        }

        public final int size() {
            return this.a.length / 2;
        }

        public final Iterator<Entry<wqq, wqq>> iterator() {
            return new b(this.a);
        }
    }

    /* renamed from: wrb$b */
    static class b implements Iterator<Entry<wqq, wqq>> {
        private final wqq[] a;
        private int b = 0;

        b(wqq[] wqqArr) {
            this.a = wqqArr;
        }

        public final boolean hasNext() {
            return this.b < this.a.length;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            int i = this.b;
            wqq[] wqqArr = this.a;
            if (i < wqqArr.length) {
                SimpleImmutableEntry simpleImmutableEntry = new SimpleImmutableEntry(wqqArr[i], wqqArr[i + 1]);
                this.b += 2;
                return simpleImmutableEntry;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: wrb$c */
    static class c extends AbstractMap<wqq, wqq> {
        private final wqq[] a;

        public c(wqq[] wqqArr) {
            this.a = wqqArr;
        }

        public final Set<Entry<wqq, wqq>> entrySet() {
            return new a(this.a);
        }
    }

    public final /* bridge */ /* synthetic */ wql B() {
        return this;
    }

    public final wqe d() {
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

    public final /* bridge */ /* synthetic */ wpy e() {
        return super.A();
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

    public static wqe I() {
        return a;
    }

    public wrb(wqq[] wqqArr) {
        this.b = wqqArr;
    }

    public final ValueType h() {
        return ValueType.MAP;
    }

    public final Map<wqq, wqq> a() {
        return new c(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        if (!wqq.r()) {
            return false;
        }
        return a().equals(wqq.B().a());
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            wqq[] wqqArr = this.b;
            if (i >= wqqArr.length) {
                return i2;
            }
            i2 += wqqArr[i].hashCode() ^ this.b[i + 1].hashCode();
            i += 2;
        }
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

    private static void a(StringBuilder sb, wqq wqq) {
        if (wqq.n()) {
            sb.append(wqq.D());
        } else {
            wrd.a(sb, wqq.toString());
        }
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

    private static void b(StringBuilder sb, wqq wqq) {
        if (wqq.n()) {
            sb.append(wqq.D());
        } else {
            sb.append(wqq.toString());
        }
    }
}
