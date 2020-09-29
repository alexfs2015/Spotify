package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: mvo reason: default package */
final class mvo extends mvs {
    private final String a;
    private final String b;
    private final ImmutableList<mvm> c;

    /* renamed from: mvo$a */
    public static final class a extends defpackage.mvs.a {
        private String a;
        private String b;
        private ImmutableList<mvm> c;

        public a() {
        }

        private a(mvs mvs) {
            this.a = mvs.a();
            this.b = mvs.b();
            this.c = mvs.c();
        }

        /* synthetic */ a(mvs mvs, byte b2) {
            this(mvs);
        }

        public final defpackage.mvs.a a(ImmutableList<mvm> immutableList) {
            if (immutableList != null) {
                this.c = immutableList;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public final defpackage.mvs.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final mvs a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" artists");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new mvo(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.mvs.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    private mvo(String str, String str2, ImmutableList<mvm> immutableList) {
        this.a = str;
        this.b = str2;
        this.c = immutableList;
    }

    /* synthetic */ mvo(String str, String str2, ImmutableList immutableList, byte b2) {
        this(str, str2, immutableList);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ImmutableList<mvm> c() {
        return this.c;
    }

    public final defpackage.mvs.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvs) {
            mvs mvs = (mvs) obj;
            return this.a.equals(mvs.a()) && this.b.equals(mvs.b()) && this.c.equals(mvs.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRecommendation{id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", artists=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
