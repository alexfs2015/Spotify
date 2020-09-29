package defpackage;

/* renamed from: vgl reason: default package */
final class vgl extends vfh {
    private final boolean a;

    /* renamed from: vgl$a */
    static final class a extends defpackage.vfh.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vfh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vfh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" alwaysShowBackgroundStartNotification");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgl(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgl(boolean z, byte b) {
        this(z);
    }

    private vgl(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsServiceforegroundstarterProperties{alwaysShowBackgroundStartNotification=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfh) {
            if (this.a == ((vfh) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
