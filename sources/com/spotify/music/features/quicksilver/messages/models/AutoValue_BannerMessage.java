package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

final class AutoValue_BannerMessage extends C$AutoValue_BannerMessage {
    public static final Creator<AutoValue_BannerMessage> CREATOR = new Creator<AutoValue_BannerMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_BannerMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_BannerMessage autoValue_BannerMessage = new AutoValue_BannerMessage(parcel.readString(), parcel.readHashMap(BannerMessage.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_BannerMessage;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_BannerMessage(String str, Map<String, QuicksilverClickAction> map, String str2, String str3, String str4) {
        super(str, map, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getHtmlContent());
        parcel.writeMap(getClickActions());
        if (getImpressionUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getImpressionUrl());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        if (getUuid() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUuid());
    }
}
