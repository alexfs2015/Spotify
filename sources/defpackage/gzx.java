package defpackage;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gzx reason: default package */
public final class gzx extends gyi {

    /* renamed from: gzx$a */
    public static class a extends defpackage.gyi.a {
        protected a(ViewGroup viewGroup, gwm gwm) {
            super(viewGroup, gwm);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            int i;
            String string = hcm.custom().string("backgroundColor");
            Assertion.a(!fbo.a(string), "background color missing ");
            super.a(hcm, gwm, bVar);
            try {
                i = Color.parseColor(string);
            } catch (IllegalArgumentException unused) {
                i = 0;
            }
            ip.a(this.a, vhg.a(((RecyclerView) this.a).getContext(), i));
        }
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(viewGroup, gwm);
    }
}
