package defpackage;

/* renamed from: vgg reason: default package */
final class vgg extends veu {
    private final boolean a;

    /* renamed from: vgg$a */
    static final class a extends defpackage.veu.a {
        private Boolean a;

        a() {
        }

        public final defpackage.veu.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final veu a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableStorylinesInScrollingNowPlayingView");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgg(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgg(boolean z, byte b) {
        this(z);
    }

    private vgg(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsNewplayingScrollWidgetsStorylinesProperties{enableStorylinesInScrollingNowPlayingView=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof veu) {
            if (this.a == ((veu) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
