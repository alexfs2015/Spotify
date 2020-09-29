package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: uba reason: default package */
public final class uba implements gru {
    public int a;

    /* renamed from: uba$a */
    public static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public final int a() {
        return 11;
    }

    public final long a(int i) {
        return 0;
    }

    public final void a(u uVar, int i) {
    }

    public final int[] c() {
        return new int[]{11};
    }

    public final u a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.social_listening_header_devices, viewGroup, false));
    }

    public final int b() {
        return 1 == this.a ? 1 : 0;
    }
}
