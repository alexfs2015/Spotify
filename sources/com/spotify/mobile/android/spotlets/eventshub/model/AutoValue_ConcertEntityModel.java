package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_ConcertEntityModel extends C$AutoValue_ConcertEntityModel {
    /* access modifiers changed from: private */
    public static final a ALBUMS_FOR_CONCERT_PARCEL_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final b ARTIST_ADAPTER = new b();
    /* access modifiers changed from: private */
    public static final c CONCERT_RESULT_PARCEL_ADAPTER = new c();
    public static final Creator<AutoValue_ConcertEntityModel> CREATOR = new Creator<AutoValue_ConcertEntityModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConcertEntityModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            List list;
            List list2;
            ConcertResult concertResult = (ConcertResult) AutoValue_ConcertEntityModel.CONCERT_RESULT_PARCEL_ADAPTER.a(parcel);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_ConcertEntityModel.ARTIST_ADAPTER);
            if (parcel.readInt() == 0) {
                list = parcel.createTypedArrayList(AutoValue_ConcertEntityModel.UPCOMING_CONCERTS_PARCEL_ADAPTER);
            } else {
                list = null;
            }
            if (parcel.readInt() == 0) {
                list2 = parcel.createTypedArrayList(AutoValue_ConcertEntityModel.ALBUMS_FOR_CONCERT_PARCEL_ADAPTER);
            } else {
                list2 = null;
            }
            AutoValue_ConcertEntityModel autoValue_ConcertEntityModel = new AutoValue_ConcertEntityModel(concertResult, createTypedArrayList, list, list2, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_ConcertEntityModel;
        }
    };
    /* access modifiers changed from: private */
    public static final d UPCOMING_CONCERTS_PARCEL_ADAPTER = new d();

    public final int describeContents() {
        return 0;
    }

    AutoValue_ConcertEntityModel(ConcertResult concertResult, List<Artist> list, List<ConcertResult> list2, List<Album> list3, String str, String str2, String str3, String str4) {
        super(concertResult, list, list2, list3, str, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, (Parcelable) getConcertResult(), 0);
        b.a(getArtists(), parcel);
        if (getUpcomingConcerts() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            d.a(getUpcomingConcerts(), parcel);
        }
        if (getAlbumsForConcert() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            a.a(getAlbumsForConcert(), parcel);
        }
        if (getUserLocation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUserLocation());
        }
        if (getUpcomingConcertsSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUpcomingConcertsSource());
        }
        if (getColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getColor());
        }
        if (getTicketAvailability() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getTicketAvailability());
    }
}
