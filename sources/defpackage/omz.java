package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: omz reason: default package */
final class omz implements omx, omy {
    private static final int a = omz.class.hashCode();
    private final omv b;
    private final Context c;
    private vhx d;
    private Button e;

    public omz(omv omv, Context context) {
        this.b = omv;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        omv omv = this.b;
        omv.b.a();
        omv.c.a(omv.d);
    }

    public final Completable a() {
        return this.b.e;
    }

    public final void a(Bundle bundle) {
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(vhx vhx) {
        this.d = vhx;
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.playlist_add_songs_button, null);
        this.e = (Button) inflate.findViewById(R.id.add_songs_button);
        this.e.setOnClickListener(new $$Lambda$omz$_dGP2nkfmbDds1V40RFvoZC9VU(this));
        vhx.a((a<H>) new jog<H>(inflate, true), a);
        vhx.a(false, a);
        this.b.a((omy) this);
    }

    public final void a(boolean z) {
        if (z) {
            this.d.a(true, a);
            return;
        }
        this.d.a(false, a);
    }

    public final void ay_() {
        this.b.a((omy) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.b.a((omy) null);
    }

    public final void d() {
        this.b.a.c();
    }
}
