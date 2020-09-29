package defpackage;

import com.google.common.base.Optional;
import java.util.List;

/* renamed from: oiq reason: default package */
final class oiq extends ojb {
    private final List<uzb> a;
    private final Optional<List<uzc>> b;
    private final oiu c;
    private final int d;

    /* renamed from: oiq$a */
    static final class a implements defpackage.ojb.a {
        private List<uzb> a;
        private Optional<List<uzc>> b = Optional.e();
        private oiu c;
        private Integer d;

        a() {
        }

        public final defpackage.ojb.a a(List<uzb> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.ojb.a a(Optional<List<uzc>> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null recs");
        }

        public final defpackage.ojb.a a(oiu oiu) {
            if (oiu != null) {
                this.c = oiu;
                return this;
            }
            throw new NullPointerException("Null filterAndSort");
        }

        public final defpackage.ojb.a a(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public final ojb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" items");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" filterAndSort");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" numberOfItems");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                oiq oiq = new oiq(this.a, this.b, this.c, this.d.intValue(), 0);
                return oiq;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ oiq(List list, Optional optional, oiu oiu, int i, byte b2) {
        this(list, optional, oiu, i);
    }

    private oiq(List<uzb> list, Optional<List<uzc>> optional, oiu oiu, int i) {
        this.a = list;
        this.b = optional;
        this.c = oiu;
        this.d = i;
    }

    public final List<uzb> a() {
        return this.a;
    }

    public final Optional<List<uzc>> b() {
        return this.b;
    }

    public final oiu c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistItems{items=");
        sb.append(this.a);
        sb.append(", recs=");
        sb.append(this.b);
        sb.append(", filterAndSort=");
        sb.append(this.c);
        sb.append(", numberOfItems=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojb) {
            ojb ojb = (ojb) obj;
            return this.a.equals(ojb.a()) && this.b.equals(ojb.b()) && this.c.equals(ojb.c()) && this.d == ojb.d();
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }
}
