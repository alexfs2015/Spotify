package com.spotify.mobile.android.spotlets.share.logging;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ShareEventLogger {
    private static String d;
    public final String a;
    public final String b = UUID.randomUUID().toString();
    public boolean c;
    private final jjf e;
    private final String f;
    private final String g;
    private final PlayerState h;
    private boolean i;

    public enum Destination {
        OVERFLOW_SHARE("overflow-share"),
        COPY_LINK("copy-link"),
        SELECT_RECIPIENT("select-recipient"),
        EMAIL("email"),
        SMS("sms"),
        FACEBOOK_POPUP("facebook-popup"),
        NONE(null);
        
        final String mId;

        private Destination(String str) {
            this.mId = str;
        }
    }

    public enum Interaction {
        HIT("hit"),
        EVENT("event"),
        NONE(null);
        
        final String mTypeValue;

        private Interaction(String str) {
            this.mTypeValue = str;
        }
    }

    public enum Result {
        SUCCESS("success"),
        CANCEL("cancel"),
        FAILURE("failure"),
        NO_RESULT(null);
        
        final String mValue;

        private Result(String str) {
            this.mValue = str;
        }
    }

    public enum UserIntent {
        START_SHARE_SESSION("session-start"),
        END_SHARE_SESSION("cancel"),
        NAVIGATE_FORWARD("navigate-forward"),
        DEEPLINK("deeplink"),
        OPEN_COMPOSER("open-composer"),
        COPY_LINK("copy-link"),
        OPEN_MENU("open-menu");
        
        final String mValue;

        private UserIntent(String str) {
            this.mValue = str;
        }
    }

    public ShareEventLogger(String str, String str2, String str3, PlayerState playerState, jjf jjf) {
        this.a = (String) fay.a(str);
        this.f = (String) fay.a(str2);
        this.g = str3;
        this.h = playerState;
        this.e = jjf;
    }

    private void b() {
        a();
        this.i = true;
    }

    public final void a() {
        a((String) null, Destination.NONE, -1, Interaction.NONE, UserIntent.END_SHARE_SESSION, Result.NO_RESULT, false, false);
    }

    public final void a(String str, long j) {
        a(str, Destination.OVERFLOW_SHARE, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    public final void b(String str, long j) {
        a(str, Destination.COPY_LINK, j, Interaction.HIT, UserIntent.COPY_LINK, Result.NO_RESULT, false, false);
    }

    public final void c(String str, long j) {
        a(str, Destination.SMS, j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, false, false);
    }

    public final void d(String str, long j) {
        a(str, Destination.SMS, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    public final void a(String str, String str2, long j) {
        fay.a(str2);
        a(str, str2, j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, false, false);
    }

    private String c() {
        PlayerState playerState = this.h;
        if (playerState == null || !playerState.isPlaying()) {
            return null;
        }
        return this.h.entityUri();
    }

    private void a(String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, boolean z, boolean z2) {
        fay.a(interaction);
        fay.a(userIntent);
        fay.a(result);
        String c2 = c();
        a(this.i, this.b, str2, j, interaction, userIntent, result, this.f, this.g, this.a, z, Collections.emptyList(), str, c2, this.e);
        if (z2) {
            b();
        }
    }

    public static void a(boolean z, String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, String str3, String str4, String str5, boolean z2, List<String> list, String str6, String str7, jjf jjf) {
        Interaction interaction2 = interaction;
        UserIntent userIntent2 = userIntent;
        Result result2 = result;
        fay.a(str);
        fay.a(interaction);
        fay.a(userIntent);
        fay.a(result);
        fay.a(str3);
        fay.a(str5);
        fay.a(list);
        if (!z) {
            az azVar = r3;
            az azVar2 = new az(str, userIntent2.mValue, interaction2.mTypeValue, result2.mValue, str3, str4, z2, str5, str2, j, list, str6, "link-share", str7);
            jjf.a(azVar);
            Logger.a("Log Share Event: \n sessionId: %s\n userIntent: %s\n interaction: %s\n result: %s\n entityUri: %s\n contextUri: %s\n textChanged: %s\n sourcePageId: %s\n destination: %s\n destinationIndex: %d\n testGroups: %s\n shareId: %s", str, userIntent2.mValue, interaction2.mTypeValue, result.mValue, str3, str4, Boolean.valueOf(z2), str5, str2, Long.valueOf(j), list, str6);
            return;
        }
        throw new IllegalStateException("This ShareEventLogger session has already ended.");
    }

    public void a(String str, Destination destination, long j, Interaction interaction, UserIntent userIntent, Result result, boolean z, boolean z2) {
        a(str, destination.mId, j, interaction, userIntent, result, false, false);
    }
}
