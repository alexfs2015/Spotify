package defpackage;

import android.animation.TimeInterpolator;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet.ExecutionOrder;
import java.util.Arrays;

/* renamed from: fxk reason: default package */
public final class fxk {

    /* renamed from: fxk$a */
    public static class a<T extends c> extends c {
        T a;
        final int b;
        protected TransformationSet c = new TransformationSet();

        public a(float f, float f2, int i, T t) {
            super(f, f2);
            this.b = i;
            this.a = t;
            this.c.a = i == 0 ? ExecutionOrder.SEQUENTIAL : ExecutionOrder.INDEPENDENT;
        }

        public final b<T> a(float f, float f2) {
            defpackage.fxm.a aVar = new defpackage.fxm.a(this.d, this.e, 1.0f, f2);
            fxm fxm = new fxm(null, aVar.a, aVar.b, aVar.c, aVar.d, null);
            this.c.b.add(fxm);
            if (this.b == 0) {
                this.d = 1.0f;
                this.e = f2;
            }
            return b.a(this, fxm);
        }

        public final T a() {
            this.a.a(this.c, this.d, this.e);
            return this.a;
        }

        /* access modifiers changed from: protected */
        public final void a(TransformationSet transformationSet, float f, float f2) {
            this.c.b.add(transformationSet);
            if (this.b == 0) {
                this.d = f;
                this.e = f2;
            }
        }
    }

    /* renamed from: fxk$b */
    public static class b<T extends c> extends a<T> {
        private fxm f;
        private a<T> g;

        private b(float f2, float f3, int i, T t, TransformationSet transformationSet) {
            super(f2, f3, i, t);
            this.c = transformationSet;
        }

        static <T extends c> b<T> a(a<T> aVar, fxm fxm) {
            b bVar = new b(aVar.d, aVar.e, aVar.b, aVar.a, aVar.c);
            bVar.g = aVar;
            bVar.f = fxm;
            return bVar;
        }

        public final a<T> a(fxl... fxlArr) {
            this.f.b = Arrays.asList(fxlArr);
            return this.g;
        }

        public final b<T> a(TimeInterpolator timeInterpolator) {
            this.f.a = timeInterpolator;
            return this;
        }
    }

    /* renamed from: fxk$c */
    public static abstract class c {
        float d;
        float e;

        public c(float f, float f2) {
            this.d = f;
            this.e = f2;
        }

        /* access modifiers changed from: protected */
        public abstract void a(TransformationSet transformationSet, float f, float f2);
    }

    /* renamed from: fxk$d */
    public static class d extends c {
        public TransformationSet a;

        public d(float f, float f2) {
            super(f, f2);
        }

        public final a<d> a() {
            return new a<>(this.d, this.e, 0, this);
        }

        /* access modifiers changed from: protected */
        public final void a(TransformationSet transformationSet, float f, float f2) {
            this.a = transformationSet;
        }
    }

    public static d a(float f, float f2) {
        return new d(0.0f, f2);
    }
}
