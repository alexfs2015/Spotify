package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.Completable;

/* renamed from: jaf reason: default package */
public final class jaf implements jai {
    private final Context a;
    private final iwo b;
    private final izm c;

    public /* synthetic */ Exception a(Context context, jbn jbn) {
        return CC.$default$a(this, context, jbn);
    }

    public jaf(Context context, iwo iwo, izm izm) {
        this.a = context;
        this.b = iwo;
        this.c = izm;
    }

    public final Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j) {
        if (jbn.d().b() && ((izq.a instanceof jcj) || (izq.a instanceof jci))) {
            a b2 = this.b.b((String) jbn.d().c());
            if (b2 != null) {
                shareEventLogger.a(izq.b, jbn.c(), j);
                Intent intent = new Intent(b2.b());
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", izm.a(izq, izq.a));
                intent.setType(HttpConnection.kDefaultContentType);
                this.a.startActivity(intent);
                return Completable.a();
            }
        }
        return Completable.a((Throwable) a(activity, jbn));
    }
}
