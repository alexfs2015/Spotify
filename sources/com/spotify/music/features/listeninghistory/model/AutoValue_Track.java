package com.spotify.music.features.listeninghistory.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Track extends C$AutoValue_Track {
    public static final Creator<AutoValue_Track> CREATOR = new Creator<AutoValue_Track>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_Track autoValue_Track = new AutoValue_Track(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return autoValue_Track;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Track[i];
        }
    };

    AutoValue_Track(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getTrackUri());
        parcel.writeString(getTrackName());
        parcel.writeString(getMainArtistUri());
        parcel.writeString(getMainArtistName());
        parcel.writeString(getTimestamp());
        parcel.writeString(getAlbumName());
        parcel.writeString(getPlayContext());
        parcel.writeString(getCoverArtUri());
    }
}
