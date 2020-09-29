package defpackage;

import com.google.common.base.Optional;

/* renamed from: tww reason: default package */
final class tww extends defpackage.txf.a {
    private final String b;
    private final Optional<String> c;
    private final Optional<String> d;
    private final Optional<Long> e;

    /* renamed from: tww$a */
    static final class a implements C0079a {
        private String a;
        private Optional<String> b;
        private Optional<String> c;
        private Optional<Long> d;

        /* synthetic */ a(defpackage.txf.a aVar, byte b2) {
            this(aVar);
        }

        a() {
            this.b = Optional.e();
            this.c = Optional.e();
            this.d = Optional.e();
        }

        private a(defpackage.txf.a aVar) {
            this.b = Optional.e();
            this.c = Optional.e();
            this.d = Optional.e();
            this.a = aVar.a();
            this.b = aVar.b();
            this.c = aVar.c();
            this.d = aVar.d();
        }

        public final C0079a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null previewId");
        }

        public final C0079a a(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null previewKey");
        }

        public final C0079a b(Optional<String> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final C0079a c(Optional<Long> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null maxDuration");
        }

        public final defpackage.txf.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" previewId");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                tww tww = new tww(this.a, this.b, this.c, this.d, 0);
                return tww;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ tww(String str, Optional optional, Optional optional2, Optional optional3, byte b2) {
        this(str, optional, optional2, optional3);
    }

    private tww(String str, Optional<String> optional, Optional<String> optional2, Optional<Long> optional3) {
        this.b = str;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
    }

    public final String a() {
        return this.b;
    }

    public final Optional<String> b() {
        return this.c;
    }

    public final Optional<String> c() {
        return this.d;
    }

    public final Optional<Long> d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewAction{previewId=");
        sb.append(this.b);
        sb.append(", previewKey=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.d);
        sb.append(", maxDuration=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.txf.a) {
            defpackage.txf.a aVar = (defpackage.txf.a) obj;
            return this.b.equals(aVar.a()) && this.c.equals(aVar.b()) && this.d.equals(aVar.c()) && this.e.equals(aVar.d());
        }
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final C0079a e() {
        return new a(this, 0);
    }
}
