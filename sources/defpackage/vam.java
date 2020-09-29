package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.podcastonboarding.sendtopics.ProgressIndicator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vam reason: default package */
public class vam extends jor implements b, a, udv {
    public boolean T;
    /* access modifiers changed from: private */
    public TextView U;
    private b<vas, vaq> V;
    public van a;
    public vae b;

    public static vam a(Set<vbt> set) {
        vam vam = new vam();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("topics", (Parcelable[]) set.toArray(new vbt[0]));
        vam.g(bundle);
        return vam;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vax vax = new vax(layoutInflater, viewGroup, this.b);
        HashSet hashSet = new HashSet(Arrays.asList((vbt[]) ((Bundle) fay.a(this.i)).getParcelableArray("topics")));
        this.V = kjt.a(van.a(vax, this.a.a), new vao(hashSet), kkd.a());
        this.V.a(vax);
        final View view = vax.a;
        this.U = (TextView) view.findViewById(R.id.textview);
        boolean isEmpty = hashSet.isEmpty();
        if (this.T) {
            this.U.setText(isEmpty ? R.string.podcast_onboarding_finding_music : R.string.podcast_onboarding_finding_music_and_podcasts);
        }
        view.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                ProgressIndicator progressIndicator = (ProgressIndicator) view.findViewById(R.id.progress_indicator);
                float f = -((float) vam.this.U.getLayout().getLineDescent(1));
                progressIndicator.setTranslationX(vam.this.U.getLayout().getPrimaryHorizontal(vam.this.U.getText().length()) - progressIndicator.getX());
                progressIndicator.setTranslationY(f);
            }
        });
        return view;
    }

    public final void z() {
        super.z();
        this.V.c();
    }

    public final void A() {
        super.A();
        this.V.d();
    }

    public final void ax_() {
        super.ax_();
        this.V.b();
    }

    public final gjf aj() {
        return PageIdentifiers.PODCASTONBOARDING_SENDTOPICS;
    }

    public final sih ae_() {
        return sih.a("spotify:podcastonboarding:send-topics");
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PODCASTONBOARDING_SENDTOPICS, sih.a("spotify:podcastonboarding:send-topics").toString());
    }
}
