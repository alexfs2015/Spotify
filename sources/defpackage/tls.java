package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tls reason: default package */
public final class tls implements tum {

    /* renamed from: tls$a */
    public static class a extends tuq {
        public int a;
    }

    /* renamed from: tls$b */
    public static class b extends defpackage.tum.a {
        private final TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.text);
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.podcast_adapter_delegate_simple_text, viewGroup, false));
    }

    public final void a(tuq tuq, u uVar) {
        ((b) uVar).a.setText(((a) tuq).a);
    }
}
