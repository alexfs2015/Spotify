package defpackage;

import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: nxt reason: default package */
public final class nxt {
    public static ObservableTransformer<nxc, nxd> a(uwm uwm, kxi kxi, tcn tcn, rfy rfy, tin tin, Scheduler scheduler) {
        SkipToPrevTrackOptions build = SkipToPrevTrackOptions.builder().allowSeeking(Boolean.FALSE).build();
        tin.getClass();
        tcn.getClass();
        return klb.a().a(c.class, (ObservableTransformer<G, E>) new $$Lambda$nxt$ZkEPITJE426raK33wvRrPOEZDs<G,E>(uwm)).a(d.class, (ObservableTransformer<G, E>) new $$Lambda$nxt$1IjVma5Eb9rM3TdofyU5XP5D6c<G,E>(uwm)).a(e.class, (ObservableTransformer<G, E>) new $$Lambda$nxt$JfknEfp5le5z56zXwP9inywWqF8<G,E>(uwm)).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$nxt$V1RVnmkPnwJLtDqrAgP6vMJUMXo<G,E>(uwm, new j(SkipToPrevTrackCommand.builder().options(build).build()))).a(g.class, (Action) new $$Lambda$nxt$GHH0QR1A8HpN0yQvMNPr4xfiHEE(rfy)).a(h.class, (Action) new $$Lambda$F6tEpB_ZYNXZ6z2zqFYGmQZRWpw(tin)).a(a.class, (Consumer<G>) new $$Lambda$nxt$xapCzegZwwta0OwLnCjG0vATM<G>(kxi)).a(b.class, (Action) new $$Lambda$oPDdb6pwPit2G070KyyIfDnWUE0(tcn), scheduler).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kxi kxi, a aVar) {
        if (aVar.b.f()) {
            kxi.a(aVar.b.b(), true);
        } else {
            kxi.a(aVar.b.b(), aVar.a, true);
        }
    }
}
