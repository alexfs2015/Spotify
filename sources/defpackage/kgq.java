package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;

/* renamed from: kgq reason: default package */
final class kgq extends kgs {
    private final StoryStatus a;
    private final kfp b;

    /* renamed from: kgq$a */
    public static final class a implements defpackage.kgs.a {
        private StoryStatus a;
        private kfp b;

        public final defpackage.kgs.a a(StoryStatus storyStatus) {
            if (storyStatus != null) {
                this.a = storyStatus;
                return this;
            }
            throw new NullPointerException("Null status");
        }

        public final defpackage.kgs.a a(kfp kfp) {
            if (kfp != null) {
                this.b = kfp;
                return this;
            }
            throw new NullPointerException("Null story");
        }

        public final kgs a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" status");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" story");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new kgq(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private kgq(StoryStatus storyStatus, kfp kfp) {
        this.a = storyStatus;
        this.b = kfp;
    }

    /* synthetic */ kgq(StoryStatus storyStatus, kfp kfp, byte b2) {
        this(storyStatus, kfp);
    }

    public final StoryStatus a() {
        return this.a;
    }

    public final kfp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kgs) {
            kgs kgs = (kgs) obj;
            return this.a.equals(kgs.a()) && this.b.equals(kgs.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryLoadingState{status=");
        sb.append(this.a);
        sb.append(", story=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
