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

/* renamed from: jdk reason: default package */
public final class jdk implements jcu {
    private final Context a;
    private final jbx b;
    private final a c;

    /* renamed from: jdk$a */
    public static class a {
    }

    public jdk(Context context, jbx jbx, a aVar) {
        this.a = context;
        this.b = jbx;
        this.c = aVar;
    }

    public final Completable a(Activity activity, jdz jdz, jcc jcc, ShareEventLogger shareEventLogger, long j) {
        String a2 = jbx.a(jcc, jcc.a());
        if (VERSION.SDK_INT >= 19) {
            Context context = this.a;
            Assertion.a((Object) context);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                shareEventLogger.c(jcc.b(), j);
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
        shareEventLogger.d(jcc.b(), j);
        Assertion.a((Object) a2);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        intent2.putExtra("sms_body", a2);
        activity.startActivity(Intent.createChooser(intent2, this.a.getString(R.string.share_chooser_sms)));
        return Completable.a();
    }

    public /* synthetic */ Exception a(Context context, jdz jdz) {
        return CC.$default$a(this, context, jdz);
    }
}
