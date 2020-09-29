package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.connection.OfflineState.State;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: gir reason: default package */
public final class gir {
    public final WebgateTokenProvider a;
    public final git b;
    public final gio c;
    public final SerialDisposable d = new SerialDisposable();
    public final SerialDisposable e = new SerialDisposable();
    private final gjp f;
    private final ura g;
    private final Observable<gcl> h;
    private final Scheduler i;

    public gir(WebgateTokenProvider webgateTokenProvider, git git, gjp gjp, gio gio, ura ura, Observable<gcl> observable, Scheduler scheduler) {
        this.a = webgateTokenProvider;
        this.b = git;
        this.f = gjp;
        this.c = gio;
        this.g = ura;
        this.h = observable;
        this.i = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        this.f.a = offlineState.offlineState() == State.FORCED_OFFLINE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gcl gcl) {
        this.a.a();
    }

    public final void a() {
        this.c.a();
        this.d.a(this.g.a.d((Consumer<? super T>) new $$Lambda$gir$tvGxyqXL6V9PypqP186l_uKNtjo<Object>(this)));
        this.e.a(this.h.a(this.i).d((Consumer<? super T>) new $$Lambda$gir$u7G3tfrsvkDTvql7M9onriualg<Object>(this)));
    }
}
