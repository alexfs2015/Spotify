package com.spotify.music.spotlets.radio.formatlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;
import java.util.Map;

final class AutoValue_RadioFormatListSourceModel extends C$AutoValue_RadioFormatListSourceModel {
    public static final Creator<AutoValue_RadioFormatListSourceModel> CREATOR = new Creator<AutoValue_RadioFormatListSourceModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RadioFormatListSourceModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_RadioFormatListSourceModel(parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(RadioFormatListSourceModel.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_RadioFormatListSourceModel(Integer num, List<Map<String, String>> list) {
        super(num, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (total() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(total().intValue());
        }
        parcel.writeList(mediaItems());
    }
}
