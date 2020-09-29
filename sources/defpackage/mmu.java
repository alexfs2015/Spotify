package defpackage;

import java.util.List;

/* renamed from: mmu reason: default package */
abstract class mmu extends mng {
    final String a;
    final String b;
    final String c;
    final List<uzb> d;
    final boolean e;
    final boolean f;

    /* renamed from: mmu$a */
    static final class a implements defpackage.mng.a {
        private String a;
        private String b;
        private String c;
        private List<uzb> d;
        private Boolean e;
        private Boolean f;

        /* synthetic */ a(mng mng, byte b2) {
            this(mng);
        }

        a() {
        }

        private a(mng mng) {
            this.a = mng.a();
            this.b = mng.b();
            this.c = mng.c();
            this.d = mng.d();
            this.e = Boolean.valueOf(mng.e());
            this.f = Boolean.valueOf(mng.f());
        }

        public final defpackage.mng.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final defpackage.mng.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        public final defpackage.mng.a a(List<uzb> list) {
            this.d = list;
            return this;
        }

        public final mng a() {
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
                mna mna = new mna(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue());
                return mna;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    mmu(String str, String str2, String str3, List<uzb> list, boolean z, boolean z2) {
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

    public final List<uzb> d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mng) {
            mng mng = (mng) obj;
            return this.a.equals(mng.a()) && this.b.equals(mng.b()) && this.c.equals(mng.c()) && this.d.equals(mng.d()) && this.e == mng.e() && this.f == mng.f();
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.mng.a g() {
        return new a(this, 0);
    }
}
