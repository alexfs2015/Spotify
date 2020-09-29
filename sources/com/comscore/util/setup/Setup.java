package com.comscore.util.setup;

import com.comscore.Analytics;
import com.comscore.util.ObfuscationChecker;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;

public class Setup {
    static final String a = "comScore";
    private static JniComScoreHelper b;
    private static PlatformSetup c;
    private static boolean d;
    private static boolean e;
    private static final Object f = new Object();

    private static boolean a() {
        if (!c.shouldLoadCppLibrary()) {
            Logger.e("Unsupported platform", (Throwable) new RuntimeException("This platform is not supported. The comScore native library will not be loaded."));
            return false;
        }
        PlatformSetup platformSetup = c;
        String str = a;
        String buildNativeLibraryName = platformSetup.buildNativeLibraryName(str);
        if (buildNativeLibraryName == null) {
            buildNativeLibraryName = str;
        }
        String buildNativeLibraryPath = c.buildNativeLibraryPath(buildNativeLibraryName);
        if (buildNativeLibraryPath != null) {
            try {
                if (buildNativeLibraryPath.length() != 0) {
                    System.load(buildNativeLibraryPath);
                    configureNative(b);
                    return true;
                }
            } catch (UnsatisfiedLinkError e2) {
                if (!(buildNativeLibraryPath == null || buildNativeLibraryPath.length() == 0)) {
                    buildNativeLibraryName = buildNativeLibraryPath;
                }
                StringBuilder sb = new StringBuilder("Error loading the native library: ");
                sb.append(buildNativeLibraryName);
                Logger.e(sb.toString(), (Throwable) e2);
                return false;
            }
        }
        System.loadLibrary(buildNativeLibraryName);
        configureNative(b);
        return true;
    }

    private static void b() {
        String version = Analytics.getVersion();
        String javaCodeVersion = c.getJavaCodeVersion();
        if (version == null) {
            Logger.e("Unable to retrieve the native version.");
        } else if (version == null || !version.equals(javaCodeVersion)) {
            StringBuilder sb = new StringBuilder("The version of the comScore java code (");
            sb.append(javaCodeVersion);
            sb.append(") and the native library (");
            sb.append(version);
            sb.append(") are different. Check which version of the comScore SDK is being used.");
            throw new IllegalStateException(sb.toString());
        }
    }

    private static native void configureNative(JniComScoreHelper jniComScoreHelper);

    public static JniComScoreHelper getJniComScoreHelper() {
        return b;
    }

    public static PlatformSetup getPlatformSetup() {
        return c;
    }

    public static boolean isNativeLibrarySuccessfullyLoaded() {
        return e;
    }

    public static boolean isSetUpFinished() {
        return d;
    }

    public static void setUp() {
        if (!d) {
            synchronized (f) {
                if (!d) {
                    if (!new ObfuscationChecker().isCodeObfuscated()) {
                        CustomPlatformSetup customPlatformSetup = new CustomPlatformSetup();
                        c = customPlatformSetup;
                        b = customPlatformSetup.createApplicationInfoHelper();
                        Logger.log = c.createLogger();
                        e = a();
                        d = true;
                        if (e) {
                            b();
                            Logger.syncrhonizeLogLevelWithNative();
                        }
                    } else {
                        throw new IllegalStateException("comScore SDK has been obfuscated. Did you add in your proguard-project.txt the following lines?\n-keep class com.comscore.** { *; }\n-dontwarn com.comscore.**");
                    }
                }
            }
        }
    }
}
