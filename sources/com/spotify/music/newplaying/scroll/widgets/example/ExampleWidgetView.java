package com.spotify.music.newplaying.scroll.widgets.example;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class ExampleWidgetView extends LinearLayout implements sty, urx {
    private TextView a;
    private TextView b;
    private a c;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
    }

    public ExampleWidgetView(Context context) {
        super(context, null);
    }

    public ExampleWidgetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public ExampleWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.example_title);
        this.b = (TextView) findViewById(R.id.example_artist);
        this.b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ExampleWidgetView.this.a(view);
            }
        });
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public final void b(String str) {
        this.b.setText(str);
    }

    public final void a(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }

    public final void a(a aVar) {
        this.c = (a) fay.a(aVar);
    }
}
