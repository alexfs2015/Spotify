package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: igx reason: default package */
public class igx extends jrd implements jqx, a {
    public static final String a = igx.class.getCanonicalName();
    public SlotApi T;
    public ihc U;
    public igv V;
    /* access modifiers changed from: private */
    public Ad W;
    private LinearLayout X;
    /* access modifiers changed from: private */
    public TextView Y;
    /* access modifiers changed from: private */
    public TextView Z;
    private Button aa;
    private boolean ab;
    private Disposable ac;
    private final a ad = new a() {
        public final void a(int[] iArr) {
            if (igx.this.ah()) {
                igx.this.V.a(igx.this.W, igx.this.p());
            }
        }

        public final void ah() {
            igx.this.Y.animate().alpha(1.0f).setDuration(100).start();
            igx.this.Z.animate().alpha(1.0f).setDuration(100).start();
        }

        public final void ai() {
            igx.this.ae.ap_().a();
        }

        public final void c() {
            igx.this.Y.animate().alpha(0.0f).setDuration(100).start();
            igx.this.Z.animate().alpha(0.0f).setDuration(100).start();
        }
    };
    /* access modifiers changed from: private */
    public a ae;
    public iin b;

    public static igx a(Ad ad2, fqn fqn) {
        Assertion.a((Object) ad2, "Need an ad to display");
        igx igx = new igx();
        Bundle bundle = new Bundle();
        bundle.putParcelable(PlayerProviders.ADS, ad2);
        bundle.putBoolean("programmatic_enabled", fqn != null && fqn.a(hyn.c) == ScreensaverProgrammaticAdFlag.ENABLED);
        igx.g(bundle);
        return igx;
    }

    /* access modifiers changed from: private */
    public boolean ah() {
        return this.ab && this.W.isProgrammatic();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.V.a(this.W, p());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.ae.ap_().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.ae.ap_().a();
    }

    public final void A() {
        super.A();
        this.ac = this.T.a(AdSlot.MOBILE_SCREENSAVER.getSlotId(), Intent.CLEAR).a((Action) $$Lambda$igx$i3knren2Sz2BDoOr4kpMzIZCVEo.INSTANCE, (Consumer<? super Throwable>) $$Lambda$igx$0FvkU9S_wndH2meCiXnOD_X7zj4.INSTANCE);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.X = (LinearLayout) layoutInflater.inflate(R.layout.fragment_screensaver_ad, viewGroup, false);
        this.X.setOnClickListener(new $$Lambda$igx$Okdslu8doRKv1kdsquhL1EYZJk(this));
        this.Y = (TextView) this.X.findViewById(R.id.screensaver_ad_header);
        this.Z = (TextView) this.X.findViewById(R.id.screensaver_ad_footer);
        this.Z.setOnClickListener(new $$Lambda$igx$IIILQnlBxw1vF30g7oy0byNNo(this));
        this.aa = (Button) this.X.findViewById(R.id.screensaver_ad_banner_cta);
        if (ah()) {
            this.aa.setVisibility(8);
        } else {
            this.aa.setText(this.W.getButtonText());
            this.aa.setOnClickListener(new $$Lambda$igx$vlWDWravhsqpnI0uSfnlFLqG0Jo(this));
        }
        ImageView imageView = (ImageView) this.X.findViewById(R.id.screensaver_ad_banner);
        imageView.setOnTouchListener(new iig(this.X.findViewById(R.id.screensaver_ad_banner_container), this.ad));
        this.U.a(this.W).a(imageView, (wfz) new wfz() {
            public final void a() {
                igx.this.b.a("viewed", igx.this.W.id());
            }

            public final void b() {
                igx.this.ae.ap_().a();
                igx.this.b.a("errored", igx.this.W.id());
            }
        });
        return this.X;
    }

    public final void a(Context context) {
        super.a(context);
        this.ae = (a) context;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.aS;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ADS, ViewUris.aS.toString());
    }

    public final uqm ag() {
        return uqo.a;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Bundle bundle2 = (Bundle) fbp.a(this.i);
        this.W = (Ad) bundle2.getParcelable(PlayerProviders.ADS);
        this.ab = bundle2.getBoolean("programmatic_enabled");
    }

    public final String e() {
        return ViewUris.aS.toString();
    }

    public final void h() {
        super.h();
        String str = "ended";
        this.V.a.a(str, this.W.id());
    }

    public final void z() {
        super.z();
        Disposable disposable = this.ac;
        if (disposable != null && !disposable.b()) {
            this.ac.bd_();
        }
    }
}
