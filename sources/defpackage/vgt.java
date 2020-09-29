package defpackage;

/* renamed from: vgt reason: default package */
final class vgt extends vhb {
    private final boolean a;

    /* renamed from: vgt$a */
    static final class a extends defpackage.vhb.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vhb.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vhb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enablePartnerAccountLinkingDialog");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgt(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgt(boolean z, byte b) {
        this(z);
    }

    private vgt(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccountLinkingProperties{enablePartnerAccountLinkingDialog=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vhb) {
            if (this.a == ((vhb) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
