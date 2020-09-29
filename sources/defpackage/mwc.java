package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: mwc reason: default package */
final class mwc extends mwd {
    private final String a;
    private final List<rft> b;
    private final Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> c;
    private final boolean d;

    /* renamed from: mwc$a */
    public static final class a implements defpackage.mwd.a {
        private String a;
        private List<rft> b;
        private Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> c;
        private Boolean d;

        /* synthetic */ a(mwd mwd, byte b2) {
            this(mwd);
        }

        public a() {
        }

        private a(mwd mwd) {
            this.a = mwd.a();
            this.b = mwd.b();
            this.c = mwd.c();
            this.d = Boolean.valueOf(mwd.d());
        }

        public final defpackage.mwd.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.mwd.a a(List<rft> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null tracks");
        }

        public final defpackage.mwd.a a(Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> map) {
            if (map != null) {
                this.c = map;
                return this;
            }
            throw new NullPointerException("Null collectionStateMap");
        }

        public final defpackage.mwd.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final mwd a() {
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
                mwc mwc = new mwc(this.a, this.b, this.c, this.d.booleanValue(), 0);
                return mwc;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ mwc(String str, List list, Map map, boolean z, byte b2) {
        this(str, list, map, z);
    }

    private mwc(String str, List<rft> list, Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> map, boolean z) {
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = z;
    }

    public final String a() {
        return this.a;
    }

    public final List<rft> b() {
        return this.b;
    }

    public final Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwd) {
            mwd mwd = (mwd) obj;
            return this.a.equals(mwd.a()) && this.b.equals(mwd.b()) && this.c.equals(mwd.c()) && this.d == mwd.d();
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final defpackage.mwd.a e() {
        return new a(this, 0);
    }
}
