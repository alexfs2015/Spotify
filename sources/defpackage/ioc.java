package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest.ProtoCollectionAlbumsItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest.ProtoCollectionAlbumsItem.a;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest.ProtoCollectionAlbumsResponse;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: ioc reason: default package */
public final class ioc extends BaseDataLoader<uyq, uyy<uyq>, Policy> {
    private static final Policy m;
    public Boolean a;
    private final String l;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap();
        hashMap.put("link", Boolean.TRUE);
        String str = "name";
        hashMap.put(str, Boolean.TRUE);
        hashMap.put("covers", Boolean.TRUE);
        hashMap.put("offline", Boolean.TRUE);
        hashMap.put("playable", Boolean.TRUE);
        hashMap.put("available", Boolean.TRUE);
        hashMap.put("inCollection", Boolean.TRUE);
        listPolicy.setListAttributes(hashMap);
        listPolicy.setArtistAttributes(Collections.singletonMap(str, Boolean.TRUE));
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        m = new Policy(decorationPolicy);
    }

    public ioc(RxResolver rxResolver) {
        this(rxResolver, "@");
    }

    public ioc(RxResolver rxResolver, String str) {
        super(rxResolver);
        this.l = str;
        Logger.b("Creating new AlbumsDataLoader", new Object[0]);
    }

    private String e() {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/<username>/list/albums/all").a(1000).a(this.l).a(c());
        a2.d = this.d;
        a2.b = this.e;
        a2.c = false;
        UriBuilder a3 = a2.a(this.j, this.k);
        a3.e = this.f;
        a3.a = this.b;
        a3.h = this.i;
        a3.o = Format.PROTOBUF;
        if (this.a != null) {
            a3.d(String.format(Locale.getDefault(), "saved eq %s", new Object[]{this.a}));
        }
        return a3.a();
    }

    public final void a(juf<uyy<uyq>> juf) {
        a(e(), juf, m);
    }

    public final Observable<uyy<uyq>> a() {
        return a(e(), m);
    }

    public final Observable<uyy<uyq>> a(Policy policy) {
        return a(e(), policy);
    }

    public final Observable<uyy<uyq>> b() {
        return b(e(), m);
    }

    /* renamed from: b */
    public final Observable<uyy<uyq>> a(Policy policy) {
        return b(e(), policy);
    }

    public final uyy<uyq> a(byte[] bArr) {
        return ipo.a(ProtoCollectionAlbumsResponse.a(bArr));
    }

    public final byte[] a(uyy<uyq> uyy) {
        uyq[] uyqArr;
        ProtoAlbumCollectionState protoAlbumCollectionState;
        ArrayList arrayList = new ArrayList(((uyq[]) uyy.getItems()).length);
        for (uyq uyq : (uyq[]) uyy.getItems()) {
            a r = ProtoCollectionAlbumsItem.r();
            String str = "";
            if (uyq == null) {
                protoAlbumCollectionState = null;
            } else {
                protoAlbumCollectionState = (ProtoAlbumCollectionState) ProtoAlbumCollectionState.k().a((String) jtc.a(uyq.getCollectionUri(), str)).a(uyq.isSavedToCollection()).a(uyq.getNumTracksInCollection()).g();
            }
            arrayList.add((ProtoCollectionAlbumsItem) r.a(protoAlbumCollectionState).a(ipp.a(uyq)).a((String) jtc.a(uyq.getHeader(), str)).b(0).a(0).g());
        }
        return ((ProtoCollectionAlbumsResponse) ProtoCollectionAlbumsResponse.l().b(uyy.getUnrangedLength()).a(uyy.getUnfilteredLength()).a(uyy.isLoading()).a((Iterable<? extends ProtoCollectionAlbumsItem>) arrayList).g()).b();
    }
}
