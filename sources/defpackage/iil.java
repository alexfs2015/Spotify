package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.music.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: iil reason: default package */
public final class iil {
    public final jxz a;
    private final SlotApi b;
    private final uzw c;
    private Disposable d;

    public iil(SlotApi slotApi, jxz jxz, uzw uzw) {
        this.b = slotApi;
        this.a = jxz;
        this.c = uzw;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Fragment fragment, View view) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", fragment.p().getPackageName(), null));
        fragment.a(intent);
    }

    public static boolean a(Ad ad) {
        return ad.getFeaturedActionType() == FeaturedActionType.PLAY_TRACK;
    }

    public final void a(Fragment fragment) {
        Context n = fragment.n();
        if (n != null) {
            uzy a2 = uzy.a(n.getString(R.string.voice_permission_denied_snackbar), 3500).c(R.color.white).b(R.color.black).a(n.getString(R.string.settings_title)).a((OnClickListener) new $$Lambda$iil$QaQabcesUWGyHLDz1Lli7sVm6O4(fragment)).a();
            Snackbar a3 = Snackbar.a(fragment.H, a2.a(), a2.b());
            a3.a(a2.e(), a2.f());
            uzw.a(a3, a2);
            a3.c();
        }
    }

    public final void a(AdSlot adSlot) {
        this.d = this.b.a(adSlot.toString(), SlotApi.Intent.CLEAR).a((Action) new $$Lambda$iil$E4k1kOiBaNHda4JFMFkqTXckW38(adSlot), (Consumer<? super Throwable>) new $$Lambda$iil$A8p3sQk1YflFdHwyMxmIdtMp5ZQ<Object>(adSlot));
    }
}
