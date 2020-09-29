package com.spotify.music.features.tasteonboarding.model;

/* renamed from: com.spotify.music.features.tasteonboarding.model.$AutoValue_TasteOnboardingImage reason: invalid class name */
abstract class C$AutoValue_TasteOnboardingImage extends TasteOnboardingImage {
    private final int height;
    private final String uri;
    private final int width;

    C$AutoValue_TasteOnboardingImage(String str, int i, int i2) {
        if (str != null) {
            this.uri = str;
            this.height = i;
            this.width = i2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public String uri() {
        return this.uri;
    }

    public int height() {
        return this.height;
    }

    public int width() {
        return this.width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TasteOnboardingImage{uri=");
        sb.append(this.uri);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TasteOnboardingImage) {
            TasteOnboardingImage tasteOnboardingImage = (TasteOnboardingImage) obj;
            return this.uri.equals(tasteOnboardingImage.uri()) && this.height == tasteOnboardingImage.height() && this.width == tasteOnboardingImage.width();
        }
    }

    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }
}
