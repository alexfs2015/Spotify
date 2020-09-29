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

/* renamed from: sgp reason: default package */
public final class sgp extends BaseDataLoader<vkv, vlb<vkv>, Policy> implements iqy<vkv, vlb<vkv>, Policy>, Cloneable, sgr {
    private static final HashMap<String, Boolean> p;
    private static final HashMap<String, Boolean> q;
    public MediaType a;
    private final String l;
    private final Set<String> m = new HashSet(0);
    private final Set<String> n = new HashSet(0);
    private final boolean o;

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
        p = hashMap;
        HashMap<String, Boolean> hashMap2 = new HashMap<>();
        hashMap2.put(str2, Boolean.TRUE);
        hashMap2.put(str, Boolean.TRUE);
        hashMap2.put("inCollection", Boolean.TRUE);
        hashMap2.put(str3, Boolean.TRUE);
        q = hashMap2;
    }

    public sgp(RxResolver rxResolver, String str, boolean z) {
        super(rxResolver);
        this.l = str;
        this.o = z;
        Logger.b("Creating new CollectionEpisodesDataLoader", new Object[0]);
    }

    private String f() {
        String str = this.d ? "sp://core-collection/unstable/<username>/list/episodes/all" : this.e ? "sp://core-collection/unstable/<username>/list/episodes/offline" : "sp://core-collection/unstable/<username>/list/episodes/union";
        UriBuilder a2 = new UriBuilder(str).a(100).a(this.l).a(c()).a(this.j, this.k);
        a2.o = Format.PROTOBUF;
        if (this.m.isEmpty()) {
            a2.d = this.d;
            a2.b = this.e;
            a2.e = this.f;
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
        a2.h = this.o;
        return a2.a();
    }

    private Policy g() {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap(p.size() + this.n.size());
        hashMap.putAll(p);
        for (String put : this.n) {
            hashMap.put(put, Boolean.TRUE);
        }
        listPolicy.setListAttributes(hashMap);
        listPolicy.setShowAttributes(q);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        return new Policy(decorationPolicy);
    }

    public final Observable<vlb<vkv>> a() {
        return a(f(), g());
    }

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(f(), (Policy) jacksonModel);
    }

    public final vlb<vkv> a(byte[] bArr) {
        return this.e ? vmn.a(ProtoOfflinedEpisodesResponse.a(bArr)) : vmn.a(ProtoUnplayedEpisodesResponse.a(bArr));
    }

    public final xii<vlb<vkv>> a(int i, int i2) {
        a(Integer.valueOf(i), Integer.valueOf(i2));
        return e();
    }

    public final void a(jwn<vlb<vkv>> jwn) {
        a(f(), jwn, g());
    }

    public final byte[] a(vlb<vkv> vlb) {
        vkv[] vkvArr;
        if (!this.e) {
            return vmo.a(vlb).b();
        }
        ArrayList arrayList = new ArrayList(((vkv[]) vlb.getItems()).length);
        for (vkv vkv : (vkv[]) vlb.getItems()) {
            arrayList.add((ProtoOfflinedEpisodesRequestItem) ProtoOfflinedEpisodesRequestItem.t().a(vmo.a(vkv)).a(vmo.c(vkv)).a(vmo.b(vkv)).a((String) vmo.a(vkv.getHeader(), "")).g());
        }
        return ((ProtoOfflinedEpisodesResponse) ProtoOfflinedEpisodesResponse.l().a(vlb.getUnfilteredLength()).b(vlb.getUnrangedLength()).a(vlb.isLoading()).a((Iterable<? extends ProtoOfflinedEpisodesRequestItem>) arrayList).g()).b();
    }

    public final Observable<vlb<vkv>> b() {
        return b(f(), g());
    }

    public final void c(String str) {
        this.m.add(str);
    }

    public final void d(String str) {
        this.n.add(str);
    }

    public final xii<vlb<vkv>> e() {
        return wit.a((ObservableSource<T>) b(), BackpressureStrategy.BUFFER);
    }
}
