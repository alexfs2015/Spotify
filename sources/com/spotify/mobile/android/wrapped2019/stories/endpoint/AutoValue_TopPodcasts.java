package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_TopPodcasts extends C$AutoValue_TopPodcasts {
    public static final Creator<AutoValue_TopPodcasts> CREATOR = new Creator<AutoValue_TopPodcasts>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<TopPodcasts> cls = TopPodcasts.class;
            return new AutoValue_TopPodcasts(parcel.readString(), parcel.readString(), (TopPodcastsTop) parcel.readParcelable(TopPodcasts.class.getClassLoader()), (TopPodcastsStats) parcel.readParcelable(TopPodcasts.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopPodcasts[i];
        }
    };

    AutoValue_TopPodcasts(String str, String str2, TopPodcastsTop topPodcastsTop, TopPodcastsStats topPodcastsStats) {
        super(str, str2, topPodcastsTop, topPodcastsStats);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(previewUrl());
        parcel.writeString(caption());
        parcel.writeParcelable(top(), i);
        parcel.writeParcelable(stats(), i);
    }
}
