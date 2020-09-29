package defpackage;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: wvq reason: default package */
public abstract class wvq {
    static final wyc a = wyd.a(wvq.class);
    private static volatile wvq b = new a();

    /* renamed from: wvq$a */
    static final class a extends wvq {
        private final Constructor<?> b;

        a() {
            String str;
            Constructor<?> constructor = null;
            try {
                str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                    public final /* synthetic */ Object run() {
                        return wxu.b("io.netty.customResourceLeakDetector");
                    }
                });
            } catch (Throwable th) {
                wvq.a.e("Could not access System property: io.netty.customResourceLeakDetector", th);
                str = null;
            }
            if (str != null) {
                constructor = a(str);
            }
            this.b = constructor;
        }

        private static Constructor<?> a(String str) {
            try {
                Class cls = Class.forName(str, true, PlatformDependent.o());
                if (ResourceLeakDetector.class.isAssignableFrom(cls)) {
                    return cls.getConstructor(new Class[]{Class.class, Integer.TYPE, Long.TYPE});
                }
                wvq.a.d("Class {} does not inherit from ResourceLeakDetector.", (Object) str);
                return null;
            } catch (Throwable th) {
                wvq.a.d("Could not load custom resource leak detector class provided: {}", str, th);
            }
        }

        public final <T> ResourceLeakDetector<T> a(Class<T> cls, int i, long j) {
            Constructor<?> constructor = this.b;
            if (constructor != null) {
                try {
                    ResourceLeakDetector<T> resourceLeakDetector = (ResourceLeakDetector) constructor.newInstance(new Object[]{cls, Integer.valueOf(128), Long.valueOf(Long.MAX_VALUE)});
                    wvq.a.b("Loaded custom ResourceLeakDetector: {}", (Object) this.b.getDeclaringClass().getName());
                    return resourceLeakDetector;
                } catch (Throwable th) {
                    wvq.a.c("Could not load custom resource leak detector provided: {} with the given resource: {}", this.b.getDeclaringClass().getName(), cls, th);
                }
            }
            ResourceLeakDetector<T> resourceLeakDetector2 = new ResourceLeakDetector<>(cls, 128, Long.MAX_VALUE);
            wvq.a.b("Loaded default ResourceLeakDetector: {}", (Object) resourceLeakDetector2);
            return resourceLeakDetector2;
        }
    }

    public static wvq a() {
        return b;
    }

    public final <T> ResourceLeakDetector<T> a(Class<T> cls) {
        return a(cls, 128, Long.MAX_VALUE);
    }

    public abstract <T> ResourceLeakDetector<T> a(Class<T> cls, int i, long j);
}
