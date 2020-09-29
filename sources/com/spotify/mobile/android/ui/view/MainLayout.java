package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;
import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;
import java.util.HashSet;
import java.util.Set;

public class MainLayout extends ConstraintLayout {
    public SnackBar b;
    public SnackBar c;
    public ViewGroup d;
    public c e = new d(this, 0);
    public b f;
    public final Set<defpackage.lbr.a> g = new HashSet();
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public ViewGroup i;
    /* access modifiers changed from: private */
    public FrameLayout j;
    /* access modifiers changed from: private */
    public View k;
    /* access modifiers changed from: private */
    public ConnectAccessButton l;
    /* access modifiers changed from: private */
    public ConnectAccessViewModel m;

    public class a implements c {
        private a() {
        }

        public /* synthetic */ a(MainLayout mainLayout, byte b) {
            this();
        }

        public final void a(int i, int i2) {
            MainLayout.super.onMeasure(i, i2);
        }

        public final void a(boolean z, int i, int i2, int i3, int i4) {
            int i5 = i2;
            int i6 = i4;
            MainLayout.super.onLayout(z, i, i2, i3, i4);
            if (MainLayout.this.k != null) {
                MainLayout.this.k.setPadding(0, MainLayout.c(MainLayout.this) ? 0 : MainLayout.this.d.getMeasuredHeight(), 0, 0);
            }
            MainLayout mainLayout = MainLayout.this;
            mainLayout.a(mainLayout.b, 0.0f);
            Visibility visibility = Visibility.SHOW;
            int childCount = MainLayout.this.getChildCount();
            Visibility visibility2 = visibility;
            boolean z2 = false;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = MainLayout.this.getChildAt(i7);
                if (!(childAt == MainLayout.this.d || !MainLayout.b(childAt) || MainLayout.this.f == null)) {
                    z2 = MainLayout.this.f.a();
                    visibility2 = MainLayout.this.f.b();
                }
            }
            if (MainLayout.this.f != null) {
                MainLayout.this.f.a(z2, visibility2);
            }
        }
    }

    public interface b {
        void a(boolean z, Visibility visibility);

        boolean a();

        Visibility b();
    }

    interface c {
        void a(int i, int i2);

        void a(boolean z, int i, int i2, int i3, int i4);
    }

    class d implements c {
        private d() {
        }

        /* synthetic */ d(MainLayout mainLayout, byte b) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            MainLayout.this.l.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i, int i2, int i3) {
            MainLayout.a(MainLayout.this, i, i2, i3);
        }

        public final void a(int i, int i2) {
            MainLayout.this.setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
            Visibility visibility = Visibility.SHOW;
            View view = null;
            boolean z = false;
            for (int i3 = 0; i3 < MainLayout.this.getChildCount(); i3++) {
                View childAt = MainLayout.this.getChildAt(i3);
                if (childAt != MainLayout.this.d && MainLayout.b(childAt)) {
                    if (MainLayout.this.f != null) {
                        z = MainLayout.this.f.a();
                        visibility = MainLayout.this.f.b();
                    }
                    View view2 = childAt;
                    view = childAt;
                }
            }
            if (MainLayout.this.f != null) {
                MainLayout.this.f.a(z, visibility);
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MainLayout.this.getMeasuredWidth(), 1073741824);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(MainLayout.this.getMeasuredHeight(), 1073741824);
            MainLayout.this.c.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(0, 0));
            MainLayout.this.b.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(0, 0));
            MainLayout.this.i.measure(makeMeasureSpec, makeMeasureSpec2);
            MainLayout.this.j.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(0, 0));
            if (MainLayout.this.d != null) {
                MainLayout.this.d.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(MainLayout.this.h, 1073741824));
            }
            if (MainLayout.this.m != null) {
                MainLayout.this.m.a((Runnable) new Runnable(makeMeasureSpec) {
                    private final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        d.this.a(this.f$1);
                    }
                });
            }
            int measuredHeight = (MainLayout.this.getMeasuredHeight() - MainLayout.this.c.b) - MainLayout.this.b.b;
            if (MainLayout.this.b.b > 0 && gau.b(MainLayout.this.getContext())) {
                measuredHeight += gau.a(MainLayout.this.getContext().getResources());
            }
            int measuredHeight2 = measuredHeight - MainLayout.this.j.getMeasuredHeight();
            int makeMeasureSpec3 = MeasureSpec.makeMeasureSpec(measuredHeight2 - MainLayout.this.d.getMeasuredHeight(), 1073741824);
            int makeMeasureSpec4 = MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
            if (view == null) {
                return;
            }
            if (z || visibility == Visibility.HIDE) {
                view.measure(makeMeasureSpec, makeMeasureSpec4);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec3);
            }
        }

        public final void a(boolean z, int i, int i2, int i3, int i4) {
            int i5 = MainLayout.this.h;
            MainLayout.l(MainLayout.this);
            int measuredHeight = MainLayout.this.j.getMeasuredHeight();
            int measuredHeight2 = MainLayout.this.c.getMeasuredHeight();
            int height = MainLayout.this.getHeight() - MainLayout.this.j.getMeasuredHeight();
            int height2 = MainLayout.this.getHeight();
            MainLayout.this.j.layout(0, height, MainLayout.this.getWidth(), height2);
            MainLayout.this.c.layout(0, (height2 - measuredHeight) - MainLayout.this.c.getMeasuredHeight(), MainLayout.this.getWidth(), MainLayout.this.getHeight() - measuredHeight);
            if (MainLayout.this.m != null) {
                MainLayout.this.m.a((Runnable) new Runnable(height2, measuredHeight2, measuredHeight) {
                    private final /* synthetic */ int f$1;
                    private final /* synthetic */ int f$2;
                    private final /* synthetic */ int f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        d.this.a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
            MainLayout.this.b.layout(0, 0, MainLayout.this.getWidth(), MainLayout.this.b.getMeasuredHeight());
            int i6 = MainLayout.this.b.b;
            int i7 = i5 + MainLayout.this.b.b;
            int a2 = (!gau.b(MainLayout.this.getContext()) || i6 == 0) ? 0 : gau.a(MainLayout.this.getContext().getResources());
            int i8 = i6 - a2;
            int i9 = i7 - a2;
            MainLayout.this.i.layout(0, i9, MainLayout.this.getWidth(), MainLayout.this.getHeight() - MainLayout.this.c.getMeasuredHeight());
            if (MainLayout.this.d != null) {
                MainLayout.this.d.layout(0, i8, MainLayout.this.getMeasuredWidth(), MainLayout.this.d.getMeasuredHeight() + i8);
            }
            for (int i10 = 0; i10 < MainLayout.this.getChildCount(); i10++) {
                View childAt = MainLayout.this.getChildAt(i10);
                if (childAt != MainLayout.this.d && MainLayout.b(childAt)) {
                    if (MainLayout.c(MainLayout.this)) {
                        childAt.layout(0, i8, MainLayout.this.getWidth(), MainLayout.this.getMeasuredHeight() - MainLayout.this.c.b);
                    } else {
                        childAt.layout(0, i9, MainLayout.this.getWidth(), MainLayout.this.getMeasuredHeight() - MainLayout.this.c.b);
                    }
                }
            }
            if (MainLayout.this.d != null) {
                MainLayout.this.d.bringToFront();
            }
            MainLayout.this.c.bringToFront();
            MainLayout.this.b.bringToFront();
            MainLayout.this.j.bringToFront();
            MainLayout.this.i.bringToFront();
            MainLayout.this.l.bringToFront();
        }
    }

    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public void a(View view, float f2) {
        float measuredHeight = f2 + ((float) view.getMeasuredHeight());
        if (gau.b(getContext())) {
            measuredHeight -= (float) gau.a(getContext().getResources());
            if (measuredHeight < 0.0f) {
                measuredHeight = 0.0f;
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (c(childAt)) {
                childAt.setTranslationY(measuredHeight);
            }
        }
    }

    static /* synthetic */ void a(MainLayout mainLayout, int i2, int i3, int i4) {
        int height = (mainLayout.getHeight() - i3) - i4;
        mainLayout.l.layout(0, ((i2 - i3) - i4) - mainLayout.l.getMeasuredHeight(), mainLayout.getWidth(), height);
    }

    static /* synthetic */ boolean b(View view) {
        int d2 = d(view);
        return (d2 == R.id.actionbar_shadow || d2 == R.id.snack_bar_bottom || d2 == R.id.snack_bar_top || d2 == R.id.navigation_bar || d2 == R.id.tooltip_container || d2 == R.id.connect_access_button) ? false : true;
    }

    private static boolean c(View view) {
        int d2 = d(view);
        return (d2 == R.id.snack_bar_top || d2 == R.id.snack_bar_bottom || d2 == R.id.navigation_bar || d2 == R.id.side_panel_background) ? false : true;
    }

    static /* synthetic */ boolean c(MainLayout mainLayout) {
        b bVar = mainLayout.f;
        return bVar != null && (bVar.a() || mainLayout.f.b() == Visibility.HIDE);
    }

    private static int d(View view) {
        int id = view.getId();
        if (id < 0 && (view instanceof ViewGroup)) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if (childAt != null) {
                id = childAt.getId();
            }
        }
        return id;
    }

    static /* synthetic */ void l(MainLayout mainLayout) {
        for (int i2 = 0; i2 < mainLayout.getChildCount(); i2++) {
            View childAt = mainLayout.getChildAt(i2);
            if (c(childAt)) {
                boolean z = true | false;
                childAt.setTranslationY(0.0f);
            }
        }
    }

    public final void a(ConnectAccessViewModel connectAccessViewModel) {
        this.m = (ConnectAccessViewModel) fbp.a(connectAccessViewModel);
        ConnectAccessViewModel connectAccessViewModel2 = this.m;
        connectAccessViewModel2.c.add(new Runnable() {
            public final void run() {
                MainLayout.this.requestLayout();
            }
        });
        ConnectAccessViewModel connectAccessViewModel3 = this.m;
        if (connectAccessViewModel3 != null) {
            ConnectAccessButton connectAccessButton = this.l;
            connectAccessViewModel3.e = Optional.b(new rxs(connectAccessButton, connectAccessViewModel3.a));
            connectAccessViewModel3.f = Optional.b(new rxz(connectAccessButton));
            connectAccessViewModel3.a(0, (GaiaDevice) null);
            Runnable a2 = connectAccessViewModel3.a(connectAccessButton);
            if (connectAccessViewModel3.a()) {
                a2.run();
                return;
            }
            connectAccessViewModel3.c.add(a2);
        }
    }

    public final void b() {
        for (defpackage.lbr.a an : this.g) {
            an.an();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (SnackBar) findViewById(R.id.snack_bar_top);
        this.c = (SnackBar) findViewById(R.id.snack_bar_bottom);
        this.j = (FrameLayout) findViewById(R.id.navigation_bar);
        this.i = (ViewGroup) findViewById(R.id.tooltip_container);
        this.d = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        this.k = findViewById(R.id.fragment_container);
        this.l = (ConnectAccessButton) findViewById(R.id.connect_access_button);
        this.h = gav.b(getContext());
        this.b.c = (com.spotify.mobile.android.ui.view.snackbar.SnackBar.b) fbm.a(new com.spotify.mobile.android.ui.view.snackbar.SnackBar.b() {
            public final void onAnimationFrame(View view, float f) {
                MainLayout.this.a(view, f);
            }
        }, SnackBar.d);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2 = z;
        int i6 = i2;
        int i7 = i4;
        int i8 = i5;
        this.e.a(z, i2, i3, i4, i5);
    }

    public void onMeasure(int i2, int i3) {
        this.e.a(i2, i3);
    }
}
