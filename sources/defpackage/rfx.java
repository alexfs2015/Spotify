package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;

/* renamed from: rfx reason: default package */
public abstract class rfx extends MusicItem {
    final long a;
    final Type b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    final String g;
    final String h;
    final String i;
    final String j;
    final int k;
    final int l;
    final Boolean m;
    final vli n;
    final b o;
    private final String q;

    /* renamed from: rfx$a */
    public static final class a extends com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a {
        private Long a;
        private Type b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private Integer l;
        private Integer m;
        private Boolean n;
        private vli o;
        private b p;

        public a() {
        }

        private a(MusicItem musicItem) {
            this.a = Long.valueOf(musicItem.b());
            this.b = musicItem.a();
            this.c = Boolean.valueOf(musicItem.d());
            this.d = Boolean.valueOf(musicItem.e());
            this.e = Boolean.valueOf(musicItem.f());
            this.f = Boolean.valueOf(musicItem.g());
            this.g = musicItem.h();
            this.h = musicItem.i();
            this.i = musicItem.j();
            this.j = musicItem.k();
            this.k = musicItem.l();
            this.l = Integer.valueOf(musicItem.m());
            this.m = Integer.valueOf(musicItem.n());
            this.n = musicItem.o();
            this.o = musicItem.p();
            this.p = musicItem.q();
        }

        /* synthetic */ a(MusicItem musicItem, byte b2) {
            this(musicItem);
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(int i2) {
            this.l = Integer.valueOf(0);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(Type type) {
            if (type != null) {
                this.b = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(b bVar) {
            this.p = bVar;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(Boolean bool) {
            this.n = bool;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(vli vli) {
            this.o = vli;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a a(boolean z) {
            this.c = Boolean.TRUE;
            return this;
        }

        public final MusicItem a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uniqueId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" type");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isEnabled");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" followed");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" showFollow");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isFollowDisabled");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" title");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" subtitle");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" uri");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" targetUri");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" imageUri");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" addTime");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" indexInDataSource");
                str = sb13.toString();
            }
            if (str.isEmpty()) {
                rgb rgb = new rgb(this.a.longValue(), this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue(), this.m.intValue(), this.n, this.o, this.p);
                return rgb;
            }
            StringBuilder sb14 = new StringBuilder("Missing required properties:");
            sb14.append(str);
            throw new IllegalStateException(sb14.toString());
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a b(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a b(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a b(boolean z) {
            this.d = Boolean.FALSE;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a c(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a c(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a d(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null targetUri");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a d(boolean z) {
            this.f = Boolean.FALSE;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a e(String str) {
            if (str != null) {
                this.k = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }
    }

    rfx(long j2, Type type, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, int i2, int i3, Boolean bool, vli vli, b bVar) {
        Type type2 = type;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        this.a = j2;
        if (type2 != null) {
            this.b = type2;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            if (str6 != null) {
                this.g = str6;
                if (str7 != null) {
                    this.h = str7;
                    if (str8 != null) {
                        this.q = str8;
                        if (str9 != null) {
                            this.i = str9;
                            if (str10 != null) {
                                this.j = str10;
                                this.k = i2;
                                this.l = i3;
                                this.m = bool;
                                this.n = vli;
                                this.o = bVar;
                                return;
                            }
                            throw new NullPointerException("Null imageUri");
                        }
                        throw new NullPointerException("Null targetUri");
                    }
                    throw new NullPointerException("Null uri");
                }
                throw new NullPointerException("Null subtitle");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null type");
    }

    public final /* bridge */ /* synthetic */ Enum a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final Type c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MusicItem) {
            MusicItem musicItem = (MusicItem) obj;
            if (this.a == musicItem.b() && this.b.equals(musicItem.a()) && this.c == musicItem.d() && this.d == musicItem.e() && this.e == musicItem.f() && this.f == musicItem.g() && this.g.equals(musicItem.h()) && this.h.equals(musicItem.i()) && this.q.equals(musicItem.j()) && this.i.equals(musicItem.k()) && this.j.equals(musicItem.l()) && this.k == musicItem.m() && this.l == musicItem.n()) {
                Boolean bool = this.m;
                if (bool != null ? bool.equals(musicItem.o()) : musicItem.o() == null) {
                    vli vli = this.n;
                    if (vli != null ? vli.equals(musicItem.p()) : musicItem.p() == null) {
                        b bVar = this.o;
                        return bVar != null ? bVar.equals(musicItem.q()) : musicItem.q() == null;
                    }
                }
            }
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = 1231;
        int hashCode = (((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i2 = 1237;
        }
        int hashCode2 = (((((((((((((((hashCode ^ i2) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003;
        Boolean bool = this.m;
        int i3 = 0;
        int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        vli vli = this.n;
        int hashCode4 = (hashCode3 ^ (vli == null ? 0 : vli.hashCode())) * 1000003;
        b bVar = this.o;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public final String i() {
        return this.h;
    }

    public String j() {
        return this.q;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.j;
    }

    public final int m() {
        return this.k;
    }

    public final int n() {
        return this.l;
    }

    public final Boolean o() {
        return this.m;
    }

    public final vli p() {
        return this.n;
    }

    public final b q() {
        return this.o;
    }

    public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a r() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MusicItem{uniqueId=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        sb.append(this.c);
        sb.append(", followed=");
        sb.append(this.d);
        sb.append(", showFollow=");
        sb.append(this.e);
        sb.append(", isFollowDisabled=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", subtitle=");
        sb.append(this.h);
        sb.append(", uri=");
        sb.append(this.q);
        sb.append(", targetUri=");
        sb.append(this.i);
        sb.append(", imageUri=");
        sb.append(this.j);
        sb.append(", addTime=");
        sb.append(this.k);
        sb.append(", indexInDataSource=");
        sb.append(this.l);
        sb.append(", isOnDemand=");
        sb.append(this.m);
        sb.append(", offlineState=");
        sb.append(this.n);
        sb.append(", extras=");
        sb.append(this.o);
        sb.append("}");
        return sb.toString();
    }
}
