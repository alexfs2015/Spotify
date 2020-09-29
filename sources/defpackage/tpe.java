package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: tpe reason: default package */
public final class tpe extends c implements a, tpd {
    private final iom a;
    private final wug b;
    private final tle c;
    private final tlc d;
    private final tkx e;
    private final gbl f;
    private final xag g = new xag();

    public tpe(tlc tlc, tkx tkx, iom iom, wug wug, a aVar, tle tle) {
        this.d = tlc;
        this.e = tkx;
        this.a = iom;
        this.b = wug;
        this.c = tle;
        this.f = gbl.a(new $$Lambda$tpe$vq6s1A8XBPBV9qPjyLnEX5NtQ(this, aVar));
        SortOption a2 = new SortOption("latestPublishedEpisodeDate", true).a(true);
        this.a.a = MediaType.VIDEO;
        this.a.c = a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a(this);
    }

    public final void b() {
        this.f.run();
    }

    public final void a(Bundle bundle) {
        this.a.a(bundle);
    }

    public final void c() {
        this.g.a(vun.a((ObservableSource<T>) this.a.b(), BackpressureStrategy.BUFFER).a(this.b).a((wue<? super T>) this.e));
        this.g.a(this.c.a().a(this.b).a((wun<? super T>) new $$Lambda$tpe$TBsEBYyUbe2xBfBp8jRevA24iM<Object>(this), (wun<Throwable>) $$Lambda$tpe$cJto18WDMmCVt1wQ0P_zzjtgJwA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tld tld) {
        this.d.a(tld.a());
    }

    public final void a() {
        this.g.a();
    }

    public final void onErrorStateButtonClick() {
        this.g.a();
        c();
    }
}
