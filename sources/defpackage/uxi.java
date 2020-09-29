package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: uxi reason: default package */
public final class uxi {
    private final hxx a;
    private final Scheduler b;
    private final Context c;
    private final jyg d;

    public uxi(hxx hxx, Scheduler scheduler, Context context, jyg jyg) {
        this.a = hxx;
        this.b = scheduler;
        this.c = context;
        this.d = jyg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SpSharedPreferences a(SessionState sessionState) {
        return this.d.a(this.c, sessionState.currentUserName());
    }

    public final Flowable<Boolean> a() {
        return this.a.a.b((Predicate<? super T>) $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$uxi$sSZiQLITVWX70lUuQsLPmN41CKM<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$22267j7QmRDGDrx9ISpybJpws0.INSTANCE).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(this.b);
    }
}
