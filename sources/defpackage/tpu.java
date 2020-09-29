package defpackage;

import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tpu reason: default package */
public final class tpu extends u {
    final TextView a;
    final TextView b;
    final TextView c;
    final View d;
    final View e;

    tpu(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.label_unselected);
        this.b = (TextView) view.findViewById(R.id.label_selected_title);
        this.c = (TextView) view.findViewById(R.id.label_selected_subtitle);
        this.e = view.findViewById(R.id.label_selected_icon);
        this.d = view.findViewById(R.id.label_selected_container);
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (z) {
            this.b.setTextColor(this.o.getContext().getResources().getColor(R.color.green_light));
            this.c.setTextColor(this.o.getContext().getResources().getColor(R.color.white));
            if (this.e.getBackground() != null) {
                this.e.getBackground().setColorFilter(this.o.getContext().getResources().getColor(R.color.white), Mode.SRC_ATOP);
            }
        } else {
            this.b.setTextColor(this.o.getContext().getResources().getColor(R.color.white));
            this.c.setTextColor(this.o.getContext().getResources().getColor(R.color.white_70));
            if (this.e.getBackground() != null) {
                this.e.getBackground().setColorFilter(this.o.getContext().getResources().getColor(R.color.white_70), Mode.SRC_ATOP);
            }
        }
    }
}
