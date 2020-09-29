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

/* renamed from: iqz reason: default package */
public final class iqz extends BaseDataLoader<Show, vmm, Policy> implements iqy<Show, vmm, Policy> {
    private static final Policy m;
    public MediaType a;
    private final String l;

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

    public iqz(RxResolver rxResolver, String str) {
        super(rxResolver);
        this.l = str;
        Logger.b("Creating new ShowsDataLoader", new Object[0]);
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

    public final Observable<vmm> a() {
        return a(e(), m);
    }

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(e(), (Policy) jacksonModel);
    }

    public final /* bridge */ /* synthetic */ vlb a(byte[] bArr) {
        return vmn.a(ProtoShowsResponse.a(bArr));
    }

    public final void a(jwn<vmm> jwn) {
        a(e(), jwn, m);
    }

    public final /* synthetic */ byte[] a(vlb vlb) {
        Show[] showArr;
        vmm vmm = (vmm) vlb;
        ArrayList arrayList = new ArrayList(((Show[]) vmm.getItems()).length);
        for (Show show : (Show[]) vmm.getItems()) {
            arrayList.add((ProtoShowsRequestItem) ProtoShowsRequestItem.q().a(vmo.b(show)).a(vmo.a(show)).a(vmo.c(show)).a(show.i()).a(show.h()).a(show.e()).g());
        }
        return ((ProtoShowsResponse) ProtoShowsResponse.l().b(vmm.getUnfilteredLength()).c(vmm.getUnrangedLength()).a(vmm.isLoading()).a(vmm.a()).a((Iterable<? extends ProtoShowsRequestItem>) arrayList).g()).b();
    }

    public final Observable<vmm> b() {
        return b(e(), m);
    }
}
