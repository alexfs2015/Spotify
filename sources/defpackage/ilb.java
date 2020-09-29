package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Challenge;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChallengeDetails;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: ilb reason: default package */
public final class ilb implements kwk {
    private final ikl a;
    private final jtz b;
    private final ObjectMapper c = ((rwl) gih.a(rwl.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();

    public ilb(ikl ikl, jtz jtz) {
        this.a = ikl;
        this.b = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kxn kxn, final CompletableEmitter completableEmitter) {
        AnonymousClass1 r0 = new a() {
            public final void a(String str, String str2) {
                completableEmitter.a((Throwable) new RuntimeException(String.format("%s [%s]", new Object[]{str, str2})));
            }
        };
        ChallengeDetails challengeDetails = new ChallengeDetails();
        Challenge challenge = new Challenge();
        challenge.nonce = "dummy_nonce";
        challenge.timestamp = jub.a(this.b.f());
        challenge.authid = kxn.a();
        challenge.authmethod = (String) kxn.c().get(0);
        try {
            challengeDetails.challenge = this.c.writeValueAsString(challenge);
            this.a.a((String) kxn.c().get(0), challengeDetails);
        } catch (JsonProcessingException unused) {
            r0.a("Could not create challenge", "com.spotify.error.client_authentication_failed");
        }
    }

    public final void a(kxn kxn) {
    }

    public final Completable b(kxn kxn) {
        return Completable.a((CompletableOnSubscribe) new $$Lambda$ilb$vjtLWLlivaz5_JSi5aAHKbbwBA(this, kxn));
    }
}
