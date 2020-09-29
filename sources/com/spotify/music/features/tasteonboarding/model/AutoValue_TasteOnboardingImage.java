package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_TasteOnboardingImage extends C$AutoValue_TasteOnboardingImage {
    public static final Creator<AutoValue_TasteOnboardingImage> CREATOR = new Creator<AutoValue_TasteOnboardingImage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TasteOnboardingImage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_TasteOnboardingImage(parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_TasteOnboardingImage(String str, int i, int i2) {
        super(str, i, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uri());
        parcel.writeInt(height());
        parcel.writeInt(width());
    }
}
