package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import io.reactivex.Completable;

/* renamed from: ofv reason: default package */
final class ofv implements oft, ofu {
    private static final int a = ofv.class.hashCode();
    private final ofr b;
    private final Context c;
    private uwh d;
    private Button e;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public ofv(ofr ofr, Context context) {
        this.b = ofr;
        this.c = context;
    }

    public final Completable a() {
        return this.b.e;
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((ofu) this);
    }

    public final void c() {
        this.b.a((ofu) null);
    }

    public final void d() {
        this.b.a.c();
    }

    public final void a(uwh uwh) {
        this.d = uwh;
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.playlist_add_songs_button, null);
        this.e = (Button) inflate.findViewById(R.id.add_songs_button);
        this.e.setOnClickListener(new $$Lambda$ofv$p1vWIV3Xjq6koe4VQbNfHhjRixg(this));
        uwh.a((a<H>) new jlu<H>(inflate, true), a);
        uwh.a(false, a);
        this.b.a((ofu) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ofr ofr = this.b;
        ofr.b.a();
        ofr.c.a(ofr.d);
    }

    public final void a(boolean z) {
        if (z) {
            this.d.a(true, a);
            return;
        }
        this.d.a(false, a);
    }
}
