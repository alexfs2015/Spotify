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
    private final jlr e;
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

    public ShareEventLogger(String str, String str2, String str3, PlayerState playerState, jlr jlr) {
        this.a = (String) fbp.a(str);
        this.f = (String) fbp.a(str2);
        this.g = str3;
        this.h = playerState;
        this.e = jlr;
    }

    private void a(String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, boolean z, boolean z2) {
        fbp.a(interaction);
        fbp.a(userIntent);
        fbp.a(result);
        String c2 = c();
        boolean z3 = this.i;
        String str3 = this.b;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.a;
        List emptyList = Collections.emptyList();
        jlr jlr = this.e;
        UserIntent userIntent2 = userIntent;
        jlr jlr2 = jlr;
        jlr jlr3 = jlr;
        String str7 = str;
        a(z3, str3, str2, j, interaction, userIntent, result, str4, str5, str6, z, emptyList, str, c2, jlr3);
        if (z2) {
            b();
        }
    }

    public static void a(boolean z, String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, String str3, String str4, String str5, boolean z2, List<String> list, String str6, String str7, jlr jlr) {
        Interaction interaction2 = interaction;
        UserIntent userIntent2 = userIntent;
        Result result2 = result;
        Result result3 = result;
        fbp.a(str);
        fbp.a(interaction);
        fbp.a(userIntent);
        fbp.a(result);
        fbp.a(str3);
        fbp.a(str5);
        fbp.a(list);
        if (!z) {
            String str8 = str;
            String str9 = str3;
            String str10 = str4;
            boolean z3 = z2;
            String str11 = str5;
            String str12 = str2;
            ay ayVar = r3;
            String str13 = str6;
            ay ayVar2 = new ay(str, userIntent2.mValue, interaction2.mTypeValue, result3.mValue, str3, str4, z2, str5, str2, j, list, str6, "link-share", str7);
            jlr.a(ayVar);
            Result result4 = result;
            Logger.a("Log Share Event: \n sessionId: %s\n userIntent: %s\n interaction: %s\n result: %s\n entityUri: %s\n contextUri: %s\n textChanged: %s\n sourcePageId: %s\n destination: %s\n destinationIndex: %d\n testGroups: %s\n shareId: %s", str, userIntent2.mValue, interaction2.mTypeValue, result.mValue, str3, str4, Boolean.valueOf(z2), str5, str2, Long.valueOf(j), list, str6);
            return;
        }
        throw new IllegalStateException("This ShareEventLogger session has already ended.");
    }

    private void b() {
        a();
        this.i = true;
    }

    private String c() {
        PlayerState playerState = this.h;
        if (playerState == null || !playerState.isPlaying()) {
            return null;
        }
        return this.h.entityUri();
    }

    public final void a() {
        a((String) null, Destination.NONE, -1, Interaction.NONE, UserIntent.END_SHARE_SESSION, Result.NO_RESULT, false, false);
    }

    public final void a(String str, long j) {
        String str2 = str;
        a(str, Destination.OVERFLOW_SHARE, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    public void a(String str, Destination destination, long j, Interaction interaction, UserIntent userIntent, Result result, boolean z, boolean z2) {
        Destination destination2 = destination;
        Interaction interaction2 = interaction;
        UserIntent userIntent2 = userIntent;
        Result result2 = result;
        a(str, destination.mId, j, interaction, userIntent, result, false, false);
    }

    public final void a(String str, String str2, long j) {
        fbp.a(str2);
        String str3 = str;
        String str4 = str2;
        a(str, str2, j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, false, false);
    }

    public final void b(String str, long j) {
        String str2 = str;
        a(str, Destination.COPY_LINK, j, Interaction.HIT, UserIntent.COPY_LINK, Result.NO_RESULT, false, false);
    }

    public final void c(String str, long j) {
        String str2 = str;
        a(str, Destination.SMS, j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, false, false);
    }

    public final void d(String str, long j) {
        String str2 = str;
        a(str, Destination.SMS, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }
}
