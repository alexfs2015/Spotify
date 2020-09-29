package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: vpg reason: default package */
public final class vpg {
    private final Activity a;
    private final jty b;
    private final mfo c;
    private final jlr d;
    private final jtz e;

    public vpg(Activity activity, mfo mfo, jty jty, jlr jlr, jtz jtz) {
        this.a = activity;
        this.c = mfo;
        this.b = jty;
        this.d = jlr;
        this.e = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        jlr jlr = this.d;
        bg bgVar = new bg(null, uqo.aF.a(), ViewUris.T.toString(), null, -1, "https://www.spotify.com/account/subscription/change/", "hit", null, (double) this.e.a());
        jlr.a(bgVar);
        mfo.a(this.a, mfw.g().a(this.b).a(Uri.parse("https://www.spotify.com/account/subscription/change/")).a(false).a());
    }

    public final View a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_hub_row_in_setting_fragment, viewGroup, false);
        inflate.findViewById(R.id.btn_view_other_plans).setOnClickListener(new $$Lambda$vpg$8cFZpmqPPMKgtfyV3FoQDNOCiVw(this));
        return inflate;
    }
}
