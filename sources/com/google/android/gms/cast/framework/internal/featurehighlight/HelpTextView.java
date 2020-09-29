package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class HelpTextView extends LinearLayout {
    private TextView zzla;
    private TextView zzlb;

    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View asView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.zzla = (TextView) eij.a((TextView) findViewById(R.id.cast_featurehighlight_help_text_header_view));
        this.zzlb = (TextView) eij.a((TextView) findViewById(R.id.cast_featurehighlight_help_text_body_view));
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zzla, charSequence);
        zza(this.zzlb, charSequence2);
    }

    private static void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
