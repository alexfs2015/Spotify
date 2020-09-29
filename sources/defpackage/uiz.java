package defpackage;

import com.google.common.base.Optional;

/* renamed from: uiz reason: default package */
final class uiz extends defpackage.uji.a {
    private final String b;
    private final Optional<String> c;
    private final Optional<String> d;
    private final Optional<Long> e;

    /* renamed from: uiz$a */
    static final class a implements C0081a {
        private String a;
        private Optional<String> b;
        private Optional<String> c;
        private Optional<Long> d;

        a() {
            this.b = Optional.e();
            this.c = Optional.e();
            this.d = Optional.e();
        }

        private a(defpackage.uji.a aVar) {
            this.b = Optional.e();
            this.c = Optional.e();
            this.d = Optional.e();
            this.a = aVar.a();
            this.b = aVar.b();
            this.c = aVar.c();
            this.d = aVar.d();
        }

        /* synthetic */ a(defpackage.uji.a aVar, byte b2) {
            this(aVar);
        }

        public final C0081a a(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null previewKey");
        }

        public final C0081a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null previewId");
        }

        public final defpackage.uji.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" previewId");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                uiz uiz = new uiz(this.a, this.b, this.c, this.d, 0);
                return uiz;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final C0081a b(Optional<String> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final C0081a c(Optional<Long> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null maxDuration");
        }
    }

    private uiz(String str, Optional<String> optional, Optional<String> optional2, Optional<Long> optional3) {
        this.b = str;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
    }

    /* synthetic */ uiz(String str, Optional optional, Optional optional2, Optional optional3, byte b2) {
        this(str, optional, optional2, optional3);
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

    public final C0081a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uji.a) {
            defpackage.uji.a aVar = (defpackage.uji.a) obj;
            return this.b.equals(aVar.a()) && this.c.equals(aVar.b()) && this.d.equals(aVar.c()) && this.e.equals(aVar.d());
        }
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
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
}
