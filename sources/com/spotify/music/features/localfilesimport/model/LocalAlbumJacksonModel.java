package com.spotify.music.features.localfilesimport.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.CoversJacksonModel;
import com.spotify.music.R;
import com.spotify.music.features.localfilesimport.model.LocalItem.ImageType;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalAlbumJacksonModel implements JacksonModel, nrf {
    @JsonProperty("artist")
    private final LocalArtistJacksonModel mArtist;
    @JsonProperty("covers")
    private final CoversJacksonModel mCovers;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("tracks")
    private final List<LocalTrackJacksonModel> mTracks;
    @JsonIgnore
    private final List<String> mTracksIds;
    @JsonProperty("link")
    private final String mUri;

    public boolean isExplicit() {
        return false;
    }

    public LocalAlbumJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("artist") LocalArtistJacksonModel localArtistJacksonModel, @JsonProperty("covers") CoversJacksonModel coversJacksonModel, @JsonProperty("tracks") List<LocalTrackJacksonModel> list) {
        List<LocalTrackJacksonModel> list2;
        this.mUri = str;
        this.mName = str2;
        this.mArtist = localArtistJacksonModel;
        this.mCovers = coversJacksonModel;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList<>();
        }
        this.mTracks = list2;
        this.mTracksIds = new ArrayList();
        if (list != null) {
            for (nrk uri : this.mTracks) {
                this.mTracksIds.add(uri.getUri());
            }
        }
    }

    public String getUri() {
        return this.mUri;
    }

    public String getTitle() {
        return this.mName;
    }

    public String getSubtitle(Context context) {
        StringBuilder sb = new StringBuilder();
        LocalArtistJacksonModel localArtistJacksonModel = this.mArtist;
        if (localArtistJacksonModel != null) {
            sb.append(localArtistJacksonModel.getTitle());
        }
        if (sb.length() != 0) {
            sb.append(" • ");
        }
        int size = this.mTracksIds.size();
        sb.append(context.getResources().getQuantityString(R.plurals.local_files_subtitle_number_of_songs, size, new Object[]{Integer.valueOf(size)}));
        return sb.toString();
    }

    public String getTargetUri() {
        return this.mUri;
    }

    public String getImageUri() {
        return getImageUri(Size.NORMAL);
    }

    public String getImageUri(Size size) {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        return coversJacksonModel != null ? coversJacksonModel.getImageUri(size) : "";
    }

    @JsonIgnore
    public nrg getArtist() {
        return this.mArtist;
    }

    @JsonIgnore
    public List<String> trackIds() {
        return this.mTracksIds;
    }

    public Drawable getImagePlaceholder(Context context) {
        return fzg.a(context, SpotifyIcon.ALBUM_32, false, true);
    }

    public ImageType getImageType() {
        return ImageType.SQUARE;
    }
}
