package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Arrays;

@JsonDeserialize(using = ClusterRadioStationModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClusterRadioStationModel extends RadioStationModel {
    public static final Creator<ClusterRadioStationModel> CREATOR = new Creator<ClusterRadioStationModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            ClusterRadioStationModel clusterRadioStationModel = new ClusterRadioStationModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), (RelatedArtistModel[]) parcel2.createTypedArray(AutoValue_RelatedArtistModel.CREATOR), (PlayerTrack[]) parcel2.createTypedArray(PlayerTrack.CREATOR), parcel.readString(), juo.a(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            return clusterRadioStationModel;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ClusterRadioStationModel[i];
        }
    };
    private static final String STATION = "station";
    @JsonProperty("clusterType")
    public final String clusterType;
    @JsonProperty("description")
    public final String description;
    private boolean mIsSelectedForPlaying;
    @JsonProperty("username")
    public final String username;

    public ClusterRadioStationModel(ClusterRadioStationModel clusterRadioStationModel, RadioStationTracksModel radioStationTracksModel) {
        super(clusterRadioStationModel, radioStationTracksModel);
        this.username = clusterRadioStationModel.username;
        this.clusterType = clusterRadioStationModel.clusterType;
        this.description = clusterRadioStationModel.description;
    }

    @JsonCreator
    public ClusterRadioStationModel(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("titleUri") String str3, @JsonProperty("imageUri") String str4, @JsonProperty("playlistUri") String str5, @JsonProperty("subtitle") String str6, @JsonProperty("subtitleUri") String str7, @JsonProperty("seeds") String[] strArr, @JsonProperty("related_artists") RelatedArtistModel[] relatedArtistModelArr, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("next_page_url") String str8, @JsonProperty("explicitSave") boolean z, @JsonProperty("username") String str9, @JsonProperty("clusterType") String str10, @JsonProperty("description") String str11) {
        String str12 = str;
        String[] strArr2 = strArr;
        String b = str.contains(STATION) ? str12 : ute.b(str);
        if (strArr2 == null || strArr2.length == 0) {
            strArr2 = new String[]{str12};
        }
        super(b, str2, str3, str4, str5, str6, str7, strArr2, relatedArtistModelArr, playerTrackArr, str8, z);
        this.username = str9;
        this.clusterType = str10;
        this.description = str11;
    }

    public int describeContents() {
        return 0;
    }

    @JsonIgnore
    public boolean equals(Object obj) {
        if (obj instanceof ClusterRadioStationModel) {
            ClusterRadioStationModel clusterRadioStationModel = (ClusterRadioStationModel) obj;
            if (super.equals(obj) && fbn.a(this.username, clusterRadioStationModel.username) && fbn.a(this.clusterType, clusterRadioStationModel.clusterType) && fbn.a(this.description, clusterRadioStationModel.description)) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.username, this.description, this.clusterType});
    }

    public boolean isPlaying() {
        return this.mIsSelectedForPlaying;
    }

    public void setPlaying(boolean z) {
        this.mIsSelectedForPlaying = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.title);
        parcel.writeString(this.titleUri);
        parcel.writeString(this.imageUri);
        parcel.writeString(this.playlistUri);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.subtitleUri);
        parcel.writeStringArray(this.seeds);
        parcel.writeTypedArray(this.relatedArtists, 0);
        parcel.writeTypedArray(this.tracks, 0);
        parcel.writeString(this.nextPageUrl);
        juo.a(parcel, this.explicitSave);
        parcel.writeString(this.username);
        parcel.writeString(this.clusterType);
        parcel.writeString(this.description);
    }
}
