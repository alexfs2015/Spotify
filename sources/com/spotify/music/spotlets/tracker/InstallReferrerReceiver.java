package com.spotify.music.spotlets.tracker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

public class InstallReferrerReceiver extends whs {
    private static final b<Object, String> b = b.a("install_referrer");
    public jyg a;

    private static void a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) fbp.a(str)));
        intent.setFlags(335544320);
        intent.setClassName(context, "com.spotify.music.MainActivity");
        context.startActivity(intent);
    }

    private static void a(Context context, String str, jyg jyg) {
        jyg.a(context).a().a(b, str).a();
        Logger.b("Stored install referrer [%s]", str);
    }

    public static void a(Context context, jyg jyg) {
        String a2 = ((jyg) fbp.a(jyg)).a((Context) fbp.a(context)).a(b, "");
        Logger.b("Loaded install referrer: [%s]", a2);
        if (!fbo.a(a2)) {
            a(context, null, jyg);
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Logger.b("Install referrer detected", new Object[0]);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Assertion.b("Intent's extras is null");
            return;
        }
        String str = "referrer";
        if (!extras.containsKey(str)) {
            Assertion.b("Intent has no referrer extra");
            return;
        }
        String string = extras.getString(str);
        boolean z = true;
        Logger.b("Install referrer %s", string);
        StringBuilder sb = new StringBuilder("https://r.spotify.com/");
        sb.append(Uri.decode(string));
        String sb2 = sb.toString();
        if (!jva.a(sb2).l()) {
            z = false;
        } else {
            a(context, sb2);
        }
        if (!z) {
            a(context, string, (jyg) fbp.a(this.a));
            Logger.a("Delegate install referrer intent to Adjust SDK", new Object[0]);
            new vx().onReceive(context, intent);
            if (string != null) {
                int indexOf = string.indexOf(63);
                if (indexOf >= 0) {
                    string = string.substring(0, indexOf);
                }
                if (jva.a(string).b != LinkType.DUMMY) {
                    a(context, string);
                }
            }
        }
    }
}
