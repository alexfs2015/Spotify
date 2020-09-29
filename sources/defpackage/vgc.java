package defpackage;

/* renamed from: vgc reason: default package */
final class vgc extends vej {
    private final boolean a;

    /* renamed from: vgc$a */
    static final class a extends defpackage.vej.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vej.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vej a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" allowP2sPlaylistsToBeTemporaryOnDemandInFreeWhenDeeplinkingToThem");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgc(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgc(boolean z, byte b) {
        this(z);
    }

    private vgc(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidFeaturePlaylistEntityProperties{allowP2sPlaylistsToBeTemporaryOnDemandInFreeWhenDeeplinkingToThem=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vej) {
            if (this.a == ((vej) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
