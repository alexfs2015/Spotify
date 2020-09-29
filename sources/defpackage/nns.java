package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* renamed from: nns reason: default package */
public final class nns {
    final HomeMixFormatListAttributesHelper a;
    final CompositeDisposable b = new CompositeDisposable();
    final EnumMap<Style, String> c;
    final nnv d;
    HomeMix e;
    private final HomeMixInteractionLogger f;

    public nns(final oix oix, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, final a aVar, EnumMap<Style, String> enumMap, nnv nnv, HomeMixInteractionLogger homeMixInteractionLogger) {
        this.a = homeMixFormatListAttributesHelper;
        this.c = enumMap;
        this.d = (nnv) fay.a(nnv);
        this.f = (HomeMixInteractionLogger) fay.a(homeMixInteractionLogger);
        aVar.a(new c() {
            public final void c() {
                nns.this.b.a(oix.c().a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$nns$1$Zuc7GGKOpCGUyu8nDfJsaS4OEo<Object>(this)));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(ojc ojc) {
                nns nns = nns.this;
                uyz a2 = ojc.a();
                List b2 = nns.a.b(a2);
                nns.e = nns.a.a(a2);
                nns.d.a((HomeMixPlanType) fay.a(nns.e != null ? nns.e.planType() : HomeMixPlanType.OTHER), (String) nns.c.get(nns.e != null ? nns.e.style() : Style.DEFAULT), b2, nns.e != null ? nns.e.homeMixUsersMap() : Collections.emptyMap(), nns.e != null ? njp.a(nns.e.primaryColor(), -1) : -1);
            }

            public final void a() {
                nns.this.b.c();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final void a(boolean z) {
        Section section;
        HomeMixInteractionLogger homeMixInteractionLogger = this.f;
        HomeMix homeMix = this.e;
        if (z) {
            section = Section.WELCOME;
        } else {
            section = Section.TASTE_VIZ;
        }
        homeMixInteractionLogger.a(section, homeMixInteractionLogger.a, "listen-now", homeMix);
        this.d.c();
    }

    public final void b(boolean z) {
        Section section;
        HomeMixInteractionLogger homeMixInteractionLogger = this.f;
        HomeMix homeMix = this.e;
        if (z) {
            section = Section.WELCOME;
        } else {
            section = Section.TASTE_VIZ;
        }
        homeMixInteractionLogger.a(section, homeMixInteractionLogger.a, "learn-more", homeMix);
        this.d.a(this.e.planType());
    }
}
