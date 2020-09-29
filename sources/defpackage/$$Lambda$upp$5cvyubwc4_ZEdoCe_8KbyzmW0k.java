package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: -$$Lambda$upp$-5cvyubwc4_ZEdoCe_8KbyzmW0k reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upp$5cvyubwc4_ZEdoCe_8KbyzmW0k implements OnClickListener {
    private final /* synthetic */ upp f$0;
    private final /* synthetic */ Participant f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$upp$5cvyubwc4_ZEdoCe_8KbyzmW0k(upp upp, Participant participant, int i) {
        this.f$0 = upp;
        this.f$1 = participant;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.b(this.f$1, this.f$2, view);
    }
}
