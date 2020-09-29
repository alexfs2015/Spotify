package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;

/* renamed from: keo reason: default package */
final class keo extends keq {
    private final StoryStatus a;
    private final kdo b;

    /* renamed from: keo$a */
    public static final class a implements defpackage.keq.a {
        private StoryStatus a;
        private kdo b;

        public final defpackage.keq.a a(StoryStatus storyStatus) {
            if (storyStatus != null) {
                this.a = storyStatus;
                return this;
            }
            throw new NullPointerException("Null status");
        }

        public final defpackage.keq.a a(kdo kdo) {
            if (kdo != null) {
                this.b = kdo;
                return this;
            }
            throw new NullPointerException("Null story");
        }

        public final keq a() {
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
                return new keo(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ keo(StoryStatus storyStatus, kdo kdo, byte b2) {
        this(storyStatus, kdo);
    }

    private keo(StoryStatus storyStatus, kdo kdo) {
        this.a = storyStatus;
        this.b = kdo;
    }

    public final StoryStatus a() {
        return this.a;
    }

    public final kdo b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryLoadingState{status=");
        sb.append(this.a);
        sb.append(", story=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof keq) {
            keq keq = (keq) obj;
            return this.a.equals(keq.a()) && this.b.equals(keq.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
