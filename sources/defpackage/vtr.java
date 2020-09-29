package defpackage;

/* renamed from: vtr reason: default package */
final class vtr extends vsm {
    private final boolean a;

    /* renamed from: vtr$a */
    static final class a extends defpackage.vsm.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vsm.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vsm a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableFloatingSnackbar");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtr(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtr(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtr(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsm) {
            if (this.a == ((vsm) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsToastieProperties{enableFloatingSnackbar=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
