package defpackage;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;

/* renamed from: jae reason: default package */
public final class jae implements jai {
    private final jsz a;
    private final Scheduler b;

    public /* synthetic */ Exception a(Context context, jbn jbn) {
        return CC.$default$a(this, context, jbn);
    }

    public jae(jsz jsz, Scheduler scheduler) {
        this.a = jsz;
        this.b = scheduler;
    }

    public final Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j) {
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        if (clipboardManager == null) {
            return Completable.a((Throwable) a(activity, jbn));
        }
        shareEventLogger.b(izq.b, j);
        return Completable.a((Action) new $$Lambda$jae$tl6y5nvhORxIiL_aGDvPDEob6ro(activity, izq, clipboardManager)).a(this.b).b((Action) new $$Lambda$jae$NXiowDFwFM0ZRSMZeCnxP5ONbhA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.a((int) R.string.toast_copy_link, 1, new Object[0]);
    }
}
