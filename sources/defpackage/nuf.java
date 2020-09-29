package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: nuf reason: default package */
final class nuf extends androidx.recyclerview.widget.RecyclerView.a<a> {

    /* renamed from: nuf$a */
    static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public final /* bridge */ /* synthetic */ void a(u uVar, int i) {
    }

    public final int b() {
        return 1;
    }

    nuf() {
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.featuring_label, viewGroup, false));
    }
}
