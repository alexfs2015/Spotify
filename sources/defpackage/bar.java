package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;

/* renamed from: bar reason: default package */
final class bar {
    private static final byte[] b = {0, 7, 8, 15};
    private static final byte[] c = {0, 119, -120, -1};
    private static final byte[] d = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    final h a;
    private final Paint e = new Paint();
    private final Paint f;
    private final Canvas g;
    private final b h;
    private final a i;
    private Bitmap j;

    /* renamed from: bar$a */
    static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: bar$b */
    static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: bar$c */
    static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* renamed from: bar$d */
    static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;
        private int d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.d = i;
            this.a = i2;
            this.b = i3;
            this.c = sparseArray;
        }
    }

    /* renamed from: bar$e */
    static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: bar$f */
    static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;
        private int k;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = i4;
            this.k = i5;
            this.e = i6;
            this.f = i7;
            this.g = i8;
            this.h = i9;
            this.i = i10;
            this.j = sparseArray;
        }

        public final void a(f fVar) {
            if (fVar != null) {
                SparseArray<g> sparseArray = fVar.j;
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    this.j.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                }
            }
        }
    }

    /* renamed from: bar$g */
    static final class g {
        public final int a;
        public final int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.c = i;
            this.d = i2;
            this.a = i3;
            this.b = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: bar$h */
    static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public bar(int i2, int i3) {
        this.e.setStyle(Style.FILL_AND_STROKE);
        this.e.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.e.setPathEffect(null);
        this.f = new Paint();
        this.f.setStyle(Style.FILL);
        this.f.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f.setPathEffect(null);
        this.g = new Canvas();
        b bVar = new b(719, 575, 0, 719, 0, 575);
        this.h = bVar;
        this.i = new a(0, a(), b(), c());
        this.a = new h(i2, i3);
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v11
      assigns: []
      uses: []
      mth insns count: 72
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[LOOP:0: B:1:0x0009->B:30:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(defpackage.bdz r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r12 = r2
            r3 = r4
        L_0x0013:
            r11 = 1
            goto L_0x0061
        L_0x0015:
            boolean r4 = r13.e()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.c(r6)
            int r4 = r4 + r6
            int r3 = r13.c(r3)
        L_0x0025:
            r12 = r2
            r11 = r4
            goto L_0x0061
        L_0x0028:
            boolean r4 = r13.e()
            if (r4 == 0) goto L_0x0031
            r12 = r2
            r3 = 0
            goto L_0x0013
        L_0x0031:
            int r4 = r13.c(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005a
            if (r4 == r3) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            r12 = r2
            r3 = 0
            r11 = 0
            goto L_0x0061
        L_0x0041:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 29
            int r3 = r13.c(r3)
            goto L_0x0025
        L_0x004e:
            r4 = 4
            int r4 = r13.c(r4)
            int r4 = r4 + 12
            int r3 = r13.c(r3)
            goto L_0x0025
        L_0x005a:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L_0x0061
        L_0x005e:
            r3 = 0
            r11 = 0
            r12 = 1
        L_0x0061:
            if (r11 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            if (r15 == 0) goto L_0x0069
            byte r3 = r15[r3]
        L_0x0069:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007f:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x0083
            return r10
        L_0x0083:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bar.a(bdz, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static c a(bdz bdz) {
        byte[] bArr;
        int c2 = bdz.c(16);
        bdz.b(4);
        int c3 = bdz.c(2);
        boolean e2 = bdz.e();
        bdz.b(1);
        byte[] bArr2 = null;
        if (c3 == 1) {
            bdz.b(bdz.c(8) << 4);
        } else if (c3 == 0) {
            int c4 = bdz.c(16);
            int c5 = bdz.c(16);
            if (c4 > 0) {
                bArr2 = new byte[c4];
                bdz.b(bArr2, 0, c4);
            }
            if (c5 > 0) {
                bArr = new byte[c5];
                bdz.b(bArr, 0, c5);
                return new c(c2, e2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(c2, e2, bArr2, bArr);
    }

    private static f a(bdz bdz, int i2) {
        int i3;
        int i4;
        bdz bdz2 = bdz;
        int c2 = bdz2.c(8);
        bdz2.b(4);
        boolean e2 = bdz.e();
        bdz2.b(3);
        int i5 = 16;
        int c3 = bdz2.c(16);
        int c4 = bdz2.c(16);
        int c5 = bdz2.c(3);
        int c6 = bdz2.c(3);
        int i6 = 2;
        bdz2.b(2);
        int c7 = bdz2.c(8);
        int c8 = bdz2.c(8);
        int c9 = bdz2.c(4);
        int c10 = bdz2.c(2);
        bdz2.b(2);
        int i7 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int c11 = bdz2.c(i5);
            int c12 = bdz2.c(i6);
            int c13 = bdz2.c(i6);
            int c14 = bdz2.c(12);
            int i8 = c10;
            bdz2.b(4);
            int c15 = bdz2.c(12);
            i7 -= 6;
            if (c12 == 1 || c12 == 2) {
                i7 -= 2;
                i4 = bdz2.c(8);
                i3 = bdz2.c(8);
            } else {
                i4 = 0;
                i3 = 0;
            }
            g gVar = new g(c12, c13, c14, c15, i4, i3);
            sparseArray.put(c11, gVar);
            c10 = i8;
            i6 = 2;
            i5 = 16;
        }
        f fVar = new f(c2, e2, c3, c4, c5, c6, c7, c8, c9, c10, sparseArray);
        return fVar;
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i5 = i2;
        byte[] bArr4 = bArr;
        bdz bdz = new bdz(bArr);
        int i6 = i3;
        int i7 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (bdz.a() != 0) {
            int c2 = bdz.c(8);
            if (c2 != 240) {
                switch (c2) {
                    case 16:
                        if (i5 != 3) {
                            if (i5 != 2) {
                                bArr2 = null;
                                i6 = a(bdz, iArr, bArr2, i6, i7, paint, canvas);
                                bdz.f();
                                break;
                            } else {
                                bArr3 = bArr6 == null ? b : bArr6;
                            }
                        } else {
                            bArr3 = bArr5 == null ? c : bArr5;
                        }
                        bArr2 = bArr3;
                        i6 = a(bdz, iArr, bArr2, i6, i7, paint, canvas);
                        bdz.f();
                    case 17:
                        i6 = b(bdz, iArr, i5 == 3 ? d : null, i6, i7, paint, canvas);
                        bdz.f();
                        break;
                    case 18:
                        i6 = c(bdz, iArr, null, i6, i7, paint, canvas);
                        break;
                    default:
                        switch (c2) {
                            case 32:
                                bArr6 = a(4, 4, bdz);
                                break;
                            case 33:
                                bArr5 = a(4, 8, bdz);
                                break;
                            case 34:
                                bArr5 = a(16, 8, bdz);
                                break;
                        }
                }
            } else {
                i7 += 2;
                i6 = i3;
            }
        }
    }

    private static byte[] a(int i2, int i3, bdz bdz) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) bdz.c(i3);
        }
        return bArr;
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v10
      assigns: []
      uses: []
      mth insns count: 77
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f A[LOOP:0: B:1:0x0009->B:33:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(defpackage.bdz r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.c(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0017
            r12 = r2
            r3 = r4
        L_0x0014:
            r11 = 1
            goto L_0x006f
        L_0x0017:
            boolean r4 = r13.e()
            r7 = 3
            if (r4 != 0) goto L_0x002e
            int r3 = r13.c(r7)
            if (r3 == 0) goto L_0x002a
            int r3 = r3 + 2
            r12 = r2
            r11 = r3
            r3 = 0
            goto L_0x006f
        L_0x002a:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L_0x006f
        L_0x002e:
            boolean r4 = r13.e()
            if (r4 != 0) goto L_0x0040
            int r4 = r13.c(r5)
            int r4 = r4 + r3
            int r3 = r13.c(r3)
        L_0x003d:
            r12 = r2
            r11 = r4
            goto L_0x006f
        L_0x0040:
            int r4 = r13.c(r5)
            if (r4 == 0) goto L_0x006c
            if (r4 == r6) goto L_0x0068
            if (r4 == r5) goto L_0x005d
            if (r4 == r7) goto L_0x0050
            r12 = r2
            r3 = 0
            r11 = 0
            goto L_0x006f
        L_0x0050:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 25
            int r3 = r13.c(r3)
            goto L_0x003d
        L_0x005d:
            int r4 = r13.c(r3)
            int r4 = r4 + 9
            int r3 = r13.c(r3)
            goto L_0x003d
        L_0x0068:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L_0x006f
        L_0x006c:
            r12 = r2
            r3 = 0
            goto L_0x0014
        L_0x006f:
            if (r11 == 0) goto L_0x008b
            if (r8 == 0) goto L_0x008b
            if (r15 == 0) goto L_0x0077
            byte r3 = r15[r3]
        L_0x0077:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008b:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x008f
            return r10
        L_0x008f:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bar.b(bdz, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static a b(bdz bdz, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        bdz bdz2 = bdz;
        int i8 = 8;
        int c2 = bdz2.c(8);
        bdz2.b(8);
        int i9 = 2;
        int i10 = i2 - 2;
        int[] a2 = a();
        int[] b2 = b();
        int[] c3 = c();
        while (i10 > 0) {
            int c4 = bdz2.c(i8);
            int c5 = bdz2.c(i8);
            int i11 = i10 - 2;
            int[] iArr = (c5 & 128) != 0 ? a2 : (c5 & 64) != 0 ? b2 : c3;
            if ((c5 & 1) != 0) {
                i6 = bdz2.c(i8);
                i5 = bdz2.c(i8);
                i4 = bdz2.c(i8);
                i3 = bdz2.c(i8);
                i7 = i11 - 4;
            } else {
                i4 = bdz2.c(4) << 4;
                i7 = i11 - 2;
                i3 = bdz2.c(i9) << 6;
                i6 = bdz2.c(6) << i9;
                i5 = bdz2.c(4) << 4;
            }
            if (i6 == 0) {
                i5 = 0;
                i4 = 0;
                i3 = 255;
            }
            byte b3 = (byte) (255 - (i3 & 255));
            int i12 = i7;
            double d2 = (double) i6;
            int i13 = c2;
            double d3 = (double) (i5 - 128);
            Double.isNaN(d3);
            double d4 = 1.402d * d3;
            Double.isNaN(d2);
            int[] iArr2 = iArr;
            int i14 = (int) (d2 + d4);
            double d5 = (double) (i4 - 128);
            Double.isNaN(d5);
            double d6 = 0.34414d * d5;
            Double.isNaN(d2);
            double d7 = d2 - d6;
            Double.isNaN(d3);
            int i15 = (int) (d7 - (d3 * 0.71414d));
            Double.isNaN(d5);
            double d8 = d5 * 1.772d;
            Double.isNaN(d2);
            iArr2[c4] = a(b3, ben.a(i14, 0, 255), ben.a(i15, 0, 255), ben.a((int) (d2 + d8), 0, 255));
            i10 = i12;
            c2 = i13;
            i8 = 8;
            i9 = 2;
        }
        return new a(c2, a2, b2, c3);
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int c(bdz bdz, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int i5;
        bdz bdz2 = bdz;
        int i6 = i3;
        Paint paint2 = paint;
        int i7 = i2;
        boolean z2 = false;
        while (true) {
            int c2 = bdz.c(8);
            if (c2 != 0) {
                z = z2;
                i5 = c2;
                i4 = 1;
            } else if (!bdz.e()) {
                int c3 = bdz.c(7);
                if (c3 != 0) {
                    z = z2;
                    i4 = c3;
                    i5 = 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                    z = true;
                }
            } else {
                int c4 = bdz.c(7);
                i5 = bdz.c(8);
                z = z2;
                i4 = c4;
            }
            if (!(i4 == 0 || paint2 == null)) {
                paint2.setColor(iArr[i5]);
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) i7, (float) i6, (float) (i7 + i4), (float) (i6 + 1), paint);
            }
            i7 += i4;
            if (z) {
                return i7;
            }
            z2 = z;
        }
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = 255;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = a(255, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = a(255, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = a(255, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = a(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.azz> a(byte[] r33, int r34) {
        /*
            r32 = this;
            r0 = r32
            bdz r1 = new bdz
            r2 = r33
            r3 = r34
            r1.<init>(r2, r3)
        L_0x000b:
            int r2 = r1.a()
            r3 = 48
            r4 = 3
            r5 = 2
            r7 = 1
            if (r2 < r3) goto L_0x0178
            r2 = 8
            int r3 = r1.c(r2)
            r8 = 15
            if (r3 != r8) goto L_0x0178
            bar$h r3 = r0.a
            int r8 = r1.c(r2)
            r9 = 16
            int r10 = r1.c(r9)
            int r11 = r1.c(r9)
            int r12 = r1.c()
            int r12 = r12 + r11
            int r13 = r11 << 3
            int r14 = r1.a()
            if (r13 <= r14) goto L_0x004c
            java.lang.String r2 = "DvbParser"
            java.lang.String r3 = "Data field length exceeds limit"
            defpackage.bdu.c(r2, r3)
            int r2 = r1.a()
            r1.b(r2)
            goto L_0x000b
        L_0x004c:
            r13 = 4
            switch(r8) {
                case 16: goto L_0x00fe;
                case 17: goto L_0x00d9;
                case 18: goto L_0x00b7;
                case 19: goto L_0x0095;
                case 20: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x015f
        L_0x0052:
            int r2 = r3.a
            if (r10 != r2) goto L_0x015f
            r1.b(r13)
            boolean r2 = r1.e()
            r1.b(r4)
            int r14 = r1.c(r9)
            int r15 = r1.c(r9)
            if (r2 == 0) goto L_0x0083
            int r2 = r1.c(r9)
            int r4 = r1.c(r9)
            int r5 = r1.c(r9)
            int r8 = r1.c(r9)
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r8
            goto L_0x008b
        L_0x0083:
            r17 = r14
            r19 = r15
            r16 = 0
            r18 = 0
        L_0x008b:
            bar$b r2 = new bar$b
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r3.h = r2
            goto L_0x015f
        L_0x0095:
            int r2 = r3.a
            if (r10 != r2) goto L_0x00a6
            bar$c r2 = a(r1)
            android.util.SparseArray<bar$c> r3 = r3.e
            int r4 = r2.a
            r3.put(r4, r2)
            goto L_0x015f
        L_0x00a6:
            int r2 = r3.b
            if (r10 != r2) goto L_0x015f
            bar$c r2 = a(r1)
            android.util.SparseArray<bar$c> r3 = r3.g
            int r4 = r2.a
            r3.put(r4, r2)
            goto L_0x015f
        L_0x00b7:
            int r2 = r3.a
            if (r10 != r2) goto L_0x00c8
            bar$a r2 = b(r1, r11)
            android.util.SparseArray<bar$a> r3 = r3.d
            int r4 = r2.a
            r3.put(r4, r2)
            goto L_0x015f
        L_0x00c8:
            int r2 = r3.b
            if (r10 != r2) goto L_0x015f
            bar$a r2 = b(r1, r11)
            android.util.SparseArray<bar$a> r3 = r3.f
            int r4 = r2.a
            r3.put(r4, r2)
            goto L_0x015f
        L_0x00d9:
            bar$d r2 = r3.i
            int r4 = r3.a
            if (r10 != r4) goto L_0x015f
            if (r2 == 0) goto L_0x015f
            bar$f r4 = a(r1, r11)
            int r2 = r2.b
            if (r2 != 0) goto L_0x00f6
            android.util.SparseArray<bar$f> r2 = r3.c
            int r5 = r4.a
            java.lang.Object r2 = r2.get(r5)
            bar$f r2 = (defpackage.bar.f) r2
            r4.a(r2)
        L_0x00f6:
            android.util.SparseArray<bar$f> r2 = r3.c
            int r3 = r4.a
            r2.put(r3, r4)
            goto L_0x015f
        L_0x00fe:
            int r4 = r3.a
            if (r10 != r4) goto L_0x015f
            bar$d r4 = r3.i
            int r8 = r1.c(r2)
            int r10 = r1.c(r13)
            int r13 = r1.c(r5)
            r1.b(r5)
            int r11 = r11 + -2
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
        L_0x011a:
            if (r11 <= 0) goto L_0x013a
            int r14 = r1.c(r2)
            r1.b(r2)
            int r15 = r1.c(r9)
            int r2 = r1.c(r9)
            int r11 = r11 + -6
            bar$e r9 = new bar$e
            r9.<init>(r15, r2)
            r5.put(r14, r9)
            r2 = 8
            r9 = 16
            goto L_0x011a
        L_0x013a:
            bar$d r2 = new bar$d
            r2.<init>(r8, r10, r13, r5)
            int r5 = r2.b
            if (r5 == 0) goto L_0x0155
            r3.i = r2
            android.util.SparseArray<bar$f> r2 = r3.c
            r2.clear()
            android.util.SparseArray<bar$a> r2 = r3.d
            r2.clear()
            android.util.SparseArray<bar$c> r2 = r3.e
            r2.clear()
            goto L_0x015f
        L_0x0155:
            if (r4 == 0) goto L_0x015f
            int r4 = r4.a
            int r5 = r2.a
            if (r4 == r5) goto L_0x015f
            r3.i = r2
        L_0x015f:
            int r2 = r1.c()
            int r12 = r12 - r2
            int r2 = r1.c
            if (r2 != 0) goto L_0x016a
            r6 = 1
            goto L_0x016b
        L_0x016a:
            r6 = 0
        L_0x016b:
            defpackage.bdl.b(r6)
            int r2 = r1.b
            int r2 = r2 + r12
            r1.b = r2
            r1.g()
            goto L_0x000b
        L_0x0178:
            bar$h r1 = r0.a
            bar$d r1 = r1.i
            if (r1 != 0) goto L_0x0183
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L_0x0183:
            bar$h r1 = r0.a
            bar$b r1 = r1.h
            if (r1 == 0) goto L_0x018e
            bar$h r1 = r0.a
            bar$b r1 = r1.h
            goto L_0x0190
        L_0x018e:
            bar$b r1 = r0.h
        L_0x0190:
            android.graphics.Bitmap r2 = r0.j
            if (r2 == 0) goto L_0x01aa
            int r2 = r1.a
            int r2 = r2 + r7
            android.graphics.Bitmap r3 = r0.j
            int r3 = r3.getWidth()
            if (r2 != r3) goto L_0x01aa
            int r2 = r1.b
            int r2 = r2 + r7
            android.graphics.Bitmap r3 = r0.j
            int r3 = r3.getHeight()
            if (r2 == r3) goto L_0x01bf
        L_0x01aa:
            int r2 = r1.a
            int r2 = r2 + r7
            int r3 = r1.b
            int r3 = r3 + r7
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r8)
            r0.j = r2
            android.graphics.Canvas r2 = r0.g
            android.graphics.Bitmap r3 = r0.j
            r2.setBitmap(r3)
        L_0x01bf:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            bar$h r3 = r0.a
            bar$d r3 = r3.i
            android.util.SparseArray<bar$e> r3 = r3.c
            r8 = 0
        L_0x01cb:
            int r9 = r3.size()
            if (r8 >= r9) goto L_0x034e
            java.lang.Object r9 = r3.valueAt(r8)
            bar$e r9 = (defpackage.bar.e) r9
            int r10 = r3.keyAt(r8)
            bar$h r11 = r0.a
            android.util.SparseArray<bar$f> r11 = r11.c
            java.lang.Object r10 = r11.get(r10)
            bar$f r10 = (defpackage.bar.f) r10
            int r11 = r9.a
            int r12 = r1.c
            int r11 = r11 + r12
            int r9 = r9.b
            int r12 = r1.e
            int r9 = r9 + r12
            int r12 = r10.c
            int r12 = r12 + r11
            int r13 = r1.d
            int r12 = java.lang.Math.min(r12, r13)
            int r13 = r10.d
            int r13 = r13 + r9
            int r14 = r1.f
            int r13 = java.lang.Math.min(r13, r14)
            android.graphics.Canvas r14 = r0.g
            float r15 = (float) r11
            float r6 = (float) r9
            float r12 = (float) r12
            float r13 = (float) r13
            android.graphics.Region$Op r19 = android.graphics.Region.Op.REPLACE
            r21 = r15
            r16 = r6
            r17 = r12
            r18 = r13
            r14.clipRect(r15, r16, r17, r18, r19)
            bar$h r12 = r0.a
            android.util.SparseArray<bar$a> r12 = r12.d
            int r13 = r10.f
            java.lang.Object r12 = r12.get(r13)
            bar$a r12 = (defpackage.bar.a) r12
            if (r12 != 0) goto L_0x0232
            bar$h r12 = r0.a
            android.util.SparseArray<bar$a> r12 = r12.f
            int r13 = r10.f
            java.lang.Object r12 = r12.get(r13)
            bar$a r12 = (defpackage.bar.a) r12
            if (r12 != 0) goto L_0x0232
            bar$a r12 = r0.i
        L_0x0232:
            android.util.SparseArray<bar$g> r13 = r10.j
            r14 = 0
        L_0x0235:
            int r15 = r13.size()
            if (r14 >= r15) goto L_0x02be
            int r15 = r13.keyAt(r14)
            java.lang.Object r16 = r13.valueAt(r14)
            r7 = r16
            bar$g r7 = (defpackage.bar.g) r7
            bar$h r5 = r0.a
            android.util.SparseArray<bar$c> r5 = r5.e
            java.lang.Object r5 = r5.get(r15)
            bar$c r5 = (defpackage.bar.c) r5
            if (r5 != 0) goto L_0x025d
            bar$h r5 = r0.a
            android.util.SparseArray<bar$c> r5 = r5.g
            java.lang.Object r5 = r5.get(r15)
            bar$c r5 = (defpackage.bar.c) r5
        L_0x025d:
            if (r5 == 0) goto L_0x02a6
            boolean r15 = r5.b
            if (r15 == 0) goto L_0x0265
            r15 = 0
            goto L_0x0267
        L_0x0265:
            android.graphics.Paint r15 = r0.e
        L_0x0267:
            int r4 = r10.e
            r29 = r3
            int r3 = r7.a
            int r3 = r3 + r11
            int r7 = r7.b
            int r7 = r7 + r9
            r16 = r13
            android.graphics.Canvas r13 = r0.g
            r30 = r8
            r8 = 3
            if (r4 != r8) goto L_0x027f
            int[] r8 = r12.d
        L_0x027c:
            r31 = r2
            goto L_0x0288
        L_0x027f:
            r8 = 2
            if (r4 != r8) goto L_0x0285
            int[] r8 = r12.c
            goto L_0x027c
        L_0x0285:
            int[] r8 = r12.b
            goto L_0x027c
        L_0x0288:
            byte[] r2 = r5.c
            r22 = r2
            r23 = r8
            r24 = r4
            r25 = r3
            r26 = r7
            r27 = r15
            r28 = r13
            a(r22, r23, r24, r25, r26, r27, r28)
            byte[] r2 = r5.d
            r5 = 1
            int r26 = r7 + 1
            r22 = r2
            a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x02af
        L_0x02a6:
            r31 = r2
            r29 = r3
            r30 = r8
            r16 = r13
            r5 = 1
        L_0x02af:
            int r14 = r14 + 1
            r13 = r16
            r3 = r29
            r8 = r30
            r2 = r31
            r4 = 3
            r5 = 2
            r7 = 1
            goto L_0x0235
        L_0x02be:
            r31 = r2
            r29 = r3
            r30 = r8
            r5 = 1
            boolean r2 = r10.b
            if (r2 == 0) goto L_0x0307
            int r2 = r10.e
            r3 = 3
            if (r2 != r3) goto L_0x02d6
            int[] r2 = r12.d
            int r4 = r10.g
            r2 = r2[r4]
            r4 = 2
            goto L_0x02e8
        L_0x02d6:
            int r2 = r10.e
            r4 = 2
            if (r2 != r4) goto L_0x02e2
            int[] r2 = r12.c
            int r7 = r10.h
            r2 = r2[r7]
            goto L_0x02e8
        L_0x02e2:
            int[] r2 = r12.b
            int r7 = r10.i
            r2 = r2[r7]
        L_0x02e8:
            android.graphics.Paint r7 = r0.f
            r7.setColor(r2)
            android.graphics.Canvas r15 = r0.g
            int r2 = r10.c
            int r2 = r2 + r11
            float r2 = (float) r2
            int r7 = r10.d
            int r7 = r7 + r9
            float r7 = (float) r7
            android.graphics.Paint r8 = r0.f
            r16 = r21
            r17 = r6
            r18 = r2
            r19 = r7
            r20 = r8
            r15.drawRect(r16, r17, r18, r19, r20)
            goto L_0x0309
        L_0x0307:
            r3 = 3
            r4 = 2
        L_0x0309:
            android.graphics.Bitmap r2 = r0.j
            int r7 = r10.c
            int r8 = r10.d
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r2, r11, r9, r7, r8)
            azz r2 = new azz
            int r7 = r1.a
            float r7 = (float) r7
            float r14 = r21 / r7
            r15 = 0
            int r7 = r1.b
            float r7 = (float) r7
            float r16 = r6 / r7
            r17 = 0
            int r6 = r10.c
            float r6 = (float) r6
            int r7 = r1.a
            float r7 = (float) r7
            float r18 = r6 / r7
            int r6 = r10.d
            float r6 = (float) r6
            int r7 = r1.b
            float r7 = (float) r7
            float r19 = r6 / r7
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r6 = r31
            r6.add(r2)
            android.graphics.Canvas r2 = r0.g
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR
            r8 = 0
            r2.drawColor(r8, r7)
            int r2 = r30 + 1
            r8 = r2
            r2 = r6
            r3 = r29
            r4 = 3
            r5 = 2
            r7 = 1
            goto L_0x01cb
        L_0x034e:
            r6 = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bar.a(byte[], int):java.util.List");
    }
}
