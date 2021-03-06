package com.spotify.music.features.assistedcuration.loader;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class GenresLoader {
    private final gky<GenreResponse> a;

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class GenreCluster implements JacksonModel {
        private final String mName;
        private final List<GenreTrack> mTracks;

        @JsonCreator
        public GenreCluster(@JsonProperty("genre_name") String str, @JsonProperty("genre_tracks") List<GenreTrack> list) {
            this.mName = str;
            this.mTracks = list;
        }

        public String getName() {
            return this.mName;
        }

        public List<GenreTrack> getTracks() {
            return this.mTracks;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GenreResponse implements JacksonModel {
        private final List<GenreCluster> mGenreClusters;

        @JsonCreator
        public GenreResponse(@JsonProperty("genres") List<GenreCluster> list) {
            this.mGenreClusters = list;
        }

        public List<GenreCluster> getClusters() {
            return this.mGenreClusters;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class GenreTrack implements JacksonModel {
        public abstract String getAlbumName();

        public abstract String getArtistName();

        public abstract List<String> getArtistNames();

        public abstract String getImageUri();

        public abstract String getName();

        public abstract String getPreviewId();

        public abstract String getUri();

        public abstract boolean isBanned();

        public abstract boolean isExplicit();

        public abstract boolean isHearted();

        @JsonCreator
        public static GenreTrack create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("preview_id") String str3, @JsonProperty("album") Item item, @JsonProperty("artists") List<Item> list, @JsonProperty("has_heart") boolean z, @JsonProperty("banned") boolean z2, @JsonProperty("explicit") boolean z3) {
            List list2;
            List<Item> list3 = list;
            String str4 = "";
            String name = item != null ? item.getName() : str4;
            boolean z4 = list3 != null && !list.isEmpty();
            String name2 = z4 ? ((Item) list3.get(0)).getName() : str4;
            AnonymousClass1 r2 = new Function<Item, String>() {
                public final /* synthetic */ Object apply(Object obj) {
                    return ((Item) obj).getName();
                }
            };
            if (z4) {
                list2 = Lists.a(list3, r2);
            } else {
                list2 = Collections.emptyList();
            }
            List list4 = list2;
            String imageUrl = item != null ? item.getImageUrl() : str4;
            AutoValue_GenresLoader_GenreTrack autoValue_GenresLoader_GenreTrack = new AutoValue_GenresLoader_GenreTrack(str, str2, str3 != null ? str3 : str4, z3, z, z2, name, name2, list4, imageUrl != null ? imageUrl : str4);
            return autoValue_GenresLoader_GenreTrack;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Item implements JacksonModel {
        public abstract String getId();

        public abstract String getImageUrl();

        public abstract String getLargeImageUrl();

        public abstract String getName();

        @JsonCreator
        public static Item create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4) {
            return new AutoValue_GenresLoader_Item(str, str2, str3, str4);
        }
    }

    public GenresLoader(gky<GenreResponse> gky) {
        this.a = gky;
    }

    public final wud<List<lqs>> a(int i, int i2, String str) {
        return this.a.resolve(new Request(Request.GET, String.format(Locale.US, "hm://playlistextender/v2/top-genre-tracks?max_genres=%d&max_artists=%d&max_tracks=%d&title=%s", new Object[]{Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(100), Uri.encode(str)}))).h($$Lambda$GenresLoader$5Kegn688pSiXI40EJ8DNtPR3o5A.INSTANCE).f($$Lambda$GenresLoader$W5_XS90DqUQTzvLGP20guD3jLKw.INSTANCE).h($$Lambda$GenresLoader$aTymYVso2Dn5E9Tnq49zXqnk5go.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(GenreResponse genreResponse) {
        ArrayList a2 = Lists.a();
        for (GenreCluster genreCluster : genreResponse.getClusters()) {
            a2.add(lqs.a(genreCluster.getName(), lqv.c(genreCluster.getTracks())));
        }
        return a2;
    }
}
