package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.List;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: pmt reason: default package */
public final class pmt {
    private final gsp a;
    private final ioa b;

    public pmt(gsp gsp, ioa ioa) {
        this.a = gsp;
        this.b = ioa;
    }

    public final wuh<List<PlayerTrack>> a(String str) {
        return ScalarSynchronousObservable.d(jst.a(str)).i(new $$Lambda$pmt$dg0Vqb8Hz7jLWD13N3iqS5lphwg(this, str)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(String str, ios ios) {
        uzc[] uzcArr = (uzc[]) ios.getItems();
        ArrayList a2 = Lists.a(uzcArr.length);
        for (uzc uzc : uzcArr) {
            List artists = uzc.getArtists();
            if (artists != null && !artists.isEmpty()) {
                a2.add(PlayerTrack.create(uzc.getUri(), str, ((uyr) artists.get(0)).getUri()));
            }
        }
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str, jst jst) {
        if (jst.b == LinkType.ALBUM) {
            return wuh.a(new gso((gky) gsp.a(this.a.a.get(), 1), (String) gsp.a(jst.f(), 2)).a());
        } else if (jst.b == LinkType.COLLECTION_ALBUM) {
            return vun.a((ObservableSource<T>) this.b.a(str).a(), BackpressureStrategy.BUFFER).a(1).f(new $$Lambda$pmt$VMRIqW_LIxYXUwuRZMq9Eiuv6U(str));
        } else {
            StringBuilder sb = new StringBuilder("Unsupported album uri:");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
