package defpackage;

/* renamed from: vtj reason: default package */
final class vtj extends vrr {
    private final boolean a;

    /* renamed from: vtj$a */
    static final class a extends defpackage.vrr.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vrr.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vrr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableStorylinesInScrollingNowPlayingView");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vtj(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private vtj(boolean z) {
        this.a = z;
    }

    /* synthetic */ vtj(boolean z, byte b) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrr) {
            if (this.a == ((vrr) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsNewplayingScrollWidgetsStorylinesProperties{enableStorylinesInScrollingNowPlayingView=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
