package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.Completable;

/* renamed from: jcr reason: default package */
public final class jcr implements jcu {
    private final Context a;
    private final iyz b;
    private final jbx c;

    public jcr(Context context, iyz iyz, jbx jbx) {
        this.a = context;
        this.b = iyz;
        this.c = jbx;
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        if (jdz.e().b() && ((jcc.a() instanceof jev) || (jcc.a() instanceof jeu))) {
            a b2 = this.b.b((String) jdz.e().c());
            if (b2 != null) {
                shareEventLogger.a(jcc.b(), jdz.d(), j);
                Intent intent = new Intent(b2.b());
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", jbx.a(jcc, jcc.a()));
                intent.setType(HttpConnection.kDefaultContentType);
                this.a.startActivity(intent);
                return Completable.a();
            }
        }
        return Completable.a((Throwable) a(activity, jdz));
    }

    public /* synthetic */ Exception a(Context context, jdz jdz) {
        return CC.$default$a(this, context, jdz);
    }
}
