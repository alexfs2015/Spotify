package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: mqy reason: default package */
final class mqy extends mrc {
    private final String a;
    private final String b;
    private final ImmutableList<mqw> c;

    /* renamed from: mqy$a */
    public static final class a extends defpackage.mrc.a {
        private String a;
        private String b;
        private ImmutableList<mqw> c;

        /* synthetic */ a(mrc mrc, byte b2) {
            this(mrc);
        }

        public a() {
        }

        private a(mrc mrc) {
            this.a = mrc.a();
            this.b = mrc.b();
            this.c = mrc.c();
        }

        public final defpackage.mrc.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.mrc.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.mrc.a a(ImmutableList<mqw> immutableList) {
            if (immutableList != null) {
                this.c = immutableList;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public final mrc a() {
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
                return new mqy(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ mqy(String str, String str2, ImmutableList immutableList, byte b2) {
        this(str, str2, immutableList);
    }

    private mqy(String str, String str2, ImmutableList<mqw> immutableList) {
        this.a = str;
        this.b = str2;
        this.c = immutableList;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ImmutableList<mqw> c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrc) {
            mrc mrc = (mrc) obj;
            return this.a.equals(mrc.a()) && this.b.equals(mrc.b()) && this.c.equals(mrc.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final defpackage.mrc.a d() {
        return new a(this, 0);
    }
}
