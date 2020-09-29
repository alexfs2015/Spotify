package com.spotify.music.features.listeninghistory.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_Session extends C$AutoValue_Session {
    public static final Creator<AutoValue_Session> CREATOR = new Creator<AutoValue_Session>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Session(parcel.readArrayList(Session.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Session[i];
        }
    };

    AutoValue_Session(List<Track> list, String str, String str2) {
        super(list, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getSession());
        parcel.writeString(getSessionEndTime());
        parcel.writeString(getSessionStartTime());
    }
}
