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

/* renamed from: wrk reason: default package */
public final class wrk {
    private static volatile int a;
    private static wrq b = new wrq();
    private static wro c = new wro();
    private static boolean d = wrr.b("slf4j.detectLoggerNameMismatch");
    private static final String[] e = {"1.6", "1.7"};
    private static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    private wrk() {
    }

    private static void b() {
        synchronized (b) {
            b.a = true;
            for (wrp wrp : new ArrayList(b.b.values())) {
                wrp.a = a(wrp.f());
            }
        }
    }

    private static void a(Throwable th) {
        a = 2;
        wrr.a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static void c() {
        LinkedBlockingQueue<wrn> linkedBlockingQueue = b.c;
        int size = linkedBlockingQueue.size();
        ArrayList<wrn> arrayList = new ArrayList<>(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (wrn wrn : arrayList) {
                a(wrn);
                int i2 = i + 1;
                if (i == 0) {
                    a(wrn, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    private static void d() {
        wrr.c("The following set of substitute loggers may have been accessed");
        wrr.c("during the initialization phase. Logging calls during this");
        wrr.c("phase were not honored. However, subsequent logging calls to these");
        wrr.c("loggers will work as normally expected.");
        wrr.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void a(int i) {
        StringBuilder sb = new StringBuilder("A number (");
        sb.append(i);
        sb.append(") of logging calls during the initialization phase have been intercepted and are");
        wrr.c(sb.toString());
        wrr.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        wrr.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static final void e() {
        try {
            String str = wrs.a;
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
                wrr.c(sb.toString());
                wrr.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            wrr.a("Unexpected problem occured during version sanity check", th);
        }
    }

    private static Set<URL> f() {
        Enumeration enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = wrk.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f);
            } else {
                enumeration = classLoader.getResources(f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add((URL) enumeration.nextElement());
            }
        } catch (IOException e2) {
            wrr.a("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    private static boolean a(Set<URL> set) {
        return set.size() > 1;
    }

    public static wrj a(String str) {
        return a().a(str);
    }

    public static wrj a(Class<?> cls) {
        wrj a2 = a(cls.getName());
        if (d) {
            Class a3 = wrr.a();
            if (a3 != null && (!a3.isAssignableFrom(cls))) {
                wrr.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{a2.f(), a3.getName()}));
                wrr.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return a2;
    }

    public static wri a() {
        boolean z;
        if (a == 0) {
            synchronized (wrk.class) {
                if (a == 0) {
                    a = 1;
                    Set<URL> set = null;
                    boolean z2 = false;
                    try {
                        String a2 = wrr.a("java.vendor.url");
                        if (a2 == null) {
                            z = false;
                        } else {
                            z = a2.toLowerCase().contains("android");
                        }
                        if (!z) {
                            set = f();
                            if (a(set)) {
                                wrr.c("Class path contains multiple SLF4J bindings.");
                                for (URL url : set) {
                                    StringBuilder sb = new StringBuilder("Found binding in [");
                                    sb.append(url);
                                    sb.append("]");
                                    wrr.c(sb.toString());
                                }
                                wrr.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                            }
                        }
                        wrs.a();
                        a = 3;
                        if (set != null && a(set)) {
                            StringBuilder sb2 = new StringBuilder("Actual binding is of type [");
                            wrs.a();
                            sb2.append(wrs.c());
                            sb2.append("]");
                            wrr.c(sb2.toString());
                        }
                        b();
                        c();
                        wrq wrq = b;
                        wrq.b.clear();
                        wrq.c.clear();
                    } catch (NoClassDefFoundError e2) {
                        String message = e2.getMessage();
                        if (message != null) {
                            if (!message.contains("org/slf4j/impl/StaticLoggerBinder")) {
                                if (message.contains("org.slf4j.impl.StaticLoggerBinder")) {
                                }
                            }
                            z2 = true;
                        }
                        if (z2) {
                            a = 4;
                            wrr.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                            wrr.c("Defaulting to no-operation (NOP) logger implementation");
                            wrr.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                        } else {
                            a((Throwable) e2);
                            throw e2;
                        }
                    } catch (NoSuchMethodError e3) {
                        String message2 = e3.getMessage();
                        if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            a = 2;
                            wrr.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            wrr.c("Your binding is version 1.5.5 or earlier.");
                            wrr.c("Upgrade your binding to version 1.6.x.");
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
            return wrs.a().b();
        } else {
            if (i == 4) {
                return c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    private static void a(wrn wrn, int i) {
        if (wrn.d.g()) {
            a(i);
            return;
        }
        if (!(wrn.d.a instanceof NOPLogger)) {
            d();
        }
    }

    private static void a(wrn wrn) {
        if (wrn != null) {
            wrp wrp = wrn.d;
            String f2 = wrp.f();
            if (!wrp.h()) {
                if (!(wrp.a instanceof NOPLogger)) {
                    if (wrp.g()) {
                        wrp.a((wrm) wrn);
                        return;
                    }
                    wrr.c(f2);
                }
                return;
            }
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
    }
}
