package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tlq reason: default package */
public final class tlq implements tum {

    /* renamed from: tlq$a */
    public static class a extends tuq {
        public OnClickListener a;
    }

    /* renamed from: tlq$b */
    public static class b extends defpackage.tum.a {
        final Button a;

        public b(View view) {
            super(view);
            this.a = (Button) view.findViewById(R.id.button);
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.filter_show_all, viewGroup, false));
    }

    public final void a(tuq tuq, u uVar) {
        ((b) uVar).a.setOnClickListener(((a) tuq).a);
    }
}
