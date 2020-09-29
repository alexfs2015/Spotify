package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.Completable;

/* renamed from: jcs reason: default package */
public final class jcs implements jcu {
    private final izr a;

    public jcs(izr izr) {
        this.a = izr;
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        izr.a(activity, Uri.parse(jcc.c()));
        shareEventLogger.a(jcc.b(), jdz.d(), j);
        return Completable.a();
    }

    public /* synthetic */ Exception a(Context context, jdz jdz) {
        return CC.$default$a(this, context, jdz);
    }
}
