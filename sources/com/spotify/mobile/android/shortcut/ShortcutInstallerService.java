package com.spotify.mobile.android.shortcut;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;

public class ShortcutInstallerService extends vto {
    public hvo a;

    public ShortcutInstallerService() {
        super("ShortcutInstallerService");
    }

    public static void a(Context context, String str, String str2, String str3, sih sih) {
        Intent intent = new Intent(context, ShortcutInstallerService.class);
        intent.setAction("install_shortcut");
        intent.putExtra("uri", str);
        intent.putExtra("title", str2);
        intent.putExtra("image_uri", str3);
        intent.putExtra("source_view_uri", sih);
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            if ("install_shortcut".equals(intent.getAction())) {
                hvo hvo = this.a;
                String stringExtra = intent2.getStringExtra("uri");
                String stringExtra2 = intent2.getStringExtra("title");
                String stringExtra3 = intent2.getStringExtra("image_uri");
                sih sih = (sih) intent2.getParcelableExtra("source_view_uri");
                try {
                    fv.a(hvo.a, new a(hvo.a, stringExtra).a(hvu.a(stringExtra, "context_shortcut")).a(IconCompat.a(hvo.b.a(stringExtra3).h())).a((CharSequence) stringExtra2).a(), hvo.d);
                    jjf jjf = hvo.c;
                    bh bhVar = r4;
                    bh bhVar2 = new bh(null, "com.spotify.feature.shortcut", sih.toString(), null, 0, stringExtra, "hit", "install_shortcut", (double) hvo.e.a());
                    jjf.a(bhVar);
                    return;
                } catch (IOException e) {
                    Assertion.a("Failed to load image for shortcut, not installing...", (Throwable) e);
                }
            }
        }
    }
}
