package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.music.R;

/* renamed from: uzw reason: default package */
public final class uzw {
    public static void a(Snackbar snackbar) {
        View b = snackbar.b();
        Context context = snackbar.b;
        b.setBackgroundResource(R.drawable.bg_floating_snackbar_view);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.snackbar_floating_margin_start_end);
        ((MarginLayoutParams) b.getLayoutParams()).setMargins(dimensionPixelSize, 0, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.snackbar_floating_margin_bottom));
        TextView textView = (TextView) b.findViewById(R.id.snackbar_text);
        if (textView != null) {
            vgl.a(context, textView, 2132017677);
            textView.setTextColor(fr.c(context, R.color.black));
        }
        TextView textView2 = (TextView) b.findViewById(R.id.snackbar_action);
        if (textView2 != null) {
            vgl.a(context, textView2, 2132017681);
            textView2.setBackground(null);
            vfz.c(textView2).a();
        }
        snackbar.a(fr.b(b.getContext(), (int) R.color.cat_accessory_green));
    }

    @Deprecated
    public static void a(Snackbar snackbar, uzy uzy) {
        View b = snackbar.b();
        Context context = snackbar.b;
        b.setBackgroundColor(fr.c(context, uzy.d()));
        TextView textView = (TextView) b.findViewById(R.id.snackbar_text);
        if (textView != null) {
            vgl.a(context, textView, 2132017677);
            textView.setTextColor(fr.c(context, uzy.c()));
        }
        TextView textView2 = (TextView) b.findViewById(R.id.snackbar_action);
        if (textView2 != null) {
            vgl.a(context, textView2, 2132017681);
            textView2.setBackground(null);
            vfz.c(textView2).a();
        }
        snackbar.a(fr.b(b.getContext(), (int) R.color.cat_accessory_green));
    }
}
