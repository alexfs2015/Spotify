package defpackage;

import android.content.Context;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.io.IOException;

/* renamed from: giu reason: default package */
public final class giu implements git {
    private final File a;
    private wzn b;
    private final long c;

    public giu(File file, long j) {
        this.a = file;
        this.c = j;
    }

    public static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    public static File a(Context context, String str) {
        return new File(context.getApplicationContext().getCacheDir(), str);
    }

    private void c() {
        wzn wzn = this.b;
        if (wzn != null) {
            try {
                wzn.b.d();
            } catch (IOException unused) {
                Logger.e("Could not clear cache, %s", this.a.getAbsolutePath());
            }
        }
    }

    public final void a() {
        c();
    }

    public final void a(a aVar) {
        try {
            File file = this.a;
            ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            if (!file.exists()) {
                if (!file.mkdir()) {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw new IOException();
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            this.b = new wzn(this.a, this.c);
            aVar.j = this.b;
            aVar.k = null;
        } catch (IOException unused) {
            Logger.e("Could not create cache, %s", this.a.getAbsolutePath());
            Assertion.b("Could not create cache");
        }
    }

    public final void b() {
        c();
    }
}
