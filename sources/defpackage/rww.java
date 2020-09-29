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

/* renamed from: rww reason: default package */
public final class rww implements gui<View> {
    private final HubsGlueImageDelegate a;
    private final Context b;

    public rww(HubsGlueImageDelegate hubsGlueImageDelegate, Context context) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
        this.b = (Context) fay.a(context);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        Context context = this.b;
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_charts_row_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.holder);
        TextView textView = (TextView) inflate.findViewById(16908296);
        fqb.b();
        fri b2 = frq.b(context, viewGroup, false);
        linearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        rwy rwy = new rwy(inflate, b2, textView);
        fqf.a(rwy);
        return rwy.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        int i;
        rwv rwv = (rwv) fay.a(fqb.a(view, rwv.class));
        uui.b(view).b(rwv.c()).a(rwv.b(), rwv.d(), rwv.e()).a();
        guj.a(gum, view, gzt);
        String title = gzt.text().title();
        String str = "";
        if (TextUtils.isEmpty(title)) {
            title = str;
        }
        rwv.a(title);
        String subtitle = gzt.text().subtitle();
        if (TextUtils.isEmpty(subtitle)) {
            subtitle = str;
        }
        rwv.b(subtitle);
        Integer intValue = gzt.custom().intValue("rowIndex");
        if (intValue != null) {
            i = intValue.intValue();
        } else {
            i = -1;
        }
        if (i != -1) {
            rwv.a(i);
        } else {
            rwv.f();
        }
        ImageView c = rwv.c();
        gzw main = gzt.images().main();
        if (main != null) {
            this.a.a(c, main, HubsGlueImageConfig.THUMBNAIL);
            return;
        }
        this.a.a(c);
        c.setImageDrawable(null);
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
    }
}
