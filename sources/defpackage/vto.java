package defpackage;

/* renamed from: vto reason: default package */
final class vto extends vse {
    private final boolean a;

    /* renamed from: vto$a */
    static final class a extends defpackage.vse.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vse.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vse a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showRefreshHeaderInsteadOfPlaylistHeader");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vto(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vto(boolean z) {
        this.a = z;
    }

    /* synthetic */ vto(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vse) {
            if (this.a == ((vse) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsPlaylistEntityModesVanillaProperties{showRefreshHeaderInsteadOfPlaylistHeader=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
