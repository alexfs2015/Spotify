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
public class LocalArtistJacksonModel implements JacksonModel, nxj {
    @JsonProperty("portraits")
    private final CoversJacksonModel mCovers;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("tracks")
    private final List<LocalTrackJacksonModel> mTracks;
    @JsonIgnore
    private final List<String> mTracksIds;
    @JsonProperty("link")
    private final String mUri;

    public LocalArtistJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("portraits") CoversJacksonModel coversJacksonModel, @JsonProperty("tracks") List<LocalTrackJacksonModel> list) {
        this.mUri = str;
        this.mName = str2;
        this.mCovers = coversJacksonModel;
        this.mTracks = list != null ? list : new ArrayList<>();
        this.mTracksIds = new ArrayList();
        if (list != null) {
            for (nxn uri : this.mTracks) {
                this.mTracksIds.add(uri.getUri());
            }
        }
    }

    public Drawable getImagePlaceholder(Context context) {
        return gaa.a(context, SpotifyIcon.ARTIST_32, false, false);
    }

    public ImageType getImageType() {
        return ImageType.ROUND;
    }

    public String getImageUri() {
        return getImageUri(Size.NORMAL);
    }

    public String getImageUri(Size size) {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        return coversJacksonModel != null ? coversJacksonModel.getImageUri(size) : "";
    }

    public String getSubtitle(Context context) {
        int size = this.mTracksIds.size();
        return context.getResources().getQuantityString(R.plurals.local_files_subtitle_number_of_songs, size, new Object[]{Integer.valueOf(size)});
    }

    public String getTargetUri() {
        return this.mUri;
    }

    public String getTitle() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isExplicit() {
        return false;
    }

    @JsonIgnore
    public List<String> trackIds() {
        return this.mTracksIds;
    }
}
