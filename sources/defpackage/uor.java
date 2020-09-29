package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.music.R;

/* renamed from: uor reason: default package */
public final class uor {
    public static void a(Snackbar snackbar, uos uos) {
        View b = snackbar.b();
        Context context = snackbar.b;
        b.setBackgroundColor(fr.c(context, uos.d()));
        TextView textView = (TextView) b.findViewById(R.id.snackbar_text);
        if (textView != null) {
            uuu.a(context, textView, 2132017674);
            textView.setTextColor(fr.c(context, uos.c()));
        }
        TextView textView2 = (TextView) b.findViewById(R.id.snackbar_action);
        if (textView2 != null) {
            uuu.a(context, textView2, 2132017678);
            textView2.setBackground(null);
            uui.c(textView2).a();
        }
        snackbar.a(fr.b(b.getContext(), (int) R.color.cat_accessory_green));
    }
}
