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

public class RefreshRow extends FrameLayout {
    public static final int a = RefreshRow.class.hashCode();
    public mjz b;
    private LinearLayout c;
    private TextView d;

    public static RefreshRow a(Context context, ViewGroup viewGroup) {
        RefreshRow refreshRow = (RefreshRow) LayoutInflater.from(context).inflate(R.layout.refresh_layout, null, false);
        ip.a((View) refreshRow, (Drawable) null);
        return refreshRow;
    }

    public RefreshRow(Context context) {
        super(context);
    }

    public RefreshRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(R.id.button_refresh_layout);
        this.d = (TextView) this.c.findViewById(R.id.title);
        this.c.setVisibility(0);
        ImageButton b2 = jwz.b(getContext(), SpotifyIconV2.OFFLINE_SYNC);
        this.c.addView(b2, new LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.refresh_row_button_height)));
        b2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                RefreshRow.this.a(view);
            }
        });
        uuu.a(getContext(), this.d, 2132017666);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        mjz mjz = this.b;
        if (mjz != null) {
            mjz.e();
        }
    }
}
