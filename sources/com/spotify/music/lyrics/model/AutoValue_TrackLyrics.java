package com.spotify.music.lyrics.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_TrackLyrics extends C$AutoValue_TrackLyrics {
    public static final Creator<AutoValue_TrackLyrics> CREATOR = new Creator<AutoValue_TrackLyrics>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TrackLyrics[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_TrackLyrics autoValue_TrackLyrics = new AutoValue_TrackLyrics(parcel.readArrayList(TrackLyrics.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (ProviderAndroidIntent) parcel.readParcelable(TrackLyrics.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_TrackLyrics;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_TrackLyrics(List<LyricsLineData> list, String str, String str2, String str3, ProviderAndroidIntent providerAndroidIntent, String str4, String str5) {
        super(list, str, str2, str3, providerAndroidIntent, str4, str5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getLines());
        parcel.writeString(getKind());
        parcel.writeString(getTrackId());
        if (getProvider() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getProvider());
        }
        parcel.writeParcelable(getProviderAndroidIntent(), i);
        if (getWriters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getWriters());
        }
        if (getPublishersCredits() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getPublishersCredits());
    }
}
