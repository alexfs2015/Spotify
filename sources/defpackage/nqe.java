package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.features.listeninghistory.model.Session;
import com.spotify.music.features.listeninghistory.model.Track;
import java.util.List;

/* renamed from: nqe reason: default package */
public final class nqe extends a<u> implements gjl {
    public final List<Session> a = Lists.a();

    public final u a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new nqf(fqb.e().a(viewGroup.getContext(), viewGroup));
        }
        fqb.b();
        return new nqg(frq.a(viewGroup.getContext(), viewGroup, false));
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

    public final int b() {
        int i = 0;
        for (Session session : this.a) {
            i += session.getSession().size();
        }
        return i + this.a.size();
    }

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

    public final void a(u uVar, int i) {
        if (uVar.t == 1) {
            nqf nqf = (nqf) uVar;
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
                nqf.b.a((CharSequence) nqf.a(((Session) list.get(i2)).getSessionStartTime()));
                return;
            }
            throw new IllegalStateException("No position found in Session");
        }
        Track track = (Track) fay.a(f(i));
        nqg nqg = (nqg) uVar;
        nqg.b.a(track.getTrackName());
        nqg.b.b(track.getMainArtistName());
    }
}
