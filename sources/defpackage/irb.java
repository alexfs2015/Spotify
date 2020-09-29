package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest.ProtoCollectionTracksItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest.ProtoCollectionTracksItem.a;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest.ProtoCollectionTracksResponse;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.mobile.android.util.loader.PlayPayload;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: irb reason: default package */
public final class irb extends BaseDataLoader<vlf, iri, Policy> {
    private static final Policy m;
    public boolean a;
    private final String l;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap();
        hashMap.put("link", Boolean.TRUE);
        String str = "name";
        hashMap.put(str, Boolean.TRUE);
        hashMap.put("offline", Boolean.TRUE);
        hashMap.put("playable", Boolean.TRUE);
        hashMap.put("available", Boolean.TRUE);
        hashMap.put("isExplicit", Boolean.TRUE);
        hashMap.put("inCollection", Boolean.TRUE);
        hashMap.put("hasLyrics", Boolean.TRUE);
        listPolicy.setListAttributes(hashMap);
        Map singletonMap = Collections.singletonMap(str, Boolean.TRUE);
        listPolicy.setAlbumAttributes(singletonMap);
        listPolicy.setArtistAttributes(singletonMap);
        listPolicy.setArtistsAttributes(singletonMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        m = new Policy(decorationPolicy);
    }

    public irb(RxResolver rxResolver) {
        this(rxResolver, "@");
    }

    public irb(RxResolver rxResolver, String str) {
        super(rxResolver);
        this.l = str;
        Logger.b("Creating new TracksDataLoader", new Object[0]);
    }

    private void a(PlayOptions playOptions, PlayOrigin playOrigin, String str, Map<String, String> map) {
        UriBuilder uriBuilder = new UriBuilder(str);
        uriBuilder.j = true;
        UriBuilder a2 = uriBuilder.a(this.l).a(c());
        a2.d = this.d;
        a2.b = this.e;
        a2.f = this.g;
        a2.g = this.h;
        a2.e = this.f;
        a2.a = this.b;
        a(a2.a(), (JacksonModel) new PlayPayload(playOptions, playOrigin, map), true);
    }

    private String e() {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/<username>/list/tracks/all").a(1000).a(this.l).a(c());
        a2.d = this.d;
        a2.b = this.e;
        a2.f = this.g;
        a2.g = this.h;
        UriBuilder a3 = a2.a(this.j, this.k);
        a3.e = this.f;
        a3.a = this.b;
        a3.i = this.a;
        a3.o = Format.PROTOBUF;
        return a3.a();
    }

    public final Observable<iri> a() {
        return a(e(), m);
    }

    public final Observable<iri> a(Policy policy) {
        return a(e(), policy);
    }

    public final /* bridge */ /* synthetic */ vlb a(byte[] bArr) {
        return isb.a(ProtoCollectionTracksResponse.a(bArr));
    }

    public final void a(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        a(playOptions, playOrigin, "sp://core-collection/unstable/<username>/list/tracks/all", map);
    }

    public final void a(jwn<iri> jwn) {
        a(e(), jwn, m);
    }

    public final void a(boolean z) {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/<username>/list/tracks/all");
        uriBuilder.k = true;
        String a2 = uriBuilder.a(this.l).a(c()).a();
        if (z) {
            a(a2);
        } else {
            b(a2);
        }
    }

    public final /* synthetic */ byte[] a(vlb vlb) {
        iri iri = (iri) vlb;
        ArrayList arrayList = new ArrayList(((vlf[]) iri.getItems()).length);
        vlf[] vlfArr = (vlf[]) iri.getItems();
        int length = vlfArr.length;
        for (int i = 0; i < length; i++) {
            vlf vlf = vlfArr[i];
            ProtoTrackCollectionState protoTrackCollectionState = null;
            a a2 = ProtoCollectionTracksItem.t().a(vlf == null ? null : (ProtoTrackPlayState) ProtoTrackPlayState.l().a(vlf.isCurrentlyPlayable()).g()).a(isc.a(vlf));
            if (vlf != null) {
                protoTrackCollectionState = (ProtoTrackCollectionState) ProtoTrackCollectionState.k().a(vlf.inCollection()).b(vlf.canAddToCollection()).c(vlf.isBanned()).d(vlf.canBan()).g();
            }
            arrayList.add((ProtoCollectionTracksItem) a2.a(protoTrackCollectionState).a((String) jvi.a(vlf.getHeader(), "")).b(vlf.getAddTime()).a(0).g());
        }
        return ((ProtoCollectionTracksResponse) ProtoCollectionTracksResponse.l().b(iri.getUnrangedLength()).a(iri.getUnfilteredLength()).a(iri.isLoading()).a((Iterable<? extends ProtoCollectionTracksItem>) arrayList).g()).b();
    }

    public final Observable<iri> b() {
        return b(e(), m);
    }

    /* renamed from: b */
    public final Observable<iri> a(Policy policy) {
        return b(e(), policy);
    }
}
