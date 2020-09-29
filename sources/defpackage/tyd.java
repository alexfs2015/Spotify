package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tyd reason: default package */
public final class tyd implements ugp {

    /* renamed from: tyd$a */
    public static class a extends ugt {
        public OnClickListener a;
    }

    /* renamed from: tyd$b */
    public static class b extends defpackage.ugp.a {
        final Button a;

        public b(View view) {
            super(view);
            this.a = (Button) view.findViewById(R.id.button);
        }
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.filter_show_all, viewGroup, false));
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
        ((b) uVar).a.setOnClickListener(((a) ugt).a);
    }
}
