package defpackage;

/* renamed from: vgk reason: default package */
final class vgk extends vfe {
    private final boolean a;

    /* renamed from: vgk$a */
    static final class a extends defpackage.vfe.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vfe.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vfe a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showRefreshHeaderInsteadOfPlaylistHeader");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgk(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgk(boolean z, byte b) {
        this(z);
    }

    private vgk(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsPlaylistEntityModesVanillaProperties{showRefreshHeaderInsteadOfPlaylistHeader=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfe) {
            if (this.a == ((vfe) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
