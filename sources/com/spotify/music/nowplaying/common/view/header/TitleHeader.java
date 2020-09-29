package com.spotify.music.nowplaying.common.view.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class TitleHeader extends LinearLayout implements tjx {
    private final TextView a;
    private final TextView b;
    private a c;

    public TitleHeader(Context context) {
        this(context, null);
    }

    public TitleHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.context_title_header, this);
        setOrientation(1);
        setGravity(17);
        this.a = (TextView) findViewById(R.id.context_header_title_textview);
        this.b = (TextView) findViewById(R.id.context_header_subtitle_textview);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                TitleHeader.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.c.a();
    }

    public final void a() {
        this.b.setVisibility(8);
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    public final void b(String str) {
        this.b.setVisibility(0);
        this.b.setText(str);
    }
}
