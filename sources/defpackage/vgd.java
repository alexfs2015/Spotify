package defpackage;

/* renamed from: vgd reason: default package */
final class vgd extends vem {
    private final boolean a;

    /* renamed from: vgd$a */
    static final class a extends defpackage.vem.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vem.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vem a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableSearchProto");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgd(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgd(boolean z, byte b) {
        this(z);
    }

    private vgd(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidFeatureSearchProperties{enableSearchProto=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vem) {
            if (this.a == ((vem) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
