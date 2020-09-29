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

/* renamed from: nlp reason: default package */
public final class nlp extends a<nlm> implements gjl {
    Map<String, HomeMixUser> a = new HashMap();
    List<nnc> d = Lists.a();
    private final nln e;

    public final /* synthetic */ void a(u uVar, int i) {
        nlm nlm = (nlm) uVar;
        HomeMixUser homeMixUser = (HomeMixUser) this.a.get(((nnc) this.d.get(i)).a());
        if (homeMixUser != null) {
            nnc nnc = (nnc) this.d.get(i);
            fay.a(homeMixUser);
            fay.a(nnc);
            nlm.a.a(nlm.d, homeMixUser.getFace());
            nlm.b.setText(homeMixUser.getShortName());
            nlm.c.setText(nlm.e.getString(R.string.home_mix_affinity_type, new Object[]{nnc.b()}));
        }
    }

    public nlp(nln nln) {
        this.e = nln;
    }

    public final int b() {
        return this.d.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new nlm((Picasso) nln.a(this.e.a.get(), 1), (ViewGroup) nln.a(viewGroup, 2));
    }
}
