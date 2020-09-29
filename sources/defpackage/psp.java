package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.glue.components.card.Card.TextLayout;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.toastie.ToastieManager;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: psp reason: default package */
public final class psp extends a<fqg<fqn>> {
    final Activity a;
    public String d;
    public boolean e;
    final udr f = udt.aI;
    final sih g;
    final fpt h;
    final spi i;
    final jsz j;
    final ToastieManager k;
    private List<RadioStationModel> l = new ArrayList();
    private final Picasso m;
    private final boolean n;
    private final int o;
    private final jmf<RadioStationModel> p = new jmf<RadioStationModel>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            RadioStationModel radioStationModel = (RadioStationModel) obj;
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ptp ptp = new ptp(psp.this.a, psp.this.f, psp.this.g, contextMenuViewModel, psp.this.i, psp.this.j, psp.this.k);
            ptp.a(radioStationModel.title, psp.this.h, radioStationModel.seeds[0]);
            ptp.a(radioStationModel.uri);
            contextMenuViewModel.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY);
            contextMenuViewModel.c.a = radioStationModel.title;
            contextMenuViewModel.c.b = radioStationModel.subtitle;
            return jms.a(contextMenuViewModel);
        }
    };
    private final OnClickListener q = new OnClickListener() {
        public final void onClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            psp.this.i.a(spd.a(radioStationModel.uri).b(radioStationModel.title).a());
        }
    };
    private final OnLongClickListener r = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            psp.this.a(view);
            return true;
        }
    };

    public final /* synthetic */ void a(u uVar, int i2) {
        boolean z;
        fqn fqn = (fqn) ((fqg) uVar).a;
        RadioStationModel radioStationModel = (RadioStationModel) this.l.get(i2);
        boolean z2 = false;
        if (fax.a(this.d)) {
            z = false;
        } else {
            z = radioStationModel.isMyContext(this.d);
        }
        if (z || !this.n) {
            fqn.getView().setOnLongClickListener(null);
        } else {
            fqn.getView().setOnLongClickListener(this.r);
        }
        fqn.getView().setTag(radioStationModel);
        fqn.a((CharSequence) fau.a(10).a().a(radioStationModel.title, radioStationModel.subtitle, new Object[0]));
        jst a2 = jst.a(radioStationModel.seeds[0]);
        fqn.b(uhq.a((Context) this.a, a2));
        fqn.a(z && this.e);
        ImageView a3 = fqn.a();
        if (a2.b == LinkType.ARTIST) {
            z2 = true;
        }
        vsl b = this.m.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a((int) R.drawable.cat_placeholder_radio).a(Config.ARGB_8888).a((vst) new fqw((Context) this.a, z2)).b((int) R.drawable.cat_placeholder_radio);
        int i3 = this.o;
        b.b(i3, i3).f().e().a(a3);
    }

    public psp(ka kaVar, sih sih, boolean z, fpt fpt, spi spi, jsz jsz, ToastieManager toastieManager, Picasso picasso) {
        this.a = kaVar;
        this.g = sih;
        this.n = z;
        this.o = uts.b(100.0f, kaVar.getResources());
        this.h = fpt;
        this.i = spi;
        this.j = jsz;
        this.k = toastieManager;
        this.m = picasso;
    }

    public final int b() {
        return this.l.size();
    }

    public final void a(List<RadioStationModel> list) {
        this.l.clear();
        if (list != null) {
            this.l.addAll(list);
        }
        e();
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        jly.a(this.a, this.p, (RadioStationModel) view.getTag(), this.g);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        fqn c = fqb.a().c(this.a, viewGroup);
        c.getView().setOnClickListener(this.q);
        c.a(TextLayout.DOUBLE_LINE_TITLE);
        return fqg.a(c);
    }
}
