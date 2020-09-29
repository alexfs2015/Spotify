package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.l;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: oc reason: default package */
public final class oc extends h implements l {
    private static final int[] p = {16842919};
    private static final int[] q = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D = new Runnable() {
        public final void run() {
            oc ocVar = oc.this;
            int i = ocVar.o;
            if (i == 1) {
                ocVar.n.cancel();
            } else if (i != 2) {
                return;
            }
            ocVar.o = 3;
            ocVar.n.setFloatValues(new float[]{((Float) ocVar.n.getAnimatedValue()).floatValue(), 0.0f});
            ocVar.n.setDuration(500);
            ocVar.n.start();
        }
    };
    private final m E = new m() {
        public final void a(RecyclerView recyclerView, int i, int i2) {
            oc ocVar = oc.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = ocVar.j.computeVerticalScrollRange();
            int i3 = ocVar.i;
            ocVar.k = computeVerticalScrollRange - i3 > 0 && ocVar.i >= ocVar.a;
            int computeHorizontalScrollRange = ocVar.j.computeHorizontalScrollRange();
            int i4 = ocVar.h;
            ocVar.l = computeHorizontalScrollRange - i4 > 0 && ocVar.h >= ocVar.a;
            if (ocVar.k || ocVar.l) {
                if (ocVar.k) {
                    float f = (float) i3;
                    ocVar.e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    ocVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (ocVar.l) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    ocVar.g = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    ocVar.f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                if (ocVar.m == 0 || ocVar.m == 1) {
                    ocVar.a(1);
                }
                return;
            }
            if (ocVar.m != 0) {
                ocVar.a(0);
            }
        }
    };
    final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    int i = 0;
    RecyclerView j;
    boolean k = false;
    boolean l = false;
    int m = 0;
    final ValueAnimator n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    int o = 0;
    private final int r;
    private final int s;
    private final int t;
    private final StateListDrawable u;
    private final Drawable v;
    private final int w;
    private final int x;
    private float y;
    private float z;

    /* renamed from: oc$a */
    class a extends AnimatorListenerAdapter {
        private boolean a = false;

        a() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) oc.this.n.getAnimatedValue()).floatValue() == 0.0f) {
                oc ocVar = oc.this;
                ocVar.o = 0;
                ocVar.a(0);
            } else {
                oc ocVar2 = oc.this;
                ocVar2.o = 2;
                ocVar2.j.invalidate();
            }
        }
    }

    /* renamed from: oc$b */
    class b implements AnimatorUpdateListener {
        b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            oc.this.b.setAlpha(floatValue);
            oc.this.c.setAlpha(floatValue);
            oc.this.j.invalidate();
        }
    }

    public oc(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.b = stateListDrawable;
        this.c = drawable;
        this.u = stateListDrawable2;
        this.v = drawable2;
        this.s = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.t = Math.max(i2, drawable.getIntrinsicWidth());
        this.w = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.x = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.r = i4;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.n.addListener(new a());
        this.n.addUpdateListener(new b());
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b((h) this);
                this.j.b((l) this);
                this.j.b(this.E);
                c();
            }
            this.j = recyclerView;
            RecyclerView recyclerView3 = this.j;
            if (recyclerView3 != null) {
                recyclerView3.a((h) this, -1);
                this.j.a((l) this);
                this.j.a(this.E);
            }
        }
    }

    private static int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private boolean a() {
        return ip.f(this.j) == 1;
    }

    private boolean a(float f2, float f3) {
        if (!a() ? f2 >= ((float) (this.h - this.s)) : f2 <= ((float) (this.s / 2))) {
            int i2 = this.e;
            int i3 = this.d;
            if (f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)))) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i2 = this.o;
        if (i2 != 0) {
            if (i2 == 3) {
                this.n.cancel();
            } else {
                return;
            }
        }
        this.o = 1;
        ValueAnimator valueAnimator = this.n;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.n.setDuration(500);
        this.n.setStartDelay(0);
        this.n.start();
    }

    private void b(int i2) {
        c();
        this.j.postDelayed(this.D, (long) i2);
    }

    private boolean b(float f2, float f3) {
        if (f3 >= ((float) (this.i - this.w))) {
            int i2 = this.g;
            int i3 = this.f;
            if (f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) (i2 + (i3 / 2)))) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        this.j.removeCallbacks(this.D);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (i2 == 2 && this.m != 2) {
            this.b.setState(p);
            c();
        }
        if (i2 == 0) {
            this.j.invalidate();
        } else {
            b();
        }
        if (this.m == 2 && i2 != 2) {
            this.b.setState(q);
            b(1200);
        } else if (i2 == 1) {
            b(1500);
        }
        this.m = i2;
    }

    public final void a(boolean z2) {
    }

    public final boolean a(MotionEvent motionEvent) {
        int i2 = this.m;
        if (i2 == 1) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a2 && !b2) {
                return false;
            }
            if (b2) {
                this.A = 1;
                this.z = (float) ((int) motionEvent.getX());
            } else if (a2) {
                this.A = 2;
                this.y = (float) ((int) motionEvent.getY());
            }
            a(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.h == this.j.getWidth() && this.i == this.j.getHeight()) {
            if (this.o != 0) {
                if (this.k) {
                    int i2 = this.h;
                    int i3 = this.s;
                    int i4 = i2 - i3;
                    int i5 = this.e;
                    int i6 = this.d;
                    int i7 = i5 - (i6 / 2);
                    this.b.setBounds(0, 0, i3, i6);
                    this.c.setBounds(0, 0, this.t, this.i);
                    if (a()) {
                        this.c.draw(canvas);
                        canvas.translate((float) this.s, (float) i7);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate((float) (-this.s), (float) (-i7));
                    } else {
                        canvas.translate((float) i4, 0.0f);
                        this.c.draw(canvas);
                        canvas.translate(0.0f, (float) i7);
                        this.b.draw(canvas);
                        canvas.translate((float) (-i4), (float) (-i7));
                    }
                }
                if (this.l) {
                    int i8 = this.i;
                    int i9 = this.w;
                    int i10 = i8 - i9;
                    int i11 = this.g;
                    int i12 = this.f;
                    int i13 = i11 - (i12 / 2);
                    this.u.setBounds(0, 0, i12, i9);
                    this.v.setBounds(0, 0, this.h, this.x);
                    canvas.translate(0.0f, (float) i10);
                    this.v.draw(canvas);
                    canvas.translate((float) i13, 0.0f);
                    this.u.draw(canvas);
                    canvas.translate((float) (-i13), (float) (-i10));
                }
            }
            return;
        }
        this.h = this.j.getWidth();
        this.i = this.j.getHeight();
        a(0);
    }

    public final void b(MotionEvent motionEvent) {
        if (this.m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                if (a2 || b2) {
                    if (b2) {
                        this.A = 1;
                        this.z = (float) ((int) motionEvent.getX());
                    } else if (a2) {
                        this.A = 2;
                        this.y = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.m == 2) {
                this.y = 0.0f;
                this.z = 0.0f;
                a(1);
                this.A = 0;
            } else {
                if (motionEvent.getAction() == 2 && this.m == 2) {
                    b();
                    if (this.A == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = this.C;
                        int i2 = this.r;
                        iArr[0] = i2;
                        iArr[1] = this.h - i2;
                        float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                        if (Math.abs(((float) this.g) - max) >= 2.0f) {
                            int a3 = a(this.z, max, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                            if (a3 != 0) {
                                this.j.scrollBy(a3, 0);
                            }
                            this.z = max;
                        }
                    }
                    if (this.A == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = this.B;
                        int i3 = this.r;
                        iArr2[0] = i3;
                        iArr2[1] = this.i - i3;
                        float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                        if (Math.abs(((float) this.e) - max2) >= 2.0f) {
                            int a4 = a(this.y, max2, iArr2, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                            if (a4 != 0) {
                                this.j.scrollBy(0, a4);
                            }
                            this.y = max2;
                        }
                    }
                }
            }
        }
    }
}
