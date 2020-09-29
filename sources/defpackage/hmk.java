package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hmk reason: default package */
public final class hmk implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final hfi b;
    private final hfx c;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    public hmk(Context context, hfi hfi, hfx hfx) {
        this.a = context;
        this.b = hfi;
        this.c = hfx;
    }

    public final Result a(boolean z, Intent intent) {
        fay.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.session.LOGIN"));
        String str = "username";
        if (intent.hasExtra(str)) {
            String str2 = "password";
            if (intent.hasExtra(str2)) {
                this.b.d.a(intent.getStringExtra(str), intent.getStringExtra(str2));
                return Result.IGNORABLE;
            }
        }
        Context context = this.a;
        context.startActivity(this.c.a(context));
        return Result.IGNORABLE;
    }
}
