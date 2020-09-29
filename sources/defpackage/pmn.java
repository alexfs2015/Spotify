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

/* renamed from: pmn reason: default package */
public final class pmn implements pmm, pmp {
    private final pmo a;
    private View b;
    private MarqueeTextView c;
    private MarqueeTextView d;

    public pmn(Flowable<PlayerState> flowable, Scheduler scheduler, pmg pmg, spi spi) {
        pmo pmo = new pmo(this, flowable, scheduler, pmg, spi);
        this.a = pmo;
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = layoutInflater.inflate(R.layout.queue_header_unit, viewGroup, false);
        viewGroup.addView(this.b);
        this.c = (MarqueeTextView) this.b.findViewById(R.id.context_title);
        this.d = (MarqueeTextView) this.b.findViewById(R.id.context_subtitle);
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        this.a.c.bf_();
    }

    public final void a(tcf tcf) {
        Context context = this.c.getContext();
        Resources resources = context.getResources();
        this.c.a(tcf.a(resources), fr.b(context, (int) R.color.queue_now_playing_title));
        this.d.a(tcf.b(resources), fr.b(context, (int) R.color.queue_now_playing_subtitle));
        this.b.setOnClickListener(new $$Lambda$pmn$B404SrHsj_kTPqulwtKGmFeyNe4(this, tcf));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tcf tcf, View view) {
        pmo pmo = this.a;
        if (tcf.a()) {
            String str = tcf.a;
            pmo.a.a(str, SectionId.HEADER_CONTEXT_TITLE, UserIntent.OPEN_PLAY_CONTEXT_PAGE, InteractionType.HIT);
            pmo.b.a(str);
        }
    }
}
