package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: unv reason: default package */
public final class unv implements gtw {
    public int a;

    /* renamed from: unv$a */
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

    public final u a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.social_listening_header_devices, viewGroup, false));
    }

    public final void a(u uVar, int i) {
    }

    public final int b() {
        return 1 == this.a ? 1 : 0;
    }

    public final int[] c() {
        return new int[]{11};
    }
}
