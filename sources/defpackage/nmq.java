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

/* renamed from: nmq reason: default package */
public class nmq implements nms, onu {
    static final int a;
    private static final int d;
    private static final int e;
    private static final int f;
    public final nmn b;
    final ofh c;
    private final nmt g;
    private final Context h;
    private final EnumMap<Style, String> i;
    private final nnx j;
    private final njw k;
    private uwh l;
    private TextView m;
    private nlc n;
    private nld o;
    private final HomeMixInteractionLogger p;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    static {
        Class<nmq> cls = nmq.class;
        a = cls.hashCode();
        d = cls.hashCode() + 1;
        e = cls.hashCode() + 2;
        f = cls.hashCode() + 3;
    }

    public nmq(nmo nmo, ofh ofh, oew oew, Context context, EnumMap<Style, String> enumMap, HomeMixInteractionLogger homeMixInteractionLogger, nnx nnx, njw njw, nmu nmu, kf kfVar, ItemListConfiguration itemListConfiguration) {
        nmo nmo2 = nmo;
        nmu nmu2 = nmu;
        this.j = nnx;
        nmn nmn = new nmn((oix) nmo.a(nmo2.a.get(), 1), (a) nmo.a(nmo2.b.get(), 2), (orf) nmo.a(nmo2.c.get(), 3), (a) nmo.a(nmo2.d.get(), 4), (HomeMixFormatListAttributesHelper) nmo.a(nmo2.e.get(), 5), (nng) nmo.a(nmo2.f.get(), 6), (hvl) nmo.a(nmo2.g.get(), 7), (HomeMixInteractionLogger) nmo.a(nmo2.h.get(), 8), (ItemListConfiguration) nmo.a(itemListConfiguration, 9));
        this.b = nmn;
        nmt nmt = new nmt((ood) nmu.a(nmu2.a.get(), 1), (a) nmu.a(nmu2.b.get(), 2), (oob) nmu.a(nmu2.c.get(), 3), (nml) nmu.a(nmu2.d.get(), 4), (sih) nmu.a(nmu2.e.get(), 5), (HomeMixFormatListAttributesHelper) nmu.a(nmu2.f.get(), 6), (tke) nmu.a(this.b, 7), (kf) nmu.a(kfVar, 8), (vti) nmu.a(new $$Lambda$nmq$5go5jygE9b6n85EBG1G5q3mtaE(this), 9));
        this.g = nmt;
        this.c = ofh;
        this.h = context;
        this.i = enumMap;
        this.k = njw;
        this.p = homeMixInteractionLogger;
        oew.a(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jmf e() {
        return this.b;
    }

    public final Completable a() {
        return this.b.a();
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a(this);
    }

    public final void c() {
        this.b.a((nmq) null);
    }

    public final void d() {
        this.b.b();
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, uwh uwh) {
        this.l = uwh;
        this.m = (TextView) layoutInflater.inflate(R.layout.home_mix_empty_tracks_view, viewGroup, false);
        this.n = new nlc(layoutInflater.getContext());
        this.o = new nld(layoutInflater.getContext());
        uwh.a((a<H>) this.g, a);
        this.l.a((a<H>) new jlu<H>(this.m, false), d);
        uwh uwh2 = this.l;
        nlc nlc = this.n;
        View inflate = LayoutInflater.from(nlc.getContext()).inflate(R.layout.home_mix_empty_state, nlc);
        nlc.setLayoutParams(new LayoutParams(-1, -1));
        nlc.setGravity(15);
        nlc.setBackgroundColor(fr.c(nlc.getContext(), R.color.gray_background));
        uwh2.a((a<H>) new jlu<H>(inflate), e);
        uwh uwh3 = this.l;
        nld nld = this.o;
        View inflate2 = LayoutInflater.from(nld.getContext()).inflate(R.layout.home_mix_empty_state, nld);
        nld.setLayoutParams(new LayoutParams(-1, -1));
        nld.setGravity(15);
        nld.setBackgroundColor(fr.c(nld.getContext(), R.color.gray_background));
        uwh3.a((a<H>) new jlu<H>(inflate2), f);
        uwh.a(d, e, f);
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        this.l.a(false, a, d, e, f);
        HomeMix d2 = aVar.d();
        List<uzb> c2 = aVar.c();
        aVar.a().getImageUri(Size.LARGE);
        nni b2 = aVar.b();
        if (!(b2 instanceof a) || d2 == null) {
            nni b3 = aVar.b();
            if (((b3 instanceof f) || (b3 instanceof g) || (b3 instanceof j) || (b3 instanceof h) || (b3 instanceof i)) || d2 == null) {
                if (!c2.isEmpty()) {
                    nmt nmt = this.g;
                    nmt.d = d2;
                    HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = nmt.g;
                    ArrayList arrayList = new ArrayList();
                    for (uzb uzb : c2) {
                        arrayList.add(nnd.a(uzb, homeMixFormatListAttributesHelper.a(uzb)));
                    }
                    nmt.e = (List) fay.a(arrayList);
                    nmt.e();
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
                nlc nlc = this.n;
                String string = this.h.getString(R.string.home_mix_join_title, new Object[]{d2.planType().a(this.h)});
                this.h.getString(R.string.home_mix_join_text);
                $$Lambda$nmq$Z3qbEKgCJRKTl0Gd5t33Qw9zHds r1 = new $$Lambda$nmq$Z3qbEKgCJRKTl0Gd5t33Qw9zHds(this);
                ((TextView) nlc.findViewById(R.id.home_mix_empty_state_title)).setText(string);
                Button button = (Button) nlc.findViewById(R.id.action_button);
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
        nld nld = this.o;
        String string2 = this.h.getString(R.string.home_mix_taste_onboarding_cta_header, new Object[]{d2.planType().a(this.h)});
        String string3 = this.h.getString(R.string.home_mix_start_text);
        $$Lambda$nmq$8eGY7daKxEMzssyuVLWOicZl0B0 r5 = new $$Lambda$nmq$8eGY7daKxEMzssyuVLWOicZl0B0(this, d2);
        ((TextView) nld.findViewById(R.id.home_mix_empty_state_title)).setText(string2);
        ((TextView) nld.findViewById(R.id.action_button)).setText(string3);
        nld.findViewById(R.id.action_button).setOnClickListener(r5);
        this.l.a(true, f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(HomeMix homeMix, View view) {
        njw njw = this.k;
        njw.f = true;
        njw.e.ar();
        HomeMixInteractionLogger homeMixInteractionLogger = this.p;
        homeMixInteractionLogger.a(Section.TASTE_ONBOARDING_CTA, homeMixInteractionLogger.a, "start", homeMix);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.j.c();
    }

    public final void a(String str, boolean z) {
        nmt nmt = this.g;
        if (nmt.a.a(str)) {
            nmt.e();
        }
    }

    public final void a(ItemConfiguration itemConfiguration) {
        nmt nmt = this.g;
        if (nmt.f != itemConfiguration) {
            nmt.f = itemConfiguration;
            nmt.e();
        }
    }
}
