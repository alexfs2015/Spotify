package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: ngp reason: default package */
public final class ngp {
    private final vid a;
    private final Scheduler b;

    public ngp(vid vid, Scheduler scheduler) {
        this.a = (vid) fbp.a(vid);
        this.b = (Scheduler) fbp.a(scheduler);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$ngp$j2Iq7HShDwucD62oNy5CUS3vbqI(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(k kVar) {
        String str = "Error with PlayerControls";
        if (kVar.a) {
            return this.a.a(new c()).b(this.b).c(vhy.a(str)).b().a((ObservableSource<T>) Observable.b(new g()));
        }
        return this.a.a(vic.a(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build())).c(vhy.a(str)).b().a((ObservableSource<T>) Observable.d());
    }

    public final ObservableTransformer<k, nge> a() {
        return new $$Lambda$ngp$uzAHXtEXApjfEInvRBzPe31sTN8(this);
    }
}
