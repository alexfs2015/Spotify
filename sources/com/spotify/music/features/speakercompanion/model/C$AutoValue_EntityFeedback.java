package com.spotify.music.features.speakercompanion.model;

/* renamed from: com.spotify.music.features.speakercompanion.model.$AutoValue_EntityFeedback reason: invalid class name */
abstract class C$AutoValue_EntityFeedback extends EntityFeedback {
    private final String actionUri;
    private final String entityUri;
    private final String imageUri;
    private final String title;
    private final String uid;

    C$AutoValue_EntityFeedback(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.uid = str;
            if (str2 != null) {
                this.entityUri = str2;
                if (str3 != null) {
                    this.title = str3;
                    if (str4 != null) {
                        this.imageUri = str4;
                        if (str5 != null) {
                            this.actionUri = str5;
                            return;
                        }
                        throw new NullPointerException("Null actionUri");
                    }
                    throw new NullPointerException("Null imageUri");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null entityUri");
        }
        throw new NullPointerException("Null uid");
    }

    public String actionUri() {
        return this.actionUri;
    }

    public String entityUri() {
        return this.entityUri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EntityFeedback) {
            EntityFeedback entityFeedback = (EntityFeedback) obj;
            return this.uid.equals(entityFeedback.uid()) && this.entityUri.equals(entityFeedback.entityUri()) && this.title.equals(entityFeedback.title()) && this.imageUri.equals(entityFeedback.imageUri()) && this.actionUri.equals(entityFeedback.actionUri());
        }
    }

    public int hashCode() {
        return ((((((((this.uid.hashCode() ^ 1000003) * 1000003) ^ this.entityUri.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.imageUri.hashCode()) * 1000003) ^ this.actionUri.hashCode();
    }

    public String imageUri() {
        return this.imageUri;
    }

    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EntityFeedback{uid=");
        sb.append(this.uid);
        sb.append(", entityUri=");
        sb.append(this.entityUri);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", imageUri=");
        sb.append(this.imageUri);
        sb.append(", actionUri=");
        sb.append(this.actionUri);
        sb.append("}");
        return sb.toString();
    }

    public String uid() {
        return this.uid;
    }
}
