version = 2

cloudstream {
    authors     = listOf("Shakzz")
    language    = "fil"
    description = "Contains Bluray7"

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
    **/
    status  = 1 // will be 3 if unspecified
    tvTypes = listOf("Movie","TvSeries")
    iconUrl = "https://upload.wikimedia.org/wikipedia/en/archive/d/d8/20190827000331%21K_Movies_Pinoy_logo.png"
    isCrossPlatform = true
}
