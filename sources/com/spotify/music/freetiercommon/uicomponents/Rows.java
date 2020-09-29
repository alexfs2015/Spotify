package com.spotify.music.freetiercommon.uicomponents;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.List;

public final class Rows {

    static class RoundedLinearLayout extends LinearLayout {
        int a;
        int b;
        int c;
        int d;
        final float[] e = new float[8];
        private final RectF f = new RectF();
        private final Path g = new Path();

        public RoundedLinearLayout(Context context) {
            super(context, null);
        }

        public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int save = canvas.save();
            if (!this.g.isEmpty()) {
                try {
                    canvas.clipPath(this.g);
                } catch (UnsupportedOperationException e2) {
                    Logger.b(e2, "Failed clipping, moving on.", new Object[0]);
                }
            }
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.g.reset();
            this.f.set((float) this.a, (float) this.b, (float) ((i3 - i) - this.c), (float) ((i4 - i2) - this.d));
            this.g.addRoundRect(this.f, this.e, Direction.CW);
        }
    }

    public interface a {
        void a(List<View> list);
    }

    public interface b extends fre {
    }

    public interface c extends fri {
    }

    public interface d extends fri {
    }

    public interface e extends a, d {
    }

    public interface f extends a, frh {
    }

    public static b a(Context context, ViewGroup viewGroup, int i, int i2) {
        fqb.b();
        final fre b2 = frq.b(context, viewGroup);
        int b3 = uts.b(80.0f, context.getResources());
        int b4 = uts.b(64.0f, context.getResources());
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-1, b3));
        linearLayout.setMinimumHeight(b3);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView c2 = b2.c();
        ViewGroup.LayoutParams layoutParams = b2.c().getLayoutParams();
        layoutParams.height = b4;
        layoutParams.width = b4;
        c2.setLayoutParams(layoutParams);
        c2.setMinimumHeight(b4);
        c2.setMinimumWidth(b4);
        linearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        AnonymousClass1 r2 = new b() {
            public final TextView b() {
                return b2.b();
            }

            public final void a(CharSequence charSequence) {
                b2.a(charSequence);
            }

            public final ImageView c() {
                return b2.c();
            }

            public final void a(View view) {
                b2.a(view);
            }

            public final View a() {
                return b2.a();
            }

            public final void b(boolean z) {
                b2.b(z);
            }

            public final void a(boolean z) {
                b2.a(z);
            }

            public final View getView() {
                return linearLayout;
            }

            public final void c(boolean z) {
                b2.c(z);
            }
        };
        fqf.a(r2);
        return r2;
    }

    public static c b(Context context, ViewGroup viewGroup, int i, int i2) {
        fqb.b();
        final fri b2 = frq.b(context, viewGroup, false);
        int b3 = uts.b((float) ((i2 << 1) + i), context.getResources());
        int b4 = uts.b((float) i, context.getResources());
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-1, b3));
        linearLayout.setMinimumHeight(b3);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView c2 = b2.c();
        ViewGroup.LayoutParams layoutParams = b2.c().getLayoutParams();
        layoutParams.height = b4;
        layoutParams.width = b4;
        c2.setLayoutParams(layoutParams);
        c2.setMinimumHeight(b4);
        c2.setMinimumWidth(b4);
        linearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        AnonymousClass2 r4 = new c() {
            public final TextView b() {
                return b2.b();
            }

            public final TextView d() {
                return b2.d();
            }

            public final void a(CharSequence charSequence) {
                b2.a(charSequence);
            }

            public final void b(CharSequence charSequence) {
                b2.b(charSequence);
            }

            public final void c(CharSequence charSequence) {
                b2.c(charSequence);
            }

            public final ImageView c() {
                return b2.c();
            }

            public final void a(View view) {
                b2.a(view);
            }

            public final View a() {
                return b2.a();
            }

            public final void b(boolean z) {
                b2.b(z);
            }

            public final void a(boolean z) {
                b2.a(z);
            }

            public final View getView() {
                return linearLayout;
            }

            public final void c(boolean z) {
                b2.c(z);
            }
        };
        fqf.a(r4);
        return r4;
    }

    private static d b(Context context, ViewGroup viewGroup) {
        fqb.b();
        final fri b2 = frq.b(context, viewGroup, false);
        Resources resources = context.getResources();
        int b3 = uts.b(84.0f, resources);
        int b4 = uts.b(72.0f, resources);
        int b5 = uts.b(8.0f, resources);
        int b6 = uts.b(6.0f, resources);
        int b7 = uts.b(8.0f, resources);
        int b8 = uts.b(8.0f, resources);
        final RoundedLinearLayout roundedLinearLayout = new RoundedLinearLayout(context);
        roundedLinearLayout.setLayoutParams(new LayoutParams(-1, b3));
        roundedLinearLayout.setMinimumHeight(b3);
        roundedLinearLayout.setOrientation(0);
        roundedLinearLayout.setGravity(16);
        roundedLinearLayout.setBackgroundResource(R.drawable.bg_large_row_rounded);
        roundedLinearLayout.a = b5;
        roundedLinearLayout.b = b6;
        roundedLinearLayout.c = b5;
        roundedLinearLayout.d = b6;
        Arrays.fill(roundedLinearLayout.e, 0, 8, (float) b8);
        ImageView c2 = b2.c();
        ViewGroup.LayoutParams layoutParams = b2.c().getLayoutParams();
        layoutParams.height = b4;
        layoutParams.width = b4;
        c2.setLayoutParams(layoutParams);
        c2.setMinimumHeight(b4);
        c2.setMinimumWidth(b4);
        a((View) b2.c(), b7);
        roundedLinearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        AnonymousClass3 r9 = new d() {
            public final TextView b() {
                return b2.b();
            }

            public final TextView d() {
                return b2.d();
            }

            public final void a(CharSequence charSequence) {
                b2.a(charSequence);
            }

            public final void b(CharSequence charSequence) {
                b2.b(charSequence);
            }

            public final void c(CharSequence charSequence) {
                b2.c(charSequence);
            }

            public final ImageView c() {
                return b2.c();
            }

            public final void a(View view) {
                b2.a(view);
            }

            public final View a() {
                return b2.a();
            }

            public final void b(boolean z) {
                b2.b(z);
            }

            public final void a(boolean z) {
                b2.a(z);
            }

            public final View getView() {
                return roundedLinearLayout;
            }

            public final void c(boolean z) {
                b2.c(z);
            }
        };
        fqf.a(r9);
        return r9;
    }

    public static e a(Context context, ViewGroup viewGroup) {
        final d b2 = b(context, viewGroup);
        final rgi rgi = new rgi((ViewGroup) b2.getView().findViewById(R.id.accessory));
        AnonymousClass5 r2 = new e() {
            public final TextView b() {
                return b2.b();
            }

            public final TextView d() {
                return b2.d();
            }

            public final void a(CharSequence charSequence) {
                b2.a(charSequence);
            }

            public final void b(CharSequence charSequence) {
                b2.b(charSequence);
            }

            public final void c(CharSequence charSequence) {
                b2.c(charSequence);
            }

            public final ImageView c() {
                return b2.c();
            }

            public final void a(View view) {
                rgi.a(view);
            }

            public final View a() {
                return rgi.b();
            }

            public final void b(boolean z) {
                rgi.a(z);
            }

            public final void a(boolean z) {
                b2.a(z);
            }

            public final View getView() {
                return b2.getView();
            }

            public final void c(boolean z) {
                b2.c(z);
            }

            public final void a(List<View> list) {
                rgi.a(list);
                rgi.a();
            }
        };
        fqf.a(r2);
        return r2;
    }

    private static void a(View view, int i) {
        int i2;
        while (i > 0 && view != null) {
            int paddingLeft = view.getPaddingLeft();
            if (paddingLeft > 0) {
                int i3 = 0;
                if (paddingLeft > i) {
                    i2 = paddingLeft - i;
                } else {
                    i3 = i - paddingLeft;
                    i2 = 0;
                }
                view.setPadding(i2, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                i = i3;
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
    }
}
