package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.spotlets.share.ShareResultReceiver;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.music.R;
import io.reactivex.Completable;
import java.util.ArrayList;

/* renamed from: jdo reason: default package */
public final class jdo implements jcu {
    private final Context a;
    private final jbx b;

    public jdo(Context context, jbx jbx) {
        this.a = context;
        this.b = jbx;
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        shareEventLogger.a(jcc.b(), j);
        String a2 = jbx.a(jcc, jcc.a());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", a2);
        intent.setType(HttpConnection.kDefaultContentType);
        if (VERSION.SDK_INT >= 22) {
            Intent intent2 = new Intent(this.a, ShareResultReceiver.class);
            intent2.putExtra("session_id", shareEventLogger.b);
            intent2.putExtra("entity_uri", jcc.a().a());
            intent2.putExtra("context_uri", jcc.a().b());
            intent2.putExtra("source_page_uri", shareEventLogger.a);
            intent2.putExtra("destination_index", j);
            intent2.putStringArrayListExtra("test_groups", new ArrayList());
            activity.startActivity(Intent.createChooser(intent, this.a.getString(R.string.share_chooser_using), PendingIntent.getBroadcast(this.a, 0, intent2, 134217728).getIntentSender()));
        } else {
            activity.startActivity(Intent.createChooser(intent, this.a.getString(R.string.share_chooser_using)));
        }
        return Completable.a();
    }

    public /* synthetic */ Exception a(Context context, jdz jdz) {
        return CC.$default$a(this, context, jdz);
    }
}
