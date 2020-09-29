package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;

/* renamed from: kgc reason: default package */
final class kgc extends kgh {
    private final ImmutableList<kfp> a;
    private final ImmutableMap<kfp, StoryStatus> b;
    private final int c;
    private final boolean d;
    private final boolean e;

    /* renamed from: kgc$a */
    public static final class a extends defpackage.kgh.a {
        private ImmutableList<kfp> a;
        private ImmutableMap<kfp, StoryStatus> b;
        private Integer c;
        private Boolean d;
        private Boolean e;

        public a() {
        }

        private a(kgh kgh) {
            this.a = kgh.a();
            this.b = kgh.b();
            this.c = Integer.valueOf(kgh.c());
            this.d = Boolean.valueOf(kgh.d());
            this.e = Boolean.valueOf(kgh.e());
        }

        /* synthetic */ a(kgh kgh, byte b2) {
            this(kgh);
        }

        public final defpackage.kgh.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.kgh.a a(ImmutableList<kfp> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null stories");
        }

        public final defpackage.kgh.a a(ImmutableMap<kfp, StoryStatus> immutableMap) {
            if (immutableMap != null) {
                this.b = immutableMap;
                return this;
            }
            throw new NullPointerException("Null storiesStatus");
        }

        public final defpackage.kgh.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final kgh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" stories");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" storiesStatus");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" activeStoryIndex");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" paused");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" muted");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                kgc kgc = new kgc(this.a, this.b, this.c.intValue(), this.d.booleanValue(), this.e.booleanValue(), 0);
                return kgc;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.kgh.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    private kgc(ImmutableList<kfp> immutableList, ImmutableMap<kfp, StoryStatus> immutableMap, int i, boolean z, boolean z2) {
        this.a = immutableList;
        this.b = immutableMap;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    /* synthetic */ kgc(ImmutableList immutableList, ImmutableMap immutableMap, int i, boolean z, boolean z2, byte b2) {
        this(immutableList, immutableMap, i, z, z2);
    }

    public final ImmutableList<kfp> a() {
        return this.a;
    }

    public final ImmutableMap<kfp, StoryStatus> b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kgh) {
            kgh kgh = (kgh) obj;
            return this.a.equals(kgh.a()) && this.b.equals(kgh.b()) && this.c == kgh.c() && this.d == kgh.d() && this.e == kgh.e();
        }
    }

    public final defpackage.kgh.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesContainerModel{stories=");
        sb.append(this.a);
        sb.append(", storiesStatus=");
        sb.append(this.b);
        sb.append(", activeStoryIndex=");
        sb.append(this.c);
        sb.append(", paused=");
        sb.append(this.d);
        sb.append(", muted=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
