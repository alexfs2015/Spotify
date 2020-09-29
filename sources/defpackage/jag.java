package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.Completable;

/* renamed from: jag reason: default package */
public final class jag implements jai {
    private final ixg a;

    public /* synthetic */ Exception a(Context context, jbn jbn) {
        return CC.$default$a(this, context, jbn);
    }

    public jag(ixg ixg) {
        this.a = ixg;
    }

    public final Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j) {
        ixg.a(activity, Uri.parse(izq.c));
        shareEventLogger.a(izq.b, jbn.c(), j);
        return Completable.a();
    }
}
