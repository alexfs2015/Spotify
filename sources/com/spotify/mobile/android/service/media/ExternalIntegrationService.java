package com.spotify.mobile.android.service.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;

public class ExternalIntegrationService extends whv {
    public hqd a;

    public static void a(Context context) {
        String str = "etsrixcogaenetl.overrEtseSevrIiSnapict";
        Logger.b("ExternalIntegrationService.stopService", new Object[0]);
        String str2 = "IodmdOetcy.riiTeNoCaEOCCSrTbSNsl.oiep_mNsiAINo.d_m.vD.CceiTmEf.nIL";
        mh.a(context).a(new Intent("com.spotify.mobile.android.service.media.ACTION_DISCONNECT_CLIENTS"));
    }

    public IBinder onBind(Intent intent) {
        return this.a.c();
    }

    public void onCreate() {
        super.onCreate();
        String str = "raenoeeavetocSnor.atgEInelnixCrtrit";
        Logger.a("ExternalIntegrationService.onCreate", new Object[0]);
        this.a.a();
    }

    public void onDestroy() {
        super.onDestroy();
        String str = "eIanebrxtaiDirnvSorteysgtctonelr.enE";
        Logger.b("ExternalIntegrationService.onDestroy", new Object[0]);
        this.a.b();
    }
}
