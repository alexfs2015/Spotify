package defpackage;

/* renamed from: tjh reason: default package */
final class tjh extends b {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    /* renamed from: tjh$a */
    static final class a extends defpackage.tjl.b.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        a() {
        }

        public final defpackage.tjl.b.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" canAddToQueue");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" canBrowseAssociatedSpotifyTrackAlbum");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" canBrowseShow");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" canDownload");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" canGoToQueue");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" canShare");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" canUseSleepTimer");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                tjh tjh = new tjh(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), 0);
                return tjh;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }

        public final defpackage.tjl.b.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.b.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.b.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.b.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.tjl.b.a f(boolean z) {
            this.f = Boolean.TRUE;
            return this;
        }

        public final defpackage.tjl.b.a g(boolean z) {
            this.g = Boolean.FALSE;
            return this;
        }
    }

    private tjh(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    /* synthetic */ tjh(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7);
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
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.b == bVar.a() && this.c == bVar.b() && this.d == bVar.c() && this.e == bVar.d() && this.f == bVar.e() && this.g == bVar.f() && this.h == bVar.g();
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

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForShow{canAddToQueue=");
        sb.append(this.b);
        sb.append(", canBrowseAssociatedSpotifyTrackAlbum=");
        sb.append(this.c);
        sb.append(", canBrowseShow=");
        sb.append(this.d);
        sb.append(", canDownload=");
        sb.append(this.e);
        sb.append(", canGoToQueue=");
        sb.append(this.f);
        sb.append(", canShare=");
        sb.append(this.g);
        sb.append(", canUseSleepTimer=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
