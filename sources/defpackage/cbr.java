package defpackage;

import dalvik.system.PathClassLoader;

/* renamed from: cbr reason: default package */
public final class cbr extends PathClassLoader {
    public cbr(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    /* access modifiers changed from: protected */
    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}