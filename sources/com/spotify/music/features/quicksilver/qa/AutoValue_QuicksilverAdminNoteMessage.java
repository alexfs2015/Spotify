package com.spotify.music.features.quicksilver.qa;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;

final class AutoValue_QuicksilverAdminNoteMessage extends C$AutoValue_QuicksilverAdminNoteMessage {
    public static final Creator<AutoValue_QuicksilverAdminNoteMessage> CREATOR = new Creator<AutoValue_QuicksilverAdminNoteMessage>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_QuicksilverAdminNoteMessage autoValue_QuicksilverAdminNoteMessage = new AutoValue_QuicksilverAdminNoteMessage(readString, z, (NoteMessage) parcel.readParcelable(QuicksilverAdminNoteMessage.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt());
            return autoValue_QuicksilverAdminNoteMessage;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_QuicksilverAdminNoteMessage[i];
        }
    };

    AutoValue_QuicksilverAdminNoteMessage(String str, boolean z, NoteMessage noteMessage, int i, String str2, int i2) {
        super(str, z, noteMessage, i, str2, i2);
    }

    public final int describeContents() {
        return 0;
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
