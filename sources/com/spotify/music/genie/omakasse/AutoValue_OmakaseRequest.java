package com.spotify.music.genie.omakasse;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_OmakaseRequest extends C$AutoValue_OmakaseRequest {
    public static final Creator<AutoValue_OmakaseRequest> CREATOR = new Creator<AutoValue_OmakaseRequest>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_OmakaseRequest[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_OmakaseRequest(z, parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_OmakaseRequest(boolean z, int i) {
        super(z, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(isDoNotAllowPullRequest() ? 1 : 0);
        parcel.writeInt(getNumberOfResults());
    }
}
