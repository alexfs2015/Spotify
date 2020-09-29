package com.spotify.android.glue.gradients;

import android.content.Context;
import com.spotify.android.glue.gradients.GradientDrawable.Type;
import com.spotify.music.R;

public final class GlueGradients {

    public enum Style {
        PURPLE_LAKE(R.color.fuchsia, R.color.klein_blue),
        AQUATIC(R.color.klein_blue, R.color.powder_green);
        
        /* access modifiers changed from: private */
        public final int mEndColorRes;
        /* access modifiers changed from: private */
        public final int mStartColorRes;

        private Style(int i, int i2) {
            this.mStartColorRes = i;
            this.mEndColorRes = i2;
        }
    }

    public static GradientDrawable a(Context context, Style style, boolean z) {
        return GradientDrawable.a(Type.LINEAR, gb.b(context.getResources(), style.mStartColorRes, null), gb.b(context.getResources(), style.mEndColorRes, null));
    }
}
