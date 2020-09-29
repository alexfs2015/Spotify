package defpackage;

/* renamed from: tzh reason: default package */
abstract class tzh extends b {
    final int a;
    final int b;
    final C0080b c;

    /* renamed from: tzh$a */
    static final class a extends defpackage.tzo.b.a {
        private Integer a;
        private Integer b;
        private C0080b c;

        a() {
        }

        public final defpackage.tzo.b.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.tzo.b.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.tzo.b.a a(C0080b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null identifiers");
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" portrait");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" landscape");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" identifiers");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new tzk(this.a.intValue(), this.b.intValue(), this.c);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    tzh(int i, int i2, C0080b bVar) {
        this.a = i;
        this.b = i2;
        if (bVar != null) {
            this.c = bVar;
            return;
        }
        throw new NullPointerException("Null identifiers");
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final C0080b c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Layout{portrait=");
        sb.append(this.a);
        sb.append(", landscape=");
        sb.append(this.b);
        sb.append(", identifiers=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a == bVar.a() && this.b == bVar.b() && this.c.equals(bVar.c());
        }
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }
}
