package com.spotify.mobile.android.playlist.shelves;

import android.os.Handler;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Extender {
    final a a;
    public final HashSet<String> b = new HashSet<>();
    public final ArrayList<String> c = Lists.a();
    final AtomicBoolean d = new AtomicBoolean();
    private final FireAndForgetResolver e;
    private final ObjectMapper f;
    private final String g;
    private final int h;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item implements JacksonModel {
        public String id;
        public String imageUrl;
        public String largeImageUrl;
        public String name;

        @JsonCreator
        public Item(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("imageUrl") String str3, @JsonProperty("largeImageUrl") String str4) {
            this.id = str;
            this.name = str2;
            this.imageUrl = str3;
            this.largeImageUrl = str4;
        }
    }

    static class Request implements JacksonModel {
        @JsonProperty("numResults")
        public int numResults;
        @JsonProperty("trackSkipIDs")
        public Set<String> skipIds;
        @JsonProperty("title")
        public String title;
        @JsonProperty("trackIDs")
        public List<String> trackIds;
        @JsonProperty("playlistURI")
        public String uri;

        public Request(String str, int i, Set<String> set, List<String> list, String str2) {
            this.uri = str;
            this.numResults = i;
            this.skipIds = set;
            this.trackIds = list;
            this.title = str2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Response implements JacksonModel {
        public List<Track> recommendedTracks;

        @JsonCreator
        public Response(@JsonProperty("recommendedTracks") List<Track> list) {
            this.recommendedTracks = list;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Track implements JacksonModel {
        public Item album;
        public List<Item> artists;
        public int duration;
        public boolean explicit;
        public String id;
        public String name;

        @JsonCreator
        public Track(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("album") Item item, @JsonProperty("artists") List<Item> list, @JsonProperty("duration") int i, @JsonProperty("explicit") boolean z) {
            this.id = str;
            this.name = str2;
            this.album = item;
            this.artists = list;
            this.duration = i;
            this.explicit = z;
        }

        public String getUri() {
            StringBuilder sb = new StringBuilder("spotify:track:");
            sb.append(this.id);
            return sb.toString();
        }
    }

    public interface a {
        void a(Throwable th);

        void a(List<Track> list);
    }

    public Extender(FireAndForgetResolver fireAndForgetResolver, ObjectMapper objectMapper, String str, a aVar, int i) {
        this.g = (String) fay.a(str);
        this.h = i;
        this.e = (FireAndForgetResolver) fay.a(fireAndForgetResolver);
        this.f = objectMapper;
        this.a = aVar;
        this.d.set(false);
    }

    public final synchronized boolean a() {
        return this.d.get();
    }

    public final synchronized void b() {
        this.b.clear();
    }

    public final synchronized boolean c() {
        return !this.b.isEmpty();
    }

    public final synchronized void a(String str) {
        this.c.add(str);
    }

    public final synchronized void b(String str) {
        if (!this.d.get()) {
            this.d.set(true);
            Request request = new Request(this.g, this.h, this.b, this.c.subList(Math.max(0, this.c.size() - 5), this.c.size()), str);
            try {
                this.e.resolve(new com.spotify.cosmos.router.Request(com.spotify.cosmos.router.Request.POST, "hm://playlistextender/v2/extendp", null, this.f.writeValueAsBytes(request)), new JsonHttpCallbackReceiver<Response>(new Handler(), Response.class, this.f) {
                    public final /* synthetic */ void onResolved(com.spotify.cosmos.router.Response response, Object obj) {
                        Response response2 = (Response) obj;
                        Extender.this.a(response2.recommendedTracks);
                        Extender.this.d.set(false);
                        Extender.this.a.a(response2.recommendedTracks);
                    }

                    public final void onError(Throwable th, ErrorCause errorCause) {
                        Extender.this.d.set(false);
                        Extender.this.a.a(th);
                    }
                });
            } catch (JsonProcessingException e2) {
                this.d.set(false);
                this.a.a((Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(List<Track> list) {
        for (Track track : list) {
            this.b.add(track.id);
        }
    }
}
