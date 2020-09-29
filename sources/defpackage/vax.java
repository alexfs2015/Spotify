package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.podcastonboarding.PodcastOnboardingActivity;

/* renamed from: vax reason: default package */
public final class vax implements kjd<vas, vaq>, vad, vaw {
    public final View a;
    /* access modifiers changed from: private */
    public final vae b;
    /* access modifiers changed from: private */
    public kkn<vaq> c;

    public vax(LayoutInflater layoutInflater, ViewGroup viewGroup, vae vae) {
        this.a = layoutInflater.inflate(R.layout.fragment_send_topics, viewGroup, false);
        this.b = vae;
    }

    public final void b() {
        this.b.a.finish();
    }

    public final void a() {
        kkn<vaq> kkn = this.c;
        if (kkn != null) {
            kkn.accept(new a());
        }
    }

    public final kje<vas> connect(kkn<vaq> kkn) {
        this.c = kkn;
        Activity activity = this.b.a;
        if (activity instanceof PodcastOnboardingActivity) {
            ((PodcastOnboardingActivity) activity).h = this;
        }
        return new kje<vas>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
                Activity activity = vax.this.b.a;
                if (activity instanceof PodcastOnboardingActivity) {
                    ((PodcastOnboardingActivity) activity).h = null;
                }
                vax.this.c = null;
            }
        };
    }
}
