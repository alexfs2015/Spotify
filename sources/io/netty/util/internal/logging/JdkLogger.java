package io.netty.util.internal.logging;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class JdkLogger extends AbstractInternalLogger {
    private static String b = JdkLogger.class.getName();
    private static String c = AbstractInternalLogger.class.getName();
    private static final long serialVersionUID = -1767272577989225979L;
    private transient Logger a;

    public JdkLogger(Logger logger) {
        super(logger.getName());
        this.a = logger;
    }

    public final boolean a() {
        return this.a.isLoggable(Level.FINEST);
    }

    public final void a(String str) {
        if (this.a.isLoggable(Level.FINEST)) {
            a(b, Level.FINEST, str, null);
        }
    }

    public final void a(String str, Object obj) {
        if (this.a.isLoggable(Level.FINEST)) {
            wjv a2 = wka.a(str, obj);
            a(b, Level.FINEST, a2.a, a2.b);
        }
    }

    public final void a(String str, Object obj, Object obj2) {
        if (this.a.isLoggable(Level.FINEST)) {
            wjv a2 = wka.a(str, obj, obj2);
            a(b, Level.FINEST, a2.a, a2.b);
        }
    }

    public final void a(String str, Throwable th) {
        if (this.a.isLoggable(Level.FINEST)) {
            a(b, Level.FINEST, str, th);
        }
    }

    public final boolean b() {
        return this.a.isLoggable(Level.FINE);
    }

    public final void b(String str) {
        if (this.a.isLoggable(Level.FINE)) {
            a(b, Level.FINE, str, null);
        }
    }

    public final void b(String str, Object obj) {
        if (this.a.isLoggable(Level.FINE)) {
            wjv a2 = wka.a(str, obj);
            a(b, Level.FINE, a2.a, a2.b);
        }
    }

    public final void b(String str, Object obj, Object obj2) {
        if (this.a.isLoggable(Level.FINE)) {
            wjv a2 = wka.a(str, obj, obj2);
            a(b, Level.FINE, a2.a, a2.b);
        }
    }

    public final void a(String str, Object... objArr) {
        if (this.a.isLoggable(Level.FINE)) {
            wjv a2 = wka.a(str, objArr);
            a(b, Level.FINE, a2.a, a2.b);
        }
    }

    public final void b(String str, Throwable th) {
        if (this.a.isLoggable(Level.FINE)) {
            a(b, Level.FINE, str, th);
        }
    }

    public final boolean c() {
        return this.a.isLoggable(Level.INFO);
    }

    public final void c(String str) {
        if (this.a.isLoggable(Level.INFO)) {
            a(b, Level.INFO, str, null);
        }
    }

    public final void c(String str, Throwable th) {
        if (this.a.isLoggable(Level.INFO)) {
            a(b, Level.INFO, str, th);
        }
    }

    public final boolean d() {
        return this.a.isLoggable(Level.WARNING);
    }

    public final void d(String str) {
        if (this.a.isLoggable(Level.WARNING)) {
            a(b, Level.WARNING, str, null);
        }
    }

    public final void c(String str, Object obj) {
        if (this.a.isLoggable(Level.WARNING)) {
            wjv a2 = wka.a(str, obj);
            a(b, Level.WARNING, a2.a, a2.b);
        }
    }

    public final void c(String str, Object obj, Object obj2) {
        if (this.a.isLoggable(Level.WARNING)) {
            wjv a2 = wka.a(str, obj, obj2);
            a(b, Level.WARNING, a2.a, a2.b);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.a.isLoggable(Level.WARNING)) {
            wjv a2 = wka.a(str, objArr);
            a(b, Level.WARNING, a2.a, a2.b);
        }
    }

    public final void d(String str, Throwable th) {
        if (this.a.isLoggable(Level.WARNING)) {
            a(b, Level.WARNING, str, th);
        }
    }

    public final boolean e() {
        return this.a.isLoggable(Level.SEVERE);
    }

    public final void e(String str) {
        if (this.a.isLoggable(Level.SEVERE)) {
            a(b, Level.SEVERE, str, null);
        }
    }

    public final void d(String str, Object obj) {
        if (this.a.isLoggable(Level.SEVERE)) {
            wjv a2 = wka.a(str, obj);
            a(b, Level.SEVERE, a2.a, a2.b);
        }
    }

    public final void d(String str, Object obj, Object obj2) {
        if (this.a.isLoggable(Level.SEVERE)) {
            wjv a2 = wka.a(str, obj, obj2);
            a(b, Level.SEVERE, a2.a, a2.b);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.a.isLoggable(Level.SEVERE)) {
            wjv a2 = wka.a(str, objArr);
            a(b, Level.SEVERE, a2.a, a2.b);
        }
    }

    public final void e(String str, Throwable th) {
        if (this.a.isLoggable(Level.SEVERE)) {
            a(b, Level.SEVERE, str, th);
        }
    }

    private void a(String str, Level level, String str2, Throwable th) {
        LogRecord logRecord = new LogRecord(level, str2);
        logRecord.setLoggerName(this.name);
        logRecord.setThrown(th);
        a(str, logRecord);
        this.a.log(logRecord);
    }

    private static void a(String str, LogRecord logRecord) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                i = -1;
                break;
            }
            String className = stackTrace[i].getClassName();
            if (className.equals(str) || className.equals(c)) {
                break;
            }
            i++;
        }
        while (true) {
            i++;
            if (i >= stackTrace.length) {
                i = -1;
                break;
            }
            String className2 = stackTrace[i].getClassName();
            if (!className2.equals(str) && !className2.equals(c)) {
                break;
            }
        }
        if (i != -1) {
            StackTraceElement stackTraceElement = stackTrace[i];
            logRecord.setSourceClassName(stackTraceElement.getClassName());
            logRecord.setSourceMethodName(stackTraceElement.getMethodName());
        }
    }
}
