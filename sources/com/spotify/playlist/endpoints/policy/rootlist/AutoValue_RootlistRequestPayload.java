package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AutoValue_RootlistRequestPayload extends C$AutoValue_RootlistRequestPayload {
    public static final Creator<AutoValue_RootlistRequestPayload> CREATOR = new Creator<AutoValue_RootlistRequestPayload>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RootlistRequestPayload[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_RootlistRequestPayload((FolderRequestPolicy) parcel.readParcelable(RootlistRequestPayload.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_RootlistRequestPayload(FolderRequestPolicy folderRequestPolicy) {
        super(folderRequestPolicy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(policy(), i);
    }
}
