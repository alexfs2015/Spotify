package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
public class FirebaseInstanceIdService extends fhn {
    public final Intent a(Intent intent) {
        return (Intent) fhi.a().a.poll();
    }

    public final void b(Intent intent) {
        if (!"com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.a().g();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId a = FirebaseInstanceId.a();
                    FirebaseInstanceId.a.c("");
                    a.c();
                }
            }
        }
    }
}
