package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_AlbumRelated extends C$AutoValue_AlbumRelated {
    public static final Creator<AutoValue_AlbumRelated> CREATOR = new Creator<AutoValue_AlbumRelated>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AlbumRelated[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AlbumRelated(parcel.readArrayList(AlbumRelated.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_AlbumRelated(List<AlbumRelease> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getReleases());
    }
}
