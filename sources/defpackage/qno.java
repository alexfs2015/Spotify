package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qno reason: default package */
public final class qno {
    private jqs a;
    private ftj b;
    private a c;

    /* renamed from: qno$a */
    public interface a {
        void a();

        void a(boolean z);
    }

    private qno(jqs jqs, ftj ftj, a aVar) {
        this.a = jqs;
        this.b = ftj;
        this.c = aVar;
    }

    public static qno a(Context context, a aVar) {
        jqs jqs = new jqs();
        String string = context.getString(R.string.dialog_sound_effects_title);
        jqs.d = string;
        if (jqs.a != null) {
            jqs.a.setText(string);
        }
        String string2 = context.getString(R.string.dialog_sound_effects_message);
        jqs.e = string2;
        if (jqs.b != null) {
            jqs.b.setText(string2);
        }
        String string3 = context.getString(R.string.dialog_generic_dont_show_again);
        jqs.f = string3;
        if (jqs.b != null) {
            jqs.c.setText(string3);
        }
        ftl a2 = new ftl(context, jqs).a(context.getString(R.string.two_button_dialog_button_ok), new $$Lambda$qno$Spfxhdvp46wf8Wz58FCWQTbqro4(aVar, jqs));
        a2.e = true;
        a2.f = new $$Lambda$qno$pbCk_ExUffWGzSQjIDiD0DMmaEs(aVar);
        ftj a3 = a2.a();
        a3.a();
        return new qno(jqs, a3, aVar);
    }
}
