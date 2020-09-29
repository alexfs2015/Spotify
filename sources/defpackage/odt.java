package defpackage;

import java.util.List;

/* renamed from: odt reason: default package */
final class odt extends ody {
    private final uyz a;
    private final List<uzb> b;
    private final List<uzb> c;

    /* renamed from: odt$a */
    static final class a implements defpackage.ody.a {
        private uyz a;
        private List<uzb> b;
        private List<uzb> c;

        a() {
        }

        public final defpackage.ody.a a(uyz uyz) {
            if (uyz != null) {
                this.a = uyz;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        public final defpackage.ody.a a(List<uzb> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.ody.a b(List<uzb> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null recommendations");
        }

        public final ody a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" items");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" recommendations");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new odt(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ odt(uyz uyz, List list, List list2, byte b2) {
        this(uyz, list, list2);
    }

    private odt(uyz uyz, List<uzb> list, List<uzb> list2) {
        this.a = uyz;
        this.b = list;
        this.c = list2;
    }

    public final uyz a() {
        return this.a;
    }

    public final List<uzb> b() {
        return this.b;
    }

    public final List<uzb> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{playlist=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", recommendations=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ody) {
            ody ody = (ody) obj;
            return this.a.equals(ody.a()) && this.b.equals(ody.b()) && this.c.equals(ody.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
