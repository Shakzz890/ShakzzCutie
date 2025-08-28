// use an integer for version numbers
version = 2

android {
    buildFeatures {
        buildConfig = true
    }
}

cloudstream {
    language = "fil"
    // All of these properties are optional, you can safely remove them

    description = "Multi Language Movies and Series Provider (PH)"
    authors = listOf("Shakzz")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Movie",
        "TvSeries"
    )

    iconUrl = "https://github.com/Shakzz890/ShakzzCutie/raw/refs/heads/master/MovieBoxProvider/icon.png"
}
