package com.spotify.music.features.tasteonboarding.artistpicker.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ArtistPickerResponse implements Parcelable, JacksonModel {
    public abstract List<TasteOnboardingItem> items();

    public abstract PickerViewType renderType();

    @JsonCreator
    public static ArtistPickerResponse create(@JsonProperty("questions") List<TasteOnboardingItem> list, @JsonProperty("render_type") String str) {
        return new AutoValue_ArtistPickerResponse(gbp.a(list), getRenderType(str));
    }

    private static PickerViewType getRenderType(String str) {
        try {
            return PickerViewType.valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            Assertion.a("Unknown render type in artist picker response", e);
            return PickerViewType.DEFAULT;
        }
    }
}
