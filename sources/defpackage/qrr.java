package defpackage;

/* renamed from: qrr reason: default package */
final class qrr extends qsi {
    private final int a;
    private final int b;

    /* renamed from: qrr$a */
    static final class a extends defpackage.qsi.a {
        private Integer a;
        private Integer b;

        a() {
        }

        public final defpackage.qsi.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final qsi a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artistPosition");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" shelfPosition");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new qrr(this.a.intValue(), this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.qsi.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    private qrr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* synthetic */ qrr(int i, int i2, byte b2) {
        this(i, i2);
    }

    public final int a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qsi) {
            qsi qsi = (qsi) obj;
            return this.a == qsi.a() && this.b == qsi.c();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelfArtistPosition{artistPosition=");
        sb.append(this.a);
        sb.append(", shelfPosition=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
