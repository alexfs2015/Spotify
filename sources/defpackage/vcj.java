package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: vcj reason: default package */
public final class vcj {
    private final Activity a;
    private final jro b;
    private final mbl c;
    private final jjf d;
    private final jrp e;

    public vcj(Activity activity, mbl mbl, jro jro, jjf jjf, jrp jrp) {
        this.a = activity;
        this.c = mbl;
        this.b = jro;
        this.d = jjf;
        this.e = jrp;
    }

    public final View a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_hub_row_in_setting_fragment, viewGroup, false);
        inflate.findViewById(R.id.btn_view_other_plans).setOnClickListener(new $$Lambda$vcj$9kgoWpmagu5pgcVr9EiFcbQZPTE(this));
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        jjf jjf = this.d;
        bh bhVar = new bh(null, udt.aF.a(), ViewUris.U.toString(), null, -1, "https://www.spotify.com/account/subscription/change/", "hit", null, (double) this.e.a());
        jjf.a(bhVar);
        mbl.a(this.a, mbt.g().a(this.b).a(Uri.parse("https://www.spotify.com/account/subscription/change/")).a(false).a());
    }
}
