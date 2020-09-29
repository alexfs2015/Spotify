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

/* renamed from: whb reason: default package */
public final class whb {
    private static StringBuilder a = new StringBuilder();

    /* renamed from: whb$a */
    static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: whb$b */
    static class b implements ThreadFactory {
        b() {
        }

        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static int a(Resources resources, wgq wgq) {
        int i;
        if (wgq.e != 0 || wgq.d == null) {
            return wgq.e;
        }
        String authority = wgq.d.getAuthority();
        if (authority != null) {
            List pathSegments = wgq.d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder("No path segments: ");
                sb.append(wgq.d);
                throw new FileNotFoundException(sb.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Last path segment is not a resource ID: ");
                    sb2.append(wgq.d);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder("More than two path segments: ");
                sb3.append(wgq.d);
                throw new FileNotFoundException(sb3.toString());
            }
            return i;
        }
        StringBuilder sb4 = new StringBuilder("No package provided: ");
        sb4.append(wgq.d);
        throw new FileNotFoundException(sb4.toString());
    }

    static int a(Bitmap bitmap) {
        int byteCount = VERSION.SDK_INT >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
        if (byteCount >= 0) {
            return byteCount;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
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

    static Resources a(Context context, wgq wgq) {
        if (wgq.e != 0 || wgq.d == null) {
            return context.getResources();
        }
        String authority = wgq.d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("Unable to obtain resources for package: ");
                sb.append(wgq.d);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No package provided: ");
            sb2.append(wgq.d);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public static Downloader a(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return new wgn(context);
        } catch (ClassNotFoundException unused) {
            return new wha(context);
        }
    }

    static <T> T a(Context context, String str) {
        return context.getSystemService(str);
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static String a(wfx wfx) {
        return a(wfx, "");
    }

    static String a(wfx wfx, String str) {
        StringBuilder sb = new StringBuilder(str);
        wfv wfv = wfx.h;
        if (wfv != null) {
            sb.append(wfv.b.a());
        }
        List<wfv> list = wfx.i;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || wfv != null) {
                    sb.append(", ");
                }
                sb.append(((wfv) list.get(i)).b.a());
            }
        }
        return sb.toString();
    }

    static String a(wgq wgq) {
        String a2 = a(wgq, a);
        a.setLength(0);
        return a2;
    }

    static String a(wgq wgq, StringBuilder sb) {
        if (wgq.f != null) {
            sb.ensureCapacity(wgq.f.length() + 50);
            sb.append(wgq.f);
        } else if (wgq.d != null) {
            String uri = wgq.d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(wgq.e);
        }
        sb.append(10);
        if (wgq.m != 0.0f) {
            sb.append("rotation:");
            sb.append(wgq.m);
            if (wgq.p) {
                sb.append('@');
                sb.append(wgq.n);
                sb.append('x');
                sb.append(wgq.o);
            }
            sb.append(10);
        }
        if (wgq.c()) {
            sb.append("resize:");
            sb.append(wgq.h);
            sb.append('x');
            sb.append(wgq.i);
            sb.append(10);
        }
        if (wgq.j) {
            sb.append("centerCrop\n");
        } else if (wgq.k) {
            sb.append("centerInside\n");
        }
        if (wgq.g != null) {
            int size = wgq.g.size();
            for (int i = 0; i < size; i++) {
                sb.append(((wgz) wgq.g.get(i)).a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    static void a() {
        if (c()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
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

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        a(str, str2, str3, "");
    }

    public static void a(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
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
            return "CONDITIONAL_CACHE".equals(split[0]) && Integer.parseInt(split[1]) == 304;
        } catch (NumberFormatException unused) {
        }
    }

    static File b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void b() {
        if (!c()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
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

    static int c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && VERSION.SDK_INT >= 11) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return (memoryClass * 1048576) / 7;
    }

    private static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
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
        return "WEBP".equals(new String(bArr, 8, 4, str));
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
}
