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

/* renamed from: nnp reason: default package */
public final class nnp extends a<nnm> implements gjl {
    List<nne> a = Lists.a();
    Map<String, HomeMixUser> d = new HashMap(10);
    private final nnn e;

    public final /* synthetic */ void a(u uVar, int i) {
        int i2;
        nnm nnm = (nnm) uVar;
        nne nne = (nne) this.a.get(i);
        try {
            i2 = Color.parseColor(nne.b());
        } catch (IllegalArgumentException unused) {
            i2 = Color.parseColor("lightgray");
        }
        Map<String, HomeMixUser> map = this.d;
        fay.a(map);
        ArrayList arrayList = new ArrayList();
        for (nnc a2 : nne.e()) {
            HomeMixUser homeMixUser = (HomeMixUser) map.get(a2.a());
            if (homeMixUser != null) {
                arrayList.add(homeMixUser.getFace());
            }
        }
        nnm.a(i2, nne, arrayList);
    }

    public nnp(nnn nnn) {
        this.e = nnn;
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new nnm((Picasso) nnn.a(this.e.a.get(), 1), (ViewGroup) nnn.a(viewGroup, 2));
    }
}
