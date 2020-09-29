package com.spotify.mobile.android.recentlyplayed.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show.MediaType;
import java.util.Locale;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPlayedItem implements Parcelable, JacksonModel {
    private static final String COLLECTION_TRACKS_URI = "spotify:internal:collection:tracks";
    public static final Creator<RecentlyPlayedItem> CREATOR = new Creator<RecentlyPlayedItem>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecentlyPlayedItem[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RecentlyPlayedItem(parcel);
        }
    };
    private static final String MEDIA_TYPE_VIDEO = "video";
    private static final ImmutableMap<String, Type> TYPES;
    public String artistName;
    public boolean available;
    public String collectionLink;
    public Map<String, String> formatListAttributes;
    public String formatListType;
    public String imageUri;
    public boolean inCollection;
    public boolean isCollaborative;
    public boolean isFollowing;
    public boolean isLoading;
    @JsonIgnore
    public Optional<Boolean> isOnDemandInFree;
    public boolean isOwnedBySelf;
    public String itemLink;
    public String link;
    @JsonProperty("isOnDemandInFree")
    public final Boolean mIsOnDemandInFree;
    @JsonIgnore
    public MediaType mMediaTypeEnum;
    public final String mOffline;
    @JsonProperty("type")
    public final String mType;
    public String madeForName;
    public String madeForUsername;
    public String mediaType;
    public String name;
    @JsonIgnore
    public String navigationLink;
    public int numTracks;
    @JsonIgnore
    public uzf offlineState;
    public String ownerName;
    public String publisher;
    public String subtitle;
    @Deprecated
    public int syncProgress;
    public int tracksInCollectionCount;
    public int tracksOfflineCount;
    @JsonIgnore
    public Type type;

    public enum Type {
        ALBUM,
        ARTIST,
        PLAYLIST,
        SHOW,
        RADIO,
        DAILYMIX,
        COLLECTION_SONGS,
        UNKNOWN
    }

    public int describeContents() {
        return 0;
    }

    static {
        String str = "artist";
        String str2 = "playlist";
        String str3 = "toplist";
        String str4 = "show";
        String str5 = "radio";
        String str6 = "station";
        String str7 = "dailymix";
        String str8 = "collection";
        String str9 = "collectionunion";
        TYPES = ImmutableMap.g().b("album", Type.ALBUM).b(str, Type.ARTIST).b(str2, Type.PLAYLIST).b(str3, Type.PLAYLIST).b(str4, Type.SHOW).b(str5, Type.RADIO).b(str6, Type.RADIO).b(str7, Type.DAILYMIX).b(str8, Type.COLLECTION_SONGS).b(str9, Type.COLLECTION_SONGS).b();
    }

    public RecentlyPlayedItem(@JsonProperty("itemLink") String str, @JsonProperty("link") String str2, @JsonProperty("collectionLink") String str3, @JsonProperty("name") String str4, @JsonProperty("imageUri") String str5, @JsonProperty("type") String str6, @JsonProperty("offline") String str7, @JsonProperty("ownerName") String str8, @JsonProperty("publisher") String str9, @JsonProperty("artistName") String str10, @JsonProperty("subtitle") String str11, @JsonProperty("mediaType") String str12, @JsonProperty("available") boolean z, @JsonProperty("isCollaborative") boolean z2, @JsonProperty("isLoading") boolean z3, @JsonProperty("isOwnedBySelf") boolean z4, @JsonProperty("isFollowing") boolean z5, @JsonProperty("inCollection") boolean z6, @JsonProperty("numTracks") int i, @JsonProperty("tracksOfflineCount") int i2, @JsonProperty("tracksInCollectionCount") int i3, @JsonProperty("syncProgress") int i4, @JsonProperty("formatListType") String str13, @JsonProperty("formatListAttributes") Map<String, String> map, @JsonProperty("madeForName") String str14, @JsonProperty("madeForUsername") String str15, @JsonProperty("isOnDemandInFree") Boolean bool) {
        ImmutableMap immutableMap;
        this.isOnDemandInFree = Optional.e();
        this.itemLink = str;
        this.link = str2;
        this.collectionLink = str3;
        this.name = str4;
        this.imageUri = str5;
        this.mType = str6;
        this.mOffline = str7;
        this.mIsOnDemandInFree = bool;
        this.ownerName = str8;
        this.publisher = str9;
        this.artistName = str10;
        this.subtitle = str11;
        this.mediaType = str12;
        this.available = z;
        this.isCollaborative = z2;
        this.isLoading = z3;
        this.isOwnedBySelf = z4;
        this.isFollowing = z5;
        this.inCollection = z6;
        this.numTracks = i;
        this.tracksOfflineCount = i2;
        this.tracksInCollectionCount = i3;
        this.syncProgress = i4;
        this.formatListType = str13;
        if (map != null) {
            immutableMap = ImmutableMap.a(map);
        } else {
            immutableMap = ImmutableMap.f();
        }
        this.formatListAttributes = immutableMap;
        this.madeForName = str14;
        this.madeForUsername = str15;
        populateDerived();
    }

    private void populateDerived() {
        this.offlineState = uzg.a(this.mOffline, this.syncProgress);
        ImmutableMap<String, Type> immutableMap = TYPES;
        String str = this.mType;
        if (str != null) {
            str = str.toLowerCase(Locale.getDefault());
        }
        this.type = (Type) jtc.a(immutableMap.get(str), Type.UNKNOWN);
        if (this.tracksInCollectionCount > 0 || this.inCollection) {
            this.navigationLink = this.collectionLink;
        } else {
            this.navigationLink = this.link;
        }
        if (this.type == Type.COLLECTION_SONGS) {
            this.navigationLink = COLLECTION_TRACKS_URI;
        }
        this.mMediaTypeEnum = "video".equals(this.mediaType) ? MediaType.VIDEO : MediaType.AUDIO;
        if (this.type == Type.SHOW) {
            this.isOnDemandInFree = Optional.b(Boolean.TRUE);
        } else {
            this.isOnDemandInFree = Optional.c(this.mIsOnDemandInFree);
        }
    }

    public String getTitle(Context context) {
        switch (this.type) {
            case PLAYLIST:
            case ALBUM:
            case ARTIST:
            case RADIO:
            case DAILYMIX:
            case SHOW:
                return this.name;
            case COLLECTION_SONGS:
                return context.getResources().getString(R.string.recently_played_liked_songs);
            default:
                StringBuilder sb = new StringBuilder("Unknown type with link: ");
                sb.append(this.link);
                Assertion.a(sb.toString());
                return "";
        }
    }

    public String getSubtitle(Context context) {
        String string = context.getResources().getString(R.string.placeholders_loading);
        switch (this.type) {
            case PLAYLIST:
                if (isLoading()) {
                    return string;
                }
                if (!TextUtils.isEmpty(this.madeForName)) {
                    return context.getResources().getString(R.string.recently_played_made_for, new Object[]{this.madeForName});
                } else if (this.isOwnedBySelf || TextUtils.isEmpty(this.ownerName)) {
                    return context.getResources().getString(R.string.recently_played_playlist);
                } else {
                    return context.getResources().getString(R.string.recently_played_playlist_by, new Object[]{this.ownerName});
                }
            case ALBUM:
                if (isLoading()) {
                    return string;
                }
                return context.getResources().getString(R.string.recently_played_album_by, new Object[]{this.artistName});
            case ARTIST:
                if (isLoading()) {
                    return string;
                }
                return context.getResources().getString(R.string.recently_played_artist);
            case RADIO:
                jst a = jst.a(uhq.d(this.link));
                if (TextUtils.isEmpty(this.subtitle) || a.b != LinkType.STATION_CLUSTER) {
                    return uhq.a(context, a);
                }
                return this.subtitle;
            case DAILYMIX:
                if (!TextUtils.isEmpty(this.subtitle)) {
                    return this.subtitle;
                }
                return null;
            case SHOW:
                return isLoading() ? string : context.getResources().getString(this.mMediaTypeEnum == MediaType.VIDEO ? R.string.recently_played_video_show_by : R.string.recently_played_show_by, new Object[]{this.publisher});
            case COLLECTION_SONGS:
                return null;
            default:
                StringBuilder sb = new StringBuilder("Unknown type with link: ");
                sb.append(this.link);
                Assertion.a(sb.toString());
                return "";
        }
    }

    public String getUri() {
        return this.link;
    }

    public String getTargetUri() {
        return this.navigationLink;
    }

    public String getTargetUri(tjv tjv, fpt fpt) {
        if (this.type == Type.PLAYLIST) {
            return tjv.a(tjv.a(this.formatListType), this.link, fpt);
        }
        return this.navigationLink;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public String getImageUri(Size size) {
        return this.imageUri;
    }

    public boolean isLoading() {
        switch (this.type) {
            case PLAYLIST:
                return TextUtils.isEmpty(this.link);
            case ALBUM:
            case ARTIST:
            case RADIO:
            case DAILYMIX:
            case SHOW:
                return TextUtils.isEmpty(this.name);
            case COLLECTION_SONGS:
                break;
            default:
                StringBuilder sb = new StringBuilder("Unknown type with link: ");
                sb.append(this.link);
                Assertion.a(sb.toString());
                break;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemLink);
        parcel.writeString(this.link);
        parcel.writeString(this.collectionLink);
        parcel.writeString(this.name);
        parcel.writeString(this.imageUri);
        parcel.writeString(this.mType);
        parcel.writeString(this.mOffline);
        parcel.writeString(this.ownerName);
        parcel.writeString(this.publisher);
        parcel.writeString(this.artistName);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.mediaType);
        parcel.writeString(this.formatListType);
        jse.a(parcel, this.available);
        jse.a(parcel, this.isCollaborative);
        jse.a(parcel, this.isLoading);
        jse.a(parcel, this.isOwnedBySelf);
        jse.a(parcel, this.isFollowing);
        jse.a(parcel, this.inCollection);
        Boolean bool = this.mIsOnDemandInFree;
        if (bool != null) {
            jse.a(parcel, bool.booleanValue());
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.numTracks);
        parcel.writeInt(this.tracksOfflineCount);
        parcel.writeInt(this.tracksInCollectionCount);
        parcel.writeInt(this.syncProgress);
        jse.a(parcel, this.formatListAttributes);
        parcel.writeString(this.madeForName);
        parcel.writeString(this.madeForUsername);
    }

    private RecentlyPlayedItem(Parcel parcel) {
        this.isOnDemandInFree = Optional.e();
        this.itemLink = parcel.readString();
        this.link = parcel.readString();
        this.collectionLink = parcel.readString();
        this.name = parcel.readString();
        this.imageUri = parcel.readString();
        this.mType = parcel.readString();
        this.mOffline = parcel.readString();
        this.ownerName = parcel.readString();
        this.publisher = parcel.readString();
        this.artistName = parcel.readString();
        this.subtitle = parcel.readString();
        this.mediaType = parcel.readString();
        this.formatListType = parcel.readString();
        this.available = jse.a(parcel);
        this.isCollaborative = jse.a(parcel);
        this.isLoading = jse.a(parcel);
        this.isOwnedBySelf = jse.a(parcel);
        this.isFollowing = jse.a(parcel);
        this.inCollection = jse.a(parcel);
        int readInt = parcel.readInt();
        if (readInt != -1) {
            this.mIsOnDemandInFree = Boolean.valueOf(readInt != 0);
        } else {
            this.mIsOnDemandInFree = null;
        }
        this.numTracks = parcel.readInt();
        this.tracksOfflineCount = parcel.readInt();
        this.tracksInCollectionCount = parcel.readInt();
        this.syncProgress = parcel.readInt();
        this.formatListAttributes = jse.a(parcel, jvm.c());
        this.madeForName = parcel.readString();
        this.madeForUsername = parcel.readString();
        populateDerived();
    }
}
