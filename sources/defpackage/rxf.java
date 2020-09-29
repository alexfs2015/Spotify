package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest.ProtoOfflinedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest.ProtoOfflinedEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest.ProtoUnplayedEpisodesResponse;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rxf reason: default package */
public final class rxf extends BaseDataLoader<uys, uyy<uys>, Policy> implements iol<uys, uyy<uys>, Policy>, Cloneable, rxh {
    private static final HashMap<String, Boolean> q;
    private static final HashMap<String, Boolean> r;
    public MediaType a;
    private final String l;
    private final Set<String> m = new HashSet(0);
    private final Set<String> n = new HashSet(0);
    private MediaType o;
    private final boolean p;

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(f(), (Policy) jacksonModel);
    }

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
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
        hashMap.put("playable", Boolean.TRUE);
        hashMap.put("available", Boolean.TRUE);
        String str3 = "covers";
        hashMap.put(str3, Boolean.TRUE);
        hashMap.put("isExplicit", Boolean.TRUE);
        hashMap.put("freezeFrames", Boolean.TRUE);
        hashMap.put("manifestId", Boolean.TRUE);
        hashMap.put("mediaTypeEnum", Boolean.TRUE);
        hashMap.put("description", Boolean.TRUE);
        hashMap.put("publishDate", Boolean.TRUE);
        q = hashMap;
        HashMap<String, Boolean> hashMap2 = new HashMap<>();
        hashMap2.put(str2, Boolean.TRUE);
        hashMap2.put(str, Boolean.TRUE);
        hashMap2.put("inCollection", Boolean.TRUE);
        hashMap2.put(str3, Boolean.TRUE);
        r = hashMap2;
    }

    public rxf(RxResolver rxResolver, String str, boolean z) {
        super(rxResolver);
        this.l = str;
        this.p = z;
        Logger.b("Creating new CollectionEpisodesDataLoader", new Object[0]);
    }

    private Policy g() {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap(q.size() + this.n.size());
        hashMap.putAll(q);
        for (String put : this.n) {
            hashMap.put(put, Boolean.TRUE);
        }
        listPolicy.setListAttributes(hashMap);
        listPolicy.setShowAttributes(r);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        return new Policy(decorationPolicy);
    }

    public final void a(juf<uyy<uys>> juf) {
        a(f(), juf, g());
    }

    public final Observable<uyy<uys>> a() {
        return a(f(), g());
    }

    public final Observable<uyy<uys>> b() {
        return b(f(), g());
    }

    public final void a(MediaType mediaType) {
        this.o = mediaType;
    }

    public final wud<uyy<uys>> e() {
        return vun.a((ObservableSource<T>) b(), BackpressureStrategy.BUFFER);
    }

    public final void c(String str) {
        this.m.add(str);
    }

    public final void d(String str) {
        this.n.add(str);
    }

    private String f() {
        String str = this.d ? "sp://core-collection/unstable/<username>/list/episodes/all" : this.e ? "sp://core-collection/unstable/<username>/list/episodes/offline" : "sp://core-collection/unstable/<username>/list/episodes/union";
        UriBuilder a2 = new UriBuilder(str).a(100).a(this.l).a(c());
        a2.o = Format.PROTOBUF;
        if (this.m.isEmpty()) {
            UriBuilder a3 = a2.a(this.j, this.k);
            a3.d = this.d;
            a3.b = this.e;
            a3.e = this.f;
        } else {
            for (String d : this.m) {
                a2.d(d);
            }
            a2.f = true;
            a2.m = this.a;
        }
        if (this.f) {
            a2.f = true;
            a2.m = this.a;
        }
        a2.h = this.p;
        MediaType mediaType = this.o;
        if (mediaType != null) {
            a2.n = mediaType;
        }
        return a2.a();
    }

    public final uyy<uys> a(byte[] bArr) {
        if (this.e) {
            return uzz.a(ProtoOfflinedEpisodesResponse.a(bArr));
        }
        return uzz.a(ProtoUnplayedEpisodesResponse.a(bArr));
    }

    public final byte[] a(uyy<uys> uyy) {
        uys[] uysArr;
        if (!this.e) {
            return vaa.a(uyy).b();
        }
        ArrayList arrayList = new ArrayList(((uys[]) uyy.getItems()).length);
        for (uys uys : (uys[]) uyy.getItems()) {
            arrayList.add((ProtoOfflinedEpisodesRequestItem) ProtoOfflinedEpisodesRequestItem.t().a(vaa.a(uys)).a(vaa.c(uys)).a(vaa.b(uys)).a((String) vaa.a(uys.getHeader(), "")).g());
        }
        return ((ProtoOfflinedEpisodesResponse) ProtoOfflinedEpisodesResponse.l().a(uyy.getUnfilteredLength()).b(uyy.getUnrangedLength()).a(uyy.isLoading()).a((Iterable<? extends ProtoOfflinedEpisodesRequestItem>) arrayList).g()).b();
    }
}
