package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.System;
import com.squareup.picasso.Downloader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: vsv reason: default package */
public final class vsv {
    private static StringBuilder a = new StringBuilder();

    /* renamed from: vsv$a */
    static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: vsv$b */
    static class b implements ThreadFactory {
        b() {
        }

        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static int a(Bitmap bitmap) {
        int i;
        if (VERSION.SDK_INT >= 12) {
            i = bitmap.getByteCount();
        } else {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static void a() {
        if (c()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    public static void b() {
        if (!c()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    private static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static String a(vrr vrr) {
        return a(vrr, "");
    }

    static String a(vrr vrr, String str) {
        StringBuilder sb = new StringBuilder(str);
        vrp vrp = vrr.h;
        if (vrp != null) {
            sb.append(vrp.b.a());
        }
        List<vrp> list = vrr.i;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || vrp != null) {
                    sb.append(", ");
                }
                sb.append(((vrp) list.get(i)).b.a());
            }
        }
        return sb.toString();
    }

    public static void a(String str, String str2, String str3) {
        a(str, str2, str3, "");
    }

    public static void a(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    static String a(vsk vsk) {
        String a2 = a(vsk, a);
        a.setLength(0);
        return a2;
    }

    static String a(vsk vsk, StringBuilder sb) {
        if (vsk.f != null) {
            sb.ensureCapacity(vsk.f.length() + 50);
            sb.append(vsk.f);
        } else if (vsk.d != null) {
            String uri = vsk.d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(vsk.e);
        }
        sb.append(10);
        if (vsk.m != 0.0f) {
            sb.append("rotation:");
            sb.append(vsk.m);
            if (vsk.p) {
                sb.append('@');
                sb.append(vsk.n);
                sb.append('x');
                sb.append(vsk.o);
            }
            sb.append(10);
        }
        if (vsk.c()) {
            sb.append("resize:");
            sb.append(vsk.h);
            sb.append('x');
            sb.append(vsk.i);
            sb.append(10);
        }
        if (vsk.j) {
            sb.append("centerCrop\n");
        } else if (vsk.k) {
            sb.append("centerInside\n");
        }
        if (vsk.g != null) {
            int size = vsk.g.size();
            for (int i = 0; i < size; i++) {
                sb.append(((vst) vsk.g.get(i)).a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
        }
    }

    public static Downloader a(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return new vsh(context);
        } catch (ClassNotFoundException unused) {
            return new vsu(context);
        }
    }

    static File b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    static boolean d(Context context) {
        try {
            if (System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    static <T> T a(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static boolean c(InputStream inputStream) {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12) {
            return false;
        }
        String str = "US-ASCII";
        if (!"RIFF".equals(new String(bArr, 0, 4, str))) {
            return false;
        }
        if ("WEBP".equals(new String(bArr, 8, 4, str))) {
            return true;
        }
        return false;
    }

    static int a(Resources resources, vsk vsk) {
        int i;
        if (vsk.e != 0 || vsk.d == null) {
            return vsk.e;
        }
        String authority = vsk.d.getAuthority();
        if (authority != null) {
            List pathSegments = vsk.d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder("No path segments: ");
                sb.append(vsk.d);
                throw new FileNotFoundException(sb.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Last path segment is not a resource ID: ");
                    sb2.append(vsk.d);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder("More than two path segments: ");
                sb3.append(vsk.d);
                throw new FileNotFoundException(sb3.toString());
            }
            return i;
        }
        StringBuilder sb4 = new StringBuilder("No package provided: ");
        sb4.append(vsk.d);
        throw new FileNotFoundException(sb4.toString());
    }

    static Resources a(Context context, vsk vsk) {
        if (vsk.e != 0 || vsk.d == null) {
            return context.getResources();
        }
        String authority = vsk.d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("Unable to obtain resources for package: ");
                sb.append(vsk.d);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No package provided: ");
            sb2.append(vsk.d);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    static void a(Looper looper) {
        AnonymousClass1 r0 = new Handler(looper) {
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    static int c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && VERSION.SDK_INT >= 11) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return (memoryClass * 1048576) / 7;
    }
}
