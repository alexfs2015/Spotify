package defpackage;

import com.spotify.music.features.homemix.models.HomeMix;
import java.util.List;

/* renamed from: nmj reason: default package */
final class nmj extends a {
    private final uyz a;
    private final nni b;
    private final List<uzb> c;
    private final HomeMix d;

    /* renamed from: nmj$a */
    static final class a extends C0063a {
        private uyz a;
        private nni b;
        private List<uzb> c;
        private HomeMix d;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final C0063a a(uyz uyz) {
            if (uyz != null) {
                this.a = uyz;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        /* access modifiers changed from: 0000 */
        public final C0063a a(nni nni) {
            if (nni != null) {
                this.b = nni;
                return this;
            }
            throw new NullPointerException("Null uiState");
        }

        /* access modifiers changed from: 0000 */
        public final C0063a a(List<uzb> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        /* access modifiers changed from: 0000 */
        public final C0063a a(HomeMix homeMix) {
            this.d = homeMix;
            return this;
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
                nmj nmj = new nmj(this.a, this.b, this.c, this.d, 0);
                return nmj;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ nmj(uyz uyz, nni nni, List list, HomeMix homeMix, byte b2) {
        this(uyz, nni, list, homeMix);
    }

    private nmj(uyz uyz, nni nni, List<uzb> list, HomeMix homeMix) {
        this.a = uyz;
        this.b = nni;
        this.c = list;
        this.d = homeMix;
    }

    /* access modifiers changed from: 0000 */
    public final uyz a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final nni b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final List<uzb> c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final HomeMix d() {
        return this.d;
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
}
