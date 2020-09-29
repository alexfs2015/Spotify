package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: udg reason: default package */
public final class udg {
    public static ObservableTransformer<udc, udd> a(uwj uwj, uau uau, spi spi, ucy ucy, udh udh, udm udm, uci uci, Scheduler scheduler) {
        return klb.a().a(a.class, a(uau, uwj, ucy, scheduler)).a(b.class, b(uau, uwj, ucy, scheduler)).a(d.class, (Consumer<G>) new $$Lambda$udg$4anYvtegzPy79yHmd8QvvWhVZVI<G>(spi), scheduler).a(c.class, (Consumer<G>) new $$Lambda$udg$fjylqnJCKLxfDJK3_b1X3WKQt4<G>(ucy), scheduler).a(e.class, a(udm, uci, udh), scheduler).a();
    }

    private static ObservableTransformer<a, udd> a(uau uau, uwj uwj, ucy ucy, Scheduler scheduler) {
        return new $$Lambda$udg$bzXU5nnUQqUPJOwvSXPyVjsZoU(uau, scheduler, uwj, ucy);
    }

    private static ObservableTransformer<b, udd> b(uau uau, uwj uwj, ucy ucy, Scheduler scheduler) {
        return new $$Lambda$udg$k8jZCYPVIaYMabiE5h1eIhE6Flw(uau, scheduler, uwj, ucy);
    }

    private static Consumer<e> a(udm udm, uci uci, udh udh) {
        return new $$Lambda$udg$thsymz4u9oT4Snq_ET14na6F8(udm, udh, uci);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(udm udm, udh udh, uci uci, e eVar) {
        $$Lambda$udg$B0tOLr8MZkOroCoCuXWk5Oe99VU r3 = new $$Lambda$udg$B0tOLr8MZkOroCoCuXWk5Oe99VU(udh, uci);
        uci.getClass();
        udm.a((b) r3, (a) new $$Lambda$gqAc0SXuJfdYvLZv3vc_LYt_3G4(uci));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(uwj uwj, ucy ucy, Completable completable) {
        Completable b = completable.a((SingleSource<T>) uwj.a(uwl.a(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build()))).b();
        ucy.getClass();
        return b.b((Action) new $$Lambda$GYjSHNLjGBLbVRHOOkLRxayQ5ho(ucy));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(udh udh, uci uci) {
        udh.accept(new a());
        uci.a("confirm-end-session", "confirm-end-session-dialog", -1);
    }
}
