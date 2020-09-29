package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_TopPodcastsTop extends C$AutoValue_TopPodcastsTop {
    public static final Creator<AutoValue_TopPodcastsTop> CREATOR = new Creator<AutoValue_TopPodcastsTop>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_TopPodcastsTop(parcel.readString(), parcel.readArrayList(TopPodcastsTop.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopPodcastsTop[i];
        }
    };

    AutoValue_TopPodcastsTop(String str, List<Podcast> list) {
        super(str, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(caption());
        parcel.writeList(podcasts());
    }
}
