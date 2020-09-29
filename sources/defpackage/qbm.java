package defpackage;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: qbm reason: default package */
public final class qbm extends a<fra<frt>> implements gkv {
    final Context a;
    final szp d;
    public List<RadioStationModel> e = Collections.emptyList();
    final jor<RadioStationModel> f;
    private final Picasso g;
    private final Drawable h;
    private final int i;
    private String j = "";
    private final OnClickListener k = new OnClickListener() {
        public final void onClick(View view) {
            RadioStationModel a2 = qbm.a(view);
            qbm.this.d.a(szk.a(a2.resolvedStationURI()).b(a2.title == null ? "" : a2.title).a());
        }
    };
    private final OnLongClickListener l = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            RadioStationModel a2 = qbm.a(view);
            jok.a(qbm.this.a, qbm.this.f, a2, sso.a(a2.uri));
            return true;
        }
    };

    public qbm(Context context, List<RadioStationModel> list, jor<RadioStationModel> jor, szp szp, Picasso picasso) {
        this.a = context;
        this.h = gaa.a(this.a, SpotifyIcon.RADIO_16);
        this.i = vfj.b(54.0f, context.getResources());
        this.f = (jor) fbp.a(jor);
        this.d = szp;
        this.g = (Picasso) fbp.a(picasso);
    }

    static /* synthetic */ RadioStationModel a(View view) {
        return (RadioStationModel) view.getTag();
    }

    public final int a(int i2) {
        return 1;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        fqv.b();
        return fra.a(fsk.b(this.a, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        fsc fsc = (fsc) ((fra) uVar).a;
        RadioStationModel radioStationModel = (RadioStationModel) this.e.get(i2);
        jva a2 = jva.a(ute.d(radioStationModel.uri));
        boolean z = a2.b == LinkType.ARTIST;
        ImageView c = fsc.c();
        wgr b = this.g.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a((Object) radioStationModel).a(Config.ARGB_4444).a(this.h).b(this.h);
        int i3 = this.i;
        b.b(i3, i3).f().e().a((wgz) new jsp(this.a, z)).a(c);
        fsc.getView().setTag(radioStationModel);
        fsc.a(radioStationModel.title);
        fsc.b(ute.a(this.a, a2));
        fsc.d().setVisibility(0);
        fsc.getView().setOnClickListener(this.k);
        fsc.a(jqq.a(this.a, this.f, radioStationModel, sso.a(radioStationModel.uri)));
        fsc.a().setVisibility(0);
        fsc.getView().setOnLongClickListener(this.l);
        if (this.j.equals(radioStationModel.uri)) {
            fsc.a(true);
        } else {
            fsc.a(false);
        }
    }

    public final void a(String str) {
        String b = ute.b(str);
        if (b != null && !b.equals(this.j)) {
            String str2 = this.j;
            this.j = b;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (str2.equals(((RadioStationModel) this.e.get(i2)).uri) || b.equals(((RadioStationModel) this.e.get(i2)).uri)) {
                    d_(i2 + 1);
                }
            }
        }
    }

    public final int b() {
        return this.e.size();
    }

    public final String c(int i2) {
        return "station";
    }
}
