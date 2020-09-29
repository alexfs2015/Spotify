package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.music.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: ify reason: default package */
public final class ify {
    public final jvr a;
    private final SlotApi b;
    private Disposable c;

    public ify(SlotApi slotApi, jvr jvr) {
        this.b = slotApi;
        this.a = jvr;
    }

    public final void a(AdSlot adSlot) {
        this.c = this.b.a(adSlot.toString(), Intent.CLEAR).a((Action) new $$Lambda$ify$7Vw7BqMJ1_VtmWJ0twuEsH3YCE(adSlot), (Consumer<? super Throwable>) new $$Lambda$ify$Km7brxXn4YFDGNu2etWZrQjzRPM<Object>(adSlot));
    }

    public static boolean a(Ad ad) {
        return ad.getFeaturedActionType() == FeaturedActionType.PLAY_TRACK;
    }

    public static void a(Fragment fragment) {
        Context n = fragment.n();
        if (n != null) {
            uos a2 = uos.a(n.getString(R.string.voice_permission_denied_snackbar), 3500).c(R.color.white).b(R.color.black).a(n.getString(R.string.settings_title)).a((OnClickListener) new $$Lambda$ify$I471DwbXqOO_g7EXypoKsY_63pw(fragment)).a();
            Snackbar a3 = Snackbar.a(fragment.H, a2.a(), a2.b());
            a3.a(a2.e(), a2.f());
            uor.a(a3, a2);
            a3.c();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Fragment fragment, View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", fragment.p().getPackageName(), null));
        fragment.a(intent);
    }
}
