package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Arrays;

@JsonDeserialize(using = RadioStationModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RadioStationModel implements Parcelable, JacksonModel {
    public static final Creator<RadioStationModel> CREATOR = new Creator<RadioStationModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            RelatedArtistModel[] relatedArtistModelArr = (RelatedArtistModel[]) parcel.createTypedArray(AutoValue_RelatedArtistModel.CREATOR);
            PlayerTrack[] playerTrackArr = new PlayerTrack[parcel.readInt()];
            parcel.readTypedArray(playerTrackArr, PlayerTrack.CREATOR);
            RadioStationModel radioStationModel = new RadioStationModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, createStringArray, relatedArtistModelArr, playerTrackArr, parcel.readString(), juo.a(parcel));
            return radioStationModel;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RadioStationModel[i];
        }
    };
    @JsonProperty("explicitSave")
    public final boolean explicitSave;
    @JsonProperty("imageUri")
    public final String imageUri;
    @JsonProperty("next_page_url")
    public final String nextPageUrl;
    @JsonProperty("playlistUri")
    public final String playlistUri;
    @JsonProperty("related_artists")
    public final RelatedArtistModel[] relatedArtists;
    @JsonProperty("seeds")
    public final String[] seeds;
    @JsonIgnore
    public final sso stationUri;
    @JsonProperty("subtitle")
    public final String subtitle;
    @JsonProperty("subtitleUri")
    public final String subtitleUri;
    @JsonProperty("title")
    public final String title;
    @JsonProperty("titleUri")
    public final String titleUri;
    @JsonProperty("tracks")
    public final PlayerTrack[] tracks;
    @JsonProperty("uri")
    public final String uri;

    public RadioStationModel(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel) {
        this.uri = radioStationModel.uri;
        this.stationUri = radioStationModel.stationUri;
        this.title = radioStationModel.title;
        this.titleUri = radioStationModel.titleUri;
        this.imageUri = radioStationModel.imageUri;
        this.subtitle = radioStationModel.subtitle;
        this.subtitleUri = radioStationModel.subtitleUri;
        this.seeds = radioStationModel.seeds;
        this.relatedArtists = radioStationModel.relatedArtists;
        this.tracks = radioStationTracksModel.tracks;
        this.nextPageUrl = radioStationTracksModel.nextPageUrl;
        this.explicitSave = radioStationModel.explicitSave;
        this.playlistUri = radioStationModel.playlistUri;
    }

    @JsonCreator
    public RadioStationModel(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("titleUri") String str3, @JsonProperty("imageUri") String str4, @JsonProperty("playlistUri") String str5, @JsonProperty("subtitle") String str6, @JsonProperty("subtitleUri") String str7, @JsonProperty("seeds") String[] strArr, @JsonProperty("related_artists") RelatedArtistModel[] relatedArtistModelArr, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("next_page_url") String str8, @JsonProperty("explicitSave") boolean z) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("spotify:station:");
            sb.append(strArr[0].substring(8));
            str = sb.toString();
        }
        this.uri = str;
        this.stationUri = ViewUris.ai.a(this.uri);
        this.title = str2;
        this.titleUri = str3;
        this.imageUri = str4;
        this.playlistUri = str5;
        this.subtitle = str6;
        this.subtitleUri = str7;
        this.seeds = strArr;
        if (relatedArtistModelArr == null) {
            relatedArtistModelArr = new RelatedArtistModel[0];
        }
        this.relatedArtists = relatedArtistModelArr;
        if (playerTrackArr == null) {
            playerTrackArr = new PlayerTrack[0];
        }
        this.tracks = playerTrackArr;
        this.nextPageUrl = str8;
        this.explicitSave = z;
    }

    @JsonIgnore
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RadioStationModel) {
            RadioStationModel radioStationModel = (RadioStationModel) obj;
            if (fbn.a(this.uri, radioStationModel.uri) && fbn.a(this.title, radioStationModel.title) && fbn.a(this.titleUri, radioStationModel.titleUri) && fbn.a(this.imageUri, radioStationModel.imageUri) && fbn.a(this.playlistUri, radioStationModel.playlistUri) && fbn.a(this.subtitle, radioStationModel.subtitle) && fbn.a(this.subtitleUri, radioStationModel.subtitleUri) && Arrays.equals(this.seeds, radioStationModel.seeds) && Arrays.equals(this.tracks, radioStationModel.tracks) && fbn.a(this.nextPageUrl, radioStationModel.nextPageUrl) && fbn.a(Boolean.valueOf(this.explicitSave), Boolean.valueOf(radioStationModel.explicitSave))) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public String getPlayerContextUri() {
        return (String) fbp.a(ute.a(getStationSeed()));
    }

    @JsonIgnore
    public String getStationSeed() {
        return this.seeds[0];
    }

    @JsonIgnore
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.uri, this.title, this.titleUri, this.imageUri, this.playlistUri, this.subtitle, this.subtitleUri, Integer.valueOf(Arrays.hashCode(this.seeds)), Integer.valueOf(Arrays.hashCode(this.tracks)), this.nextPageUrl, Boolean.valueOf(this.explicitSave)});
    }

    public boolean isMyContext(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return fbn.a(str, getPlayerContextUri()) || Arrays.asList(this.seeds).contains(str);
    }

    @JsonIgnore
    public String resolvedStationURI() {
        String str = this.playlistUri;
        return (str == null || str.isEmpty()) ? this.uri : this.playlistUri;
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
        parcel.writeInt(this.tracks.length);
        parcel.writeTypedArray(this.tracks, 0);
        parcel.writeString(this.nextPageUrl);
        juo.a(parcel, this.explicitSave);
    }
}
