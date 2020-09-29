package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: lld reason: default package */
final class lld {
    final View a;
    private final llb b;

    lld(LayoutInflater layoutInflater, ViewGroup viewGroup, llb llb) {
        this.b = llb;
        this.a = layoutInflater.inflate(R.layout.fragment_stations_promo, viewGroup, false);
        this.a.findViewById(R.id.get_stations_button).setOnClickListener(new $$Lambda$lld$xWHjFV2uGBIay2Z9ZczDAm4OpcA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        Context context = this.a.getContext();
        Intent launchIntentForPackage = this.b.a.getLaunchIntentForPackage("com.spotify.zerotap");
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW");
            launchIntentForPackage.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.spotify.zerotap"));
            launchIntentForPackage.setPackage("com.android.vending");
        }
        context.startActivity(launchIntentForPackage);
    }
}
