package defpackage;

/* renamed from: oaf reason: default package */
final class oaf extends oaj {
    private final boolean a;

    /* renamed from: oaf$a */
    static final class a implements defpackage.oaj.a {
        private Boolean a;

        a() {
        }

        public final defpackage.oaj.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final oaj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showArtistCarousel");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new oaf(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private oaf(boolean z) {
        this.a = z;
    }

    /* synthetic */ oaf(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oaj) {
            if (this.a == ((oaj) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissedConnectionsItemListConfiguration{showArtistCarousel=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
