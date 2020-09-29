package com.spotify.music.feedback.service;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class FeedbackService extends vto {
    public rbg a;
    private final SerialDisposable b = new SerialDisposable();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public FeedbackService() {
        super("FeedbackService");
    }

    public static Intent a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, FeedbackService.class);
        intent.setAction("com.spotify.music.feedback.service.LIKE_ENTITY");
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.entity_uri", str);
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.context_uri", str2);
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.feature_identifier", str3);
        return intent;
    }

    public static Intent b(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, FeedbackService.class);
        intent.setAction("com.spotify.music.feedback.service.DISLIKE_ENTITY");
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.entity_uri", str);
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.context_uri", str2);
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.feature_identifier", str3);
        return intent;
    }

    public static Intent c(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, FeedbackService.class);
        intent.setAction("com.spotify.music.feedback.service.REMOVE_FEEEDBACK");
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.entity_uri", str);
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.context_uri", str2);
        intent.putExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.feature_identifier", str3);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.entity_uri");
            String stringExtra2 = intent.getStringExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.context_uri");
            String stringExtra3 = intent.getStringExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.feature_identifier");
            if (action != null) {
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != 494597013) {
                    if (hashCode != 685353299) {
                        if (hashCode == 1591694377 && action.equals("com.spotify.music.feedback.service.REMOVE_FEEEDBACK")) {
                            c = 2;
                        }
                    } else if (action.equals("com.spotify.music.feedback.service.LIKE_ENTITY")) {
                        c = 0;
                    }
                } else if (action.equals("com.spotify.music.feedback.service.DISLIKE_ENTITY")) {
                    c = 1;
                }
                if (c == 0) {
                    SerialDisposable serialDisposable = this.b;
                    rbg rbg = this.a;
                    serialDisposable.a(rbg.a.a(stringExtra, stringExtra2, stringExtra, ViewUris.V.toString(), stringExtra3).a((Action) $$Lambda$FeedbackService$B_SvXblcLUtb9nbqv4asZ8K2n4.INSTANCE, (Consumer<? super Throwable>) $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ.INSTANCE));
                } else if (c == 1) {
                    this.b.a(this.a.a.b(stringExtra, stringExtra2, stringExtra, stringExtra3, "local").a((Action) $$Lambda$FeedbackService$cItVTyH0ohPxSfkaUcG5rL1vZR8.INSTANCE, (Consumer<? super Throwable>) $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ.INSTANCE));
                } else if (c != 2) {
                    StringBuilder sb = new StringBuilder("FeedbackService can't resolve the action : ");
                    sb.append(action);
                    Assertion.b(sb.toString());
                } else {
                    this.b.a(this.a.a(stringExtra, stringExtra2, stringExtra, stringExtra3).a((Action) $$Lambda$FeedbackService$xGlTe66Xj3i_GfHT4px7jT9VODI.INSTANCE, (Consumer<? super Throwable>) $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ.INSTANCE));
                }
            }
        }
    }

    public void onDestroy() {
        this.b.bf_();
        super.onDestroy();
    }
}
