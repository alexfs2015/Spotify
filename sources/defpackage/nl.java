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

/* renamed from: nl reason: default package */
public final class nl {
    static final b c = new b() {
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
    public final d b = b();
    private final List<nm> d;
    private final Map<nm, d> e = new dp();
    private final SparseBooleanArray f = new SparseBooleanArray();

    /* renamed from: nl$a */
    public static final class a {
        public int a = 16;
        private final List<d> b;
        private final Bitmap c;
        private final List<nm> d = new ArrayList();
        private int e = 12544;
        private int f = -1;
        private final List<b> g = new ArrayList();

        public a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.g.add(nl.c);
            this.c = bitmap;
            this.b = null;
            this.d.add(nm.a);
            this.d.add(nm.b);
            this.d.add(nm.c);
            this.d.add(nm.d);
            this.d.add(nm.e);
            this.d.add(nm.f);
        }

        public final nl a() {
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
                nk nkVar = new nk(a2, i, bVarArr);
                if (b2 != this.c) {
                    b2.recycle();
                }
                nl nlVar = new nl(nkVar.c, this.d);
                nlVar.a();
                return nlVar;
            }
            throw new AssertionError();
        }

        public final AsyncTask<Bitmap, Void, nl> a(final c cVar) {
            if (cVar != null) {
                return new AsyncTask<Bitmap, Void, nl>() {
                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a();
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ void onPostExecute(Object obj) {
                        cVar.a((nl) obj);
                    }

                    private nl a() {
                        try {
                            return a.this.a();
                        } catch (Exception e) {
                            Log.e("Palette", "Exception thrown during async generate", e);
                            return null;
                        }
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.c});
            }
            throw new IllegalArgumentException("listener can not be null");
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
    }

    /* renamed from: nl$b */
    public interface b {
        boolean a(float[] fArr);
    }

    /* renamed from: nl$c */
    public interface c {
        void a(nl nlVar);
    }

    /* renamed from: nl$d */
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

        public final float[] a() {
            if (this.i == null) {
                this.i = new float[3];
            }
            gd.a(this.c, this.d, this.e, this.i);
            return this.i;
        }

        private void b() {
            int i2;
            int i3;
            if (!this.f) {
                int a2 = gd.a(-1, this.a, 4.5f);
                int a3 = gd.a(-1, this.a, 3.0f);
                if (a2 == -1 || a3 == -1) {
                    int a4 = gd.a(-16777216, this.a, 4.5f);
                    int a5 = gd.a(-16777216, this.a, 3.0f);
                    if (a4 == -1 || a5 == -1) {
                        if (a2 != -1) {
                            i2 = gd.c(-1, a2);
                        } else {
                            i2 = gd.c(-16777216, a4);
                        }
                        this.h = i2;
                        if (a3 != -1) {
                            i3 = gd.c(-1, a3);
                        } else {
                            i3 = gd.c(-16777216, a5);
                        }
                        this.g = i3;
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
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap);
    }

    nl(List<d> list, List<nm> list2) {
        this.a = list;
        this.d = list2;
    }

    public final int a(int i) {
        return a(nm.b, i);
    }

    public final int b(int i) {
        return a(nm.a, i);
    }

    public final int c(int i) {
        return a(nm.e, i);
    }

    private d a(nm nmVar) {
        return (d) this.e.get(nmVar);
    }

    public final int a(nm nmVar, int i) {
        d a2 = a(nmVar);
        return a2 != null ? a2.a : i;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int i;
        int size = this.d.size();
        char c2 = 0;
        int i2 = 0;
        while (i2 < size) {
            nm nmVar = (nm) this.d.get(i2);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i3 = 0; i3 < 3; i3++) {
                float f4 = nmVar.i[i3];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                for (int i4 = 0; i4 < 3; i4++) {
                    if (nmVar.i[i4] > 0.0f) {
                        float[] fArr = nmVar.i;
                        fArr[i4] = fArr[i4] / f3;
                    }
                }
            }
            Map<nm, d> map = this.e;
            int size2 = this.a.size();
            d dVar = null;
            int i5 = 0;
            float f5 = 0.0f;
            while (i5 < size2) {
                d dVar2 = (d) this.a.get(i5);
                float[] a2 = dVar2.a();
                if (a2[1] >= nmVar.g[c2] && a2[1] <= nmVar.g[2] && a2[2] >= nmVar.h[c2] && a2[2] <= nmVar.h[2] && !this.f.get(dVar2.a)) {
                    float[] a3 = dVar2.a();
                    d dVar3 = this.b;
                    if (dVar3 != null) {
                        i = dVar3.b;
                    } else {
                        i = 1;
                    }
                    float abs = (nmVar.i[c2] > f2 ? (1.0f - Math.abs(a3[1] - nmVar.g[1])) * nmVar.i[c2] : 0.0f) + (nmVar.i[1] > f2 ? nmVar.i[1] * (1.0f - Math.abs(a3[2] - nmVar.h[1])) : 0.0f) + (nmVar.i[2] > 0.0f ? nmVar.i[2] * (((float) dVar2.b) / ((float) i)) : 0.0f);
                    if (dVar == null || abs > f5) {
                        f5 = abs;
                        dVar = dVar2;
                    }
                }
                i5++;
                c2 = 0;
                f2 = 0.0f;
            }
            if (dVar != null && nmVar.j) {
                this.f.append(dVar.a, true);
            }
            map.put(nmVar, dVar);
            i2++;
            c2 = 0;
        }
        this.f.clear();
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
}
