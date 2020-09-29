package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rkg reason: default package */
public final class rkg {
    public final Context a;
    public final ToastieManager b;

    /* renamed from: rkg$a */
    public interface a {
        void onUndoBanClicked();
    }

    public rkg(Context context, ToastieManager toastieManager) {
        this.a = context;
        this.b = toastieManager;
    }

    public final void a() {
        this.b.a();
        this.b.a(uzy.a(this.a.getString(R.string.feedback_remove_toastie), 4000).a());
    }

    public final void a(a aVar) {
        this.b.a();
        this.b.a(uzy.a(this.a.getString(R.string.feedback_negative_track_generic_toastie), 8000).a(this.a.getString(R.string.player_toastie_undo)).a((OnClickListener) new $$Lambda$rkg$BG8UBGOInjupKDJLfW6495AeujM(aVar)).a());
    }

    public final void b(a aVar) {
        this.b.a();
        this.b.a(uzy.a(this.a.getString(R.string.feedback_negative_artist_generic_toastie), 8000).a(this.a.getString(R.string.player_toastie_undo)).a((OnClickListener) new $$Lambda$rkg$PWutUVpiSCLwjzfd4tO61zhCTX8(aVar)).a());
    }
}
