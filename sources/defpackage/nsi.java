package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows;
import com.spotify.music.playlist.ui.Rows.e;
import com.spotify.music.playlist.ui.Rows.h;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: nsi reason: default package */
public final class nsi extends a<u> implements gkw {
    final ovj a;
    HomeMix d;
    List<nss> e = Collections.emptyList();
    ItemConfiguration f = ItemConfiguration.r().a();
    final HomeMixFormatListAttributesHelper g;
    private final twc<ovg> h;
    private final ovh i;
    private final nrz j;

    public nsi(ovj ovj, a<ovg> aVar, ovh ovh, nsa nsa, sso sso, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, tvw tvw, who<jor<ovg>> who) {
        this.h = aVar.a(tvw, who);
        this.i = ovh;
        this.a = ovj;
        this.g = homeMixFormatListAttributesHelper;
        nrz nrz = new nrz((Picasso) nsa.a(nsa.a.get(), 1), (HomeMixInteractionLogger) nsa.a(nsa.b.get(), 2), (fqn) nsa.a(nsa.c.get(), 3), (String) nsa.a(nsa.d.get(), 4), (who) nsa.a(who, 5), (sso) nsa.a(sso, 6));
        this.j = nrz;
        a(true);
    }

    public final u a(ViewGroup viewGroup, int i2) {
        e a2 = Rows.a(viewGroup.getContext(), viewGroup);
        a2.b().setTextSize(14.0f);
        a2.d().setTextSize(12.0f);
        return fra.a(a2);
    }

    public final void a(u uVar, int i2) {
        nss nss = (nss) this.e.get(i2);
        uVar.o.getContext();
        vle a2 = nss.a();
        ovg a3 = ovh.a(a2, i2);
        this.h.a(uVar, this.f, a2, a3, this.a.a(a2), false, i2);
        h hVar = (h) fbp.a(fqv.a(uVar.o, h.class));
        List emptyList = Collections.emptyList();
        HomeMix homeMix = this.d;
        if (homeMix != null) {
            Map map = (Map) fbp.a(homeMix.homeMixUsersMap());
            fbp.a(map);
            ArrayList arrayList = new ArrayList();
            for (nsr a4 : nss.b()) {
                HomeMixUser homeMixUser = (HomeMixUser) map.get(a4.a());
                if (homeMixUser != null) {
                    arrayList.add(homeMixUser.getFace());
                }
            }
            a aVar = new a();
            aVar.a = arrayList;
            ovg ovg = a3;
            emptyList = this.j.a(uVar.o.getContext(), ovg, aVar.a(), a2.getUri(), i2, this.d);
        }
        hVar.a(emptyList);
    }

    public final int b() {
        return this.e.size();
    }

    public final long b(int i2) {
        vle a2 = ((nss) this.e.get(i2)).a();
        long hashCode = (long) (hashCode() ^ a2.getUri().hashCode());
        String d2 = a2.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
