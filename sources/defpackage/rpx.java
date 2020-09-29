package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: rpx reason: default package */
public final class rpx extends ClickableSpan {
    private final String a;
    private final szp b;
    private final rom c;

    public rpx(String str, szp szp, rom rom) {
        this.a = (String) fbp.a(str);
        this.b = (szp) fbp.a(szp);
        this.c = (rom) fbp.a(rom);
    }

    public final void onClick(View view) {
        rom rom = this.c;
        String str = this.a;
        rom.a("navigate-forward", null, str, str, -1, jva.a(str).b == LinkType.ARTIST ? "open_artist_from_track" : "open_album_from_track");
        this.b.a(this.a);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
    }
}
