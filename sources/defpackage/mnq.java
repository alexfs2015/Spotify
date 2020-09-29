package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: mnq reason: default package */
public final class mnq {
    final rdc a;
    final sih b;
    private final a c;
    private final Context d;
    private final ToastieManager e;
    private final fss f;
    private fsp g;

    /* renamed from: mnq$a */
    public interface a {
        void a();

        void a(uzb uzb, int i);

        void b();

        void c();

        void d();
    }

    public mnq(Context context, sih sih, rdc rdc, ToastieManager toastieManager, fss fss, a aVar) {
        this.d = context;
        this.a = rdc;
        this.b = sih;
        this.e = toastieManager;
        this.f = fss;
        this.c = aVar;
    }

    public final void a(uzb uzb, int i) {
        this.e.a(uos.a(this.d.getString(R.string.edit_playlist_item_removed_toast_title), 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.d.getString(R.string.edit_playlist_item_removed_toast_button)).a((OnClickListener) new $$Lambda$mnq$WTL_pbKxP9ImmWuZqX8l93eKDLw(this, uzb, i)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uzb uzb, int i, View view) {
        this.c.a(uzb, i);
        this.e.a();
    }

    public final void a() {
        fsr b2 = this.f.a(this.d.getString(R.string.edit_playlist_discard_dialog_title), this.d.getString(R.string.edit_playlist_discard_dialog_body)).a(this.d.getString(R.string.edit_playlist_discard_dialog_button_cancel), new $$Lambda$mnq$x5hNIkGrXs9BEAMPyn_3zK0EAo(this)).b(this.d.getString(R.string.edit_playlist_discard_dialog_button_discard), new $$Lambda$mnq$kpob67sG7dmA7y6A1JCBasxf7RA(this));
        b2.f = new $$Lambda$mnq$t_7BpQ0w9LL88m18AMwSDCSBK4(this);
        b2.g = new $$Lambda$mnq$WvS8D9SgYCUdpqsqV8SmKYOtdEU(this);
        b2.h = new fsw() {
            public final void a() {
                mnq.this.a.a(PageIdentifiers.PLAYLIST_EDIT_DISCARD.mPageIdentifier, mnq.this.b.toString());
            }

            public final void b() {
                mnq.this.a.Z_();
            }
        };
        b2.a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.c.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.c.a();
    }

    public final void b() {
        fss fss = this.f;
        String string = this.d.getString(R.string.edit_playlist_change_image_dialog_title);
        $$Lambda$mnq$as_wUwMItrI2BfrDLbAs7Hf3iY r2 = new $$Lambda$mnq$as_wUwMItrI2BfrDLbAs7Hf3iY(this);
        CharSequence[] textArray = fss.a.getResources().getTextArray(R.array.edit_playlist_change_image_dialog_options);
        Context context = fss.a;
        ftb ftb = new ftb(textArray, r2);
        String str = (String) fay.a(string);
        ftb.b = str;
        if (ftb.a != null) {
            ftb.a.setText(str);
        }
        this.g = new fsr(context, ftb).a();
        this.g.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        fsp fsp = this.g;
        if (fsp != null) {
            fsp.c();
        }
        if (i != 0) {
            this.c.d();
        } else {
            this.c.c();
        }
    }
}
