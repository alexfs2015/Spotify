package com.spotify.music.libs.connect.access.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class ConnectAccessButton extends ConstraintLayout {
    public TextView b;
    public PressableConnectCardView c;
    private ImageView d;

    public ConnectAccessButton(Context context) {
        this(context, null, 0);
    }

    public ConnectAccessButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConnectAccessButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.connect_access_button, this);
    }

    public final void a(Drawable drawable) {
        this.d.setImageDrawable(drawable);
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.equals(this.b.getText(), charSequence)) {
            this.b.setText(charSequence);
        }
    }

    public final void a(boolean z) {
        this.d.setActivated(z);
    }

    public void b() {
        this.b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.text_connect_access);
        this.d = (ImageView) findViewById(R.id.image_connect_access);
        this.c = (PressableConnectCardView) findViewById(R.id.connect_access_card_button);
        vfz.c(this.c).a();
        setVisibility(8);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
