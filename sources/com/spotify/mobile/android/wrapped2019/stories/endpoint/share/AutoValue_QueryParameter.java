package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_QueryParameter extends C$AutoValue_QueryParameter {
    public static final Creator<AutoValue_QueryParameter> CREATOR = new Creator<AutoValue_QueryParameter>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_QueryParameter(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_QueryParameter[i];
        }
    };

    AutoValue_QueryParameter(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(key());
        parcel.writeString(value());
    }
}
