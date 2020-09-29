package com.spotify.music.genie.omakasse;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_OmakaseResponse extends C$AutoValue_OmakaseResponse {
    public static final Creator<AutoValue_OmakaseResponse> CREATOR = new Creator<AutoValue_OmakaseResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_OmakaseResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_OmakaseResponse(parcel.readArrayList(OmakaseResponse.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_OmakaseResponse(List<String> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getUriList());
    }
}
