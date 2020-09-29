package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;

/* renamed from: phg reason: default package */
public final class phg extends h {
    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        super.a(rect, view, recyclerView, sVar);
        if (RecyclerView.e(view) == ((uwh) fay.a((uwh) recyclerView.c())).g(101)) {
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.padding_section_value);
        }
    }
}
