package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_AlbumDisc extends C$AutoValue_AlbumDisc {
    public static final Creator<AutoValue_AlbumDisc> CREATOR = new Creator<AutoValue_AlbumDisc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AlbumDisc(parcel.readArrayList(AlbumDisc.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AlbumDisc[i];
        }
    };

    AutoValue_AlbumDisc(List<AlbumTrack> list) {
        super(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getTracks());
    }
}
