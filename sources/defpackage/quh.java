package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;

/* renamed from: quh reason: default package */
final class quh extends defpackage.que.a {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Optional<SortOrder> e;

    /* renamed from: quh$a */
    static final class a extends C0075a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Optional<SortOrder> d;

        /* synthetic */ a(defpackage.que.a aVar, byte b2) {
            this(aVar);
        }

        a() {
            this.d = Optional.e();
        }

        private a(defpackage.que.a aVar) {
            this.d = Optional.e();
            this.a = Boolean.valueOf(aVar.a());
            this.b = Boolean.valueOf(aVar.b());
            this.c = Boolean.valueOf(aVar.c());
            this.d = aVar.d();
        }

        public final C0075a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final C0075a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final C0075a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final C0075a a(Optional<SortOrder> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final defpackage.que.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" includeFollowed");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" includeInCollection");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" addFollowButton");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                quh quh = new quh(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, 0);
                return quh;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ quh(boolean z, boolean z2, boolean z3, Optional optional, byte b2) {
        this(z, z2, z3, optional);
    }

    private quh(boolean z, boolean z2, boolean z3, Optional<SortOrder> optional) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = optional;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final Optional<SortOrder> d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{includeFollowed=");
        sb.append(this.b);
        sb.append(", includeInCollection=");
        sb.append(this.c);
        sb.append(", addFollowButton=");
        sb.append(this.d);
        sb.append(", sortOrder=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.que.a) {
            defpackage.que.a aVar = (defpackage.que.a) obj;
            return this.b == aVar.a() && this.c == aVar.b() && this.d == aVar.c() && this.e.equals(aVar.d());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final C0075a e() {
        return new a(this, 0);
    }
}
