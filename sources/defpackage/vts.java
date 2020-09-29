package defpackage;

/* renamed from: vts reason: default package */
final class vts extends vsp {
    private final boolean a;
    private final boolean b;

    /* renamed from: vts$a */
    static final class a extends defpackage.vsp.a {
        private Boolean a;
        private Boolean b;

        a() {
        }

        public final defpackage.vsp.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vsp a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" collectionTrackMetadataAndroidEnabled");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" likedSongsSearchAndFilterAlwaysVisible");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vts(this.a.booleanValue(), this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.vsp.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    private vts(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* synthetic */ vts(boolean z, boolean z2, byte b2) {
        this(z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsp) {
            vsp vsp = (vsp) obj;
            return this.a == vsp.a() && this.b == vsp.b();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsYourLibraryMusicPagesFlagsProperties{collectionTrackMetadataAndroidEnabled=");
        sb.append(this.a);
        sb.append(", likedSongsSearchAndFilterAlwaysVisible=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
