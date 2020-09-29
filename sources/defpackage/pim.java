package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pim reason: default package */
public final class pim extends defpackage.reu.a<a> {

    /* renamed from: pim$a */
    static class a extends defpackage.gui.c.a<TextView> {
        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(TextView textView) {
            super(textView);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            if (gzt.text().title() == null) {
                ((TextView) this.a).setText("");
                return;
            }
            ((TextView) this.a).setMovementMethod(LinkMovementMethod.getInstance());
            Spannable spannable = (Spannable) jrw.a(gzt.text().title());
            jrx.a(spannable, null);
            ((TextView) this.a).setText(spannable);
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_legal_text;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_legal_link, viewGroup, false));
    }
}
