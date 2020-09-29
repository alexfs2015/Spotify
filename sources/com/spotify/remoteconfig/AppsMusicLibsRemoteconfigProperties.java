package com.spotify.remoteconfig;

public abstract class AppsMusicLibsRemoteconfigProperties implements vhh {

    public enum SettingsDebugLabel implements vgx {
        DEBUG_TOOLING("debug-tooling"),
        DEBUG_TOOLS("debug-tools"),
        QA_TOOLS("qa-tools");
        
        final String value;

        private SettingsDebugLabel(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public enum SimpleMessageTest implements vgx {
        C_O_N_T_R_O_L("CONTROL"),
        T_R_E_A_T_M_E_N_T("TREATMENT"),
        DEFAULT("Default");
        
        final String value;

        private SimpleMessageTest(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(SettingsDebugLabel settingsDebugLabel);

        public abstract a a(SimpleMessageTest simpleMessageTest);

        public abstract AppsMusicLibsRemoteconfigProperties a();
    }

    public abstract SettingsDebugLabel a();

    public abstract SimpleMessageTest b();

    public static AppsMusicLibsRemoteconfigProperties a(vhj vhj) {
        String str = "apps-music-libs-remoteconfig";
        SettingsDebugLabel settingsDebugLabel = (SettingsDebugLabel) vhj.a(str, "settings_debug_label", SettingsDebugLabel.DEBUG_TOOLS);
        return new defpackage.vgr.a().a(SettingsDebugLabel.DEBUG_TOOLS).a(SimpleMessageTest.DEFAULT).a(settingsDebugLabel).a((SimpleMessageTest) vhj.a(str, "simple_message_test", SimpleMessageTest.DEFAULT)).a();
    }
}
