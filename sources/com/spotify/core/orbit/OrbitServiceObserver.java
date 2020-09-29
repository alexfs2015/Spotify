package com.spotify.core.orbit;

public abstract class OrbitServiceObserver {
    public void onForgetCredentials() {
    }

    public abstract void onIncognitoModeDisabledByTimer();

    public abstract void onLoginError(int i);

    public abstract void onMainSchedulerIdle(int i);

    public abstract void onOfflineSyncError(int i);

    public abstract void onOrbitStarted();

    public abstract void onOrbitStartupFailed(int i);

    public abstract void onOrbitStopped();

    public abstract void onPlaybackError(int i, String str);
}
