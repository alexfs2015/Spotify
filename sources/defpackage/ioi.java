package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest.ProtoCollectionArtistsItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest.ProtoCollectionArtistsItem.a;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest.ProtoCollectionArtistsResponse;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: ioi reason: default package */
public final class ioi extends BaseDataLoader<uyr, uyy<uyr>, Policy> {
    private static final Policy m;
    private final String a;
    private Boolean l;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap();
        hashMap.put("link", Boolean.TRUE);
        hashMap.put("name", Boolean.TRUE);
        hashMap.put("offline", Boolean.TRUE);
        hashMap.put("syncProgress", Boolean.TRUE);
        hashMap.put("portraits", Boolean.TRUE);
        hashMap.put("collectionLink", Boolean.TRUE);
        hashMap.put("isFollowed", Boolean.TRUE);
        hashMap.put("numTracksInCollection", Boolean.TRUE);
        listPolicy.setListAttributes(hashMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        m = new Policy(decorationPolicy);
    }

    public ioi(RxResolver rxResolver) {
        this(rxResolver, "@");
    }

    public ioi(RxResolver rxResolver, String str) {
        super(rxResolver);
        this.a = str;
        Logger.b("Creating new ArtistsDataLoader", new Object[0]);
    }

    private String e() {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/<username>/list/artists/all").a(1000).a(this.a).a(c());
        a2.d = this.d;
        a2.b = this.e;
        UriBuilder a3 = a2.a(this.j, this.k);
        a3.e = this.f;
        a3.a = this.b;
        a3.h = this.i;
        a3.o = Format.PROTOBUF;
        if (this.l != null) {
            a3.d(String.format(Locale.getDefault(), "isFollowed eq %s", new Object[]{this.l}));
        }
        return a3.a();
    }

    public final void a(juf<uyy<uyr>> juf) {
        a(e(), juf, m);
    }

    public final Observable<uyy<uyr>> a() {
        return a(e(), m);
    }

    public final Observable<uyy<uyr>> a(Policy policy) {
        return a(e(), policy);
    }

    public final Observable<uyy<uyr>> b() {
        return b(e(), m);
    }

    /* renamed from: b */
    public final Observable<uyy<uyr>> a(Policy policy) {
        return b(e(), policy);
    }

    public final void a(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final uyy<uyr> a(byte[] bArr) {
        return ipo.a(ProtoCollectionArtistsResponse.a(bArr));
    }

    public final byte[] a(uyy<uyr> uyy) {
        uyr[] uyrArr;
        Object obj;
        ProtoArtistCollectionState protoArtistCollectionState;
        ArrayList arrayList = new ArrayList(((uyr[]) uyy.getItems()).length);
        for (uyr uyr : (uyr[]) uyy.getItems()) {
            ProtoArtistMetadata protoArtistMetadata = 0;
            if (uyr == null) {
                obj = protoArtistMetadata;
            } else {
                a r = ProtoCollectionArtistsItem.r();
                String str = "";
                if (uyr == null) {
                    protoArtistCollectionState = null;
                } else {
                    protoArtistCollectionState = (ProtoArtistCollectionState) ProtoArtistCollectionState.k().a((String) jtc.a(uyr.getCollectionUri(), str)).a(uyr.isFollowed()).b(uyr.isDismissed()).b(uyr.getNumAlbumsInCollection()).a(uyr.getNumTracksInCollection()).g();
                }
                a a2 = r.a(protoArtistCollectionState);
                if (uyr != null) {
                    protoArtistMetadata = (ProtoArtistMetadata) ProtoArtistMetadata.m().b((String) jtc.a(uyr.getName(), str)).a((String) jtc.a(uyr.getUri(), str)).a(uyr.isVariousArtists()).a(ipp.a(uyr.getCovers())).g();
                }
                obj = (ProtoCollectionArtistsItem) a2.a(protoArtistMetadata).a((String) jtc.a(uyr.getHeader(), str)).b(0).a(0).g();
            }
            arrayList.add(obj);
        }
        return ((ProtoCollectionArtistsResponse) ProtoCollectionArtistsResponse.l().b(uyy.getUnrangedLength()).a(uyy.getUnfilteredLength()).a(uyy.isLoading()).a((Iterable<? extends ProtoCollectionArtistsItem>) arrayList).g()).b();
    }
}
