package defpackage;

/* renamed from: vti reason: default package */
final class vti extends vro {
    private final boolean a;

    /* renamed from: vti$a */
    static final class a extends defpackage.vro.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vro.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vro a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableNetworklessAuthAndroid");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vti(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vti(boolean z) {
        this.a = z;
    }

    /* synthetic */ vti(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vro) {
            if (this.a == ((vro) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsBuiltInAuthProperties{enableNetworklessAuthAndroid=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
