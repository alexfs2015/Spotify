package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_EventResult extends C$AutoValue_EventResult {
    public static final Creator<AutoValue_EventResult> CREATOR = new Creator<AutoValue_EventResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_EventResult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_EventResult.EVENT_RESULT_CONCERTS_PARCEL_ADAPTER);
            AutoValue_EventResult.STRING_LIST_TYPE_ADAPTER;
            AutoValue_EventResult autoValue_EventResult = new AutoValue_EventResult(createTypedArrayList, uqa.a(parcel), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_EventResult;
        }
    };
    /* access modifiers changed from: private */
    public static final a EVENT_RESULT_CONCERTS_PARCEL_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final uqa STRING_LIST_TYPE_ADAPTER = new uqa();

    public final int describeContents() {
        return 0;
    }

    AutoValue_EventResult(List<ConcertResult> list, List<String> list2, String str, String str2, String str3, String str4, String str5) {
        super(list, list2, str, str2, str3, str4, str5);
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
