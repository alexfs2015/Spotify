package com.spotify.music.features.languagepicker.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_AvailableLanguage extends C$AutoValue_AvailableLanguage {
    public static final Creator<AutoValue_AvailableLanguage> CREATOR = new Creator<AutoValue_AvailableLanguage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AvailableLanguage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AvailableLanguage(parcel.readString(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_AvailableLanguage(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
        parcel.writeString(imageUri());
        parcel.writeString(bcp47());
    }
}
