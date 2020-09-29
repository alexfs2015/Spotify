package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.podcastonboarding.PodcastOnboardingActivity;

/* renamed from: vnl reason: default package */
public final class vnl implements kmm<vng, vne>, vmr, vnk {
    public final View a;
    /* access modifiers changed from: private */
    public final vms b;
    /* access modifiers changed from: private */
    public knw<vne> c;

    public vnl(LayoutInflater layoutInflater, ViewGroup viewGroup, vms vms) {
        this.a = layoutInflater.inflate(R.layout.fragment_send_topics, viewGroup, false);
        this.b = vms;
    }

    public final void a() {
        knw<vne> knw = this.c;
        if (knw != null) {
            knw.accept(new a());
        }
    }

    public final void b() {
        this.b.a.finish();
    }

    public final kmn<vng> connect(knw<vne> knw) {
        this.c = knw;
        Activity activity = this.b.a;
        if (activity instanceof PodcastOnboardingActivity) {
            ((PodcastOnboardingActivity) activity).h = this;
        }
        return new kmn<vng>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
                Activity activity = vnl.this.b.a;
                if (activity instanceof PodcastOnboardingActivity) {
                    ((PodcastOnboardingActivity) activity).h = null;
                }
                vnl.this.c = null;
            }
        };
    }
}
