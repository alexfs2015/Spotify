package defpackage;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: mih reason: default package */
public final class mih extends m {
    private final fse a;
    private final LinearLayoutManager b;
    private View c;
    private u d;
    private final int e;

    public mih(int i, fse fse, LinearLayoutManager linearLayoutManager) {
        this.a = fse;
        this.e = i;
        this.b = linearLayoutManager;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        super.a(recyclerView, i, i2);
        boolean z = false;
        this.d = recyclerView.g(0);
        int j = this.b.j();
        float f = 1.0f;
        if (this.d instanceof a) {
            if (j == 0) {
                if (this.c == null) {
                    this.c = this.d.o.findViewById(R.id.devices_list_header_description);
                }
                this.c = this.c;
                float bottom = (float) (this.d.o.getBottom() - this.e);
                if (((float) Math.abs(this.d.o.getTop())) >= (((float) this.d.o.getMeasuredHeight()) - ((((float) this.c.getHeight()) + ((float) ((MarginLayoutParams) this.c.getLayoutParams()).bottomMargin)) + ((float) ((MarginLayoutParams) this.c.getLayoutParams()).topMargin))) - ((float) this.e)) {
                    if (bottom > 0.0f) {
                        z = true;
                    }
                    if (z) {
                        f = 1.0f - (bottom / 100.0f);
                    }
                } else {
                    f = 0.0f;
                }
            }
        }
        this.a.a(f);
    }
}
