package defpackage;

/* renamed from: vtn reason: default package */
final class vtn extends vsb {
    private final boolean a;

    /* renamed from: vtn$a */
    static final class a extends defpackage.vsb.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vsb.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vsb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showRefreshHeaderInsteadOfP2sHeader");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtn(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtn(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtn(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsb) {
            if (this.a == ((vsb) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsPlaylistEntityModesP2sProperties{showRefreshHeaderInsteadOfP2sHeader=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
