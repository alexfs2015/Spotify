package defpackage;

/* renamed from: nts reason: default package */
final class nts extends ntw {
    private final boolean a;

    /* renamed from: nts$a */
    static final class a implements defpackage.ntw.a {
        private Boolean a;

        a() {
        }

        public final defpackage.ntw.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ntw a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showArtistCarousel");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new nts(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ nts(boolean z, byte b) {
        this(z);
    }

    private nts(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissedConnectionsItemListConfiguration{showArtistCarousel=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntw) {
            if (this.a == ((ntw) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
