package com.spotify.android.glue.components.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class GlueToolbarLayout extends ViewGroup {
    public final Map<Integer, View> a;
    public final Map<Integer, View> b;
    public final TextView c;
    public final fsh d;
    public ImageButton e;
    private OnClickListener f;
    private int g;

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(View view) {
    }

    public GlueToolbarLayout(Context context) {
        this(context, null);
    }

    public GlueToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.f = $$Lambda$GlueToolbarLayout$pEF9nWWlE5fiJW7XHJLRoAkRfk.INSTANCE;
        this.c = new TextView(context);
        this.c.setId(R.id.glue_toolbar_title);
        this.c.setGravity(17);
        this.c.setEllipsize(TruncateAt.END);
        this.c.setMaxLines(1);
        uuu.b(context, this.c, R.attr.pasteTextAppearanceBodyMediumBold);
        this.c.setLayoutParams(new LayoutParams(-2, -2));
        addView(this.c);
        this.d = new fsh(context);
    }

    public final void a(ToolbarSide toolbarSide, View view, int i) {
        if (!this.a.containsKey(Integer.valueOf(i)) && !this.b.containsKey(Integer.valueOf(i))) {
            (toolbarSide == ToolbarSide.START ? this.a : this.b).put(Integer.valueOf(i), view);
            addView(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Collection<View> collection;
        Collection<View> collection2;
        Assertion.a(!jsc.b(i), "GlueToolbarLayout does not support UNSPECIFIED width measure spec");
        Assertion.a(!jsc.b(i2), "GlueToolbarLayout does not support UNSPECIFIED height measure spec");
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int b2 = uts.b(40.0f, getResources());
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(b2, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(b2, 1073741824);
        int makeMeasureSpec3 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec4 = MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        if (uur.a((View) this)) {
            collection2 = this.b.values();
            collection = this.a.values();
        } else {
            collection2 = this.a.values();
            collection = this.b.values();
        }
        int i3 = 0;
        int i4 = 0;
        for (View view : collection2) {
            if (view instanceof ImageButton) {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec3, makeMeasureSpec4);
            }
            i4 += view.getMeasuredWidth();
        }
        for (View view2 : collection) {
            if (view2 instanceof ImageButton) {
                view2.measure(makeMeasureSpec, makeMeasureSpec2);
            } else {
                view2.measure(makeMeasureSpec3, makeMeasureSpec4);
            }
            i3 += view2.getMeasuredWidth();
        }
        this.c.measure(makeMeasureSpec3, makeMeasureSpec4);
        float f2 = ((float) size) / 2.0f;
        float measuredWidth = f2 - (((float) this.c.getMeasuredWidth()) / 2.0f);
        float measuredWidth2 = f2 + (((float) this.c.getMeasuredWidth()) / 2.0f);
        float max = Math.max(measuredWidth, (float) i4);
        float min = Math.min(measuredWidth2, (float) (size - i3));
        this.g = (int) Math.floor((double) max);
        this.c.measure(MeasureSpec.makeMeasureSpec((int) Math.ceil((double) (min - max)), 1073741824), makeMeasureSpec4);
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Collection<View> collection;
        Collection<View> collection2;
        if (uur.a((View) this)) {
            collection2 = this.b.values();
            collection = this.a.values();
        } else {
            collection2 = this.a.values();
            collection = this.b.values();
        }
        int i5 = 0;
        int i6 = 0;
        for (View view : collection2) {
            int measuredHeight = (getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            view.layout(i6, measuredHeight, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + measuredHeight);
            i6 += view.getMeasuredWidth();
        }
        for (View view2 : collection) {
            int measuredHeight2 = (getMeasuredHeight() / 2) - (view2.getMeasuredHeight() / 2);
            view2.layout((getMeasuredWidth() - i5) - view2.getMeasuredWidth(), measuredHeight2, getMeasuredWidth() - i5, view2.getMeasuredHeight() + measuredHeight2);
            i5 += view2.getMeasuredWidth();
        }
        this.c.layout(this.g, (getMeasuredHeight() / 2) - (this.c.getMeasuredHeight() / 2), this.g + this.c.getMeasuredWidth(), (getMeasuredHeight() / 2) + (this.c.getMeasuredHeight() / 2));
    }

    public void a() {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(getContext());
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(getContext(), SpotifyIconV2.MORE_ANDROID, (float) getResources().getDimensionPixelSize(R.dimen.toolbar_context_menu_icon_size)));
        ip.a((View) stateListAnimatorImageButton, (Drawable) null);
        stateListAnimatorImageButton.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                GlueToolbarLayout.this.a(view);
            }
        });
        a(ToolbarSide.END, stateListAnimatorImageButton, R.id.legacy_overflow);
        this.d.c = stateListAnimatorImageButton;
        this.e = stateListAnimatorImageButton;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        fsh fsh = this.d;
        fsh.d = new ListPopupWindow(fsh.a, null);
        fsh.d.a((OnDismissListener) fsh);
        fsh.d.l = fsh;
        fsh.d.a((ListAdapter) fsh.f);
        boolean z = true;
        fsh.d.a(true);
        View view2 = (View) fay.a(fsh.c);
        if (fsh.e != null) {
            z = false;
        }
        fsh.e = view2.getViewTreeObserver();
        if (z) {
            fsh.e.addOnGlobalLayoutListener(fsh);
        }
        fsh.d.k = view2;
        fsh.d.h = 8388613;
        fsh.d.d(uts.a(220.0f, fsh.a.getResources()));
        fsh.d.e(2);
        fsh.d.d_();
        ((ListView) fay.a(fsh.d.e)).setOnKeyListener(fsh);
        this.f.onClick(view);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.a();
    }
}
