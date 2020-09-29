package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

final class AutoValue_TopArtist extends C$AutoValue_TopArtist {
    public static final Creator<AutoValue_TopArtist> CREATOR = new Creator<AutoValue_TopArtist>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopArtist[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_TopArtist autoValue_TopArtist = new AutoValue_TopArtist(parcel.readString(), parcel.readString(), (StoryParagraph) parcel.readParcelable(TopArtist.class.getClassLoader()), (StoryParagraph) parcel.readParcelable(TopArtist.class.getClassLoader()), (Artist) parcel.readParcelable(TopArtist.class.getClassLoader()));
            return autoValue_TopArtist;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_TopArtist(String str, String str2, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, Artist artist) {
        super(str, str2, storyParagraph, storyParagraph2, artist);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(previewUrl());
        parcel.writeString(caption());
        parcel.writeParcelable(amountStreamed(), i);
        parcel.writeParcelable(favoriteSong(), i);
        parcel.writeParcelable(artist(), i);
    }
}
