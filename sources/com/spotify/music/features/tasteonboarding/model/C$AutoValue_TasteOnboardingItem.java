package com.spotify.music.features.tasteonboarding.model;

import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.model.$AutoValue_TasteOnboardingItem reason: invalid class name */
abstract class C$AutoValue_TasteOnboardingItem extends TasteOnboardingItem {
    private final String color;
    private final String id;
    private final String image;
    private final List<TasteOnboardingImage> imagesWithSize;
    private final boolean isArtist;
    private final boolean isExpanded;
    private final boolean isLiked;
    private final boolean isPodcast;
    private final qur logging;
    private final String moreUri;
    private final String name;
    private final List<TasteOnboardingItem> relatedItems;

    C$AutoValue_TasteOnboardingItem(String str, String str2, String str3, List<TasteOnboardingItem> list, List<TasteOnboardingImage> list2, qur qur, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.name = str2;
                this.image = str3;
                if (list != null) {
                    this.relatedItems = list;
                    if (list2 != null) {
                        this.imagesWithSize = list2;
                        this.logging = qur;
                        this.moreUri = str4;
                        this.isArtist = z;
                        this.isPodcast = z2;
                        this.isLiked = z3;
                        this.isExpanded = z4;
                        this.color = str5;
                        return;
                    }
                    throw new NullPointerException("Null imagesWithSize");
                }
                throw new NullPointerException("Null relatedItems");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }

    public String color() {
        return this.color;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TasteOnboardingItem) {
            TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
            if (this.id.equals(tasteOnboardingItem.id()) && this.name.equals(tasteOnboardingItem.name())) {
                String str = this.image;
                if (str != null ? str.equals(tasteOnboardingItem.image()) : tasteOnboardingItem.image() == null) {
                    if (this.relatedItems.equals(tasteOnboardingItem.relatedItems()) && this.imagesWithSize.equals(tasteOnboardingItem.imagesWithSize())) {
                        qur qur = this.logging;
                        if (qur != null ? qur.equals(tasteOnboardingItem.logging()) : tasteOnboardingItem.logging() == null) {
                            String str2 = this.moreUri;
                            if (str2 != null ? str2.equals(tasteOnboardingItem.moreUri()) : tasteOnboardingItem.moreUri() == null) {
                                if (this.isArtist == tasteOnboardingItem.isArtist() && this.isPodcast == tasteOnboardingItem.isPodcast() && this.isLiked == tasteOnboardingItem.isLiked() && this.isExpanded == tasteOnboardingItem.isExpanded()) {
                                    String str3 = this.color;
                                    return str3 != null ? str3.equals(tasteOnboardingItem.color()) : tasteOnboardingItem.color() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.image;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.relatedItems.hashCode()) * 1000003) ^ this.imagesWithSize.hashCode()) * 1000003;
        qur qur = this.logging;
        int hashCode3 = (hashCode2 ^ (qur == null ? 0 : qur.hashCode())) * 1000003;
        String str2 = this.moreUri;
        int i2 = 1231;
        int hashCode4 = (((((((hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.isArtist ? 1231 : 1237)) * 1000003) ^ (this.isPodcast ? 1231 : 1237)) * 1000003) ^ (this.isLiked ? 1231 : 1237)) * 1000003;
        if (!this.isExpanded) {
            i2 = 1237;
        }
        int i3 = (hashCode4 ^ i2) * 1000003;
        String str3 = this.color;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 ^ i;
    }

    public String id() {
        return this.id;
    }

    public String image() {
        return this.image;
    }

    public List<TasteOnboardingImage> imagesWithSize() {
        return this.imagesWithSize;
    }

    public boolean isArtist() {
        return this.isArtist;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    public boolean isLiked() {
        return this.isLiked;
    }

    public boolean isPodcast() {
        return this.isPodcast;
    }

    public qur logging() {
        return this.logging;
    }

    public String moreUri() {
        return this.moreUri;
    }

    public String name() {
        return this.name;
    }

    public List<TasteOnboardingItem> relatedItems() {
        return this.relatedItems;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TasteOnboardingItem{id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", relatedItems=");
        sb.append(this.relatedItems);
        sb.append(", imagesWithSize=");
        sb.append(this.imagesWithSize);
        sb.append(", logging=");
        sb.append(this.logging);
        sb.append(", moreUri=");
        sb.append(this.moreUri);
        sb.append(", isArtist=");
        sb.append(this.isArtist);
        sb.append(", isPodcast=");
        sb.append(this.isPodcast);
        sb.append(", isLiked=");
        sb.append(this.isLiked);
        sb.append(", isExpanded=");
        sb.append(this.isExpanded);
        sb.append(", color=");
        sb.append(this.color);
        sb.append("}");
        return sb.toString();
    }
}
