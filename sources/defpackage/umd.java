package defpackage;

/* renamed from: umd reason: default package */
abstract class umd extends C0082b {
    final int a;
    final int b;
    final int c;
    final int d;

    /* renamed from: umd$a */
    static final class a extends defpackage.umj.b.C0082b.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        a() {
        }

        public final defpackage.umj.b.C0082b.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final C0082b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" subtitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" action");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" image");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new umg(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue());
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.umj.b.C0082b.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.umj.b.C0082b.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.umj.b.C0082b.a d(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    umd(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0082b) {
            C0082b bVar = (C0082b) obj;
            return this.a == bVar.a() && this.b == bVar.b() && this.c == bVar.c() && this.d == bVar.d();
        }
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Identifiers{title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
