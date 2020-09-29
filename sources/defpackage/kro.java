package defpackage;

import android.util.LruCache;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.SingleSource;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: kro reason: default package */
public final class kro {
    private final krk a;
    private final LruCache<String, TrackAnnotationSet> b;

    private kro(krk krk, int i) {
        this.a = krk;
        this.b = new LruCache<>(10);
    }

    public kro(krk krk) {
        this(krk, 10);
    }

    public final wud<TrackAnnotationSet> a(PlayerTrack playerTrack) {
        String uri = playerTrack.uri();
        String substring = uri.substring(uri.lastIndexOf(58) + 1);
        TrackAnnotationSet trackAnnotationSet = (TrackAnnotationSet) this.b.get(substring);
        if (trackAnnotationSet == null) {
            return wuh.a(vun.a((SingleSource<T>) this.a.a(substring))).b((wun<? super T>) new $$Lambda$kro$Ajil7AqOsk9PN5p44xjbywtHlMw<Object>(this, substring));
        }
        return ScalarSynchronousObservable.d(trackAnnotationSet);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, TrackAnnotationSet trackAnnotationSet) {
        this.b.put(str, trackAnnotationSet);
    }
}
