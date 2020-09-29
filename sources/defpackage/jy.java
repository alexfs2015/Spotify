package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import defpackage.jy;
import java.util.ArrayList;

/* renamed from: jy reason: default package */
public abstract class jy<T extends jy<T>> implements b {
    public static final c a = new c("scaleX") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getScaleX();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    };
    public static final c b = new c("scaleY") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getScaleY();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    };
    public static final c c = new c("x") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getX();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setX(f);
        }
    };
    public static final c d = new c("y") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getY();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setY(f);
        }
    };
    private static c k = new c("rotation") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getRotation();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    };
    private static c l = new c("rotationX") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getRotationX();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    };
    private static c m = new c("rotationY") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getRotationY();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    };
    private static c n = new c("alpha") {
        public final /* synthetic */ float a(Object obj) {
            return ((View) obj).getAlpha();
        }

        public final /* synthetic */ void a(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    };
    float e = 0.0f;
    float f = Float.MAX_VALUE;
    boolean g = false;
    public float h = Float.MAX_VALUE;
    public float i = (-this.h);
    float j;
    private boolean o = false;
    private Object p;
    private jz q;
    private long r = 0;
    private final ArrayList<b> s = new ArrayList<>();
    private final ArrayList<Object> t = new ArrayList<>();

    /* renamed from: jy$a */
    static class a {
        float a;
        float b;

        a() {
        }
    }

    /* renamed from: jy$b */
    public interface b {
        void onAnimationEnd(jy jyVar, boolean z, float f, float f2);
    }

    /* renamed from: jy$c */
    public static abstract class c extends jz<View> {
        private c(String str) {
            super(str);
        }

        /* synthetic */ c(String str, byte b) {
            this(str);
        }
    }

    static {
        new c("translationX") {
            public final /* synthetic */ float a(Object obj) {
                return ((View) obj).getTranslationX();
            }

            public final /* synthetic */ void a(Object obj, float f) {
                ((View) obj).setTranslationX(f);
            }
        };
        new c("translationY") {
            public final /* synthetic */ float a(Object obj) {
                return ((View) obj).getTranslationY();
            }

            public final /* synthetic */ void a(Object obj, float f) {
                ((View) obj).setTranslationY(f);
            }
        };
        new c("translationZ") {
            public final /* synthetic */ float a(Object obj) {
                return ip.p((View) obj);
            }

            public final /* synthetic */ void a(Object obj, float f) {
                ip.f((View) obj, f);
            }
        };
        new c("z") {
            public final /* synthetic */ float a(Object obj) {
                return ip.C((View) obj);
            }

            public final /* synthetic */ void a(Object obj, float f) {
                ip.g((View) obj, f);
            }
        };
        new c("scrollX") {
            public final /* synthetic */ float a(Object obj) {
                return (float) ((View) obj).getScrollX();
            }

            public final /* synthetic */ void a(Object obj, float f) {
                ((View) obj).setScrollX((int) f);
            }
        };
        new c("scrollY") {
            public final /* synthetic */ float a(Object obj) {
                return (float) ((View) obj).getScrollY();
            }

            public final /* synthetic */ void a(Object obj, float f) {
                ((View) obj).setScrollY((int) f);
            }
        };
    }

    <K> jy(K k2, jz<K> jzVar) {
        this.p = k2;
        this.q = jzVar;
        jz jzVar2 = this.q;
        if (jzVar2 == k || jzVar2 == l || jzVar2 == m) {
            this.j = 0.1f;
        } else if (jzVar2 == n) {
            this.j = 0.00390625f;
        } else if (jzVar2 == a || jzVar2 == b) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
    }

    private void a(float f2) {
        this.q.a(this.p, f2);
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            if (this.t.get(i2) != null) {
                this.t.get(i2);
            }
        }
        a(this.t);
    }

    private static <T> void a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final T a(b bVar) {
        if (!this.s.contains(bVar)) {
            this.s.add(bVar);
        }
        return this;
    }

    public void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            boolean z = this.g;
            if (!z && !z) {
                this.g = true;
                this.f = this.q.a(this.p);
                float f2 = this.f;
                if (f2 > this.h || f2 < this.i) {
                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                }
                jx a2 = jx.a();
                if (a2.b.size() == 0) {
                    a2.b().a();
                }
                if (!a2.b.contains(this)) {
                    a2.b.add(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public final boolean a(long j2) {
        long j3 = this.r;
        if (j3 == 0) {
            this.r = j2;
            a(this.f);
            return false;
        }
        long j4 = j2 - j3;
        this.r = j2;
        boolean b2 = b(j4);
        this.f = Math.min(this.f, this.h);
        this.f = Math.max(this.f, this.i);
        a(this.f);
        if (b2) {
            this.g = false;
            jx a2 = jx.a();
            a2.a.remove(this);
            int indexOf = a2.b.indexOf(this);
            if (indexOf >= 0) {
                a2.b.set(indexOf, null);
                a2.d = true;
            }
            this.r = 0;
            this.o = false;
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                if (this.s.get(i2) != null) {
                    ((b) this.s.get(i2)).onAnimationEnd(this, false, this.f, this.e);
                }
            }
            a(this.s);
        }
        return b2;
    }

    public final void b(b bVar) {
        ArrayList<b> arrayList = this.s;
        int indexOf = arrayList.indexOf(bVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean b(long j2);
}
