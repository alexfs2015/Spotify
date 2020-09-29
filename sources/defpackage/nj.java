package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nj reason: default package */
final class nj {

    /* renamed from: nj$a */
    public interface a {
        void a(Object obj);

        void b(Object obj);

        void c(Object obj);

        void d(Object obj);

        void e(Object obj);
    }

    /* renamed from: nj$b */
    static class b<T extends a> extends Callback {
        protected final T a;

        public b(T t) {
            this.a = t;
        }

        public void onRouteAdded(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.b(routeInfo);
        }

        public void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.d(routeInfo);
        }

        public void onRouteGrouped(MediaRouter mediaRouter, RouteInfo routeInfo, RouteGroup routeGroup, int i) {
        }

        public void onRouteRemoved(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.c(routeInfo);
        }

        public void onRouteSelected(MediaRouter mediaRouter, int i, RouteInfo routeInfo) {
            this.a.a(routeInfo);
        }

        public void onRouteUngrouped(MediaRouter mediaRouter, RouteInfo routeInfo, RouteGroup routeGroup) {
        }

        public void onRouteUnselected(MediaRouter mediaRouter, int i, RouteInfo routeInfo) {
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.e(routeInfo);
        }
    }

    /* renamed from: nj$c */
    public static final class c {
        private Method a;

        public c() {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }

        public final Object a(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            Method method = this.a;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    /* renamed from: nj$d */
    public static final class d {
        public static CharSequence a(Object obj, Context context) {
            return ((RouteInfo) obj).getName(context);
        }

        public static void a(Object obj, Object obj2) {
            ((RouteInfo) obj).setTag(obj2);
        }
    }

    /* renamed from: nj$e */
    public static final class e {
        Method a;

        public e() {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.a = MediaRouter.class.getMethod("selectRouteInt", new Class[]{Integer.TYPE, RouteInfo.class});
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: nj$f */
    public static final class f {
        public static void a(Object obj, int i) {
            ((UserRouteInfo) obj).setPlaybackType(i);
        }

        public static void a(Object obj, Object obj2) {
            ((UserRouteInfo) obj).setVolumeCallback((VolumeCallback) obj2);
        }

        public static void b(Object obj, int i) {
            ((UserRouteInfo) obj).setPlaybackStream(i);
        }

        public static void c(Object obj, int i) {
            ((UserRouteInfo) obj).setVolume(i);
        }

        public static void d(Object obj, int i) {
            ((UserRouteInfo) obj).setVolumeMax(i);
        }

        public static void e(Object obj, int i) {
            ((UserRouteInfo) obj).setVolumeHandling(i);
        }
    }

    /* renamed from: nj$g */
    public interface g {
        void a(Object obj, int i);

        void b(Object obj, int i);
    }

    /* renamed from: nj$h */
    static class h<T extends g> extends VolumeCallback {
        private T a;

        public h(T t) {
            this.a = t;
        }

        public final void onVolumeSetRequest(RouteInfo routeInfo, int i) {
            this.a.a(routeInfo, i);
        }

        public final void onVolumeUpdateRequest(RouteInfo routeInfo, int i) {
            this.a.b(routeInfo, i);
        }
    }

    public static Object a(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(8388611);
    }

    public static Object a(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, false);
    }

    public static Object a(g gVar) {
        return new h(gVar);
    }

    public static List a(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    public static void a(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((Callback) obj2);
    }

    public static Object b(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((RouteCategory) obj2);
    }
}
