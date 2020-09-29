package com.spotify.mobile.android.orbit;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.net.URL;
import java.util.Random;

public class OrbitLibraryLoader {
    private static final String[] ABIS = {ARM64_ABI, X86_ABI, ARMV7_ABI};
    static final String ARM64_ABI = "arm64-v8a";
    static final String ARMV7_ABI = "armeabi-v7a";
    private static final String LIB_BASE_FOLDER = "lib";
    static final String ORBIT_JNI_LIBRARY_NAME = "orbit-jni-spotify";
    static final String X86_ABI = "x86";
    private Thread mLibraryLoadingThread;
    private final Random mRandom;

    public static class LibraryLoader {
        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }

        public void load(String str) {
            System.load(str);
        }

        public URL getResource(String str) {
            return LibraryLoader.class.getResource(str);
        }

        public String[] getABIs() {
            if (VERSION.SDK_INT >= 21) {
                return Build.SUPPORTED_ABIS;
            }
            return new String[]{Build.CPU_ABI};
        }
    }

    public OrbitLibraryLoader(Random random) {
        this.mRandom = random;
    }

    public void startLibraryLoading(final Context context, final LibraryLoader libraryLoader) {
        this.mLibraryLoadingThread = new Thread("Library Loader") {
            public void run() {
                OrbitLibraryLoader.this.loadLibrary(context, libraryLoader);
            }
        };
        this.mLibraryLoadingThread.start();
    }

    /* access modifiers changed from: 0000 */
    public void loadLibrary(Context context, LibraryLoader libraryLoader) {
        try {
            libraryLoader.loadLibrary(ORBIT_JNI_LIBRARY_NAME);
        } catch (UnsatisfiedLinkError e) {
            if (fallbackNativeLoading(context, libraryLoader)) {
                reportThrottledSuccess(this.mRandom);
                return;
            }
            Logger.e(e, "Error performing native lib fallback extraction", new Object[0]);
            throw e;
        }
    }

    public void waitForLibraryLoaded() {
        fay.a(this.mLibraryLoadingThread);
        try {
            this.mLibraryLoadingThread.join(0);
        } catch (InterruptedException e) {
            Assertion.a((Exception) e);
        }
    }

    static void reportThrottledSuccess(Random random) {
        if (((double) random.nextFloat()) >= 0.99d) {
            Assertion.b("Successfully loaded native lib with fallback method (Throttled 99%).");
        }
    }

    private boolean fallbackNativeLoading(Context context, LibraryLoader libraryLoader) {
        String[] strArr;
        for (String str : ABIS) {
            if (hasABI(libraryLoader, str)) {
                try {
                    File buildNativeLibPath = buildNativeLibPath(context, str);
                    createLibDirIfNeeded(buildNativeLibPath);
                    StringBuilder sb = new StringBuilder("/lib/");
                    sb.append(str);
                    sb.append("/liborbit-jni-spotify");
                    sb.append(".so");
                    URL resource = libraryLoader.getResource(sb.toString());
                    if (resource == null) {
                        Logger.e("Cannot find native library in APK - fallback extraction failed!", new Object[0]);
                    } else if (copyLibFromApk(resource, buildNativeLibPath)) {
                        libraryLoader.load(buildNativeLibPath.getAbsolutePath());
                        return true;
                    }
                } catch (UnsatisfiedLinkError e) {
                    Logger.e(e, e.getMessage(), new Object[0]);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0024 A[SYNTHETIC, Splitter:B:24:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x002b A[SYNTHETIC, Splitter:B:28:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0032 A[SYNTHETIC, Splitter:B:36:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0039 A[SYNTHETIC, Splitter:B:40:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean copyLibFromApk(java.net.URL r2, java.io.File r3) {
        /*
            r0 = 0
            java.io.InputStream r2 = r2.openStream()     // Catch:{ IOException -> 0x002f, all -> 0x0020 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0030, all -> 0x001e }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0030, all -> 0x001e }
            defpackage.fdu.a(r2, r1)     // Catch:{ IOException -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0012
        L_0x0011:
        L_0x0012:
            if (r2 == 0) goto L_0x0017
            r2.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            r2 = 1
            return r2
        L_0x0019:
            r3 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x001c:
            r0 = r1
            goto L_0x0030
        L_0x001e:
            r3 = move-exception
            goto L_0x0022
        L_0x0020:
            r3 = move-exception
            r2 = r0
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            throw r3
        L_0x002f:
            r2 = r0
        L_0x0030:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.orbit.OrbitLibraryLoader.copyLibFromApk(java.net.URL, java.io.File):boolean");
    }

    private static File buildNativeLibPath(Context context, String str) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(LIB_BASE_FOLDER);
        return new File(new File(new File(filesDir, sb.toString()), str), "liborbit-jni-spotify.so");
    }

    private static void createLibDirIfNeeded(File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                if (!parentFile.mkdirs()) {
                    String str = "Failed to create directory for native library extraction";
                    Logger.e(str, new Object[0]);
                    throw new UnsatisfiedLinkError(str);
                }
            } else if (!parentFile.isDirectory()) {
                String str2 = "Unexpected file where native lib dir expected!";
                Logger.e(str2, new Object[0]);
                throw new UnsatisfiedLinkError(str2);
            }
        } else if (!file.delete()) {
            String str3 = "Failed to delete old (possibly stale) native library";
            Logger.e(str3, new Object[0]);
            throw new UnsatisfiedLinkError(str3);
        }
    }

    private static boolean hasABI(LibraryLoader libraryLoader, String str) {
        for (String contains : libraryLoader.getABIs()) {
            if (contains.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
