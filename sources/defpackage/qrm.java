package defpackage;

/* renamed from: qrm reason: default package */
final class qrm extends qrl {
    private final int a;

    /* renamed from: qrm$a */
    static final class a extends defpackage.qrl.a {
        private Integer a;

        a() {
        }

        public final defpackage.qrl.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final qrl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" position");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new qrm(this.a.intValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private qrm(int i) {
        this.a = i;
    }

    /* synthetic */ qrm(int i, byte b) {
        this(i);
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qrl) {
            if (this.a == ((qrl) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistPosition{position=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
