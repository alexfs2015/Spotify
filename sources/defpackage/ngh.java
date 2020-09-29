package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: ngh reason: default package */
public final class ngh extends rfi {
    public ngh(ImpressionLogger impressionLogger, rfg rfg) {
        super(impressionLogger, rfg);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int e = RecyclerView.e(view);
        if (e >= 0) {
            Boolean bool = (Boolean) view.getTag(this.a);
            if (bool == null || bool.booleanValue() || sVar.f) {
                a(e, recyclerView.b(view));
                view.setTag(this.a, Boolean.valueOf(this.b));
            }
        }
    }
}
