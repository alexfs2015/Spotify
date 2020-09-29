package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class DialogLayout extends LinearLayout {
    public Button a;
    public Button b;
    private final Button c;
    private final Button d;
    private final Button e;
    private final Button f;
    private final LinearLayout g;
    private final TextView h;
    private final TextView i;
    private final ViewGroup j;
    private final ImageView k;
    private View l;
    private final View m;
    private CharSequence n;
    private CharSequence o;
    private OnClickListener p;
    private OnClickListener q;

    public DialogLayout(Context context) {
        this(context, false);
    }

    public DialogLayout(Context context, boolean z) {
        this(context, null, z);
    }

    public DialogLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private DialogLayout(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        uut.a(DialogLayout.class, this);
        inflate(context, z ? R.layout.paste_dialog : R.layout.paste_dialog_noscroll, this);
        this.c = (Button) findViewById(R.id.left_button);
        this.e = (Button) findViewById(R.id.single_button_positive);
        this.f = (Button) findViewById(R.id.single_button_negative);
        this.d = (Button) findViewById(R.id.right_button);
        this.g = (LinearLayout) findViewById(R.id.button_bar);
        this.h = (TextView) findViewById(R.id.title);
        this.i = (TextView) findViewById(R.id.body);
        this.j = (ViewGroup) findViewById(R.id.content);
        this.k = (ImageView) findViewById(R.id.image);
        this.m = findViewById(R.id.title_container);
    }

    private void a() {
        if (this.n == null && this.o == null) {
            this.g.setVisibility(8);
            this.b = null;
            this.a = null;
            return;
        }
        this.g.setVisibility(0);
        if (this.n == null || this.o == null) {
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            if (this.n != null) {
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                this.e.setText(this.n);
                this.e.setOnClickListener(this.p);
                this.a = this.e;
                this.b = null;
            }
            if (this.o != null) {
                this.f.setVisibility(0);
                this.e.setVisibility(8);
                this.f.setText(this.o);
                this.f.setOnClickListener(this.q);
                this.b = this.f;
                this.a = null;
            }
            return;
        }
        this.d.setVisibility(0);
        this.c.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.c.setText(this.o);
        this.c.setOnClickListener(this.q);
        this.d.setText(this.n);
        this.d.setOnClickListener(this.p);
        this.a = this.d;
        this.b = this.c;
    }

    public final void a(CharSequence charSequence, OnClickListener onClickListener) {
        this.n = charSequence;
        this.p = onClickListener;
        a();
    }

    public final void a(int i2, OnClickListener onClickListener) {
        a(getResources().getText(i2), onClickListener);
    }

    public final void b(CharSequence charSequence, OnClickListener onClickListener) {
        this.o = charSequence;
        this.q = onClickListener;
        a();
    }

    public final void b(int i2, OnClickListener onClickListener) {
        b(getResources().getText(i2), onClickListener);
    }

    public final void a(CharSequence charSequence) {
        this.h.setText(charSequence);
        this.m.setVisibility(0);
    }

    public final void a(int i2) {
        a(getResources().getText(i2));
    }

    public final void b(CharSequence charSequence) {
        this.i.setText(charSequence);
        this.i.setVisibility(0);
    }

    public final void b(int i2) {
        b(getResources().getText(i2));
    }

    public final void a(View view) {
        View view2 = this.l;
        if (view2 != null) {
            this.j.removeView(view2);
        }
        if (view == null) {
            this.j.setVisibility(8);
            return;
        }
        this.l = view;
        this.j.addView(view, -1, -2);
        this.j.setVisibility(0);
    }
}
