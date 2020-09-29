package com.spotify.mobile.android.wrapped2019.stories;

import java.util.List;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.$AutoValue_StoryParagraph reason: invalid class name */
abstract class C$AutoValue_StoryParagraph extends StoryParagraph {
    private final String text;
    private final List<String> values;

    /* renamed from: com.spotify.mobile.android.wrapped2019.stories.$AutoValue_StoryParagraph$a */
    static final class a extends com.spotify.mobile.android.wrapped2019.stories.StoryParagraph.a {
        private String a;
        private List<String> b;

        a() {
        }

        public final com.spotify.mobile.android.wrapped2019.stories.StoryParagraph.a a(String str) {
            this.a = str;
            return this;
        }

        public final com.spotify.mobile.android.wrapped2019.stories.StoryParagraph.a a(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null values");
        }

        public final StoryParagraph a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" text");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" values");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_StoryParagraph(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    C$AutoValue_StoryParagraph(String str, List<String> list) {
        if (str != null) {
            this.text = str;
            if (list != null) {
                this.values = list;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null text");
    }

    public String text() {
        return this.text;
    }

    public List<String> values() {
        return this.values;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StoryParagraph{text=");
        sb.append(this.text);
        sb.append(", values=");
        sb.append(this.values);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StoryParagraph) {
            StoryParagraph storyParagraph = (StoryParagraph) obj;
            return this.text.equals(storyParagraph.text()) && this.values.equals(storyParagraph.values());
        }
    }

    public int hashCode() {
        return ((this.text.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }
}
