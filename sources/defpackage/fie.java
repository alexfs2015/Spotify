package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: fie reason: default package */
public final class fie implements fgn {
    final fhg a;
    private final FirebaseApp b;
    private final fha c;
    private final Executor d;

    public fie(FirebaseApp firebaseApp, fha fha, Executor executor) {
        this(firebaseApp, fha, executor, new fhg(firebaseApp.a(), fha));
    }

    private fie(FirebaseApp firebaseApp, fha fha, Executor executor, fhg fhg) {
        this.b = firebaseApp;
        this.c = fha;
        this.a = fhg;
        this.d = executor;
    }

    private final <T> exz<Void> a(exz<T> exz) {
        return exz.a(fhv.a(), (exu<TResult, TContinuationResult>) new fig<TResult,TContinuationResult>());
    }

    private final exz<Bundle> a(String str, String str2, String str3, Bundle bundle) {
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
        eya eya = new eya();
        this.d.execute(new fif(this, bundle, eya));
        return eya.a;
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

    private final exz<String> b(exz<Bundle> exz) {
        return exz.a(this.d, (exu<TResult, TContinuationResult>) new fih<TResult,TContinuationResult>(this));
    }

    public final exz<String> a(String str, String str2, String str3) {
        return b(a(str, str2, str3, new Bundle()));
    }

    public final boolean a() {
        return this.c.a() != 0;
    }

    public final exz<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    public final exz<Void> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }
}
