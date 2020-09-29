package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_ArtistConcertsModel extends C$AutoValue_ArtistConcertsModel {
    /* access modifiers changed from: private */
    public static final a ARTIST_CONCERTS_PARCEL_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final b ARTIST_PARCEL_ADAPTER = new b();
    public static final Creator<AutoValue_ArtistConcertsModel> CREATOR = new Creator<AutoValue_ArtistConcertsModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ArtistConcertsModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ArtistConcertsModel((Artist) AutoValue_ArtistConcertsModel.ARTIST_PARCEL_ADAPTER.a(parcel), parcel.readInt() == 0 ? parcel.readString() : null, parcel.createTypedArrayList(AutoValue_ArtistConcertsModel.ARTIST_CONCERTS_PARCEL_ADAPTER));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_ArtistConcertsModel(Artist artist, String str, List<ConcertResult> list) {
        super(artist, str, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, (Parcelable) getArtist(), 0);
        if (getUserLocation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUserLocation());
        }
        a.a(getConcerts(), parcel);
    }
}
