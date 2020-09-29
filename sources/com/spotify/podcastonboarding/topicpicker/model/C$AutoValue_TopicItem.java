package com.spotify.podcastonboarding.topicpicker.model;

/* renamed from: com.spotify.podcastonboarding.topicpicker.model.$AutoValue_TopicItem reason: invalid class name */
abstract class C$AutoValue_TopicItem extends TopicItem {
    private final String color;
    private final String id;
    private final String image;
    private final String name;
    private final String parent;
    private final boolean selected;
    private final String type;

    /* renamed from: com.spotify.podcastonboarding.topicpicker.model.$AutoValue_TopicItem$a */
    static final class a implements com.spotify.podcastonboarding.topicpicker.model.TopicItem.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Boolean f;
        private String g;

        /* synthetic */ a(TopicItem topicItem, byte b2) {
            this(topicItem);
        }

        a() {
        }

        private a(TopicItem topicItem) {
            this.a = topicItem.id();
            this.b = topicItem.name();
            this.c = topicItem.type();
            this.d = topicItem.parent();
            this.e = topicItem.color();
            this.f = Boolean.valueOf(topicItem.selected());
            this.g = topicItem.image();
        }

        public final com.spotify.podcastonboarding.topicpicker.model.TopicItem.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final TopicItem a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" name");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" color");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" selected");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_TopicItem autoValue_TopicItem = new AutoValue_TopicItem(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), this.g);
                return autoValue_TopicItem;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    C$AutoValue_TopicItem(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.name = str2;
                this.type = str3;
                this.parent = str4;
                if (str5 != null) {
                    this.color = str5;
                    this.selected = z;
                    this.image = str6;
                    return;
                }
                throw new NullPointerException("Null color");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }

    public String id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public String type() {
        return this.type;
    }

    public String parent() {
        return this.parent;
    }

    public String color() {
        return this.color;
    }

    public boolean selected() {
        return this.selected;
    }

    public String image() {
        return this.image;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopicItem{id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", image=");
        sb.append(this.image);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopicItem) {
            TopicItem topicItem = (TopicItem) obj;
            if (this.id.equals(topicItem.id()) && this.name.equals(topicItem.name())) {
                String str = this.type;
                if (str != null ? str.equals(topicItem.type()) : topicItem.type() == null) {
                    String str2 = this.parent;
                    if (str2 != null ? str2.equals(topicItem.parent()) : topicItem.parent() == null) {
                        if (this.color.equals(topicItem.color()) && this.selected == topicItem.selected()) {
                            String str3 = this.image;
                            return str3 != null ? str3.equals(topicItem.image()) : topicItem.image() == null;
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.type;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.parent;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.color.hashCode()) * 1000003) ^ (this.selected ? 1231 : 1237)) * 1000003;
        String str3 = this.image;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    public com.spotify.podcastonboarding.topicpicker.model.TopicItem.a toBuilder() {
        return new a(this, 0);
    }
}
