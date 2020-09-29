package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.service.AppProtocolBluetoothService;

/* renamed from: qvl reason: default package */
public final class qvl implements a {
    private final qvm a;

    public qvl(qvm qvm) {
        this.a = qvm;
    }

    public final void a(Intent intent) {
        qvm qvm = this.a;
        String stringExtra = intent.getStringExtra("remote_extra_data");
        if (stringExtra != null) {
            if (qvm.c(stringExtra)) {
                String a2 = qvm.a(stringExtra);
                String b = qvm.b(stringExtra);
                if (a2 != null) {
                    qvm.b.a(qvm.a, AppProtocolBluetoothService.a(qvm.a, a2, b), "TizenRemoteControlHelper", new Object[0]);
                } else {
                    Logger.e("has command to start app protocol server but no device address", new Object[0]);
                }
            } else {
                Logger.e("has remote_extra_data but no command to start app protocol server", new Object[0]);
            }
        }
    }
}
