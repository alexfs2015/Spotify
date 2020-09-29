package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;

/* renamed from: fxa reason: default package */
public final class fxa extends ViewGroup implements fxc {
    private final ScrollView a;
    private final PrettyHeaderView b;
    private final StickyListView c;
    private fxn d;

    public final void a(boolean z) {
    }

    public final void b(boolean z) {
    }

    public final void c(boolean z) {
    }

    public final View d() {
        return this;
    }

    public fxa(Context context, View view) {
        super(context);
        this.b = new PrettyHeaderView(context, view);
        this.a = new ScrollView(context);
        this.a.addView(this.b);
        this.c = new StickyListView(context);
        this.c.setPadding(0, uts.b(1.0f, context.getResources()), 0, 0);
        addView(this.a);
        addView(this.c);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i3 = paddingLeft / 3;
        int i4 = paddingLeft - i3;
        this.b.d(paddingTop);
        this.a.measure(MeasureSpec.makeMeasureSpec(i3, 1073741824), MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        this.c.measure(MeasureSpec.makeMeasureSpec(i4, 1073741824), MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (uur.a((View) this)) {
            int measuredWidth = this.c.getMeasuredWidth() + paddingLeft;
            this.c.layout(paddingLeft, paddingTop, measuredWidth, this.c.getMeasuredHeight() + paddingTop);
            this.a.layout(measuredWidth, paddingTop, this.a.getMeasuredWidth() + measuredWidth, this.a.getMeasuredHeight() + paddingTop);
            return;
        }
        int measuredWidth2 = this.a.getMeasuredWidth() + paddingLeft;
        this.a.layout(paddingLeft, paddingTop, measuredWidth2, this.a.getMeasuredHeight() + paddingTop);
        this.c.layout(measuredWidth2, paddingTop, this.c.getMeasuredWidth() + measuredWidth2, this.c.getMeasuredHeight() + paddingTop);
    }

    public final StickyListView a() {
        return this.c;
    }

    public final PrettyHeaderView b() {
        return this.b;
    }

    public final void a(fxn fxn) {
        this.d = fxn;
    }

    public final void a(String str) {
        fxn fxn = this.d;
        if (fxn != null) {
            fxn.a(str);
        }
    }

    public final ImageView c() {
        return this.b.c();
    }

    public final void a(View view) {
        this.b.a(view);
    }

    public final void a(int i) {
        this.c.a(i);
    }

    public final void b(View view) {
        this.c.a(view);
        this.c.b(view);
    }
}
