package defpackage;

/* renamed from: vtc reason: default package */
final class vtc extends vqy {
    private final boolean a;

    /* renamed from: vtc$a */
    static final class a extends defpackage.vqy.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vqy.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vqy a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" androidAutoOfflineLibrary");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtc(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtc(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtc(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqy) {
            if (this.a == ((vqy) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidExternalIntegrationLoadersProperties{androidAutoOfflineLibrary=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
