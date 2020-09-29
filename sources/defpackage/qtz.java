package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: qtz reason: default package */
abstract class qtz extends qun {
    final boolean a;
    final int b;
    final int c;
    final ImmutableList<MusicItem> d;
    final MusicItem e;
    final qum f;
    final qun g;

    /* renamed from: qtz$a */
    static final class a extends defpackage.qun.a {
        private Boolean a;
        private Integer b;
        private Integer c;
        private ImmutableList<MusicItem> d;
        private MusicItem e;
        private qum f;
        private qun g;

        /* synthetic */ a(qun qun, byte b2) {
            this(qun);
        }

        a() {
        }

        private a(qun qun) {
            this.a = Boolean.valueOf(qun.a());
            this.b = Integer.valueOf(qun.b());
            this.c = Integer.valueOf(qun.c());
            this.d = qun.d();
            this.e = qun.e();
            this.f = qun.f();
            this.g = qun.g();
        }

        public final defpackage.qun.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.qun.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.qun.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.qun.a a(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.qun.a a(MusicItem musicItem) {
            if (musicItem != null) {
                this.e = musicItem;
                return this;
            }
            throw new NullPointerException("Null placeholder");
        }

        public final defpackage.qun.a a(qum qum) {
            this.f = qum;
            return this;
        }

        public final defpackage.qun.a a(qun qun) {
            this.g = qun;
            return this;
        }

        public final qun a() {
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
                quk quk = new quk(this.a.booleanValue(), this.b.intValue(), this.c.intValue(), this.d, this.e, this.f, this.g);
                return quk;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    qtz(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, MusicItem musicItem, qum qum, qun qun) {
        this.a = z;
        this.b = i;
        this.c = i2;
        if (immutableList != null) {
            this.d = immutableList;
            if (musicItem != null) {
                this.e = musicItem;
                this.f = qum;
                this.g = qun;
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

    public final qum f() {
        return this.f;
    }

    public final qun g() {
        return this.g;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qun) {
            qun qun = (qun) obj;
            if (this.a == qun.a() && this.b == qun.b() && this.c == qun.c() && this.d.equals(qun.d()) && this.e.equals(qun.e())) {
                qum qum = this.f;
                if (qum != null ? qum.equals(qun.f()) : qun.f() == null) {
                    qun qun2 = this.g;
                    return qun2 != null ? qun2.equals(qun.g()) : qun.g() == null;
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        qum qum = this.f;
        int i = 0;
        int hashCode2 = (hashCode ^ (qum == null ? 0 : qum.hashCode())) * 1000003;
        qun qun = this.g;
        if (qun != null) {
            i = qun.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final defpackage.qun.a h() {
        return new a(this, 0);
    }
}
