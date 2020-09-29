package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

final class AutoValue_QuicksilverCardMessage extends C$AutoValue_QuicksilverCardMessage {
    public static final Creator<AutoValue_QuicksilverCardMessage> CREATOR = new Creator<AutoValue_QuicksilverCardMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_QuicksilverCardMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_QuicksilverCardMessage autoValue_QuicksilverCardMessage = new AutoValue_QuicksilverCardMessage(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readHashMap(QuicksilverCardMessage.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1);
            return autoValue_QuicksilverCardMessage;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_QuicksilverCardMessage(String str, String str2, Map<String, QuicksilverClickAction> map, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(str, str2, map, str3, str4, str5, str6, str7, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getHeading() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getHeading());
        }
        parcel.writeString(getHtmlContent());
        parcel.writeMap(getClickActions());
        if (getIcon() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIcon());
        }
        if (getImpressionUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getImpressionUrl());
        }
        if (getCloseTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getCloseTitle());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        if (getUuid() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUuid());
        }
        parcel.writeInt(isFullscreen() ? 1 : 0);
    }
}
