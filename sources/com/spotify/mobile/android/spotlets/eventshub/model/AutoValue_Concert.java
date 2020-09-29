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
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                String readString3 = parcel.readString();
                String str2 = readString3;
                str = readString3;
            } else {
                str = null;
            }
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_Concert.ARTIST_ADAPTER);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            List createTypedArrayList2 = parcel.readInt() == 0 ? parcel.createTypedArrayList(AutoValue_Concert.CONCERT_PARTNER_ADAPTER) : null;
            List createTypedArrayList3 = parcel.readInt() == 0 ? parcel.createTypedArrayList(AutoValue_Concert.CONCERT_TICKETING_ADAPTER) : null;
            AutoValue_Concert autoValue_Concert = r0;
            String str3 = readString;
            String str4 = readString;
            String str5 = readString2;
            String str6 = readString2;
            String str7 = str;
            String str8 = readString4;
            String str9 = readString5;
            String str10 = readString5;
            ArrayList arrayList = createTypedArrayList;
            ArrayList arrayList2 = createTypedArrayList;
            boolean z2 = z;
            boolean z3 = z;
            List list = createTypedArrayList2;
            List list2 = createTypedArrayList3;
            AutoValue_Concert autoValue_Concert2 = new AutoValue_Concert(str4, str6, str7, str8, str10, arrayList2, z3, list, createTypedArrayList3);
            return autoValue_Concert2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Concert[i];
        }
    };

    AutoValue_Concert(String str, String str2, String str3, String str4, String str5, List<Artist> list, boolean z, List<ConcertPartner> list2, List<ConcertTicketing> list3) {
        super(str, str2, str3, str4, str5, list, z, list2, list3);
    }

    public final int describeContents() {
        return 0;
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
