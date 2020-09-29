package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_WindowedContentMessage extends C$AutoValue_WindowedContentMessage {
    public static final Creator<AutoValue_WindowedContentMessage> CREATOR = new Creator<AutoValue_WindowedContentMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_WindowedContentMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_WindowedContentMessage(readString, str);
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_WindowedContentMessage(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getTitleText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTitleText());
        }
        if (getBodyText() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getBodyText());
    }
}
