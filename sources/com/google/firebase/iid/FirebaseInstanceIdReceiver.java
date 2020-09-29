package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;

public final class FirebaseInstanceIdReceiver extends kw {
    private static fha a;
    private static fha b;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                a(context, intent2, intent.getAction());
            } else {
                a(context, intent, intent.getAction());
            }
        }
    }

    private final void a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String str3 = "gcm.rawData64";
        String stringExtra = intent.getStringExtra(str3);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(str3);
        }
        String str4 = "com.google.firebase.MESSAGING_EVENT";
        String str5 = "com.google.firebase.INSTANCE_ID_EVENT";
        if ("google.com/iid".equals(intent.getStringExtra("from")) || str5.equals(str)) {
            str2 = str5;
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || str4.equals(str)) {
            str2 = str4;
        }
        int i = -1;
        if (str2 != null) {
            i = a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    private static int a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = bzo.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return b(broadcastReceiver, context, str, intent);
        }
        int b2 = fgo.a().b(context, str, intent);
        if (!bzo.i() || b2 != 402) {
            return b2;
        }
        b(broadcastReceiver, context, str, intent);
        return 403;
    }

    private static int b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "Binding to service: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        a(context, str).a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    private static synchronized fha a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (b == null) {
                    b = new fha(context, str);
                }
                fha fha = b;
                return fha;
            }
            if (a == null) {
                a = new fha(context, str);
            }
            fha fha2 = a;
            return fha2;
        }
    }
}
