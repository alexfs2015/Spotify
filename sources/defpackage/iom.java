package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest.ProtoShowsRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest.ProtoShowsResponse;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: iom reason: default package */
public final class iom extends BaseDataLoader<Show, uzy, Policy> implements iol<Show, uzy, Policy> {
    private static final Policy m;
    public MediaType a;
    private final String l;

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(e(), (Policy) jacksonModel);
    }

    public final /* synthetic */ byte[] a(uyy uyy) {
        Show[] showArr;
        uzy uzy = (uzy) uyy;
        ArrayList arrayList = new ArrayList(((Show[]) uzy.getItems()).length);
        for (Show show : (Show[]) uzy.getItems()) {
            arrayList.add((ProtoShowsRequestItem) ProtoShowsRequestItem.q().a(vaa.b(show)).a(vaa.a(show)).a(vaa.c(show)).a(show.i()).a(show.h()).a(show.e()).g());
        }
        return ((ProtoShowsResponse) ProtoShowsResponse.l().b(uzy.getUnfilteredLength()).c(uzy.getUnrangedLength()).a(uzy.isLoading()).a(uzy.a()).a((Iterable<? extends ProtoShowsRequestItem>) arrayList).g()).b();
    }

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap(0);
        hashMap.put("link", Boolean.TRUE);
        hashMap.put("name", Boolean.TRUE);
        hashMap.put("covers", Boolean.TRUE);
        hashMap.put("publisher", Boolean.TRUE);
        hashMap.put("latestPublishedEpisodeDate", Boolean.TRUE);
        hashMap.put("hasNewEpisodes", Boolean.TRUE);
        listPolicy.setListAttributes(hashMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        m = new Policy(decorationPolicy);
    }

    public iom(RxResolver rxResolver, String str) {
        super(rxResolver);
        this.l = str;
        Logger.b("Creating new ShowsDataLoader", new Object[0]);
    }

    public final void a(MediaType mediaType) {
        this.a = mediaType;
    }

    private String e() {
        MediaType mediaType = this.a;
        if (mediaType == null) {
            return f().a();
        }
        if (mediaType != null) {
            UriBuilder f = f();
            f.n = this.a;
            return f.a();
        }
        UriBuilder f2 = f();
        f2.m = null;
        return f2.a();
    }

    private UriBuilder f() {
        UriBuilder a2 = new UriBuilder("sp://core-collection/unstable/<username>/list/shows/all").a(100).a(this.l).a(c()).a(this.j, this.k);
        a2.d = this.d;
        a2.b = this.e;
        a2.e = this.f;
        a2.o = Format.PROTOBUF;
        return a2;
    }

    public final void a(juf<uzy> juf) {
        a(e(), juf, m);
    }

    public final Observable<uzy> a() {
        return a(e(), m);
    }

    public final Observable<uzy> b() {
        return b(e(), m);
    }

    public final /* bridge */ /* synthetic */ uyy a(byte[] bArr) {
        return uzz.a(ProtoShowsResponse.a(bArr));
    }
}
