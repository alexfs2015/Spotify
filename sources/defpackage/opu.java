package defpackage;

import com.google.common.base.Optional;
import java.util.List;

/* renamed from: opu reason: default package */
final class opu extends oqf {
    private final List<vle> a;
    private final Optional<List<vlf>> b;
    private final opy c;
    private final int d;

    /* renamed from: opu$a */
    static final class a implements defpackage.oqf.a {
        private List<vle> a;
        private Optional<List<vlf>> b = Optional.e();
        private opy c;
        private Integer d;

        a() {
        }

        public final defpackage.oqf.a a(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public final defpackage.oqf.a a(Optional<List<vlf>> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null recs");
        }

        public final defpackage.oqf.a a(List<vle> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.oqf.a a(opy opy) {
            if (opy != null) {
                this.c = opy;
                return this;
            }
            throw new NullPointerException("Null filterAndSort");
        }

        public final oqf a() {
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
                opu opu = new opu(this.a, this.b, this.c, this.d.intValue(), 0);
                return opu;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private opu(List<vle> list, Optional<List<vlf>> optional, opy opy, int i) {
        this.a = list;
        this.b = optional;
        this.c = opy;
        this.d = i;
    }

    /* synthetic */ opu(List list, Optional optional, opy opy, int i, byte b2) {
        this(list, optional, opy, i);
    }

    public final List<vle> a() {
        return this.a;
    }

    public final Optional<List<vlf>> b() {
        return this.b;
    }

    public final opy c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oqf) {
            oqf oqf = (oqf) obj;
            return this.a.equals(oqf.a()) && this.b.equals(oqf.b()) && this.c.equals(oqf.c()) && this.d == oqf.d();
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
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
}
