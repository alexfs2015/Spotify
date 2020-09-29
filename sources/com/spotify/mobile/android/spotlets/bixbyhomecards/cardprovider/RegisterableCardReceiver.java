package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import android.content.IntentFilter;

public abstract class RegisterableCardReceiver extends fpa {
    public Context a;
    public IntentFilter b = new IntentFilter();
    public boolean c;

    enum CardContentProviderActions {
        UPDATE("com.samsung.android.app.spage.action.CARD_UPDATE"),
        INSTANT_UPDATE("com.samsung.android.app.spage.action.CARD_INSTANT_UPDATE"),
        EVENT("com.samsung.android.app.spage.action.CARD_EVENT"),
        ENABLED("com.samsung.android.app.spage.action.CARD_ENABLED"),
        DISABLED("com.samsung.android.app.spage.action.CARD_DISABLED");
        
        final String mValue;

        private CardContentProviderActions(String str) {
            this.mValue = str;
        }
    }

    public RegisterableCardReceiver(Context context) {
        this.a = context;
        this.b.addAction(CardContentProviderActions.UPDATE.mValue);
        this.b.addAction(CardContentProviderActions.INSTANT_UPDATE.mValue);
        this.b.addAction(CardContentProviderActions.EVENT.mValue);
        this.b.addAction(CardContentProviderActions.ENABLED.mValue);
        this.b.addAction(CardContentProviderActions.DISABLED.mValue);
    }
}
