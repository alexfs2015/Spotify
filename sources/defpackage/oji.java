package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: oji reason: default package */
public final class oji {
    public CompositeDisposable a = new CompositeDisposable();
    private final Set<InputFieldIdentifier> b = EnumSet.noneOf(InputFieldIdentifier.class);
    private final uun c;

    public oji(uun uun) {
        this.c = uun;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(CharSequence charSequence) {
        return Boolean.valueOf(charSequence != null && !charSequence.toString().trim().isEmpty());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier, Boolean bool) {
        a(inputFieldIdentifier, screenIdentifier, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier, Calendar calendar) {
        a(inputFieldIdentifier, screenIdentifier, true);
    }

    private void a(InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier, boolean z) {
        if (z && !this.b.contains(inputFieldIdentifier)) {
            this.b.add(inputFieldIdentifier);
            Logger.a("FieldInteraction - Tracking interaction %s:%s", screenIdentifier, inputFieldIdentifier);
            this.c.a(screenIdentifier, inputFieldIdentifier);
        }
    }

    private Disposable d(Observable<Boolean> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        return observable.a((Consumer<? super T>) new $$Lambda$oji$lh7MLlY8LRSqVRCzCfRcWDA50E<Object>(this, inputFieldIdentifier, screenIdentifier), (Consumer<? super Throwable>) $$Lambda$oji$_tk_kYSd9ROnGd86wHm29iN489g.INSTANCE);
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.a;
        if (compositeDisposable != null) {
            compositeDisposable.bd_();
        }
        this.a = new CompositeDisposable();
        b();
    }

    public final void a(Observable<Boolean> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        this.a.a(d(observable, inputFieldIdentifier, screenIdentifier));
    }

    public final void b() {
        this.b.clear();
    }

    public final void b(Observable<CharSequence> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        a(observable.c((Function<? super T, ? extends R>) $$Lambda$oji$cBypFJP41o6PgmWuxDtpp8A6w5E.INSTANCE), inputFieldIdentifier, screenIdentifier);
    }

    public Disposable c(Observable<Calendar> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        return observable.a((Consumer<? super T>) new $$Lambda$oji$xM7hGDkk4bjaOTsUoYdnydypVBo<Object>(this, inputFieldIdentifier, screenIdentifier), (Consumer<? super Throwable>) $$Lambda$oji$g48SthEPOY1LvACEjj677l3x8_8.INSTANCE);
    }
}
