package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.json.ArtistEntityJacksonModel;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.mobile.android.util.loader.PlayPayload;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iog reason: default package */
public final class iog extends BaseDataLoader<uzc, iot, Policy> {
    private static final SortOption a = new jss(new SortOption("album.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a;
    private static final Policy n;
    private final ObjectMapper l;
    private final String m;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap();
        hashMap.put("link", Boolean.TRUE);
        String str = "name";
        hashMap.put(str, Boolean.TRUE);
        hashMap.put("offline", Boolean.TRUE);
        hashMap.put("playable", Boolean.TRUE);
        hashMap.put("isExplicit", Boolean.TRUE);
        listPolicy.setListAttributes(hashMap);
        Map singletonMap = Collections.singletonMap(str, Boolean.TRUE);
        listPolicy.setAlbumAttributes(singletonMap);
        listPolicy.setArtistAttributes(singletonMap);
        listPolicy.setArtistsAttributes(singletonMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        n = new Policy(decorationPolicy);
    }

    public iog(RxResolver rxResolver, String str, rnf rnf) {
        super(rxResolver);
        this.m = jst.a(str).f();
        this.l = rnf.b();
        Logger.b("Creating new ArtistDataLoader", new Object[0]);
    }

    private String e() {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/@/view/artist/<b62-artist-id>").a(500).c(this.m).a(c());
        a2.b = this.e;
        a2.f = this.g;
        UriBuilder a3 = a2.a(this.j, this.k);
        a3.a = this.b;
        a3.o = Format.JSON;
        return a3.a();
    }

    public final void a(juf<iot> juf) {
        a(e(), juf, n);
    }

    public final Observable<iot> a() {
        return a(e(), n);
    }

    public final Observable<iot> b() {
        return b(e(), n);
    }

    public final Observable<iot> a(Policy policy) {
        return b(e(), policy);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public iot a(byte[] bArr) {
        return (iot) this.l.readValue(bArr, ArtistEntityJacksonModel.class);
    }

    /* access modifiers changed from: private */
    public byte[] a(iot iot) {
        try {
            return this.l.writeValueAsBytes(iot);
        } catch (JsonProcessingException e) {
            Logger.e(e, "Failed to serialize ArtistEntity", new Object[0]);
            return new byte[0];
        }
    }

    public final void a(boolean z) {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/@/list/tracks/artist/<b62-artist-id>");
        uriBuilder.k = true;
        String a2 = uriBuilder.c(this.m).a(c()).a();
        if (z) {
            a(a2);
        } else {
            b(a2);
        }
    }

    public final void a(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/@/list/tracks/artist/<b62-artist-id>");
        uriBuilder.j = true;
        UriBuilder a2 = uriBuilder.c(this.m).a(c());
        a2.b = this.e;
        a2.f = this.g;
        a2.a = this.b;
        a(a2.a(), (JacksonModel) new PlayPayload(playOptions, playOrigin, map), true);
    }

    public final Observable<iot> b(Policy policy) {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/@/list/tracks/artist/<b62-artist-id>").a(500).c(this.m).a(c());
        a2.b = this.e;
        a2.f = this.g;
        UriBuilder a3 = a2.a(this.j, this.k);
        a3.a = this.b;
        a3.o = Format.JSON;
        return b(a3.a(), null);
    }
}
