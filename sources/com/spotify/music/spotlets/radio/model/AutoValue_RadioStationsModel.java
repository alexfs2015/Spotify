package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_RadioStationsModel extends C$AutoValue_RadioStationsModel {
    /* access modifiers changed from: private */
    public static final a CLUSTER_STATIONS_ADAPTER = new a();
    public static final Creator<AutoValue_RadioStationsModel> CREATOR = new Creator<AutoValue_RadioStationsModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RadioStationsModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_RadioStationsModel autoValue_RadioStationsModel = new AutoValue_RadioStationsModel(AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.CLUSTER_STATIONS_ADAPTER.a(parcel));
            return autoValue_RadioStationsModel;
        }
    };
    /* access modifiers changed from: private */
    public static final a STATION_LIST_ADAPTER = new a();

    public final int describeContents() {
        return 0;
    }

    AutoValue_RadioStationsModel(List<RadioStationModel> list, List<RadioStationModel> list2, List<RadioStationModel> list3, List<RadioStationModel> list4, List<ClusterRadioStationModel> list5) {
        super(list, list2, list3, list4, list5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(userStations());
        parcel.writeTypedList(recommendedStations());
        parcel.writeTypedList(genreStations());
        parcel.writeTypedList(savedStations());
        parcel.writeTypedList(clusterStations());
    }
}
