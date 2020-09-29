package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.EmptyPageAction;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;

/* renamed from: rgj reason: default package */
final class rgj extends rgq {
    private final MusicPageId a;
    private final Optional<String> b;
    private final String c;
    private final rkm d;
    private final vca e;
    private final ImmutableMap<String, Boolean> f;
    private final String g;
    private final CharSequence h;
    private final String i;
    private final CharSequence j;
    private final String k;
    private final EmptyPageAction l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final PageAction p;
    private final String q;

    /* renamed from: rgj$a */
    static final class a extends defpackage.rgq.a {
        private MusicPageId a;
        private Optional<String> b;
        private String c;
        private rkm d;
        private vca e;
        private ImmutableMap<String, Boolean> f;
        private String g;
        private CharSequence h;
        private String i;
        private CharSequence j;
        private String k;
        private EmptyPageAction l;
        private Boolean m;
        private Boolean n;
        private Boolean o;
        private PageAction p;
        private String q;

        a() {
            this.b = Optional.e();
        }

        private a(rgq rgq) {
            this.b = Optional.e();
            this.a = rgq.a();
            this.b = rgq.b();
            this.c = rgq.c();
            this.d = rgq.d();
            this.e = rgq.e();
            this.f = rgq.f();
            this.g = rgq.g();
            this.h = rgq.h();
            this.i = rgq.i();
            this.j = rgq.j();
            this.k = rgq.k();
            this.l = rgq.l();
            this.m = Boolean.valueOf(rgq.m());
            this.n = Boolean.valueOf(rgq.n());
            this.o = Boolean.valueOf(rgq.o());
            this.p = rgq.p();
            this.q = rgq.q();
        }

        /* synthetic */ a(rgq rgq, byte b2) {
            this(rgq);
        }

