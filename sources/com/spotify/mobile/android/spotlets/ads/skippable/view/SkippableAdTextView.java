package com.spotify.mobile.android.spotlets.ads.skippable.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public class SkippableAdTextView extends AppCompatTextView implements OnClickListener, ihq {
    private int a;
    private a b;

    public SkippableAdTextView(Context context) {
        super(context);
        a(context, null, 16842884);
    }

    public SkippableAdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 16842884);
    }

    public SkippableAdTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Typeface a2 = vfn.a(context, attributeSet, i);
        if (a2 != null) {
            setTypeface(a2);
        }
        this.a = getResources().getInteger(17694721);
    }

    public final void a(long j) {
        SpannableString spannableString = new SpannableString(getContext().getString(R.string.skippable_ad_delayed_cta, new Object[]{Long.valueOf(j)}));
        vgl.a(getContext(), this, 2132017668);
        spannableString.setSpan(new ForegroundColorSpan(fr.c(getContext(), R.color.white_40)), 0, spannableString.length() - 1, 17);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), 2132017669), spannableString.length() - 1, spannableString.length(), 17);
        spannableString.setSpan(new StyleSpan(1), spannableString.length() - 1, spannableString.length(), 17);
        setAlpha(1.0f);
        setId(R.id.skippable_ad_delayed_cta);
        setText(spannableString);
        setVisibility(0);
    }

    public final void a(a aVar) {
        this.b = aVar;
        setOnClickListener(this);
    }

    public final void c() {
        setId(R.id.skippable_ad_non_delayed_cta);
        setText(getContext().getString(R.string.skippable_ad_non_delayed_cta));
        setVisibility(8);
        vgl.a(getContext(), this, 2132017669);
    }

    public final void d() {
        animate().alpha(0.0f).setDuration((long) this.a).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                SkippableAdTextView.this.setVisibility(8);
            }
        });
    }

    public final void e() {
        setClickable(false);
    }

    public final void f() {
        setClickable(true);
    }

    public void onClick(View view) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
