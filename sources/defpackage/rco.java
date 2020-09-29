package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: rco reason: default package */
abstract class rco extends rdc {
    final boolean a;
    final int b;
    final int c;
    final ImmutableList<MusicItem> d;
    final MusicItem e;
    final rdb f;
    final rdc g;

    /* renamed from: rco$a */
    static final class a extends defpackage.rdc.a {
        private Boolean a;
        private Integer b;
        private Integer c;
        private ImmutableList<MusicItem> d;
        private MusicItem e;
        private rdb f;
        private rdc g;

        a() {
        }

        private a(rdc rdc) {
            this.a = Boolean.valueOf(rdc.a());
            this.b = Integer.valueOf(rdc.b());
            this.c = Integer.valueOf(rdc.c());
            this.d = rdc.d();
            this.e = rdc.e();
            this.f = rdc.f();
            this.g = rdc.g();
        }

        /* synthetic */ a(rdc rdc, byte b2) {
            this(rdc);
        }

        public final defpackage.rdc.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.rdc.a a(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.rdc.a a(MusicItem musicItem) {
            if (musicItem != null) {
                this.e = musicItem;
                return this;
            }
            throw new NullPointerException("Null placeholder");
        }

        public final defpackage.rdc.a a(rdb rdb) {
            this.f = rdb;
            return this;
        }

        public final defpackage.rdc.a a(rdc rdc) {
            this.g = rdc;
            return this;
        }

        public final defpackage.rdc.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final rdc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isLoading");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" dataSourceCount");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" dataSourceOffset");
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
                sb5.append(" placeholder");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                rcz rcz = new rcz(this.a.booleanValue(), this.b.intValue(), this.c.intValue(), this.d, this.e, this.f, this.g);
                return rcz;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.rdc.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    rco(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, MusicItem musicItem, rdb rdb, rdc rdc) {
        this.a = z;
        this.b = i;
        this.c = i2;
        if (immutableList != null) {
            this.d = immutableList;
            if (musicItem != null) {
                this.e = musicItem;
                this.f = rdb;
                this.g = rdc;
                return;
            }
            throw new NullPointerException("Null placeholder");
        }
        throw new NullPointerException("Null items");
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final ImmutableList<MusicItem> d() {
        return this.d;
    }

    public final MusicItem e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdc) {
            rdc rdc = (rdc) obj;
            if (this.a == rdc.a() && this.b == rdc.b() && this.c == rdc.c() && this.d.equals(rdc.d()) && this.e.equals(rdc.e())) {
                rdb rdb = this.f;
                if (rdb != null ? rdb.equals(rdc.f()) : rdc.f() == null) {
                    rdc rdc2 = this.g;
                    return rdc2 != null ? rdc2.equals(rdc.g()) : rdc.g() == null;
                }
            }
        }
    }

    public final rdb f() {
        return this.f;
    }

    public final rdc g() {
        return this.g;
    }

    public final defpackage.rdc.a h() {
        return new a(this, 0);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        rdb rdb = this.f;
        int i = 0;
        int hashCode2 = (hashCode ^ (rdb == null ? 0 : rdb.hashCode())) * 1000003;
        rdc rdc = this.g;
        if (rdc != null) {
            i = rdc.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSourceViewport{isLoading=");
        sb.append(this.a);
        sb.append(", dataSourceCount=");
        sb.append(this.b);
        sb.append(", dataSourceOffset=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", placeholder=");
        sb.append(this.e);
        sb.append(", dataSourceConfiguration=");
        sb.append(this.f);
        sb.append(", next=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
