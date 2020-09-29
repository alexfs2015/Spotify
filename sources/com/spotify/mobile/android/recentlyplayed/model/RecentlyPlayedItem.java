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
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show.MediaType;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPlayedItem implements Parcelable, JacksonModel {
    private static final String COLLECTION_TRACKS_URI = "spotify:internal:collection:tracks";
    public static final Creator<RecentlyPlayedItem> CREATOR = new Creator<RecentlyPlayedItem>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RecentlyPlayedItem(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecentlyPlayedItem[i];
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
    public vli offlineState;
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
        TRACK,
        UNKNOWN
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
        TYPES = ImmutableMap.g().b("album", Type.ALBUM).b(str, Type.ARTIST).b(str2, Type.PLAYLIST).b(str3, Type.PLAYLIST).b(str4, Type.SHOW).b(str5, Type.RADIO).b(str6, Type.RADIO).b(str7, Type.DAILYMIX).b(str8, Type.COLLECTION_SONGS).b(str9, Type.COLLECTION_SONGS).b(TrackData.TYPE_TRACK, Type.TRACK).b();
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
        this.available = juo.a(parcel);
        this.isCollaborative = juo.a(parcel);
        this.isLoading = juo.a(parcel);
        this.isOwnedBySelf = juo.a(parcel);
        this.isFollowing = juo.a(parcel);
        this.inCollection = juo.a(parcel);
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
        this.formatListAttributes = juo.a(parcel, jxu.c());
        this.madeForName = parcel.readString();
        this.madeForUsername = parcel.readString();
        populateDerived();
    }

    public RecentlyPlayedItem(@JsonProperty("itemLink") String str, @JsonProperty("link") String str2, @JsonProperty("collectionLink") String str3, @JsonProperty("name") String str4, @JsonProperty("imageUri") String str5, @JsonProperty("type") String str6, @JsonProperty("offline") String str7, @JsonProperty("ownerName") String str8, @JsonProperty("publisher") String str9, @JsonProperty("artistName") String str10, @JsonProperty("subtitle") String str11, @JsonProperty("mediaType") String str12, @JsonProperty("available") boolean z, @JsonProperty("isCollaborative") boolean z2, @JsonProperty("isLoading") boolean z3, @JsonProperty("isOwnedBySelf") boolean z4, @JsonProperty("isFollowing") boolean z5, @JsonProperty("inCollection") boolean z6, @JsonProperty("numTracks") int i, @JsonProperty("tracksOfflineCount") int i2, @JsonProperty("tracksInCollectionCount") int i3, @JsonProperty("syncProgress") int i4, @JsonProperty("formatListType") String str13, @JsonProperty("formatListAttributes") Map<String, String> map, @JsonProperty("madeForName") String str14, @JsonProperty("madeForUsername") String str15, @JsonProperty("isOnDemandInFree") Boolean bool) {
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
        this.formatListAttributes = map != null ? ImmutableMap.a(map) : ImmutableMap.f();
        this.madeForName = str14;
        this.madeForUsername = str15;
        populateDerived();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateDerived() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mOffline
            r3 = 6
            int r1 = r4.syncProgress
            vli r0 = defpackage.vlj.a(r0, r1)
            r4.offlineState = r0
            r3 = 0
            com.google.common.collect.ImmutableMap<java.lang.String, com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type> r0 = TYPES
            r3 = 0
            java.lang.String r1 = r4.mType
            r3 = 6
            if (r1 == 0) goto L_0x001d
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 6
            java.lang.String r1 = r1.toLowerCase(r2)
        L_0x001d:
            java.lang.Object r0 = r0.get(r1)
            r3 = 0
            com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type r1 = com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type.UNKNOWN
            java.lang.Object r0 = defpackage.jvi.a(r0, r1)
            r3 = 1
            com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type r0 = (com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type) r0
            r3 = 4
            r4.type = r0
            r3 = 2
            int r0 = r4.tracksInCollectionCount
            if (r0 > 0) goto L_0x0041
            boolean r0 = r4.inCollection
            r3 = 7
            if (r0 == 0) goto L_0x003a
            r3 = 4
            goto L_0x0041
        L_0x003a:
            r3 = 6
            java.lang.String r0 = r4.link
            r4.navigationLink = r0
            r3 = 6
            goto L_0x0047
        L_0x0041:
            r3 = 4
            java.lang.String r0 = r4.collectionLink
            r3 = 0
            r4.navigationLink = r0
        L_0x0047:
            r3 = 5
            com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type r0 = r4.type
            r3 = 7
            com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type r1 = com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type.COLLECTION_SONGS
            if (r0 != r1) goto L_0x0054
            r3 = 6
            java.lang.String r0 = "spotify:internal:collection:tracks"
            r4.navigationLink = r0
        L_0x0054:
            java.lang.String r0 = r4.mediaType
            java.lang.String r1 = "evsdo"
            java.lang.String r1 = "video"
            r3 = 1
            boolean r0 = r1.equals(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0067
            r3 = 6
            com.spotify.playlist.models.Show$MediaType r0 = com.spotify.playlist.models.Show.MediaType.VIDEO
            r3 = 5
            goto L_0x006a
        L_0x0067:
            r3 = 4
            com.spotify.playlist.models.Show$MediaType r0 = com.spotify.playlist.models.Show.MediaType.AUDIO
        L_0x006a:
            r4.mMediaTypeEnum = r0
            r3 = 4
            com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type r0 = r4.type
            r3 = 1
            com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem$Type r1 = com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type.SHOW
            r3 = 0
            if (r0 != r1) goto L_0x0081
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.google.common.base.Optional r0 = com.google.common.base.Optional.b(r0)
            r3 = 1
            r4.isOnDemandInFree = r0
            r3 = 3
            return
        L_0x0081:
            r3 = 2
            java.lang.Boolean r0 = r4.mIsOnDemandInFree
            com.google.common.base.Optional r0 = com.google.common.base.Optional.c(r0)
            r3 = 7
            r4.isOnDemandInFree = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.populateDerived():void");
    }

    public int describeContents() {
        return 0;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public String getImageUri(Size size) {
        return this.imageUri;
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
                return isLoading() ? string : context.getResources().getString(R.string.recently_played_artist);
            case RADIO:
                jva a = jva.a(ute.c(this.link));
                return (TextUtils.isEmpty(this.subtitle) || a.b != LinkType.STATION_CLUSTER) ? ute.a(context, a) : this.subtitle;
            case DAILYMIX:
                if (!TextUtils.isEmpty(this.subtitle)) {
                    return this.subtitle;
                }
                return null;
            case SHOW:
                return isLoading() ? string : context.getResources().getString(this.mMediaTypeEnum == MediaType.VIDEO ? R.string.recently_played_video_show_by : R.string.recently_played_show_by, new Object[]{this.publisher});
            case TRACK:
            case COLLECTION_SONGS:
                return null;
            default:
                String str = "ipwm ktnt n: lUoehwinyk ";
                StringBuilder sb = new StringBuilder("Unknown type with link: ");
                sb.append(this.link);
                Assertion.a(sb.toString());
                return "";
        }
    }

    public String getTargetUri() {
        return this.navigationLink;
    }

    public String getTargetUri(tvn tvn, fqn fqn) {
        return this.type == Type.PLAYLIST ? tvn.a(tvn.a(this.formatListType), this.link, fqn) : this.navigationLink;
    }

    public String getTitle(Context context) {
        switch (this.type) {
            case PLAYLIST:
            case ALBUM:
            case ARTIST:
            case RADIO:
            case DAILYMIX:
            case SHOW:
            case TRACK:
                return this.name;
            case COLLECTION_SONGS:
                return context.getResources().getString(R.string.recently_played_liked_songs);
            default:
                String str = "ipnnot nh:iwt   kkloUwyn";
                StringBuilder sb = new StringBuilder("Unknown type with link: ");
                sb.append(this.link);
                Assertion.a(sb.toString());
                return "";
        }
    }

    public String getUri() {
        return this.link;
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
            case TRACK:
                return TextUtils.isEmpty(this.name);
            case COLLECTION_SONGS:
                break;
            default:
                String str = "lnpekb:  Untw wtik onhin";
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
        juo.a(parcel, this.available);
        juo.a(parcel, this.isCollaborative);
        juo.a(parcel, this.isLoading);
        juo.a(parcel, this.isOwnedBySelf);
        juo.a(parcel, this.isFollowing);
        juo.a(parcel, this.inCollection);
        Boolean bool = this.mIsOnDemandInFree;
        if (bool != null) {
            juo.a(parcel, bool.booleanValue());
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.numTracks);
        parcel.writeInt(this.tracksOfflineCount);
        parcel.writeInt(this.tracksInCollectionCount);
        parcel.writeInt(this.syncProgress);
        juo.a(parcel, this.formatListAttributes);
        parcel.writeString(this.madeForName);
        parcel.writeString(this.madeForUsername);
    }
}
