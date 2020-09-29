package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: nq reason: default package */
public final class nq {
    static final b b = new b() {
        public final boolean a(float[] fArr) {
            if (!(fArr[2] >= 0.95f)) {
                if (!(fArr[2] <= 0.05f)) {
                    if (!(fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f)) {
                        return true;
                    }
                }
            }
            return false;
        }
    };
    public final List<d> a;
    private final List<nr> c;
    private final Map<nr, d> d = new dp();
    private final SparseBooleanArray e = new SparseBooleanArray();
    private final d f = b();

    /* renamed from: nq$a */
    public static final class a {
        public int a = 16;
        private final List<d> b;
        private final Bitmap c;
        private final List<nr> d = new ArrayList();
        private int e = 12544;
        private int f = -1;
        private final List<b> g = new ArrayList();

        public a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.g.add(nq.b);
            this.c = bitmap;
            this.b = null;
            this.d.add(nr.a);
            this.d.add(nr.b);
            this.d.add(nr.c);
            this.d.add(nr.d);
            this.d.add(nr.e);
            this.d.add(nr.f);
        }

        private int[] a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return iArr;
        }

        private Bitmap b(Bitmap bitmap) {
            double d2 = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i = this.e;
                if (width > i) {
                    double d3 = (double) i;
                    double d4 = (double) width;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d2 = Math.sqrt(d3 / d4);
                }
            } else if (this.f > 0) {
                int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                int i2 = this.f;
                if (max > i2) {
                    double d5 = (double) i2;
                    double d6 = (double) max;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    d2 = d5 / d6;
                }
            }
            if (d2 <= 0.0d) {
                return bitmap;
            }
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d2);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d2), false);
        }

        public final AsyncTask<Bitmap, Void, nq> a(final c cVar) {
            if (cVar != null) {
                return new AsyncTask<Bitmap, Void, nq>() {
                    private nq a() {
                        try {
                            return a.this.a();
                        } catch (Exception e) {
                            Log.e("Palette", "Exception thrown during async generate", e);
                            return null;
                        }
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a();
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ void onPostExecute(Object obj) {
                        cVar.a((nq) obj);
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.c});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public final nq a() {
            b[] bVarArr;
            Bitmap bitmap = this.c;
            if (bitmap != null) {
                Bitmap b2 = b(bitmap);
                int[] a2 = a(b2);
                int i = this.a;
                if (this.g.isEmpty()) {
                    bVarArr = null;
                } else {
                    List<b> list = this.g;
                    bVarArr = (b[]) list.toArray(new b[list.size()]);
                }
                np npVar = new np(a2, i, bVarArr);
                if (b2 != this.c) {
                    b2.recycle();
                }
                nq nqVar = new nq(npVar.c, this.d);
                nqVar.a();
                return nqVar;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: nq$b */
    public interface b {
        boolean a(float[] fArr);
    }

    /* renamed from: nq$c */
    public interface c {
        void a(nq nqVar);
    }

    /* renamed from: nq$d */
    public static final class d {
        public final int a;
        final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public d(int i2, int i3) {
            this.c = Color.red(i2);
            this.d = Color.green(i2);
            this.e = Color.blue(i2);
            this.a = i2;
            this.b = i3;
        }

        private void b() {
            if (!this.f) {
                int a2 = gd.a(-1, this.a, 4.5f);
                int a3 = gd.a(-1, this.a, 3.0f);
                if (a2 == -1 || a3 == -1) {
                    int a4 = gd.a(-16777216, this.a, 4.5f);
                    int a5 = gd.a(-16777216, this.a, 3.0f);
                    if (a4 == -1 || a5 == -1) {
                        this.h = a2 != -1 ? gd.c(-1, a2) : gd.c(-16777216, a4);
                        this.g = a3 != -1 ? gd.c(-1, a3) : gd.c(-16777216, a5);
                        this.f = true;
                    } else {
                        this.h = gd.c(-16777216, a4);
                        this.g = gd.c(-16777216, a5);
                        this.f = true;
                    }
                } else {
                    this.h = gd.c(-1, a2);
                    this.g = gd.c(-1, a3);
                    this.f = true;
                }
            }
        }

        public final float[] a() {
            if (this.i == null) {
                this.i = new float[3];
            }
            gd.a(this.c, this.d, this.e, this.i);
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                d dVar = (d) obj;
                return this.b == dVar.b && this.a == dVar.a;
            }
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.a));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(a()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.b);
            sb.append(']');
            sb.append(" [Title Text: #");
            b();
            sb.append(Integer.toHexString(this.g));
            sb.append(']');
            sb.append(" [Body Text: #");
            b();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }
    }

    nq(List<d> list, List<nr> list2) {
        this.a = list;
        this.c = list2;
    }

    private int a(nr nrVar, int i) {
        d a2 = a(nrVar);
        return a2 != null ? a2.a : i;
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap);
    }

    private d a(nr nrVar) {
        return (d) this.d.get(nrVar);
    }

    private d b() {
        int size = this.a.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = (d) this.a.get(i2);
            if (dVar2.b > i) {
                i = dVar2.b;
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public final int a(int i) {
        return a(nr.b, i);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int size = this.c.size();
        char c2 = 0;
        int i = 0;
        while (i < size) {
            nr nrVar = (nr) this.c.get(i);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < 3; i2++) {
                float f4 = nrVar.i[i2];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (nrVar.i[i3] > 0.0f) {
                        float[] fArr = nrVar.i;
                        fArr[i3] = fArr[i3] / f3;
                    }
                }
            }
            Map<nr, d> map = this.d;
            int size2 = this.a.size();
            d dVar = null;
            int i4 = 0;
            float f5 = 0.0f;
            while (i4 < size2) {
                d dVar2 = (d) this.a.get(i4);
                float[] a2 = dVar2.a();
                if (a2[1] >= nrVar.g[c2] && a2[1] <= nrVar.g[2] && a2[2] >= nrVar.h[c2] && a2[2] <= nrVar.h[2] && !this.e.get(dVar2.a)) {
                    float[] a3 = dVar2.a();
                    d dVar3 = this.f;
                    int i5 = dVar3 != null ? dVar3.b : 1;
                    float abs = (nrVar.i[c2] > f2 ? (1.0f - Math.abs(a3[1] - nrVar.g[1])) * nrVar.i[c2] : 0.0f) + (nrVar.i[1] > f2 ? nrVar.i[1] * (1.0f - Math.abs(a3[2] - nrVar.h[1])) : 0.0f) + (nrVar.i[2] > 0.0f ? nrVar.i[2] * (((float) dVar2.b) / ((float) i5)) : 0.0f);
                    if (dVar == null || abs > f5) {
                        f5 = abs;
                        dVar = dVar2;
                    }
                }
                i4++;
                c2 = 0;
                f2 = 0.0f;
            }
            if (dVar != null && nrVar.j) {
                this.e.append(dVar.a, true);
            }
            map.put(nrVar, dVar);
            i++;
            c2 = 0;
        }
        this.e.clear();
    }

    public final int b(int i) {
        return a(nr.a, i);
    }

    public final int c(int i) {
        return a(nr.c, 0);
    }

    public final int d(int i) {
        return a(nr.e, i);
    }

    public final int e(int i) {
        return a(nr.d, 0);
    }

    public final int f(int i) {
        return a(nr.f, 0);
    }

    public final int g(int i) {
        d dVar = this.f;
        if (dVar != null) {
            return dVar.a;
        }
        return 0;
    }
}
