package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_ShareStories extends C$AutoValue_ShareStories {
    public static final Creator<AutoValue_ShareStories> CREATOR = new Creator<AutoValue_ShareStories>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<ShareStories> cls = ShareStories.class;
            return new AutoValue_ShareStories(parcel.readString(), parcel.readArrayList(ShareStories.class.getClassLoader()), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ShareStories[i];
        }
    };

    AutoValue_ShareStories(String str, List<QueryParameter> list, String str2) {
        super(str, list, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(shareUri());
        parcel.writeList(queryParameters());
        parcel.writeString(imageUrl());
    }
}
