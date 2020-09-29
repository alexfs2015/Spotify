package defpackage;

/* renamed from: vga reason: default package */
final class vga extends ved {
    private final boolean a;

    /* renamed from: vga$a */
    static final class a extends defpackage.ved.a {
        private Boolean a;

        a() {
        }

        public final defpackage.ved.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ved a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enablePodcastSupportInCars");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vga(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vga(boolean z, byte b) {
        this(z);
    }

    private vga(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidExternalIntegrationServiceProperties{enablePodcastSupportInCars=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ved) {
            if (this.a == ((ved) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
