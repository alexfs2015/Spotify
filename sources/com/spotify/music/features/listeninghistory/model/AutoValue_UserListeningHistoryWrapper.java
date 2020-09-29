package com.spotify.music.features.listeninghistory.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_UserListeningHistoryWrapper extends C$AutoValue_UserListeningHistoryWrapper {
    public static final Creator<AutoValue_UserListeningHistoryWrapper> CREATOR = new Creator<AutoValue_UserListeningHistoryWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_UserListeningHistoryWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_UserListeningHistoryWrapper(parcel.readArrayList(UserListeningHistoryWrapper.class.getClassLoader()), parcel.readLong());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_UserListeningHistoryWrapper(List<Session> list, long j) {
        super(list, j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getSessionList());
        parcel.writeLong(getLastSessionEndTime());
    }
}
