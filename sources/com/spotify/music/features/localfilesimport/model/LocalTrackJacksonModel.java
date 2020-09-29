package com.spotify.music.features.localfilesimport.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.localfilesimport.model.LocalItem.ImageType;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalTrackJacksonModel implements JacksonModel, nxn {
    @JsonProperty("album")
    private final LocalAlbumJacksonModel mAlbum;
    @JsonProperty("artists")
    private final List<LocalArtistJacksonModel> mArtists;
    @JsonProperty("inCollection")
    private final boolean mInCollection;
    @JsonProperty("isExplicit")
    private final boolean mIsExplicit;
    @JsonProperty("name")
    private final String mName;
    @JsonIgnore
    private final List<String> mTracksIds;
    @JsonProperty("link")
    private final String mUri;

    public LocalTrackJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("album") LocalAlbumJacksonModel localAlbumJacksonModel, @JsonProperty("artists") List<LocalArtistJacksonModel> list, @JsonProperty("inCollection") boolean z, @JsonProperty("isExplicit") boolean z2) {
        this.mUri = str;
        this.mName = str2;
        this.mAlbum = localAlbumJacksonModel;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mArtists = list;
        this.mInCollection = z;
        this.mIsExplicit = z2;
        this.mTracksIds = ImmutableList.a(this.mUri);
    }

    public nxi getAlbum() {
        return this.mAlbum;
    }

    public List<nxj> getArtists() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mArtists);
        return arrayList;
    }

    public Drawable getImagePlaceholder(Context context) {
        return null;
    }

    public ImageType getImageType() {
        return ImageType.NONE;
    }

    public String getImageUri() {
        return "";
    }

    public String getImageUri(Size size) {
        return "";
    }

    public String getSubtitle(Context context) {
        LocalAlbumJacksonModel localAlbumJacksonModel = this.mAlbum;
        String str = "";
        String title = localAlbumJacksonModel != null ? localAlbumJacksonModel.getTitle() : str;
        List<LocalArtistJacksonModel> list = this.mArtists;
        String title2 = (list == null || list.size() <= 0) ? str : ((LocalArtistJacksonModel) this.mArtists.get(0)).getTitle();
        StringBuilder sb = new StringBuilder();
        sb.append(title2);
        if (!fbo.a(title2) && !fbo.a(title)) {
            str = " • ";
        }
        sb.append(str);
        sb.append(title);
        return sb.toString();
    }

    public String getTargetUri() {
        return getUri();
    }

    public String getTitle() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean inCollection() {
        return this.mInCollection;
    }

    public boolean isExplicit() {
        return this.mIsExplicit;
    }

    @JsonIgnore
    public List<String> trackIds() {
        return this.mTracksIds;
    }
}
