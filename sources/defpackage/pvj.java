package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.player.views.MarqueeTextView;
import com.spotify.music.R;
import com.spotify.music.features.queue.logging.QueueLogConstants.SectionId;
import com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: pvj reason: default package */
public final class pvj implements pvi, pvl {
    private final pvk a;
    private View b;
    private MarqueeTextView c;
    private MarqueeTextView d;

    public pvj(Flowable<PlayerState> flowable, Scheduler scheduler, pvc pvc, szp szp) {
        pvk pvk = new pvk(this, flowable, scheduler, pvc, szp);
        this.a = pvk;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tmm tmm, View view) {
        pvk pvk = this.a;
        if (tmm.a()) {
            String str = tmm.a;
            pvk.a.a(str, SectionId.HEADER_CONTEXT_TITLE, UserIntent.OPEN_PLAY_CONTEXT_PAGE, InteractionType.HIT);
            pvk.b.a(str);
        }
    }

    public final void a() {
        this.a.a();
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = layoutInflater.inflate(R.layout.queue_header_unit, viewGroup, false);
        viewGroup.addView(this.b);
        this.c = (MarqueeTextView) this.b.findViewById(R.id.context_title);
        this.d = (MarqueeTextView) this.b.findViewById(R.id.context_subtitle);
    }

    public final void a(tmm tmm) {
        Context context = this.c.getContext();
        Resources resources = context.getResources();
        this.c.a(tmm.a(resources), fr.b(context, (int) R.color.queue_now_playing_title));
        this.d.a(tmm.b(resources), fr.b(context, (int) R.color.queue_now_playing_subtitle));
        this.b.setOnClickListener(new $$Lambda$pvj$gdm02enUU6YKK1hU6lUWYNSuvzs(this, tmm));
    }

    public final void b() {
        this.a.c.bd_();
    }
}
