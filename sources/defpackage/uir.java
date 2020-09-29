package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.service.AppProtocolBluetoothService;

/* renamed from: uir reason: default package */
public final class uir implements a {
    private final uis a;

    public uir(uis uis) {
        this.a = uis;
    }

    public final void a(Intent intent) {
        uis uis = this.a;
        String stringExtra = intent.getStringExtra("remote_extra_data");
        if (stringExtra != null) {
            if (uis.c(stringExtra)) {
                String a2 = uis.a(stringExtra);
                String b = uis.b(stringExtra);
                if (a2 != null) {
                    uis.b.a(uis.a, AppProtocolBluetoothService.a(uis.a, a2, b), "TizenRemoteControlHelper", new Object[0]);
                } else {
                    Logger.e("has command to start app protocol server but no device address", new Object[0]);
                }
            } else {
                Logger.e("has remote_extra_data but no command to start app protocol server", new Object[0]);
            }
        }
    }
}
