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

/* renamed from: vna reason: default package */
public class vna extends jrd implements b, a, uqq {
    public boolean T;
    /* access modifiers changed from: private */
    public TextView U;
    private b<vng, vne> V;
    public vnb a;
    public vms b;

    public static vna a(Set<voh> set) {
        vna vna = new vna();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("topics", (Parcelable[]) set.toArray(new voh[0]));
        vna.g(bundle);
        return vna;
    }

    public final void A() {
        super.A();
        this.V.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vnl vnl = new vnl(layoutInflater, viewGroup, this.b);
        HashSet hashSet = new HashSet(Arrays.asList((voh[]) ((Bundle) fbp.a(this.i)).getParcelableArray("topics")));
        this.V = knc.a(vnb.a(vnl, this.a.a), new vnc(hashSet), knm.a());
        this.V.a(vnl);
        final View view = vnl.a;
        this.U = (TextView) view.findViewById(R.id.textview);
        boolean isEmpty = hashSet.isEmpty();
        if (this.T) {
            this.U.setText(isEmpty ? R.string.podcast_onboarding_finding_music : R.string.podcast_onboarding_finding_music_and_podcasts);
        }
        view.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                ProgressIndicator progressIndicator = (ProgressIndicator) view.findViewById(R.id.progress_indicator);
                float f = -((float) vna.this.U.getLayout().getLineDescent(1));
                progressIndicator.setTranslationX(vna.this.U.getLayout().getPrimaryHorizontal(vna.this.U.getText().length()) - progressIndicator.getX());
                progressIndicator.setTranslationY(f);
            }
        });
        return view;
    }

    public final sso ae_() {
        return sso.a("spotify:podcastonboarding:send-topics");
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PODCASTONBOARDING_SENDTOPICS, sso.a("spotify:podcastonboarding:send-topics").toString());
    }

    public final gkq aj() {
        return PageIdentifiers.PODCASTONBOARDING_SENDTOPICS;
    }

    public final void aw_() {
        super.aw_();
        this.V.b();
    }

    public final void z() {
        super.z();
        this.V.c();
    }
}
