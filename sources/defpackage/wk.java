package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wk reason: default package */
public final class wk implements InvocationHandler {
    private int a = 3000;
    private int b;
    private final AtomicBoolean c;
    private wf d = vv.a();
    private Object e;
    private Context f;
    private xk g;
    private final wl h;
    private Object i;

    public wk(Context context, wl wlVar) {
        this.i = ws.a("com.adjust.sdk.play.InstallReferrer", new Class[]{Context.class, wl.class, wf.class}, context, wlVar, this.d);
        this.f = context;
        this.c = new AtomicBoolean(false);
        this.b = 0;
        this.g = new xk(new Runnable() {
            public final void run() {
                wk.this.a();
            }
        }, "InstallReferrer");
        this.h = wlVar;
    }

    private Object a(Context context) {
        try {
            return ws.a(ws.a("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context), "build", (Class[]) null, new Object[0]);
        } catch (ClassNotFoundException e2) {
            this.d.d("InstallReferrer not integrated in project (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        } catch (Exception e3) {
            this.d.f("createInstallReferrerClient error (%s) from (%s)", e3.getMessage(), e3.getClass().getCanonicalName());
            return null;
        }
    }

    private Object a(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException unused) {
            this.d.f("InstallReferrer proxy violating parameter restrictions", new Object[0]);
            return null;
        } catch (NullPointerException unused2) {
            this.d.f("Null argument passed to InstallReferrer proxy", new Object[0]);
            return null;
        }
    }

    private String a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) ws.a(obj, "getInstallReferrer", (Class[]) null, new Object[0]);
        } catch (Exception e2) {
            this.d.f("getStringInstallReferrer error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        }
    }

    private void a(Class cls, Object obj) {
        try {
            ws.a(this.e, "startConnection", new Class[]{cls}, obj);
        } catch (InvocationTargetException e2) {
            if (xa.a((Exception) e2)) {
                this.d.f("InstallReferrer encountered an InvocationTargetException %s", xa.b((Exception) e2));
            }
        } catch (Exception e3) {
            this.d.f("startConnection error (%s) thrown by (%s)", e3.getMessage(), e3.getClass().getCanonicalName());
        }
    }

    private long b(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            return ((Long) ws.a(obj, "getReferrerClickTimestampSeconds", (Class[]) null, new Object[0])).longValue();
        } catch (Exception e2) {
            this.d.f("getReferrerClickTimestampSeconds error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return -1;
        }
    }

    private Class b() {
        try {
            return Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
        } catch (Exception e2) {
            this.d.f("getInstallReferrerStateListenerClass error (%s) from (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        }
    }

    private long c(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            return ((Long) ws.a(obj, "getInstallBeginTimestampSeconds", (Class[]) null, new Object[0])).longValue();
        } catch (Exception e2) {
            this.d.f("getInstallBeginTimestampSeconds error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return -1;
        }
    }

    private Object c() {
        Object obj = this.e;
        if (obj == null) {
            return null;
        }
        try {
            return ws.a(obj, "getInstallReferrer", (Class[]) null, new Object[0]);
        } catch (Exception e2) {
            this.d.f("getInstallReferrer error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        }
    }

    private void d() {
        if (this.c.get()) {
            this.d.b("Install referrer has already been read", new Object[0]);
            e();
        } else if (this.b + 1 > 2) {
            this.d.b("Limit number of retry of %d for install referrer surpassed", Integer.valueOf(2));
        } else {
            long a2 = this.g.a();
            if (a2 > 0) {
                this.d.b("Already waiting to retry to read install referrer in %d milliseconds", Long.valueOf(a2));
                return;
            }
            this.b++;
            this.d.b("Retry number %d to connect to install referrer API", Integer.valueOf(this.b));
            this.g.a((long) this.a);
        }
    }

    private void e() {
        Object obj = this.e;
        if (obj != null) {
            try {
                ws.a(obj, "endConnection", (Class[]) null, new Object[0]);
                this.d.b("Install Referrer API connection closed", new Object[0]);
            } catch (Exception e2) {
                this.d.f("closeReferrerClient error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            }
            this.e = null;
        }
    }

    public final void a() {
        Object obj = this.i;
        if (obj != null) {
            try {
                ws.a(obj, "startConnection", (Class[]) null, new Object[0]);
                return;
            } catch (Exception e2) {
                this.d.f("Call to Play startConnection error: %s", e2.getMessage());
            }
        }
        if (vv.l()) {
            e();
            if (this.c.get()) {
                this.d.b("Install referrer has already been read", new Object[0]);
                return;
            }
            Context context = this.f;
            if (context != null) {
                this.e = a(context);
                if (this.e != null) {
                    Class b2 = b();
                    if (b2 != null) {
                        Object a2 = a(b2);
                        if (a2 != null) {
                            a(b2, a2);
                        }
                    }
                }
            }
        }
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method == null) {
            this.d.f("InstallReferrer invoke method null", new Object[0]);
            return null;
        }
        String name = method.getName();
        if (name == null) {
            this.d.f("InstallReferrer invoke method name null", new Object[0]);
            return null;
        }
        boolean z = true;
        this.d.b("InstallReferrer invoke method name: %s", name);
        if (objArr == null) {
            this.d.d("InstallReferrer invoke args null", new Object[0]);
            objArr = new Object[0];
        }
        for (Object obj2 : objArr) {
            this.d.b("InstallReferrer invoke arg: %s", obj2);
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                this.d.f("InstallReferrer invoke onInstallReferrerSetupFinished args lenght not 1: %d", Integer.valueOf(objArr.length));
                return null;
            }
            Object obj3 = objArr[0];
            if (!(obj3 instanceof Integer)) {
                this.d.f("InstallReferrer invoke onInstallReferrerSetupFinished arg not int", new Object[0]);
                return null;
            }
            Integer num = (Integer) obj3;
            if (num == null) {
                this.d.f("InstallReferrer invoke onInstallReferrerSetupFinished responseCode arg is null", new Object[0]);
                return null;
            }
            int intValue = num.intValue();
            if (intValue != -1) {
                if (intValue == 0) {
                    try {
                        Object c2 = c();
                        String a2 = a(c2);
                        long b2 = b(c2);
                        long c3 = c(c2);
                        this.d.b("installReferrer: %s, clickTime: %d, installBeginTime: %d", a2, Long.valueOf(b2), Long.valueOf(c3));
                        this.d.b("Install Referrer read successfully. Closing connection", new Object[0]);
                        this.h.a(a2, b2, c3);
                        this.c.set(true);
                    } catch (Exception e2) {
                        this.d.d("Couldn't get install referrer from client (%s). Retrying...", e2.getMessage());
                    }
                } else if (intValue == 1) {
                    this.d.b("Could not initiate connection to the Install Referrer service. Retrying...", new Object[0]);
                } else if (intValue == 2) {
                    this.d.b("Install Referrer API not supported by the installed Play Store app. Closing connection", new Object[0]);
                } else if (intValue != 3) {
                    this.d.b("Unexpected response code of install referrer response: %d. Closing connection", Integer.valueOf(intValue));
                } else {
                    this.d.b("Install Referrer API general errors caused by incorrect usage. Retrying...", new Object[0]);
                }
                z = false;
            } else {
                this.d.b("Play Store service is not connected now. Retrying...", new Object[0]);
            }
            if (z) {
                d();
            } else {
                e();
            }
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            this.d.b("Connection to install referrer service was lost. Retrying ...", new Object[0]);
            d();
        }
        return null;
    }
}
