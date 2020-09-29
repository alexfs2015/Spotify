package defpackage;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: whk reason: default package */
public abstract class whk {
    static final wjw a = wjx.a(whk.class);
    private static volatile whk b = new a();

    /* renamed from: whk$a */
    static final class a extends whk {
        private final Constructor<?> b;

        a() {
            String str;
            Constructor<?> constructor = null;
            try {
                str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                    public final /* synthetic */ Object run() {
                        return wjo.b("io.netty.customResourceLeakDetector");
                    }
                });
            } catch (Throwable th) {
                whk.a.e("Could not access System property: io.netty.customResourceLeakDetector", th);
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
                whk.a.d("Class {} does not inherit from ResourceLeakDetector.", (Object) str);
                return null;
            } catch (Throwable th) {
                whk.a.d("Could not load custom resource leak detector class provided: {}", str, th);
            }
        }

        public final <T> ResourceLeakDetector<T> a(Class<T> cls, int i, long j) {
            Constructor<?> constructor = this.b;
            if (constructor != null) {
                try {
                    ResourceLeakDetector<T> resourceLeakDetector = (ResourceLeakDetector) constructor.newInstance(new Object[]{cls, Integer.valueOf(128), Long.valueOf(Long.MAX_VALUE)});
                    whk.a.b("Loaded custom ResourceLeakDetector: {}", (Object) this.b.getDeclaringClass().getName());
                    return resourceLeakDetector;
                } catch (Throwable th) {
                    whk.a.c("Could not load custom resource leak detector provided: {} with the given resource: {}", this.b.getDeclaringClass().getName(), cls, th);
                }
            }
            ResourceLeakDetector<T> resourceLeakDetector2 = new ResourceLeakDetector<>(cls, 128, Long.MAX_VALUE);
            whk.a.b("Loaded default ResourceLeakDetector: {}", (Object) resourceLeakDetector2);
            return resourceLeakDetector2;
        }
    }

    public abstract <T> ResourceLeakDetector<T> a(Class<T> cls, int i, long j);

    public static whk a() {
        return b;
    }

    public final <T> ResourceLeakDetector<T> a(Class<T> cls) {
        return a(cls, 128, Long.MAX_VALUE);
    }
}
