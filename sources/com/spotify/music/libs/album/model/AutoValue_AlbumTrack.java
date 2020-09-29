package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_AlbumTrack extends C$AutoValue_AlbumTrack {
    public static final Creator<AutoValue_AlbumTrack> CREATOR = new Creator<AutoValue_AlbumTrack>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList readArrayList = parcel.readArrayList(AlbumTrack.class.getClassLoader());
            AutoValue_AlbumTrack.OFFLINE_STATE_TYPE_ADAPTER;
            AutoValue_AlbumTrack autoValue_AlbumTrack = new AutoValue_AlbumTrack(z2, z, readInt, readString, readString2, readArrayList, vlk.a(parcel));
            return autoValue_AlbumTrack;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AlbumTrack[i];
        }
    };
    /* access modifiers changed from: private */
    public static final vlk OFFLINE_STATE_TYPE_ADAPTER = new vlk();

    AutoValue_AlbumTrack(boolean z, boolean z2, int i, String str, String str2, List<AlbumArtist> list, vli vli) {
        super(z, z2, i, str, str2, list, vli);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(isPlayable() ? 1 : 0);
        parcel.writeInt(isExplicit() ? 1 : 0);
        parcel.writeInt(getDuration());
        parcel.writeString(getUri());
        parcel.writeString(getName());
        parcel.writeList(getArtists());
        vlk.a(getOffline(), parcel);
    }
}