        public final defpackage.rgq.a a(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.rgq.a a(ImmutableMap<String, Boolean> immutableMap) {
            if (immutableMap != null) {
                this.f = immutableMap;
                return this;
            }
            throw new NullPointerException("Null defaultFilterStates");
        }

        public final defpackage.rgq.a a(EmptyPageAction emptyPageAction) {
            if (emptyPageAction != null) {
                this.l = emptyPageAction;
                return this;
            }
            throw new NullPointerException("Null emptyPageAction");
        }

        public final defpackage.rgq.a a(MusicPageId musicPageId) {
            if (musicPageId != null) {
                this.a = musicPageId;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.rgq.a a(PageAction pageAction) {
            if (pageAction != null) {
                this.p = pageAction;
                return this;
            }
            throw new NullPointerException("Null pageAction");
        }

        public final defpackage.rgq.a a(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public final defpackage.rgq.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.rgq.a a(rkm rkm) {
            if (rkm != null) {
                this.d = rkm;
                return this;
            }
            throw new NullPointerException("Null filterAndSortConfiguration");
        }

        public final defpackage.rgq.a a(vca vca) {
            if (vca != null) {
                this.e = vca;
                return this;
            }
            throw new NullPointerException("Null defaultSortOption");
        }

        public final defpackage.rgq.a a(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final rgq a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" filterAndSortConfiguration");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" defaultSortOption");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" defaultFilterStates");
                str = sb5.toString();
            }
            if (this.g == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" filterEmptyTitle");
                str = sb6.toString();
            }
            if (this.h == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" filterEmptySubtitle");
                str = sb7.toString();
            }
            if (this.i == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" emptyTitle");
                str = sb8.toString();
            }
            if (this.j == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" emptySubtitle");
                str = sb9.toString();
            }
            if (this.k == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" emptyActionText");
                str = sb10.toString();
            }
            if (this.l == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" emptyPageAction");
                str = sb11.toString();
            }
            if (this.m == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" showTextFilterOption");
                str = sb12.toString();
            }
            if (this.n == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" showSortOption");
                str = sb13.toString();
            }
            if (this.o == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" showFilterOptions");
                str = sb14.toString();
            }
            if (this.p == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" pageAction");
                str = sb15.toString();
            }
            if (this.q == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" pageActionText");
                str = sb16.toString();
            }
            if (str.isEmpty()) {
                rgj rgj = new rgj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p, this.q, 0);
                return rgj;
            }
            StringBuilder sb17 = new StringBuilder("Missing required properties:");
            sb17.append(str);
            throw new IllegalStateException(sb17.toString());
        }

        public final defpackage.rgq.a b(CharSequence charSequence) {
            if (charSequence != null) {
                this.j = charSequence;
                return this;
            }
            throw new NullPointerException("Null emptySubtitle");
        }

        public final defpackage.rgq.a b(String str) {
            this.g = str;
            return this;
        }

        public final defpackage.rgq.a b(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rgq.a c(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null emptyTitle");
        }

        public final defpackage.rgq.a c(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rgq.a d(String str) {
            if (str != null) {
                this.k = str;
                return this;
            }
            throw new NullPointerException("Null emptyActionText");
        }

        public final defpackage.rgq.a e(String str) {
            if (str != null) {
                this.q = str;
                return this;
            }
            throw new NullPointerException("Null pageActionText");
        }
    }

    private rgj(MusicPageId musicPageId, Optional<String> optional, String str, rkm rkm, vca vca, ImmutableMap<String, Boolean> immutableMap, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, String str4, EmptyPageAction emptyPageAction, boolean z, boolean z2, boolean z3, PageAction pageAction, String str5) {
        this.a = musicPageId;
        this.b = optional;
        this.c = str;
        this.d = rkm;
        this.e = vca;
        this.f = immutableMap;
        this.g = str2;
        this.h = charSequence;
        this.i = str3;
        this.j = charSequence2;
        this.k = str4;
        this.l = emptyPageAction;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = pageAction;
        this.q = str5;
    }

    /* synthetic */ rgj(MusicPageId musicPageId, Optional optional, String str, rkm rkm, vca vca, ImmutableMap immutableMap, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, String str4, EmptyPageAction emptyPageAction, boolean z, boolean z2, boolean z3, PageAction pageAction, String str5, byte b2) {
        this(musicPageId, optional, str, rkm, vca, immutableMap, str2, charSequence, str3, charSequence2, str4, emptyPageAction, z, z2, z3, pageAction, str5);
    }

    public final MusicPageId a() {
        return this.a;
    }

    public final Optional<String> b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final rkm d() {
        return this.d;
    }

    public final vca e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgq) {
            rgq rgq = (rgq) obj;
            return this.a.equals(rgq.a()) && this.b.equals(rgq.b()) && this.c.equals(rgq.c()) && this.d.equals(rgq.d()) && this.e.equals(rgq.e()) && this.f.equals(rgq.f()) && this.g.equals(rgq.g()) && this.h.equals(rgq.h()) && this.i.equals(rgq.i()) && this.j.equals(rgq.j()) && this.k.equals(rgq.k()) && this.l.equals(rgq.l()) && this.m == rgq.m() && this.n == rgq.n() && this.o == rgq.o() && this.p.equals(rgq.p()) && this.q.equals(rgq.q());
        }
    }

    public final ImmutableMap<String, Boolean> f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final CharSequence h() {
        return this.h;
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003;
        if (!this.o) {
            i2 = 1237;
        }
        return ((((hashCode ^ i2) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    public final String i() {
        return this.i;
    }

    public final CharSequence j() {
        return this.j;
    }

    public final String k() {
        return this.k;
    }

    public final EmptyPageAction l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final PageAction p() {
        return this.p;
    }

    public final String q() {
        return this.q;
    }

    public final defpackage.rgq.a r() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPage{id=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", filterAndSortConfiguration=");
        sb.append(this.d);
        sb.append(", defaultSortOption=");
        sb.append(this.e);
        sb.append(", defaultFilterStates=");
        sb.append(this.f);
        sb.append(", filterEmptyTitle=");
        sb.append(this.g);
        sb.append(", filterEmptySubtitle=");
        sb.append(this.h);
        sb.append(", emptyTitle=");
        sb.append(this.i);
        sb.append(", emptySubtitle=");
        sb.append(this.j);
        sb.append(", emptyActionText=");
        sb.append(this.k);
        sb.append(", emptyPageAction=");
        sb.append(this.l);
        sb.append(", showTextFilterOption=");
        sb.append(this.m);
        sb.append(", showSortOption=");
        sb.append(this.n);
        sb.append(", showFilterOptions=");
        sb.append(this.o);
        sb.append(", pageAction=");
        sb.append(this.p);
        sb.append(", pageActionText=");
        sb.append(this.q);
        sb.append("}");
        return sb.toString();
    }
}
