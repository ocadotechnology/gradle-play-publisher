package de.triplet.gradle.play

import com.android.annotations.NonNull

class PlayAccountConfig {

    @NonNull
    private final String mName

    String serviceAccountEmail

    File pk12File

    String storePassword

    String keyAlias

    String keyPassword

    File jsonFile

    PlayAccountConfig(@NonNull String name) {
        mName = name
    }

    @NonNull
    public String getName() {
        return mName
    }
}
