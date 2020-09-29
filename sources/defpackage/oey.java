package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.music.R;

/* renamed from: oey reason: default package */
public final class oey extends ith<ofh> {
    private final TextView a = ((TextView) this.o.findViewById(R.id.track_title));
    private final ConnectView b = ((ConnectView) this.o.findViewById(R.id.connect_unit));

    oey(ViewGroup viewGroup) {
        super(a((int) R.layout.now_playing_bar_track_item, viewGroup));
        this.b.f();
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
    public /* synthetic */ void a(c cVar) {
        this.b.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.b.setVisibility(0);
        this.b.a(dVar.a, (String) dVar.b.apply(this.b.getContext()));
    }

    private void a(ofg ofg) {
        ofg.a(new $$Lambda$oey$hq6R9i4cpQZwat0qqA8QbnMkC_I(this), new $$Lambda$oey$NRclEIr3r7QeV9HrQt7MvklgqJI(this), new $$Lambda$oey$HIgJavljwhlM9M3RN0GmZE0J0w(this), new $$Lambda$oey$o41KRmw2brXeS5dyu_9vTJUS4nk(this));
    }

    private void a(ofm ofm) {
        CharSequence a2 = oex.a(this.a.getContext(), ofm);
        if (!a2.toString().contentEquals(this.a.getText())) {
            this.a.setText(a2);
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a((ofh) obj);
    }

    public final void a(ofh ofh) {
        ofm a2 = ofh.a();
        ofg b2 = ofh.b();
        a(a2);
        a(b2);
    }
}
