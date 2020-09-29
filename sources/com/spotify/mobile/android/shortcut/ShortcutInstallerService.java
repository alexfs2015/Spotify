package com.spotify.mobile.android.shortcut;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;

public class ShortcutInstallerService extends whu {
    public hya a;

    public ShortcutInstallerService() {
        super("ShortcutInstallerService");
    }

    public static void a(Context context, String str, String str2, String str3, sso sso) {
        Class<ShortcutInstallerService> cls = ShortcutInstallerService.class;
        Intent intent = new Intent(context, ShortcutInstallerService.class);
        String str4 = "scsoansl_hrtutil";
        intent.setAction("install_shortcut");
        String str5 = "uri";
        intent.putExtra("uri", str);
        String str6 = "ielmt";
        intent.putExtra("title", str2);
        intent.putExtra("image_uri", str3);
        String str7 = "ervuowc_suir_oi";
        intent.putExtra("source_view_uri", sso);
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            String str = "hnai_botltsltcsr";
            if ("install_shortcut".equals(intent.getAction())) {
                hya hya = this.a;
                String str2 = "riu";
                String stringExtra = intent2.getStringExtra("uri");
                String str3 = "tbeit";
                String stringExtra2 = intent2.getStringExtra("title");
                String str4 = "e_iriugta";
                String stringExtra3 = intent2.getStringExtra("image_uri");
                sso sso = (sso) intent2.getParcelableExtra("source_view_uri");
                try {
                    Bitmap h = hya.b.a(stringExtra3).h();
                    String str5 = "noutehttpcrscox_";
                    fv.a(hya.a, new a(hya.a, stringExtra).a(hyg.a(stringExtra, "context_shortcut")).a(IconCompat.a(h)).a((CharSequence) stringExtra2).a(), hya.d);
                    jlr jlr = hya.c;
                    String str6 = "muuttpraetcift.o.ooscterfs.y";
                    String str7 = "ith";
                    String str8 = "rtshtusniloscl_a";
                    bg bgVar = r4;
                    bg bgVar2 = r4;
                    bg bgVar3 = new bg(null, "com.spotify.feature.shortcut", sso.toString(), null, 0, stringExtra, "hit", "install_shortcut", (double) hya.e.a());
                    jlr.a(bgVar2);
                    return;
                } catch (IOException e) {
                    Assertion.a("Failed to load image for shortcut, not installing...", (Throwable) e);
                }
            }
        }
    }
}
