package defpackage;

import java.util.List;

/* renamed from: uxa reason: default package */
final class uxa extends b {
    private final List<String> a;
    private final List<String> b;

    /* renamed from: uxa$a */
    public static final class a implements defpackage.uxc.b.a {
        private List<String> a;
        private List<String> b;

        public final defpackage.uxc.b.a a(List<String> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null nonDuplicateItems");
        }

        public final defpackage.uxc.b.a b(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null allItems");
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" nonDuplicateItems");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" allItems");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new uxa(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ uxa(List list, List list2, byte b2) {
        this(list, list2);
    }

    private uxa(List<String> list, List<String> list2) {
        this.a = list;
        this.b = list2;
    }

    public final List<String> a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuplicateResult{nonDuplicateItems=");
        sb.append(this.a);
        sb.append(", allItems=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
