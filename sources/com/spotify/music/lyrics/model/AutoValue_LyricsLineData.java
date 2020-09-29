package com.spotify.music.lyrics.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_LyricsLineData extends C$AutoValue_LyricsLineData {
    public static final Creator<AutoValue_LyricsLineData> CREATOR = new Creator<AutoValue_LyricsLineData>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_LyricsLineData(parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(LyricsLineData.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_LyricsLineData[i];
        }
    };

    AutoValue_LyricsLineData(Integer num, List<Word> list) {
        super(num, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (time() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(time().intValue());
        }
        parcel.writeList(words());
    }
}
