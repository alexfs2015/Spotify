package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.music.feedback.FeedbackValue;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows;
import com.spotify.music.playlist.ui.Rows.h;
import java.util.Collections;
import java.util.List;

/* renamed from: tjr reason: default package */
public final class tjr extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl, oog<tjr> {
    private final ood a;
    private final tkk<ooa> d;
    private final oob e;
    private List<uzb> f = Collections.emptyList();
    private ItemConfiguration g = ItemConfiguration.r().a();
    private final tjg h;

    /* renamed from: tjr$a */
    public interface a {
        tjr a(tke tke, vti<jmf<ooa>> vti);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public tjr(ood ood, defpackage.tkk.a<ooa> aVar, oob oob, tjh tjh, tke tke, vti<jmf<ooa>> vti) {
        this.d = aVar.a(tke, vti);
        this.e = oob;
        this.a = ood;
        if (tke != null) {
            this.h = new tjg(tke);
            a(true);
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final u a(ViewGroup viewGroup, int i) {
        return fqg.a(Rows.a(viewGroup.getContext(), viewGroup));
    }

    public final void a(u uVar, int i) {
        uzb uzb = (uzb) this.f.get(i);
        uVar.o.getContext();
        ooa a2 = oob.a(uzb, i);
        ((fri) fay.a(fqb.a(uVar.o, fri.class))).c().setVisibility(8);
        String str = (String) uzb.c().get(Metadata.DISLIKE_FEEDBACK_SELECTED);
        this.d.a(uVar, this.g, uzb, a2, this.a.a(uzb), false, i);
        if (FeedbackValue.ON == FeedbackValue.a(str)) {
            this.d.a(uVar, this.g, uzb, null, this.a.a(uzb), false, i);
            h hVar = (h) fay.a(fqb.a(uVar.o, h.class));
            hVar.a(this.h.a(uVar.o.getContext(), uzb, i));
            hVar.c(true);
        }
    }

    public final int b() {
        return this.f.size();
    }

    public final void a(List<uzb> list) {
        this.f = (List) fay.a(list);
        e();
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.g != itemConfiguration) {
            this.g = itemConfiguration;
            e();
        }
    }

    public final void a(String str, boolean z) {
        if (this.a.a(str)) {
            e();
        }
    }

    public final long b(int i) {
        uzb uzb = (uzb) this.f.get(i);
        long hashCode = (long) (hashCode() ^ uzb.getUri().hashCode());
        String d2 = uzb.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
