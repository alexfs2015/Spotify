package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.j;
import androidx.recyclerview.widget.RecyclerView.l;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nz reason: default package */
public final class nz extends h implements j {
    private List<Integer> A;
    private androidx.recyclerview.widget.RecyclerView.d B = null;
    private b C;
    private final l D = new l() {
        public final boolean a(MotionEvent motionEvent) {
            nz.this.r.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            c cVar = null;
            if (actionMasked == 0) {
                nz.this.i = motionEvent.getPointerId(0);
                nz.this.c = motionEvent.getX();
                nz.this.d = motionEvent.getY();
                nz.this.a();
                if (nz.this.b == null) {
                    nz nzVar = nz.this;
                    if (!nzVar.l.isEmpty()) {
                        View a2 = nzVar.a(motionEvent);
                        int size = nzVar.l.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            c cVar2 = (c) nzVar.l.get(size);
                            if (cVar2.e.o == a2) {
                                cVar = cVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (cVar != null) {
                        nz.this.c -= cVar.i;
                        nz.this.d -= cVar.j;
                        nz.this.a(cVar.e, true);
                        if (nz.this.a.remove(cVar.e.o)) {
                            nz.this.j.c(nz.this.m, cVar.e);
                        }
                        nz.this.a(cVar.e, cVar.f);
                        nz nzVar2 = nz.this;
                        nzVar2.a(motionEvent, nzVar2.k, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                nz nzVar3 = nz.this;
                nzVar3.i = -1;
                nzVar3.a((u) null, 0);
            } else if (nz.this.i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(nz.this.i);
                if (findPointerIndex >= 0) {
                    nz.this.a(actionMasked, motionEvent, findPointerIndex);
                }
            }
            if (nz.this.o != null) {
                nz.this.o.addMovement(motionEvent);
            }
            return nz.this.b != null;
        }

        public final void b(MotionEvent motionEvent) {
            nz.this.r.a(motionEvent);
            if (nz.this.o != null) {
                nz.this.o.addMovement(motionEvent);
            }
            if (nz.this.i != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(nz.this.i);
                if (findPointerIndex >= 0) {
                    nz.this.a(actionMasked, motionEvent, findPointerIndex);
                }
                u uVar = nz.this.b;
                if (uVar != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == nz.this.i) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        nz.this.i = motionEvent.getPointerId(i);
                                        nz nzVar = nz.this;
                                        nzVar.a(motionEvent, nzVar.k, actionIndex);
                                    }
                                }
                            } else if (nz.this.o != null) {
                                nz.this.o.clear();
                            }
                        } else if (findPointerIndex >= 0) {
                            nz nzVar2 = nz.this;
                            nzVar2.a(motionEvent, nzVar2.k, findPointerIndex);
                            nz.this.a(uVar);
                            nz.this.m.removeCallbacks(nz.this.n);
                            nz.this.n.run();
                            nz.this.m.invalidate();
                        }
                        return;
                    }
                    nz.this.a((u) null, 0);
                    nz.this.i = -1;
                }
            }
        }

