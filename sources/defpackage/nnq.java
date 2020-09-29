package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;

/* renamed from: nnq reason: default package */
final class nnq extends nnv {
    private final nnw b;
    private final lbg c;
    private final RecentlyPlayedItems d;

    /* renamed from: nnq$a */
    static final class a implements defpackage.nnv.a {
        private nnw a;
        private lbg b;
        private RecentlyPlayedItems c;

        a() {
        }

        private a(nnv nnv) {
            this.a = nnv.a();
            this.b = nnv.b();
            this.c = nnv.c();
        }

        /* synthetic */ a(nnv nnv, byte b2) {
            this(nnv);
        }

        public final defpackage.nnv.a a(RecentlyPlayedItems recentlyPlayedItems) {
            if (recentlyPlayedItems != null) {
                this.c = recentlyPlayedItems;
                return this;
            }
            throw new NullPointerException("Null recentlyPlayedItems");
        }

        public final defpackage.nnv.a a(lbg lbg) {
            if (lbg != null) {
                this.b = lbg;
                return this;
            }
            throw new NullPointerException("Null connectionState");
        }

        public final defpackage.nnv.a a(nnw nnw) {
            if (nnw != null) {
                this.a = nnw;
                return this;
            }
            throw new NullPointerException("Null homeViewState");
        }

        public final nnv a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" homeViewState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" connectionState");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" recentlyPlayedItems");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new nnq(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private nnq(nnw nnw, lbg lbg, RecentlyPlayedItems recentlyPlayedItems) {
        this.b = nnw;
        this.c = lbg;
        this.d = recentlyPlayedItems;
    }

    /* synthetic */ nnq(nnw nnw, lbg lbg, RecentlyPlayedItems recentlyPlayedItems, byte b2) {
        this(nnw, lbg, recentlyPlayedItems);
    }

    public final nnw a() {
        return this.b;
    }

    public final lbg b() {
        return this.c;
    }

    public final RecentlyPlayedItems c() {
        return this.d;
    }

    public final defpackage.nnv.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nnv) {
            nnv nnv = (nnv) obj;
            return this.b.equals(nnv.a()) && this.c.equals(nnv.b()) && this.d.equals(nnv.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeModel{homeViewState=");
        sb.append(this.b);
        sb.append(", connectionState=");
        sb.append(this.c);
        sb.append(", recentlyPlayedItems=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
