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
public class LocalSourceJacksonModel implements JacksonModel, nri {
    @JsonProperty("images")
    private final CoversJacksonModel mCovers;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("tracks")
    private final List<LocalTrackJacksonModel> mTracks;
    @JsonIgnore
    private final List<String> mTracksIds;

    public String getTargetUri() {
        return "";
    }

    public String getUri() {
        return "";
    }

    public boolean isExplicit() {
        return false;
    }

    public LocalSourceJacksonModel(@JsonProperty("name") String str, @JsonProperty("tracks") List<LocalTrackJacksonModel> list, @JsonProperty("images") CoversJacksonModel coversJacksonModel) {
        List<LocalTrackJacksonModel> list2;
        this.mName = str;
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

    public String getTitle() {
        return this.mName;
    }

    public String getSubtitle(Context context) {
        int size = this.mTracksIds.size();
        return context.getResources().getQuantityString(R.plurals.local_files_subtitle_number_of_songs, size, new Object[]{Integer.valueOf(size)});
    }

    public String getImageUri() {
        return getImageUri(Size.NORMAL);
    }

    public String getImageUri(Size size) {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        return coversJacksonModel != null ? coversJacksonModel.getImageUri(size) : "";
    }

    @JsonIgnore
    public List<String> trackIds() {
        return this.mTracksIds;
    }

    public Drawable getImagePlaceholder(Context context) {
        return fzg.a(context, SpotifyIcon.PLAYLIST_FOLDER_32, true, true);
    }

    public ImageType getImageType() {
        return ImageType.SQUARE;
    }
}
