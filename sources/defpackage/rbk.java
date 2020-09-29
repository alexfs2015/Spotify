package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rbk reason: default package */
public final class rbk {
    public final Context a;
    public final ToastieManager b;

    /* renamed from: rbk$a */
    public interface a {
        void onUndoBanClicked();
    }

    public rbk(Context context, ToastieManager toastieManager) {
        this.a = context;
        this.b = toastieManager;
    }

    public final void a(a aVar) {
        this.b.a();
        this.b.a(uos.a(this.a.getString(R.string.feedback_negative_track_generic_toastie), 8000).a(this.a.getString(R.string.player_toastie_undo)).a((OnClickListener) new $$Lambda$rbk$rxe6sDaFREyWhs3VtRqY_K0dhM(aVar)).a());
    }

    public final void b(a aVar) {
        this.b.a();
        this.b.a(uos.a(this.a.getString(R.string.feedback_negative_artist_generic_toastie), 8000).a(this.a.getString(R.string.player_toastie_undo)).a((OnClickListener) new $$Lambda$rbk$I4rk4STCUzaFTV_Vhlji5sxU_p0(aVar)).a());
    }

    public final void a() {
        this.b.a();
        this.b.a(uos.a(this.a.getString(R.string.feedback_remove_toastie), 4000).a());
    }
}
