package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: ero reason: default package */
final class ero implements Runnable {
    private final /* synthetic */ elm a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ ern c;

    ero(ern ern, elm elm, ServiceConnection serviceConnection) {
        this.c = ern;
        this.a = elm;
        this.b = serviceConnection;
    }

    public final void run() {
        erm erm = this.c.a;
        String a2 = this.c.b;
        elm elm = this.a;
        ServiceConnection serviceConnection = this.b;
        Bundle a3 = erm.a(a2, elm);
        erm.a.p().c();
        if (a3 != null) {
            long j = a3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                erm.a.q().c.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a3.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    erm.a.q().c.a("No referrer defined in install referrer response");
                } else {
                    erm.a.q().k.a("InstallReferrer API result", string);
                    evm e = erm.a.e();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a4 = e.a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a4 == null) {
                        erm.a.q().c.a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a4.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                erm.a.q().c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a4.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == erm.a.b().j.a()) {
                            erm.a.q().k.a("Campaign has already been logged");
                        } else {
                            erm.a.b().j.a(j);
                            String str2 = "referrer API";
                            erm.a.q().k.a("Logging Install Referrer campaign from sdk with ", str2);
                            a4.putString("_cis", str2);
                            erm.a.d().a("auto", "_cmp", a4);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            bzb.a();
            bzb.a(erm.a.m(), serviceConnection);
        }
    }
}
