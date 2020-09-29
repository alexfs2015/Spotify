package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ppd reason: default package */
public final class ppd extends defpackage.rnw.a<a> {

    /* renamed from: ppd$a */
    static class a extends defpackage.gwi.c.a<TextView> {
        protected a(TextView textView) {
            super(textView);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            if (hcm.text().title() == null) {
                ((TextView) this.a).setText("");
                return;
            }
            ((TextView) this.a).setMovementMethod(LinkMovementMethod.getInstance());
            Spannable spannable = (Spannable) jug.a(hcm.text().title());
            juh.a(spannable, null);
            ((TextView) this.a).setText(spannable);
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_legal_text;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_legal_link, viewGroup, false));
    }
}
