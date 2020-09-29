package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jbh reason: default package */
public final class jbh extends androidx.recyclerview.widget.RecyclerView.a<b> {
    final List<jbn> a;
    final a d;
    private final Context e;
    private final LayoutInflater f;

    /* renamed from: jbh$a */
    interface a {
        void onClick(jbn jbn);
    }

    /* renamed from: jbh$b */
    class b extends u implements OnClickListener {
        TextView a;

        b(View view) {
            super(view);
            this.a = (TextView) view;
            view.setOnClickListener(this);
        }

        public final void onClick(View view) {
            jbh.this.d.onClick((jbn) jbh.this.a.get(e()));
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((b) uVar).a.setText(this.e.getString(((jbn) this.a.get(i)).b()));
    }

    public jbh(Context context, a aVar, List<jbn> list) {
        this.d = aVar;
        this.e = context;
        this.a = list;
        this.f = LayoutInflater.from(context);
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new b(this.f.inflate(R.layout.share_api_destionation_item, viewGroup, false));
    }
}
