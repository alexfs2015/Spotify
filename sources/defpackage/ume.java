package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: ume reason: default package */
public final class ume {
    private final hvl a;
    private final Scheduler b;
    private final Context c;
    private final jvy d;

    public ume(hvl hvl, Scheduler scheduler, Context context, jvy jvy) {
        this.a = hvl;
        this.b = scheduler;
        this.c = context;
        this.d = jvy;
    }

    public final Flowable<Boolean> a() {
        return this.a.a.b((Predicate<? super T>) $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$ume$MSS8IfEbEL60nvkh7QC8GpVzdk<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$yOFGLe5q_EkM5UTbMe9TThE5dxQ.INSTANCE).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SpSharedPreferences a(SessionState sessionState) {
        return this.d.a(this.c, sessionState.currentUserName());
    }
}
