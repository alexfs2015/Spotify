package defpackage;

/* renamed from: vtp reason: default package */
final class vtp extends vsh {
    private final boolean a;

    /* renamed from: vtp$a */
    static final class a extends defpackage.vsh.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vsh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vsh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" alwaysShowBackgroundStartNotification");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtp(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtp(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtp(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsh) {
            if (this.a == ((vsh) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsServiceforegroundstarterProperties{alwaysShowBackgroundStartNotification=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
