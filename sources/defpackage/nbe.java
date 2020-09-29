package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: nbe reason: default package */
public final class nbe {
    private final uwm a;
    private final Scheduler b;

    public nbe(uwm uwm, Scheduler scheduler) {
        this.a = (uwm) fay.a(uwm);
        this.b = (Scheduler) fay.a(scheduler);
    }

    public final ObservableTransformer<j, naw> a() {
        return new $$Lambda$nbe$zqnWPRNMQlt0uwNWDp7Yp7j3b9g(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$nbe$HIvvxHmE5WIm2yY6Yz_PBa7ed50(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(j jVar) {
        String str = "Error with PlayerControls";
        if (jVar.a) {
            return this.a.a(new c()).b(this.b).c(uwi.a(str)).b().a((ObservableSource<T>) Observable.b(new g()));
        }
        return this.a.a(uwl.a(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build())).c(uwi.a(str)).b().a((ObservableSource<T>) Observable.d());
    }
}
