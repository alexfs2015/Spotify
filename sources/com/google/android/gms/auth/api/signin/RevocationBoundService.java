package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction())) {
            if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
                String str = "Unknown action sent to RevocationBoundService: ";
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                return null;
            }
        }
        if (Log.isLoggable("RevocationService", 2)) {
            String str2 = "RevocationBoundService handling ";
            String valueOf2 = String.valueOf(intent.getAction());
            if (valueOf2.length() != 0) {
                str2.concat(valueOf2);
            } else {
                new String(str2);
            }
        }
        return new bnj(this);
    }
}
