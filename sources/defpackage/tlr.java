package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tlr reason: default package */
public final class tlr implements tum {

    /* renamed from: tlr$a */
    public static class a extends tuq {
    }

    /* renamed from: tlr$b */
    public static class b extends defpackage.tum.a {
        public b(View view) {
            super(view);
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public final void a(tuq tuq, u uVar) {
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.footer_loading_infinite, viewGroup, false));
    }
}
