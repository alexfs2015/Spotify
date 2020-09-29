package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.music.R;

/* renamed from: nym reason: default package */
public final class nym extends iqu<nyv> {
    private final TextView a = ((TextView) this.o.findViewById(R.id.track_title));
    private final ConnectView b = ((ConnectView) this.o.findViewById(R.id.connect_unit));

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a((nyv) obj);
    }

    nym(ViewGroup viewGroup) {
        super(a((int) R.layout.now_playing_bar_track_item, viewGroup));
        this.b.f();
    }

    public final void a(nyv nyv) {
        nza a2 = nyv.a();
        nyu b2 = nyv.b();
        a(a2);
        a(b2);
    }

    private void a(nza nza) {
        CharSequence a2 = nyl.a(this.a.getContext(), nza);
        if (!a2.toString().contentEquals(this.a.getText())) {
            this.a.setText(a2);
        }
    }

    private void a(nyu nyu) {
        nyu.a(new $$Lambda$nym$CJpO6S_Jd4sO52o1SdFWcfQ9hiE(this), new $$Lambda$nym$GLSgm1TIMme4KeBmm3IqNsRSVs8(this), new $$Lambda$nym$6VigM7fHiNbGMD1EGy3kiA2Qko0(this), new $$Lambda$nym$XkCQxy01SBZC8tOJIbvt316iX60(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.setVisibility(0);
        this.b.a(aVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.setVisibility(0);
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.b.setVisibility(0);
        this.b.a(dVar.a, (String) dVar.b.apply(this.b.getContext()));
    }
}
