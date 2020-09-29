package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: eza reason: default package */
public interface eza extends defpackage.eyz.a {

    /* renamed from: eza$a */
    public static class a implements TypeEvaluator<d> {
        public static final TypeEvaluator<d> a = new a();
        private final d b = new d(0);

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            d dVar = (d) obj;
            d dVar2 = (d) obj2;
            this.b.a(ezu.a(dVar.a, dVar2.a, f), ezu.a(dVar.b, dVar2.b, f), ezu.a(dVar.c, dVar2.c, f));
            return this.b;
        }
    }

    /* renamed from: eza$b */
    public static class b extends Property<eza, d> {
        public static final Property<eza, d> a = new b("circularReveal");

        public final /* synthetic */ Object get(Object obj) {
            return ((eza) obj).c();
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((eza) obj).a((d) obj2);
        }

        private b(String str) {
            super(d.class, str);
        }
    }

    /* renamed from: eza$c */
    public static class c extends Property<eza, Integer> {
        public static final Property<eza, Integer> a = new c("circularRevealScrimColor");

        public final /* synthetic */ Object get(Object obj) {
            return Integer.valueOf(((eza) obj).d());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((eza) obj).c_(((Integer) obj2).intValue());
        }

        private c(String str) {
            super(Integer.class, str);
        }
    }

    /* renamed from: eza$d */
    public static class d {
        public float a;
        public float b;
        public float c;

        /* synthetic */ d(byte b2) {
            this();
        }

        private d() {
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
