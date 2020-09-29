package com.spotify.music.features.quicksilver.qa;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_CreativeTemplate extends C$AutoValue_CreativeTemplate {
    public static final Creator<AutoValue_CreativeTemplate> CREATOR = new Creator<AutoValue_CreativeTemplate>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_CreativeTemplate autoValue_CreativeTemplate = new AutoValue_CreativeTemplate(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return autoValue_CreativeTemplate;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CreativeTemplate[i];
        }
    };

    AutoValue_CreativeTemplate(int i, String str, String str2, String str3, String str4) {
        super(i, str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getId());
        parcel.writeString(getTemplate());
        parcel.writeString(getType());
        parcel.writeString(getVersion());
        parcel.writeString(getName());
    }
}
