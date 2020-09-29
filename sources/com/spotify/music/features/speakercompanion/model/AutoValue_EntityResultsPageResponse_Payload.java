package com.spotify.music.features.speakercompanion.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import java.util.List;

final class AutoValue_EntityResultsPageResponse_Payload extends C$AutoValue_EntityResultsPageResponse_Payload {
    public static final Creator<AutoValue_EntityResultsPageResponse_Payload> CREATOR = new Creator<AutoValue_EntityResultsPageResponse_Payload>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_EntityResultsPageResponse_Payload((qpt) parcel.readParcelable(Payload.class.getClassLoader()), parcel.readArrayList(Payload.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_EntityResultsPageResponse_Payload[i];
        }
    };

    AutoValue_EntityResultsPageResponse_Payload(qpt qpt, List<qpt> list) {
        super(qpt, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(fulfillment(), i);
        parcel.writeList(results());
    }
}
