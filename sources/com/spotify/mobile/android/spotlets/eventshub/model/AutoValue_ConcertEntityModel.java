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
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            List list;
            List list2;
            String str;
            String str2;
            String str3;
            Parcelable a = AutoValue_ConcertEntityModel.CONCERT_RESULT_PARCEL_ADAPTER.a(parcel);
            Parcelable parcelable = a;
            ConcertResult concertResult = (ConcertResult) a;
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_ConcertEntityModel.ARTIST_ADAPTER);
            if (parcel.readInt() == 0) {
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(AutoValue_ConcertEntityModel.UPCOMING_CONCERTS_PARCEL_ADAPTER);
                List list3 = createTypedArrayList2;
                list = createTypedArrayList2;
            } else {
                list = null;
            }
            if (parcel.readInt() == 0) {
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(AutoValue_ConcertEntityModel.ALBUMS_FOR_CONCERT_PARCEL_ADAPTER);
                List list4 = createTypedArrayList3;
                list2 = createTypedArrayList3;
            } else {
                list2 = null;
            }
            if (parcel.readInt() == 0) {
                String readString = parcel.readString();
                String str4 = readString;
                str = readString;
            } else {
                str = null;
            }
            if (parcel.readInt() == 0) {
                String readString2 = parcel.readString();
                String str5 = readString2;
                str2 = readString2;
            } else {
                str2 = null;
            }
            if (parcel.readInt() == 0) {
                String readString3 = parcel.readString();
                String str6 = readString3;
                str3 = readString3;
            } else {
                str3 = null;
            }
            AutoValue_ConcertEntityModel autoValue_ConcertEntityModel = r0;
            List list5 = list;
            List list6 = list2;
            String str7 = str;
            String str8 = str;
            String str9 = str2;
            AutoValue_ConcertEntityModel autoValue_ConcertEntityModel2 = new AutoValue_ConcertEntityModel(concertResult, createTypedArrayList, list5, list6, str8, str2, str3, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_ConcertEntityModel2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConcertEntityModel[i];
        }
    };
    /* access modifiers changed from: private */
    public static final d UPCOMING_CONCERTS_PARCEL_ADAPTER = new d();

    AutoValue_ConcertEntityModel(ConcertResult concertResult, List<Artist> list, List<ConcertResult> list2, List<Album> list3, String str, String str2, String str3, String str4) {
        super(concertResult, list, list2, list3, str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, (Parcelable) getConcertResult(), 0);
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
