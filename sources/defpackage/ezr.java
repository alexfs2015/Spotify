package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: ezr reason: default package */
public interface ezr extends defpackage.ezq.a {

    /* renamed from: ezr$a */
    public static class a implements TypeEvaluator<d> {
        public static final TypeEvaluator<d> a = new a();
        private final d b = new d(0);

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            d dVar = (d) obj;
            d dVar2 = (d) obj2;
            this.b.a(fal.a(dVar.a, dVar2.a, f), fal.a(dVar.b, dVar2.b, f), fal.a(dVar.c, dVar2.c, f));
            return this.b;
        }
    }

    /* renamed from: ezr$b */
    public static class b extends Property<ezr, d> {
        public static final Property<ezr, d> a = new b("circularReveal");

        private b(String str) {
            super(d.class, str);
        }

        public final /* synthetic */ Object get(Object obj) {
            return ((ezr) obj).c();
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((ezr) obj).a((d) obj2);
        }
    }

    /* renamed from: ezr$c */
    public static class c extends Property<ezr, Integer> {
        public static final Property<ezr, Integer> a = new c("circularRevealScrimColor");

        private c(String str) {
            super(Integer.class, str);
        }

        public final /* synthetic */ Object get(Object obj) {
            return Integer.valueOf(((ezr) obj).d());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((ezr) obj).c_(((Integer) obj2).intValue());
        }
    }

    /* renamed from: ezr$d */
    public static class d {
        public float a;
        public float b;
        public float c;

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public d(d dVar) {
            this(dVar.a, dVar.b, dVar.c);
        }

        public final void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public final void a(d dVar) {
            a(dVar.a, dVar.b, dVar.c);
        }

        public final boolean a() {
            return this.c == Float.MAX_VALUE;
        }
    }

    void a();

    void a(Drawable drawable);

    void a(d dVar);

    void b();

    d c();

    void c_(int i);

    int d();
}
