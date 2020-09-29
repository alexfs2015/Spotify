package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;

/* renamed from: foz reason: default package */
final class foz {
    final fpe a;
    private final Activity b;
    private final fpa c;

    public foz(Activity activity, fpe fpe, fpa fpa) {
        this.b = activity;
        this.a = fpe;
        this.c = fpa;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Activity activity = this.b;
        fsy.a(activity, activity.getString(R.string.background_restriction_dialog_title), this.b.getString(R.string.background_restriction_dialog_body)).b(this.b.getString(R.string.background_restriction_button_not_now), new $$Lambda$foz$UdQ6F0zjzqWh8Daij9jp15rnC9A(this)).a(this.b.getString(R.string.background_restriction_button_go_to_settings), new $$Lambda$foz$Eadrc4M89DV9yBQLfiJndvsJqw(this)).a().a();
        this.c.d();
        this.c.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.c.a();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.b.getPackageName(), null));
        this.b.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.c.c();
    }
}
