package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoOnlineData;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowRequestHeader;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowResponse.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.music.libs.podcast.loader.ShowUriBuilder;
import com.spotify.music.libs.podcast.loader.ShowUriBuilder.Format;
import com.spotify.playlist.models.Show;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: rxi reason: default package */
public final class rxi extends BaseDataLoader<uys, uzx, Policy> implements rxg<uys, uzx, Policy> {
    private static final HashMap<String, Boolean> p;
    private static final HashMap<String, Boolean> q;
    public String a;
    public boolean l;
    private final String m;
    private final Set<String> n = new HashSet(0);
    private final Set<String> o = new HashSet(0);

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(f(), (Policy) jacksonModel);
    }

    public final /* synthetic */ byte[] a(uyy uyy) {
        uys[] uysArr;
        ProtoShowRequestHeader protoShowRequestHeader;
        uzx uzx = (uzx) uyy;
        ArrayList arrayList = new ArrayList(((uys[]) uzx.getItems()).length);
        for (uys uys : (uys[]) uzx.getItems()) {
            arrayList.add((ProtoShowRequestItem) ProtoShowRequestItem.t().a(vaa.a(uys)).a(vaa.c(uys)).a(vaa.b(uys)).a((String) vaa.a(uys.getHeader(), "")).g());
        }
        a a2 = ProtoShowResponse.r().a(uzx.getUnfilteredLength()).c(uzx.getUnrangedLength()).b(((uys[]) uzx.getItems()).length).a(uzx.isLoading());
        Show a3 = uzx.a();
        ProtoOnlineData protoOnlineData = null;
        if (a3 == null) {
            protoShowRequestHeader = null;
        } else {
            protoShowRequestHeader = (ProtoShowRequestHeader) ProtoShowRequestHeader.q().a(vaa.c(a3)).a(vaa.a(a3)).a(vaa.b(a3)).g();
        }
        a a4 = a2.a(protoShowRequestHeader);
        uzu b = uzx.b();
        if (b != null) {
            protoOnlineData = (ProtoOnlineData) ProtoOnlineData.l().a(b.getNumFollowers()).g();
        }
        return ((ProtoShowResponse) a4.a(protoOnlineData).a((Iterable<? extends ProtoShowRequestItem>) arrayList).g()).b();
    }

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>(15);
        String str = "link";
        hashMap.put(str, Boolean.TRUE);
        String str2 = "name";
        hashMap.put(str2, Boolean.TRUE);
        hashMap.put("offline", Boolean.TRUE);
        hashMap.put("isNew", Boolean.TRUE);
        hashMap.put("isInListenLater", Boolean.TRUE);
        hashMap.put("isPlayed", Boolean.TRUE);
        hashMap.put("length", Boolean.TRUE);
        hashMap.put("timeLeft", Boolean.TRUE);
        hashMap.put("publishDate", Boolean.TRUE);
        hashMap.put("playable", Boolean.TRUE);
        hashMap.put("available", Boolean.TRUE);
        hashMap.put("covers", Boolean.TRUE);
        hashMap.put("freezeFrames", Boolean.TRUE);
        hashMap.put("manifestId", Boolean.TRUE);
        hashMap.put("mediaTypeEnum", Boolean.TRUE);
        hashMap.put("isExplicit", Boolean.TRUE);
        hashMap.put("backgroundable", Boolean.TRUE);
        hashMap.put("description", Boolean.TRUE);
        p = hashMap;
        HashMap<String, Boolean> hashMap2 = new HashMap<>(3);
        hashMap2.put(str, Boolean.TRUE);
        hashMap2.put("inCollection", Boolean.TRUE);
        hashMap2.put(str2, Boolean.TRUE);
        q = hashMap2;
    }

    public rxi(RxResolver rxResolver, String str) {
        super(rxResolver);
        this.m = str;
        Logger.b("Creating new ShowDataLoader", new Object[0]);
    }

    private String f() {
        ShowUriBuilder a2 = new ShowUriBuilder("sp://core-show/v1/shows/<b62-show-id>").a(100);
        String f = jst.a(this.m).f();
        Assertion.a(a2.a.contains("<b62-show-id>"), "Base uri does not contain the show id placeholder.", new Object[0]);
        a2.b = f;
        a2.d = this.e;
        a2.e = this.d;
        a2.f = this.f;
        ShowUriBuilder a3 = a2.a(this.j, this.k);
        a3.h = c();
        a3.o = this.l;
        a3.n = Format.PROTOBUF;
        String str = this.a;
        if (str != null) {
            a3.c = str;
            a3.i = Integer.valueOf(15);
        }
        return a3.a();
    }

    private Map<String, Boolean> g() {
        if (this.o.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(this.o.size());
        for (String put : this.o) {
            hashMap.put(put, Boolean.TRUE);
        }
        return hashMap;
    }

    private DecorationPolicy h() {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap(p.size() + this.n.size());
        hashMap.putAll(p);
        for (String put : this.n) {
            hashMap.put(put, Boolean.TRUE);
        }
        listPolicy.setListAttributes(hashMap);
        listPolicy.setShowAttributes(q);
        decorationPolicy.setListPolicy(listPolicy);
        decorationPolicy.setAuxiliarySectionsAttributes(g());
        return decorationPolicy;
    }

    private Policy i() {
        return new Policy(h());
    }

    public final void a(juf<uzx> juf) {
        a(f(), juf, i());
    }

    public final Single<uzx> e() {
        return a(i());
    }

    private Single<uzx> a(Policy policy) {
        return a(f(), policy).a(0);
    }

    public final Observable<uzx> a() {
        return a(f(), i());
    }

    public final Observable<uzx> b() {
        return b(f(), i());
    }

    public final void d_(String str) {
        this.a = str;
    }

    public final void c(String str) {
        this.n.add(str);
    }

    public final void d(String str) {
        this.o.add(str);
    }

    public final /* bridge */ /* synthetic */ uyy a(byte[] bArr) {
        return (uzx) fay.a(uzz.a(ProtoShowResponse.a(bArr)));
    }
}
