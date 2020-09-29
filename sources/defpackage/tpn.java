package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: tpn reason: default package */
final class tpn extends tps {
    private final ImmutableList<tpq> a;
    private final int b;

    /* renamed from: tpn$a */
    public static final class a implements defpackage.tps.a {
        private ImmutableList<tpq> a;
        private Integer b;

        public final defpackage.tps.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.tps.a a(ImmutableList<tpq> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null pivotItems");
        }

        public final tps a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" pivotItems");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" startPosition");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new tpn(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private tpn(ImmutableList<tpq> immutableList, int i) {
        this.a = immutableList;
        this.b = i;
    }

    /* synthetic */ tpn(ImmutableList immutableList, int i, byte b2) {
        this(immutableList, i);
    }

    public final ImmutableList<tpq> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tps) {
            tps tps = (tps) obj;
            return this.a.equals(tps.a()) && this.b == tps.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PivotItemList{pivotItems=");
        sb.append(this.a);
        sb.append(", startPosition=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
