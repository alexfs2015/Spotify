package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qel reason: default package */
public final class qel {
    private jog a;
    private fsp b;
    private a c;

    /* renamed from: qel$a */
    public interface a {
        void a();

        void a(boolean z);
    }

    private qel(jog jog, fsp fsp, a aVar) {
        this.a = jog;
        this.b = fsp;
        this.c = aVar;
    }

    public static qel a(Context context, a aVar) {
        jog jog = new jog();
        String string = context.getString(R.string.dialog_sound_effects_title);
        jog.d = string;
        if (jog.a != null) {
            jog.a.setText(string);
        }
        String string2 = context.getString(R.string.dialog_sound_effects_message);
        jog.e = string2;
        if (jog.b != null) {
            jog.b.setText(string2);
        }
        String string3 = context.getString(R.string.dialog_generic_dont_show_again);
        jog.f = string3;
        if (jog.b != null) {
            jog.c.setText(string3);
        }
        fsr a2 = new fsr(context, jog).a(context.getString(R.string.two_button_dialog_button_ok), new $$Lambda$qel$qB4HtdW5akajhLdBvZkYK9JKw(aVar, jog));
        a2.e = true;
        a2.f = new $$Lambda$qel$9LWzjBZXhTKoWkdCyqYTQs5ejro(aVar);
        fsp a3 = a2.a();
        a3.a();
        return new qel(jog, a3, aVar);
    }
}
