package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: um reason: default package */
public final class um extends uj<Boolean> {
    static {
        su.a("StorageNotLowTracker");
    }

    public um(Context context, vp vpVar) {
        super(context, vpVar);
    }

    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public final void a(Intent intent) {
        if (intent.getAction() != null) {
            su.a();
            String.format("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c != 0) {
                if (c == 1) {
                    a(Boolean.FALSE);
                }
                return;
            }
            a(Boolean.TRUE);
        }
    }

    public final /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, a());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c = 1;
        }
        if (c == 0) {
            return Boolean.TRUE;
        }
        if (c != 1) {
            return null;
        }
        return Boolean.FALSE;
    }
}
