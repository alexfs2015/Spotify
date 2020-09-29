package com.spotify.mobile.android.wrapped2019.stories;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_StoryParagraph extends C$AutoValue_StoryParagraph {
    public static final Creator<AutoValue_StoryParagraph> CREATOR = new Creator<AutoValue_StoryParagraph>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<StoryParagraph> cls = StoryParagraph.class;
            return new AutoValue_StoryParagraph(parcel.readString(), parcel.readArrayList(StoryParagraph.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_StoryParagraph[i];
        }
    };

    AutoValue_StoryParagraph(String str, List<String> list) {
        super(str, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text());
        parcel.writeList(values());
    }
}
