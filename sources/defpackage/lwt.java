package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: lwt reason: default package */
public final class lwt implements gwi<View> {
    private final ujc a;
    private final Picasso b;

    public lwt(ujc ujc, Picasso picasso) {
        this.a = ujc;
        this.b = picasso;
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        fqv.b();
        fsc b2 = fsk.b(viewGroup.getContext(), viewGroup, false);
        ImageButton a2 = jyz.a(viewGroup.getContext());
        Context context = viewGroup.getContext();
        a2.setImageDrawable(jyz.b(context, SpotifyIconV2.PLUS_ALT, fr.b(context, (int) R.color.white)));
        b2.a(a2);
        return b2.getView();
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        gwj.a(gwm, view, hcm);
        fsc fsc = (fsc) fqv.a(view, fsc.class);
        hco text = hcm.text();
        fsc.a(text.title());
        fsc.b(text.subtitle());
        fsc.c(gzg.a(hcm));
        jzb.a(fsc.d().getContext(), fsc.d(), lpa.b(hcm));
        hcp main = hcm.images().main();
        Uri uri = null;
        String uri2 = main != null ? main.uri() : null;
        hdl.a(gwm.c).a("imageClick").a(hcm).a(fsc.c()).a();
        hdl.a(gwm.c).a("click").a(hcm).a(fsc.getView()).a();
        hdl.a(gwm.c).a("rightAccessoryClick").a(hcm).a(fsc.a()).a();
        String str = "";
        String str2 = (String) jvi.a(six.e(hcm), str);
        String str3 = (String) jvi.a(((hcm) fbp.a(hcm)).metadata().string("preview_key"), str);
        Picasso picasso = this.b;
        if (uri2 != null) {
            uri = !TextUtils.isEmpty(uri2) ? Uri.parse(uri2) : Uri.EMPTY;
        }
        picasso.a(uri).a((int) R.drawable.cat_placeholder_track).a((wgx) ujd.a(fsc.c(), this.a, str2, str3));
    }
}
