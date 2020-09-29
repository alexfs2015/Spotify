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

/* renamed from: uqb reason: default package */
public final class uqb {
    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(via via, upt upt, Completable completable) {
        Completable b = completable.a((SingleSource<T>) via.a(vic.a(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build()))).b();
        upt.getClass();
        return b.b((Action) new $$Lambda$1CF82W3y8NDiHCzLFF_qhMYETAY(upt));
    }

    private static ObservableTransformer<a, upy> a(unp unp, via via, upt upt, Scheduler scheduler) {
        return new $$Lambda$uqb$BGRfdDnRdmqwefBn0HqAr3UPBlk(unp, scheduler, via, upt);
    }

    public static ObservableTransformer<upx, upy> a(via via, unp unp, szp szp, upt upt, uqc uqc, uqh uqh, upd upd, Scheduler scheduler) {
        return kok.a().a(a.class, a(unp, via, upt, scheduler)).a(b.class, b(unp, via, upt, scheduler)).a(d.class, (Consumer<G>) new $$Lambda$uqb$KTYL_FooZUPvjil2weeaQ_i2kA<G>(szp), scheduler).a(c.class, (Consumer<G>) new $$Lambda$uqb$6EBug4Kucwt9QROu2VAdlaz78s<G>(upt), scheduler).a(e.class, a(uqh, upd, uqc), scheduler).a();
    }

    private static Consumer<e> a(uqh uqh, upd upd, uqc uqc) {
        return new $$Lambda$uqb$gT84mKK0xKAK3vtMjrPNOywSKow(uqh, uqc, upd);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uqc uqc, upd upd) {
        uqc.accept(new a());
        upd.a("confirm-end-session", "confirm-end-session-dialog", -1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uqh uqh, uqc uqc, upd upd, e eVar) {
        $$Lambda$uqb$uJJad4aP273skwECzLtMWca3nDU r3 = new $$Lambda$uqb$uJJad4aP273skwECzLtMWca3nDU(uqc, upd);
        upd.getClass();
        uqh.a((b) r3, (a) new $$Lambda$N_De5k2TXfQ_oKrQOZwpJbejdMQ(upd));
    }

    private static ObservableTransformer<b, upy> b(unp unp, via via, upt upt, Scheduler scheduler) {
        return new $$Lambda$uqb$JsNKEycWYJbp6DOlhLhxoT2HARo(unp, scheduler, via, upt);
    }
}
