package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public final class ToolTipPopup {
    final WeakReference<View> a;
    a b;
    PopupWindow c;
    Style d = Style.BLUE;
    long e = 6000;
    private final String f;
    private final Context g;
    private final OnScrollChangedListener h = new OnScrollChangedListener() {
        public final void onScrollChanged() {
            if (!(ToolTipPopup.this.a.get() == null || ToolTipPopup.this.c == null || !ToolTipPopup.this.c.isShowing())) {
                if (ToolTipPopup.this.c.isAboveAnchor()) {
                    ToolTipPopup.this.b.b();
                    return;
                }
                ToolTipPopup.this.b.a();
            }
        }
    };

    public enum Style {
        BLUE,
        BLACK
    }

    class a extends FrameLayout {
        /* access modifiers changed from: private */
        public ImageView a = ((ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer));
        /* access modifiers changed from: private */
        public ImageView b = ((ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer));
        /* access modifiers changed from: private */
        public View c = findViewById(R.id.com_facebook_body_frame);
        /* access modifiers changed from: private */
        public ImageView d = ((ImageView) findViewById(R.id.com_facebook_button_xout));

        public a(Context context) {
            super(context);
            LayoutInflater.from(getContext()).inflate(R.layout.com_facebook_tooltip_bubble, this);
        }

        public final void a() {
            this.a.setVisibility(0);
            this.b.setVisibility(4);
        }

        public final void b() {
            this.a.setVisibility(4);
            this.b.setVisibility(0);
        }
    }

    public ToolTipPopup(String str, View view) {
        this.f = str;
        this.a = new WeakReference<>(view);
        this.g = view.getContext();
    }

    private void c() {
        PopupWindow popupWindow = this.c;
        if (popupWindow != null && popupWindow.isShowing()) {
            if (this.c.isAboveAnchor()) {
                this.b.b();
                return;
            }
            this.b.a();
        }
    }

    private void d() {
        e();
        if (this.a.get() != null) {
            ((View) this.a.get()).getViewTreeObserver().addOnScrollChangedListener(this.h);
        }
    }

    private void e() {
        if (this.a.get() != null) {
            ((View) this.a.get()).getViewTreeObserver().removeOnScrollChangedListener(this.h);
        }
    }

    public final void a() {
        if (this.a.get() != null) {
            this.b = new a(this.g);
            ((TextView) this.b.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body)).setText(this.f);
            if (this.d == Style.BLUE) {
                this.b.c.setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                this.b.b.setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                this.b.a.setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                this.b.d.setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
            } else {
                this.b.c.setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                this.b.b.setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                this.b.a.setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                this.b.d.setImageResource(R.drawable.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.g).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            d();
            this.b.measure(MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            a aVar = this.b;
            this.c = new PopupWindow(aVar, aVar.getMeasuredWidth(), this.b.getMeasuredHeight());
            this.c.showAsDropDown((View) this.a.get());
            c();
            if (this.e > 0) {
                this.b.postDelayed(new Runnable() {
                    public final void run() {
                        ToolTipPopup.this.b();
                    }
                }, this.e);
            }
            this.c.setTouchable(true);
            this.b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ToolTipPopup.this.b();
                }
            });
        }
    }

    public final void b() {
        e();
        PopupWindow popupWindow = this.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
