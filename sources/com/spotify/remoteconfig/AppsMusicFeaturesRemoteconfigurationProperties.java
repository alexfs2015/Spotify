package com.spotify.remoteconfig;

public abstract class AppsMusicFeaturesRemoteconfigurationProperties implements vum {

    public enum ButtonColor implements vuc {
        GREEN("green"),
        WHITE("white"),
        RED("red"),
        BLUE("blue");
        
        final String value;

        private ButtonColor(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public enum Message implements vuc {
        C_O_N_T_R_O_L("CONTROL"),
        T_R_E_A_T_M_E_N_T("TREATMENT");
        
        final String value;

        private Message(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(ButtonColor buttonColor);

        public abstract a a(Message message);

        public abstract a a(boolean z);

        public abstract AppsMusicFeaturesRemoteconfigurationProperties a();
    }

    public static AppsMusicFeaturesRemoteconfigurationProperties a(vuo vuo) {
        String str = "apps-music-features-remoteconfiguration";
        boolean a2 = vuo.a(str, "button_big", false);
        ButtonColor buttonColor = (ButtonColor) vuo.a(str, "button_color", ButtonColor.BLUE);
        return new defpackage.vtv.a().a(false).a(ButtonColor.BLUE).a(Message.C_O_N_T_R_O_L).a(a2).a(buttonColor).a((Message) vuo.a(str, "message", Message.C_O_N_T_R_O_L)).a();
    }

    public abstract boolean a();

    public abstract ButtonColor b();

    public abstract Message c();
}
