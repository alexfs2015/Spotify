package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import com.spotify.music.R;
import com.spotify.music.features.addtoplaylist.AddToPlaylistActivity;
import com.spotify.music.features.queue.service.QueueService;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;
import java.util.Collections;

/* renamed from: iju reason: default package */
public final class iju implements lso {
    private final Context a;
    private final izh b;

    public iju(Context context, izh izh) {
        this.a = (Context) fbp.a(context);
        this.b = (izh) fbp.a(izh);
    }

    public final void a(String str) {
        QueueService.a(this.a, str);
    }

    public final void a(String str, String str2, String str3) {
        Context context = this.a;
        context.startActivity(AddToPlaylistActivity.a(context, Collections.singletonList(str), str2, str3));
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.b.a(str, !TextUtils.isEmpty(str4) ? Uri.parse(str4) : Uri.EMPTY, (String) null, str2, this.a.getString(R.string.share_subtitle, new Object[]{str3}), (String) null, jqg.a);
    }

    public final void a(String str, String str2, String str3, sso sso) {
        ShortcutInstallerService.a(this.a, str, str2, str3, sso);
    }

    public final void b(String str) {
        Context context = this.a;
        context.startService(RadioFormatListService.a(context, str));
    }
}
