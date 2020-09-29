package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ConsumerShareResponse extends C$AutoValue_ConsumerShareResponse {
    public static final Creator<AutoValue_ConsumerShareResponse> CREATOR = new Creator<AutoValue_ConsumerShareResponse>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<ConsumerShareResponse> cls = ConsumerShareResponse.class;
            return new AutoValue_ConsumerShareResponse((ShareStories) parcel.readParcelable(ConsumerShareResponse.class.getClassLoader()), (ShareMessaging) parcel.readParcelable(ConsumerShareResponse.class.getClassLoader()), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConsumerShareResponse[i];
        }
    };

    AutoValue_ConsumerShareResponse(ShareStories shareStories, ShareMessaging shareMessaging, String str) {
        super(shareStories, shareMessaging, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(stories(), i);
        parcel.writeParcelable(messaging(), i);
        parcel.writeString(previewImageUrl());
    }
}
