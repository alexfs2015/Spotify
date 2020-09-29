package defpackage;

/* renamed from: vfz reason: default package */
final class vfz extends vea {
    private final boolean a;

    /* renamed from: vfz$a */
    static final class a extends defpackage.vea.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vea.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vea a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" androidAutoOfflineLibrary");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vfz(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vfz(boolean z, byte b) {
        this(z);
    }

    private vfz(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidExternalIntegrationLoadersProperties{androidAutoOfflineLibrary=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vea) {
            if (this.a == ((vea) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
