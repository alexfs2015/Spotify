package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_Album extends C$AutoValue_Album {
    public static final Creator<AutoValue_Album> CREATOR = new Creator<AutoValue_Album>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            AutoValue_Album autoValue_Album = new AutoValue_Album(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (AlbumType) Enum.valueOf(AlbumType.class, parcel.readString()), parcel.readString(), parcel.readString(), (AlbumImage) parcel2.readParcelable(Album.class.getClassLoader()), (AlbumRelated) parcel2.readParcelable(Album.class.getClassLoader()), parcel2.readArrayList(Album.class.getClassLoader()), parcel2.readArrayList(Album.class.getClassLoader()), parcel2.readArrayList(Album.class.getClassLoader()), parcel2.readArrayList(Album.class.getClassLoader()));
            return autoValue_Album;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Album[i];
        }
    };

    AutoValue_Album(int i, int i2, int i3, int i4, AlbumType albumType, String str, String str2, AlbumImage albumImage, AlbumRelated albumRelated, List<String> list, List<AlbumDisc> list2, List<AlbumArtist> list3, List<AlbumTrack> list4) {
        super(i, i2, i3, i4, albumType, str, str2, albumImage, albumRelated, list, list2, list3, list4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getDay());
        parcel.writeInt(getMonth());
        parcel.writeInt(getYear());
        parcel.writeInt(getTrackCount());
        parcel.writeString(getType().name());
        parcel.writeString(getName());
        parcel.writeString(getUri());
        parcel.writeParcelable(getCover(), i);
        parcel.writeParcelable(getRelated(), i);
        parcel.writeList(getCopyrights());
        parcel.writeList(getDiscs());
        parcel.writeList(getArtists());
        parcel.writeList(getTracks());
    }
}
