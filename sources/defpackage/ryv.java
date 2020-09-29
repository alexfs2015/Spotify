package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateResponse;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import com.spotify.music.libs.podcast.loader.ShowUriBuilder;
import com.spotify.music.libs.podcast.loader.ShowUriBuilder.Format;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.List;

/* renamed from: ryv reason: default package */
public final class ryv extends BaseDataLoader<uys, uyy<uys>, Policy> implements rxh {
    private static final Double a = Double.valueOf(0.1d);
    private static final Policy l;
    private final boolean m;

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(f(), (Policy) jacksonModel);
    }

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap();
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
        listPolicy.setListAttributes(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str2, Boolean.TRUE);
        hashMap2.put(str, Boolean.TRUE);
        hashMap2.put("inCollection", Boolean.TRUE);
        hashMap2.put(str3, Boolean.TRUE);
        listPolicy.setShowAttributes(hashMap2);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        l = new Policy(decorationPolicy);
    }

    public ryv(RxResolver rxResolver, boolean z) {
        super(rxResolver);
        this.m = z;
    }

    public final SortOption c() {
        return new SortOption("lastPlayedAt DESC");
    }

    private String f() {
        ShowUriBuilder a2 = new ShowUriBuilder("sp://core-show/unstable/unfinished/episodes").a(100);
        a2.h = c();
        ShowUriBuilder a3 = a2.a(this.j, this.k);
        a3.n = Format.PROTOBUF;
        if (this.m) {
            a3.j = Integer.valueOf(30);
            a3.g = true;
            a3.p = true;
            a3.k = a;
            a3.l = Integer.valueOf(120);
            a3.m = Integer.valueOf(3);
            a3.q = Integer.valueOf(10);
        }
        return a3.a();
    }

    public final void a(juf<uyy<uys>> juf) {
        a(f(), juf, l);
    }

    public final Observable<uyy<uys>> a() {
        return a(f(), l);
    }

    public final Observable<uyy<uys>> b() {
        return b(f(), l);
    }

    public final uyy<uys> a(byte[] bArr) {
        return a(uzz.b(ProtoDecorateResponse.a(bArr)));
    }

    public final byte[] a(uyy<uys> uyy) {
        return vaa.a(uyy).b();
    }

    public final wud<uyy<uys>> e() {
        return vun.a((ObservableSource<T>) a(), BackpressureStrategy.BUFFER);
    }

    private static uyy<uys> a(final List<uys> list) {
        return new uyy<uys>() {
            public final boolean isLoading() {
                return false;
            }

            public final int getUnfilteredLength() {
                return list.size();
            }

            public final int getUnrangedLength() {
                return list.size();
            }

            public final /* synthetic */ Object[] getItems() {
                uys[] uysArr = new uys[list.size()];
                int i = 0;
                for (uys uys : list) {
                    uysArr[i] = uys;
                    i++;
                }
                return uysArr;
            }
        };
    }
}
