package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsTrack;

/* renamed from: rhk reason: default package */
final class rhk extends rho {
    private final String b;
    private final int c;
    private final boolean d;
    private final ImmutableList<String> e;
    private final ImmutableList<RecsTrack> f;
    private final ImmutableList<MusicItem> g;
    private final ImmutableList<MusicItem> h;
    private final Optional<Boolean> i;

    /* renamed from: rhk$a */
    static final class a extends defpackage.rho.a {
        private String a;
        private Integer b;
        private Boolean c;
        private ImmutableList<String> d;
        private ImmutableList<RecsTrack> e;
        private ImmutableList<MusicItem> f;
        private ImmutableList<MusicItem> g;
        private Optional<Boolean> h;

        a() {
            this.h = Optional.e();
        }

        private a(rho rho) {
            this.h = Optional.e();
            this.a = rho.a();
            this.b = Integer.valueOf(rho.b());
            this.c = Boolean.valueOf(rho.c());
            this.d = rho.d();
            this.e = rho.e();
            this.f = rho.f();
            this.g = rho.g();
            this.h = rho.h();
        }

        /* synthetic */ a(rho rho, byte b2) {
            this(rho);
        }

        public final defpackage.rho.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.rho.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.h = optional;
                return this;
            }
            throw new NullPointerException("Null connected");
        }

        public final defpackage.rho.a a(ImmutableList<String> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null sourceTrackUris");
        }

        public final defpackage.rho.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public final defpackage.rho.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final rho a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" contextUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" fillUpToCount");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" recsRequested");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" sourceTrackUris");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" rawRecs");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" decoratedRecs");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" recs");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                rhk rhk = new rhk(this.a, this.b.intValue(), this.c.booleanValue(), this.d, this.e, this.f, this.g, this.h, 0);
                return rhk;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }

        public final defpackage.rho.a b(ImmutableList<RecsTrack> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null rawRecs");
        }

        public final defpackage.rho.a c(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.f = immutableList;
                return this;
            }
            throw new NullPointerException("Null decoratedRecs");
        }

        public final defpackage.rho.a d(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.g = immutableList;
                return this;
            }
            throw new NullPointerException("Null recs");
        }
    }

    private rhk(String str, int i2, boolean z, ImmutableList<String> immutableList, ImmutableList<RecsTrack> immutableList2, ImmutableList<MusicItem> immutableList3, ImmutableList<MusicItem> immutableList4, Optional<Boolean> optional) {
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = immutableList;
        this.f = immutableList2;
        this.g = immutableList3;
        this.h = immutableList4;
        this.i = optional;
    }

    /* synthetic */ rhk(String str, int i2, boolean z, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, Optional optional, byte b2) {
        this(str, i2, z, immutableList, immutableList2, immutableList3, immutableList4, optional);
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final ImmutableList<String> d() {
        return this.e;
    }

    public final ImmutableList<RecsTrack> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rho) {
            rho rho = (rho) obj;
            return this.b.equals(rho.a()) && this.c == rho.b() && this.d == rho.c() && this.e.equals(rho.d()) && this.f.equals(rho.e()) && this.g.equals(rho.f()) && this.h.equals(rho.g()) && this.i.equals(rho.h());
        }
    }

    public final ImmutableList<MusicItem> f() {
        return this.g;
    }

    public final ImmutableList<MusicItem> g() {
        return this.h;
    }

    public final Optional<Boolean> h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final defpackage.rho.a i() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecsDataSourceModel{contextUri=");
        sb.append(this.b);
        sb.append(", fillUpToCount=");
        sb.append(this.c);
        sb.append(", recsRequested=");
        sb.append(this.d);
        sb.append(", sourceTrackUris=");
        sb.append(this.e);
        sb.append(", rawRecs=");
        sb.append(this.f);
        sb.append(", decoratedRecs=");
        sb.append(this.g);
        sb.append(", recs=");
        sb.append(this.h);
        sb.append(", connected=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
