package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.R;

/* renamed from: sgg reason: default package */
public final class sgg implements gwi<View> {
    private final HubsGlueImageDelegate a;
    private final Context b;

    public sgg(HubsGlueImageDelegate hubsGlueImageDelegate, Context context) {
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
        this.b = (Context) fbp.a(context);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        Context context = this.b;
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_charts_row_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.holder);
        TextView textView = (TextView) inflate.findViewById(16908296);
        fqv.b();
        fsc b2 = fsk.b(context, viewGroup, false);
        linearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        sgi sgi = new sgi(inflate, b2, textView);
        fqz.a(sgi);
        return sgi.getView();
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        sgf sgf = (sgf) fbp.a(fqv.a(view, sgf.class));
        vfz.b(view).b(sgf.c()).a(sgf.b(), sgf.d(), sgf.e()).a();
        gwj.a(gwm, view, hcm);
        String title = hcm.text().title();
        String str = "";
        if (TextUtils.isEmpty(title)) {
            title = str;
        }
        sgf.a(title);
        String subtitle = hcm.text().subtitle();
        if (TextUtils.isEmpty(subtitle)) {
            subtitle = str;
        }
        sgf.b(subtitle);
        Integer intValue = hcm.custom().intValue("rowIndex");
        int intValue2 = intValue != null ? intValue.intValue() : -1;
        if (intValue2 != -1) {
            sgf.a(intValue2);
        } else {
            sgf.f();
        }
        ImageView c = sgf.c();
        hcp main = hcm.images().main();
        if (main != null) {
            this.a.a(c, main, HubsGlueImageConfig.THUMBNAIL);
            return;
        }
        this.a.a(c);
        c.setImageDrawable(null);
    }
}
