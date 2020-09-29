package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: msj reason: default package */
public final class msj {
    final rma a;
    final sso b;
    private final a c;
    private final Context d;
    private final ToastieManager e;
    private final ftm f;
    private ftj g;

    /* renamed from: msj$a */
    public interface a {
        void a();

        void a(vle vle, int i);

        void b();

        void c();

        void d();
    }

    public msj(Context context, sso sso, rma rma, ToastieManager toastieManager, ftm ftm, a aVar) {
        this.d = context;
        this.a = rma;
        this.b = sso;
        this.e = toastieManager;
        this.f = ftm;
        this.c = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        ftj ftj = this.g;
        if (ftj != null) {
            ftj.c();
        }
        if (i != 0) {
            this.c.d();
        } else {
            this.c.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vle vle, int i, View view) {
        this.c.a(vle, i);
        this.e.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.c.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.c.a();
    }

    public final void a() {
        ftl b2 = this.f.a(this.d.getString(R.string.edit_playlist_discard_dialog_title), this.d.getString(R.string.edit_playlist_discard_dialog_body)).a(this.d.getString(R.string.edit_playlist_discard_dialog_button_cancel), new $$Lambda$msj$VDff_A8YaXEIi4AY0cFkldTJpk8(this)).b(this.d.getString(R.string.edit_playlist_discard_dialog_button_discard), new $$Lambda$msj$_IDZXkFDwhlWbBiCRzzc80A8jt8(this));
        b2.f = new $$Lambda$msj$U1wGIW4xNlyPeiJ9To2LNN7SyhQ(this);
        b2.g = new $$Lambda$msj$qsKywotwAcuA62hE7TmoHnBFw(this);
        b2.h = new ftq() {
            public final void a() {
                msj.this.a.a(PageIdentifiers.PLAYLIST_EDIT_DISCARD.mPageIdentifier, msj.this.b.toString());
            }

            public final void b() {
                msj.this.a.Z_();
            }
        };
        b2.a().a();
    }

    public final void a(vle vle, int i) {
        this.e.a(uzy.a(this.d.getString(R.string.edit_playlist_item_removed_toast_title), 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.d.getString(R.string.edit_playlist_item_removed_toast_button)).a((OnClickListener) new $$Lambda$msj$MrULK3t4LI7Q1GP97B_0RXJ145U(this, vle, i)).a());
    }

    public final void b() {
        ftm ftm = this.f;
        String string = this.d.getString(R.string.edit_playlist_change_image_dialog_title);
        $$Lambda$msj$VNu9BdDdCeeMMESVTDM786fwHY r2 = new $$Lambda$msj$VNu9BdDdCeeMMESVTDM786fwHY(this);
        CharSequence[] textArray = ftm.a.getResources().getTextArray(R.array.edit_playlist_change_image_dialog_options);
        Context context = ftm.a;
        ftv ftv = new ftv(textArray, r2);
        String str = (String) fbp.a(string);
        ftv.b = str;
        if (ftv.a != null) {
            ftv.a.setText(str);
        }
        this.g = new ftl(context, ftv).a();
        this.g.a();
    }
}
