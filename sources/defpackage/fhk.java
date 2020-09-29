package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: fhk reason: default package */
public final class fhk implements fft {
    final fgm a;
    private final FirebaseApp b;
    private final fgg c;
    private final Executor d;

    public fhk(FirebaseApp firebaseApp, fgg fgg, Executor executor) {
        this(firebaseApp, fgg, executor, new fgm(firebaseApp.a(), fgg));
    }

    private fhk(FirebaseApp firebaseApp, fgg fgg, Executor executor, fgm fgm) {
        this.b = firebaseApp;
        this.c = fgg;
        this.a = fgm;
        this.d = executor;
    }

    public final boolean a() {
        return this.c.a() != 0;
    }

    public final exi<String> a(String str, String str2, String str3) {
        return b(a(str, str2, str3, new Bundle()));
    }

    public final exi<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    public final exi<Void> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    private final exi<Bundle> a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.b.b().a);
        bundle.putString("gmsv", Integer.toString(this.c.d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.c.b());
        bundle.putString("app_ver_name", this.c.c());
        bundle.putString("cliv", "fiid-12451000");
        exj exj = new exj();
        this.d.execute(new fhl(this, bundle, exj));
        return exj.a;
    }

    private final <T> exi<Void> a(exi<T> exi) {
        return exi.a(fhb.a(), (exd<TResult, TContinuationResult>) new fhm<TResult,TContinuationResult>());
    }

    private final exi<String> b(exi<Bundle> exi) {
        return exi.a(this.d, (exd<TResult, TContinuationResult>) new fhn<TResult,TContinuationResult>(this));
    }

    static /* synthetic */ String a(Bundle bundle) {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(LogMessage.SEVERITY_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                new Throwable();
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }
}
