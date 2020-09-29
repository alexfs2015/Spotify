package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: mtk reason: default package */
final class mtk extends u {
    final Drawable a;
    final ForegroundColorSpan b;

    mtk(View view) {
        fqv.b();
        super(fsk.b(view.getContext(), (ViewGroup) view, false).getView());
        Context context = view.getContext();
        this.o.setPadding(this.o.getPaddingLeft(), context.getResources().getDimensionPixelSize(R.dimen.std_16dp), this.o.getRight(), this.o.getBottom());
        ((fsc) fqz.a(this.o, fsc.class)).b().setMaxLines(2);
        this.a = gaa.g(context);
        this.b = new ForegroundColorSpan(fr.c(context, R.color.glue_row_subtitle_color));
    }
}
