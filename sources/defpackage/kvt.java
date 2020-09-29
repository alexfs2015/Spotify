package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: kvt reason: default package */
public final class kvt implements Runnable {
    private xii<TracksAndResources> a;
    private kvg b;

    public kvt(xii<TracksAndResources> xii, kvg kvg) {
        this.a = xii;
        this.b = kvg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Optional optional) {
        return optional.b() ? xim.a((xim<T>) xly.a(Boolean.FALSE)) : this.a.h(new $$Lambda$kvt$qI6iMiRDm8RRAyswUfcsLnUXBzg(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(TracksAndResources tracksAndResources) {
        return this.b.a(tracksAndResources).b((xii<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
    }

    public final void run() {
        try {
            Logger.b("Behind the lyrics cache refreshed: %s", ((Boolean) xnn.a(this.b.a().b((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$kvt$jI3DNsk1kRIW1UbzdTb2Qc149w4<Object,Object>(this)).g($$Lambda$kvt$GS_AhkigCo2teta2yv1OgH1bvsc.INSTANCE).a(30, TimeUnit.SECONDS, (xii<? extends T>) ScalarSynchronousObservable.d(Boolean.FALSE))).a(Boolean.FALSE)).toString());
        } catch (Exception e) {
            Assertion.a("A crash happened while fetching BTL resources", (Throwable) e);
        }
    }
}
