package com.spotify.music.spotlets.tracker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

public class InstallReferrerReceiver extends vtm {
    private static final b<Object, String> b = b.a("install_referrer");
    public jvy a;

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
        if (!jst.a(sb2).l()) {
            z = false;
        } else {
            a(context, sb2);
        }
        if (!z) {
            a(context, string, (jvy) fay.a(this.a));
            Logger.a("Delegate install referrer intent to Adjust SDK", new Object[0]);
            new vj().onReceive(context, intent);
            if (string != null) {
                int indexOf = string.indexOf(63);
                if (indexOf >= 0) {
                    string = string.substring(0, indexOf);
                }
                if (jst.a(string).b != LinkType.DUMMY) {
                    a(context, string);
                }
            }
        }
    }

    private static void a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) fay.a(str)));
        intent.setFlags(335544320);
        intent.setClassName(context, "com.spotify.music.MainActivity");
        context.startActivity(intent);
    }

    private static void a(Context context, String str, jvy jvy) {
        jvy.a(context).a().a(b, str).a();
        Logger.b("Stored install referrer [%s]", str);
    }

    public static void a(Context context, jvy jvy) {
        String a2 = ((jvy) fay.a(jvy)).a((Context) fay.a(context)).a(b, "");
        Logger.b("Loaded install referrer: [%s]", a2);
        if (!fax.a(a2)) {
            a(context, null, jvy);
        }
    }
}
