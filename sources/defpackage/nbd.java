package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: nbd reason: default package */
final class nbd extends nbe {
    private final String a;
    private final List<rov> b;
    private final Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> c;
    private final boolean d;

    /* renamed from: nbd$a */
    public static final class a implements defpackage.nbe.a {
        private String a;
        private List<rov> b;
        private Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> c;
        private Boolean d;

        public a() {
        }

        private a(nbe nbe) {
            this.a = nbe.a();
            this.b = nbe.b();
            this.c = nbe.c();
            this.d = Boolean.valueOf(nbe.d());
        }

        /* synthetic */ a(nbe nbe, byte b2) {
            this(nbe);
        }

        public final defpackage.nbe.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.nbe.a a(List<rov> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null tracks");
        }

        public final defpackage.nbe.a a(Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> map) {
            if (map != null) {
                this.c = map;
                return this;
            }
            throw new NullPointerException("Null collectionStateMap");
        }

        public final defpackage.nbe.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final nbe a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tracks");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" collectionStateMap");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" shouldDisableExplicitContent");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                nbd nbd = new nbd(this.a, this.b, this.c, this.d.booleanValue(), 0);
                return nbd;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private nbd(String str, List<rov> list, Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> map, boolean z) {
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = z;
    }

    /* synthetic */ nbd(String str, List list, Map map, boolean z, byte b2) {
        this(str, list, map, z);
    }

    public final String a() {
        return this.a;
    }

    public final List<rov> b() {
        return this.b;
    }

    public final Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final defpackage.nbe.a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbe) {
            nbe nbe = (nbe) obj;
            return this.a.equals(nbe.a()) && this.b.equals(nbe.b()) && this.c.equals(nbe.c()) && this.d == nbe.d();
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeTierTracksData{title=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append(", collectionStateMap=");
        sb.append(this.c);
        sb.append(", shouldDisableExplicitContent=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
