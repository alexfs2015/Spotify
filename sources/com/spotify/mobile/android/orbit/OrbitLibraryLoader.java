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
        public String[] getABIs() {
            if (VERSION.SDK_INT >= 21) {
                return Build.SUPPORTED_ABIS;
            }
            return new String[]{Build.CPU_ABI};
        }

        public URL getResource(String str) {
            return LibraryLoader.class.getResource(str);
        }

        public void load(String str) {
            System.load(str);
        }

        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    public OrbitLibraryLoader(Random random) {
        this.mRandom = random;
    }

    private static File buildNativeLibPath(Context context, String str) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(LIB_BASE_FOLDER);
        File file = new File(new File(filesDir, sb.toString()), str);
        String str2 = "stsi-oifiyibntlr.bjposo";
        return new File(file, "liborbit-jni-spotify.so");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0032 A[SYNTHETIC, Splitter:B:32:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0039 A[SYNTHETIC, Splitter:B:36:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0042 A[SYNTHETIC, Splitter:B:45:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean copyLibFromApk(java.net.URL r3, java.io.File r4) {
        /*
            r2 = 1
            r0 = 0
            java.io.InputStream r3 = r3.openStream()     // Catch:{ IOException -> 0x003d, all -> 0x002c }
            r2 = 2
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003f, all -> 0x0029 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x003f, all -> 0x0029 }
            r2 = 6
            defpackage.fem.a(r3, r1)     // Catch:{ IOException -> 0x0026, all -> 0x0021 }
            r2 = 1
            r1.close()     // Catch:{ IOException -> 0x0016 }
            r2 = 0
            goto L_0x0017
        L_0x0016:
        L_0x0017:
            r2 = 3
            if (r3 == 0) goto L_0x001e
            r2 = 6
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            r2 = 1
            r3 = 1
            return r3
        L_0x0021:
            r4 = move-exception
            r0 = r1
            r0 = r1
            r2 = 4
            goto L_0x002f
        L_0x0026:
            r0 = r1
            r2 = 6
            goto L_0x003f
        L_0x0029:
            r4 = move-exception
            r2 = 7
            goto L_0x002f
        L_0x002c:
            r4 = move-exception
            r3 = r0
            r3 = r0
        L_0x002f:
            r2 = 2
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
        L_0x0037:
            if (r3 == 0) goto L_0x003c
            r3.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            throw r4
        L_0x003d:
            r3 = r0
            r3 = r0
        L_0x003f:
            r2 = 7
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ IOException -> 0x0047 }
            r2 = 4
            goto L_0x0048
        L_0x0047:
        L_0x0048:
            r2 = 1
            if (r3 == 0) goto L_0x004f
            r2 = 7
            r3.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r3 = 0
            r2 = 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.orbit.OrbitLibraryLoader.copyLibFromApk(java.net.URL, java.io.File):boolean");
    }

    private static void createLibDirIfNeeded(File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                if (!parentFile.mkdirs()) {
                    String str = "rermfrde eexFtr ionotlryadaaeir ietcbr oatvi ayti c otnc";
                    String str2 = "Failed to create directory for native library extraction";
                    Logger.e(str2, new Object[0]);
                    throw new UnsatisfiedLinkError(str2);
                }
            } else if (!parentFile.isDirectory()) {
                String str3 = "p itodxxel iviweee !iendtle prbeeeendf thca cr";
                String str4 = "Unexpected file where native lib dir expected!";
                Logger.e(str4, new Object[0]);
                throw new UnsatisfiedLinkError(str4);
            }
        } else if (!file.delete()) {
            String str5 = "Failed to delete old (possibly stale) native library";
            Logger.e(str5, new Object[0]);
            throw new UnsatisfiedLinkError(str5);
        }
    }

    private boolean fallbackNativeLoading(Context context, LibraryLoader libraryLoader) {
        String[] strArr;
        for (String str : ABIS) {
            if (hasABI(libraryLoader, str)) {
                try {
                    File buildNativeLibPath = buildNativeLibPath(context, str);
                    createLibDirIfNeeded(buildNativeLibPath);
                    String str2 = "bib/l";
                    StringBuilder sb = new StringBuilder("/lib/");
                    sb.append(str);
                    String str3 = "iitb-oblrsjobyf-p/nii";
                    sb.append("/liborbit-jni-spotify");
                    String str4 = "so.";
                    sb.append(".so");
                    URL resource = libraryLoader.getResource(sb.toString());
                    if (resource == null) {
                        String str5 = "  e xorta bia a fntvrAi cineKi alnban cl!lPCeattnffoki-rdtilnay";
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

    private static boolean hasABI(LibraryLoader libraryLoader, String str) {
        for (String contains : libraryLoader.getABIs()) {
            if (contains.contains(str)) {
                return true;
            }
        }
        return false;
    }

    static void reportThrottledSuccess(Random random) {
        if (((double) random.nextFloat()) >= 0.99d) {
            String str = "tkft eampcT a o9le)tbuullhahv%ecdrS dito nltce biel9ahdos( w.ilfdy l";
            Assertion.b("Successfully loaded native lib with fallback method (Throttled 99%).");
        }
    }

    /* access modifiers changed from: 0000 */
    public void loadLibrary(Context context, LibraryLoader libraryLoader) {
        String str = "sfibn-ipitojo-ytt";
        try {
            libraryLoader.loadLibrary(ORBIT_JNI_LIBRARY_NAME);
        } catch (UnsatisfiedLinkError e) {
            if (fallbackNativeLoading(context, libraryLoader)) {
                reportThrottledSuccess(this.mRandom);
                return;
            }
            String str2 = "aosinati rbrcco x  itpernvtrlrfibaemlrEgaeofkn ";
            Logger.e(e, "Error performing native lib fallback extraction", new Object[0]);
            throw e;
        }
    }

    public void startLibraryLoading(final Context context, final LibraryLoader libraryLoader) {
        this.mLibraryLoadingThread = new Thread("Library Loader") {
            public void run() {
                OrbitLibraryLoader.this.loadLibrary(context, libraryLoader);
            }
        };
        this.mLibraryLoadingThread.start();
    }

    public void waitForLibraryLoaded() {
        fbp.a(this.mLibraryLoadingThread);
        try {
            this.mLibraryLoadingThread.join(0);
        } catch (InterruptedException e) {
            Assertion.a((Exception) e);
        }
    }
}
