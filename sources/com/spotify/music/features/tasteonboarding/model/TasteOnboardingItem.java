package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.LinkType;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TasteOnboardingItem implements Parcelable, JacksonModel {

    public static final class a extends upx<TasteOnboardingItem> {
        public a() {
            super($$Lambda$TasteOnboardingItem$a$h26ziKHLvMnvEZnr44d_V9_b_Bg.INSTANCE);
        }
    }

    public abstract String color();

    public abstract String id();

    public abstract String image();

    public abstract List<TasteOnboardingImage> imagesWithSize();

    public abstract boolean isArtist();

    public abstract boolean isExpanded();

    public abstract boolean isLiked();

    public abstract boolean isPodcast();

    public abstract qmj logging();

    public abstract String moreUri();

    public abstract String name();

    public abstract List<TasteOnboardingItem> relatedItems();

    @JsonCreator
    public static TasteOnboardingItem create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("related_questions") List<TasteOnboardingItem> list, @JsonProperty("images_with_size") List<TasteOnboardingImage> list2, @JsonProperty("logging") qmj qmj, @JsonProperty("more_uri") String str4, @JsonProperty("color") String str5) {
        AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(str, str2, str3, gbp.a(list), gbp.a(list2), getLogging(qmj), str4, getIsArtist(str), getIsPodcast(str), false, false, str5);
        return autoValue_TasteOnboardingItem;
    }

    public TasteOnboardingItem createWithLike(boolean z) {
        AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), logging(), moreUri(), isArtist(), isPodcast(), z, isExpanded(), color());
        return autoValue_TasteOnboardingItem;
    }

    public TasteOnboardingItem createWithExpanded(boolean z) {
        AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), logging(), moreUri(), isArtist(), isPodcast(), isLiked(), z, color());
        return autoValue_TasteOnboardingItem;
    }

    public TasteOnboardingItem createWithLogging(qmj qmj) {
        AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), qmj, moreUri(), isArtist(), isPodcast(), isLiked(), isExpanded(), color());
        return autoValue_TasteOnboardingItem;
    }

    public TasteOnboardingItem createWithRelatedItems(List<TasteOnboardingItem> list) {
        AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(id(), name(), image(), list, imagesWithSize(), logging(), moreUri(), isArtist(), isPodcast(), isLiked(), isExpanded(), color());
        return autoValue_TasteOnboardingItem;
    }

    public TasteOnboardingItem createWithMoreUri(String str) {
        AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), logging(), str, isArtist(), isPodcast(), isLiked(), isExpanded(), color());
        return autoValue_TasteOnboardingItem;
    }

    private static boolean getIsArtist(String str) {
        return jst.a(str).b == LinkType.ARTIST;
    }

    private static boolean getIsPodcast(String str) {
        return jst.a(str).b == LinkType.SHOW_SHOW;
    }

    private static qmj getLogging(qmj qmj) {
        return qmj != null ? qmj : qmj.create(null, null);
    }

    public String findSuitableImage(int i) {
        TasteOnboardingImage tasteOnboardingImage = null;
        if (!imagesWithSize().isEmpty()) {
            int i2 = Integer.MAX_VALUE;
            for (TasteOnboardingImage tasteOnboardingImage2 : imagesWithSize()) {
                if (tasteOnboardingImage == null) {
                    tasteOnboardingImage = tasteOnboardingImage2;
                } else {
                    int max = Math.max(tasteOnboardingImage2.width(), tasteOnboardingImage2.height());
                    if (max < i2 && max >= i) {
                        tasteOnboardingImage = tasteOnboardingImage2;
                        i2 = max;
                    }
                }
            }
        }
        return tasteOnboardingImage == null ? image() : tasteOnboardingImage.uri();
    }

    public List<TasteOnboardingItem> selectable() {
        return relatedItems().subList(0, Math.min(2, relatedItems().size()));
    }
}
