package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Map;

/* renamed from: mrf reason: default package */
final class mrf extends mrj {
    private final ImmutableList<mrb> b;
    private final boolean c;
    private final mrk d;
    private final Map<String, String> e;

    /* renamed from: mrf$a */
    static final class a extends defpackage.mrj.a {
        private ImmutableList<mrb> a;
        private Boolean b;
        private mrk c;
        private Map<String, String> d;

        /* synthetic */ a(mrj mrj, byte b2) {
            this(mrj);
        }

        a() {
        }

        private a(mrj mrj) {
            this.a = mrj.a();
            this.b = Boolean.valueOf(mrj.b());
            this.c = mrj.c();
            this.d = mrj.d();
        }

        public final defpackage.mrj.a a(ImmutableList<mrb> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.mrj.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mrj.a a(mrk mrk) {
            if (mrk != null) {
                this.c = mrk;
                return this;
            }
            throw new NullPointerException("Null loadingStatus");
        }

        public final defpackage.mrj.a a(Map<String, String> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null currentlyPlaying");
        }

        public final mrj a() {
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
                mrf mrf = new mrf(this.a, this.b.booleanValue(), this.c, this.d, 0);
                return mrf;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ mrf(ImmutableList immutableList, boolean z, mrk mrk, Map map, byte b2) {
        this(immutableList, z, mrk, map);
    }

    private mrf(ImmutableList<mrb> immutableList, boolean z, mrk mrk, Map<String, String> map) {
        this.b = immutableList;
        this.c = z;
        this.d = mrk;
        this.e = map;
    }

    public final ImmutableList<mrb> a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final mrk c() {
        return this.d;
    }

    public final Map<String, String> d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedModel{items=");
        sb.append(this.b);
        sb.append(", online=");
        sb.append(this.c);
        sb.append(", loadingStatus=");
        sb.append(this.d);
        sb.append(", currentlyPlaying=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrj) {
            mrj mrj = (mrj) obj;
            return this.b.equals(mrj.a()) && this.c == mrj.b() && this.d.equals(mrj.c()) && this.e.equals(mrj.d());
        }
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final defpackage.mrj.a e() {
        return new a(this, 0);
    }
}
