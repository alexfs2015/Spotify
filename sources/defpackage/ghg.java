package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.connection.OfflineState.State;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ghg reason: default package */
public final class ghg {
    public final WebgateTokenProvider a;
    public final ghi b;
    public final ghd c;
    public final SerialDisposable d = new SerialDisposable();
    public final SerialDisposable e = new SerialDisposable();
    private final gie f;
    private final ufm g;
    private final Observable<gbn> h;
    private final Scheduler i;

    public ghg(WebgateTokenProvider webgateTokenProvider, ghi ghi, gie gie, ghd ghd, ufm ufm, Observable<gbn> observable, Scheduler scheduler) {
        this.a = webgateTokenProvider;
        this.b = ghi;
        this.f = gie;
        this.c = ghd;
        this.g = ufm;
        this.h = observable;
        this.i = scheduler;
    }

    public final void a() {
        this.c.a();
        this.d.a(this.g.a.d((Consumer<? super T>) new $$Lambda$ghg$B3tAvn1tK6gZdf8Q2UH6VU2bbk<Object>(this)));
        this.e.a(this.h.a(this.i).d((Consumer<? super T>) new $$Lambda$ghg$vauJRMajcy7kfKEJzHxDBbt33GM<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        this.f.a = offlineState.offlineState() == State.FORCED_OFFLINE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gbn gbn) {
        this.a.a();
    }
}
