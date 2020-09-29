package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

final class AutoValue_TopArtist extends C$AutoValue_TopArtist {
    public static final Creator<AutoValue_TopArtist> CREATOR = new Creator<AutoValue_TopArtist>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Class<TopArtist> cls = TopArtist.class;
            StoryParagraph storyParagraph = (StoryParagraph) parcel.readParcelable(TopArtist.class.getClassLoader());
            Parcelable readParcelable = parcel.readParcelable(TopArtist.class.getClassLoader());
            Parcelable parcelable = readParcelable;
            StoryParagraph storyParagraph2 = (StoryParagraph) readParcelable;
            Class<TopArtist> cls2 = TopArtist.class;
            Parcelable readParcelable2 = parcel.readParcelable(TopArtist.class.getClassLoader());
            Parcelable parcelable2 = readParcelable2;
            AutoValue_TopArtist autoValue_TopArtist = r0;
            AutoValue_TopArtist autoValue_TopArtist2 = new AutoValue_TopArtist(readString, readString2, storyParagraph, storyParagraph2, (Artist) readParcelable2);
            return autoValue_TopArtist2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopArtist[i];
        }
    };

    AutoValue_TopArtist(String str, String str2, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, Artist artist) {
        super(str, str2, storyParagraph, storyParagraph2, artist);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(previewUrl());
        parcel.writeString(caption());
        parcel.writeParcelable(amountStreamed(), i);
        parcel.writeParcelable(favoriteSong(), i);
        parcel.writeParcelable(artist(), i);
    }
}
