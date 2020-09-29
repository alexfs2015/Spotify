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

/* renamed from: jdt reason: default package */
public final class jdt extends androidx.recyclerview.widget.RecyclerView.a<b> {
    final List<jdz> a;
    final a d;
    private final Context e;
    private final LayoutInflater f;

    /* renamed from: jdt$a */
    interface a {
        void onClick(jdz jdz);
    }

    /* renamed from: jdt$b */
    class b extends u implements OnClickListener {
        TextView a;

        b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.share_text);
            view.setOnClickListener(this);
        }

        public final void onClick(View view) {
            jdt.this.d.onClick((jdz) jdt.this.a.get(e()));
        }
    }

    public jdt(Context context, a aVar, List<jdz> list) {
        this.d = aVar;
        this.e = context;
        this.a = list;
        this.f = LayoutInflater.from(context);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new b(this.f.inflate(R.layout.share_api_destionation_item, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        b bVar = (b) uVar;
        bVar.a.setText(this.e.getString(((jdz) this.a.get(i)).b()));
        bVar.a.setCompoundDrawablesWithIntrinsicBounds(((jdz) this.a.get(i)).c(), null, null, null);
    }

    public final int b() {
        return this.a.size();
    }
}
