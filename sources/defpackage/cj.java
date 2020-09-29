package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.spotify.music.R;

/* renamed from: cj reason: default package */
public final class cj extends HorizontalScrollView implements OnItemSelectedListener {
    Runnable a;
    public boolean b;
    int c;
    int d;
    private Spinner e;
    private int f;
    private int g;

    /* renamed from: cj$a */
    class a extends BaseAdapter {
        a() {
        }

        public final int getCount() {
            LinearLayoutCompat linearLayoutCompat = null;
            return linearLayoutCompat.getChildCount();
        }

        public final Object getItem(int i) {
            LinearLayoutCompat linearLayoutCompat = null;
            return ((b) linearLayoutCompat.getChildAt(i)).a;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                cj cjVar = cj.this;
                b bVar = new b(cjVar.getContext(), (androidx.appcompat.app.ActionBar.a) getItem(i), true);
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new LayoutParams(-1, cjVar.d));
                return bVar;
            }
            b bVar2 = (b) view;
            bVar2.a = (androidx.appcompat.app.ActionBar.a) getItem(i);
            bVar2.a();
            return view;
        }
    }

    /* renamed from: cj$b */
    class b extends LinearLayout {
        androidx.appcompat.app.ActionBar.a a;
        private final int[] b = {16842964};
        private TextView c;
        private ImageView d;
        private View e;

        public b(Context context, androidx.appcompat.app.ActionBar.a aVar, boolean z) {
            super(context, null, R.attr.actionBarTabStyle);
            this.a = aVar;
            cp a2 = cp.a(context, null, this.b, R.attr.actionBarTabStyle, 0);
            if (a2.f(0)) {
                setBackgroundDrawable(a2.a(0));
            }
            a2.a.recycle();
            if (z) {
                setGravity(8388627);
            }
            a();
        }

        public final void a() {
            androidx.appcompat.app.ActionBar.a aVar = this.a;
            View c2 = aVar.c();
            CharSequence charSequence = null;
            if (c2 != null) {
                ViewParent parent = c2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c2);
                    }
                    addView(c2);
                }
                this.e = c2;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                return;
            }
            View view = this.e;
            if (view != null) {
                removeView(view);
                this.e = null;
            }
            Drawable a2 = aVar.a();
            CharSequence b2 = aVar.b();
            if (a2 != null) {
                if (this.d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.d = appCompatImageView;
                }
                this.d.setImageDrawable(a2);
                this.d.setVisibility(0);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(b2);
            if (z) {
                if (this.c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.c = appCompatTextView;
                }
                this.c.setText(b2);
                this.c.setVisibility(0);
            } else {
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.c.setText(null);
                }
            }
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setContentDescription(aVar.d());
            }
            if (!z) {
                charSequence = aVar.d();
            }
            cr.a(this, charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (cj.this.c > 0 && getMeasuredWidth() > cj.this.c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(cj.this.c, 1073741824), i2);
            }
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private void a(int i) {
        this.g = i;
        LinearLayoutCompat linearLayoutCompat = null;
        int childCount = linearLayoutCompat.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = linearLayoutCompat.getChildAt(i);
                Runnable runnable = this.a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                this.a = new Runnable() {
                    public final void run() {
                        cj.this.smoothScrollTo(childAt2.getLeft() - ((cj.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        cj.this.a = null;
                    }
                };
                post(this.a);
            }
            i2++;
        }
        Spinner spinner = this.e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    private boolean a() {
        Spinner spinner = this.e;
        return spinner != null && spinner.getParent() == this;
    }

    private boolean b() {
        if (!a()) {
            return false;
        }
        removeView(this.e);
        addView(null, new ViewGroup.LayoutParams(-2, -1));
        a(this.e.getSelectedItemPosition());
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai a2 = ai.a(getContext());
        TypedArray obtainStyledAttributes = a2.a.obtainStyledAttributes(null, defpackage.o.a.a, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(defpackage.o.a.j, 0);
        Resources resources = a2.a.getResources();
        if (!a2.b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        this.d = layoutDimension;
        requestLayout();
        this.f = a2.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.util.AttributeSet, android.view.View, java.lang.Runnable, androidx.appcompat.widget.LinearLayoutCompat] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0, types: [android.util.AttributeSet, android.view.View, java.lang.Runnable, androidx.appcompat.widget.LinearLayoutCompat]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [androidx.appcompat.widget.LinearLayoutCompat, android.view.View, java.lang.Runnable, android.util.AttributeSet]
      mth insns count: 75
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r10 = android.view.View.MeasureSpec.getMode(r9)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto L_0x000c
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            r8.setFillViewport(r3)
            r4 = 0
            int r5 = r4.getChildCount()
            r6 = -1
            if (r5 <= r0) goto L_0x0041
            if (r10 == r2) goto L_0x001e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r7) goto L_0x0041
        L_0x001e:
            r10 = 2
            if (r5 <= r10) goto L_0x002f
            int r10 = android.view.View.MeasureSpec.getSize(r9)
            float r10 = (float) r10
            r5 = 1053609165(0x3ecccccd, float:0.4)
            float r10 = r10 * r5
            int r10 = (int) r10
            r8.c = r10
            goto L_0x0036
        L_0x002f:
            int r5 = android.view.View.MeasureSpec.getSize(r9)
            int r5 = r5 / r10
            r8.c = r5
        L_0x0036:
            int r10 = r8.c
            int r5 = r8.f
            int r10 = java.lang.Math.min(r10, r5)
            r8.c = r10
            goto L_0x0043
        L_0x0041:
            r8.c = r6
        L_0x0043:
            int r10 = r8.d
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            if (r3 != 0) goto L_0x0050
            boolean r2 = r8.b
            if (r2 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x00b8
            r4.measure(r1, r10)
            int r0 = r4.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r0 <= r1) goto L_0x00b4
            boolean r0 = r8.a()
            if (r0 != 0) goto L_0x00bb
            android.widget.Spinner r0 = r8.e
            r1 = -2
            if (r0 != 0) goto L_0x0084
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            android.content.Context r2 = r8.getContext()
            r5 = 2130968588(0x7f04000c, float:1.7545834E38)
            r0.<init>(r2, r4, r5)
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2.<init>(r1, r6)
            r0.setLayoutParams(r2)
            r0.setOnItemSelectedListener(r8)
            r8.e = r0
        L_0x0084:
            r8.removeView(r4)
            android.widget.Spinner r0 = r8.e
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r6)
            r8.addView(r0, r2)
            android.widget.Spinner r0 = r8.e
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L_0x00a3
            android.widget.Spinner r0 = r8.e
            cj$a r1 = new cj$a
            r1.<init>()
            r0.setAdapter(r1)
        L_0x00a3:
            java.lang.Runnable r0 = r8.a
            if (r0 == 0) goto L_0x00ac
            r8.removeCallbacks(r0)
            r8.a = r4
        L_0x00ac:
            android.widget.Spinner r0 = r8.e
            int r1 = r8.g
            r0.setSelection(r1)
            goto L_0x00bb
        L_0x00b4:
            r8.b()
            goto L_0x00bb
        L_0x00b8:
            r8.b()
        L_0x00bb:
            int r0 = r8.getMeasuredWidth()
            super.onMeasure(r9, r10)
            int r9 = r8.getMeasuredWidth()
            if (r3 == 0) goto L_0x00cf
            if (r0 == r9) goto L_0x00cf
            int r9 = r8.g
            r8.a(r9)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.onMeasure(int, int):void");
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
