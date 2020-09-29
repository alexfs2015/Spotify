package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: pqc reason: default package */
final class pqc extends pqh {
    private final pqd b;
    private final ImmutableMap<String, String> c;
    private final String d;

    /* renamed from: pqc$a */
    static final class a implements defpackage.pqh.a {
        private pqd a;
        private ImmutableMap<String, String> b;
        private String c;

        /* synthetic */ a(pqh pqh, byte b2) {
            this(pqh);
        }

        a() {
        }

        private a(pqh pqh) {
            this.a = pqh.a();
            this.b = pqh.b();
            this.c = pqh.c();
        }

        public final defpackage.pqh.a a(pqd pqd) {
            if (pqd != null) {
                this.a = pqd;
                return this;
            }
            throw new NullPointerException("Null displayMode");
        }

        public final defpackage.pqh.a a(ImmutableMap<String, String> immutableMap) {
            if (immutableMap != null) {
                this.b = immutableMap;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public final defpackage.pqh.a a(String str) {
            this.c = str;
            return this;
        }

        public final pqh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" displayMode");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" events");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new pqc(this.a, this.b, this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ pqc(pqd pqd, ImmutableMap immutableMap, String str, byte b2) {
        this(pqd, immutableMap, str);
    }

    private pqc(pqd pqd, ImmutableMap<String, String> immutableMap, String str) {
        this.b = pqd;
        this.c = immutableMap;
        this.d = str;
    }

    public final pqd a() {
        return this.b;
    }

    public final ImmutableMap<String, String> b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewToolModel{displayMode=");
        sb.append(this.b);
        sb.append(", events=");
        sb.append(this.c);
        sb.append(", errorMessage=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pqh) {
            pqh pqh = (pqh) obj;
            if (this.b.equals(pqh.a()) && this.c.equals(pqh.b())) {
                String str = this.d;
                return str != null ? str.equals(pqh.c()) : pqh.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final defpackage.pqh.a d() {
        return new a(this, 0);
    }
}
