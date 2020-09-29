package com.spotify.music.features.tasteonboarding.artistpicker.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem.a;
import java.util.List;

final class AutoValue_RelatedArtistsResponse extends C$AutoValue_RelatedArtistsResponse {
    public static final Creator<AutoValue_RelatedArtistsResponse> CREATOR = new Creator<AutoValue_RelatedArtistsResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RelatedArtistsResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_RelatedArtistsResponse(parcel.createTypedArrayList(AutoValue_RelatedArtistsResponse.LIST_TYPE_ADAPTER));
        }
    };
    /* access modifiers changed from: private */
    public static final a LIST_TYPE_ADAPTER = new a();

    public final int describeContents() {
        return 0;
    }

    AutoValue_RelatedArtistsResponse(List<TasteOnboardingItem> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a.a(relatedArtists(), parcel);
    }
}
