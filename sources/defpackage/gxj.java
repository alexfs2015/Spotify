package defpackage;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gxj reason: default package */
public final class gxj extends gwh {

    /* renamed from: gxj$a */
    public static class a extends defpackage.gwh.a {
        protected a(ViewGroup viewGroup, gum gum) {
            super(viewGroup, gum);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            int i;
            String string = gzt.custom().string("backgroundColor");
            Assertion.a(!fax.a(string), "background color missing ");
            super.a(gzt, gum, bVar);
            try {
                i = Color.parseColor(string);
            } catch (IllegalArgumentException unused) {
                i = 0;
            }
            ip.a(this.a, uvp.a(((RecyclerView) this.a).getContext(), i));
        }
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(viewGroup, gum);
    }
}
