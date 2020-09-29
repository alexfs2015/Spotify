package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: kjj reason: default package */
abstract class kjj extends kjp {
    final StoryParagraph a;

    kjj(StoryParagraph storyParagraph) {
        if (storyParagraph != null) {
            this.a = storyParagraph;
            return;
        }
        throw new NullPointerException("Null paragraph1");
    }

    public final StoryParagraph a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kjp)) {
            return false;
        }
        return this.a.equals(((kjp) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Stats{paragraph1=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
