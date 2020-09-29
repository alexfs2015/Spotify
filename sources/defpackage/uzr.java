package defpackage;

import android.content.Context;
import com.spotify.music.storylines.service.StorylinesFetcher;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: uzr reason: default package */
public final class uzr implements c {
    private final Context a;
    private final Flowable<fqn> b;
    private final SerialDisposable c = new SerialDisposable();

    public uzr(Context context, Flowable<fqn> flowable) {
        this.a = context;
        this.b = flowable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        StorylinesFetcher.a(this.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(fqn fqn) {
        return !uze.a(fqn);
    }

    public final void ai_() {
        this.c.a(this.b.a(Functions.a()).a((Predicate<? super T>) $$Lambda$uzr$jqJm7d65Xf_tEBVjDL5r0MrB1c.INSTANCE).c(1).c((Consumer<? super T>) new $$Lambda$uzr$3a2tiQxhdpDu4wEO51Oxq3c0I<Object>(this)));
    }

    public final void aj_() {
        this.c.a(Disposables.a());
    }

    public final String c() {
        return "Storylines";
    }
}
