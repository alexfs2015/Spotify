package defpackage;

/* renamed from: qji reason: default package */
final class qji extends qjz {
    private final int a;
    private final int b;

    /* renamed from: qji$a */
    static final class a extends defpackage.qjz.a {
        private Integer a;
        private Integer b;

        a() {
        }

        public final defpackage.qjz.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.qjz.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final qjz a() {
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
                return new qji(this.a.intValue(), this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ qji(int i, int i2, byte b2) {
        this(i, i2);
    }

    private qji(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelfArtistPosition{artistPosition=");
        sb.append(this.a);
        sb.append(", shelfPosition=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjz) {
            qjz qjz = (qjz) obj;
            return this.a == qjz.a() && this.b == qjz.c();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
