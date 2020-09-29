package defpackage;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;

/* renamed from: jcq reason: default package */
public final class jcq implements jcu {
    private final jvf a;
    private final Scheduler b;

    public jcq(jvf jvf, Scheduler scheduler) {
        this.a = jvf;
        this.b = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.a((int) R.string.toast_copy_link, 1, new Object[0]);
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        if (clipboardManager == null) {
            return Completable.a((Throwable) a(activity, jdz));
        }
        shareEventLogger.b(jcc.b(), j);
        return Completable.a((Action) new $$Lambda$jcq$6Q4Bigtahl9KOt6PW1E7by4mUCI(activity, jcc, clipboardManager)).a(this.b).b((Action) new $$Lambda$jcq$6xCa5z7hrrkVeKnKdMgPR0Y4iQ8(this));
    }

    public /* synthetic */ Exception a(Context context, jdz jdz) {
        return CC.$default$a(this, context, jdz);
    }
}
