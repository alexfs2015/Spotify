package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: jw reason: default package */
public final class jw {
    private static final Interpolator v = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public int i;
    public View j;
    private int k = -1;
    private int[] l;
    private int[] m;
    private int[] n;
    private int o;
    private VelocityTracker p;
    private float q;
    private OverScroller r;
    private final a s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new Runnable() {
        public final void run() {
            jw.this.b(0);
        }
    };

    /* renamed from: jw$a */
    public static abstract class a {
        public int a(View view) {
            return 0;
        }

        public void a() {
        }

        public void a(int i) {
        }

        public void a(int i, int i2) {
        }

        public void a(View view, float f, float f2) {
        }

        public void a(View view, int i) {
        }

        public void a(View view, int i, int i2, int i3) {
        }

        public int b() {
            return 0;
        }

        public abstract boolean b(View view, int i);

        public int c(View view, int i) {
            return 0;
        }

        public int d(View view, int i) {
            return 0;
        }
    }

    private jw(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.u = viewGroup;
            this.s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.h = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private static float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            if (f2 > 0.0f) {
                return f4;
            }
            f2 = -f4;
        }
        return f2;
    }

    private int a(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f2 = (float) (width / 2);
        float a2 = f2 + (a(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int b2 = b(i4, (int) this.g, (int) this.q);
        int b3 = b(i5, (int) this.g, (int) this.q);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (b2 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f6 = f3 / f2;
        if (b3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f7 = f5 / f4;
        return (int) ((((float) a(i2, b2, this.s.a(view))) * f6) + (((float) a(i3, b3, this.s.b())) * f7));
    }

    public static jw a(ViewGroup viewGroup, float f2, a aVar) {
        jw a2 = a(viewGroup, aVar);
        a2.b = (int) (((float) a2.b) * (1.0f / f2));
        return a2;
    }

    public static jw a(ViewGroup viewGroup, a aVar) {
        return new jw(viewGroup.getContext(), viewGroup, aVar);
    }

    private void a(float f2, float f3) {
        this.t = true;
        this.s.a(this.j, f2, f3);
        this.t = false;
        if (this.a == 1) {
            b(0);
        }
    }

    private void a(float f2, float f3, int i2) {
        float[] fArr = this.c;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            float[] fArr6 = this.c;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.d;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.e;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.l;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.m;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.n;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.c = fArr2;
            this.d = fArr3;
            this.e = fArr4;
            this.f = fArr5;
            this.l = iArr;
            this.m = iArr2;
            this.n = iArr3;
        }
        float[] fArr10 = this.c;
        this.e[i2] = f2;
        fArr10[i2] = f2;
        float[] fArr11 = this.d;
        this.f[i2] = f3;
        fArr11[i2] = f3;
        int[] iArr7 = this.l;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.u.getLeft() + this.h) {
            i3 = 1;
        }
        if (i6 < this.u.getTop() + this.h) {
            i3 |= 4;
        }
        if (i5 > this.u.getRight() - this.h) {
            i3 |= 2;
        }
        if (i6 > this.u.getBottom() - this.h) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.o |= 1 << i2;
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.l[i2] & i3) != i3 || (this.i & i3) == 0 || (this.n[i2] & i3) == i3 || (this.m[i2] & i3) == i3)) {
            int i4 = this.b;
            if ((abs > ((float) i4) || abs2 > ((float) i4)) && (this.m[i2] & i3) == 0 && abs > ((float) this.b)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(int i2, int i3, int i4, int i5) {
        int left = this.j.getLeft();
        int top = this.j.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            b(0);
            return false;
        }
        this.r.startScroll(left, top, i6, i7, a(this.j, i6, i7, i4, i5));
        b(2);
        return true;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.a(view) > 0;
        boolean z2 = this.s.b() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.b;
        return f4 > ((float) (i2 * i2));
    }

    private static int b(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            if (i2 > 0) {
                return i4;
            }
            i2 = -i4;
        }
        return i2;
    }

    private void b(float f2, float f3, int i2) {
        boolean a2 = a(f2, f3, i2, 1);
        if (a(f3, f2, i2, 4)) {
            a2 |= true;
        }
        if (a(f2, f3, i2, 2)) {
            a2 |= true;
        }
        if (a(f3, f2, i2, 8)) {
            a2 |= true;
        }
        if (a2) {
            int[] iArr = this.m;
            iArr[i2] = iArr[i2] | a2;
            this.s.a(a2 ? 1 : 0, i2);
        }
    }

    private boolean b(View view, int i2) {
        if (view == this.j && this.k == i2) {
            return true;
        }
        if (view == null || !this.s.b(view, i2)) {
            return false;
        }
        this.k = i2;
        a(view, i2);
        return true;
    }

    public static boolean b(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    private void c() {
        this.p.computeCurrentVelocity(1000, this.q);
        a(a(this.p.getXVelocity(this.k), this.g, this.q), a(this.p.getYVelocity(this.k), this.g, this.q));
    }

    private void c(int i2) {
        if (this.c != null && a(i2)) {
            this.c[i2] = 0.0f;
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.l[i2] = 0;
            this.m[i2] = 0;
            this.n[i2] = 0;
            this.o = ((1 << i2) ^ -1) & this.o;
        }
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (d(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.e[pointerId] = x;
                this.f[pointerId] = y;
            }
        }
    }

    private boolean d(int i2) {
        if (a(i2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Ignoring pointerId=");
        sb.append(i2);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    public final void a() {
        this.k = -1;
        float[] fArr = this.c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.l, 0);
            Arrays.fill(this.m, 0);
            Arrays.fill(this.n, 0);
            this.o = 0;
        }
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p = null;
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() == this.u) {
            this.j = view;
            this.k = i2;
            this.s.a(view, i2);
            b(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean a(int i2) {
        return ((1 << i2) & this.o) != 0;
    }

    public final boolean a(int i2, int i3) {
        if (this.t) {
            return a(i2, i3, (int) this.p.getXVelocity(this.k), (int) this.p.getYVelocity(this.k));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r12 != r11) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.p
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.p = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.p
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00fa
            if (r2 == r6) goto L_0x00f6
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00f6
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0129
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.c(r1)
            goto L_0x0129
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.a(r7, r1, r2)
            int r3 = r0.a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.l
            r1 = r1[r2]
            int r2 = r0.i
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0129
            jw$a r1 = r0.s
            r1.a()
            goto L_0x0129
        L_0x005f:
            if (r3 != r4) goto L_0x0129
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.b(r3, r1)
            android.view.View r3 = r0.j
            if (r1 != r3) goto L_0x0129
            r0.b(r1, r2)
            goto L_0x0129
        L_0x0070:
            float[] r2 = r0.c
            if (r2 == 0) goto L_0x0129
            float[] r2 = r0.d
            if (r2 == 0) goto L_0x0129
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007d:
            if (r3 >= r2) goto L_0x00f2
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.d(r4)
            if (r7 == 0) goto L_0x00ef
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.c
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.d
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.b(r7, r8)
            if (r7 == 0) goto L_0x00ad
            boolean r8 = r0.a(r7, r9, r10)
            if (r8 == 0) goto L_0x00ad
            r8 = 1
            goto L_0x00ae
        L_0x00ad:
            r8 = 0
        L_0x00ae:
            if (r8 == 0) goto L_0x00e0
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            jw$a r13 = r0.s
            int r12 = r13.c(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            jw$a r15 = r0.s
            int r14 = r15.d(r7, r14)
            jw$a r15 = r0.s
            int r15 = r15.a(r7)
            jw$a r5 = r0.s
            int r5 = r5.b()
            if (r15 == 0) goto L_0x00da
            if (r15 <= 0) goto L_0x00e0
            if (r12 != r11) goto L_0x00e0
        L_0x00da:
            if (r5 == 0) goto L_0x00f2
            if (r5 <= 0) goto L_0x00e0
            if (r14 == r13) goto L_0x00f2
        L_0x00e0:
            r0.b(r9, r10, r4)
            int r5 = r0.a
            if (r5 == r6) goto L_0x00f2
            if (r8 == 0) goto L_0x00ef
            boolean r4 = r0.b(r7, r4)
            if (r4 != 0) goto L_0x00f2
        L_0x00ef:
            int r3 = r3 + 1
            goto L_0x007d
        L_0x00f2:
            r16.c(r17)
            goto L_0x0129
        L_0x00f6:
            r16.a()
            goto L_0x0129
        L_0x00fa:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.a(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.b(r2, r3)
            android.view.View r3 = r0.j
            if (r2 != r3) goto L_0x011b
            int r3 = r0.a
            if (r3 != r4) goto L_0x011b
            r0.b(r2, r1)
        L_0x011b:
            int[] r2 = r0.l
            r1 = r2[r1]
            int r2 = r0.i
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0129
            jw$a r1 = r0.s
            r1.a()
        L_0x0129:
            int r1 = r0.a
            if (r1 != r6) goto L_0x012e
            return r6
        L_0x012e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.a(android.view.MotionEvent):boolean");
    }

    public final boolean a(View view, int i2, int i3) {
        this.j = view;
        this.k = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.a == 0 && this.j != null) {
            this.j = null;
        }
        return a2;
    }

    public final boolean a(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.j.getLeft();
            int top = currY - this.j.getTop();
            if (left != 0) {
                ip.h(this.j, left);
            }
            if (top != 0) {
                ip.g(this.j, top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.a(this.j, currX, currY, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.u.post(this.w);
            }
        }
        return this.a == 2;
    }

    public final View b(int i2, int i3) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void b() {
        a();
        if (this.a == 2) {
            this.r.getCurrX();
            int currY = this.r.getCurrY();
            this.r.abortAnimation();
            int currX = this.r.getCurrX();
            int currY2 = this.r.getCurrY();
            this.s.a(this.j, currX, currY2, currY2 - currY);
        }
        b(0);
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2) {
        this.u.removeCallbacks(this.w);
        if (this.a != i2) {
            this.a = i2;
            this.s.a(i2);
            if (this.a == 0) {
                this.j = null;
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
        this.p.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View b2 = b((int) x, (int) y);
            a(x, y, pointerId);
            b(b2, pointerId);
            if ((this.l[pointerId] & this.i) != 0) {
                this.s.a();
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                c();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    a(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                a(x2, y2, pointerId2);
                if (this.a == 0) {
                    b(b((int) x2, (int) y2), pointerId2);
                    if ((this.l[pointerId2] & this.i) != 0) {
                        this.s.a();
                    }
                    return;
                }
                if (b(this.j, (int) x2, (int) y2)) {
                    b(this.j, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId3 == this.k) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.k) {
                            View b3 = b((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.j;
                            if (b3 == view && b(view, pointerId4)) {
                                i2 = this.k;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        c();
                    }
                }
                c(pointerId3);
            }
        } else if (this.a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (d(pointerId5)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.c[pointerId5];
                    float f3 = y3 - this.d[pointerId5];
                    b(f2, f3, pointerId5);
                    if (this.a == 1) {
                        break;
                    }
                    View b4 = b((int) x3, (int) y3);
                    if (a(b4, f2, f3) && b(b4, pointerId5)) {
                        break;
                    }
                }
                i3++;
            }
            c(motionEvent);
        } else if (d(this.k)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.k);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.e;
            int i4 = this.k;
            int i5 = (int) (x4 - fArr[i4]);
            int i6 = (int) (y4 - this.f[i4]);
            int left = this.j.getLeft() + i5;
            int top = this.j.getTop() + i6;
            int left2 = this.j.getLeft();
            int top2 = this.j.getTop();
            if (i5 != 0) {
                left = this.s.c(this.j, left);
                ip.h(this.j, left - left2);
            }
            if (i6 != 0) {
                top = this.s.d(this.j, top);
                ip.g(this.j, top - top2);
            }
            if (!(i5 == 0 && i6 == 0)) {
                this.s.a(this.j, left, top, top - top2);
            }
            c(motionEvent);
        }
    }
}
