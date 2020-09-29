package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.NOPLogger;

/* renamed from: xfp reason: default package */
public final class xfp {
    private static volatile int a;
    private static xfv b = new xfv();
    private static xft c = new xft();
    private static boolean d = xfw.b("slf4j.detectLoggerNameMismatch");
    private static final String[] e = {"1.6", "1.7"};
    private static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    private xfp() {
    }

    public static xfn a() {
        if (a == 0) {
            synchronized (xfp.class) {
                if (a == 0) {
                    a = 1;
                    Set<URL> set = null;
                    boolean z = false;
                    try {
                        String a2 = xfw.a("java.vendor.url");
                        if (!(a2 == null ? false : a2.toLowerCase().contains("android"))) {
                            set = f();
                            if (a(set)) {
                                xfw.c("Class path contains multiple SLF4J bindings.");
                                for (URL url : set) {
                                    StringBuilder sb = new StringBuilder("Found binding in [");
                                    sb.append(url);
                                    sb.append("]");
                                    xfw.c(sb.toString());
                                }
                                xfw.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                            }
                        }
                        xfx.a();
                        a = 3;
                        if (set != null && a(set)) {
                            StringBuilder sb2 = new StringBuilder("Actual binding is of type [");
                            xfx.a();
                            sb2.append(xfx.c());
                            sb2.append("]");
                            xfw.c(sb2.toString());
                        }
                        b();
                        c();
                        xfv xfv = b;
                        xfv.b.clear();
                        xfv.c.clear();
                    } catch (NoClassDefFoundError e2) {
                        String message = e2.getMessage();
                        if (message != null) {
                            if (!message.contains("org/slf4j/impl/StaticLoggerBinder")) {
                                if (message.contains("org.slf4j.impl.StaticLoggerBinder")) {
                                }
                            }
                            z = true;
                        }
                        if (z) {
                            a = 4;
                            xfw.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                            xfw.c("Defaulting to no-operation (NOP) logger implementation");
                            xfw.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                        } else {
                            a((Throwable) e2);
                            throw e2;
                        }
                    } catch (NoSuchMethodError e3) {
                        String message2 = e3.getMessage();
                        if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            a = 2;
                            xfw.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            xfw.c("Your binding is version 1.5.5 or earlier.");
                            xfw.c("Upgrade your binding to version 1.6.x.");
                        }
                        throw e3;
                    } catch (Exception e4) {
                        a((Throwable) e4);
                        throw new IllegalStateException("Unexpected initialization failure", e4);
                    }
                    if (a == 3) {
                        e();
                    }
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return xfx.a().b();
        } else {
            if (i == 4) {
                return c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    public static xfo a(Class<?> cls) {
        xfo a2 = a(cls.getName());
        if (d) {
            Class a3 = xfw.a();
            if (a3 != null && (!a3.isAssignableFrom(cls))) {
                xfw.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{a2.f(), a3.getName()}));
                xfw.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return a2;
    }

    public static xfo a(String str) {
        return a().a(str);
    }

    private static void a(int i) {
        StringBuilder sb = new StringBuilder("A number (");
        sb.append(i);
        sb.append(") of logging calls during the initialization phase have been intercepted and are");
        xfw.c(sb.toString());
        xfw.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        xfw.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void a(Throwable th) {
        a = 2;
        xfw.a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static void a(xfs xfs) {
        if (xfs != null) {
            xfu xfu = xfs.d;
            String f2 = xfu.f();
            if (!xfu.h()) {
                if (!(xfu.a instanceof NOPLogger)) {
                    if (xfu.g()) {
                        xfu.a((xfr) xfs);
                        return;
                    }
                    xfw.c(f2);
                }
                return;
            }
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
    }

    private static void a(xfs xfs, int i) {
        if (xfs.d.g()) {
            a(i);
            return;
        }
        if (!(xfs.d.a instanceof NOPLogger)) {
            d();
        }
    }

    private static boolean a(Set<URL> set) {
        return set.size() > 1;
    }

    private static void b() {
        synchronized (b) {
            b.a = true;
            for (xfu xfu : new ArrayList(b.b.values())) {
                xfu.a = a(xfu.f());
            }
        }
    }

    private static void c() {
        LinkedBlockingQueue<xfs> linkedBlockingQueue = b.c;
        int size = linkedBlockingQueue.size();
        ArrayList<xfs> arrayList = new ArrayList<>(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (xfs xfs : arrayList) {
                a(xfs);
                int i2 = i + 1;
                if (i == 0) {
                    a(xfs, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    private static void d() {
        xfw.c("The following set of substitute loggers may have been accessed");
        xfw.c("during the initialization phase. Logging calls during this");
        xfw.c("phase were not honored. However, subsequent logging calls to these");
        xfw.c("loggers will work as normally expected.");
        xfw.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static final void e() {
        try {
            String str = xfx.a;
            String[] strArr = e;
            boolean z = false;
            for (int i = 0; i < 2; i++) {
                if (str.startsWith(strArr[i])) {
                    z = true;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder("The requested version ");
                sb.append(str);
                sb.append(" by your slf4j binding is not compatible with ");
                sb.append(Arrays.asList(e).toString());
                xfw.c(sb.toString());
                xfw.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            xfw.a("Unexpected problem occured during version sanity check", th);
        }
    }

    private static Set<URL> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = xfp.class.getClassLoader();
            Enumeration systemResources = classLoader == null ? ClassLoader.getSystemResources(f) : classLoader.getResources(f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add((URL) systemResources.nextElement());
            }
        } catch (IOException e2) {
            xfw.a("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }
}
