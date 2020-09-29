package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: txs reason: default package */
public final class txs implements ugp {
    private final txw a;

    /* renamed from: txs$a */
    public static class a extends ugt {
        public String a;
        public String b;
    }

    /* renamed from: txs$b */
    public static class b extends defpackage.ugp.a {
        final TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.txt_description);
        }
    }

    public txs(txw txw) {
        this.a = txw;
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.podcast_adapter_delegate_show_description, viewGroup, false));
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
        a aVar = (a) ugt;
        this.a.a(((b) uVar).a);
        this.a.a(aVar.a, aVar.b);
    }
}
