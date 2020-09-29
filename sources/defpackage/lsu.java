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

/* renamed from: lsu reason: default package */
public final class lsu implements gui<View> {
    private final twz a;
    private final Picasso b;

    public lsu(twz twz, Picasso picasso) {
        this.a = twz;
        this.b = picasso;
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        fqb.b();
        fri b2 = frq.b(viewGroup.getContext(), viewGroup, false);
        ImageButton a2 = jwz.a(viewGroup.getContext());
        Context context = viewGroup.getContext();
        a2.setImageDrawable(jwz.b(context, SpotifyIconV2.PLUS_ALT, fr.b(context, (int) R.color.white)));
        b2.a(a2);
        return b2.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        String str;
        guj.a(gum, view, gzt);
        fri fri = (fri) fqb.a(view, fri.class);
        gzv text = gzt.text();
        fri.a(text.title());
        fri.b(text.subtitle());
        fri.c(gww.a(gzt));
        jxb.a(fri.d().getContext(), fri.d(), lla.b(gzt));
        gzw main = gzt.images().main();
        Uri uri = null;
        if (main != null) {
            str = main.uri();
        } else {
            str = null;
        }
        has.a(gum.c).a("imageClick").a(gzt).a(fri.c()).a();
        has.a(gum.c).a("click").a(gzt).a(fri.getView()).a();
        has.a(gum.c).a("rightAccessoryClick").a(gzt).a(fri.a()).a();
        String str2 = "";
        String str3 = (String) jtc.a(rzj.e(gzt), str2);
        String str4 = (String) jtc.a(((gzt) fay.a(gzt)).metadata().string("preview_key"), str2);
        Picasso picasso = this.b;
        if (str != null) {
            uri = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        }
        picasso.a(uri).a((int) R.drawable.cat_placeholder_track).a((vsr) txa.a(fri.c(), this.a, str3, str4));
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
    }
}
