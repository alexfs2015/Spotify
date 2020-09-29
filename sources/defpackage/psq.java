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

/* renamed from: psq reason: default package */
public final class psq extends a<fqg<fqz>> implements gjk {
    final Context a;
    final spi d;
    public List<RadioStationModel> e = Collections.emptyList();
    final jmf<RadioStationModel> f;
    private final Picasso g;
    private final Drawable h;
    private final int i;
    private String j = "";
    private final OnClickListener k = new OnClickListener() {
        public final void onClick(View view) {
            RadioStationModel a2 = psq.a(view);
            psq.this.d.a(spd.a(a2.resolvedStationURI()).b(a2.title == null ? "" : a2.title).a());
        }
    };
    private final OnLongClickListener l = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            RadioStationModel a2 = psq.a(view);
            jly.a(psq.this.a, psq.this.f, a2, sih.a(a2.uri));
            return true;
        }
    };

    public final int a(int i2) {
        return 1;
    }

    public final String c(int i2) {
        return "station";
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        fri fri = (fri) ((fqg) uVar).a;
        RadioStationModel radioStationModel = (RadioStationModel) this.e.get(i2);
        jst a2 = jst.a(uhq.e(radioStationModel.uri));
        boolean z = a2.b == LinkType.ARTIST;
        ImageView c = fri.c();
        vsl b = this.g.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a((Object) radioStationModel).a(Config.ARGB_4444).a(this.h).b(this.h);
        int i3 = this.i;
        b.b(i3, i3).f().e().a((vst) new jqe(this.a, z)).a(c);
        fri.getView().setTag(radioStationModel);
        fri.a(radioStationModel.title);
        fri.b(uhq.a(this.a, a2));
        fri.d().setVisibility(0);
        fri.getView().setOnClickListener(this.k);
        fri.a(joe.a(this.a, this.f, radioStationModel, sih.a(radioStationModel.uri)));
        fri.a().setVisibility(0);
        fri.getView().setOnLongClickListener(this.l);
        if (this.j.equals(radioStationModel.uri)) {
            fri.a(true);
        } else {
            fri.a(false);
        }
    }

    public psq(Context context, List<RadioStationModel> list, jmf<RadioStationModel> jmf, spi spi, Picasso picasso) {
        this.a = context;
        this.h = fzg.a(this.a, SpotifyIcon.RADIO_16);
        this.i = uts.b(54.0f, context.getResources());
        this.f = (jmf) fay.a(jmf);
        this.d = spi;
        this.g = (Picasso) fay.a(picasso);
    }

    public final void a(String str) {
        String c = uhq.c(str);
        if (c != null && !c.equals(this.j)) {
            String str2 = this.j;
            this.j = c;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (str2.equals(((RadioStationModel) this.e.get(i2)).uri) || c.equals(((RadioStationModel) this.e.get(i2)).uri)) {
                    d_(i2 + 1);
                }
            }
        }
    }

    public final int b() {
        return this.e.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        fqb.b();
        return fqg.a(frq.b(this.a, viewGroup, false));
    }

    static /* synthetic */ RadioStationModel a(View view) {
        return (RadioStationModel) view.getTag();
    }
}
