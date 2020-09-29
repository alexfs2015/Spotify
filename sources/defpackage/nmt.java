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

/* renamed from: nmt reason: default package */
public final class nmt extends a<u> implements gjl {
    final ood a;
    HomeMix d;
    List<nnd> e = Collections.emptyList();
    ItemConfiguration f = ItemConfiguration.r().a();
    final HomeMixFormatListAttributesHelper g;
    private final tkk<ooa> h;
    private final oob i;
    private final nmk j;

    public nmt(ood ood, a<ooa> aVar, oob oob, nml nml, sih sih, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, tke tke, kf kfVar, vti<jmf<ooa>> vti) {
        this.h = aVar.a(tke, vti);
        this.i = oob;
        this.a = ood;
        this.g = homeMixFormatListAttributesHelper;
        nmk nmk = new nmk((Picasso) nml.a(nml.a.get(), 1), (HomeMixInteractionLogger) nml.a(nml.b.get(), 2), (fpt) nml.a(nml.c.get(), 3), (kf) nml.a(kfVar, 4), (vti) nml.a(vti, 5), (sih) nml.a(sih, 6));
        this.j = nmk;
        a(true);
    }

    public final int b() {
        return this.e.size();
    }

    public final long b(int i2) {
        uzb a2 = ((nnd) this.e.get(i2)).a();
        long hashCode = (long) (hashCode() ^ a2.getUri().hashCode());
        String d2 = a2.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        e a2 = Rows.a(viewGroup.getContext(), viewGroup);
        a2.b().setTextSize(14.0f);
        a2.d().setTextSize(12.0f);
        return fqg.a(a2);
    }

    public final void a(u uVar, int i2) {
        nnd nnd = (nnd) this.e.get(i2);
        uVar.o.getContext();
        uzb a2 = nnd.a();
        ooa a3 = oob.a(a2, i2);
        this.h.a(uVar, this.f, a2, a3, this.a.a(a2), false, i2);
        h hVar = (h) fay.a(fqb.a(uVar.o, h.class));
        List emptyList = Collections.emptyList();
        HomeMix homeMix = this.d;
        if (homeMix != null) {
            Map map = (Map) fay.a(homeMix.homeMixUsersMap());
            fay.a(map);
            ArrayList arrayList = new ArrayList();
            for (nnc a4 : nnd.b()) {
                HomeMixUser homeMixUser = (HomeMixUser) map.get(a4.a());
                if (homeMixUser != null) {
                    arrayList.add(homeMixUser.getFace());
                }
            }
            a aVar = new a();
            aVar.a = arrayList;
            ooa ooa = a3;
            emptyList = this.j.a(uVar.o.getContext(), ooa, aVar.a(), a2.getUri(), i2, this.d);
        }
        hVar.a(emptyList);
    }
}
