package io.netty.util.internal.logging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4JLogger extends AbstractInternalLogger {
    private static String b = Log4JLogger.class.getName();
    private static final long serialVersionUID = 2851357342488183058L;
    private transient Logger a;
    final boolean traceCapable = f();

    public Log4JLogger(Logger logger) {
        super(logger.getName());
        this.a = logger;
    }

    private boolean f() {
        try {
            this.a.isTraceEnabled();
            return true;
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public final boolean a() {
        if (this.traceCapable) {
            return this.a.isTraceEnabled();
        }
        return this.a.isDebugEnabled();
    }

    public final void a(String str) {
        this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, str, null);
    }

    public final void a(String str, Object obj) {
        if (a()) {
            wjv a2 = wka.a(str, obj);
            this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, a2.a, a2.b);
        }
    }

    public final void a(String str, Object obj, Object obj2) {
        if (a()) {
            wjv a2 = wka.a(str, obj, obj2);
            this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, a2.a, a2.b);
        }
    }

    public final void a(String str, Throwable th) {
        this.a.log(b, this.traceCapable ? Level.TRACE : Level.DEBUG, str, th);
    }

    public final boolean b() {
        return this.a.isDebugEnabled();
    }

    public final void b(String str) {
        this.a.log(b, Level.DEBUG, str, null);
    }

    public final void b(String str, Object obj) {
        if (this.a.isDebugEnabled()) {
            wjv a2 = wka.a(str, obj);
            this.a.log(b, Level.DEBUG, a2.a, a2.b);
        }
    }

    public final void b(String str, Object obj, Object obj2) {
        if (this.a.isDebugEnabled()) {
            wjv a2 = wka.a(str, obj, obj2);
            this.a.log(b, Level.DEBUG, a2.a, a2.b);
        }
    }

    public final void a(String str, Object... objArr) {
        if (this.a.isDebugEnabled()) {
            wjv a2 = wka.a(str, objArr);
            this.a.log(b, Level.DEBUG, a2.a, a2.b);
        }
    }

    public final void b(String str, Throwable th) {
        this.a.log(b, Level.DEBUG, str, th);
    }

    public final boolean c() {
        return this.a.isInfoEnabled();
    }

    public final void c(String str) {
        this.a.log(b, Level.INFO, str, null);
    }

    public final void c(String str, Throwable th) {
        this.a.log(b, Level.INFO, str, th);
    }

    public final boolean d() {
        return this.a.isEnabledFor(Level.WARN);
    }

    public final void d(String str) {
        this.a.log(b, Level.WARN, str, null);
    }

    public final void c(String str, Object obj) {
        if (this.a.isEnabledFor(Level.WARN)) {
            wjv a2 = wka.a(str, obj);
            this.a.log(b, Level.WARN, a2.a, a2.b);
        }
    }

    public final void c(String str, Object obj, Object obj2) {
        if (this.a.isEnabledFor(Level.WARN)) {
            wjv a2 = wka.a(str, obj, obj2);
            this.a.log(b, Level.WARN, a2.a, a2.b);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.a.isEnabledFor(Level.WARN)) {
            wjv a2 = wka.a(str, objArr);
            this.a.log(b, Level.WARN, a2.a, a2.b);
        }
    }

    public final void d(String str, Throwable th) {
        this.a.log(b, Level.WARN, str, th);
    }

    public final boolean e() {
        return this.a.isEnabledFor(Level.ERROR);
    }

    public final void e(String str) {
        this.a.log(b, Level.ERROR, str, null);
    }

    public final void d(String str, Object obj) {
        if (this.a.isEnabledFor(Level.ERROR)) {
            wjv a2 = wka.a(str, obj);
            this.a.log(b, Level.ERROR, a2.a, a2.b);
        }
    }

    public final void d(String str, Object obj, Object obj2) {
        if (this.a.isEnabledFor(Level.ERROR)) {
            wjv a2 = wka.a(str, obj, obj2);
            this.a.log(b, Level.ERROR, a2.a, a2.b);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.a.isEnabledFor(Level.ERROR)) {
            wjv a2 = wka.a(str, objArr);
            this.a.log(b, Level.ERROR, a2.a, a2.b);
        }
    }

    public final void e(String str, Throwable th) {
        this.a.log(b, Level.ERROR, str, th);
    }
}
