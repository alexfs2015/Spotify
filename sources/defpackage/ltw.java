package defpackage;

import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/* renamed from: ltw reason: default package */
public final class ltw {

    /* renamed from: ltw$a */
    public interface a extends fsu {
    }

    public static void a(TextView textView) {
        LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 8388611;
        textView.setLayoutParams(layoutParams);
    }
}
