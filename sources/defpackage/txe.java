package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: txe reason: default package */
public final class txe implements ugp {

    /* renamed from: txe$a */
    public static class a extends ugt {
        public int a;
    }

    /* renamed from: txe$b */
    public static class b extends defpackage.ugp.a {
        private final TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.text);
        }
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.podcast_adapter_delegate_simple_text, viewGroup, false));
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
        ((b) uVar).a.setText(((a) ugt).a);
    }
}
