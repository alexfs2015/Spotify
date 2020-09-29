package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;

/* renamed from: fpt reason: default package */
final class fpt {
    final fpy a;
    private final Activity b;
    private final fpu c;

    public fpt(Activity activity, fpy fpy, fpu fpu) {
        this.b = activity;
        this.a = fpy;
        this.c = fpu;
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

    /* access modifiers changed from: 0000 */
    public void a() {
        Activity activity = this.b;
        fts.a(activity, activity.getString(R.string.background_restriction_dialog_title), this.b.getString(R.string.background_restriction_dialog_body)).b(this.b.getString(R.string.background_restriction_button_not_now), new $$Lambda$fpt$TgOwukqO9paqLqufVuTdZRvx_JY(this)).a(this.b.getString(R.string.background_restriction_button_go_to_settings), new $$Lambda$fpt$MXvUPxORTcWOYkodXC7Tq4cwykQ(this)).a().a();
        this.c.d();
        this.c.b();
    }
}
