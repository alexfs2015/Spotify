package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hpc reason: default package */
public final class hpc implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final hie b;
    private final hit c;

    public hpc(Context context, hie hie, hit hit) {
        this.a = context;
        this.b = hie;
        this.c = hit;
    }

    public final Result a(boolean z, Intent intent) {
        fbp.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.session.LOGIN"));
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

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
