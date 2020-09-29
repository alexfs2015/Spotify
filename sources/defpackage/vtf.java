package defpackage;

/* renamed from: vtf reason: default package */
final class vtf extends vrh {
    private final boolean a;

    /* renamed from: vtf$a */
    static final class a extends defpackage.vrh.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vrh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vrh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" newProfilePageEnabled");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtf(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtf(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtf(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrh) {
            if (this.a == ((vrh) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidFeatureProfileProperties{newProfilePageEnabled=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
