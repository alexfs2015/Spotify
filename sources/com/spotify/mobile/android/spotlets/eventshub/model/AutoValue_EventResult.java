package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_EventResult extends C$AutoValue_EventResult {
    public static final Creator<AutoValue_EventResult> CREATOR = new Creator<AutoValue_EventResult>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_EventResult.EVENT_RESULT_CONCERTS_PARCEL_ADAPTER);
            AutoValue_EventResult.STRING_LIST_TYPE_ADAPTER;
            List a = vbf.a(parcel);
            int i = 0 >> 0;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                String readString2 = parcel.readString();
                String str3 = readString2;
                str = readString2;
            } else {
                str = null;
            }
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                String readString4 = parcel.readString();
                String str4 = readString4;
                str2 = readString4;
            } else {
                str2 = null;
            }
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            AutoValue_EventResult autoValue_EventResult = r0;
            String str5 = readString;
            String str6 = readString;
            String str7 = str;
            String str8 = str;
            String str9 = readString3;
            String str10 = readString3;
            String str11 = str2;
            String str12 = str2;
            String str13 = readString5;
            AutoValue_EventResult autoValue_EventResult2 = new AutoValue_EventResult(createTypedArrayList, a, str6, str8, str10, str12, readString5);
            return autoValue_EventResult2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_EventResult[i];
        }
    };
    /* access modifiers changed from: private */
    public static final a EVENT_RESULT_CONCERTS_PARCEL_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final vbf STRING_LIST_TYPE_ADAPTER = new vbf();

    AutoValue_EventResult(List<ConcertResult> list, List<String> list2, String str, String str2, String str3, String str4, String str5) {
        super(list, list2, str, str2, str3, str4, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a.a(getConcertResults(), parcel);
        parcel.writeStringList(getArtists());
        if (getSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSource());
        }
        if (getOpeningDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOpeningDate());
        }
        if (getClosingDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getClosingDate());
        }
        if (getVenue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getVenue());
        }
        if (getLocation() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getLocation());
    }
}
