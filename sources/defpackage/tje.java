package defpackage;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: tje reason: default package */
public final class tje implements gue {
    private final ConnectView a;
    private final gto b;
    private final fqn c;

    public tje(gto gto, fqn fqn, ConnectView connectView) {
        this.a = connectView;
        ConnectView connectView2 = this.a;
        LayoutParams layoutParams = (LayoutParams) connectView2.a.getLayoutParams();
        layoutParams.height = (int) connectView2.getResources().getDimension(R.dimen.connect_device_icon_size);
        connectView2.a((int) connectView2.getResources().getDimension(R.dimen.connect_device_icon_size));
        connectView2.b.setPadding(0, 0, 0, 0);
        connectView2.a.setLayoutParams(layoutParams);
        connectView2.a.requestLayout();
        this.b = gto;
        this.c = fqn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, View view) {
        aVar.a();
        this.b.a(this.c);
    }

    public final void a() {
        this.a.setVisibility(0);
        this.a.b();
        this.a.d();
    }

    public final void a(Tech tech) {
        this.a.setVisibility(0);
        this.a.a(tech);
        this.a.e();
    }

    public final void a(Tech tech, String str) {
        this.a.setVisibility(0);
        this.a.a(tech, str);
        this.a.e();
    }

    public final void a(a aVar) {
        this.a.setOnClickListener(new $$Lambda$tje$V2HqtBbjnG0siIdtKtfQbHF284(this, aVar));
    }

    public final void a(EnumSet<Tech> enumSet) {
        this.a.setVisibility(0);
        this.a.a();
        this.a.d();
    }

    public final void b() {
        this.a.setVisibility(8);
    }
}
