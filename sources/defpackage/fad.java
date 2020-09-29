package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fad reason: default package */
public final class fad {
    public float a;
    public float b;
    public float c;
    public float d;
    private final List<c> e = new ArrayList();

    /* renamed from: fad$a */
    public static class a extends c {
        private static final RectF d = new RectF();
        public float a;
        public float b;
        private float e;
        private float f;
        private float g;
        private float h;

        public a(float f2, float f3, float f4, float f5) {
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.c;
            matrix.invert(matrix2);
            path.transform(matrix2);
            d.set(this.e, this.f, this.g, this.h);
            path.arcTo(d, this.a, this.b, false);
            path.transform(matrix);
        }
    }

    /* renamed from: fad$b */
    public static class b extends c {
        float a;
        float b;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.c;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.a, this.b);
            path.transform(matrix);
        }
    }

    /* renamed from: fad$c */
    public static abstract class c {
        protected final Matrix c = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public fad() {
        a(0.0f, 0.0f);
    }

    public final void a(float f, float f2) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e.clear();
    }

    public final void b(float f, float f2) {
        b bVar = new b();
        bVar.a = f;
        bVar.b = 0.0f;
        this.e.add(bVar);
        this.c = f;
        this.d = 0.0f;
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        a aVar = new a(f, f2, f3, f4);
        aVar.a = f5;
        aVar.b = f6;
        this.e.add(aVar);
        double d2 = (double) (f5 + f6);
        this.c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d2))));
        this.d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d2))));
    }

    public final void a(Matrix matrix, Path path) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((c) this.e.get(i)).a(matrix, path);
        }
    }
}
