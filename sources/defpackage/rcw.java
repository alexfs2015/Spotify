package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;

/* renamed from: rcw reason: default package */
final class rcw extends defpackage.rct.a {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Optional<SortOrder> e;

    /* renamed from: rcw$a */
    static final class a extends C0077a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Optional<SortOrder> d;

        a() {
            this.d = Optional.e();
        }

        private a(defpackage.rct.a aVar) {
            this.d = Optional.e();
            this.a = Boolean.valueOf(aVar.a());
            this.b = Boolean.valueOf(aVar.b());
            this.c = Boolean.valueOf(aVar.c());
            this.d = aVar.d();
        }

        /* synthetic */ a(defpackage.rct.a aVar, byte b2) {
            this(aVar);
        }

        public final C0077a a(Optional<SortOrder> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final C0077a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rct.a a() {
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
                rcw rcw = new rcw(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, 0);
                return rcw;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final C0077a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final C0077a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    private rcw(boolean z, boolean z2, boolean z3, Optional<SortOrder> optional) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = optional;
    }

    /* synthetic */ rcw(boolean z, boolean z2, boolean z3, Optional optional, byte b2) {
        this(z, z2, z3, optional);
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

    public final C0077a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rct.a) {
            defpackage.rct.a aVar = (defpackage.rct.a) obj;
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
}
