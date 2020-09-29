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

/* renamed from: qbl reason: default package */
public final class qbl extends a<fra<frh>> {
    final Activity a;
    public String d;
    public boolean e;
    final uqm f = uqo.aI;
    final sso g;
    final fqn h;
    final szp i;
    final jvf j;
    final ToastieManager k;
    private List<RadioStationModel> l = new ArrayList();
    private final Picasso m;
    private final boolean n;
    private final int o;
    private final jor<RadioStationModel> p = new jor<RadioStationModel>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            RadioStationModel radioStationModel = (RadioStationModel) obj;
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            qcl qcl = new qcl(qbl.this.a, qbl.this.f, qbl.this.g, contextMenuViewModel, qbl.this.i, qbl.this.j, qbl.this.k);
            qcl.a(radioStationModel.title, qbl.this.h, radioStationModel.seeds[0]);
            qcl.a(radioStationModel.uri);
            contextMenuViewModel.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY);
            contextMenuViewModel.c.a = radioStationModel.title;
            contextMenuViewModel.c.b = radioStationModel.subtitle;
            return jpe.a(contextMenuViewModel);
        }
    };
    private final OnClickListener q = new OnClickListener() {
        public final void onClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            qbl.this.i.a(szk.a(radioStationModel.uri).b(radioStationModel.title).a());
        }
    };
    private final OnLongClickListener r = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            qbl.this.a(view);
            return true;
        }
    };

    public qbl(kf kfVar, sso sso, boolean z, fqn fqn, szp szp, jvf jvf, ToastieManager toastieManager, Picasso picasso) {
        this.a = kfVar;
        this.g = sso;
        this.n = z;
        this.o = vfj.b(100.0f, kfVar.getResources());
        this.h = fqn;
        this.i = szp;
        this.j = jvf;
        this.k = toastieManager;
        this.m = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        frh c = fqv.a().c(this.a, viewGroup);
        c.getView().setOnClickListener(this.q);
        c.a(TextLayout.DOUBLE_LINE_TITLE);
        return fra.a(c);
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        jok.a(this.a, this.p, (RadioStationModel) view.getTag(), this.g);
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        frh frh = (frh) ((fra) uVar).a;
        RadioStationModel radioStationModel = (RadioStationModel) this.l.get(i2);
        boolean z = false;
        boolean isMyContext = fbo.a(this.d) ? false : radioStationModel.isMyContext(this.d);
        if (isMyContext || !this.n) {
            frh.getView().setOnLongClickListener(null);
        } else {
            frh.getView().setOnLongClickListener(this.r);
        }
        frh.getView().setTag(radioStationModel);
        frh.a((CharSequence) fbl.a(10).a().a(radioStationModel.title, radioStationModel.subtitle, new Object[0]));
        jva a2 = jva.a(radioStationModel.seeds[0]);
        frh.b(ute.a((Context) this.a, a2));
        frh.a(isMyContext && this.e);
        ImageView a3 = frh.a();
        if (a2.b == LinkType.ARTIST) {
            z = true;
        }
        wgr b = this.m.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a((int) R.drawable.cat_placeholder_radio).a(Config.ARGB_8888).a((wgz) new frq((Context) this.a, z)).b((int) R.drawable.cat_placeholder_radio);
        int i3 = this.o;
        b.b(i3, i3).f().e().a(a3);
    }

    public final void a(List<RadioStationModel> list) {
        this.l.clear();
        if (list != null) {
            this.l.addAll(list);
        }
        e();
    }

    public final int b() {
        return this.l.size();
    }
}
