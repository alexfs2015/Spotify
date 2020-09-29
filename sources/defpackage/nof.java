package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: nof reason: default package */
public final class nof extends a<noc> implements gjl {
    List<HomeMixUser> a = Lists.a();
    final noa d;
    private final nod e;

    public final /* synthetic */ void a(u uVar, final int i) {
        final HomeMixUser homeMixUser = (HomeMixUser) this.a.get(i);
        ((noc) uVar).a(homeMixUser, (b) new b() {
            public final void a(boolean z) {
                noa noa = nof.this.d;
                HomeMixUser homeMixUser = homeMixUser;
                int i = i;
                noa.f.remove(homeMixUser.getUsername());
                noa.d.a(i, z, noa.e);
            }

            public final void b(boolean z) {
                noa noa = nof.this.d;
                HomeMixUser homeMixUser = homeMixUser;
                int i = i;
                noa.f.add(homeMixUser.getUsername());
                noa.d.a(i, z, noa.e);
            }

            public final boolean a() {
                return nof.this.d.f.size() < nof.this.a.size() - 1;
            }

            public final void b() {
                nof.this.d.c.ah();
            }
        });
    }

    public nof(nod nod, noa noa) {
        this.e = nod;
        this.d = (noa) fay.a(noa);
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new noc((Picasso) nod.a(this.e.a.get(), 1), (ViewGroup) nod.a(viewGroup, 2));
    }
}
