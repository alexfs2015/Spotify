package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: txz reason: default package */
public final class txz implements ugp {

    /* renamed from: txz$a */
    public static class a extends ugt {
        public int a = -1;
        public OnClickListener b;
        public boolean c;

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: txz$b */
    public static class b extends defpackage.ugp.a {
        final TextView a;
        final Button b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.title);
            this.b = (Button) view.findViewById(R.id.button);
        }
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.podcast_adapter_delegate_filter_bar, viewGroup, false));
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
        b bVar = (b) uVar;
        a aVar = (a) ugt;
        bVar.a.setText(aVar.a);
        bVar.b.setOnClickListener(aVar.b);
        bVar.b.setEnabled(aVar.c);
    }
}
