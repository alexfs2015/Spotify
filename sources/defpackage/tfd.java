package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: tfd reason: default package */
final class tfd extends tfi {
    private final ImmutableList<tfg> a;
    private final int b;

    /* renamed from: tfd$a */
    public static final class a implements defpackage.tfi.a {
        private ImmutableList<tfg> a;
        private Integer b;

        public final defpackage.tfi.a a(ImmutableList<tfg> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null pivotItems");
        }

        public final defpackage.tfi.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final tfi a() {
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
                return new tfd(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ tfd(ImmutableList immutableList, int i, byte b2) {
        this(immutableList, i);
    }

    private tfd(ImmutableList<tfg> immutableList, int i) {
        this.a = immutableList;
        this.b = i;
    }

    public final ImmutableList<tfg> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PivotItemList{pivotItems=");
        sb.append(this.a);
        sb.append(", startPosition=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfi) {
            tfi tfi = (tfi) obj;
            return this.a.equals(tfi.a()) && this.b == tfi.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
