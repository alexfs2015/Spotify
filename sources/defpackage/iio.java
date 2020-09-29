package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Challenge;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChallengeDetails;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: iio reason: default package */
public final class iio implements ktb {
    private final ihy a;
    private final ObjectMapper b = ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();

    public final void a(kue kue) {
    }

    public iio(ihy ihy) {
        this.a = ihy;
    }

    public final Completable b(kue kue) {
        return Completable.a((CompletableOnSubscribe) new $$Lambda$iio$ru7PN2FIcRuTt1JjcTYFodXOOTE(this, kue));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kue kue, final CompletableEmitter completableEmitter) {
        AnonymousClass1 r0 = new a() {
            public final void a(String str, String str2) {
                completableEmitter.a((Throwable) new RuntimeException(String.format("%s [%s]", new Object[]{str, str2})));
            }
        };
        ChallengeDetails challengeDetails = new ChallengeDetails();
        Challenge challenge = new Challenge();
        challenge.nonce = "dummy_nonce";
        ggw.a(gbd.class);
        challenge.timestamp = jrr.a(gbd.a().f());
        challenge.authid = kue.a();
        challenge.authmethod = (String) kue.c().get(0);
        try {
            challengeDetails.challenge = this.b.writeValueAsString(challenge);
            this.a.a((String) kue.c().get(0), challengeDetails);
        } catch (JsonProcessingException unused) {
            r0.a("Could not create challenge", "com.spotify.error.client_authentication_failed");
        }
    }
}
