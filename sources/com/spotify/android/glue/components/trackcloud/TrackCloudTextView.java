package com.spotify.android.glue.components.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.spotify.android.glue.internal.StateListAnimatorTextView;

public class TrackCloudTextView extends StateListAnimatorTextView {
    public fsk a;

    public TrackCloudTextView(Context context) {
        this(context, null);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fzv.a(this, context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        String str = this.a.f;
        int lineCount = getLineCount();
        int i5 = lineCount - 1;
        if (!TextUtils.isEmpty(str) && lineCount > 0 && getLayout().getEllipsisCount(i5) > 0) {
            SpannableString a2 = fsk.a(getContext());
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            int lineEnd = getLayout().getLineEnd(i5) - getLayout().getEllipsisCount(i5);
            int length = a2.length() + str.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
            int i6 = lineEnd - length;
            if (i6 >= 0) {
                spannableStringBuilder.delete(i6, spannableStringBuilder.length());
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.delete(this.a.a(length2), length2);
                spannableStringBuilder.append(a2);
                spannableStringBuilder.append(spannableString);
            }
            setText(spannableStringBuilder);
        }
    }
}
