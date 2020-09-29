package com.spotify.music.features.tasteonboarding.artistpicker.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem.a;
import java.util.List;

final class AutoValue_ArtistPickerResponse extends C$AutoValue_ArtistPickerResponse {
    public static final Creator<AutoValue_ArtistPickerResponse> CREATOR = new Creator<AutoValue_ArtistPickerResponse>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ArtistPickerResponse(parcel.createTypedArrayList(AutoValue_ArtistPickerResponse.LIST_TYPE_ADAPTER), (PickerViewType) Enum.valueOf(PickerViewType.class, parcel.readString()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ArtistPickerResponse[i];
        }
    };
    /* access modifiers changed from: private */
    public static final a LIST_TYPE_ADAPTER = new a();

    AutoValue_ArtistPickerResponse(List<TasteOnboardingItem> list, PickerViewType pickerViewType) {
        super(list, pickerViewType);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a.a(items(), parcel);
        parcel.writeString(renderType().name());
    }
}
