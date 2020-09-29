package defpackage;

import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: pbk reason: default package */
public final class pbk extends iqs {
    private final ImpressionLogger c;

    public pbk(ImpressionLogger impressionLogger) {
        super(R.id.podcast_episode_impression_logged);
        this.c = impressionLogger;
    }

    public final void a(int i, u uVar) {
        gzq logging = gut.d(uVar).a().a.logging();
        String string = logging.string("ui:uri");
        String string2 = logging.string("ui:group");
        this.c.a(logging.string("ui:source"), string, string2, i, ImpressionType.ITEM, RenderType.LIST);
    }
}
