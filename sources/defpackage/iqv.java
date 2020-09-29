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

/* renamed from: iqv reason: default package */
public final class iqv extends BaseDataLoader<vku, vlb<vku>, Policy> {
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

    public iqv(RxResolver rxResolver) {
        this(rxResolver, "@");
    }

    public iqv(RxResolver rxResolver, String str) {
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

    public final Observable<vlb<vku>> a() {
        return a(e(), m);
    }

    public final Observable<vlb<vku>> a(Policy policy) {
        return a(e(), policy);
    }

    public final vlb<vku> a(byte[] bArr) {
        return isb.a(ProtoCollectionArtistsResponse.a(bArr));
    }

    public final void a(jwn<vlb<vku>> jwn) {
        a(e(), jwn, m);
    }

    public final void a(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final byte[] a(vlb<vku> vlb) {
        Object obj;
        ArrayList arrayList = new ArrayList(((vku[]) vlb.getItems()).length);
        vku[] vkuArr = (vku[]) vlb.getItems();
        int length = vkuArr.length;
        for (int i = 0; i < length; i++) {
            vku vku = vkuArr[i];
            ProtoArtistMetadata protoArtistMetadata = 0;
            if (vku == null) {
                obj = protoArtistMetadata;
            } else {
                String str = "";
                a a2 = ProtoCollectionArtistsItem.r().a(vku == null ? null : (ProtoArtistCollectionState) ProtoArtistCollectionState.k().a((String) jvi.a(vku.getCollectionUri(), str)).a(vku.isFollowed()).b(vku.isDismissed()).b(vku.getNumAlbumsInCollection()).a(vku.getNumTracksInCollection()).g());
                if (vku != null) {
                    protoArtistMetadata = (ProtoArtistMetadata) ProtoArtistMetadata.m().b((String) jvi.a(vku.getName(), str)).a((String) jvi.a(vku.getUri(), str)).a(vku.isVariousArtists()).a(isc.a(vku.getCovers())).g();
                }
                obj = (ProtoCollectionArtistsItem) a2.a(protoArtistMetadata).a((String) jvi.a(vku.getHeader(), str)).b(0).a(0).g();
            }
            arrayList.add(obj);
        }
        return ((ProtoCollectionArtistsResponse) ProtoCollectionArtistsResponse.l().b(vlb.getUnrangedLength()).a(vlb.getUnfilteredLength()).a(vlb.isLoading()).a((Iterable<? extends ProtoCollectionArtistsItem>) arrayList).g()).b();
    }

    public final Observable<vlb<vku>> b() {
        return b(e(), m);
    }

    /* renamed from: b */
    public final Observable<vlb<vku>> a(Policy policy) {
        return b(e(), policy);
    }
}
