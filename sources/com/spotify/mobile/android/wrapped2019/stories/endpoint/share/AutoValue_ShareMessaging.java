package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_ShareMessaging extends C$AutoValue_ShareMessaging {
    public static final Creator<AutoValue_ShareMessaging> CREATOR = new Creator<AutoValue_ShareMessaging>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ShareMessaging(parcel.readString(), parcel.readArrayList(ShareMessaging.class.getClassLoader()), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ShareMessaging[i];
        }
    };

    AutoValue_ShareMessaging(String str, List<QueryParameter> list, String str2) {
        super(str, list, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(shareUri());
        parcel.writeList(queryParameters());
        parcel.writeString(freeText());
    }
}
