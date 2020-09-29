package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import java.util.List;

/* renamed from: kiq reason: default package */
abstract class kiq extends kiu {
    final StoryParagraph a;
    final List<kiy> b;

    /* renamed from: kiq$a */
    static final class a implements defpackage.kiu.a {
        private StoryParagraph a;
        private List<kiy> b;

        a() {
        }

        public final defpackage.kiu.a a(StoryParagraph storyParagraph) {
            if (storyParagraph != null) {
                this.a = storyParagraph;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.kiu.a a(List<kiy> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null years");
        }

        public final kiu a() {
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
                sb2.append(" years");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new kis(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    kiq(StoryParagraph storyParagraph, List<kiy> list) {
        if (storyParagraph != null) {
            this.a = storyParagraph;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null years");
        }
        throw new NullPointerException("Null title");
    }

    public final StoryParagraph a() {
        return this.a;
    }

    public final List<kiy> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kiu) {
            kiu kiu = (kiu) obj;
            return this.a.equals(kiu.a()) && this.b.equals(kiu.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecadeTopData{title=");
        sb.append(this.a);
        sb.append(", years=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
