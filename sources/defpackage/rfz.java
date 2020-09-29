package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e;

/* renamed from: rfz reason: default package */
public abstract class rfz extends e {
    final String a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final String g;

    /* renamed from: rfz$a */
    public static final class a extends com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Boolean e;
        private Boolean f;
        private String g;

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null buttonTitle");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final e a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" buttonTitle");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" infoDialogTitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" infoDialogText");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" infoDialogDismissText");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" collapsable");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" collapsed");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" collapseOption");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                rgd rgd = new rgd(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g);
                return rgd;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null infoDialogTitle");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a b(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null infoDialogText");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null infoDialogDismissText");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e.a e(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null collapseOption");
        }
    }

    rfz(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = z;
                        this.f = z2;
                        if (str5 != null) {
                            this.g = str5;
                            return;
                        }
                        throw new NullPointerException("Null collapseOption");
                    }
                    throw new NullPointerException("Null infoDialogDismissText");
                }
                throw new NullPointerException("Null infoDialogText");
            }
            throw new NullPointerException("Null infoDialogTitle");
        }
        throw new NullPointerException("Null buttonTitle");
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

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.a.equals(eVar.a()) && this.b.equals(eVar.b()) && this.c.equals(eVar.c()) && this.d.equals(eVar.d()) && this.e == eVar.e() && this.f == eVar.f() && this.g.equals(eVar.g());
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SectionHeaderExtras{buttonTitle=");
        sb.append(this.a);
        sb.append(", infoDialogTitle=");
        sb.append(this.b);
        sb.append(", infoDialogText=");
        sb.append(this.c);
        sb.append(", infoDialogDismissText=");
        sb.append(this.d);
        sb.append(", collapsable=");
        sb.append(this.e);
        sb.append(", collapsed=");
        sb.append(this.f);
        sb.append(", collapseOption=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
