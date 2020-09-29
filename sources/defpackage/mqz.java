package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: mqz reason: default package */
final class mqz extends mrd {
    private final String a;
    private final ImmutableList<mqw> b;
    private final String c;
    private final Optional<String> d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final boolean i;
    private final List<mre> j;

    /* renamed from: mqz$a */
    public static final class a extends defpackage.mrd.a {
        private String a;
        private ImmutableList<mqw> b;
        private String c;
        private Optional<String> d;
        private String e;
        private String f;
        private String g;
        private String h;
        private Boolean i;
        private List<mre> j;

        /* synthetic */ a(mrd mrd, byte b2) {
            this(mrd);
        }

        public a() {
            this.d = Optional.e();
        }

        private a(mrd mrd) {
            this.d = Optional.e();
            this.a = mrd.a();
            this.b = mrd.b();
            this.c = mrd.c();
            this.d = mrd.d();
            this.e = mrd.e();
            this.f = mrd.f();
            this.g = mrd.g();
            this.h = mrd.h();
            this.i = Boolean.valueOf(mrd.i());
            this.j = mrd.j();
        }

        public final defpackage.mrd.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.mrd.a a(ImmutableList<mqw> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public final defpackage.mrd.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null releaseDate");
        }

        public final defpackage.mrd.a a(Optional<String> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null message");
        }

        public final defpackage.mrd.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.mrd.a d(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final defpackage.mrd.a e(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null image");
        }

        public final defpackage.mrd.a f(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.mrd.a a(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mrd.a a(List<mre> list) {
            if (list != null) {
                this.j = list;
                return this;
            }
            throw new NullPointerException("Null tracks");
        }

        public final mrd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" artists");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" releaseDate");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" title");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" subtitle");
                str = sb5.toString();
            }
            if (this.g == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" image");
                str = sb6.toString();
            }
            if (this.h == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" uri");
                str = sb7.toString();
            }
            if (this.i == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" played");
                str = sb8.toString();
            }
            if (this.j == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" tracks");
                str = sb9.toString();
            }
            if (str.isEmpty()) {
                mqz mqz = new mqz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i.booleanValue(), this.j, 0);
                return mqz;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }
    }

    /* synthetic */ mqz(String str, ImmutableList immutableList, String str2, Optional optional, String str3, String str4, String str5, String str6, boolean z, List list, byte b2) {
        this(str, immutableList, str2, optional, str3, str4, str5, str6, z, list);
    }

    private mqz(String str, ImmutableList<mqw> immutableList, String str2, Optional<String> optional, String str3, String str4, String str5, String str6, boolean z, List<mre> list) {
        this.a = str;
        this.b = immutableList;
        this.c = str2;
        this.d = optional;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = list;
    }

    public final String a() {
        return this.a;
    }

    public final ImmutableList<mqw> b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Optional<String> d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final List<mre> j() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicRelease{id=");
        sb.append(this.a);
        sb.append(", artists=");
        sb.append(this.b);
        sb.append(", releaseDate=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", image=");
        sb.append(this.g);
        sb.append(", uri=");
        sb.append(this.h);
        sb.append(", played=");
        sb.append(this.i);
        sb.append(", tracks=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrd) {
            mrd mrd = (mrd) obj;
            return this.a.equals(mrd.a()) && this.b.equals(mrd.b()) && this.c.equals(mrd.c()) && this.d.equals(mrd.d()) && this.e.equals(mrd.e()) && this.f.equals(mrd.f()) && this.g.equals(mrd.g()) && this.h.equals(mrd.h()) && this.i == mrd.i() && this.j.equals(mrd.j());
        }
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ this.j.hashCode();
    }

    public final defpackage.mrd.a k() {
        return new a(this, 0);
    }
}
