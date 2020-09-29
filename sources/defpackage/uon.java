package defpackage;

import android.content.Context;
import com.spotify.music.storylines.service.StorylinesFetcher;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: uon reason: default package */
public final class uon implements c {
    private final Context a;
    private final Flowable<fpt> b;
    private final SerialDisposable c = new SerialDisposable();

    public final String c() {
        return "Storylines";
    }

    public uon(Context context, Flowable<fpt> flowable) {
        this.a = context;
        this.b = flowable;
    }

    public final void ai_() {
        this.c.a(this.b.a(Functions.a()).a((Predicate<? super T>) $$Lambda$uon$VO0toyLndeE_Ej0866Y5dBDd4I0.INSTANCE).c(1).c((Consumer<? super T>) new $$Lambda$uon$2TaSKeHEP7H1H7SKLT931GqGec<Object>(this)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(fpt fpt) {
        return !uoa.a(fpt);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        StorylinesFetcher.a(this.a);
    }

    public final void aj_() {
        this.c.a(Disposables.a());
    }
}
