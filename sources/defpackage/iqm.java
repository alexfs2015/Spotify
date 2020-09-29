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
import com.spotify.mobile.android.spotlets.collection.json.AlbumEntityJacksonModel;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.mobile.android.util.loader.PlayPayload;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iqm reason: default package */
public final class iqm extends BaseDataLoader<vlf, irf, Policy> {
    private static final SortOption a;
    private static final Policy n;
    private final ObjectMapper l;
    private final String m;

    static {
        SortOption sortOption = new SortOption("discNumber");
        sortOption.mSecondarySortOption = new SortOption("trackNumber");
        a = sortOption;
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

    public iqm(RxResolver rxResolver, String str, rwl rwl) {
        super(rxResolver);
        this.m = jva.a(str).f();
        this.l = rwl.b();
        Logger.b("Creating new AlbumDataLoader", new Object[0]);
    }

    /* access modifiers changed from: private */
    public byte[] a(irf irf) {
        try {
            return this.l.writeValueAsBytes(irf);
        } catch (JsonProcessingException e) {
            Logger.e(e, "Failed to serialize AlbumEntity", new Object[0]);
            return new byte[0];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public irf a(byte[] bArr) {
        return (irf) this.l.readValue(bArr, AlbumEntityJacksonModel.class);
    }

    private String e() {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/@/view/album/<b62-album-id>").a(500).b(this.m).a(c());
        a2.b = this.e;
        a2.f = this.g;
        UriBuilder a3 = a2.a(this.j, this.k);
        a3.a = this.b;
        a3.o = Format.JSON;
        return a3.a();
    }

    public final Observable<irf> a() {
        return a(e(), n);
    }

    public final Observable<irf> a(Policy policy) {
        return b(e(), policy);
    }

    public final void a(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/@/list/tracks/album/<b62-album-id>");
        uriBuilder.j = true;
        UriBuilder a2 = uriBuilder.b(this.m).a(c());
        a2.b = this.e;
        a2.f = this.g;
        a2.a = this.b;
        a(a2.a(), (JacksonModel) new PlayPayload(playOptions, playOrigin, map), true);
    }

    public final void a(jwn<irf> jwn) {
        a(e(), jwn, n);
    }

    public final void a(boolean z) {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/@/list/tracks/album/<b62-album-id>");
        uriBuilder.k = true;
        String a2 = uriBuilder.b(this.m).a(c()).a();
        if (z) {
            a(a2);
        } else {
            b(a2);
        }
    }

    public final Observable<irf> b() {
        return b(e(), n);
    }
}