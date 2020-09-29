package com.spotify.music.features.quicksilver.qa;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;

final class AutoValue_QuicksilverAdminCardMessage extends C$AutoValue_QuicksilverAdminCardMessage {
    public static final Creator<AutoValue_QuicksilverAdminCardMessage> CREATOR = new Creator<AutoValue_QuicksilverAdminCardMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_QuicksilverAdminCardMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_QuicksilverAdminCardMessage autoValue_QuicksilverAdminCardMessage = new AutoValue_QuicksilverAdminCardMessage(readString, z, (QuicksilverCardMessage) parcel.readParcelable(QuicksilverAdminCardMessage.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt());
            return autoValue_QuicksilverAdminCardMessage;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_QuicksilverAdminCardMessage(String str, boolean z, QuicksilverCardMessage quicksilverCardMessage, int i, String str2, int i2) {
        super(str, z, quicksilverCardMessage, i, str2, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeInt(active() ? 1 : 0);
        parcel.writeParcelable(content(), i);
        parcel.writeInt(groupId());
        parcel.writeString(locales());
        parcel.writeInt(templateId());
    }
}
