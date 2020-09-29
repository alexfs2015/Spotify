package defpackage;

/* renamed from: vgf reason: default package */
final class vgf extends ver {
    private final boolean a;

    /* renamed from: vgf$a */
    static final class a extends defpackage.ver.a {
        private Boolean a;

        a() {
        }

        public final defpackage.ver.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ver a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableNetworklessAuthAndroid");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgf(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgf(boolean z, byte b) {
        this(z);
    }

    private vgf(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsBuiltInAuthProperties{enableNetworklessAuthAndroid=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ver) {
            if (this.a == ((ver) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
