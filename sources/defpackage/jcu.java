package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: jcu reason: default package */
public interface jcu {

    /* renamed from: jcu$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Exception $default$a(jcu jcu, Context context, jdz jdz) {
            return new Exception(context.getString(R.string.toast_generic_share_broadcast_error, new Object[]{context.getString(jdz.b())}));
        }
    }

    Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j);

    Exception a(Context context, jdz jdz);
}
