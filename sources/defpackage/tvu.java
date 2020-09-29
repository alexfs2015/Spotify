package defpackage;

/* renamed from: tvu reason: default package */
final class tvu extends c {
    private final boolean a;

    /* renamed from: tvu$a */
    static final class a implements defpackage.twc.c.a {
        private Boolean a;

        a() {
        }

        public final defpackage.twc.c.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final c a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" appearsAsDisabled");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new tvu(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private tvu(boolean z) {
        this.a = z;
    }

    /* synthetic */ tvu(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            if (this.a == ((c) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{appearsAsDisabled=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
