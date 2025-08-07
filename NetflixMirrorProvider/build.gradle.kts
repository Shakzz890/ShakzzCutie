// use an integer for version numbers
version = 29

cloudstream {
    //language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Netflix, PrimeVideo, JioHotstar(Hotstar, Disney, Paramount, HBO, Peacock) Content in Multiple Languages"
    authors = listOf("megix")

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
        "TvSeries",
        "AsianDrama",
        "Anime"
    )

    iconUrl = "https://platform.theverge.com/wp-content/uploads/sites/2/chorus/uploads/chorus_asset/file/15844974/netflixlogo.0.0.1466448626.png?quality=90&strip=all&crop=1.2535702951444%2C0%2C97.492859409711%2C100&w=2400"
}
