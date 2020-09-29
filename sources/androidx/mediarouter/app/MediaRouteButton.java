package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

public class MediaRouteButton extends View {
    static final SparseArray<ConstantState> f = new SparseArray<>(2);
    private static a i;
    private static final int[] r = {16842912};
    private static final int[] s = {16842911};
    final ni a;
    final b b;
    nh c;
    mx d;
    boolean e;
    c g;
    boolean h;
    private int j;
    private Drawable k;
    private int l;
    private int m;
    private ColorStateList n;
    private int o;
    private int p;
    private boolean q;

    static final class a extends BroadcastReceiver {
        final Context a;
        boolean b = true;
        List<MediaRouteButton> c;

        a(Context context) {
            this.a = context;
            this.c = new ArrayList();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                boolean z = !intent.getBooleanExtra("noConnectivity", false);
                if (this.b != z) {
                    this.b = z;
                    for (MediaRouteButton b2 : this.c) {
                        b2.b();
                    }
                }
            }
        }
    }

    final class b extends defpackage.ni.a {
        b() {
        }

        public final void a() {
            MediaRouteButton.this.c();
        }

        public final void a(f fVar) {
            MediaRouteButton.this.c();
        }

        public final void a(ni niVar) {
            MediaRouteButton.this.c();
        }

        public final void a(ni niVar, f fVar) {
            MediaRouteButton.this.c();
        }

        public final void b(ni niVar) {
            MediaRouteButton.this.c();
        }

        public final void b(ni niVar, f fVar) {
            MediaRouteButton.this.c();
        }

        public final void c(ni niVar) {
            MediaRouteButton.this.c();
        }

        public final void c(ni niVar, f fVar) {
            MediaRouteButton.this.c();
        }
    }

    final class c extends AsyncTask<Void, Void, Drawable> {
        private final int a;
        private final Context b;

        c(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onCancelled(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.f.put(this.a, drawable.getConstantState());
            }
            MediaRouteButton.this.g = null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            if (((ConstantState) MediaRouteButton.f.get(this.a)) == null) {
                return this.b.getResources().getDrawable(this.a);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Drawable drawable = (Drawable) obj;
            if (drawable != null) {
                onCancelled(drawable);
            } else {
                ConstantState constantState = (ConstantState) MediaRouteButton.f.get(this.a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                MediaRouteButton.this.g = null;
            }
            MediaRouteButton.this.a(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i2) {
        super(nb.g(context), attributeSet, i2);
        this.c = nh.c;
        this.d = mx.a();
        this.j = 0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, defpackage.ms.a.a, i2, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.k = getResources().getDrawable(obtainStyledAttributes.getResourceId(defpackage.ms.a.e, 0));
            return;
        }
        this.a = ni.a(context2);
        this.b = new b();
        if (i == null) {
            i = new a(context2.getApplicationContext());
        }
        this.n = obtainStyledAttributes.getColorStateList(defpackage.ms.a.f);
        this.o = obtainStyledAttributes.getDimensionPixelSize(defpackage.ms.a.b, 0);
        this.p = obtainStyledAttributes.getDimensionPixelSize(defpackage.ms.a.c, 0);
        int resourceId = obtainStyledAttributes.getResourceId(defpackage.ms.a.e, 0);
        this.l = obtainStyledAttributes.getResourceId(defpackage.ms.a.d, 0);
        obtainStyledAttributes.recycle();
        int i3 = this.l;
        if (i3 != 0) {
            ConstantState constantState = (ConstantState) f.get(i3);
            if (constantState != null) {
                Drawable newDrawable = constantState.newDrawable();
                this.l = 0;
                a(newDrawable);
            }
        }
        if (this.k == null) {
            if (resourceId != 0) {
                ConstantState constantState2 = (ConstantState) f.get(resourceId);
                if (constantState2 != null) {
                    a(constantState2.newDrawable());
                } else {
                    this.g = new c(resourceId, getContext());
                    this.g.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                f();
            }
        }
        g();
        setClickable(true);
    }

    private kk d() {
        Activity e2 = e();
        if (e2 instanceof kf) {
            return ((kf) e2).i();
        }
        return null;
    }

    private Activity e() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private void f() {
        if (this.l > 0) {
            c cVar = this.g;
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.g = new c(this.l, getContext());
            this.l = 0;
            this.g.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private void g() {
        int i2 = this.m;
        int i3 = i2 != 1 ? i2 != 2 ? R.string.mr_cast_button_disconnected : R.string.mr_cast_button_connected : R.string.mr_cast_button_connecting;
        setContentDescription(getContext().getString(i3));
    }

    /* access modifiers changed from: 0000 */
    public final void a(Drawable drawable) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.k);
        }
        if (drawable != null) {
            if (this.n != null) {
                drawable = gm.f(drawable.mutate());
                gm.a(drawable, this.n);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.k = drawable;
        refreshDrawableState();
        if (this.e) {
            Drawable drawable3 = this.k;
            if (drawable3 != null && (drawable3.getCurrent() instanceof AnimationDrawable)) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.k.getCurrent();
                int i2 = this.m;
                if (i2 == 1) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i2 == 2) {
                    if (animationDrawable.isRunning()) {
                        animationDrawable.stop();
                    }
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
        }
    }

    public final boolean a() {
        if (!this.e) {
            return false;
        }
        kk d2 = d();
        if (d2 != null) {
            f c2 = ni.c();
            if (c2.c() || !c2.a(this.c)) {
                String str = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
                if (d2.a(str) != null) {
                    return false;
                }
                mu b2 = mx.b();
                b2.a(this.c);
                b2.i(this.q);
                kr a2 = d2.a();
                a2.a((Fragment) b2, str);
                a2.c();
            } else {
                String str2 = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
                if (d2.a(str2) != null) {
                    return false;
                }
                mw c3 = mx.c();
                c3.a(this.c);
                c3.i(this.q);
                kr a3 = d2.a();
                a3.a((Fragment) c3, str2);
                a3.c();
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        super.setVisibility((this.j != 0 || this.h || i.b) ? this.j : 4);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        boolean z;
        f c2 = ni.c();
        boolean z2 = false;
        int i2 = !c2.c() && c2.a(this.c) ? c2.h : 0;
        if (this.m != i2) {
            this.m = i2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g();
            refreshDrawableState();
        }
        if (i2 == 1) {
            f();
        }
        if (this.e) {
            if (this.h || ni.a(this.c, 1)) {
                z2 = true;
            }
            setEnabled(z2);
        }
        Drawable drawable = this.k;
        if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.k.getCurrent();
            if (this.e) {
                if ((z || i2 == 1) && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (i2 == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.k != null) {
            this.k.setState(getDrawableState());
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.e = true;
            if (!this.c.c()) {
                this.a.a(this.c, this.b, 0);
            }
            c();
            a aVar = i;
            if (aVar.c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                aVar.a.registerReceiver(aVar, intentFilter);
            }
            aVar.c.add(this);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        int i3 = this.m;
        if (i3 == 1) {
            mergeDrawableStates(onCreateDrawableState, s);
        } else if (i3 == 2) {
            mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.e = false;
            if (!this.c.c()) {
                this.a.a((defpackage.ni.a) this.b);
            }
            a aVar = i;
            aVar.c.remove(this);
            if (aVar.c.size() == 0) {
                aVar.a.unregisterReceiver(aVar);
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.k != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.k.getIntrinsicWidth();
            int intrinsicHeight = this.k.getIntrinsicHeight();
            int i2 = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i3 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.k.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.k.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i3);
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int i4 = this.o;
        Drawable drawable = this.k;
        int i5 = 0;
        int max = Math.max(i4, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i6 = this.p;
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i6, i5);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        f();
        return a() || performClick;
    }

    public void setVisibility(int i2) {
        this.j = i2;
        b();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.k;
    }
}
