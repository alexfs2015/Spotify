package defpackage;

/* renamed from: vte reason: default package */
final class vte extends vre {
    private final boolean a;

    /* renamed from: vte$a */
    static final class a extends defpackage.vre.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vre.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vre a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" allowP2sPlaylistsToBeTemporaryOnDemandInFreeWhenDeeplinkingToThem");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vte(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vte(boolean z) {
        this.a = z;
    }

    /* synthetic */ vte(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vre) {
            if (this.a == ((vre) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidFeaturePlaylistEntityProperties{allowP2sPlaylistsToBeTemporaryOnDemandInFreeWhenDeeplinkingToThem=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
