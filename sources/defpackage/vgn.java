package defpackage;

/* renamed from: vgn reason: default package */
final class vgn extends vfm {
    private final boolean a;

    /* renamed from: vgn$a */
    static final class a extends defpackage.vfm.a {
        private Boolean a;

        a() {
        }

        public final defpackage.vfm.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vfm a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" likedSongsSearchAndFilterAlwaysVisible");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vgn(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vgn(boolean z, byte b) {
        this(z);
    }

    private vgn(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsYourLibraryMusicPagesFlagsProperties{likedSongsSearchAndFilterAlwaysVisible=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfm) {
            if (this.a == ((vfm) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
