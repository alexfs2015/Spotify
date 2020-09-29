package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: jct reason: default package */
public final class jct implements jcu {
    private final izt a;

    public jct(izt izt) {
        this.a = izt;
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        izt.a(R.string.play_on_spotify, Uri.parse(jcc.c()), activity);
        shareEventLogger.a(jcc.b(), jdz.d(), j);
        return Completable.a();
    }

    public /* synthetic */ Exception a(Context context, jdz jdz) {
        return CC.$default$a(this, context, jdz);
    }
}
