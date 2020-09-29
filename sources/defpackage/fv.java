package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: fv reason: default package */
public final class fv {
    private static volatile fu<?> a;

    public static boolean a(Context context, ft ftVar, final IntentSender intentSender) {
        boolean z;
        if (VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(ftVar.a(), intentSender);
        }
        String str = "com.android.launcher.action.INSTALL_SHORTCUT";
        if (VERSION.SDK_INT >= 26) {
            z = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        } else {
            String str2 = "com.android.launcher.permission.INSTALL_SHORTCUT";
            if (fr.b(context, str2) == 0) {
                Iterator it = context.getPackageManager().queryBroadcastReceivers(new Intent(str), 0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = ((ResolveInfo) it.next()).activityInfo.permission;
                    if (!TextUtils.isEmpty(str3)) {
                        if (str2.equals(str3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
            }
            z = false;
        }
        if (!z) {
            return false;
        }
        Intent a2 = ftVar.a(new Intent(str));
        if (intentSender == null) {
            context.sendBroadcast(a2);
            return true;
        }
        context.sendOrderedBroadcast(a2, null, new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                try {
                    intentSender.sendIntent(context, 0, null, null, null);
                } catch (SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }
}
