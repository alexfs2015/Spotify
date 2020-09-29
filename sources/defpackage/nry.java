package defpackage;

import com.spotify.music.features.homemix.models.HomeMix;
import java.util.List;

/* renamed from: nry reason: default package */
final class nry extends a {
    private final vlc a;
    private final ntj b;
    private final List<vle> c;
    private final HomeMix d;

    /* renamed from: nry$a */
    static final class a extends C0064a {
        private vlc a;
        private ntj b;
        private List<vle> c;
        private HomeMix d;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final C0064a a(HomeMix homeMix) {
            this.d = homeMix;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final C0064a a(List<vle> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        /* access modifiers changed from: 0000 */
        public final C0064a a(ntj ntj) {
            if (ntj != null) {
                this.b = ntj;
                return this;
            }
            throw new NullPointerException("Null uiState");
        }

        /* access modifiers changed from: 0000 */
        public final C0064a a(vlc vlc) {
            if (vlc != null) {
                this.a = vlc;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        /* access modifiers changed from: 0000 */
        public final a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uiState");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" items");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                nry nry = new nry(this.a, this.b, this.c, this.d, 0);
                return nry;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private nry(vlc vlc, ntj ntj, List<vle> list, HomeMix homeMix) {
        this.a = vlc;
        this.b = ntj;
        this.c = list;
        this.d = homeMix;
    }

    /* synthetic */ nry(vlc vlc, ntj ntj, List list, HomeMix homeMix, byte b2) {
        this(vlc, ntj, list, homeMix);
    }

    /* access modifiers changed from: 0000 */
    public final vlc a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final ntj b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final List<vle> c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final HomeMix d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c())) {
                HomeMix homeMix = this.d;
                return homeMix != null ? homeMix.equals(aVar.d()) : aVar.d() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        HomeMix homeMix = this.d;
        return hashCode ^ (homeMix == null ? 0 : homeMix.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixItemContext{playlist=");
        sb.append(this.a);
        sb.append(", uiState=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", homeMix=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
