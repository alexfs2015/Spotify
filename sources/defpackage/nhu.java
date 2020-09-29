package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;

/* renamed from: nhu reason: default package */
final class nhu extends nhz {
    private final nia b;
    private final kxx c;
    private final RecentlyPlayedItems d;

    /* renamed from: nhu$a */
    static final class a implements defpackage.nhz.a {
        private nia a;
        private kxx b;
        private RecentlyPlayedItems c;

        /* synthetic */ a(nhz nhz, byte b2) {
            this(nhz);
        }

        a() {
        }

        private a(nhz nhz) {
            this.a = nhz.a();
            this.b = nhz.b();
            this.c = nhz.c();
        }

        public final defpackage.nhz.a a(nia nia) {
            if (nia != null) {
                this.a = nia;
                return this;
            }
            throw new NullPointerException("Null homeViewState");
        }

        public final defpackage.nhz.a a(kxx kxx) {
            if (kxx != null) {
                this.b = kxx;
                return this;
            }
            throw new NullPointerException("Null connectionState");
        }

        public final defpackage.nhz.a a(RecentlyPlayedItems recentlyPlayedItems) {
            if (recentlyPlayedItems != null) {
                this.c = recentlyPlayedItems;
                return this;
            }
            throw new NullPointerException("Null recentlyPlayedItems");
        }

        public final nhz a() {
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
                return new nhu(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ nhu(nia nia, kxx kxx, RecentlyPlayedItems recentlyPlayedItems, byte b2) {
        this(nia, kxx, recentlyPlayedItems);
    }

    private nhu(nia nia, kxx kxx, RecentlyPlayedItems recentlyPlayedItems) {
        this.b = nia;
        this.c = kxx;
        this.d = recentlyPlayedItems;
    }

    public final nia a() {
        return this.b;
    }

    public final kxx b() {
        return this.c;
    }

    public final RecentlyPlayedItems c() {
        return this.d;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nhz) {
            nhz nhz = (nhz) obj;
            return this.b.equals(nhz.a()) && this.c.equals(nhz.b()) && this.d.equals(nhz.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final defpackage.nhz.a d() {
        return new a(this, 0);
    }
}