        public final void a(boolean z) {
            if (z) {
                nz.this.a((u) null, 0);
            }
        }
    };
    final List<View> a = new ArrayList();
    u b = null;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    int i = -1;
    a j;
    int k;
    List<c> l = new ArrayList();
    RecyclerView m;
    final Runnable n = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
            if (r2 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0111  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r0 = r16
                nz r1 = defpackage.nz.this
                androidx.recyclerview.widget.RecyclerView$u r1 = r1.b
                if (r1 == 0) goto L_0x013d
                nz r1 = defpackage.nz.this
                androidx.recyclerview.widget.RecyclerView$u r2 = r1.b
                r3 = 0
                r4 = -9223372036854775808
                if (r2 == 0) goto L_0x011a
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r1.t
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x001e
                r8 = 0
                goto L_0x0022
            L_0x001e:
                long r8 = r1.t
                long r8 = r6 - r8
            L_0x0022:
                androidx.recyclerview.widget.RecyclerView r2 = r1.m
                androidx.recyclerview.widget.RecyclerView$i r2 = r2.d()
                android.graphics.Rect r10 = r1.s
                if (r10 != 0) goto L_0x0033
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r1.s = r10
            L_0x0033:
                androidx.recyclerview.widget.RecyclerView$u r10 = r1.b
                android.view.View r10 = r10.o
                android.graphics.Rect r11 = r1.s
                r2.b(r10, r11)
                boolean r10 = r2.e()
                r11 = 0
                if (r10 == 0) goto L_0x0086
                float r10 = r1.g
                float r12 = r1.e
                float r10 = r10 + r12
                int r10 = (int) r10
                android.graphics.Rect r12 = r1.s
                int r12 = r12.left
                int r12 = r10 - r12
                androidx.recyclerview.widget.RecyclerView r13 = r1.m
                int r13 = r13.getPaddingLeft()
                int r12 = r12 - r13
                float r13 = r1.e
                int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r13 >= 0) goto L_0x0060
                if (r12 >= 0) goto L_0x0060
                r13 = r12
                goto L_0x0087
            L_0x0060:
                float r12 = r1.e
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView$u r12 = r1.b
                android.view.View r12 = r12.o
                int r12 = r12.getWidth()
                int r10 = r10 + r12
                android.graphics.Rect r12 = r1.s
                int r12 = r12.right
                int r10 = r10 + r12
                androidx.recyclerview.widget.RecyclerView r12 = r1.m
                int r12 = r12.getWidth()
                androidx.recyclerview.widget.RecyclerView r13 = r1.m
                int r13 = r13.getPaddingRight()
                int r12 = r12 - r13
                int r10 = r10 - r12
                if (r10 <= 0) goto L_0x0086
                r13 = r10
                goto L_0x0087
            L_0x0086:
                r13 = 0
            L_0x0087:
                boolean r2 = r2.f()
                if (r2 == 0) goto L_0x00cf
                float r2 = r1.h
                float r10 = r1.f
                float r2 = r2 + r10
                int r2 = (int) r2
                android.graphics.Rect r10 = r1.s
                int r10 = r10.top
                int r10 = r2 - r10
                androidx.recyclerview.widget.RecyclerView r12 = r1.m
                int r12 = r12.getPaddingTop()
                int r10 = r10 - r12
                float r12 = r1.f
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 >= 0) goto L_0x00aa
                if (r10 >= 0) goto L_0x00aa
                r2 = r10
                goto L_0x00d0
            L_0x00aa:
                float r10 = r1.f
                int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00cf
                androidx.recyclerview.widget.RecyclerView$u r10 = r1.b
                android.view.View r10 = r10.o
                int r10 = r10.getHeight()
                int r2 = r2 + r10
                android.graphics.Rect r10 = r1.s
                int r10 = r10.bottom
                int r2 = r2 + r10
                androidx.recyclerview.widget.RecyclerView r10 = r1.m
                int r10 = r10.getHeight()
                androidx.recyclerview.widget.RecyclerView r11 = r1.m
                int r11 = r11.getPaddingBottom()
                int r10 = r10 - r11
                int r2 = r2 - r10
                if (r2 <= 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r2 = 0
            L_0x00d0:
                if (r13 == 0) goto L_0x00e8
                nz$a r10 = r1.j
                androidx.recyclerview.widget.RecyclerView r11 = r1.m
                androidx.recyclerview.widget.RecyclerView$u r12 = r1.b
                android.view.View r12 = r12.o
                int r12 = r12.getWidth()
                androidx.recyclerview.widget.RecyclerView r14 = r1.m
                r14.getWidth()
                r14 = r8
                int r13 = r10.a(r11, r12, r13, r14)
            L_0x00e8:
                r14 = r13
                if (r2 == 0) goto L_0x0106
                nz$a r10 = r1.j
                androidx.recyclerview.widget.RecyclerView r11 = r1.m
                androidx.recyclerview.widget.RecyclerView$u r12 = r1.b
                android.view.View r12 = r12.o
                int r12 = r12.getHeight()
                androidx.recyclerview.widget.RecyclerView r13 = r1.m
                r13.getHeight()
                r13 = r2
                r2 = r14
                r14 = r8
                int r8 = r10.a(r11, r12, r13, r14)
                r13 = r2
                r2 = r8
                goto L_0x0107
            L_0x0106:
                r13 = r14
            L_0x0107:
                if (r13 != 0) goto L_0x010b
                if (r2 == 0) goto L_0x011a
            L_0x010b:
                long r8 = r1.t
                int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x0113
                r1.t = r6
            L_0x0113:
                androidx.recyclerview.widget.RecyclerView r1 = r1.m
                r1.scrollBy(r13, r2)
                r3 = 1
                goto L_0x011c
            L_0x011a:
                r1.t = r4
            L_0x011c:
                if (r3 == 0) goto L_0x013d
                nz r1 = defpackage.nz.this
                androidx.recyclerview.widget.RecyclerView$u r1 = r1.b
                if (r1 == 0) goto L_0x012b
                nz r1 = defpackage.nz.this
                androidx.recyclerview.widget.RecyclerView$u r2 = r1.b
                r1.a(r2)
            L_0x012b:
                nz r1 = defpackage.nz.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.m
                nz r2 = defpackage.nz.this
                java.lang.Runnable r2 = r2.n
                r1.removeCallbacks(r2)
                nz r1 = defpackage.nz.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.m
                defpackage.ip.a(r1, r0)
            L_0x013d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nz.AnonymousClass1.run():void");
        }
    };
    VelocityTracker o;
    View p = null;
    int q = -1;
    hw r;
    Rect s;
    long t;
    private final float[] u = new float[2];
    private float v;
    private float w;
    private int x = 0;
    private int y;
    private List<u> z;

    /* renamed from: nz$a */
    public static abstract class a {
        private static final Interpolator a = new Interpolator() {
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        private static final Interpolator b = new Interpolator() {
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        private int c = -1;

        public static float a(float f) {
            return f;
        }

        public static int a(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static float b(float f) {
            return f;
        }

        public static int b(int i, int i2) {
            return (i << 16) | ((i | 0) << 0) | 0;
        }

        public static int c(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public abstract int a(u uVar);

        public boolean a() {
            return true;
        }

        public abstract boolean a(u uVar, u uVar2);

        public boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
            return true;
        }

        public boolean b() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final int a(RecyclerView recyclerView, u uVar) {
            return c(a(uVar), ip.f(recyclerView));
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(RecyclerView recyclerView, u uVar) {
            return (a(recyclerView, uVar) & 16711680) != 0;
        }

        public static u a(u uVar, List<u> list, int i, int i2) {
            int width = uVar.o.getWidth() + i;
            int height = uVar.o.getHeight() + i2;
            int left = i - uVar.o.getLeft();
            int top = i2 - uVar.o.getTop();
            int size = list.size();
            u uVar2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                u uVar3 = (u) list.get(i4);
                if (left > 0) {
                    int right = uVar3.o.getRight() - width;
                    if (right < 0 && uVar3.o.getRight() > uVar.o.getRight()) {
                        int abs = Math.abs(right);
                        if (abs > i3) {
                            uVar2 = uVar3;
                            i3 = abs;
                        }
                    }
                }
                if (left < 0) {
                    int left2 = uVar3.o.getLeft() - i;
                    if (left2 > 0 && uVar3.o.getLeft() < uVar.o.getLeft()) {
                        int abs2 = Math.abs(left2);
                        if (abs2 > i3) {
                            uVar2 = uVar3;
                            i3 = abs2;
                        }
                    }
                }
                if (top < 0) {
                    int top2 = uVar3.o.getTop() - i2;
                    if (top2 > 0 && uVar3.o.getTop() < uVar.o.getTop()) {
                        int abs3 = Math.abs(top2);
                        if (abs3 > i3) {
                            uVar2 = uVar3;
                            i3 = abs3;
                        }
                    }
                }
                if (top > 0) {
                    int bottom = uVar3.o.getBottom() - height;
                    if (bottom < 0 && uVar3.o.getBottom() > uVar.o.getBottom()) {
                        int abs4 = Math.abs(bottom);
                        if (abs4 > i3) {
                            uVar2 = uVar3;
                            i3 = abs4;
                        }
                    }
                }
            }
            return uVar2;
        }

        public void a(u uVar, int i) {
            if (uVar != null) {
                oa oaVar = ob.a;
            }
        }

        private int a(RecyclerView recyclerView) {
            if (this.c == -1) {
                this.c = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.c;
        }

        public static void a(RecyclerView recyclerView, u uVar, u uVar2, int i, int i2, int i3) {
            i d = recyclerView.d();
            if (d instanceof d) {
                ((d) d).a(uVar.o, uVar2.o);
                return;
            }
            if (d.e()) {
                if (d.k(uVar2.o) <= recyclerView.getPaddingLeft()) {
                    recyclerView.d(i);
                }
                if (d.m(uVar2.o) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.d(i);
                }
            }
            if (d.f()) {
                if (d.l(uVar2.o) <= recyclerView.getPaddingTop()) {
                    recyclerView.d(i);
                }
                if (d.n(uVar2.o) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.d(i);
                }
            }
        }

        public void c(RecyclerView recyclerView, u uVar) {
            ob.a.a(uVar.o);
        }

        public static void a(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
            ob.a.a(recyclerView, uVar.o, f, f2, z);
        }

        public static void b(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
            oa oaVar = ob.a;
        }

        public final int a(RecyclerView recyclerView, int i, int i2, long j) {
            int signum = (int) Math.signum((float) i2);
            float f = 1.0f;
            int a2 = (int) (((float) (signum * a(recyclerView))) * b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) a2) * a.getInterpolation(f));
            if (interpolation == 0) {
                if (i2 > 0) {
                    return 1;
                }
                interpolation = -1;
            }
            return interpolation;
        }

        public static long a(RecyclerView recyclerView, int i) {
            f fVar = recyclerView.x;
            if (fVar == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                return fVar.i;
            }
            return fVar.f();
        }
    }

    /* renamed from: nz$b */
    class b extends SimpleOnGestureListener {
        boolean a = true;

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        b() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (this.a) {
                View a2 = nz.this.a(motionEvent);
                if (a2 != null) {
                    u b2 = nz.this.m.b(a2);
                    if (b2 != null && nz.this.j.b(nz.this.m, b2) && motionEvent.getPointerId(0) == nz.this.i) {
                        int findPointerIndex = motionEvent.findPointerIndex(nz.this.i);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        nz nzVar = nz.this;
                        nzVar.c = x;
                        nzVar.d = y;
                        nzVar.f = 0.0f;
                        nzVar.e = 0.0f;
                        if (nzVar.j.a()) {
                            nz.this.a(b2, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: nz$c */
    static class c implements AnimatorListener {
        final float a;
        final float b;
        final float c;
        final float d;
        final u e;
        final int f;
        final ValueAnimator g;
        boolean h;
        float i;
        float j;
        boolean k = false;
        boolean l = false;
        float m;
        private int n;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        c(u uVar, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f = i3;
            this.n = i2;
            this.e = uVar;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.d = f5;
            this.g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.g.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.this.m = valueAnimator.getAnimatedFraction();
                }
            });
            this.g.setTarget(uVar.o);
            this.g.addListener(this);
            this.m = 0.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.e.b(true);
            }
            this.l = true;
        }

        public void onAnimationCancel(Animator animator) {
            this.m = 1.0f;
        }
    }

    /* renamed from: nz$d */
    public interface d {
        void a(View view, View view2);
    }

    public final void a(View view) {
    }

    public nz(a aVar) {
        this.j = aVar;
    }

    private static boolean a(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b((h) this);
                this.m.b(this.D);
                this.m.b((j) this);
                int size = this.l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.j.c(this.m, ((c) this.l.get(0)).e);
                }
                this.l.clear();
                this.p = null;
                this.q = -1;
                b();
                b bVar = this.C;
                if (bVar != null) {
                    bVar.a = false;
                    this.C = null;
                }
                if (this.r != null) {
                    this.r = null;
                }
            }
            this.m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.w = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.y = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
                this.m.a((h) this, -1);
                this.m.a(this.D);
                this.m.a((j) this);
                this.C = new b();
                this.r = new hw(this.m.getContext(), this.C);
            }
        }
    }

    private void a(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - ((float) this.b.o.getLeft());
        } else {
            fArr[0] = this.b.o.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - ((float) this.b.o.getTop());
        } else {
            fArr[1] = this.b.o.getTranslationY();
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        if (this.b != null) {
            a(this.u);
            float[] fArr = this.u;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        a aVar = this.j;
        u uVar = this.b;
        List<c> list = this.l;
        int i2 = this.x;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            c cVar = (c) list.get(i3);
            int save = canvas.save();
            u uVar2 = cVar.e;
            float f5 = cVar.i;
            float f6 = cVar.j;
            int i4 = save;
            float f7 = f6;
            int i5 = i3;
            int i6 = cVar.f;
            int i7 = size;
            a.b(canvas, recyclerView, uVar2, f5, f7, i6, false);
            canvas2.restoreToCount(i4);
            i3 = i5 + 1;
            size = i7;
        }
        int i8 = size;
        if (uVar != null) {
            int save2 = canvas.save();
            a.b(canvas, recyclerView, uVar, f3, f2, i2, true);
            canvas2.restoreToCount(save2);
        }
        boolean z2 = false;
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            c cVar2 = (c) list.get(i9);
            if (cVar2.l && !cVar2.h) {
                list.remove(i9);
            } else if (!cVar2.l) {
                z2 = true;
            }
        }
        if (z2) {
            recyclerView.invalidate();
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        this.q = -1;
        if (this.b != null) {
            a(this.u);
            float[] fArr = this.u;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        a aVar = this.j;
        u uVar = this.b;
        List<c> list = this.l;
        int i2 = this.x;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            c cVar = (c) list.get(i3);
            if (cVar.a == cVar.c) {
                cVar.i = cVar.e.o.getTranslationX();
            } else {
                cVar.i = cVar.a + (cVar.m * (cVar.c - cVar.a));
            }
            if (cVar.b == cVar.d) {
                cVar.j = cVar.e.o.getTranslationY();
            } else {
                cVar.j = cVar.b + (cVar.m * (cVar.d - cVar.b));
            }
            int save = canvas.save();
            int i4 = save;
            a.a(canvas, recyclerView, cVar.e, cVar.i, cVar.j, cVar.f, false);
            canvas2.restoreToCount(i4);
            i3++;
        }
        if (uVar != null) {
            int save2 = canvas.save();
            a.a(canvas, recyclerView, uVar, f3, f2, i2, true);
            canvas2.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        if (r0 > 0) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.u r20, int r21) {
        /*
            r19 = this;
            r11 = r19
            r12 = r20
            r13 = r21
            androidx.recyclerview.widget.RecyclerView$u r0 = r11.b
            if (r12 != r0) goto L_0x000f
            int r0 = r11.x
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.t = r0
            int r4 = r11.x
            r14 = 1
            r11.a(r12, r14)
            r11.x = r13
            r15 = 2
            if (r13 != r15) goto L_0x0045
            if (r12 == 0) goto L_0x003d
            android.view.View r0 = r12.o
            r11.p = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0045
            androidx.recyclerview.widget.RecyclerView$d r0 = r11.B
            if (r0 != 0) goto L_0x0035
            nz$5 r0 = new nz$5
            r0.<init>()
            r11.B = r0
        L_0x0035:
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            androidx.recyclerview.widget.RecyclerView$d r1 = r11.B
            r0.a(r1)
            goto L_0x0045
        L_0x003d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            int r0 = r13 * 8
            r1 = 8
            int r0 = r0 + r1
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$u r10 = r11.b
            r9 = 0
            if (r10 == 0) goto L_0x0158
            android.view.View r0 = r10.o
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0146
            if (r4 == r15) goto L_0x00c3
            int r0 = r11.x
            if (r0 == r15) goto L_0x00c3
            nz$a r0 = r11.j
            int r0 = r0.a(r10)
            androidx.recyclerview.widget.RecyclerView r2 = r11.m
            int r2 = defpackage.ip.f(r2)
            int r2 = defpackage.nz.a.c(r0, r2)
            int r2 = r2 >> r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x00c3
            int r0 = r0 >> r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r3 = r11.e
            float r3 = java.lang.Math.abs(r3)
            float r5 = r11.f
            float r5 = java.lang.Math.abs(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            int r3 = r11.b(r10, r2)
            if (r3 <= 0) goto L_0x009d
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00ab
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            int r0 = defpackage.ip.f(r0)
            int r0 = defpackage.nz.a.a(r3, r0)
            goto L_0x00a3
        L_0x009d:
            int r0 = r11.c(r10, r2)
            if (r0 <= 0) goto L_0x00c3
        L_0x00a3:
            r8 = r0
            goto L_0x00c4
        L_0x00a5:
            int r3 = r11.c(r10, r2)
            if (r3 <= 0) goto L_0x00ad
        L_0x00ab:
            r8 = r3
            goto L_0x00c4
        L_0x00ad:
            int r2 = r11.b(r10, r2)
            if (r2 <= 0) goto L_0x00c3
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00c1
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            int r0 = defpackage.ip.f(r0)
            int r0 = defpackage.nz.a.a(r2, r0)
            goto L_0x00a3
        L_0x00c1:
            r8 = r2
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            r19.b()
            r0 = 4
            r2 = 0
            if (r8 == r14) goto L_0x00ee
            if (r8 == r15) goto L_0x00ee
            if (r8 == r0) goto L_0x00dd
            if (r8 == r1) goto L_0x00dd
            r3 = 16
            if (r8 == r3) goto L_0x00dd
            r3 = 32
            if (r8 == r3) goto L_0x00dd
            r7 = 0
        L_0x00da:
            r17 = 0
            goto L_0x0100
        L_0x00dd:
            float r3 = r11.e
            float r3 = java.lang.Math.signum(r3)
            androidx.recyclerview.widget.RecyclerView r5 = r11.m
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r3 * r5
            r7 = r3
            goto L_0x00da
        L_0x00ee:
            float r3 = r11.f
            float r3 = java.lang.Math.signum(r3)
            androidx.recyclerview.widget.RecyclerView r5 = r11.m
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r3 = r3 * r5
            r17 = r3
            r7 = 0
        L_0x0100:
            if (r4 != r15) goto L_0x0105
            r6 = 8
            goto L_0x010a
        L_0x0105:
            if (r8 <= 0) goto L_0x0109
            r6 = 2
            goto L_0x010a
        L_0x0109:
            r6 = 4
        L_0x010a:
            float[] r0 = r11.u
            r11.a(r0)
            float[] r0 = r11.u
            r5 = r0[r9]
            r18 = r0[r14]
            nz$3 r3 = new nz$3
            r0 = r3
            r1 = r19
            r2 = r10
            r14 = r3
            r3 = r6
            r15 = r6
            r6 = r18
            r18 = r8
            r8 = r17
            r13 = 0
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            long r0 = defpackage.nz.a.a(r0, r15)
            android.animation.ValueAnimator r2 = r14.g
            r2.setDuration(r0)
            java.util.List<nz$c> r0 = r11.l
            r0.add(r14)
            androidx.recyclerview.widget.RecyclerView$u r0 = r14.e
            r0.b(r13)
            android.animation.ValueAnimator r0 = r14.g
            r0.start()
            r9 = 1
            goto L_0x0154
        L_0x0146:
            r13 = 0
            android.view.View r0 = r10.o
            r11.c(r0)
            nz$a r0 = r11.j
            androidx.recyclerview.widget.RecyclerView r1 = r11.m
            r0.c(r1, r10)
            r9 = 0
        L_0x0154:
            r0 = 0
            r11.b = r0
            goto L_0x015a
        L_0x0158:
            r13 = 0
            r9 = 0
        L_0x015a:
            if (r12 == 0) goto L_0x018d
            nz$a r0 = r11.j
            androidx.recyclerview.widget.RecyclerView r1 = r11.m
            int r0 = r0.a(r1, r12)
            r0 = r0 & r16
            int r1 = r11.x
            int r1 = r1 << 3
            int r0 = r0 >> r1
            r11.k = r0
            android.view.View r0 = r12.o
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.g = r0
            android.view.View r0 = r12.o
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.h = r0
            r11.b = r12
            r0 = r21
            r1 = 2
            if (r0 != r1) goto L_0x018d
            androidx.recyclerview.widget.RecyclerView$u r0 = r11.b
            android.view.View r0 = r0.o
            r0.performHapticFeedback(r13)
        L_0x018d:
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x019d
            androidx.recyclerview.widget.RecyclerView$u r1 = r11.b
            if (r1 == 0) goto L_0x019a
            r13 = 1
        L_0x019a:
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x019d:
            if (r9 != 0) goto L_0x01a8
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            androidx.recyclerview.widget.RecyclerView$i r0 = r0.d()
            r1 = 1
            r0.l = r1
        L_0x01a8:
            nz$a r0 = r11.j
            androidx.recyclerview.widget.RecyclerView$u r1 = r11.b
            int r2 = r11.x
            r0.a(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.m
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz.a(androidx.recyclerview.widget.RecyclerView$u, int):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(u uVar) {
        int i2;
        int i3;
        u uVar2 = uVar;
        if (!this.m.isLayoutRequested() && this.x == 2) {
            int i4 = (int) (this.g + this.e);
            int i5 = (int) (this.h + this.f);
            if (((float) Math.abs(i5 - uVar2.o.getTop())) >= ((float) uVar2.o.getHeight()) * 0.5f || ((float) Math.abs(i4 - uVar2.o.getLeft())) >= ((float) uVar2.o.getWidth()) * 0.5f) {
                List<u> list = this.z;
                if (list == null) {
                    this.z = new ArrayList();
                    this.A = new ArrayList();
                } else {
                    list.clear();
                    this.A.clear();
                }
                int round = Math.round(this.g + this.e);
                int round2 = Math.round(this.h + this.f);
                int width = uVar2.o.getWidth() + round;
                int height = uVar2.o.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                i d2 = this.m.d();
                int r2 = d2.r();
                int i8 = 0;
                while (i8 < r2) {
                    View g2 = d2.g(i8);
                    if (g2 == uVar2.o || g2.getBottom() < round2 || g2.getTop() > height || g2.getRight() < round || g2.getLeft() > width) {
                        i3 = round;
                        i2 = round2;
                    } else {
                        u b2 = this.m.b(g2);
                        i3 = round;
                        i2 = round2;
                        if (this.j.a(this.m, this.b, b2)) {
                            int abs = Math.abs(i6 - ((g2.getLeft() + g2.getRight()) / 2));
                            int abs2 = Math.abs(i7 - ((g2.getTop() + g2.getBottom()) / 2));
                            int i9 = (abs * abs) + (abs2 * abs2);
                            int size = this.z.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i11 < size) {
                                int i12 = size;
                                if (i9 <= ((Integer) this.A.get(i11)).intValue()) {
                                    break;
                                }
                                i10++;
                                i11++;
                                size = i12;
                            }
                            this.z.add(i10, b2);
                            this.A.add(i10, Integer.valueOf(i9));
                        }
                    }
                    i8++;
                    round = i3;
                    round2 = i2;
                }
                List<u> list2 = this.z;
                if (list2.size() != 0) {
                    u a2 = a.a(uVar2, list2, i4, i5);
                    if (a2 == null) {
                        this.z.clear();
                        this.A.clear();
                        return;
                    }
                    int e2 = a2.e();
                    uVar.e();
                    if (this.j.a(uVar2, a2)) {
                        a.a(this.m, uVar, a2, e2, i4, i5);
                    }
                }
            }
        }
    }

    public final void b(View view) {
        c(view);
        u b2 = this.m.b(view);
        if (b2 != null) {
            u uVar = this.b;
            if (uVar == null || b2 != uVar) {
                a(b2, false);
                if (this.a.remove(b2.o)) {
                    this.j.c(this.m, b2);
                }
                return;
            }
            a((u) null, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(u uVar, boolean z2) {
        for (int size = this.l.size() - 1; size >= 0; size--) {
            c cVar = (c) this.l.get(size);
            if (cVar.e == uVar) {
                cVar.k |= z2;
                if (!cVar.l) {
                    cVar.g.cancel();
                }
                this.l.remove(size);
                return;
            }
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        rect.setEmpty();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    private void b() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, MotionEvent motionEvent, int i3) {
        if (this.b == null && i2 == 2 && this.x != 2 && this.j.b() && this.m.y != 1) {
            i d2 = this.m.d();
            int i4 = this.i;
            u uVar = null;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x2 = motionEvent.getX(findPointerIndex) - this.c;
                float y2 = motionEvent.getY(findPointerIndex) - this.d;
                float abs = Math.abs(x2);
                float abs2 = Math.abs(y2);
                int i5 = this.y;
                if ((abs >= ((float) i5) || abs2 >= ((float) i5)) && ((abs <= abs2 || !d2.e()) && (abs2 <= abs || !d2.f()))) {
                    View a2 = a(motionEvent);
                    if (a2 != null) {
                        uVar = this.m.b(a2);
                    }
                }
            }
            if (uVar != null) {
                int a3 = (this.j.a(this.m, uVar) >> 8) & 255;
                if (a3 != 0) {
                    float x3 = motionEvent.getX(i3);
                    float f2 = x3 - this.c;
                    float y3 = motionEvent.getY(i3) - this.d;
                    float abs3 = Math.abs(f2);
                    float abs4 = Math.abs(y3);
                    int i6 = this.y;
                    if (abs3 >= ((float) i6) || abs4 >= ((float) i6)) {
                        if (abs3 > abs4) {
                            if (f2 < 0.0f && (a3 & 4) == 0) {
                                return;
                            }
                            if (f2 > 0.0f && (a3 & 8) == 0) {
                                return;
                            }
                        } else if (y3 < 0.0f && (a3 & 1) == 0) {
                            return;
                        } else {
                            if (y3 > 0.0f && (a3 & 2) == 0) {
                                return;
                            }
                        }
                        this.f = 0.0f;
                        this.e = 0.0f;
                        this.i = motionEvent.getPointerId(0);
                        a(uVar, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final View a(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        u uVar = this.b;
        if (uVar != null) {
            View view = uVar.o;
            if (a(view, x2, y2, this.g + this.e, this.h + this.f)) {
                return view;
            }
        }
        for (int size = this.l.size() - 1; size >= 0; size--) {
            c cVar = (c) this.l.get(size);
            View view2 = cVar.e.o;
            if (a(view2, x2, y2, cVar.i, cVar.j)) {
                return view2;
            }
        }
        return this.m.a(x2, y2);
    }

    public final void b(u uVar) {
        String str = "ItemTouchHelper";
        if (!this.j.b(this.m, uVar)) {
            Log.e(str, "Start drag has been called but dragging is not enabled");
        } else if (uVar.o.getParent() != this.m) {
            Log.e(str, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            a();
            this.f = 0.0f;
            this.e = 0.0f;
            a(uVar, 2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        this.e = x2 - this.c;
        this.f = y2 - this.d;
        if ((i2 & 4) == 0) {
            this.e = Math.max(0.0f, this.e);
        }
        if ((i2 & 8) == 0) {
            this.e = Math.min(0.0f, this.e);
        }
        if ((i2 & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i2 & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    private int b(u uVar, int i2) {
        if ((i2 & 12) != 0) {
            int i3 = 8;
            int i4 = this.e > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, a.b(this.w));
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i2) != 0 && i4 == i3 && abs >= a.a(this.v) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = ((float) this.m.getWidth()) * 0.5f;
            if ((i2 & i4) != 0 && Math.abs(this.e) > width) {
                return i4;
            }
        }
        return 0;
    }

    private int c(u uVar, int i2) {
        if ((i2 & 3) != 0) {
            int i3 = 2;
            int i4 = this.f > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, a.b(this.w));
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i2) != 0 && i3 == i4 && abs >= a.a(this.v) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = ((float) this.m.getHeight()) * 0.5f;
            if ((i2 & i4) != 0 && Math.abs(this.f) > height) {
                return i4;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final void c(View view) {
        if (view == this.p) {
            this.p = null;
            if (this.B != null) {
                this.m.a((androidx.recyclerview.widget.RecyclerView.d) null);
            }
        }
    }
}
