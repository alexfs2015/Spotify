package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Map;

/* renamed from: mvv reason: default package */
final class mvv extends mvz {
    private final ImmutableList<mvr> a;
    private final boolean b;
    private final mwa c;
    private final Map<String, String> d;

    /* renamed from: mvv$a */
    static final class a extends defpackage.mvz.a {
        private ImmutableList<mvr> a;
        private Boolean b;
        private mwa c;
        private Map<String, String> d;

        a() {
        }

        private a(mvz mvz) {
            this.a = mvz.a();
            this.b = Boolean.valueOf(mvz.b());
            this.c = mvz.c();
            this.d = mvz.d();
        }

        /* synthetic */ a(mvz mvz, byte b2) {
            this(mvz);
        }

        public final defpackage.mvz.a a(ImmutableList<mvr> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.mvz.a a(Map<String, String> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null currentlyPlaying");
        }

        public final defpackage.mvz.a a(mwa mwa) {
            if (mwa != null) {
                this.c = mwa;
                return this;
            }
            throw new NullPointerException("Null loadingStatus");
        }

        public final defpackage.mvz.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final mvz a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" items");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" online");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" loadingStatus");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" currentlyPlaying");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                mvv mvv = new mvv(this.a, this.b.booleanValue(), this.c, this.d, 0);
                return mvv;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private mvv(ImmutableList<mvr> immutableList, boolean z, mwa mwa, Map<String, String> map) {
        this.a = immutableList;
        this.b = z;
        this.c = mwa;
        this.d = map;
    }

    /* synthetic */ mvv(ImmutableList immutableList, boolean z, mwa mwa, Map map, byte b2) {
        this(immutableList, z, mwa, map);
    }

    public final ImmutableList<mvr> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final mwa c() {
        return this.c;
    }

    public final Map<String, String> d() {
        return this.d;
    }

    public final defpackage.mvz.a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvz) {
            mvz mvz = (mvz) obj;
            return this.a.equals(mvz.a()) && this.b == mvz.b() && this.c.equals(mvz.c()) && this.d.equals(mvz.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedModel{items=");
        sb.append(this.a);
        sb.append(", online=");
        sb.append(this.b);
        sb.append(", loadingStatus=");
        sb.append(this.c);
        sb.append(", currentlyPlaying=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
