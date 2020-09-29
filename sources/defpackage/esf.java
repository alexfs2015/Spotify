package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: esf reason: default package */
final class esf implements Runnable {
    private final /* synthetic */ emd a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ ese c;

    esf(ese ese, emd emd, ServiceConnection serviceConnection) {
        this.c = ese;
        this.a = emd;
        this.b = serviceConnection;
    }

    public final void run() {
        esd esd = this.c.a;
        String a2 = this.c.b;
        emd emd = this.a;
        ServiceConnection serviceConnection = this.b;
        Bundle a3 = esd.a(a2, emd);
        esd.a.p().c();
        if (a3 != null) {
            long j = a3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                esd.a.q().c.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a3.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    esd.a.q().c.a("No referrer defined in install referrer response");
                } else {
                    esd.a.q().k.a("InstallReferrer API result", string);
                    ewd e = esd.a.e();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a4 = e.a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a4 == null) {
                        esd.a.q().c.a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a4.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                esd.a.q().c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a4.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == esd.a.b().j.a()) {
                            esd.a.q().k.a("Campaign has already been logged");
                        } else {
                            esd.a.b().j.a(j);
                            String str2 = "referrer API";
                            esd.a.q().k.a("Logging Install Referrer campaign from sdk with ", str2);
                            a4.putString("_cis", str2);
                            esd.a.d().a("auto", "_cmp", a4);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            bzs.a();
            bzs.a(esd.a.m(), serviceConnection);
        }
    }
}
