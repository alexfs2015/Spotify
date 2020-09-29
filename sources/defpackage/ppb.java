package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ppb reason: default package */
public final class ppb extends defpackage.rnw.a<a> {

    /* renamed from: ppb$a */
    static class a extends defpackage.gwi.c.a<TextView> {
        protected a(TextView textView) {
            super(textView);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            ((TextView) this.a).setText(hcm.text().description());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_description;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_description, viewGroup, false));
    }
}
