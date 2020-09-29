package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_QuicksilverClickAction extends C$AutoValue_QuicksilverClickAction {
    public static final Creator<AutoValue_QuicksilverClickAction> CREATOR = new Creator<AutoValue_QuicksilverClickAction>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_QuicksilverClickAction[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String str = null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_QuicksilverClickAction(readString, readString2, str, Boolean.valueOf(z));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_QuicksilverClickAction(String str, String str2, String str3, Boolean bool) {
        super(str, str2, str3, bool);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getButtonType());
        if (getUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUrl());
        }
        if (getTrackingUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTrackingUrl());
        }
        parcel.writeInt(getShouldDismiss().booleanValue() ? 1 : 0);
    }
}
