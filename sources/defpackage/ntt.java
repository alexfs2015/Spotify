package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: ntt reason: default package */
public final class ntt {
    /* access modifiers changed from: private */
    public static final a f = a.t().a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().e(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).d(ImmutableMap.f()).a(ImmutableMap.f()).a()).a(HeaderPolicy.builder().a(ImmutableMap.b("formatListAttributes", Boolean.TRUE)).c(ImmutableMap.f()).b(ImmutableMap.f()).a()).a()).a())).i(vkg.a(0, 0)).a();
    final ntw a;
    private final HomeMixFormatListAttributesHelper b;
    /* access modifiers changed from: private */
    public final CompositeDisposable c = new CompositeDisposable();
    private final EnumMap<Style, String> d;
    private final HomeMixInteractionLogger e;
    private HomeMix g;

    public ntt(final vje vje, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, final a aVar, EnumMap<Style, String> enumMap, final String str, ntw ntw, HomeMixInteractionLogger homeMixInteractionLogger) {
        this.b = homeMixFormatListAttributesHelper;
        this.d = enumMap;
        this.a = (ntw) fbp.a(ntw);
        this.e = (HomeMixInteractionLogger) fbp.a(homeMixInteractionLogger);
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(vld vld) {
                ntt.a(ntt.this, vld.a());
            }

            public final void a() {
                ntt.this.c.c();
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void c() {
                ntt.this.c.a(vje.b(str, ntt.f).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$ntt$1$1qFuu0YdWZg_rjOpEzgHocALuFw<Object>(this)));
            }
        });
    }

    static /* synthetic */ void a(ntt ntt, vlc vlc) {
        List b2 = ntt.b.b(vlc);
        ntt.g = ntt.b.a(vlc);
        HomeMix homeMix = ntt.g;
        Map homeMixUsersMap = homeMix != null ? homeMix.homeMixUsersMap() : Collections.emptyMap();
        HomeMix homeMix2 = ntt.g;
        HomeMixPlanType planType = homeMix2 != null ? homeMix2.planType() : HomeMixPlanType.OTHER;
        HomeMix homeMix3 = ntt.g;
        Style style = homeMix3 != null ? homeMix3.style() : Style.DEFAULT;
        HomeMix homeMix4 = ntt.g;
        ntt.a.a((HomeMixPlanType) fbp.a(planType), (String) ntt.d.get(style), b2, homeMixUsersMap, homeMix4 != null ? npl.a(homeMix4.primaryColor(), -1) : -1);
    }

    public final void a(boolean z) {
        HomeMixInteractionLogger homeMixInteractionLogger = this.e;
        homeMixInteractionLogger.a(z ? Section.WELCOME : Section.TASTE_VIZ, homeMixInteractionLogger.a, "listen-now", this.g);
        this.a.c();
    }

    public final void b(boolean z) {
        HomeMixInteractionLogger homeMixInteractionLogger = this.e;
        homeMixInteractionLogger.a(z ? Section.WELCOME : Section.TASTE_VIZ, homeMixInteractionLogger.a, "learn-more", this.g);
        this.a.a(this.g.planType());
    }
}
