package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nk reason: default package */
final class nk {

    /* renamed from: nk$a */
    public static final class a implements Runnable {
        final Handler a;
        Method b;
        boolean c;
        private final DisplayManager d;

        public a(Context context, Handler handler) {
            if (VERSION.SDK_INT == 17) {
                this.d = (DisplayManager) context.getSystemService("display");
                this.a = handler;
                try {
                    this.b = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
                } catch (NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public final void run() {
            if (this.c) {
                try {
                    this.b.invoke(this.d, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
                this.a.postDelayed(this, 15000);
            }
        }
    }

    /* renamed from: nk$b */
    public interface b extends defpackage.nj.a {
        void f(Object obj);
    }

    /* renamed from: nk$c */
    static class c<T extends b> extends b<T> {
        public c(T t) {
            super(t);
        }

        public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            ((b) this.a).f(routeInfo);
        }
    }

    /* renamed from: nk$d */
    public static final class d {
        private Method a;
        private int b;

        public d() {
            if (VERSION.SDK_INT == 17) {
                try {
                    this.b = RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
                    this.a = RouteInfo.class.getMethod("getStatusCode", new Class[0]);
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean a(Object obj) {
            RouteInfo routeInfo = (RouteInfo) obj;
            Method method = this.a;
            if (method != null) {
                try {
                    if (((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.b) {
                        return true;
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: nk$e */
    public static final class e {
        public static Display a(Object obj) {
            try {
                return ((RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                return null;
            }
        }
    }
}
