package com.spotify.music.artist.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@JsonDeserialize(using = ArtistModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistModel implements Parcelable, JacksonModel {
    public static final Creator<ArtistModel> CREATOR = new Creator<ArtistModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ArtistModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ArtistModel(parcel);
        }
    };
    public static final int TOP_TRACKS_LIMIT = 5;
    public final Optional<ArtistsPick> artistsPick;
    public final Optional<String> biography;
    public Optional<CreatorAbout> creatorAbout;
    public final Optional<CustomMessage> customMessage;
    public final Optional<ArtistGallery> gallery;
    public final HeaderImage headerImage;
    public final ArtistInfo info;
    public final Optional<Release> latestRelease;
    public final List<MerchandiseItem> merchandise;
    public final Optional<MonthlyListeners> monthlyListeners;
    public final List<Playlist> playlists;
    public final List<ArtistInfo> relatedArtists;
    public final Releases releases;
    public final List<Track> topTracks;
    public final List<Concert> upcomingConcerts;
    public final String uri;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistGallery implements Parcelable, JacksonModel {
        public static final Creator<ArtistGallery> CREATOR = new Creator<ArtistGallery>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ArtistGallery[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ArtistGallery(parcel);
            }
        };
        public static final ArtistGallery EMPTY_GALLERY = new ArtistGallery((List<Image>) ImmutableList.d());
        public final List<Image> images;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public ArtistGallery(@JsonProperty("images") List<Image> list) {
            this.images = gbp.a(list);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.images);
        }

        private ArtistGallery(Parcel parcel) {
            this.images = (List) fay.a(ArtistModel.readImmutableList(parcel, Image.CREATOR));
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistInfo implements Parcelable, JacksonModel {
        public static final Creator<ArtistInfo> CREATOR = new Creator<ArtistInfo>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ArtistInfo[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ArtistInfo(parcel);
            }
        };
        public final String name;
        public final List<Image> portraits;
        public final String uri;
        public final boolean verified;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public ArtistInfo(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("portraits") List<Image> list, @JsonProperty("verified") boolean z) {
            this.uri = (String) fay.a(str);
            this.name = (String) fay.a(str2);
            this.verified = z;
            this.portraits = gbp.a(list);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uri);
            parcel.writeString(this.name);
            jse.a(parcel, this.verified);
            parcel.writeTypedList(this.portraits);
        }

        private ArtistInfo(Parcel parcel) {
            this.uri = parcel.readString();
            this.name = parcel.readString();
            this.verified = jse.a(parcel);
            this.portraits = (List) fay.a(ArtistModel.readImmutableList(parcel, Image.CREATOR));
        }

        @JsonIgnore
        public Uri getDefaultPortraitUri() {
            if (this.portraits.isEmpty()) {
                return null;
            }
            String str = ((Image) this.portraits.get(0)).uri;
            return !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Concert implements Parcelable, JacksonModel {
        public static final Creator<Concert> CREATOR = new Creator<Concert>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Concert[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Concert(parcel);
            }
        };
        public final String city;
        public final String id;
        public final String localtime;
        public final String title;
        public final String venue;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public Concert(@JsonProperty("title") String str, @JsonProperty("id") String str2, @JsonProperty("localtime") String str3, @JsonProperty("venue") String str4, @JsonProperty("city") String str5) {
            this.title = str;
            this.id = str2;
            this.localtime = str3;
            this.venue = str4;
            this.city = str5;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.id);
            parcel.writeString(this.localtime);
            parcel.writeString(this.venue);
            parcel.writeString(this.city);
        }

        private Concert(Parcel parcel) {
            this.title = parcel.readString();
            this.id = parcel.readString();
            this.localtime = parcel.readString();
            this.venue = parcel.readString();
            this.city = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatorAbout implements Parcelable, JacksonModel {
        public static final Creator<CreatorAbout> CREATOR = new Creator<CreatorAbout>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CreatorAbout[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CreatorAbout(parcel);
            }
        };
        public static final CreatorAbout EMPTY = new CreatorAbout(0, 0);
        public final int globalChartPosition;
        public final int monthlyListeners;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public CreatorAbout(@JsonProperty("monthlyListeners") int i, @JsonProperty("globalChartPosition") int i2) {
            this.monthlyListeners = i;
            this.globalChartPosition = i2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.monthlyListeners);
            parcel.writeInt(this.globalChartPosition);
        }

        private CreatorAbout(Parcel parcel) {
            this.monthlyListeners = parcel.readInt();
            this.globalChartPosition = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreatorAbout)) {
                return false;
            }
            CreatorAbout creatorAbout = (CreatorAbout) obj;
            return this.monthlyListeners == creatorAbout.monthlyListeners && this.globalChartPosition == creatorAbout.globalChartPosition;
        }

        public int hashCode() {
            return (this.monthlyListeners * 31) + this.globalChartPosition;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CustomMessage implements Parcelable, JacksonModel {
        public static final Creator<CustomMessage> CREATOR = new Creator<CustomMessage>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomMessage[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomMessage(parcel);
            }
        };
        public final String bodyText;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public CustomMessage(@JsonProperty("body_text") String str) {
            this.bodyText = (String) fay.a(str);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.bodyText);
        }

        private CustomMessage(Parcel parcel) {
            this.bodyText = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class HeaderImage implements Parcelable, JacksonModel {
        public static final Creator<HeaderImage> CREATOR = new Creator<HeaderImage>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new HeaderImage[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new HeaderImage(parcel);
            }
        };
        public final String image;
        public final int offset;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public HeaderImage(@JsonProperty("image") String str, @JsonProperty("offset") int i) {
            this.image = str;
            this.offset = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.image);
            parcel.writeInt(this.offset);
        }

        private HeaderImage(Parcel parcel) {
            this.image = parcel.readString();
            this.offset = parcel.readInt();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MerchandiseItem implements Parcelable, JacksonModel {
        public static final Creator<MerchandiseItem> CREATOR = new Creator<MerchandiseItem>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MerchandiseItem[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MerchandiseItem(parcel);
            }
        };
        public final String description;
        public final String imageUri;
        public final String link;
        public final String name;
        public final String uuid;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public MerchandiseItem(@JsonProperty("uuid") String str, @JsonProperty("name") String str2, @JsonProperty("description") String str3, @JsonProperty("image_uri") String str4, @JsonProperty("link") String str5) {
            this.uuid = str;
            this.name = str2;
            this.description = str3;
            this.imageUri = str4;
            this.link = str5;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uuid);
            parcel.writeString(this.name);
            parcel.writeString(this.description);
            parcel.writeString(this.imageUri);
            parcel.writeString(this.link);
        }

        private MerchandiseItem(Parcel parcel) {
            this.uuid = parcel.readString();
            this.name = parcel.readString();
            this.description = parcel.readString();
            this.imageUri = parcel.readString();
            this.link = parcel.readString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MonthlyListeners implements Parcelable, JacksonModel {
        public static final Creator<MonthlyListeners> CREATOR = new Creator<MonthlyListeners>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MonthlyListeners[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MonthlyListeners(parcel);
            }
        };
        public final String listenerCount;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public MonthlyListeners(@JsonProperty("listener_count") String str) {
            this.listenerCount = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.listenerCount);
        }

        private MonthlyListeners(Parcel parcel) {
            this.listenerCount = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonthlyListeners)) {
                return false;
            }
            MonthlyListeners monthlyListeners = (MonthlyListeners) obj;
            String str = this.listenerCount;
            return str == null ? monthlyListeners.listenerCount == null : str.equals(monthlyListeners.listenerCount);
        }

        public int hashCode() {
            String str = this.listenerCount;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Playlist implements Parcelable, JacksonModel {
        public static final Creator<Playlist> CREATOR = new Creator<Playlist>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Playlist[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Playlist(parcel);
            }
        };
        public final Image cover;
        public final int followerCount;
        public final String name;
        public final String uri;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public Playlist(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("cover") Image image, @JsonProperty("follower_count") int i) {
            this.uri = str;
            this.name = str2;
            this.cover = image;
            this.followerCount = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uri);
            parcel.writeString(this.name);
            jse.a(parcel, (Parcelable) this.cover, 0);
            parcel.writeInt(this.followerCount);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Playlist)) {
                return false;
            }
            Playlist playlist = (Playlist) obj;
            if (this.followerCount != playlist.followerCount) {
                return false;
            }
            String str = this.uri;
            if (str == null ? playlist.uri != null : !str.equals(playlist.uri)) {
                return false;
            }
            String str2 = this.name;
            if (str2 == null ? playlist.name != null : !str2.equals(playlist.name)) {
                return false;
            }
            Image image = this.cover;
            Image image2 = playlist.cover;
            return image == null ? image2 == null : image.equals(image2);
        }

        public int hashCode() {
            String str = this.uri;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Image image = this.cover;
            if (image != null) {
                i = image.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.followerCount;
        }

        private Playlist(Parcel parcel) {
            this.uri = parcel.readString();
            this.name = parcel.readString();
            this.cover = (Image) jse.b(parcel, Image.CREATOR);
            this.followerCount = parcel.readInt();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Track implements Parcelable, JacksonModel {
        public static final Creator<Track> CREATOR = new Creator<Track>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Track[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Track(parcel);
            }
        };
        public final boolean explicit;
        public final String name;
        public final int playcount;
        public final Release release;
        public final String uri;

        public int describeContents() {
            return 0;
        }

        @JsonCreator
        public Track(@JsonProperty("uri") String str, @JsonProperty("playcount") int i, @JsonProperty("explicit") boolean z, @JsonProperty("name") String str2, @JsonProperty("release") Release release2) {
            this.uri = str;
            this.playcount = i;
            this.explicit = z;
            this.name = str2;
            this.release = release2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uri);
            parcel.writeInt(this.playcount);
            jse.a(parcel, this.explicit);
            parcel.writeString(this.name);
            jse.a(parcel, (Parcelable) this.release, i);
        }

        private Track(Parcel parcel) {
            this.uri = parcel.readString();
            this.playcount = parcel.readInt();
            this.explicit = jse.a(parcel);
            this.name = parcel.readString();
            this.release = (Release) jse.b(parcel, Release.CREATOR);
        }
    }

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public ArtistModel(@JsonProperty("uri") String str, @JsonProperty("info") ArtistInfo artistInfo, @JsonProperty("header_image") HeaderImage headerImage2, @JsonProperty("gallery") ArtistGallery artistGallery, @JsonProperty("top_tracks") Map<String, List<Track>> map, @JsonProperty("upcoming_concerts") Map<String, List<Concert>> map2, @JsonProperty("merch") Map<String, List<MerchandiseItem>> map3, @JsonProperty("related_artists") Map<String, List<ArtistInfo>> map4, @JsonProperty("biography") Map<String, String> map5, @JsonProperty("releases") Releases releases2, @JsonProperty("latest_release") Release release, @JsonProperty("published_playlists") Map<String, List<Playlist>> map6, @JsonProperty("custom_message") CustomMessage customMessage2, @JsonProperty("monthly_listeners") MonthlyListeners monthlyListeners2, @JsonProperty("creator_about") CreatorAbout creatorAbout2, @JsonProperty("pinned_item") ArtistsPick artistsPick2) {
        String str2;
        Map<String, String> map7 = map5;
        this.uri = (String) fay.a(str);
        this.info = (ArtistInfo) fay.a(artistInfo);
        this.headerImage = headerImage2;
        this.gallery = Optional.c(artistGallery);
        Map<String, List<Track>> map8 = map;
        List<Track> extractListFromMap = extractListFromMap("tracks", map);
        if (extractListFromMap.size() >= 5) {
            extractListFromMap = extractListFromMap.subList(0, 5);
        }
        this.topTracks = extractListFromMap;
        Map<String, List<Concert>> map9 = map2;
        this.upcomingConcerts = extractListFromMap("concerts", map2);
        Map<String, List<MerchandiseItem>> map10 = map3;
        this.merchandise = extractListFromMap("items", map3);
        Map<String, List<ArtistInfo>> map11 = map4;
        this.relatedArtists = extractListFromMap("artists", map4);
        if (map7 == null) {
            str2 = null;
        } else {
            str2 = (String) map5.get("text");
        }
        this.biography = Optional.c(str2);
        this.releases = releases2;
        this.latestRelease = Optional.c(release);
        this.playlists = extractListFromMap("playlists", map6);
        this.customMessage = Optional.c(customMessage2);
        this.monthlyListeners = Optional.c(monthlyListeners2);
        this.creatorAbout = Optional.c(creatorAbout2);
        this.artistsPick = Optional.c(artistsPick2);
    }

    static <T> List<T> extractListFromMap(String str, Map<String, List<T>> map) {
        if (map == null || !map.containsKey(str)) {
            return ImmutableList.d();
        }
        return ImmutableList.a((Collection) map.get(str));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        this.info.writeToParcel(parcel, 0);
        jse.a(parcel, (Parcelable) this.headerImage, 0);
        jse.a(parcel, (Parcelable) this.gallery.d(), 0);
        parcel.writeTypedList(this.topTracks);
        parcel.writeTypedList(this.upcomingConcerts);
        parcel.writeTypedList(this.merchandise);
        parcel.writeTypedList(this.relatedArtists);
        parcel.writeString((String) this.biography.d());
        this.releases.writeToParcel(parcel, 0);
        jse.a(parcel, (Parcelable) this.latestRelease.d(), 0);
        parcel.writeTypedList(this.playlists);
        jse.a(parcel, (Parcelable) this.customMessage.d(), 0);
        jse.a(parcel, (Parcelable) this.monthlyListeners.d(), 0);
        jse.a(parcel, (Parcelable) this.creatorAbout.d(), 0);
        jse.a(parcel, (Parcelable) this.artistsPick.d(), 0);
    }

    private ArtistModel(Parcel parcel) {
        this.uri = parcel.readString();
        this.info = (ArtistInfo) ArtistInfo.CREATOR.createFromParcel(parcel);
        this.headerImage = (HeaderImage) jse.b(parcel, HeaderImage.CREATOR);
        this.gallery = Optional.c(jse.b(parcel, ArtistGallery.CREATOR));
        this.topTracks = (List) fay.a(readImmutableList(parcel, Track.CREATOR));
        this.upcomingConcerts = (List) fay.a(readImmutableList(parcel, Concert.CREATOR));
        this.merchandise = (List) fay.a(readImmutableList(parcel, MerchandiseItem.CREATOR));
        this.relatedArtists = (List) fay.a(readImmutableList(parcel, ArtistInfo.CREATOR));
        this.biography = Optional.c(parcel.readString());
        this.releases = (Releases) Releases.CREATOR.createFromParcel(parcel);
        this.latestRelease = Optional.c(jse.b(parcel, Release.CREATOR));
        this.playlists = (List) fay.a(readImmutableList(parcel, Playlist.CREATOR));
        this.customMessage = Optional.c(jse.b(parcel, CustomMessage.CREATOR));
        this.monthlyListeners = Optional.c(jse.b(parcel, MonthlyListeners.CREATOR));
        this.creatorAbout = Optional.c(jse.b(parcel, CreatorAbout.CREATOR));
        this.artistsPick = Optional.c(jse.b(parcel, ArtistsPick.CREATOR));
    }

    /* access modifiers changed from: private */
    public static <T> List<T> readImmutableList(Parcel parcel, Creator<T> creator) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        if (createTypedArrayList == null) {
            return null;
        }
        return ImmutableList.a((Collection<? extends E>) createTypedArrayList);
    }
}
