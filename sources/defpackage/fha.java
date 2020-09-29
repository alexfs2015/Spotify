package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: fha reason: default package */
public final class fha {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public fha(Context context) {
        this.a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            return null;
        }
    }

    public static String a(FirebaseApp firebaseApp) {
        String str = firebaseApp.b().b;
        if (str != null) {
            return str;
        }
        String str2 = firebaseApp.b().a;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final synchronized void e() {
        PackageInfo a2 = a(this.a.getPackageName());
        if (a2 != null) {
            this.b = Integer.toString(a2.versionCode);
            this.c = a2.versionName;
        }
    }

    public final synchronized int a() {
        if (this.e != 0) {
            return this.e;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!caf.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return this.e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (caf.i()) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            return this.e;
        }
        this.e = 2;
        return this.e;
    }

    public final synchronized String b() {
        if (this.b == null) {
            e();
        }
        return this.b;
    }

    public final synchronized String c() {
        if (this.c == null) {
            e();
        }
        return this.c;
    }

    public final synchronized int d() {
        if (this.d == 0) {
            PackageInfo a2 = a("com.google.android.gms");
            if (a2 != null) {
                this.d = a2.versionCode;
            }
        }
        return this.d;
    }
}
