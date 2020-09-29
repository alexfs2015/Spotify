package defpackage;

/* renamed from: vtm reason: default package */
final class vtm extends vry {
    private final boolean a;

    /* renamed from: vtm$a */
    static final class a extends defpackage.vry.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vry.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vry a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableHomeMixAsAPlaylistEntityMode");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtm(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtm(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtm(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vry) {
            if (this.a == ((vry) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsPlaylistEntityModesHomeMixProperties{enableHomeMixAsAPlaylistEntityMode=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
