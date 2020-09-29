package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: uus reason: default package */
public final class uus implements uuf {
    private final uvb a;

    public uus(uvb uvb) {
        this.a = uvb;
    }

    public final String a() {
        return "Adjust";
    }

    public final void a(Intent intent) {
        vs.a(intent.getData());
    }

    public final void a(Uri uri, Uri uri2) {
    }
}
