package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* renamed from: fhl reason: default package */
public final class fhl implements Runnable {
    private final long a;
    private final WakeLock b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private final FirebaseInstanceId c;
    private final fha d;
    private final fho e;

    public fhl(FirebaseInstanceId firebaseInstanceId, fha fha, fho fho, long j) {
        this.c = firebaseInstanceId;
        this.d = fha;
        this.e = fho;
        this.a = j;
        this.b.setReferenceCounted(false);
    }

    private final boolean c() {
        try {
            FirebaseInstanceId firebaseInstanceId = this.c;
            return true;
        } catch (IOException e2) {
            String str = "Build channel failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return false;
        }
    }

    private final boolean d() {
        String str = "FirebaseInstanceId";
        fhk e2 = this.c.e();
        if (e2 != null && !e2.b(this.d.b())) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.c;
            String a2 = fha.a(firebaseInstanceId.c);
            String str2 = "*";
            if (Looper.getMainLooper() != Looper.myLooper()) {
                String a3 = ((fgm) firebaseInstanceId.a(firebaseInstanceId.a(a2, str2))).a();
                if (a3 == null) {
                    Log.e(str, "Token retrieval failed: null");
                    return false;
                }
                Log.isLoggable(str, 3);
                if (e2 == null || (e2 != null && !a3.equals(e2.a))) {
                    Context a4 = a();
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", a3);
                    a4.sendBroadcast(fhi.a(a4, "com.google.firebase.MESSAGING_EVENT", intent));
                    a4.sendBroadcast(fhi.a(a4, "com.google.firebase.INSTANCE_ID_EVENT", new Intent("com.google.firebase.iid.TOKEN_REFRESH")));
                }
                return true;
            }
            throw new IOException("MAIN_THREAD");
        } catch (IOException | SecurityException e3) {
            String str3 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e3.getMessage());
            Log.e(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final Context a() {
        return this.c.c.a();
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        this.b.acquire();
        try {
            this.c.a(true);
            if (!this.c.e.a()) {
                this.c.a(false);
            } else if (!b()) {
                fhm fhm = new fhm(this);
                FirebaseInstanceId.f();
                fhm.a.a().registerReceiver(fhm, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.b.release();
            } else {
                if (!c() || !d() || !this.e.a(this.c)) {
                    this.c.a(this.a);
                } else {
                    this.c.a(false);
                }
                this.b.release();
            }
        } finally {
            this.b.release();
        }
    }
}
