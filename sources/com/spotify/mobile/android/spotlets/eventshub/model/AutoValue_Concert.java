package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_Concert extends C$AutoValue_Concert {
    /* access modifiers changed from: private */
    public static final a ARTIST_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final b CONCERT_PARTNER_ADAPTER = new b();
    /* access modifiers changed from: private */
    public static final c CONCERT_TICKETING_ADAPTER = new c();
    public static final Creator<AutoValue_Concert> CREATOR = new Creator<AutoValue_Concert>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Concert[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            List list;
            List list2;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_Concert.ARTIST_ADAPTER);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            if (parcel.readInt() == 0) {
                list = parcel.createTypedArrayList(AutoValue_Concert.CONCERT_PARTNER_ADAPTER);
            } else {
                list = null;
            }
            if (parcel.readInt() == 0) {
                list2 = parcel.createTypedArrayList(AutoValue_Concert.CONCERT_TICKETING_ADAPTER);
            } else {
                list2 = null;
            }
            AutoValue_Concert autoValue_Concert = new AutoValue_Concert(readString, readString2, readString3, readString4, readString5, createTypedArrayList, z, list, list2);
            return autoValue_Concert;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Concert(String str, String str2, String str3, String str4, String str5, List<Artist> list, boolean z, List<ConcertPartner> list2, List<ConcertTicketing> list3) {
        super(str, str2, str3, str4, str5, list, z, list2, list3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        if (getDateString() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDateString());
        }
        if (getTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTitle());
        }
        if (getLocation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getLocation());
        }
        if (getVenue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getVenue());
        }
        a.a(getArtists(), parcel);
        parcel.writeInt(isFestival() ? 1 : 0);
        if (getPartnerConcerts() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            b.a(getPartnerConcerts(), parcel);
        }
        if (getTicketing() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        c.a(getTicketing(), parcel);
    }
}
