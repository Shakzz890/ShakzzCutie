// use an integer for version numbers
version = 6


cloudstream {
    // All of these properties are optional, you can safely remove them
    language = "fil"
    description = "Shakzz TV"
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
        "Live",
    )

    iconUrl = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2025/05/solo-leveling-jin-woo.jpg"

    isCrossPlatform = true
}
