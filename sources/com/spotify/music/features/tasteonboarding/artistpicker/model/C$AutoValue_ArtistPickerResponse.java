package com.spotify.music.features.tasteonboarding.artistpicker.model;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.artistpicker.model.$AutoValue_ArtistPickerResponse reason: invalid class name */
abstract class C$AutoValue_ArtistPickerResponse extends ArtistPickerResponse {
    private final List<TasteOnboardingItem> items;
    private final PickerViewType renderType;

    C$AutoValue_ArtistPickerResponse(List<TasteOnboardingItem> list, PickerViewType pickerViewType) {
        if (list != null) {
            this.items = list;
            if (pickerViewType != null) {
                this.renderType = pickerViewType;
                return;
            }
            throw new NullPointerException("Null renderType");
        }
        throw new NullPointerException("Null items");
    }

    public List<TasteOnboardingItem> items() {
        return this.items;
    }

    public PickerViewType renderType() {
        return this.renderType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistPickerResponse{items=");
        sb.append(this.items);
        sb.append(", renderType=");
        sb.append(this.renderType);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ArtistPickerResponse) {
            ArtistPickerResponse artistPickerResponse = (ArtistPickerResponse) obj;
            return this.items.equals(artistPickerResponse.items()) && this.renderType.equals(artistPickerResponse.renderType());
        }
    }

    public int hashCode() {
        return ((this.items.hashCode() ^ 1000003) * 1000003) ^ this.renderType.hashCode();
    }
}
