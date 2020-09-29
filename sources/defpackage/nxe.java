package defpackage;

import com.google.common.base.Optional;
import java.util.List;

/* renamed from: nxe reason: default package */
final class nxe extends nxg {
    private final Optional<way> a;
    private final String b;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;
    private final boolean f;

    /* renamed from: nxe$a */
    static final class a implements defpackage.nxg.a {
        private Optional<way> a;
        private String b;
        private List<String> c;
        private List<String> d;
        private List<String> e;
        private Boolean f;

        a() {
            this.a = Optional.e();
        }

        private a(nxg nxg) {
            this.a = Optional.e();
            this.a = nxg.a();
            this.b = nxg.b();
            this.c = nxg.c();
            this.d = nxg.d();
            this.e = nxg.e();
            this.f = Boolean.valueOf(nxg.f());
        }

        /* synthetic */ a(nxg nxg, byte b2) {
            this(nxg);
        }

        public final defpackage.nxg.a a(Optional<way> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final defpackage.nxg.a a(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.nxg.a a(List<String> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null filters");
        }

        public final defpackage.nxg.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final nxg a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" filters");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trackFilters");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" excludedPaths");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" waitForScanner");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                nxe nxe = new nxe(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), 0);
                return nxe;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.nxg.a b(List<String> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null trackFilters");
        }

        public final defpackage.nxg.a c(List<String> list) {
            if (list != null) {
                this.e = list;
                return this;
            }
            throw new NullPointerException("Null excludedPaths");
        }
    }

    private nxe(Optional<way> optional, String str, List<String> list, List<String> list2, List<String> list3, boolean z) {
        this.a = optional;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = z;
    }

    /* synthetic */ nxe(Optional optional, String str, List list, List list2, List list3, boolean z, byte b2) {
        this(optional, str, list, list2, list3, z);
    }

    public final Optional<way> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<String> c() {
        return this.c;
    }

    public final List<String> d() {
        return this.d;
    }

    public final List<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nxg) {
            nxg nxg = (nxg) obj;
            if (this.a.equals(nxg.a())) {
                String str = this.b;
                if (str != null ? str.equals(nxg.b()) : nxg.b() == null) {
                    return this.c.equals(nxg.c()) && this.d.equals(nxg.d()) && this.e.equals(nxg.e()) && this.f == nxg.f();
                }
            }
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final defpackage.nxg.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryMapBuilder{sortOrder=");
        sb.append(this.a);
        sb.append(", textFilter=");
        sb.append(this.b);
        sb.append(", filters=");
        sb.append(this.c);
        sb.append(", trackFilters=");
        sb.append(this.d);
        sb.append(", excludedPaths=");
        sb.append(this.e);
        sb.append(", waitForScanner=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
