package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: nug reason: default package */
public final class nug extends a<nud> implements gkw {
    List<HomeMixUser> a = Lists.a();
    final nub d;
    private final nue e;

    public nug(nue nue, nub nub) {
        this.e = nue;
        this.d = (nub) fbp.a(nub);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new nud((Picasso) nue.a(this.e.a.get(), 1), (ViewGroup) nue.a(viewGroup, 2));
    }

    public final /* synthetic */ void a(u uVar, final int i) {
        final HomeMixUser homeMixUser = (HomeMixUser) this.a.get(i);
        ((nud) uVar).a(homeMixUser, (b) new b() {
            public final void a(boolean z) {
                nub nub = nug.this.d;
                HomeMixUser homeMixUser = homeMixUser;
                int i = i;
                nub.d.remove(homeMixUser.getUsername());
                nub.b.a(i, z, nub.c);
            }

            public final boolean a() {
                return nug.this.d.d.size() < nug.this.a.size() - 1;
            }

            public final void b() {
                nug.this.d.a.ah();
            }

            public final void b(boolean z) {
                nub nub = nug.this.d;
                HomeMixUser homeMixUser = homeMixUser;
                int i = i;
                nub.d.add(homeMixUser.getUsername());
                nub.b.a(i, z, nub.c);
            }
        });
    }

    public final int b() {
        return this.a.size();
    }
}
