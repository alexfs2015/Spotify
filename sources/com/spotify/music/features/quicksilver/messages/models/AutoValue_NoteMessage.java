package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

final class AutoValue_NoteMessage extends C$AutoValue_NoteMessage {
    public static final Creator<AutoValue_NoteMessage> CREATOR = new Creator<AutoValue_NoteMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_NoteMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_NoteMessage autoValue_NoteMessage = new AutoValue_NoteMessage(parcel.readString(), parcel.readHashMap(NoteMessage.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_NoteMessage;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_NoteMessage(String str, Map<String, QuicksilverClickAction> map, String str2, String str3, String str4) {
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
