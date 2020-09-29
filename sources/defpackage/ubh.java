package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: ubh reason: default package */
public final class ubh extends c implements a, ubg {
    private final iqz a;
    private final xil b;
    private final tww c;
    private final twu d;
    private final twp e;
    private final gcj f;
    private final xok g = new xok();

    public ubh(twu twu, twp twp, iqz iqz, xil xil, a aVar, tww tww) {
        this.d = twu;
        this.e = twp;
        this.a = iqz;
        this.b = xil;
        this.c = tww;
        this.f = gcj.a(new $$Lambda$ubh$k1CIUrd6DRU5EN9KbZuM_xTKDKo(this, aVar));
        SortOption a2 = new SortOption("latestPublishedEpisodeDate", true).a(true);
        this.a.a = MediaType.VIDEO;
        this.a.c = a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(twv twv) {
        this.d.a(twv.a());
    }

    public final void a() {
        this.g.a();
    }

    public final void a(Bundle bundle) {
        this.a.a(bundle);
    }

    public final void b() {
        this.f.run();
    }

    public final void c() {
        this.g.a(wit.a((ObservableSource<T>) this.a.b(), BackpressureStrategy.BUFFER).a(this.b).a((xij<? super T>) this.e));
        this.g.a(this.c.a().a(this.b).a((xis<? super T>) new $$Lambda$ubh$r6hhes0EggfVkefuR0n0DPynT40<Object>(this), (xis<Throwable>) $$Lambda$ubh$sjUqUB0J85wsSXfq17_fWaYw5ZA.INSTANCE));
    }

    public final void onErrorStateButtonClick() {
        this.g.a();
        c();
    }
}
