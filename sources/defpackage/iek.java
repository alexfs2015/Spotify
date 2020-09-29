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

/* renamed from: iek reason: default package */
public class iek extends jor implements jol, a {
    public static final String a = iek.class.getCanonicalName();
    public SlotApi T;
    public iep U;
    public iei V;
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
        public final void c() {
            iek.this.Y.animate().alpha(0.0f).setDuration(100).start();
            iek.this.Z.animate().alpha(0.0f).setDuration(100).start();
        }

        public final void ah() {
            iek.this.Y.animate().alpha(1.0f).setDuration(100).start();
            iek.this.Z.animate().alpha(1.0f).setDuration(100).start();
        }

        public final void ai() {
            iek.this.ae.aq_().a();
        }

        public final void a(int[] iArr) {
            if (iek.this.ah()) {
                iek.this.V.a(iek.this.W, iek.this.p());
            }
        }
    };
    /* access modifiers changed from: private */
    public a ae;
    public iga b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static iek a(Ad ad2, fpt fpt) {
        Assertion.a((Object) ad2, "Need an ad to display");
        iek iek = new iek();
        Bundle bundle = new Bundle();
        bundle.putParcelable(PlayerProviders.ADS, ad2);
        bundle.putBoolean("programmatic_enabled", fpt != null && fpt.a(hwb.c) == ScreensaverProgrammaticAdFlag.ENABLED);
        iek.g(bundle);
        return iek;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Bundle bundle2 = (Bundle) fay.a(this.i);
        this.W = (Ad) bundle2.getParcelable(PlayerProviders.ADS);
        this.ab = bundle2.getBoolean("programmatic_enabled");
    }

    public final void A() {
        super.A();
        this.ac = this.T.a(AdSlot.MOBILE_SCREENSAVER.getSlotId(), Intent.CLEAR).a((Action) $$Lambda$iek$JEMN0emyxzgHJZd1ou7jWRtA6c.INSTANCE, (Consumer<? super Throwable>) $$Lambda$iek$r0PXcIvJuPg7d08YWpnVDXOD3RQ.INSTANCE);
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
            this.ac.bf_();
        }
    }

    public final void a(Context context) {
        super.a(context);
        this.ae = (a) context;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.X = (LinearLayout) layoutInflater.inflate(R.layout.fragment_screensaver_ad, viewGroup, false);
        this.X.setOnClickListener(new $$Lambda$iek$a0Ixa8r3CoZMS9DOzN18wHkONg(this));
        this.Y = (TextView) this.X.findViewById(R.id.screensaver_ad_header);
        this.Z = (TextView) this.X.findViewById(R.id.screensaver_ad_footer);
        this.Z.setOnClickListener(new $$Lambda$iek$_8OfZH5XCJFTMx6Q2DAz9XXWvu4(this));
        this.aa = (Button) this.X.findViewById(R.id.screensaver_ad_banner_cta);
        if (ah()) {
            this.aa.setVisibility(8);
        } else {
            this.aa.setText(this.W.getButtonText());
            this.aa.setOnClickListener(new $$Lambda$iek$R4sz12QBdJ0CmfzOYDINgmYKZWo(this));
        }
        ImageView imageView = (ImageView) this.X.findViewById(R.id.screensaver_ad_banner);
        imageView.setOnTouchListener(new ift(this.X.findViewById(R.id.screensaver_ad_banner_container), this.ad));
        this.U.a(this.W).a(imageView, (vrt) new vrt() {
            public final void a() {
                iek.this.b.a("viewed", iek.this.W.id());
            }

            public final void b() {
                iek.this.ae.aq_().a();
                iek.this.b.a("errored", iek.this.W.id());
            }
        });
        return this.X;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.ae.aq_().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.ae.aq_().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.V.a(this.W, p());
    }

    /* access modifiers changed from: private */
    public boolean ah() {
        return this.ab && this.W.isProgrammatic();
    }

    public final String e() {
        return ViewUris.aT.toString();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ADS, ViewUris.aT.toString());
    }

    public final sih ae_() {
        return ViewUris.aT;
    }

    public final udr ag() {
        return udt.a;
    }
}
