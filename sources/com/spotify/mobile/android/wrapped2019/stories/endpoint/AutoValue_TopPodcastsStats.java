package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

final class AutoValue_TopPodcastsStats extends C$AutoValue_TopPodcastsStats {
    public static final Creator<AutoValue_TopPodcastsStats> CREATOR = new Creator<AutoValue_TopPodcastsStats>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<TopPodcastsStats> cls = TopPodcastsStats.class;
            return new AutoValue_TopPodcastsStats(parcel.readString(), (StoryParagraph) parcel.readParcelable(TopPodcastsStats.class.getClassLoader()), (StoryParagraph) parcel.readParcelable(TopPodcastsStats.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopPodcastsStats[i];
        }
    };

    AutoValue_TopPodcastsStats(String str, StoryParagraph storyParagraph, StoryParagraph storyParagraph2) {
        super(str, storyParagraph, storyParagraph2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(imageUrl());
        parcel.writeParcelable(paragraph1(), i);
        parcel.writeParcelable(paragraph2(), i);
    }
}
