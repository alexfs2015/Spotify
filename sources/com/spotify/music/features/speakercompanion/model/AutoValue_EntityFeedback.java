package com.spotify.music.features.speakercompanion.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_EntityFeedback extends C$AutoValue_EntityFeedback {
    public static final Creator<AutoValue_EntityFeedback> CREATOR = new Creator<AutoValue_EntityFeedback>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_EntityFeedback[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_EntityFeedback autoValue_EntityFeedback = new AutoValue_EntityFeedback(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return autoValue_EntityFeedback;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_EntityFeedback(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uid());
        parcel.writeString(entityUri());
        parcel.writeString(title());
        parcel.writeString(imageUri());
        parcel.writeString(actionUri());
    }
}
