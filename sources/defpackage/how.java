package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import com.spotify.mobile.android.ui.activity.NotificationWebViewActivity;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.web.RxWebToken;

/* renamed from: how reason: default package */
public final class how implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final RxWebToken b;
    private final jvf c;
    private final vpu d;

    public how(Context context, RxWebToken rxWebToken, jvf jvf, vpu vpu) {
        this.a = context;
        this.b = rxWebToken;
        this.c = jvf;
        this.d = vpu;
    }

    public final Result a(boolean z, Intent intent) {
        Intent intent2;
        Uri data = intent.getData();
        Intent intent3 = (Intent) intent.getParcelableExtra("log_intent");
        Context context = this.a;
        RxWebToken rxWebToken = this.b;
        jvf jvf = this.c;
        if (data != null) {
            jva a2 = jva.a(data.toString());
            if (a2.b == LinkType.PUSH_NOTIFICATION_WEBVIEW) {
                intent2 = NotificationWebViewActivity.a(context, a2);
            } else if (a2.b != LinkType.DUMMY) {
                intent2 = kpo.a(context, data.toString()).a;
            } else {
                a a3 = hld.a(data);
                Uri uri = a3.b;
                if (a3.a) {
                    new b(context, rxWebToken, uri, jvf);
                    intent2 = null;
                } else {
                    intent2 = new Intent("android.intent.action.VIEW", uri);
                }
            }
        } else {
            intent2 = kpo.a(context).a;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
        if (intent3 != null) {
            this.a.startService(intent3);
        }
        if (this.d.a(intent)) {
            this.d.b(intent);
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
