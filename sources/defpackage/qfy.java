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

/* renamed from: qfy reason: default package */
public final class qfy {
    public CompositeDisposable a = new CompositeDisposable();
    private final Set<InputFieldIdentifier> b = EnumSet.noneOf(InputFieldIdentifier.class);
    private final ujc c;

    public qfy(ujc ujc) {
        this.c = ujc;
    }

    public final void a(Observable<Boolean> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        this.a.a(d(observable, inputFieldIdentifier, screenIdentifier));
    }

    public final void b(Observable<CharSequence> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        a(observable.c((Function<? super T, ? extends R>) $$Lambda$qfy$E71tBvUsNNy8B0YQDhoYuV2BNoA.INSTANCE), inputFieldIdentifier, screenIdentifier);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(CharSequence charSequence) {
        return Boolean.valueOf(charSequence != null && !charSequence.toString().trim().isEmpty());
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.a;
        if (compositeDisposable != null) {
            compositeDisposable.bf_();
        }
        this.a = new CompositeDisposable();
        b();
    }

    public final void b() {
        this.b.clear();
    }

    private Disposable d(Observable<Boolean> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        return observable.a((Consumer<? super T>) new $$Lambda$qfy$PWETdKtT0UH0yczcRCYEfUZ91Q<Object>(this, inputFieldIdentifier, screenIdentifier), (Consumer<? super Throwable>) $$Lambda$qfy$bikPO85MaQOXuAiEYb3OnAihYU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier, Boolean bool) {
        a(inputFieldIdentifier, screenIdentifier, bool.booleanValue());
    }

    public Disposable c(Observable<Calendar> observable, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        return observable.a((Consumer<? super T>) new $$Lambda$qfy$hpjoKj9vJeBvF429a8n1TFlYiQ<Object>(this, inputFieldIdentifier, screenIdentifier), (Consumer<? super Throwable>) $$Lambda$qfy$FRF4uEYauH5hwd45htWgtmbRs.INSTANCE);
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
}
