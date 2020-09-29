package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nre reason: default package */
public final class nre extends a<nrb> implements gkw {
    public Map<String, HomeMixUser> a = new HashMap();
    public List<nsr> d = Lists.a();
    private final nrc e;

    public nre(nrc nrc) {
        this.e = nrc;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new nrb((Picasso) nrc.a(this.e.a.get(), 1), (ViewGroup) nrc.a(viewGroup, 2));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        nrb nrb = (nrb) uVar;
        HomeMixUser homeMixUser = (HomeMixUser) this.a.get(((nsr) this.d.get(i)).a());
        if (homeMixUser != null) {
            nsr nsr = (nsr) this.d.get(i);
            fbp.a(homeMixUser);
            fbp.a(nsr);
            nrb.a.a(nrb.d, homeMixUser.getFace());
            nrb.b.setText(homeMixUser.getShortName());
            nrb.c.setText(nrb.e.getString(R.string.home_mix_affinity_type, new Object[]{nsr.b()}));
        }
    }

    public final int b() {
        return this.d.size();
    }
}
