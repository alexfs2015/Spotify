package defpackage;

/* renamed from: tkc reason: default package */
final class tkc extends c {
    private final boolean a;

    /* renamed from: tkc$a */
    static final class a implements defpackage.tkk.c.a {
        private Boolean a;

        a() {
        }

        public final defpackage.tkk.c.a a(boolean z) {
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
                return new tkc(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ tkc(boolean z, byte b) {
        this(z);
    }

    private tkc(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{appearsAsDisabled=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
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
}
