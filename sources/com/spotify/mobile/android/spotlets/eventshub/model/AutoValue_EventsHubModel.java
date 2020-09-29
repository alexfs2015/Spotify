package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_EventsHubModel extends C$AutoValue_EventsHubModel {
    public static final Creator<AutoValue_EventsHubModel> CREATOR = new Creator<AutoValue_EventsHubModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_EventsHubModel.EVENT_RESULT_ADAPTER);
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_EventsHubModel(createTypedArrayList, readString, str);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_EventsHubModel[i];
        }
    };
    /* access modifiers changed from: private */
    public static final a EVENT_RESULT_ADAPTER = new a();

    AutoValue_EventsHubModel(List<EventResult> list, String str, String str2) {
        super(list, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a.a(getEvents(), parcel);
        if (getHeaderImageUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getHeaderImageUri());
        }
        if (getUserLocation() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUserLocation());
    }
}
