package com.spotify.podcastonboarding.topicpicker.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_TopicItem extends C$AutoValue_TopicItem {
    public static final Creator<AutoValue_TopicItem> CREATOR = new Creator<AutoValue_TopicItem>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString5 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_TopicItem autoValue_TopicItem = new AutoValue_TopicItem(readString, readString2, readString3, readString4, readString5, z, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_TopicItem;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopicItem[i];
        }
    };

    AutoValue_TopicItem(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        super(str, str2, str3, str4, str5, z, str6);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeString(name());
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        if (parent() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(parent());
        }
        parcel.writeString(color());
        parcel.writeInt(selected() ? 1 : 0);
        if (image() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(image());
    }
}
