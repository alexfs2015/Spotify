package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatTextView;

public class ExpandableEllipsizeTextView extends AppCompatTextView {
    /* access modifiers changed from: 0000 */
    public boolean a;
    private CharSequence b;

    public ExpandableEllipsizeTextView(Context context) {
        this(context, null);
    }

    public ExpandableEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "";
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ExpandableEllipsizeTextView expandableEllipsizeTextView = ExpandableEllipsizeTextView.this;
                expandableEllipsizeTextView.a = !expandableEllipsizeTextView.a;
                ExpandableEllipsizeTextView.this.c();
            }
        });
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        this.b = charSequence;
        c();
    }

    /* access modifiers changed from: private */
    public void c() {
        CharSequence charSequence = this.b;
        if (!this.a && !TextUtils.isEmpty(charSequence) && this.b.length() > 256) {
            charSequence = new SpannableStringBuilder(this.b, 0, 257).append("...");
        }
        super.setText(charSequence, BufferType.SPANNABLE);
    }
}
