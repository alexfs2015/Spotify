package defpackage;

/* renamed from: qjd reason: default package */
final class qjd extends qjc {
    private final int a;

    /* renamed from: qjd$a */
    static final class a extends defpackage.qjc.a {
        private Integer a;

        a() {
        }

        public final defpackage.qjc.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final qjc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" position");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new qjd(this.a.intValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ qjd(int i, byte b) {
        this(i);
    }

    private qjd(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistPosition{position=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjc) {
            if (this.a == ((qjc) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }
}
