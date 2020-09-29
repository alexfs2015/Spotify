package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.churnlockedstate.ChurnLockedStateActivity;
import com.spotify.music.features.churnlockedstate.card.ChurnLockedStateCardDialogActivity;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: mhc reason: default package */
public final class mhc {
    final CompositeDisposable a = new CompositeDisposable();
    private final hgy b;
    private final hhc c;

    public mhc(hgy hgy, hhc hhc) {
        this.b = hgy;
        this.c = hhc;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            activity.startActivity(ChurnLockedStateCardDialogActivity.a((Context) activity));
        } else {
            b(activity);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Activity activity, Throwable th) {
        Logger.e(th, "Cannot fetch A/B flag", new Object[0]);
        b(activity);
    }

    private static void b(Activity activity) {
        activity.startActivity(ChurnLockedStateActivity.a((Context) activity));
    }

    public final void a(Activity activity) {
        this.a.a(this.b.a(mhj.a).a(this.c.c()).a((Consumer<? super T>) new $$Lambda$mhc$UfM7OD7dKGMqld_BcHhOrcXHydg<Object>(activity), (Consumer<? super Throwable>) new $$Lambda$mhc$sw7CO9y2_C6i7dXTu1c3fgCV1lo<Object>(activity)));
    }
}
