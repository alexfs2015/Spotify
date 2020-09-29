package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pot reason: default package */
public final class pot extends defpackage.rnw.a<a> {

    /* renamed from: pot$a */
    static class a extends defpackage.gwi.c.a<TextView> {
        public a(TextView textView) {
            super(textView);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            ((TextView) this.a).setText(hcm.text().title());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_header;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_page_header, viewGroup, false));
    }
}
