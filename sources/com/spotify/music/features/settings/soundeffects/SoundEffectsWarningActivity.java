package com.spotify.music.features.settings.soundeffects;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

public class SoundEffectsWarningActivity extends lbm {
    public static final b<Object, Boolean> g = b.b("sound_effect_dialog_disabled");
    public jyg h;
    private qno i;
    private a j = new a() {
        public final void a() {
            SoundEffectsWarningActivity.this.finish();
        }

        public final void a(boolean z) {
            if (z) {
                SoundEffectsWarningActivity.this.h.b(SoundEffectsWarningActivity.this).a().a(SoundEffectsWarningActivity.g, true).b();
            }
            SoundEffectsWarningActivity.a((Activity) SoundEffectsWarningActivity.this);
        }
    };

    public static void a(final Activity activity) {
        fbp.a(activity);
        AnonymousClass2 r0 = new ResultReceiver(new Handler()) {
            /* access modifiers changed from: protected */
            public final void onReceiveResult(int i, Bundle bundle) {
                Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
                intent.putExtra("android.media.extra.AUDIO_SESSION", bundle.getInt("audio_session_id"));
                activity.startActivityForResult(intent, 0);
            }
        };
        Intent a = new hiu().a(activity, "com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION");
        a.putExtra("callback", r0);
        activity.startService(a);
    }

    public static boolean a(Context context) {
        boolean z;
        SpSharedPreferences b = ((jyg) gih.a(jyg.class)).b(context);
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        int length = systemSharedLibraryNames.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if ("com.sony.device".equals(systemSharedLibraryNames[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        return z || b.a(g, false);
    }

    public static void b(Context context) {
        Intent intent = new Intent(context, SoundEffectsWarningActivity.class);
        intent.addFlags(1073741824);
        intent.addFlags(65536);
        context.startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = qno.a((Context) this, this.j);
    }
}
