package com.spotify.music.features.dailymix.itemlist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public class RefreshRowBottom extends FrameLayout {
    public static final int a = RefreshRowBottom.class.hashCode();
    public mos b;
    private LinearLayout c;
    private TextView d;

    public RefreshRowBottom(Context context) {
        super(context);
    }

    public RefreshRowBottom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static RefreshRowBottom a(Context context, ViewGroup viewGroup) {
        RefreshRowBottom refreshRowBottom = (RefreshRowBottom) LayoutInflater.from(context).inflate(R.layout.refresh_bottom_layout, null, false);
        ip.a((View) refreshRowBottom, (Drawable) null);
        return refreshRowBottom;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        mos mos = this.b;
        if (mos != null) {
            mos.e();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(R.id.button_refresh_layout);
        this.d = (TextView) this.c.findViewById(R.id.title);
        this.c.setVisibility(0);
        ImageButton b2 = jyz.b(getContext(), SpotifyIconV2.OFFLINE_SYNC);
        LayoutParams layoutParams = new LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.refresh_row_button_height));
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.refresh_row_bottom_button_margin);
        this.c.addView(b2, layoutParams);
        b2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                RefreshRowBottom.this.a(view);
            }
        });
        vgl.a(getContext(), this.d, 2132017669);
    }
}
