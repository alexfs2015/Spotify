package defpackage;

/* renamed from: tji reason: default package */
final class tji extends c {
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

    /* renamed from: tji$a */
    static final class a extends defpackage.tjl.c.a {
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

        a() {
        }

        public final defpackage.tjl.c.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final c a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" canUpdateCollectionState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" canAddToQueue");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" canBan");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" canBrowseAlbum");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" canBrowseArtist");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" canGoToQueue");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" canGoToQueueFromTopBar");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" canStartRadio");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" canReportAbuse");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" canShuffle");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" canRepeat");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" canUseSleepTimer");
                str = sb12.toString();
            }
            if (str.isEmpty()) {
                tji tji = new tji(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), 0);
                return tji;
            }
            StringBuilder sb13 = new StringBuilder("Missing required properties:");
            sb13.append(str);
            throw new IllegalStateException(sb13.toString());
        }

        public final defpackage.tjl.c.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a e(boolean z) {
            this.e = Boolean.TRUE;
            return this;
        }

        public final defpackage.tjl.c.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a i(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a j(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a k(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.c.a l(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }
    }

    private tji(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = z12;
    }

    /* synthetic */ tji(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.b == cVar.a() && this.c == cVar.b() && this.d == cVar.c() && this.e == cVar.d() && this.f == cVar.e() && this.g == cVar.f() && this.h == cVar.g() && this.i == cVar.h() && this.j == cVar.i() && this.k == cVar.j() && this.l == cVar.k() && this.m == cVar.l();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean f() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003;
        if (!this.m) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean i() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final boolean j() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public final boolean k() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForTrack{canUpdateCollectionState=");
        sb.append(this.b);
        sb.append(", canAddToQueue=");
        sb.append(this.c);
        sb.append(", canBan=");
        sb.append(this.d);
        sb.append(", canBrowseAlbum=");
        sb.append(this.e);
        sb.append(", canBrowseArtist=");
        sb.append(this.f);
        sb.append(", canGoToQueue=");
        sb.append(this.g);
        sb.append(", canGoToQueueFromTopBar=");
        sb.append(this.h);
        sb.append(", canStartRadio=");
        sb.append(this.i);
        sb.append(", canReportAbuse=");
        sb.append(this.j);
        sb.append(", canShuffle=");
        sb.append(this.k);
        sb.append(", canRepeat=");
        sb.append(this.l);
        sb.append(", canUseSleepTimer=");
        sb.append(this.m);
        sb.append("}");
        return sb.toString();
    }
}
