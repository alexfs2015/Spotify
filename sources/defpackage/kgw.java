package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: kgw reason: default package */
abstract class kgw extends khc {
    final StoryParagraph a;

    kgw(StoryParagraph storyParagraph) {
        if (storyParagraph != null) {
            this.a = storyParagraph;
            return;
        }
        throw new NullPointerException("Null paragraph1");
    }

    public final StoryParagraph a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Stats{paragraph1=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof khc)) {
            return false;
        }
        return this.a.equals(((khc) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
