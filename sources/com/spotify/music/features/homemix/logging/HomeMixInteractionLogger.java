package com.spotify.music.features.homemix.logging;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import java.util.List;
import java.util.Map;

public final class HomeMixInteractionLogger {
    public final String a;
    private final gjf b;
    private final sih c;
    private final jjf d;

    public enum Section {
        CHILL_BUTTON("chill-button"),
        UPBEAT_BUTTON("upbeat-button"),
        WELCOME("welcome"),
        TASTE_VIZ("tasteviz"),
        TASTE_ONBOARDING_CTA("taste-onboarding-cta"),
        PLAY_BUTTON("play-button"),
        ITEM_LIST("item-list"),
        USER_TOGGLE("user-toggle");
        
        final String mKey;

        private Section(String str) {
            this.mKey = str;
        }
    }

    public HomeMixInteractionLogger(String str, sih sih, jjf jjf, gjf gjf) {
        this.a = str;
        this.d = jjf;
        this.c = sih;
        this.b = gjf;
    }

    public final void a(HomeMix homeMix) {
        a(Section.PLAY_BUTTON, this.a, "play", homeMix);
    }

    public final void a(int i, boolean z, HomeMix homeMix) {
        a(Section.USER_TOGGLE, i, this.a, z ? "row-tap" : "switch-tap", homeMix);
    }

    public void a(Section section, String str, String str2, HomeMix homeMix) {
        a(section, 0, str, str2, homeMix);
    }

    public void a(Section section, int i, String str, String str2, HomeMix homeMix) {
        a(section, i, str, str2, homeMix.isGlobalExplicitFilterOn(), homeMix.includeExplicit(), homeMix.isUserEnabled(), homeMix.isFamilyMember(), homeMix.style(), homeMix.setType(), homeMix.excludedUserIds(), homeMix.getExcludedGenres(), homeMix.getTestData());
    }

    private void a(Section section, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Style style, String str3, List<String> list, List<String> list2, Map<String, String> map) {
        Section section2 = section;
        Style style2 = style;
        String str4 = str;
        String str5 = str2;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        String str6 = str3;
        List<String> list3 = list;
        List<String> list4 = list2;
        Map<String, String> map2 = map;
        jjf jjf = this.d;
        String a2 = this.b.a();
        String sih = this.c.toString();
        String str7 = section2.mKey;
        long j = (long) i;
        String interactionType = InteractionType.HIT.toString();
        double a3 = (double) jrf.a.a();
        ba baVar = r3;
        String str8 = style2.mValue;
        ba baVar2 = baVar;
        jjf jjf2 = jjf;
        ba baVar3 = new ba("", a2, sih, str7, j, str4, interactionType, str5, a3, null, "home-mix", z5, z6, z7, z8, str8, str6, list3, list4, map2);
        jjf2.a(baVar2);
        Logger.a("Log Home Mix Event:\n requestId: %s\n featureId: %s\n pageUri: %s\n sectionId: %s\n itemIndex: %s\n targetUri: %s\n interactionType: %s\n userIntent: %s\n timestamp: %s\n action: %s\n mixType: %s\n globalExplicitOn: %s\n userExplicitOn: %s\n userInMix: %s\n isFamilyMember: %s\n mixTrackFilter: %s\n algorithmId: %s\n excludedUserIds: %s\n excludedGenres: %s\n testData: %s", "", this.b.a(), this.c.toString(), section2.mKey, Integer.valueOf(i), this.a, InteractionType.HIT.toString(), str2, Long.valueOf(jrf.a.a()), null, "home-mix", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), style.mValue, str3, list, list2, map);
    }
}
