package com.spotify.music.features.yourlibrary.container.view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class YourLibraryTabView extends FrameLayout {
    private TextView a;
    private int b;
    private int c;
    private float d;
    private ArgbEvaluator e;

    public YourLibraryTabView(Context context) {
        super(context);
    }

    public YourLibraryTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public YourLibraryTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static YourLibraryTabView a(Context context, CharSequence charSequence, ViewGroup viewGroup, boolean z) {
        YourLibraryTabView yourLibraryTabView = (YourLibraryTabView) LayoutInflater.from(context).inflate(R.layout.top_tab_view, viewGroup, false);
        yourLibraryTabView.a = (TextView) yourLibraryTabView.findViewById(R.id.top_tab_view_label);
        yourLibraryTabView.b();
        yourLibraryTabView.a(charSequence);
        return yourLibraryTabView;
    }

    private void a() {
        float f = this.d;
        if (f == 0.0f) {
            this.a.setTextColor(this.b);
        } else if (f == 1.0f) {
            this.a.setTextColor(this.c);
        } else {
            this.a.setTextColor(b(f));
        }
    }

    private void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    private int b(float f) {
        return ((Integer) this.e.evaluate(f, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue();
    }

    public static YourLibraryTabView b(Context context, CharSequence charSequence, ViewGroup viewGroup, boolean z) {
        YourLibraryTabView yourLibraryTabView = (YourLibraryTabView) LayoutInflater.from(context).inflate(R.layout.bottom_tab_view, viewGroup, false);
        yourLibraryTabView.a = (TextView) yourLibraryTabView.findViewById(R.id.bottom_tab_view_label);
        yourLibraryTabView.b();
        yourLibraryTabView.a(charSequence);
        return yourLibraryTabView;
    }

    private void b() {
        this.b = getResources().getColor(R.color.tab_text_inactive_color);
        this.c = getResources().getColor(R.color.tab_text_highlight_color);
        this.e = new ArgbEvaluator();
    }

    public final void a(float f) {
        this.d = f;
        a();
    }
}
