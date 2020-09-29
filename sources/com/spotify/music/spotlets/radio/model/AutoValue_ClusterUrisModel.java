package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_ClusterUrisModel extends C$AutoValue_ClusterUrisModel {
    public static final Creator<AutoValue_ClusterUrisModel> CREATOR = new Creator<AutoValue_ClusterUrisModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ClusterUrisModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_ClusterUrisModel.STRING_LIST_TYPE_ADAPTER;
            return new AutoValue_ClusterUrisModel(uqa.a(parcel));
        }
    };
    /* access modifiers changed from: private */
    public static final uqa STRING_LIST_TYPE_ADAPTER = new uqa();

    public final int describeContents() {
        return 0;
    }

    AutoValue_ClusterUrisModel(List<String> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(clusterUris());
    }
}
