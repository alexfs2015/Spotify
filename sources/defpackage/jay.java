package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: jay reason: default package */
public final class jay implements jai {
    private final Context a;
    private final izm b;
    private final a c;

    /* renamed from: jay$a */
    public static class a {
    }

    public /* synthetic */ Exception a(Context context, jbn jbn) {
        return CC.$default$a(this, context, jbn);
    }

    public jay(Context context, izm izm, a aVar) {
        this.a = context;
        this.b = izm;
        this.c = aVar;
    }

    public final Completable a(Activity activity, jbn jbn, izq izq, ShareEventLogger shareEventLogger, long j) {
        String a2 = izm.a(izq, izq.a);
        if (VERSION.SDK_INT >= 19) {
            Context context = this.a;
            Assertion.a((Object) context);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                shareEventLogger.c(izq.b, j);
                Assertion.a((Object) defaultSmsPackage);
                Assertion.a((Object) a2);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType(HttpConnection.kDefaultContentType);
                intent.putExtra("android.intent.extra.TEXT", a2);
                intent.setPackage(defaultSmsPackage);
                activity.startActivity(intent);
                return Completable.a();
            }
        }
        shareEventLogger.d(izq.b, j);
        Assertion.a((Object) a2);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        intent2.putExtra("sms_body", a2);
        activity.startActivity(Intent.createChooser(intent2, this.a.getString(R.string.share_chooser_sms)));
        return Completable.a();
    }
}
