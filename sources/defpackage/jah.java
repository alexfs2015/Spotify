package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: jah reason: default package */
public final class jah implements jai {
    private final ixi a;

    public /* synthetic */ Exception a(Context context, jbn jbn) {
        return CC.$default$a(this, context, jbn);
    }

    public jah(ixi ixi) {
        this.a = ixi;
    }

    public final Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j) {
        ixi.a(R.string.play_on_spotify, Uri.parse(izq.c), activity);
        shareEventLogger.a(izq.b, jbn.c(), j);
        return Completable.a();
    }
}
