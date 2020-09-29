package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.R;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: umi reason: default package */
public final class umi {
    public static Drawable a(Context context) {
        Context context2 = context;
        uvv uvv = new uvv(context2, SpotifyIconV2.MIC, (float) uts.b((float) 48, context.getResources()), (float) uts.b((float) 96, context.getResources()), fr.c(context, R.color.white), fr.c(context, R.color.voice_floating_mic_icon));
        return uvv;
    }

    public static Bundle a(a aVar, boolean z, String str, Intent intent, PlayerContext playerContext, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("voice_nlu_result", aVar);
        if (intent != null) {
            bundle.putSerializable("voice_nlu_intent", intent);
        }
        if (str != null) {
            bundle.putString("error_text", str);
        }
        if (playerContext != null) {
            bundle.putParcelable("voice_qbd_result", playerContext);
        }
        if (str2 != null) {
            bundle.putString("voice_nlu_reply", str2);
        }
        bundle.putBoolean("voice_player_was_playing", z);
        return bundle;
    }
}
