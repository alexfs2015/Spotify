package com.spotify.music.features.quicksilver.qa;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

final class AutoValue_QuicksilverAdminBannerMessage extends C$AutoValue_QuicksilverAdminBannerMessage {
    public static final Creator<AutoValue_QuicksilverAdminBannerMessage> CREATOR = new Creator<AutoValue_QuicksilverAdminBannerMessage>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_QuicksilverAdminBannerMessage autoValue_QuicksilverAdminBannerMessage = new AutoValue_QuicksilverAdminBannerMessage(readString, z, (BannerMessage) parcel.readParcelable(QuicksilverAdminBannerMessage.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt());
            return autoValue_QuicksilverAdminBannerMessage;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_QuicksilverAdminBannerMessage[i];
        }
    };

    AutoValue_QuicksilverAdminBannerMessage(String str, boolean z, BannerMessage bannerMessage, int i, String str2, int i2) {
        super(str, z, bannerMessage, i, str2, i2);
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
