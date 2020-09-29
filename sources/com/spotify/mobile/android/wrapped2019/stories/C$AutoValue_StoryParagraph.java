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
            String str = "ussalleNu l";
            throw new NullPointerException("Null values");
        }

        public final StoryParagraph a() {
            String str = "";
            String str2 = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String str3 = "ettmx";
                sb.append(" text");
                str2 = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" values");
                str2 = sb2.toString();
            }
            if (str2.isEmpty()) {
                return new AutoValue_StoryParagraph(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str2);
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StoryParagraph) {
            StoryParagraph storyParagraph = (StoryParagraph) obj;
            if (this.text.equals(storyParagraph.text()) && this.values.equals(storyParagraph.values())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.text.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }

    public String text() {
        return this.text;
    }

    public String toString() {
        String str = "pPsr{reaottxay=rthSa";
        StringBuilder sb = new StringBuilder("StoryParagraph{text=");
        sb.append(this.text);
        sb.append(", values=");
        sb.append(this.values);
        String str2 = "}";
        sb.append("}");
        return sb.toString();
    }

    public List<String> values() {
        return this.values;
    }
}
