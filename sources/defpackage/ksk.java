package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: ksk reason: default package */
public final class ksk implements Runnable {
    private wud<TracksAndResources> a;
    private krx b;

    public ksk(wud<TracksAndResources> wud, krx krx) {
        this.a = wud;
        this.b = krx;
    }

    public final void run() {
        try {
            Logger.b("Behind the lyrics cache refreshed: %s", ((Boolean) wzi.a(this.b.a().b((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$ksk$CFTugJjXsLgXkvEzviofyKgwAOs<Object,Object>(this)).h($$Lambda$ksk$BNAQxBBNbrL0nJT2IQOu6KsRRNY.INSTANCE).a(30, TimeUnit.SECONDS, (wud<? extends T>) ScalarSynchronousObservable.d(Boolean.FALSE))).a(Boolean.FALSE)).toString());
        } catch (Exception e) {
            Assertion.a("A crash happened while fetching BTL resources", (Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Optional optional) {
        if (optional.b()) {
            return wuh.a((wuh<T>) wxt.a(Boolean.FALSE));
        }
        return this.a.i(new $$Lambda$ksk$KB3pyCNSjdul2QoNL4La6KIhG0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(TracksAndResources tracksAndResources) {
        return this.b.a(tracksAndResources).b((wud<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
    }
}
