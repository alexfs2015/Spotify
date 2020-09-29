package defpackage;

import java.util.List;

/* renamed from: mrn reason: default package */
abstract class mrn extends mrz {
    final String a;
    final String b;
    final String c;
    final List<vle> d;
    final boolean e;
    final boolean f;

    /* renamed from: mrn$a */
    static final class a implements defpackage.mrz.a {
        private String a;
        private String b;
        private String c;
        private List<vle> d;
        private Boolean e;
        private Boolean f;

        a() {
        }

        private a(mrz mrz) {
            this.a = mrz.a();
            this.b = mrz.b();
            this.c = mrz.c();
            this.d = mrz.d();
            this.e = Boolean.valueOf(mrz.e());
            this.f = Boolean.valueOf(mrz.f());
        }

        /* synthetic */ a(mrz mrz, byte b2) {
            this(mrz);
        }

        public final defpackage.mrz.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final defpackage.mrz.a a(List<vle> list) {
            this.d = list;
            return this;
        }

        public final mrz a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" name");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" image");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" description");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" items");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isCollaborative");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isOwnBySelf");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                mrt mrt = new mrt(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue());
                return mrt;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.mrz.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }
    }

    mrn(String str, String str2, String str3, List<vle> list, boolean z, boolean z2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (list != null) {
                        this.d = list;
                        this.e = z;
                        this.f = z2;
                        return;
                    }
                    throw new NullPointerException("Null items");
                }
                throw new NullPointerException("Null description");
            }
            throw new NullPointerException("Null image");
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final List<vle> d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrz) {
            mrz mrz = (mrz) obj;
            return this.a.equals(mrz.a()) && this.b.equals(mrz.b()) && this.c.equals(mrz.c()) && this.d.equals(mrz.d()) && this.e == mrz.e() && this.f == mrz.f();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final defpackage.mrz.a g() {
        return new a(this, 0);
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data{name=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", isCollaborative=");
        sb.append(this.e);
        sb.append(", isOwnBySelf=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
