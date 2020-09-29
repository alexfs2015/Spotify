package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tlm reason: default package */
public final class tlm implements tum {

    /* renamed from: tlm$a */
    public static class a extends tuq {
        public int a = -1;
        public OnClickListener b;
        public boolean c;

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: tlm$b */
    public static class b extends defpackage.tum.a {
        final TextView a;
        final Button b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.title);
            this.b = (Button) view.findViewById(R.id.button);
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.podcast_adapter_delegate_filter_bar, viewGroup, false));
    }

    public final void a(tuq tuq, u uVar) {
        b bVar = (b) uVar;
        a aVar = (a) tuq;
        bVar.a.setText(aVar.a);
        bVar.b.setOnClickListener(aVar.b);
        bVar.b.setEnabled(aVar.c);
    }
}
