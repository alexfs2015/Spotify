package defpackage;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ntq reason: default package */
public final class ntq extends a<ntn> implements gkw {
    List<nst> a = Lists.a();
    Map<String, HomeMixUser> d = new HashMap(10);
    private final nto e;

    public ntq(nto nto) {
        this.e = nto;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new ntn((Picasso) nto.a(this.e.a.get(), 1), (ViewGroup) nto.a(viewGroup, 2));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        int i2;
        ntn ntn = (ntn) uVar;
        nst nst = (nst) this.a.get(i);
        try {
            i2 = Color.parseColor(nst.b());
        } catch (IllegalArgumentException unused) {
            i2 = Color.parseColor("lightgray");
        }
        Map<String, HomeMixUser> map = this.d;
        fbp.a(map);
        ArrayList arrayList = new ArrayList();
        for (nsr a2 : nst.e()) {
            HomeMixUser homeMixUser = (HomeMixUser) map.get(a2.a());
            if (homeMixUser != null) {
                arrayList.add(homeMixUser.getFace());
            }
        }
        ntn.a(i2, nst, arrayList);
    }

    public final int b() {
        return this.a.size();
    }
}
