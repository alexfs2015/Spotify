package defpackage;

import com.spotify.music.feedback.FeedbackContextType;

/* renamed from: rjk reason: default package */
public final class rjk {
    private final rjm a;

    public rjk(rjm rjm) {
        this.a = rjm;
    }

    public final FeedbackContextType a(String str, String str2) {
        return (ute.f(str) || ute.e(str)) ? ute.i(str) ? FeedbackContextType.DAILY_MIX : FeedbackContextType.RADIO : this.a.a(str2) ? FeedbackContextType.COLLECTION : FeedbackContextType.OTHER;
    }
}
