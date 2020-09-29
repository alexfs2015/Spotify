package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f;

/* renamed from: qxl reason: default package */
public abstract class qxl extends f {
    final boolean a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final String i;
    final String j;

    /* renamed from: qxl$a */
    public static final class a extends com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private String i;
        private String j;

        /* synthetic */ a(f fVar, byte b2) {
            this(fVar);
        }

        public a() {
        }

        private a(f fVar) {
            this.a = Boolean.valueOf(fVar.a());
            this.b = Boolean.valueOf(fVar.b());
            this.c = Boolean.valueOf(fVar.c());
            this.d = Boolean.valueOf(fVar.d());
            this.e = Boolean.valueOf(fVar.e());
            this.f = Boolean.valueOf(fVar.f());
            this.g = Boolean.valueOf(fVar.g());
            this.h = Boolean.valueOf(fVar.h());
            this.i = fVar.i();
            this.j = fVar.j();
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a g(boolean z) {
            this.g = Boolean.TRUE;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a h(boolean z) {
            this.h = Boolean.FALSE;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a a(String str) {
            this.i = str;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a b(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public final f a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" inCollection");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" banned");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" canLike");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" canBan");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" explicit");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" currentlyPlayable");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" recommended");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" local");
                str = sb8.toString();
            }
            if (this.j == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" contextUri");
                str = sb9.toString();
            }
            if (str.isEmpty()) {
                qxp qxp = new qxp(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, this.j);
                return qxp;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }
    }

    qxl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = str;
        if (str2 != null) {
            this.j = str2;
            return;
        }
        throw new NullPointerException("Null contextUri");
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

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackExtras{inCollection=");
        sb.append(this.a);
        sb.append(", banned=");
        sb.append(this.b);
        sb.append(", canLike=");
        sb.append(this.c);
        sb.append(", canBan=");
        sb.append(this.d);
        sb.append(", explicit=");
        sb.append(this.e);
        sb.append(", currentlyPlayable=");
        sb.append(this.f);
        sb.append(", recommended=");
        sb.append(this.g);
        sb.append(", local=");
        sb.append(this.h);
        sb.append(", previewId=");
        sb.append(this.i);
        sb.append(", contextUri=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a == fVar.a() && this.b == fVar.b() && this.c == fVar.c() && this.d == fVar.d() && this.e == fVar.e() && this.f == fVar.f() && this.g == fVar.g() && this.h == fVar.h()) {
                String str = this.i;
                if (str != null ? str.equals(fVar.i()) : fVar.i() == null) {
                    if (this.j.equals(fVar.j())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i2 = 1237;
        }
        int i4 = (i3 ^ i2) * 1000003;
        String str = this.i;
        return ((i4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.j.hashCode();
    }

    public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a k() {
        return new a(this, 0);
    }
}
