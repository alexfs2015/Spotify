package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: rgv reason: default package */
public final class rgv extends ClickableSpan {
    private final String a;
    private final spi b;
    private final rfk c;

    public rgv(String str, spi spi, rfk rfk) {
        this.a = (String) fay.a(str);
        this.b = (spi) fay.a(spi);
        this.c = (rfk) fay.a(rfk);
    }

    public final void onClick(View view) {
        rfk rfk = this.c;
        String str = this.a;
        rfk.a("navigate-forward", null, str, str, -1, jst.a(str).b == LinkType.ARTIST ? "open_artist_from_track" : "open_album_from_track");
        this.b.a(this.a);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
    }
}
