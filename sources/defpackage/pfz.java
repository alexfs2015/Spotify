package defpackage;

import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: pfz reason: default package */
public final class pfz {
    public final pej a;
    public final boolean b;
    public boolean c;
    private final a d = new a();
    private final a e = new a();
    private final txq f;
    private final ImpressionLogger g;

    public pfz(pej pej, boolean z, txq txq, ImpressionLogger impressionLogger) {
        this.a = pej;
        this.b = z;
        this.f = txq;
        this.g = impressionLogger;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vmh vmh) {
        this.g.a(vmh.getEpisode().getUri(), "contextual-episode", -1, ImpressionType.ITEM, RenderType.LIST);
    }

    public void a(vml vml, ugu ugu) {
        vmh c2 = vml.c();
        if (c2 == null || c2.getEpisode() == null) {
            this.f.c = null;
            return;
        }
        this.f.c = c2;
        this.d.a = R.string.continue_listening_header;
        this.e.a = c2.getEpisode();
        this.e.b = (vkv[]) vml.getItems();
        ugu.a(this.d);
        ugu.a(this.e);
        this.e.c = new $$Lambda$pfz$xGIHpikNNEEjflDYOuXBsHZeD_g(this, c2);
    }
}
