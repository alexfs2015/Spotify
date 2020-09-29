package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: hls reason: default package */
public final class hls implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final hhs b;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    hls(Context context, hhs hhs) {
        this.a = context;
        this.b = hhs;
    }

    public final Result a(boolean z, Intent intent) {
        String action = intent.getAction();
        fpt a2 = intent.hasExtra("FlagsArgumentHelper.Flags") ? fpu.a(intent) : null;
        char c = 65535;
        switch (action.hashCode()) {
            case 504694202:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_UNBAN")) {
                    c = 3;
                    break;
                }
                break;
            case 845198323:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_BAN")) {
                    c = 2;
                    break;
                }
                break;
            case 1806053908:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION")) {
                    c = 1;
                    break;
                }
                break;
            case 2089210024:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION")) {
                    c = 0;
                    break;
                }
                break;
        }
        String str = "context_source";
        String str2 = "uri";
        if (c == 0) {
            new kxj(this.a, ViewUris.bJ, a2).a(intent.getStringExtra(str2), intent.getStringExtra(str), false);
            this.b.a(ForceInCollection.YES);
        } else if (c == 1) {
            new kxj(this.a, ViewUris.bJ, a2).a(intent.getStringExtra(str2), false);
            this.b.a(ForceInCollection.NO);
        } else if (c == 2) {
            String stringExtra = intent.getStringExtra(str2);
            String stringExtra2 = intent.getStringExtra(str);
            if (!(stringExtra == null || stringExtra2 == null)) {
                new kxd(this.a, ViewUris.bJ, a2).a(stringExtra, stringExtra2, false);
            }
        } else if (c == 3) {
            String stringExtra3 = intent.getStringExtra(str2);
            String stringExtra4 = intent.getStringExtra(str);
            if (!(stringExtra3 == null || stringExtra4 == null)) {
                new kxd(this.a, ViewUris.bJ, a2).b(stringExtra3, stringExtra4, false);
            }
        }
        return Result.IGNORABLE;
    }
}
