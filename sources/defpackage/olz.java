package defpackage;

/* renamed from: olz reason: default package */
final class olz extends b {
    private final int a;
    private final int b;

    /* renamed from: olz$a */
    static final class a extends defpackage.oml.b.a {
        private Integer a;
        private Integer b;

        a() {
        }

        public final defpackage.oml.b.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sectionId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" positionWithinSection");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new olz(this.a.intValue(), this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.oml.b.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    private olz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* synthetic */ olz(int i, int i2, byte b2) {
        this(i, i2);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a == bVar.a() && this.b == bVar.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionAndPosition{sectionId=");
        sb.append(this.a);
        sb.append(", positionWithinSection=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
