package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;

/* renamed from: pja reason: default package */
public final class pja {
    public static void a(Context context, OnClickListener onClickListener) {
        fts.a(context, context.getString(R.string.dialog_title_remove_download), context.getString(R.string.dialog_description_remove_download)).b(context.getString(R.string.dialog_btn_negative_remove_download), $$Lambda$pja$V6Z3aN3Ggx7a2R7pIuynLZbbja4.INSTANCE).a(context.getString(R.string.dialog_btn_positive_remove_download), onClickListener).a().a();
    }
}
