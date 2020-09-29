package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: jai reason: default package */
public interface jai {

    /* renamed from: jai$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Exception $default$a(jai _this, Context context, jbn jbn) {
            return new Exception(context.getString(R.string.toast_generic_share_broadcast_error, new Object[]{context.getString(jbn.b())}));
        }
    }

    Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j);

    Exception a(Context context, jbn jbn);
}
