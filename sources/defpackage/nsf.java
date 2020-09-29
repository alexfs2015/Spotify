package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Completable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* renamed from: nsf reason: default package */
public class nsf implements nsh, ova {
    static final int a;
    private static final int d;
    private static final int e;
    private static final int f;
    public final nsc b;
    final oml c;
    private final nsi g;
    private final Context h;
    private final EnumMap<Style, String> i;
    private final nty j;
    private final npq k;
    private vhx l;
    private TextView m;
    private nqs n;
    private nqt o;
    private final HomeMixInteractionLogger p;

    static {
        Class<nsf> cls = nsf.class;
        a = cls.hashCode();
        d = cls.hashCode() + 1;
        e = cls.hashCode() + 2;
        f = cls.hashCode() + 3;
    }

    public nsf(nsd nsd, oml oml, omc omc, Context context, EnumMap<Style, String> enumMap, HomeMixInteractionLogger homeMixInteractionLogger, nty nty, npq npq, nsj nsj, ItemListConfiguration itemListConfiguration) {
        nsd nsd2 = nsd;
        nsj nsj2 = nsj;
        this.j = nty;
        nsc nsc = new nsc((a) nsd.a(nsd2.a.get(), 1), (a) nsd.a(nsd2.b.get(), 2), (HomeMixFormatListAttributesHelper) nsd.a(nsd2.c.get(), 3), (nth) nsd.a(nsd2.d.get(), 4), (hxx) nsd.a(nsd2.e.get(), 5), (HomeMixInteractionLogger) nsd.a(nsd2.f.get(), 6), (ItemListConfiguration) nsd.a(itemListConfiguration, 7));
        this.b = nsc;
        nsi nsi = new nsi((ovj) nsj.a(nsj2.a.get(), 1), (a) nsj.a(nsj2.b.get(), 2), (ovh) nsj.a(nsj2.c.get(), 3), (nsa) nsj.a(nsj2.d.get(), 4), (sso) nsj.a(nsj2.e.get(), 5), (HomeMixFormatListAttributesHelper) nsj.a(nsj2.f.get(), 6), (tvw) nsj.a(this.b, 7), (who) nsj.a(new $$Lambda$nsf$0hSGPjgIWUNgsD23x36JHk1HtC8(this), 8));
        this.g = nsi;
        this.c = oml;
        this.h = context;
        this.i = enumMap;
        this.k = npq;
        this.p = homeMixInteractionLogger;
        omc.b(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.j.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(HomeMix homeMix, View view) {
        npq npq = this.k;
        npq.c = true;
        npq.b.ar();
        HomeMixInteractionLogger homeMixInteractionLogger = this.p;
        homeMixInteractionLogger.a(Section.TASTE_ONBOARDING_CTA, homeMixInteractionLogger.a, "start", homeMix);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jor e() {
        return this.b;
    }

    public final Completable a() {
        return this.b.a();
    }

    public final void a(Bundle bundle) {
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, vhx vhx) {
        this.l = vhx;
        this.m = (TextView) layoutInflater.inflate(R.layout.home_mix_empty_tracks_view, viewGroup, false);
        this.n = new nqs(layoutInflater.getContext());
        this.o = new nqt(layoutInflater.getContext());
        vhx.a((a<H>) this.g, a);
        this.l.a((a<H>) new jog<H>(this.m, false), d);
        vhx vhx2 = this.l;
        nqs nqs = this.n;
        View inflate = LayoutInflater.from(nqs.getContext()).inflate(R.layout.home_mix_empty_state, nqs);
        nqs.setLayoutParams(new LayoutParams(-1, -1));
        nqs.setGravity(15);
        nqs.setBackgroundColor(fr.c(nqs.getContext(), R.color.gray_background));
        vhx2.a((a<H>) new jog<H>(inflate), e);
        vhx vhx3 = this.l;
        nqt nqt = this.o;
        View inflate2 = LayoutInflater.from(nqt.getContext()).inflate(R.layout.home_mix_empty_state, nqt);
        nqt.setLayoutParams(new LayoutParams(-1, -1));
        nqt.setGravity(15);
        nqt.setBackgroundColor(fr.c(nqt.getContext(), R.color.gray_background));
        vhx3.a((a<H>) new jog<H>(inflate2), f);
        vhx.a(d, e, f);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        nsi nsi = this.g;
        if (nsi.f != itemConfiguration) {
            nsi.f = itemConfiguration;
            nsi.e();
        }
    }

    public final void a(String str, boolean z) {
        nsi nsi = this.g;
        if (nsi.a.a(str)) {
            nsi.e();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        this.l.a(false, a, d, e, f);
        HomeMix d2 = aVar.d();
        List<vle> c2 = aVar.c();
        aVar.a().getImageUri(Size.LARGE);
        ntj b2 = aVar.b();
        if (!(b2 instanceof a) || d2 == null) {
            ntj b3 = aVar.b();
            if (((b3 instanceof f) || (b3 instanceof g) || (b3 instanceof j) || (b3 instanceof h) || (b3 instanceof i)) || d2 == null) {
                if (!c2.isEmpty()) {
                    nsi nsi = this.g;
                    nsi.d = d2;
                    HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = nsi.g;
                    ArrayList arrayList = new ArrayList();
                    for (vle vle : c2) {
                        arrayList.add(nss.a(vle, homeMixFormatListAttributesHelper.a(vle)));
                    }
                    nsi.e = (List) fbp.a(arrayList);
                    nsi.e();
                    this.l.b(a);
                    return;
                } else if (d2 != null) {
                    Optional c3 = Optional.c(this.i.get(d2.style()));
                    if (c3.b()) {
                        this.l.b(d);
                        this.m.setText((CharSequence) c3.c());
                    } else {
                        this.l.a(d);
                    }
                }
            } else if ((b2 instanceof d) || (b2 instanceof e)) {
                nqs nqs = this.n;
                String string = this.h.getString(R.string.home_mix_join_title, new Object[]{d2.planType().a(this.h)});
                this.h.getString(R.string.home_mix_join_text);
                $$Lambda$nsf$oQC1HrMikjhjF29Whq4_79IgJHg r1 = new $$Lambda$nsf$oQC1HrMikjhjF29Whq4_79IgJHg(this);
                ((TextView) nqs.findViewById(R.id.home_mix_empty_state_title)).setText(string);
                Button button = (Button) nqs.findViewById(R.id.action_button);
                button.setText(R.string.home_mix_join_text);
                button.setOnClickListener(r1);
                this.l.b(e);
                return;
            } else if (b2 instanceof b) {
                Optional c4 = Optional.c(this.i.get(d2.style()));
                if (c4.b()) {
                    this.l.b(d);
                    this.m.setText((CharSequence) c4.c());
                    return;
                }
                this.l.a(d);
            }
            return;
        }
        nqt nqt = this.o;
        String string2 = this.h.getString(R.string.home_mix_taste_onboarding_cta_header, new Object[]{d2.planType().a(this.h)});
        String string3 = this.h.getString(R.string.home_mix_start_text);
        $$Lambda$nsf$Dfsx_nZIXMuCzZsUDWKVbp7ozw r5 = new $$Lambda$nsf$Dfsx_nZIXMuCzZsUDWKVbp7ozw(this, d2);
        ((TextView) nqt.findViewById(R.id.home_mix_empty_state_title)).setText(string2);
        ((TextView) nqt.findViewById(R.id.action_button)).setText(string3);
        nqt.findViewById(R.id.action_button).setOnClickListener(r5);
        this.l.a(true, f);
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void ay_() {
        this.b.a(this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.b.a((nsf) null);
    }

    public final void d() {
        this.b.b();
    }
}
