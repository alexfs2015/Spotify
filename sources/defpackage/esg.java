package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: esg reason: default package */
public final class esg {
    private final esj a;

    public esg(esj esj) {
        bxo.a(esj);
        this.a = esj;
    }

    public static boolean a(Context context) {
        bxo.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        esp a2 = esp.a(context, (eri) null);
        ern q = a2.q();
        if (intent == null) {
            q.f.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        q.k.a("Local receiver got", action);
        String str = "com.google.android.gms.measurement.UPLOAD";
        if (str.equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction(str);
            q.k.a("Starting wakeful intent.");
            this.a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a2.p().a((Runnable) new esh(a2, q));
            } catch (Exception e) {
                q.f.a("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult a3 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                q.k.a("Install referrer extras are null");
                if (a3 != null) {
                    a3.finish();
                }
                return;
            }
            q.i.a("Install referrer extras are", stringExtra);
            String str2 = "?";
            if (!stringExtra.contains(str2)) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            Bundle a4 = a2.e().a(Uri.parse(stringExtra));
            if (a4 == null) {
                q.k.a("No campaign defined in install referrer broadcast");
                if (a3 != null) {
                    a3.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    q.f.a("Install referrer is missing timestamp");
                }
                esl p = a2.p();
                esi esi = new esi(a2, longExtra, a4, context, q, a3);
                p.a((Runnable) esi);
            }
        }
    }
}
