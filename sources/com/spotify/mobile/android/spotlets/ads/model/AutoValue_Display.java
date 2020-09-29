package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Display extends C$AutoValue_Display {
    public static final Creator<AutoValue_Display> CREATOR = new Creator<AutoValue_Display>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Display[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Display(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null);
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Display(int i, int i2, String str) {
        super(i, i2, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        if (displayMedia() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(displayMedia());
    }
}
