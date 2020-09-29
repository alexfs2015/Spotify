package defpackage;

/* renamed from: vtz reason: default package */
final class vtz extends vuj {
    private final boolean a;

    /* renamed from: vtz$a */
    static final class a extends defpackage.vuj.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vuj.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vuj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" mercuryPremiumHubsPageBackendV3Android");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtz(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtz(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtz(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vuj) {
            if (this.a == ((vuj) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumDestinationProperties{mercuryPremiumHubsPageBackendV3Android=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
