package defpackage;

import android.util.LruCache;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.SingleSource;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: kux reason: default package */
public final class kux {
    private final kut a;
    private final LruCache<String, TrackAnnotationSet> b;

    public kux(kut kut) {
        this(kut, 10);
    }

    private kux(kut kut, int i) {
        this.a = kut;
        this.b = new LruCache<>(10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, TrackAnnotationSet trackAnnotationSet) {
        this.b.put(str, trackAnnotationSet);
    }

    public final xii<TrackAnnotationSet> a(PlayerTrack playerTrack) {
        String uri = playerTrack.uri();
        String substring = uri.substring(uri.lastIndexOf(58) + 1);
        TrackAnnotationSet trackAnnotationSet = (TrackAnnotationSet) this.b.get(substring);
        return trackAnnotationSet == null ? xim.a(wit.a((SingleSource<T>) this.a.a(substring))).b((xis<? super T>) new $$Lambda$kux$5aDgAWeE4wPwa2DD9KXQ_ZTk07A<Object>(this, substring)) : ScalarSynchronousObservable.d(trackAnnotationSet);
    }
}
