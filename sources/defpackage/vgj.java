package defpackage;

/* renamed from: vgj reason: default package */
final class vgj extends vfb {
    private final boolean a;

    /* renamed from: vgj$a */
    static final class a extends defpackage.vfb.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vfb.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vfb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showRefreshHeaderInsteadOfP2sHeader");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgj(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgj(boolean z, byte b) {
        this(z);
    }

    private vgj(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsPlaylistEntityModesP2sProperties{showRefreshHeaderInsteadOfP2sHeader=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfb) {
            if (this.a == ((vfb) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
