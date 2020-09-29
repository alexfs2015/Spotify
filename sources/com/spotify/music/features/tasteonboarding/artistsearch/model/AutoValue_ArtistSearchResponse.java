package com.spotify.music.features.tasteonboarding.artistsearch.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

final class AutoValue_ArtistSearchResponse extends C$AutoValue_ArtistSearchResponse {
    public static final Creator<AutoValue_ArtistSearchResponse> CREATOR = new Creator<AutoValue_ArtistSearchResponse>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ArtistSearchResponse(parcel.readArrayList(ArtistSearchResponse.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ArtistSearchResponse[i];
        }
    };

    AutoValue_ArtistSearchResponse(List<TasteOnboardingItem> list, String str) {
        super(list, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(results());
        if (nextPage() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(nextPage());
    }
}
