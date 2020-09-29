package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: jxh reason: default package */
public final class jxh implements jxm {
    private final Context a;
    private final hwq b;
    private final Bitmap c;
    private final fqn d;
    private final String e;
    private final tvn f;
    private Token g;
    private Bitmap h;

    public jxh(Context context, hwq hwq, Bitmap bitmap, fqn fqn, String str, tvn tvn) {
        this.a = (Context) fbp.a(context);
        this.b = (hwq) fbp.a(hwq);
        this.c = bitmap;
        this.d = fqn;
        this.e = str;
        this.f = tvn;
    }

    private PendingIntent b() {
        hiu hiu = new hiu();
        Context context = this.a;
        return PendingIntent.getService(context, 0, hiu.a(context, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728);
    }

    public final Notification a() {
        jxo jxo = new jxo(this.f);
        hwq hwq = this.b;
        for (jxn jxn : jxo.a) {
            if (jxn.a(hwq)) {
                Bitmap bitmap = this.h;
                if (bitmap == null) {
                    bitmap = this.c;
                }
                hwu d2 = this.b.d();
                SpannableString spannableString = new SpannableString(d2.b);
                if (VERSION.SDK_INT > 23) {
                    spannableString.setSpan(new StyleSpan(1), 0, d2.b.length(), 33);
                }
                SpannableString a2 = jxn.a(this.b, this.a);
                SpannableString b2 = jxn.b(this.b, this.a);
                boolean isInterruptionFromAds = PlayerTrackUtil.isInterruptionFromAds(d2.a, d2.d);
                boolean booleanValue = Boolean.valueOf((String) d2.d.get("is_advertisement")).booleanValue();
                SpannableString spannableString2 = new SpannableString(this.a.getString(R.string.sas_interruption_title));
                if (isInterruptionFromAds) {
                    spannableString = spannableString2;
                } else if (booleanValue) {
                    spannableString = a2;
                }
                c cVar = new c(this.a, this.e);
                cVar.f = jxn.a(this.a);
                c a3 = cVar.a((int) R.drawable.icn_notification).a(bitmap).a((CharSequence) spannableString).b((CharSequence) b2).c(a2).a(b());
                a3.a(2, this.b.r() && !this.b.g());
                c a4 = a3.a(0);
                a4.r = fr.c(this.a, R.color.notification_bg_color);
                a4.s = 1;
                c a5 = a4.a(true);
                if (!d2.f.b()) {
                    d2.f = Optional.b(new hwt(d2));
                }
                a5.d(((hwt) d2.f.c()).a);
                ArrayList arrayList = new ArrayList(3);
                List a6 = jxn.a(this.b, this.a, this.d);
                for (int i = 0; i < a6.size(); i++) {
                    jxi jxi = (jxi) a6.get(i);
                    cVar.a(jxi.a.a, (CharSequence) this.a.getResources().getString(jxi.a.b), jxi.b);
                    if (jxi.c) {
                        if (arrayList.size() != 3) {
                            arrayList.add(Integer.valueOf(i));
                        } else {
                            throw new IllegalStateException("Can't have more than 3 compact actions!");
                        }
                    }
                }
                a aVar = new a();
                aVar.d = this.g;
                a a7 = aVar.a(true);
                a7.e = b();
                a7.c = fev.a((Collection<? extends Number>) arrayList);
                cVar.a((e) a7);
                return cVar.b();
            }
        }
        StringBuilder sb = new StringBuilder("Invalid notification state: ");
        sb.append(hwq);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(Token token) {
        this.g = token;
    }

    public final boolean a(Bitmap bitmap) {
        this.h = (Bitmap) fbp.a(bitmap);
        return true;
    }
}
