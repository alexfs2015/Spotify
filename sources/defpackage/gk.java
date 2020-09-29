package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gk reason: default package */
class gk {
    ConcurrentHashMap<Long, b> c = new ConcurrentHashMap<>();

    /* renamed from: gk$a */
    interface a<T> {
        boolean a(T t);

        int b(T t);
    }

    gk() {
    }

    static long a(Typeface typeface) {
        String str = "Could not retrieve font from family.";
        String str2 = "TypefaceCompatBaseImpl";
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        }
    }

    protected static Typeface a(Context context, InputStream inputStream) {
        File a2 = gl.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!gl.a(a2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    private static <T> T a(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.b(t2) - i2) << 1) + (aVar.a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = gl.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!gl.a(a2, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(bVarArr, i).a);
            try {
                Typeface a2 = a(context, inputStream);
                gl.a((Closeable) inputStream);
                return a2;
            } catch (IOException unused) {
                gl.a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                gl.a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            gl.a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            gl.a((Closeable) inputStream2);
            throw th;
        }
    }

    public Typeface a(Context context, b bVar, Resources resources, int i) {
        c cVar = (c) a(bVar.a, i, new a<c>() {
            public final /* bridge */ /* synthetic */ boolean a(Object obj) {
                return ((c) obj).c;
            }

            public final /* bridge */ /* synthetic */ int b(Object obj) {
                return ((c) obj).b;
            }
        });
        if (cVar == null) {
            return null;
        }
        Typeface a2 = gf.a(context, resources, cVar.f, cVar.a, i);
        long a3 = a(a2);
        if (a3 != 0) {
            this.c.put(Long.valueOf(a3), bVar);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final b a(b[] bVarArr, int i) {
        return (b) a(bVarArr, i, new a<b>() {
            public final /* bridge */ /* synthetic */ boolean a(Object obj) {
                return ((b) obj).d;
            }

            public final /* bridge */ /* synthetic */ int b(Object obj) {
                return ((b) obj).c;
            }
        });
    }
}
