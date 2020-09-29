package defpackage;

import com.google.common.base.Optional;
import java.util.List;
import java.util.Set;

/* renamed from: lrd reason: default package */
final class lrd extends defpackage.lra.a {
    private final Set<String> a;
    private final List<lqy> b;
    private final Optional<Boolean> c;
    private final String d;
    private final boolean e;

    /* renamed from: lrd$a */
    static final class a implements C0053a {
        private Set<String> a;
        private List<lqy> b;
        private Optional<Boolean> c;
        private String d;
        private Boolean e;

        /* synthetic */ a(defpackage.lra.a aVar, byte b2) {
            this(aVar);
        }

        a() {
            this.c = Optional.e();
        }

        private a(defpackage.lra.a aVar) {
            this.c = Optional.e();
            this.a = aVar.a();
            this.b = aVar.b();
            this.c = aVar.c();
            this.d = aVar.d();
            this.e = Boolean.valueOf(aVar.e());
        }

        public final C0053a a(Set<String> set) {
            if (set != null) {
                this.a = set;
                return this;
            }
            throw new NullPointerException("Null seeds");
        }

        public final C0053a a(List<lqy> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null cards");
        }

        public final C0053a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null isConnected");
        }

        public final C0053a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null playlistTitle");
        }

        public final C0053a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.lra.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" seeds");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" cards");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playlistTitle");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" disableExplicitContent");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                lrd lrd = new lrd(this.a, this.b, this.c, this.d, this.e.booleanValue(), 0);
                return lrd;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ lrd(Set set, List list, Optional optional, String str, boolean z, byte b2) {
        this(set, list, optional, str, z);
    }

    private lrd(Set<String> set, List<lqy> list, Optional<Boolean> optional, String str, boolean z) {
        this.a = set;
        this.b = list;
        this.c = optional;
        this.d = str;
        this.e = z;
    }

    public final Set<String> a() {
        return this.a;
    }

    public final List<lqy> b() {
        return this.b;
    }

    public final Optional<Boolean> c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{seeds=");
        sb.append(this.a);
        sb.append(", cards=");
        sb.append(this.b);
        sb.append(", isConnected=");
        sb.append(this.c);
        sb.append(", playlistTitle=");
        sb.append(this.d);
        sb.append(", disableExplicitContent=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lra.a) {
            defpackage.lra.a aVar = (defpackage.lra.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c()) && this.d.equals(aVar.d()) && this.e == aVar.e();
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final C0053a f() {
        return new a(this, 0);
    }
}
