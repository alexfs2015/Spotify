package defpackage;

import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/* renamed from: lpx reason: default package */
public final class lpx {

    /* renamed from: lpx$a */
    public interface a extends fsa {
    }

    public static void a(TextView textView) {
        LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 8388611;
        textView.setLayoutParams(layoutParams);
    }
}
