package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.features.listeninghistory.model.Session;
import com.spotify.music.features.listeninghistory.model.Track;
import java.util.List;

/* renamed from: nwh reason: default package */
public final class nwh extends a<u> implements gkw {
    public final List<Session> a = Lists.a();

    private Track f(int i) {
        int i2 = 0;
        for (Session session : this.a) {
            if (i <= i2 || i > session.getSession().size() + i2) {
                i2 += session.getSession().size() + 1;
            } else {
                return (Track) session.getSession().get((i - i2) - 1);
            }
        }
        throw new IllegalStateException("Failed to get track at adapter position");
    }

    public final int a(int i) {
        int i2 = 0;
        for (Session session : this.a) {
            if (i == i2) {
                return 1;
            }
            int i3 = i2 + 1;
            int size = session.getSession().size();
            if (i >= i3 && i < i3 + size) {
                return 2;
            }
            i2 = i3 + size;
        }
        return 2;
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new nwi(fqv.e().a(viewGroup.getContext(), viewGroup));
        }
        fqv.b();
        return new nwj(fsk.a(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i) {
        if (uVar.t == 1) {
            nwi nwi = (nwi) uVar;
            List<Session> list = this.a;
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.a.size()) {
                if (i != i3) {
                    int i4 = i3 + 1;
                    int size = ((Session) this.a.get(i2)).getSession().size();
                    if (i < i4 || i >= i4 + size) {
                        i3 = i4 + size;
                        i2++;
                    }
                }
                nwi.b.a((CharSequence) nwi.a(((Session) list.get(i2)).getSessionStartTime()));
                return;
            }
            throw new IllegalStateException("No position found in Session");
        }
        Track track = (Track) fbp.a(f(i));
        nwj nwj = (nwj) uVar;
        nwj.b.a(track.getTrackName());
        nwj.b.b(track.getMainArtistName());
    }

    public final int b() {
        int i = 0;
        for (Session session : this.a) {
            i += session.getSession().size();
        }
        return i + this.a.size();
    }
}
