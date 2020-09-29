package defpackage;

/* renamed from: vty reason: default package */
final class vty extends vug {
    private final boolean a;

    /* renamed from: vty$a */
    static final class a extends defpackage.vug.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vug.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vug a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enablePartnerAccountLinkingDialog");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vty(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vty(boolean z) {
        this.a = z;
    }

    /* synthetic */ vty(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vug) {
            if (this.a == ((vug) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccountLinkingProperties{enablePartnerAccountLinkingDialog=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
