package com.spotify.music.features.assistedcuration.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx.internal.operators.EmptyObservableHolder;

public final class RecsLoader {
    private final ObjectMapper a;
    private final gky<RecsResponse> b;

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class RecsItem implements JacksonModel {
        public String id;
        public String imageUrl;
        public String largeImageUrl;
        public String name;

        @JsonCreator
        public RecsItem(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4) {
            this.id = str;
            this.name = str2;
            this.imageUrl = str3;
            this.largeImageUrl = str4;
        }
    }

    static class RecsRequest implements JacksonModel {
        @JsonProperty("condensed")
        public boolean condensed = true;
        @JsonProperty("numResults")
        public int numResults;
        @JsonProperty("trackSkipIDs")
        public Set<String> skipIds;
        @JsonProperty("title")
        public String title;
        @JsonProperty("trackIDs")
        public Set<String> trackIds;
        @JsonProperty("playlistURI")
        public String uri;

        public RecsRequest(int i, Set<String> set, Set<String> set2, String str) {
            this.numResults = i;
            this.skipIds = set;
            this.trackIds = set2;
            this.title = str;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RecsResponse implements JacksonModel {
        private final List<RecsTrack> mRecommendedTracks;

        @JsonCreator
        public RecsResponse(@JsonProperty("recommended_tracks") List<RecsTrack> list) {
            this.mRecommendedTracks = list;
        }

        public List<RecsTrack> getRecommendedTracks() {
            return this.mRecommendedTracks;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RecsTrack implements JacksonModel {
        private final RecsItem mAlbum;
        private final List<RecsItem> mArtists;
        private final boolean mIsExplicit;
        private final String mName;
        private final String mPreviewId;
        private final String mUri;

        @JsonCreator
        public RecsTrack(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("preview_id") String str3, @JsonProperty("album") RecsItem recsItem, @JsonProperty("artists") List<RecsItem> list, @JsonProperty("explicit") boolean z) {
            this.mUri = str;
            this.mName = str2;
            this.mPreviewId = (String) jtc.a(str3, "");
            this.mAlbum = recsItem;
            this.mArtists = list;
            this.mIsExplicit = z;
        }

        public String getUri() {
            return this.mUri;
        }

        public String getName() {
            return this.mName;
        }

        public String getAlbumName() {
            RecsItem recsItem = this.mAlbum;
            if (recsItem != null) {
                return recsItem.name;
            }
            return null;
        }

        public String getArtistName() {
            List<RecsItem> list = this.mArtists;
            return (list == null || list.isEmpty()) ? "" : ((RecsItem) this.mArtists.get(0)).name;
        }

        public List<String> getArtistNames() {
            List<RecsItem> list = this.mArtists;
            if (list == null || list.isEmpty()) {
                return Collections.emptyList();
            }
            return Lists.a(this.mArtists, new Function<RecsItem, String>() {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return ((RecsItem) obj).name;
                }
            });
        }

        public boolean isExplicit() {
            return this.mIsExplicit;
        }

        public String getImage() {
            RecsItem recsItem = this.mAlbum;
            String str = "";
            if (recsItem == null) {
                return str;
            }
            if (recsItem.largeImageUrl != null) {
                return this.mAlbum.largeImageUrl;
            }
            return this.mAlbum.imageUrl != null ? this.mAlbum.imageUrl : str;
        }

        public String getPreviewId() {
            return this.mPreviewId;
        }
    }

    public RecsLoader(gky<RecsResponse> gky, rnf rnf) {
        this.b = gky;
        this.a = rnf.a().a();
    }

    public final wud<List<lqv>> a(Set<String> set, String str, Set<String> set2, int i) {
        try {
            return this.b.resolve(new Request(Request.POST, "hm://playlistextender/ft/v2/assist-curation", null, this.a.writeValueAsBytes(new RecsRequest(i, a(set2), a(set), str)))).h($$Lambda$RecsLoader$2KqheUgA6im3phuMzG_tZxE8huM.INSTANCE).f($$Lambda$RecsLoader$Dqw68h_o2ZTrMAUQMvCA6HjalY.INSTANCE).h($$Lambda$RecsLoader$QkUNEa1aRVpULS62FAcEYvA8Ai8.INSTANCE);
        } catch (JsonProcessingException unused) {
            return EmptyObservableHolder.a();
        }
    }

    public final wud<List<lqv>> a(String str, Set<String> set, List<lqv> list, int i) {
        HashSet hashSet;
        if (set instanceof Collection) {
            hashSet = new HashSet(set);
        } else {
            Iterator it = set.iterator();
            hashSet = new HashSet();
            Iterators.a((Collection<T>) hashSet, it);
        }
        hashSet.add(str);
        hashSet.addAll(a(list));
        return a(Collections.singleton(str), "", (Set<String>) hashSet, i);
    }

    private static Set<String> a(Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String a2 : set) {
            hashSet.add(jst.a(a2).f());
        }
        return hashSet;
    }

    private static Set<String> a(List<lqv> list) {
        HashSet hashSet = new HashSet();
        for (lqv a2 : list) {
            hashSet.add(a2.a());
        }
        return hashSet;
    }
}
