package defpackage;

/* renamed from: ogx reason: default package */
final class ogx extends ohk {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    /* renamed from: ogx$a */
    static final class a implements defpackage.ohk.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private Boolean n;

        /* synthetic */ a(ohk ohk, byte b2) {
            this(ohk);
        }

        a() {
        }

        private a(ohk ohk) {
            this.a = Boolean.valueOf(ohk.a());
            this.b = Boolean.valueOf(ohk.b());
            this.c = Boolean.valueOf(ohk.c());
            this.d = Boolean.valueOf(ohk.d());
            this.e = Boolean.valueOf(ohk.e());
            this.f = Boolean.valueOf(ohk.f());
            this.g = Boolean.valueOf(ohk.g());
            this.h = Boolean.valueOf(ohk.h());
            this.i = Boolean.valueOf(ohk.i());
            this.j = Boolean.valueOf(ohk.j());
            this.k = Boolean.valueOf(ohk.k());
            this.l = Boolean.valueOf(ohk.l());
            this.m = Boolean.valueOf(ohk.m());
            this.n = Boolean.valueOf(ohk.n());
        }

        public final defpackage.ohk.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a i(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a j(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a k(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a l(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a m(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohk.a n(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        public final ohk a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showAddedToYourPlaylistsEducation");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" showHeartInToolbar");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showHeartInsteadOfFollowOption");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showBanForMultiSelect");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" showAddToQueueForMultiSelect");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" showAddSongsOption");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" showGoToPlaylistRadioOption");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" showAddToHomescreenOption");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" showDownloadOption");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" showMakeCollaborativeOption");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" openNpvWhenStartingPlaybackViaPlayButton");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" editViewInsteadOfRename");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" showFilterAndSortInToolbar");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" playButtonDoAndSayShuffle");
                str = sb14.toString();
            }
            if (str.isEmpty()) {
                ogx ogx = new ogx(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), 0);
                return ogx;
            }
            StringBuilder sb15 = new StringBuilder("Missing required properties:");
            sb15.append(str);
            throw new IllegalStateException(sb15.toString());
        }
    }

    /* synthetic */ ogx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14);
    }

    private ogx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final boolean n() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarConfiguration{showAddedToYourPlaylistsEducation=");
        sb.append(this.a);
        sb.append(", showHeartInToolbar=");
        sb.append(this.b);
        sb.append(", showHeartInsteadOfFollowOption=");
        sb.append(this.c);
        sb.append(", showBanForMultiSelect=");
        sb.append(this.d);
        sb.append(", showAddToQueueForMultiSelect=");
        sb.append(this.e);
        sb.append(", showAddSongsOption=");
        sb.append(this.f);
        sb.append(", showGoToPlaylistRadioOption=");
        sb.append(this.g);
        sb.append(", showAddToHomescreenOption=");
        sb.append(this.h);
        sb.append(", showDownloadOption=");
        sb.append(this.i);
        sb.append(", showMakeCollaborativeOption=");
        sb.append(this.j);
        sb.append(", openNpvWhenStartingPlaybackViaPlayButton=");
        sb.append(this.k);
        sb.append(", editViewInsteadOfRename=");
        sb.append(this.l);
        sb.append(", showFilterAndSortInToolbar=");
        sb.append(this.m);
        sb.append(", playButtonDoAndSayShuffle=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohk) {
            ohk ohk = (ohk) obj;
            return this.a == ohk.a() && this.b == ohk.b() && this.c == ohk.c() && this.d == ohk.d() && this.e == ohk.e() && this.f == ohk.f() && this.g == ohk.g() && this.h == ohk.h() && this.i == ohk.i() && this.j == ohk.j() && this.k == ohk.k() && this.l == ohk.l() && this.m == ohk.m() && this.n == ohk.n();
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    public final defpackage.ohk.a o() {
        return new a(this, 0);
    }
}
