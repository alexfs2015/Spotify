package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.churnlockedstate.ChurnLockedStateActivity;
import com.spotify.music.features.churnlockedstate.card.ChurnLockedStateCardDialogActivity;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: mcz reason: default package */
public final class mcz {
    final CompositeDisposable a = new CompositeDisposable();
    private final hec b;
    private final heg c;

    public mcz(hec hec, heg heg) {
        this.b = hec;
        this.c = heg;
    }

    public final void a(Activity activity) {
        this.a.a(this.b.a(mdg.a).a(this.c.c()).a((Consumer<? super T>) new $$Lambda$mcz$g25PTqgRsuptEeLOwF_guK90KTU<Object>(activity), (Consumer<? super Throwable>) new $$Lambda$mcz$YFHiA68hCX7Az90t6fbMXHWChtA<Object>(activity)));
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
}
