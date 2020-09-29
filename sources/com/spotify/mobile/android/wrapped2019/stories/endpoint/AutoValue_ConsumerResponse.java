package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_ConsumerResponse extends C$AutoValue_ConsumerResponse {
    public static final Creator<AutoValue_ConsumerResponse> CREATOR = new Creator<AutoValue_ConsumerResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConsumerResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ConsumerResponse(parcel.readArrayList(ConsumerResponse.class.getClassLoader()), (TopArtist) parcel.readParcelable(ConsumerResponse.class.getClassLoader()), (TopPodcasts) parcel.readParcelable(ConsumerResponse.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_ConsumerResponse(List<String> list, TopArtist topArtist, TopPodcasts topPodcasts) {
        super(list, topArtist, topPodcasts);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(order());
        parcel.writeParcelable(topArtist(), i);
        parcel.writeParcelable(topPodcasts(), i);
    }
}
